package _10_array_list.excercise;

import java.util.ArrayList;

public class TestMyList {
    public static class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }


    public static void main(String[] args) {
        Student student = new Student("trung", 18);
        Student student1 = new Student("trung1", 19);
        Student student2 = new Student("trung2", 20);
        Student student3 = new Student("trung3", 21);
        Student student4 = new Student("trung4", 21);
        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newStudentMyList=new MyList<>();
        studentMyList.add(student);
        studentMyList.clear();
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
//        studentMyList.add(student4,0);

//        for (int i = 0; i <studentMyList.size() ; i++) {
//            Student student5 = (Student) studentMyList.elements[i];
//
//
//            System.out.println( student5.);
//            System.out.println(student5.getAge());
//        }
//        System.out.println(studentMyList.size());
//        System.out.println(studentMyList.contain(student3));
       newStudentMyList=studentMyList.clone();
       newStudentMyList.remove(2);
        for (int i = 0; i <newStudentMyList.size() ; i++) {
            System.out.println(newStudentMyList.get(i).getName());
        }
    }

}

