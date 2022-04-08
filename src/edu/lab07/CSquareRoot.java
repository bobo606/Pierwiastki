package edu.lab07;

import javax.swing.*;
import java.util.Locale;

public class CSquareRoot extends CRoot{


    public CSquareRoot(double number, double precision, boolean log, JTextArea textArea) {
        super(number, precision, log, textArea);
    }

    @Override
    public double calculate(){

        double x =0.5 *number;
        double y = 1.0;
        int step = 0;
        while(Math.abs(x-y) > precision){
        x=0.5 *(x+y);
        y=number/x;
        if(log)textArea.append(
                String.format(Locale.US,"- step: %d, value: %.15f\n",++step,x));
    }
    return x;
    }
}

