package Exercise2;

import java.util.Timer;

public class Patient {

    private String id;
    private String name;
    private long timeStampAdmission;
    private Severity severity;
    private int age;

    public Patient( String name,Severity severity, long timeStampAdmission,int age) {
        this.id = id;
        this.name = name;
        this.timeStampAdmission = timeStampAdmission;
        this.severity = severity;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTimeStampAdmission() {
        return timeStampAdmission;
    }

    public void setTimeStampAdmission(long timeStampAdmission) {
        this.timeStampAdmission = timeStampAdmission;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Patient ("+name+", "+severity+", "+timeStampAdmission+", "+age+")";
    }
}
