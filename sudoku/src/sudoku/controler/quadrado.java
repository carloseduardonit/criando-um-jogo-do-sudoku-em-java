import javax.swing.JOptionPane;

public class Quadrado{
    short linha;
    short coluna;
    short [][] tabela;
    short valor;
    boolean fixo = false;
    public static void main(String[] args) {
        Quadrado quadrado [] = setQuadrado();
        imprimeTabela(quadrado);
        ((MAIOR)quadrado[0]).setValor((short)0, (short)0, (short)5);
        ((MENOR)quadrado[1]).setValor((short)0, (short)0, (short)3);
        imprimeTabela(quadrado);
    }
/**
 * Imprime a tabela dos objetos Quadrado contidos no array fornecido.
 * 
 * <p>Este método percorre todos os elementos do array `quadrado` e imprime
 * a tabela correspondente. O primeiro elemento do array é tratado como
 * um objeto do tipo MAIOR, enquanto os demais elementos são tratados como
 * objetos do tipo MENOR.</p>
 *
 * <p>Exemplo de uso:</p>
 * <pre>
 * Quadrado[] quadros = new Quadrado[3];
 * quadros[0] = new MAIOR();
 * quadros[1] = new MENOR();
 * quadros[2] = new MENOR();
 * imprimeTabela(quadros);
 * </pre>
 *
 * @param quadrado um array de objetos Quadrado, onde o primeiro elemento deve ser do tipo MAIOR
 *                 e os demais do tipo MENOR
 */
    public static void imprimeTabela(Quadrado[] quadrado){
        System.out.println("Imprimindo tabela...");
        for(int i=0; i<quadrado.length; i++){
            if(i==0){
                ((MAIOR)quadrado[i]).imprimeTabela();
            }else{
                ((MENOR)quadrado[i]).imprimeTabela();
            }
        }
    }

    public static  Quadrado [] setQuadrado(){
        Quadrado [] Sudoku  = new Quadrado[10];
        MAIOR maior = new MAIOR();
        MENOR t00 = new MENOR();  MENOR t01 = new MENOR(); MENOR t02 = new MENOR();
        MENOR t10 = new MENOR();  MENOR t11 = new MENOR(); MENOR t12 = new MENOR();
        MENOR t20 = new MENOR();  MENOR t21 = new MENOR(); MENOR t22 = new MENOR();
        Sudoku[0] = maior;
        Sudoku[1] = t00;  Sudoku[2] = t01; Sudoku[3] = t02;
        Sudoku[4] = t10;  Sudoku[5] = t11; Sudoku[6] = t12;
        Sudoku[7] = t20;  Sudoku[8] = t21; Sudoku[9] = t22;
        return Sudoku;
    }

    Quadrado(){
    }
        
    public boolean verificaValor(short valor){
        boolean valido = valor >=1 && valor <=9;
        if(!valido){
            JOptionPane.showMessageDialog(null, "Verificando valor: " + valor + 
            "\nValor inválido! Insira um valor entre 1 e 9.");
        }
        return valido;
    }

    public boolean verificaFixo(){
        return fixo;
    }

    public short getValor(short anterior, short valor){
        if(verificaValor(valor) && !verificaFixo()){
            return valor;
        }
        return anterior;
    }

    
}


