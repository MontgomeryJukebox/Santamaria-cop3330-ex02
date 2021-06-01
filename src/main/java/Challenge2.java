import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
Minimal functioning prototype. Does not check every case
(for example, try highlighting an amount of text and deleting it.
Or backspacing in an empty text field.
There are fixes that do not follow the challenge restrictions, see below.
 */
public class Challenge2 {

    static int num_characters = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercise 2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(800, 500));

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JTextField output = new JTextField();
        output.setEditable(false);
        output.setBounds(10, 100, 220, 30);

        JTextField input = new JTextField();
        input.setBounds(10, 10, 220, 30);
        input.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {

            }

            /*
            We only increment when a key is released,
            so that we don't overcount if we get multiple
            keyPressed() interrupts.
             */
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    num_characters--;
                /*
                There are more cases to handle here, but this works for simple input.
                A better way to handle this instead of using an external character counter
                is simply to do
                setText(getText() + " has " + getText().length() + " characters.);
                 */
                } else {
                    num_characters++;
                }
                output.setText(input.getText() + " has " +  num_characters + " characters.");
            }

            @Override
            public void keyTyped(KeyEvent e) {

            }
        });

        panel.add(input);
        panel.add(output);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
