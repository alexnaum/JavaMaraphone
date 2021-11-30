package sprint4;

public class Main {

    public static void main(String[] args){
        Person person = new Person("asd");
        //person.setName("fsdfsdf");
        System.out.println(person.getName());

        /*Point p = new Point(4,7);
        System.out.println(p.distance());
        System.out.println(p.distance(3,8));
        System.out.println(p.distance(new Point(3,8)));*/
    }
}
class Person{
    public String name = "John Doe";
    public int age;
    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    /*public void setName(String name){
        if(name!=null){
            name = name;
        }
    }
    public String getName(){
        return name;
    }*/
}
