// Creates a random password, based off of the log values of fibonnaci numbers.
import java.util.*;
public class mathPassword {
 public static void main(String args[]) {
  ArrayList<Double> fibonnaciSequence = new ArrayList<Double>();
  
  // a random amount of numbers between 10 and 15 starting at a random index from 0 to 25
  fibonnaciSequence = fibonnaci((int) (Math.random() * 15) + 10, (int) (Math.random() * 25));
  System.out.println("Fibonnaci sequence: \n" + fibonnaciSequence + "\n");
  randomizeArrayList(fibonnaciSequence);
  System.out.println("Randomized fibonnaci sequence: \n" + fibonnaciSequence + "\n");
  logArrayList(fibonnaciSequence);
  System.out.println("Loged fibonnaci sequence: \n" + fibonnaciSequence + "\n");
 }

 // creates an array of fibonnaci numbers of a random amount in a random place in the sequence
 public static ArrayList<Double> fibonnaci(int returnAmount, int minIndex) {
   System.out.println(minIndex);
  double x = 0, y = 1, temp = 0;
  ArrayList<Double> fibonnaciSequence = new ArrayList<Double>();
  int i = 0;
  
  // creates an amount of fibonacci numbers that matches the return amount starting at a random location
  while(i < minIndex + returnAmount) {
    if(i > minIndex) {
      fibonnaciSequence.add(x);
    }
   temp = x;
   x = y;
   y += temp;
   i++;
  }
  return fibonnaciSequence;
 }
 
 // randomizes ArrayList by picking an element at a random index and placing it at a random location
 public static ArrayList<Double> randomizeArrayList(ArrayList<Double> toBeRandoed) {
   int iterations = (int) (Math.random() * 5) + 10;
   int i = 0;
   while (i < iterations) {
     double temp = toBeRandoed.remove((int) (Math.random() * (toBeRandoed.size())));
     toBeRandoed.add((int) (Math.random() * (toBeRandoed.size())), temp);
     i++;
   }
   return toBeRandoed;
 }
 
 //returns an ArrayList with each element logged
 public static ArrayList<Double> logArrayList(ArrayList<Double> toBeLoged) {
   for(int i = 0; i < toBeLoged.size(); i++) {
     toBeLoged.set(i, Math.log(toBeLoged.get(i)));
   }
   return toBeLoged;
 }
}