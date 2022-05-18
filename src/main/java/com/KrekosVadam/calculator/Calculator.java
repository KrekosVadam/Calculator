/**
 * Main class for Calculator
 * @author jadonkrekos
 */

package com.KrekosVadam.calculator;

import javax.swing.*;

public class Calculator {
    
    private static int WINDOW_HEIGHT = 600;
    private static int WINDOW_LENGTH = 400;
   
    JFrame Window;
    JButton Cnl, Sn, Pct, Div, Mul, 
            Sub, Add, eq, point, b0, b1, b2, 
            b3, b4, b5, b6, b7, b8, b9;
    
    public Calculator() {
    
    }   
    
    
    public static void main(String[] args) {
        new Calculator();
    }
}
