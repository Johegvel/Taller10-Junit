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
    @DisplayName("Resolver suma con números de dos dígitos")
    public void testSolveSumaDosDígitos() {
        System.out.println("Solve - Suma dos dígitos");
        String formula = "25+37";
        String expResult = "25+37=62";
        String result = Operations.Solve(formula);
        assertEquals(expResult, result);
        System.out.println("Resultado obtenido: " + result);
    }
    
    @Test
    @DisplayName("Resolver resta con números de dos dígitos")
    public void testSolveRestaDosDígitos() {
        System.out.println("Solve - Resta dos dígitos" );
        String formula = "85-23";
        String expResult = "85-23=62";
        String result = Operations.Solve(formula);
        System.out.println("Resultado obtenido: " + result);
        assertEquals(expResult, result);
    }
    
     @Test
    @DisplayName("Resolver multiplicación con números de dos dígitos")
    public void testSolveMultiplicacionDosDígitos() {
        System.out.println("Solve - Multiplicación dos dígitos");
        String formula = "12*8";
        String expResult = "12*8=96";
        String result = Operations.Solve(formula);
        System.out.println("Resultado obtenido: " + result);
        assertEquals(expResult, result);
    }
    
    @Test
    @DisplayName("Resolver división con números de dos dígitos")
    public void testSolveDivisionDosDígitos() {
        System.out.println("Solve - División dos dígitos");
        String formula = "84/12";
        String expResult = "84/12=7";
        String result = Operations.Solve(formula);
        System.out.println("Resultado obtenido: " + result);
        assertEquals(expResult, result);
    }
    
    @Test 
    @DisplayName("Resolver operación con precedencia usando números de dos dígitos")
    public void testSolvePrecedenciaDosDígitos() {
        System.out.println("Solve - Precedencia dos dígitos");
        String formula = "20+15*2";
        String expResult = "20+15*2=50";
        String result = Operations.Solve(formula);
        System.out.println("Resultado obtenido: " + result);
        assertEquals(expResult, result);
    }
    @Test
     @DisplayName("Resolver suma con números grandes del rango")
    public void testSolveSumaGrandes() {
        System.out.println("Solve - Suma números grandes");
        String formula = "99+88";
        String expResult = "99+88=187";
        String result = Operations.Solve(formula);
        System.out.println("Resultado obtenido: " + result);
        assertEquals(expResult, result);
    }
    @Test
    @DisplayName("Resolver resta que da resultado negativo")
    public void testSolveRestaNegativa() {
        System.out.println("Solve - Resta resultado negativo");
        String formula = "30-45";
        String expResult = "30-45=-15";
        String result = Operations.Solve(formula);
        System.out.println("Resultado obtenido: " + result);
        assertEquals(expResult, result);
    }
    
    @Test
    @DisplayName("Resolver división exacta con números de dos dígitos")
    public void testSolveDivisionExacta() {
        System.out.println("Solve - División exacta dos dígitos");
        String formula = "96/24";
        String expResult = "96/24=4";
        String result = Operations.Solve(formula);
        System.out.println("Resultado obtenido: " + result);
        assertEquals(expResult, result);
    }
    
    @Test
    @DisplayName("Resolver multiplicación con resultado grande")
    public void testSolveMultiplicacionGrande() {
        System.out.println("Solve - Multiplicación resultado grande");
        String formula = "25*4";
        String expResult = "25*4=100";
        String result = Operations.Solve(formula);
        System.out.println("Resultado obtenido: " + result);
        assertEquals(expResult, result);
    }
    
    @Test
    @DisplayName("Prueba el metodo MakeFormula para salida correcta")
    public void testMakeFormula1(){
        String result = Operations.MakeFormula();
        assertTrue(result.matches("\\d+(\\+|\\-|\\*|/)\\d+((\\+|\\-|\\*|/)\\d+)*"),"La formula no es valida");
    }
    
    @Test
    @DisplayName("prueba con suma combinada")
    public void testSolve05() {
        System.out.println("Solve");
        String formula = "10+15*10";
        String expResult = "10+15*10=160";
        String result = Operations.Solve(formula);
        assertEquals(expResult, result);
    }

    @Test
    @DisplayName("Prueba con resta combinada")
    public void testSolve06() {
        System.out.println("Solve");
        String formula = "10-13+45/30";
        String expResult = "10-13+45/30=-2";
        String result = Operations.Solve(formula);
        assertEquals(expResult, result);
    }

    @Test
    @DisplayName("Prueba con multiplicacion combinada")
    public void testSolve07() {
        System.out.println("Solve");
        String formula = "10*13*45/30";
        String expResult = "10*13*45/30=195";
        String result = Operations.Solve(formula);
        assertEquals(expResult, result);
    }

    @Test
    @DisplayName("Prueba con division combinada")
    public void testSolve068() {
        System.out.println("Solve");
        String formula = "15/12+20/27";
        String expResult = "15/12+20/27=1";
        String result = Operations.Solve(formula);
        assertEquals(expResult, result);
    }

    
}    