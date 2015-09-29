public abstract class Mammal extends Animal{
    boolean Microchip;

    public Mammal(String Name, String Breed, Gender sex,  String Colour, float Height, float Weight){
        super(Name, Breed, sex, Colour,  Height, Weight);
    }

    public boolean getWarmBlooded(){
        return true;
    }
    public boolean getBackbone(){
        return true;
    }
}
