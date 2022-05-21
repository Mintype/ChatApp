package src.com.hackathon;
import java.util.Scanner; 

import javax.swing.*;

public class Client {
    public static void main(String []args){
        System.out.println("hi");
        Scanner input =new Scanner(System.in);
        System.out.println("Enter Your Username: "); 
        String usernameEnter = input.nextLine(); 

        int portNumber = 10334;
        String host = "localhost";
        
        System.out.println("Now using host = " + host + ", portNumber = " + portNumber);

        System.out.println("Welcome To ChatApp");
        Graphics graphics = new Graphics();
        String username="";
        String message="";
        String full="";
        Boolean exit=false;
        username=input.nextLine(); 
        while(true){
            message=input.nextLine();
            full=username+": "+message;
            System.out.println(message);
            
        }
    }
}
class Graphics {
    Graphics(){
        JFrame frame = new JFrame("ChatApp");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 500);
        frame.setLayout(null);
        //frame.setVisible(true);

    }
}