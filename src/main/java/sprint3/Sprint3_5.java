package sprint3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sprint3_5 {
    public static void main(String[] args){
        Sprint3_5 sp = new Sprint3_5();
        List<Student> studentList1 = new ArrayList<>();
        List<Student> studentList2 = new ArrayList<>();
        studentList1.add(new Student(1, "Ivan"));
        studentList1.add(new Student(2, "Petro"));
        studentList1.add(new Student(3, "Stepan"));
        studentList2.add(new Student(1, "Ivan"));
        studentList2.add(new Student(3, "Stepan"));
        studentList2.add(new Student(4, "Andriy"));
        Set<Student> set = new HashSet<>();
        set.addAll(studentList1);
        for(Student st : sp.commonStudents(studentList1, studentList2)){
            //System.out.println(st.id);
            System.out.println("["+st.id+", " + st.name + "]");
        }

        //System.out.println(set);
        //System.out.println(studentList2);


    }
    public static class Student {
        private int id;
        private String name;
        // Constructor, metthods, Code
        public Student(int id, String name){
            this.id = id;
            this.name = name;
        }
    }
    public Set<Student> commonStudents(List<Student> list1, List<Student> list2) {
        // Code
        Set<Student> students = new HashSet<>();
        for(Student st:list1)
            for(Student st1:list2){
             if(st1.id == st.id)
              students.add(st);
        }
        return students;
    }
}