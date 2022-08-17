package lamda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTListenerExample {
    public static void main(String[] args) {

a1();
    }

    public static void a1(){
        Frame screen = new Frame();
        screen.addWindowListener((WindowClosing)(e)->System.exit(1));
        Button button = new Button("Press me");
        screen.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Welcome to Java By Example","Java Sample",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        screen.setSize(250,400);
        screen.setVisible(true);
    }
    public static void a2(){
        Frame screen = new Frame();
        Button button = new Button("Press me");
        screen.add(button);

        button.addActionListener(e->JOptionPane.showMessageDialog(null,"Info Box: Welcome to Java by Ẽample","Java Sample",JOptionPane.INFORMATION_MESSAGE));
        screen.setSize(250,400);
        screen.setVisible(true);
    }
}
