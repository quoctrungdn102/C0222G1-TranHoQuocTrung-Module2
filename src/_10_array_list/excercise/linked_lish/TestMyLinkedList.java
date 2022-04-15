package _10_array_list.excercise.linked_lish;

import _10_array_list.excercise.array_list.MyList;

public class TestMyLinkedList {



    public static void main(String[] args) {
        Student1 student = new Student1("trung", 18);
        Student1 student1 = new Student1("trung1", 19);
        Student1 student2 = new Student1("trung2", 20);
        Student1 student3 = new Student1("trung3", 21);
        Student1 student4 = new Student1("trung4", 21);
        MyLinkedList<Student1> myLinkedList = new MyLinkedList<>();
        myLinkedList.adđFirts(student);
        myLinkedList.adđFirts(student1);
        myLinkedList.adđFirts(student2);
        myLinkedList.adđFirts(student3);
        myLinkedList.adđFirts(student4);
        for (int i = 0; i < myLinkedList.size() ; i++) {
            Student1 student11 = (Student1) myLinkedList.get(i);
            System.out.println(student11.getName());
        }


    }
}


