package src.com.hackathon;

import javax.swing.*;

public class Client {
    public static void main(String []args){
        Graphics graphics = new Graphics();
    }
}
class Graphics {
    Graphics(){
        JFrame frame = new JFrame("ChatApp");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        //frame.setVisible(true);

    }
}