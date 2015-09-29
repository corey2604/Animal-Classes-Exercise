
public abstract class Animal {
    //This is the main class from which other classes inherit
    String Name;
    String Breed;
    Gender Sex;
    String Colour;
    float Height;
    float Weight;

    public Animal(String Name, String Breed, Gender sex,  String Colour, float Height, float Weight) {
       this.Name=Name;
       this.Breed=Breed;
       this.Sex=Sex;
       this.Colour=Colour;
       this.Height=Height;
       this.Weight=Weight;

    }

    public abstract boolean getWarmBlooded();
    public abstract boolean getBackbone();
    public abstract void speak();


}
