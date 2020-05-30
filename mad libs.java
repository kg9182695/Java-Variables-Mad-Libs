//Java Variables: Mad Libs
In this project, we’ll use Java to write a Mad Libs word game! Mad Libs have short stories with blank spaces that a player can fill in. The result is usually funny (or strange).
public class MadLibs {
  /*
  This program generates a mad libbed story.
Author: Asif 
Date: 25/05/2020
  */
  	public static void main(String[] args){
      // Create a String called name1 that stores the name of the main character.
      String name1 = "Asif";
      // You will need to provide three String adjectives.
      String adjective1 = "dance";
      String adjective2 = "fly";
      String adjective3 = "grapes";
      // You’ll also need to provide one verb.
      String verb1 = "Dancing";
      
    // The story also needs six nouns.
      String noun1 = "People";
      String noun2 = "People";
      String noun3 = "People";
      String noun4 = "People";
      String noun5 = "People";
      String noun6 = "People";
      // Our story needs another character. Declare a String variable called name2 and initialize it to the value of another name
      String name2 = "Arif";
      // Our story requires one number. Declare an int variable called number and set it to any whole number you like.
      int number= 5;
      /* There’s one more variable! Declare a String called place1 and store any place in it. This could be a city, or a town, or a country, or a planet!*/
      String place1 = "Shimla";
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
      // Time to read the story! Use System.out.println() to print the story variable.
      System.out.println(story);
    }       
    
}
