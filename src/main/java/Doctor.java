public class Doctor {
    private String name;
    private String surName;
    private String spetialisation;

    public Doctor() {
    }

    public Doctor(String name, String surName, String spetialisation) {
        this.name = name;
        this.surName = surName;
        this.spetialisation = spetialisation;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getSpetialisation() {
        return spetialisation;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", specialisation ='" + spetialisation + '\'' +
                '}';
    }
}