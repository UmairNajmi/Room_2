// Room2.java
// displays the floor space of a room 
import java.util.Scanner;
class Room2
{
    public static void main(String[] args) 
    {
        double length, width, area; 
        length = 15;
        width = 25;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of room "); 
        length = input.nextDouble(); 
        System.out.print("Enter width ");
        width = input.nextDouble(); 
        area = length * width;
        System.out.println("The length is " + length); 
        System.out.println("The width is " + width); 
        System.out.println("The floor space is " +
            area + " square feet\n");
    }
}