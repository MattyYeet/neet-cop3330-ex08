package ahhhhhhhhhhhhhh;

import java.util.Scanner;

public class example8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many people? ");
        int people = input.nextInt();

        System.out.print("How many pizzas do you have? ");
        int pizzas = input.nextInt();

        System.out.print("How many slices per pizza? ");
        int slices = input.nextInt();

        int totalS = pizzas * slices;
        int totalP = totalS / people;
        int left = totalS - (totalP * people);

        System.out.println(people+" people with "+pizzas+" pizzas ("+totalS+" slices)");

        if(totalP == 1)
        {
            System.out.println("Each person gets 1 slice of pizza.");
        }
        else
        {
            System.out.println("Each person gets "+totalP+" slices of pizza.");
        }

        System.out.println("There are "+left+" leftover pieces.");

    }
}
