package cz.czechitas.lekce12;
import javax.swing.*;
import java.awt.*;

    public class Application extends JFrame {
        public static void main(String[] args) {
            new Application().setVisible(true);
        }

        public Application() throws HeadlessException {
            super("Moje aplikace 1.0");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(400, 300);
            setLocationRelativeTo(null);
        }
    }
