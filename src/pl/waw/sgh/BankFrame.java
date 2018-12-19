package pl.waw.sgh;

import javax.swing.*;
import java.awt.*;

public class BankFrame {

    public static void main(String[] args) {
        JFrame bankFrame = new JFrame("Bank App");
        bankFrame.setSize(1000,700);
        bankFrame.setVisible(true);
        bankFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        bankFrame.setMinimumSize(new Dimension(600, 600));
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("My first label"));
        bankFrame.add(myPanel);
        bankFrame.setLayout(new FlowLayout());



    }


}
