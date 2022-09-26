package gui;

import javax.swing.*;
import java.awt.*;

class Header extends JPanel {

    public Header() {
        this.setPreferredSize(new Dimension(400, 80));
        this.setBackground(Color.decode("#AAC4FF"));

        //Label (Titel) + en Icon
        ImageIcon icon = new ImageIcon("img/titleIcon.png");

        JLabel title = new JLabel("ToDoList");
        JLabel imgLabel = new JLabel(icon);
        title.setFont(new Font("Sans-serif", Font.BOLD, 20));

        // Lägger in dem i Panel
        this.add(Box.createVerticalStrut(60)); // Margin top
        this.add(title);
        this.add(Box.createHorizontalStrut(10)); // Space-between
        this.add(imgLabel);
    }
}
