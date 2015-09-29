
public class Turtle extends Reptile {
    float SizeOfShell;

    public Turtle(String Name, String Breed, Gender sex,  String Colour, float Height, float Weight, float SizeOfShell){
        super(Name, Breed, sex, Colour,  Height, Weight);
        this.SizeOfShell=SizeOfShell;
    }
    public void speak(){
        System.out.println("RARRRRRRR");
    }
}
