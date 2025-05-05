/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author felix
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BotonBlancoYNegro extends JButton {
    private boolean modoOscuro = false; // Guarda el estado actual

    public BotonBlancoYNegro() {
        super("Modo Oscuro / Claro");
        this.setBackground(Color.DARK_GRAY);
        this.setForeground(Color.WHITE);

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(BotonBlancoYNegro.this);
                if (frame != null) {
                    if (!modoOscuro) {
                        cambiarAModoOscuro(frame.getContentPane());
                    } else {
                        cambiarAModoClaro(frame.getContentPane());
                    }
                    modoOscuro = !modoOscuro;
                    frame.repaint();
                    frame.revalidate();
                }
            }
        });
    }
    private void cambiarAModoClaro(Container contenedor){
        contenedor.setBackground(null);

        for (Component comp : contenedor.getComponents()) {
            if (comp instanceof Container) cambiarAModoClaro((Container) comp);

            if (comp instanceof JLabel || comp instanceof JCheckBox || comp instanceof JRadioButton) {
                comp.setForeground(Color.BLACK);
            }
            if (comp instanceof JButton) {
                comp.setBackground(null);
                comp.setForeground(Color.BLACK);
            }
            if (comp instanceof JTextField textField) {
                textField.setBackground(Color.WHITE);
                textField.setForeground(Color.BLACK);
                textField.setCaretColor(Color.BLACK);
            } else if (comp instanceof JTextArea textArea) {
                textArea.setBackground(Color.WHITE);
                textArea.setForeground(Color.BLACK);
                textArea.setCaretColor(Color.BLACK);
            }
            if (comp instanceof JComboBox) {
                comp.setBackground(Color.WHITE);
                comp.setForeground(Color.BLACK);
            }
            if (comp instanceof JTable tabla) {
                tabla.setBackground(Color.WHITE);
                tabla.setForeground(Color.BLACK);
                tabla.setSelectionBackground(new Color(200, 200, 255));
                tabla.setSelectionForeground(Color.BLACK);
                tabla.getTableHeader().setBackground(UIManager.getColor("TableHeader.background"));
                tabla.getTableHeader().setForeground(Color.BLACK);
            }
            if (comp instanceof JTabbedPane) {
                comp.setBackground(null);
                comp.setForeground(Color.BLACK);
            }
        }
    }

    private void cambiarAModoOscuro(Container contenedor) {
        contenedor.setBackground(new Color(40, 40, 40));

        for (Component comp : contenedor.getComponents()) {
            if (comp instanceof Container) cambiarAModoOscuro((Container) comp);

            if (comp instanceof JLabel || comp instanceof JCheckBox || comp instanceof JRadioButton) {
                comp.setForeground(Color.LIGHT_GRAY);
            }
            if (comp instanceof JButton) {
                comp.setBackground(new Color(60, 60, 60));
                comp.setForeground(Color.WHITE);
            }
            if (comp instanceof JTextField textField) {
                textField.setBackground(new Color(70, 70, 70));
                textField.setForeground(Color.WHITE);
                textField.setCaretColor(Color.WHITE);
            } else if (comp instanceof JTextArea textArea) {
                textArea.setBackground(new Color(70, 70, 70));
                textArea.setForeground(Color.WHITE);
                textArea.setCaretColor(Color.WHITE);
            if (comp instanceof JComboBox) {
                comp.setBackground(new Color(70, 70, 70));
                comp.setForeground(Color.WHITE);
            }
            if (comp instanceof JTable tabla) {
                tabla.setBackground(new Color(60, 60, 60));
                tabla.setForeground(Color.WHITE);
                tabla.setSelectionBackground(new Color(100, 100, 100));
                tabla.setSelectionForeground(Color.WHITE);
                tabla.getTableHeader().setBackground(new Color(70, 70, 70));
                tabla.getTableHeader().setForeground(Color.WHITE);
            }
            if (comp instanceof JTabbedPane) {
                comp.setBackground(new Color(50, 50, 50));
                comp.setForeground(Color.LIGHT_GRAY);
            }
        }
    }

    }
 }
