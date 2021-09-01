package unitTests;

import devcalc.Calc;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestaCalc {
    @Test

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
}
