public class Bat extends Mammal {

    public Bat(String Name, String Breed, Gender sex,  String Colour, float Height, float Weight){
        super(Name, Breed, sex, Colour,  Height, Weight);
    }
    public void speak(){
        System.out.println("I'M BATMAN!");
    }
}
