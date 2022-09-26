package gui;

import javax.swing.*;
import java.awt.*;

class Footer extends JPanel {
    private JButton addNoteButton;
    private JButton clearNotesButton;

    public Footer() {
        this.setPreferredSize(new Dimension(400,80));
        this.setBackground(Color.decode("#D2DAFF"));

        // Buttons
        addNoteButton = new JButton("New Task");
        addNoteButton.setFocusable(false);
        addNoteButton.setFont(new Font("Sans-serif", Font.BOLD, 20));
        this.add(addNoteButton);

        // Gap between buttons
        this.add(Box.createHorizontalStrut(20));

        clearNotesButton = new JButton("Clear Notes");
        clearNotesButton.setFocusable(false);
        clearNotesButton.setFont(new Font("Sans-serif", Font.BOLD, 20));
        this.add(clearNotesButton);
    }

    // Button Getters
    public JButton getAddNoteButton() {
        return addNoteButton;
    }

    public JButton getClearNotesButton() {
        return clearNotesButton;
    }
}
