public class Horse extends Mammal {
   boolean RaceHorse;

    public Horse(String Name, String Breed, Gender sex,  String Colour, float Height, float Weight){
        super(Name, Breed, sex, Colour,  Height, Weight);
        this.RaceHorse = RaceHorse;
    }
    public void speak(){
        System.out.println("Neigh");
    }
}
