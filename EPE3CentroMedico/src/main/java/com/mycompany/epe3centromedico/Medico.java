package com.mycompany.epe3centromedico;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Medico {

    private static JFrame frame;
    private static JTextField NombrePaciente;
    private static JComboBox<String> NombreMedico;
    private static JComboBox<String> Especialidad;
    private static JComboBox<String> Horas;
    private static JButton btnAceptar;
    private static JButton btnCancelar;

   
    public Medico() {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        frame = new JFrame("Reservación ");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Crear componentes
        NombrePaciente = new JTextField();
        NombreMedico = new JComboBox<>(new String[]{"Juan Meza", "Pedro Gomez", "Ricardo Araya"});
        Especialidad = new JComboBox<>(new String[]{"Medicina general", "Dermatología", "Oftalmología"});
        Horas = new JComboBox<>(new String[]{"09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00"});
        btnAceptar = new JButton("Aceptar");
        btnCancelar = new JButton("Cancelar");

        JPanel panel = new JPanel(new GridLayout(7, 2));

        // Agregar componentes al panel
        panel.add(new JLabel("Nombre del Médico:"));
        panel.add(NombreMedico);

        panel.add(new JLabel("Nombre del Paciente:"));
        panel.add(NombrePaciente);

        panel.add(new JLabel("Especialidad:"));
        panel.add(Especialidad);

        panel.add(new JLabel("Horas Disponibles:"));
        panel.add(Horas);

        panel.add(new JLabel("Valor de Hora: $7,000"));

        panel.add(new JLabel(""));
        panel.add(new JLabel(""));

        panel.add(btnAceptar);
        panel.add(btnCancelar);

        frame.add(panel);

        // Configurar eventos de los botones
        btnAceptar.addActionListener(e -> {
            guardarDatos();
            mostrarMensaje();
        });

        btnCancelar.addActionListener(e -> frame.dispose());

        frame.setVisible(true);
    }

    private static void guardarDatos() {
        // Lógica para guardar datos en un arreglo y enviar a la interfaz de reservas
        String nombreMedico = (String) NombreMedico.getSelectedItem();
        String nombrePaciente = NombrePaciente.getText();
        String especialidad = (String) Especialidad.getSelectedItem();
        String horaSeleccionada = (String) Horas.getSelectedItem();
        double valorHora = 7000.0;

        // Aquí deberías guardar estos datos en un arreglo o en una estructura de datos más adecuada
        // y enviarlos a la interfaz de reservas
    }

    private static void mostrarMensaje() {
        JOptionPane.showMessageDialog(null, "Datos guardados exitosamente.");
    }
    
    
}

    


