/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pag;

/**
 *
 * @author lucas
 */
public class calc {
    private double num1;
    private double num2;
    private String operador;

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public void setNum1(double num) {
        this.num1 = num;
    }

    public void setNum2(double num) {
        this.num2 = num;
    }

    public double calcular() {
        switch (operador) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/": return (num2 != 0) ? num1 / num2 : 0;
            default: return 0;
        }
    }
}
           
           
           
           
           
       
  
    
   
    

