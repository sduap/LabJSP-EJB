package co.calculator;

import javax.ejb.Local;

@Local
public interface calculatorBeanLocal {

    Double operar(double a, double b, char operador);
    
}
