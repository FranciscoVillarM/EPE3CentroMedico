package com.mycompany.epe3centromedico;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class Reservas extends JFrame {

    private JTable tablaDatos;
    private DefaultTableModel modeloTabla;

    public Reservas(ArrayList<RegistroMedico> datos) {
        // Configuración básica del JFrame
        setTitle("Datos de Reservación");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        // Crear el modelo de la tabla
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Nombre Medico");
        modeloTabla.addColumn("Nombre Paciente");
        modeloTabla.addColumn("Especialidad");
        modeloTabla.addColumn("Hora");

        // Llenar la tabla con los datos
        for (RegistroMedico registro : datos) {
            modeloTabla.addRow(registro.toArray());
        }

        // Crear la tabla con el modelo
        tablaDatos = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tablaDatos);

        // Añadir la tabla al contenido del JFrame
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        
         // Agregar el botón "Cerrar" al panel
        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener(e -> {
            // Cerrar la ventana actual y mostrar la interfaz inicial (ajusta según tus necesidades)
            dispose();  // Cierra la ventana actual
            JFrame inicial = new JFrame();
            inicial.setVisible(true);
        });

        // Crear un panel para colocar el botón
        JPanel panelBoton = new JPanel();
        panelBoton.add(btnCerrar);

        // Añadir el panel de botón al final del JFrame
        getContentPane().add(panelBoton, BorderLayout.SOUTH);
        // Hacer visible la interfaz
        setVisible(true);
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        ArrayList<RegistroMedico> datos = new ArrayList<>();
        datos.add(new RegistroMedico("Dr. Juan Meza", "Maria Rojas", "Cardiología", "10:00 AM"));
        datos.add(new RegistroMedico("Dr. Juan Meza", "Jose Perez", "Medicina General", "11:30 AM"));

        SwingUtilities.invokeLater(() -> new Reservas(datos));
        
      
      
    }
}

class RegistroMedico {
    private String nombreMedico;
    private String nombrePaciente;
    private String especialidad;
    private String hora;

    public RegistroMedico(String nombreMedico, String nombrePaciente, String especialidad, String hora) {
        this.nombreMedico = nombreMedico;
        this.nombrePaciente = nombrePaciente;
        this.especialidad = especialidad;
        this.hora = hora;
    }

    public Object[] toArray() {
        return new Object[]{nombreMedico, nombrePaciente, especialidad, hora};
    }
}
