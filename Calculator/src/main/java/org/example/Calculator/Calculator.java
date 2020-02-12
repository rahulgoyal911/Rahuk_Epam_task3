package org.example.Calculator;

import org.example.Operations.Operations;

public class Calculator extends Exception{
    private float firstNumber, secondNumber;
    private char operation;
    private Operations opr;

    public Calculator(float fnumber, char operate, float snumber)
    {
        operation = operate;
        firstNumber = fnumber;
        secondNumber = snumber;

        opr = new Operations();
    }

    public float displayResult()
    {
        if(operation == '+')
            return opr.addition(firstNumber,secondNumber);
        else if(operation == '-')
            return opr.subtraction(firstNumber,secondNumber);
        else if(operation == '/')
            return opr.division(firstNumber,secondNumber);
        else if(operation == '*')
            return opr.multiplication(firstNumber,secondNumber);
        else if(operation == '%')
            return opr.remainder(firstNumber,secondNumber);
        else
            throw new ArithmeticException();
    }
}
