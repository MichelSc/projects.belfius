/*********************************************
 * OPL 12.6.1.0 Model
 * Author: MiSc
 * Creation Date: Jan 27, 2015 at 12:02:26 PM
 *********************************************/

 using CP;
 
 // time
 int beginOfHorizon = 0;
 int endOfHorizon = 100;
 
 // locations 
{int} Locations = ...;
tuple triplet {int fromLocation; int toLocation; int distance;};
{triplet} distanceLocationLocation = ...;

// inspections
{string} Inspections = ...;
int inspectionDuration[Inspections] = ...;
int inspectionLocation[Inspections] = ...;
tuple TimeSlot {int fromTime; int toTime;};
{TimeSlot} inspectionTimeSlots[Inspections] = ...;

// inspectors
{string} Inspectors = ...;
tuple InspectorTimeSpan {int fromTime; int toTime; int fromLocation; int toLocation; };
sorted {InspectorTimeSpan} inspectorInspectionTime[Inspectors] = ...;

// inpections cross inspectors
tuple InspectionInspector {
  string Inspection;
  string Inspector;
}
{InspectionInspector} InspectionPossibleInspectors = { <ion,ior> | ion in Inspections, ior in Inspectors };
{InspectorTimeSpan} ionIorInspectionTime[ionIor in InspectionPossibleInspectors ] = { ts 
                                                                                    | ts in inspectorInspectionTime[ionIor.Inspector]
                                                                                    : ts.fromTime<= ionIor.Inspection.fromTime}                                                                                    ;


// decision variables
dvar interval ionIorVisitTime[ionIor in InspectionPossibleInspectors] optional;
dvar interval ionVisitTime[ion in Inspections] size inspectionDuration[ion];

dvar sequence iorPlanning[ior in Inspectors] 
  in    all(ionIor in InspectionPossibleInspectors:ionIor.Inspector==ior) ionIorVisitTime[ionIor] 
  types all(ionIor in InspectionPossibleInspectors:ionIor.Inspector==ior) inspectionLocation[ionIor.Inspection]
;

// objective
maximize sum(ion in Inspections) sizeOf(ionVisitTime[ion], 0);

// constraints
subject to {
  // every inspection in planned at most once
  forall(ion in Inspections)
    alternative(ionVisitTime[ion], 
                all(<ion,ior> in InspectionPossibleInspectors) ionIorVisitTime[<ion,ior>]);

  // inspection done in allowed range of time 
  //    for every inspection
  //      use a cumul function which is 1 when NOT allowed
  //      ensure the function cumulated value be zero
  forall(ion in Inspections)
    /* why does this not work????
    alwaysIn(pulse(ionVisitTime[ion], 1), 
             inspectionTimeSlot[ion].fromTime,
             inspectionTimeSlot[ion].toTime,
             0,
             2)*/
    alwaysIn(sum(ts in inspectionTimeSlots[ion]) pulse(ts.fromTime,ts.toTime,1), 
             ionVisitTime[ion],
             1,
             1)
             ;
  
  // inspector works in allowed range of time
  // inspector receive times to travel from his fromLocation to his ToLocation
  // to do
  
  // the Inspector executes a sequence of inspection
  forall (ior in Inspectors)
    noOverlap(iorPlanning[ior], distanceLocationLocation);
};




 