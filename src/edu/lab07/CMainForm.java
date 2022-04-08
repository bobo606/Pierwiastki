package edu.lab07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CMainForm extends javax.swing.JFrame{
    private JTextField numberTextField;
    private JTextField precisionTextField;
    private JRadioButton p2sRadioButton;
    private JRadioButton p3sRadioButton;
    private JCheckBox logStepsCheckBox;
    private JButton OBLICZButton;
    private JButton saveParamsButton;
    private JButton readParamsButton;
    private JPanel MainPanel;
    private JTextArea textArea1;
    private JButton saveReportButton;

    public CMainForm(String title) throws HeadlessException{
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(MainPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        button1.addActionListener(e->{
            button1Click(){
                double N,E;
                try{
                    N=Double.paraseDouble(
                            numberTextField.getText().replaceAll(",","."));
                    E = Double.parseDouble(
                            precisionTextField.getText().replaceAll(",","."));
                } catch (NumberFormatException ee){
                    JOptionPane.showMessageDialog(this,"Błędna wartość parametru !\nKomunikat: "+ee.getMessage());
                    return;
                }
                
            };
        });
        button2.addActionListener(e->{
            button2Click();
        });

        OBLICZButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                button1Click();
            }
        });
        saveParamsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        readParamsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        saveReportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
