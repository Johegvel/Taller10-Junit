/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculatorSMP;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author CltControl
 */
public class OperationsTest {
    
    @Test
    @DisplayName("Prueba el metodo MakeFormula para salida nula")
    public void testMakeFormula() {
        System.out.println("MakeFormula");
        String expResult = "";
        String result = Operations.MakeFormula();
        assertNotEquals(expResult, result);
    }
    
    @Test
    @DisplayName("Prueba el metodo MakeFormula para salida correcta")
    public void testMakeFormula1(){
        String result = Operations.MakeFormula();
        assertTrue(result.matches("\\d+(\\+|\\-|\\*|/)\\d+((\\+|\\-|\\*|/)\\d+)*"),"La formula no es valida");
    }
    
    

    
}    