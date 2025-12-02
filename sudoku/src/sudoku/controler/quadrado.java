package sudoku.controler;

import javax.swing.JOptionPane;

public class Quadrado {
    short linha;
    short coluna;
    short[][] tabela;
    short valor;
    boolean fixo = false;

    public static void main(String[] args) {
        Quadrado quadrado[] = setQuadrado();
        imprimeTabela(quadrado);
        MAIOR maior = (MAIOR) quadrado[0];
        maior.setValor((short) 0, (short) 0, (short) 5);
        ((MENOR) quadrado[1]).setValor((short) 0, (short) 0, (short) 5);
        boolean boolelinhamaior = maior.verificaValorLinha((short)0, (short)5);
        boolean boolecolunamaior = maior.verificaValorColuna((short)0, (short)5);
        boolean boolemenor = ((MENOR) quadrado[1]).verificaValorTabela((short)5);
        System.out.println("Valor 5 na linha 0 do MAIOR: "+ boolelinhamaior);
        System.out.println("Valor 5 na coluna 0 do MAIOR: "+ boolecolunamaior);
        System.out.println("Valor 5 no MENOR: "+ boolemenor);
        

    }

    /**
     * Imprime a tabela dos objetos Quadrado contidos no array fornecido.
     * 
     * <p>
     * Este método percorre todos os elementos do array `quadrado` e imprime
     * a tabela correspondente. O primeiro elemento do array é tratado como
     * um objeto do tipo MAIOR, enquanto os demais elementos são tratados como
     * objetos do tipo MENOR.
     * </p>
     *
     * <p>
     * Exemplo de uso:
     * </p>
     * 
     * <pre>
     * Quadrado[] quadros = new Quadrado[3];
     * quadros[0] = new MAIOR();
     * quadros[1] = new MENOR();
     * quadros[2] = new MENOR();
     * imprimeTabela(quadros);
     * </pre>
     *
     * @param quadrado um array de objetos Quadrado, onde o primeiro elemento deve
     *                 ser do tipo MAIOR
     *                 e os demais do tipo MENOR
     */
    public static void imprimeTabela(Quadrado[] quadrado) {
        System.out.println("Imprimindo tabela...");
        for (int i = 0; i < quadrado.length; i++) {
            if (i == 0) {
                ((MAIOR) quadrado[i]).imprimeTabela();
            } else {
                ((MENOR) quadrado[i]).imprimeTabela();
            }
        }
    }

    /**
     * Cria e inicializa o array de Quadrados que compõem o tabuleiro de Sudoku.
     *
     * <p>
     * O tabuleiro completo é representado por um array de 10 elementos:
     * o primeiro elemento (índice 0) é um objeto do tipo {@code MAIOR},
     * responsável pelo tabuleiro 9x9 completo.
     * </p>
     *
     * <p>
     * Os demais nove elementos (índices 1 a 9) são objetos do tipo {@code MENOR},
     * representando os nove subquadrantes 3x3 do Sudoku:
     * </p>
     *
     * <pre>
     * Índices no array:
     *   1  2  3
     *   4  5  6
     *   7  8  9
     * </pre>
     *
     * <p>
     * Este método inicializa todos os objetos e retorna o array preenchido,
     * facilitando a criação estrutural do jogo.
     * </p>
     *
     * @return um array de {@code Quadrado} contendo 1 tabuleiro MAIOR (9x9)
     *         e 9 subquadrantes MENOR (3x3)
     */
    public static Quadrado[] setQuadrado() {
        Quadrado[] Sudoku = new Quadrado[10];
        MAIOR maior = new MAIOR();
        MENOR t00 = new MENOR();
        MENOR t01 = new MENOR();
        MENOR t02 = new MENOR();
        MENOR t10 = new MENOR();
        MENOR t11 = new MENOR();
        MENOR t12 = new MENOR();
        MENOR t20 = new MENOR();
        MENOR t21 = new MENOR();
        MENOR t22 = new MENOR();
        Sudoku[0] = maior;
        Sudoku[1] = t00;
        Sudoku[2] = t01;
        Sudoku[3] = t02;
        Sudoku[4] = t10;
        Sudoku[5] = t11;
        Sudoku[6] = t12;
        Sudoku[7] = t20;
        Sudoku[8] = t21;
        Sudoku[9] = t22;
        return Sudoku;
    }

    Quadrado() {
    }

    /**
     * Verifica se o valor informado está dentro do intervalo válido para o Sudoku
     * (1 a 9).
     *
     * <p>
     * Se o valor estiver fora do intervalo permitido, uma mensagem será exibida ao
     * usuário
     * indicando se o número é menor que 1 ou maior que 9.
     * </p>
     *
     * <p>
     * Este método também retorna um valor booleano indicando se a entrada é válida,
     * permitindo que o código chamador decida como proceder.
     * </p>
     *
     * @param valor o número fornecido pelo usuário
     * @return {@code true} se o valor estiver entre 1 e 9 (inclusive),
     *         {@code false} caso contrário
     */

    public boolean verificaValor(short valor) {
        boolean valido = valor >= 1 && valor <= 9;
        if (!valido) {
            String msg = valor > 9 ? " e  maior do permitido" : " e menor do permitido";
            JOptionPane.showMessageDialog(null, "Verificando valor: " + valor + msg +
                    "\nValor inválido! Insira um valor entre 1 e 9.");
        }
        return valido;
    }

    public boolean verificaFixo() {
        return fixo;
    }

    /**
     * Retorna o novo valor para a célula, caso a validação seja aprovada.
     *
     * <p>
     * O método verifica duas condições:
     * </p>
     * <ul>
     * <li>Se o valor informado é válido (entre 1 e 9).</li>
     * <li>Se a célula não é fixa (não pode ser alterada).</li>
     * </ul>
     *
     * <p>
     * Se ambas as condições forem verdadeiras, o novo valor é retornado.
     * Caso contrário, o valor anterior é mantido.
     * </p>
     *
     * @param anterior o valor atual da célula
     * @param valor    o novo valor que se deseja atribuir
     * @return o valor atualizado caso seja permitido, ou o valor anterior caso
     *         contrário
     */

    public short getValor(short anterior, short valor) {
        boolean valorValido = verificaValor(valor), podeAlterar = !verificaFixo();

        if (valorValido && podeAlterar) {
            return valor;
        }
        return anterior;
    }
/**
 * Exibe uma mensagem informando que o valor já está presente
 * na posição especificada da tabela (linha e coluna).
 *
 * <p>Este método é usado quando uma tentativa de inserção
 * viola as regras do Sudoku, indicando duplicidade
 * na linha ou coluna.</p>
 *
 * @param coluna a coluna onde o valor já existe
 * @param linha a linha onde o valor já existe
 * @param valor o valor duplicado
 */

    public void valorEstaContido(short coluna, short linha, short valor) {
        JOptionPane.showMessageDialog(null, "Valor "+valor+" já existe na coluna "+coluna +" da linha "+linha);
    }
}
