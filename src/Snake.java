public class Snake extends Reptile {
    boolean Poisonous;

    public Snake(String Name, String Breed, Gender sex,  String Colour, float Height, float Weight, boolean Poisonous){
        super(Name, Breed, sex, Colour,  Height, Weight);
        this.Poisonous=Poisonous;
    }
    public void speak(){
        System.out.println("Hiss");
    }
}
