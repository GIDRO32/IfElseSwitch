import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int Money = 500;
        if(Money > 2000)
        {
            System.out.println("Wow, this is plenty!");
            if(Money != 2375)
            {
                System.out.println("But it isn't equal to my balance. You must guess it to win!");
            }
            else {
                System.out.println("And you guessed my balance! Now my balance is yours!\nIsn't it great to have twice more than you had before?");
            }
        }
        else {
            System.out.println("You are poorer than me. I have nothing to talk about with you.");
        }
    }
    }