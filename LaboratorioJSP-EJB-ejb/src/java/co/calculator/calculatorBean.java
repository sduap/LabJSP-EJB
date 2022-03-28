package co.calculator;

import javax.ejb.Stateless;

@Stateless
public class calculatorBean implements calculatorBeanLocal {

    @Override
    public Double operar(double a, double b, char operador) {
        switch(operador){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return (b!=0)? a/b : null;
            case '%':
                return a%b;
            case '^':
                return Math.pow(a, b);
            default:
                return null;
        }
    }
}
