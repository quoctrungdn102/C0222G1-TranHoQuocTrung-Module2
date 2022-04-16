package _11_stack_queue.exercise.queue;

import java.util.Comparator;

public class PersonComparator implements Comparator<Personnel> {

    @Override
    public int compare(Personnel o1, Personnel o2) {
        if(o1.getBirthday()>o2.getBirthday()){
            return 1;
        }else if(o1.getBirthday()<o2.getBirthday()) {
            return -1;
        }else {
            return 0;
        }
    }
}
