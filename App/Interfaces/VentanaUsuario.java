package Interfaces;

import Dominio.Trabajador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaUsuario {
    private JPanel mainPanel;
    private JButton cancelarButton;
    private JTextField nombreField;
    private JTextField apellidoField;
    private JTextField rutField;
    private JButton guardarButton;
    private Trabajador trabajador;

    public VentanaUsuario(Trabajador trabajador) {
        setUp();
        this.trabajador = trabajador;
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarDatosTrabajador();
            }
        });
    }

    public JPanel setUp() {
        JFrame frame = new JFrame("Ventana Usuario");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        return mainPanel;
    }

    private void actualizarDatosTrabajador() {
        trabajador.setNombre(nombreField.getText());
        trabajador.setApellido(apellidoField.getText());
        trabajador.setRut(rutField.getText());
        JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
    }
}