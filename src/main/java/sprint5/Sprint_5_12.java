package sprint5;

public class Sprint_5_12 {
}
// Write your code here
abstract class Animal{
    int age;
    double weight;
    public abstract String move();
    public Animal(int age, double weight){
        this.age = age;
        this.weight = weight;
    }
}
class Mammal extends Animal{
  public Mammal(int age, double weight){
      super(age, weight);
  }
  public final String move(){
      return "run";
  }
}
final class Fish extends Animal{
    public Fish(int age, double weight){
        super(age, weight);
    }
    public String move(){
        return "swim";
    }
}
final class Bird extends Animal{
    public Bird(int age, double weight){
        super(age, weight);
    }
    public String move(){
        return "fly";
    }
}
