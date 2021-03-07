package org.jesperancinha.java11.interfaces;

public class InterfacesRunner {
    public static void main(String[] args) {
        System.out.println("(((((((((( The point is these variables are static, public and final ))))))))))");

        // Cannot assign a value to final variable 'variableA'
        // InterfaceVariableHolder.variableA = 21;
        System.out.println(InterfaceVariableHolder.variableA);
        System.out.println(InterfaceVariableHolder.variableB);
        System.out.println(InterfaceVariableHolder.variableC);
        System.out.println(InterfaceVariableHolder.variableD);
        System.out.println(InterfaceVariableHolder.variableE);
        System.out.println(InterfaceVariableHolder.variableF);
        System.out.println(InterfaceVariableHolder.variableG);
        System.out.println(InterfaceVariableHolder.variableH);
    }
}
