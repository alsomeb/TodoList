package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


class Note extends JPanel {
    private JTextField note;
    private JButton doneButton;


    public Note() {
        this.setBackground(Color.decode("#8FE3CF"));
        this.setPreferredSize(new Dimension(40, 20));
        this.setLayout(new BorderLayout());

        // Varje Note har detta
        note = new JTextField("  Note");
        note.setPreferredSize(new Dimension(300, 20));
        this.add(note, BorderLayout.CENTER);

        doneButton = new JButton("Done");
        doneButton.setPreferredSize(new Dimension(100,20));
        doneButton.setFocusable(false);
        this.add(doneButton, BorderLayout.EAST);

        addListener();

    }

    private void addListener() {
        doneButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                removeComp();
                generateDoneLabel();
                repaint();
                revalidate();
            }
        });
    }


    public JButton getDoneButton() {
        return doneButton;
    }


    // Metoder används i Listener ovan
    private void removeComp() {
        remove(note);
        remove(doneButton);
    }

    private void generateDoneLabel() {
        JLabel doneText = new JLabel("    Done!");
        doneText.setFont(new Font("Sans-serif", Font.BOLD, 20));
        add(doneText);
    }
}
