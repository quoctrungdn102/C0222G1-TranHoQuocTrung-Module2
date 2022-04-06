package _05_access_modifi.exercise.studen;

public class Student {
    private String name;
    private String classes;
    public Student(){
    }
    public Student(String name,String classes){
        this.name=name;
        this.classes=classes;
    }

    public String getClasses() {
        return classes;
    }

    public String getName() {
        return name;
    }

   void setClasses(String classes){
        this.classes = classes;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return this.name+this.classes;
    }

}
