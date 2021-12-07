/**
 * Create next types: Person (field String name), Student (fields String studyPlace, int studyYears) and Worker (fields String workPosition, int experienceYears). Classes Student and Worker are derived from class Person. All classes have getters to return fields.
 * Create a maxDuration() method of the MyUtils class to return a list of Students with maximum duration of study and Workers with maximum experience.
 * For example, for a given list
 * [Person [name=Ivan], Student [name=Petro, studyPlace=University, studyYears=3], Worker [name=Andriy, workPosition=Developer, experienceYears=12], Student [name=Stepan, studyPlace=College, studyYears=4], Worker [name=Ira, workPosition=Manager, experienceYears=8], Student [name=Ihor, studyPlace=University, studyYears=4]]
 * you should get
 * [Worker [name=Andriy, workPosition=Developer, experienceYears=12], Student [name=Stepan, studyPlace=College, studyYears=4], Student [name=Ihor, studyPlace=University, studyYears=4]]
 */
package Sprint6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
        System.out.println(((Student) person).getStudyYears());
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
    public int getDuration(){
        return 0;
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
    public int getDuration(){
        return studyYears;
    }

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getStudyYears()> o2.getStudyYears()) return 1; else
            if(o1.getStudyYears()< o2.getStudyYears()) return -1; else
        return 0;
    }
}
class Worker extends Person{
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
    public int getDuration(){
        return experienceYears;
    }
}
   class MyUtils{
    public List<Person> maxDuration(List<Person> persons) {
        //List<Student> ps = new ArrayList<>();
        List<Person> students = new ArrayList<>();
        List<Person> workers = new ArrayList<>();
        //Collection<Person> col = new ArrayList<>();
        for(Person person:persons){
            ((Student) person).getStudyYears();

        }
        // Code
     return persons;
    }
   }
