package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class WindowBlack extends JFrame {
    private JPanel panel=new JPanel();
    private JLabel etiqueta= new JLabel( "<html><body>Java es <br> Poder! </body></html>" );
    private WindowBlack estaVentana= this;

    public WindowBlack(){

        super("Java es Poder Negro");
        this.setBounds(50, 40, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);

        panel.setBounds(0, 0, 500, 500);
        panel.setBackground(Color.black);
        panel.setLayout(null);
        panel.addMouseListener(new ActionMouse());

        etiqueta.setBounds(65, 50, 400, 300);
       /* etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.BLUE);*/
        etiqueta.setForeground(Color.WHITE);
        etiqueta.setFont(new Font("Arial", Font.ITALIC,100));


        panel.add(etiqueta);
        this.add(panel);


    }

    private class ActionMouse implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            estaVentana.dispose();

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}
