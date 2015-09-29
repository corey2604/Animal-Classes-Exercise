import sun.font.TrueTypeFont;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    String Answer;
    boolean moveon;
    boolean CorrectAnswer = false;
    moveon=false;
    Scanner Input = new Scanner( System.in );
   	Dog myDog = new Dog("Dogley", "Spaniel", Gender.Male, "Black", 12.5f, 13.5f, false);
    Bat myBat = new Bat("Batley", "Barbastelle", Gender.Male, "Black", 12.5f, 13.5f);
    Snake mySnake = new Snake("Snakeley", "Python", Gender.Male, "Black", 12.5f, 13.5f, true);
    Turtle myTurtle = new Turtle("Turtley", "Snapping Turtle", Gender.Male, "Green", 12.5f, 13.5f, 15.6f);


        ArrayList<Animal> AnimalList = new ArrayList<Animal>();
        AnimalList.add(myDog);
        AnimalList.add(myBat);
        ;

        for (Animal i : AnimalList){
            i.speak();
        }
        //Tests the getWarmBlooded method
        /*do {
        do {
        Answer=" ";
        System.out.println("Are mammals warm blooded?");
        Answer=Input.nextLine();
            if (Answer.equals("Yes")||Answer.equals("yes")||Answer.equals("no")||Answer.equals("No")){
                moveon=true;
            }
        } while (moveon==false);
        if (Answer == "Yes"||Answer=="yes"){
            System.out.println("Right Answer!");
            CorrectAnswer=true;
        }
        else{
            System.out.println("Wrong Answer! Try Again");
        }
        } while (CorrectAnswer==false); */
        System.out.println();
        System.out.println("Dogs are warm blooded: "+myDog.getWarmBlooded());
        System.out.println("Bats are warm blooded: "+myBat.getWarmBlooded());
        System.out.println("Snakes are warm blooded: "+mySnake.getWarmBlooded());
        System.out.println("Turtles are warm blooded: "+myTurtle.getWarmBlooded());
        //Tests the getBackbone method
        System.out.println("Dogs have a backbone (are vertebrates): "+myDog.getBackbone());
        System.out.println("Snakes have a backbone (are vertebrates): "+mySnake.getBackbone());
        System.out.println("toString test: "+myDog.toString());


    }
    }





