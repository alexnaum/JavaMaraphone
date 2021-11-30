package Sprint6;
import java.util.*;

public class Sprint6_1 {
    public static void main(String[] args){

      List<Person> persons = new ArrayList<>();
      persons.add(new Person("Ivan"));
      persons.add(new Student("Petro","University",3));
      persons.add(new Worker("Andriy","Developer",12));
      persons.add(new Student("Stepan","College",4));
      persons.add(new Worker("Ira","Manager",8));
      persons.add(new Student("Ihor","University",4));
     /* for(int i=0;i<persons.size();i++)
          System.out.println(persons.get(i).getName());*/
        //System.out.println(Collections.));
    }
}
class Person {
    // Code
    private String name;
    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
class Student extends Person {
    // Code
    private String studyPlace;
    private int studyYears;
    public Student(String name, String studyPlace, int studyYears){
        super(name);
        this.studyPlace = studyPlace;
        this.studyYears = studyYears;
    }
    public String getStudyPlace(){
        return studyPlace;
    }
    public int getStudyYears(){
        return studyYears;
    }
}
class Worker extends Person {
    // Code
    private String workPosition;
    private int experienceYears;
    public Worker(String name, String workPosition, int experienceYears){
        super(name);
        this.workPosition = workPosition;
        this.experienceYears = experienceYears;
    }
    public String getWorkPosition(){
        return workPosition;
    }
    public int getExperienceYears(){
        return experienceYears;
    }
}
   /*class MyUtils implements Comparable<Person>{
    public List<Person> maxDuration(List<Person> persons) {
        // Code
     return Arrays.sort(persons,);
    }
    @Override
       public int compareTo(Person p) {
        return
       }
   }*/
