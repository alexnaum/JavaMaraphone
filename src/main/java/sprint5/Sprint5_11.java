package sprint5;
import java.util.Calendar;

import static java.util.Calendar.YEAR;

public class Sprint5_11 {
  public static void main(String[] args){
      Student st = new Student(2019, "Yakov", "Melman");
      System.out.println(st.getCourseNumber());
  }
}
class User{
    protected String name;
    protected String surname;
    public String getFullName(){
        return name + " "+ surname;
    }
    public User(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
}
class Student extends User{
    protected int year;
    public int getCourseNumber(){
        Calendar cal = Calendar.getInstance();
        int count = cal.get(Calendar.YEAR) - year + 1;
        if((1<=count)&&(count<=6)) return count;
        else
        return -1;
    }
    public Student(int year, String name, String surname){
        super(name, surname);
        this.year = year;
    }
}
