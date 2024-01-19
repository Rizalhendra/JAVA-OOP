

package com.mycompany.game;

/**
 *
 * @author USER
 */
public class Game {

    public static void main(String[] args) {
   //objek
   Player Hero = new Player();
   Player Enemy = new Player ();
    //memberi nilai atribut
    Hero.name = "Boi";
    Hero.speed = 20 ;
    Hero.healthPoin = 100 ;
    Hero.attack = 30;
    Hero.armor = 15;

            
            
    Enemy.name = "satya";
    Enemy.speed = 30;
    Enemy.healthPoin = 100;
    Enemy.attack = 15;
    Enemy.armor = 20;
   
            

    
    Hero.run();
    Enemy.run();
    Hero.attack();
    Enemy.attack ();
   
    if(Hero.isDead()){
        System.out.println(Hero.name + " Game over :(");
        
     if (Enemy.isDead()){
         System.out.println(Enemy.name +" You win");
     }
    }
    }
   
}
