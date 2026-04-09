
import java.util.*;

public class Association {

    public static class Patient {

        private String name;
        private String ailment;

        Patient(String name, String ailment) {
            this.name = name;
            this.ailment = ailment;
        }

        public String getName() {
            return name;
        }

        public String getAilment() {
            return ailment;
        }
    }

    public static class Doctor {

        private String name;
        private List<Patient> patients = new ArrayList<>();

        Doctor(String name) {
            this.name = name;
        }

        void addPatient(Patient p) {
            patients.add(p);
        }

        void printSchedule() {
            System.out.println("Dr. " + name + "'s patients:");
            patients.forEach((p) -> System.out.println("  → " + p.getName() + " (" + p.getAilment() + ")"));
        }
    }

    public static void main(String[] args) {

        Patient p1 = new Patient("Jethalal", "Fever");
        Patient p2 = new Patient("Bhide", "Migraine");
        Patient p3 = new Patient("Rustin", "Life");

        Doctor d1 = new Doctor("Mehtasaab");

        d1.addPatient(p1);

        d1.addPatient(p2);

        d1.printSchedule();

        Doctor d2 = new Doctor("Doom");

        d2.addPatient(p3);

        d2.printSchedule();
    }
}

/* 
 Objects know about each other, but neither owns the other
 Both objects have independent lifecycles — destroying one does not destroy the other.
 Association can be unidirectional (A knows B) or bidirectional (A ↔ B).
 Modelled as a field reference to another class
 */
