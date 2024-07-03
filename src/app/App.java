package app;

import javax.swing.*;

public class App {

    public static void main(String[] args) {
        int boardWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");
//		frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack(); //this is for not including the title bar in our 360*640 dimensions
        flappyBird.requestFocus();

        frame.setVisible(true); //we added JPanel to our frame so now we set visibility to true
    }
}
