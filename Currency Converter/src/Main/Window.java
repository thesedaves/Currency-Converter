package Main;

import java.awt.*;
import javax.swing.*;

public class Window {
    static void startWindow() {
        JFrame window = new JFrame();
        JPanel panel = new JPanel();

        final int windowHeight = 600;
        final int windowWidth = 350;

        //Window-Properties
        window.setSize(new Dimension(windowWidth, windowHeight));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);  
        window.add(panel);

        final Point windowLocation = window.getLocation();

        panel.setSize(windowWidth, windowHeight);
        panel.setLocation(windowLocation);
        panel.setLayout(new BorderLayout());


        JLabel waehrungsrechner = new JLabel("Währungsrechner", SwingConstants.CENTER);
        panel.add(waehrungsrechner, BorderLayout.NORTH);
        waehrungsrechner.setBorder(BorderFactory.createEmptyBorder(100, 0, 0, 0));
        waehrungsrechner.setFont(new Font("Sans Serif", Font.BOLD, 20));
        waehrungsrechner.setVisible(true);

        JButton currenciesButton = new JButton("Währungen anzeigen");
        JPanel wrapper1 = new JPanel();
        wrapper1.add(currenciesButton);
        wrapper1.setBorder(BorderFactory.createEmptyBorder(45, 0, 0, 0));

        panel.add(wrapper1, BorderLayout.CENTER);
        currenciesButton.setFont(waehrungsrechner.getFont());
        currenciesButton.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JButton converterButton = new JButton("Währungen berechnen");
        JPanel wrapper2 = new JPanel();
        wrapper2.add(converterButton);
        wrapper2.setBorder(BorderFactory.createEmptyBorder(0, 0, 300, 0));

        panel.add(wrapper2, BorderLayout.SOUTH);
        converterButton.setFont(waehrungsrechner.getFont());
        converterButton.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        window.setVisible(true);
    }
}