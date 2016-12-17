/*********************************************
 * OPL 12.6.1.0 Model
 * Author: MiSc
 * Creation Date: Jan 31, 2015 at 4:32:39 PM
 *********************************************/
 
 using CP;
 
// locations 
{int} Locations = ...;
tuple triplet {int fromLocation; int toLocation; int distance;};
{triplet} distanceLocationLocation = ...;

// inspections
{string} Inspections = ...;
int inspectionDuration[Inspections] = ...;
int inspectionLocation[Inspections] = ...;
tuple TimeSlot {int fromTime; int toTime;};
tuple InspectionTimeSlot {string inspection; TimeSlot ts;};
{InspectionTimeSlot} InspectionTimeSlots = ...;

// inspectors
{string} Inspectors = ...;
tuple InspectorTimeSpan {string inspector; int fromTime; int toTime; int fromLocation; int toLocation; };
{ InspectorTimeSpan } InspectorTimeSpans = ...;

// inpections cross inspectors
tuple InspectionInspector {
  string Inspection;
  string Inspector;
};

// smallest level of detail
tuple InspectionInspectorTs { InspectionTimeSlot ion_ts; InspectorTimeSpan ior_ts; };

// compatible inspector inspection
{InspectionInspector} InspectionPossibleInspectors = { <ion,ior> | ion in Inspections, ior in Inspectors };

// compatible inspector ts with inspection ts
{InspectionInspectorTs} InspectionPossibleInspectorsTs = { <ion_ts, ior_ts> 
                                                     | ion_ts in InspectionTimeSlots, ior_ts in InspectorTimeSpans 
                                                     : <ion_ts.inspection, ior_ts.inspector> in InspectionPossibleInspectors
                                                     && ion_ts.ts.fromTime <= ior_ts.toTime
                                                     && ion_ts.ts.toTime   >= ior_ts.fromTime };

// decision variables
dvar interval ionVisitTime[ion in Inspections] size inspectionDuration[ion];

dvar interval ionTsVisitTime[ion_ts in InspectionTimeSlots] optional;

dvar interval ionIorTsVisitTime[ion_ior_ts in InspectionPossibleInspectorsTs] optional;

dvar sequence iorPlanning[ior_ts in InspectorTimeSpans] 
  in    all(ion_ior_ts in InspectionPossibleInspectorsTs :ion_ior_ts.ior_ts==ior_ts) ionIorTsVisitTime[ion_ior_ts] 
  types all(ion_ior_ts in InspectionPossibleInspectorsTs :ion_ior_ts.ior_ts==ior_ts) inspectionLocation[ion_ior_ts.ion_ts.inspection];
;

// objective
maximize sum(ion in Inspections) sizeOf(ionVisitTime[ion], 0);

// constraints
subject to {
  // every inspection in planned at most once
  forall(ion in Inspections)
    alternative(ionVisitTime[ion], 
                all(ion_ts in InspectionTimeSlots: ion_ts.inspection==ion) ionTsVisitTime[ion_ts]);
                
  // an inspection timeslot is done by some inspector time span, if done
  forall ( ion_ts in InspectionTimeSlots )
    alternative(ionTsVisitTime[ion_ts],
               all(ion_ior_ts in InspectionPossibleInspectorsTs: ion_ior_ts.ion_ts==ion_ts ) ionIorTsVisitTime[ion_ior_ts]);               

  // the Inspector (timespan) executes a sequence of inspection (time slot)
  forall (ior_ts in InspectorTimeSpans)
    noOverlap(iorPlanning[ior_ts], distanceLocationLocation);
    
  // the inspection in the time of the time slot
  forall(ion_ts in InspectionTimeSlots)
    forbidExtent(ionTsVisitTime[ion_ts], 
                stepwise{0.0->ion_ts.ts.fromTime; 1.0->ion_ts.ts.toTime; 0.0});
                
  // the inspector does it in its time span
  forall(ion_ior_ts in InspectionPossibleInspectorsTs)
    forbidExtent(ionIorTsVisitTime[ion_ior_ts],
                 stepwise{0.0->ion_ior_ts.ior_ts.fromTime; 1.0->ion_ior_ts.ior_ts.toTime; 0.0});
};


