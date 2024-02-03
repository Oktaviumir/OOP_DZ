import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Animal> patients = new ArrayList<>();

    public List<Animal> getPatients() {
        return patients;
    }

    public VeterinaryClinic addPatient(Animal patient) {
        patients.add(patient);
        return this;
    }

    public void removePatient(Animal patient) {
        patients.remove(patient);
    }

    public List<Fly> getFly() {
        List<Fly> result = new ArrayList<>();
        for (Animal animal : patients) {
            if (animal instanceof Fly) {
                result.add((Fly) animal);//операция каст
            }
        }
        return result;
    }

    public List<Swim> getSwim() {
        List<Swim> result = new ArrayList<>();
        for (Animal animal : patients) {
            if (animal instanceof Swim) {
                result.add((Swim) animal);//операция каст
            }
        }
        return result;
    }

    public List<Speak> getSpeak() {
        List<Speak> result = new ArrayList<>();
        for (Animal animal : patients) {
            if (animal instanceof Speak) {
                result.add((Speak) animal);//операция каст
            }
        }
        return result;
    }

    public List<ToGo> getToGo() {
        List<ToGo> result = new ArrayList<>();
        for (Animal animal : patients) {
            if (animal instanceof ToGo) {
                result.add((ToGo) animal);//операция каст
            }
        }
        return result;
    }
}