package controller;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.util.List;
import java.util.function.Function;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Form<T> extends JPanel {

    private JScrollPane scrollPane;
    private JButton closeButton;
    private DefaultTableModel tableModel;
    private JPanel buttonPanel;

    public Form(List<T> items, String[] columnNames, List<Function<T, Object>> columnFunctions) {
        initComponents();
        mostrarTabla(items, columnNames, columnFunctions);
    }

    private void initComponents() {
        this.setLayout(new BorderLayout());
        buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        closeButton = new JButton("Cerrar");
        closeButton.addActionListener(e -> ocultarTabla());
        buttonPanel.add(closeButton);
        this.add(buttonPanel, BorderLayout.SOUTH);
    }

    public void mostrarTabla(List<T> items, String[] columnNames, List<Function<T, Object>> columnFunctions) {
        // Crear el modelo de la tabla con los datos de los items
        tableModel = new DefaultTableModel(columnNames, 0);
        for (T item : items) {
            Object[] row = new Object[columnFunctions.size()];
            for (int i = 0; i < columnFunctions.size(); i++) {
                row[i] = columnFunctions.get(i).apply(item);
            }
            tableModel.addRow(row);
        }

        // Crear el JTable y añadirlo al JScrollPane
        JTable table = new JTable(tableModel);
        scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);

        // Añadir el JScrollPane al panel
        this.add(scrollPane, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }

    public void ocultarTabla() {
        this.removeAll();
        this.add(buttonPanel, BorderLayout.SOUTH);
        this.revalidate();
        this.repaint();
    }
}