package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;


public class ToDoListApp extends JFrame {
    private Header header;
    private Body body;
    private Footer footer;

    private JButton newNoteButton;
    private JButton clearButton;

    private int notesCount;


    public ToDoListApp(){
        this.setSize(400,700);
        this.setTitle("ToDoList");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon("img/programIcon.jpg").getImage());
        this.setResizable(false);

        //Initierar in Panelerna Header, Body & Footer
        header = new Header();
        body = new Body();
        footer = new Footer();

        //Lägger in dem i frame
        this.add(header, BorderLayout.NORTH); // fixerar den top
        this.add(body, BorderLayout.CENTER);
        this.add(footer, BorderLayout.SOUTH);

        //Buttons vi använder från Footern
        newNoteButton = footer.getAddNoteButton();
        clearButton = footer.getClearNotesButton();


        // Event Listeners
        AddListeners();

        // Så allt kan synas, måste va längst ner tydligen
        this.setVisible(true);
    }

    public void AddListeners() {

        newNoteButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                notesCount++;
                addNote();
            }
        });

        clearButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clear();
            }
        });

    }

    public void addNote() {
        if(notesCount <= 10) {
            Note note = new Note();
            body.add(note);
            revalidate();
        } else {
            newNoteButton.setEnabled(false);
        }
    }

    public void clear() {
        body.deleteAllNotes();
        revalidate();
        repaint();
        setNotesCount(0);
        newNoteButton.setEnabled(true);
    }

    public void setNotesCount(int notesCount) {
        this.notesCount = notesCount;
    }
}
