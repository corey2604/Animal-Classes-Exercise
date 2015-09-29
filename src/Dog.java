public class Dog extends Mammal{
    boolean Neutered;

    public Dog(String Name, String Breed, Gender sex,  String Colour, float Height, float Weight, boolean Neutered){
        super(Name, Breed, sex, Colour,  Height, Weight);
        this.Neutered=Neutered;
    }
    public String toString(){
       return (this.Name+this.Colour);
    }
    public void speak(){
        System.out.println("Woof");
    }
}
