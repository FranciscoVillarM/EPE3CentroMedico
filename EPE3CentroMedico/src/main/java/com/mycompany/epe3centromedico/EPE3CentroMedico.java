package com.mycompany.epe3centromedico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EPE3CentroMedico {

    public static void main(String[] args) {
         // Lanza interfaz de usuario
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        // Se crea y configura la ventana principal
        JFrame frame = new JFrame("Centro Medico");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        //Se crean los botones
        JButton btnMedico = new JButton("Médico");
        JButton btnReservas = new JButton("Reservas");
        JButton btnCerrar = new JButton("Cerrar");

        // Creacion y configuracion del panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(btnMedico);
        panel.add(btnReservas);
        panel.add(btnCerrar);

        // Se agrega el panel a la ventana principal
        frame.add(panel);

        // Configurar accion para los botones
        btnCerrar.addActionListener(e -> System.exit(0));
        btnMedico.addActionListener(e -> abrirMedico());
        btnReservas.addActionListener(e -> abrirReservas());

         // Hacer visible la ventana principal
        frame.setVisible(true);
    }

    private static void abrirMedico() {
        // Lógica para abrir la interfaz del médico
        Medico.main(new String[]{});
    }

    private static void abrirReservas() {
        // Lógica para abrir la interfaz de reservas
        Reservas.main(new String[]{});
    }
}
