package Exercise2;

import java.util.Comparator;


public class PatientComparator implements Comparator<Patient> {

    @Override
    public int compare(Patient o1, Patient o2) {
        var i = o2.getSeverity().compareTo(o1.getSeverity());
        if(i != 0){
            return i;
        }
        i = Long.compare(o1.getTimeStampAdmission(),o2.getTimeStampAdmission());
        if(i != 0){
            return i;
        }
        i = Integer.compare(o1.getAge(),o2.getAge());
        if(i != 0){
            return i;
        }

        //if all 3 are the same, then we return 0
        return 0;
    }
}
