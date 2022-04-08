package edu.lab07;

import javax.swing.*;

public abstract class CRoot {

    protected double  number;
    protected double precision;
    protected boolean log;
    protected JTextArea textArea;

    public CRoot(double number, double precision, boolean log, JTextArea textArea) {
        this.number = number;
        this.precision = precision;
        this.log = textArea != null;
        this.textArea = textArea;
    }

    public abstract double calculate();
}
