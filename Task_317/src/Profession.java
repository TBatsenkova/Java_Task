public class Profession<T> {
    private T profession;

    public Profession(T profession) {
        this.profession = profession;
    }

    //public Profession(T obj) {
     //   profession = obj;
    //}

    public T getProfession() {
        return profession;
    }

    public void setProfession(T profession) {
        this.profession = profession;
    }

    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Profession <Doctor> doctorProfession = new Profession<>(doctor);
        doctorProfession.profession.work();
        System.out.println("Профессия: " + doctorProfession.profession.getClass().getName());

        Teacher teacher = new Teacher();
        Profession<Teacher> teacherProfession = new Profession<>(teacher);
        teacherProfession.profession.work();
        System.out.println("Профессия: " + teacherProfession.profession.getClass().getName());
    }
}
