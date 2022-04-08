package edu.lab07;

import javax.swing.*;
import java.util.Locale;

public class CCubicRoot extends CRoot{
    public CCubicRoot(double number, double precision, boolean log, JTextArea textArea) {
        super(number, precision, log, textArea);
    }

    @Override
    public double calculate() {
        double start = 0;
        double end = number;
        double mid = 0.5*number;
        int step = 0;
        double prec = precision;
        while(number - mid*mid*mid > prec){
            if (number< mid*mid*mid) end = mid;
            else start = mid;
            mid = (start + end)/2;
            step ++;
            if(log)textArea.append(
                    String.format(Locale.US,"- step: %d, value: %.15f\n",++step,mid));
        }
        return mid;
    }
}
