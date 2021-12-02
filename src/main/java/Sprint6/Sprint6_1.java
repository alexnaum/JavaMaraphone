package Sprint6;
import java.util.*;

public class Sprint6_1 {
    public static void main(String[] args){

      List<Person> persons = new ArrayList<>();

      List<Student> students = new ArrayList<>();
      List<Worker> workers = new ArrayList<>();
      persons.add(new Person("Ivan"));
      persons.add(new Student("Petro","University",3));
      persons.add(new Worker("Andriy","Developer",12));
      persons.add(new Student("Stepan","College",4));
      persons.add(new Worker("Ira","Manager",8));
      persons.add(new Student("Ihor","University",4));
      persons.add(new Student("Stepan","College",1));

      Person ps = new Student("Vano", "Test", 4);
        System.out.println(((Student) persons).getStudyYears());

      for(Person person : persons){
        // System.out.println(((Student) person).getStudyYears());
      }
    }
}
class Person{
    // Code
    private String name;
    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
class Student extends Person implements Comparator<Student>{
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

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getStudyYears()> o2.getStudyYears()) return 1; else
            if(o1.getStudyYears()< o2.getStudyYears()) return -1; else
        return 0;
    }
}
class Worker extends Person implements Comparator<Worker>{
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

    @Override
    public int compare(Worker o1, Worker o2) {
        if(o1.getExperienceYears() > o2.getExperienceYears()) return 1; else
        if(o1.getExperienceYears()< o2.getExperienceYears()) return -1; else
            return 0;
    }
}
   class MyUtils{
    public List<Person> maxDuration(List<Person> persons) {
        List<Person> ps = new ArrayList<>();
        Collection<Person> col = new ArrayList<>();
        for(Person person:persons){
            ((Student) person).getStudyYears();

        }
        // Code
     return persons;
    }
   }
