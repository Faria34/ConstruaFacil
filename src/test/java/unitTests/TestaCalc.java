package unitTests;

import devcalc.Calc;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestaCalc {

    @Test (priority = 1)

    public void  testarSomarDoisNumeros(){
        // 1- Prepara - Configurar - Given
        int nun1 = 5;
        int nun2 = 7;
        int resultadoEsperado = 12;

        // 2- Executar - When
        int resultadoAtual = Calc.somarDoisNumeros(nun1, nun2);

        // 3- Validar - Then
        System.out.println("O resultado esperado é " + resultadoEsperado + "\n o resultado atual foi " + resultadoAtual);
        assertEquals(resultadoEsperado, resultadoAtual);


    }

    @Test (priority = 2)

    public void testarSubtrairDoisNumeros(){

        int nun1 = 6;
        int nun2 = 2;
        int resultadoEsperado = 4;


        int resultadoAtual = Calc.subtrairDoisNumeros(nun1, nun2);

        // 3- Validar - Then
        System.out.println("O resultado esperado é " + resultadoEsperado + "\n o resultado atual foi " + resultadoAtual);
        assertEquals(resultadoEsperado, resultadoAtual);


    }

    @Test (priority = 3)

    public void testarMultiplicarDoisNumeros(){

        int nun1 = 4;
        int nun2 = 4;
        int resultadoEsperado = 16;


        int resultadoAtual = Calc.multiplicarDoisNumeros(nun1, nun2);

        // 3- Validar - Then
        System.out.println("O resultado esperado é " + resultadoEsperado + "\n o resultado atual foi " + resultadoAtual);
        assertEquals(resultadoEsperado, resultadoAtual);


    }

    @Test (priority = 4)

    public void testarDividirDoisNumeros(){

        int nun1 = 20;
        int nun2 = 2;
        int resultadoEsperado = 10;


        int resultadoAtual = Calc.dividirDoisNumeros(nun1, nun2);

        // 3- Validar - Then
        System.out.println("O resultado esperado é " + resultadoEsperado + "\n o resultado atual foi " + resultadoAtual);
        assertEquals(resultadoEsperado, resultadoAtual);


    }

    @Test (priority = 5)

    public void testarDividirPorZero(){

        int nun1 = 6;
        int nun2 = 0;
        int resultadoEsperado = 0 ;


        int resultadoAtual = Calc.dividirDoisNumeros(nun1, nun2);

        // 3- Validar - Then
        System.out.println("O resultado esperado é " + resultadoEsperado + "\n o resultado atual foi " + resultadoAtual);
        assertEquals(resultadoEsperado, resultadoAtual);


    }
}
