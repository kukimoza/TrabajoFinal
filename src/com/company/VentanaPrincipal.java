package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VentanaPrincipal extends JFrame{

    private JLabel etiqueta=new JLabel("Entrada");



    private JTextField campoTexto= new JTextField("Java es Poder!");
    private JButton boton= new JButton("Aceptar");

    public VentanaPrincipal(){
        super("Java es Poder");
        this.setVisible(true);

        this.setBounds(20, 20, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        etiqueta.setBounds(120,150,80, 15);
        campoTexto.setBounds(240,140, 200, 45);
        boton.setBounds(140,250,200, 45);
        boton.addActionListener(new AccionBoton());


        this.add(etiqueta);
        this.add(campoTexto);
        this.add(boton);

    }

    class AccionBoton implements  ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource().equals(boton)){
             WindowBlack ventanaNegra= new WindowBlack();
            }
        }
    }
}

