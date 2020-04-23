package Exercise2;

import Exercise2_PriorityQueue.AbstractPriorityQueue;

import java.util.PriorityQueue;

public class EmergencyRoom {
    private AbstractPriorityQueue<Patient,Patient> patientPriorityQueue;

    public EmergencyRoom(){

        configurePatientPriorityQueue();
    }

    private void configurePatientPriorityQueue() {
        var queue = new Exercise2_PriorityQueue.HeapPriorityQueue<Patient,Patient>(new PatientComparator());
        patientPriorityQueue = queue;
    }


    public void registerNewPatient(Patient patient){
        System.out.println("[->] "+patient+" is admitted");
        patientPriorityQueue.insert(patient,patient);
    }

    public void treat(){
        var pat = patientPriorityQueue.removeMin();
        System.out.println("[<-] "+pat.getValue()+" is treated");
    }

    public void clearRoom(){
        System.out.println("The emergency room closes. All patients that were admitted so far are treated sequentially.\n");
        while (!patientPriorityQueue.isEmpty()){
            treat();
        }
    }

    public void visualize(){
    }

}
