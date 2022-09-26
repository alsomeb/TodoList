package gui;

import javax.swing.*;
import java.awt.*;


class Body extends JPanel {
    public Body() {
        GridLayout gridLayout = new GridLayout(10, 1);
        gridLayout.setVgap(10); // space mellan cols
        this.setLayout(gridLayout); // VI vill ha gridlayout för denna container
        this.setBackground(Color.decode("#D2DAFF"));

    }

    public void deleteAllNotes() {
        this.removeAll();
    }


}
