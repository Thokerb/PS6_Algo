package Exercise2;

public class Main {

    public static void main(String[] args) {
        var room = new EmergencyRoom();
        var p1 = new Patient("John Alpha", Severity.SEVERE,0,54);
        var p2 =  new Patient("Mark Bravo", Severity.SEVERE,1,18);
        var p3 =  new Patient("Steven Charlie", Severity.MEDIUM,1,31);
        var p4 = new Patient("Clara Delta", Severity.MILD,2,15);
        var p5 =  new Patient("Theresa Echo", Severity.MILD,2,82);
        var p6 =  new Patient("Sebastian Foxtrott", Severity.SEVERE,4,63);
        var p7 =  new Patient("Anna Golf", Severity.SEVERE,4,40);
        var p8 =  new Patient("Maria Hotel", Severity.MEDIUM,5,3);



        room.registerNewPatient(p1);
        room.registerNewPatient(p2);
        room.registerNewPatient(p3);
        room.registerNewPatient(p4);
        room.treat();
        room.registerNewPatient(p5);
        room.treat();
        room.treat();
        room.registerNewPatient(p6);
        room.registerNewPatient(p7);
        room.registerNewPatient(p8);
        room.clearRoom();














    }
}
