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
       //Lanza la interfaz de usuario
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        //Se crea y configura la ventana de reservación
        frame = new JFrame("Reservación ");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Se crean componentes
        NombrePaciente = new JTextField();
        NombreMedico = new JComboBox<>(new String[]{"Juan Meza", "Pedro Gomez", "Ricardo Araya"});
        Especialidad = new JComboBox<>(new String[]{"Medicina general", "Dermatología", "Oftalmología"});
        Horas = new JComboBox<>(new String[]{"09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00"});
        btnAceptar = new JButton("Aceptar");
        btnCancelar = new JButton("Cancelar");

        //Se crea un panel de cuadricula para organizar los componentes
        JPanel panel = new JPanel(new GridLayout(7, 2));

        // Se agregar componentes y etiquetas al panel
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

        //Agrega el panel a la ventana principal
        frame.add(panel);

        // Configurar acciones de los botones
        btnAceptar.addActionListener(e -> {
            guardarDatos();
            mostrarMensaje();
        });

        //Configurar acciones de los botones
        btnCancelar.addActionListener(e -> frame.dispose());

        frame.setVisible(true);
    }
// Se guardan los datos
    private static void guardarDatos() {
        // Lógica para guardar datos en un arreglo y enviar a la interfaz de reservas
        String nombreMedico = (String) NombreMedico.getSelectedItem();
        String nombrePaciente = NombrePaciente.getText();
        String especialidad = (String) Especialidad.getSelectedItem();
        String horaSeleccionada = (String) Horas.getSelectedItem();
        double valorHora = 7000.0;

   
    }

    private static void mostrarMensaje() {
        JOptionPane.showMessageDialog(null, "Datos guardados exitosamente.");
    }
    
    
}

    


