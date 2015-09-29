
public abstract class Reptile extends Animal {

    public boolean getWarmBlooded(){
        return false;
    }
    public boolean getBackbone(){
        return true;
    }
    public Reptile(String Name, String Breed, Gender sex,  String Colour, float Height, float Weight){
        super(Name, Breed, sex, Colour,  Height, Weight);
    }
}
