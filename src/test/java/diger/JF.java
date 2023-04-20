package diger;

import javax.swing.*;

public class JF {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        JButton button = new JButton("button");
        frame.add(button);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

}
