import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
    List<Hero> heroes = new ArrayList<>();
        // TODO 2 : Add those heroes to the list
        Hero blackWidow = new Hero("Black Widow",34);
        Hero captainAmerica = new Hero("Captain America",100);
        Hero vision = new Hero("Vision",3);
        Hero ironMan = new Hero("Iron Man", 48);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero thor = new Hero("Thor",1500);
        Hero hulk = new Hero("Hulk",49);
        Hero doctorStrange = new Hero("Doctor Strange", 42);

        heroes.add(blackWidow); //index 0
        heroes.add(captainAmerica); //index 1
        heroes.add(vision); //index 2
        heroes.add(ironMan); //index 3
        heroes.add(scarletWitch); //index4
        heroes.add(thor); //index 5
        heroes.add(hulk); //index 6
        heroes.add(doctorStrange); //index 7

        // TODO 3 : It's Thor birthday, now he's 1501
        thor.setAge(1501);

        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes, new Random());

        // TODO 5 : Keep only the half of the list
       heroes = heroes.subList(0, heroes.size()/2 );

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (Hero string : heroes) { // iterate though the list
            System.out.println("Survivor : " + string.getName());
        }
    }
}
