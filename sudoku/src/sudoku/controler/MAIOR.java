public class MAIOR extends Quadrado{
    public static final short LINHAS = 9;
    public static final short COLUNAS = 9;
    short [][] tabela;
    public MAIOR(){
            // incializa a tabela com valores -1
        super();
        tabela = new short [LINHAS][COLUNAS];
        for(short i=0; i<LINHAS; i++){
            for(short j=0; j<COLUNAS; j++){
                tabela[i][j] = -1;
            }
        }
    }
        
    public short getValorTabela(short linha, short coluna){
        return  tabela[linha][coluna] >= 0 ? tabela[linha][coluna] : 0;
    }   

    public void setValor(short linha, short coluna, short valor){
        this.tabela[linha][coluna] =  valor;
    }
    /**
     * Imprime a tabela do objeto MAIOR (Sudoku 9x9) no console.
     * 
     * <p>O método percorre todas as linhas e colunas do array `tabela` (9x9)
     * e imprime os valores formatados com barras verticais (|) para simular
     * uma tabela no console.</p>
     *
     * <p>Exemplo de saída:</p>
     * <pre>
     * |5|3|0|0|7|0|0|0|0|
     * |6|0|0|1|9|5|0|0|0|
     * |0|9|8|0|0|0|0|6|0|
     * ...
     * </pre>
     */
    public void imprimeTabela(){
        System.out.println("\nInicializando tabela MAIOR (9x9)...");
        for(short i=0; i<LINHAS; i++){
            System.out.print("|");
            for(short j=0; j<COLUNAS; j++){
                System.out.print(tabela[i][j] + "|");
            }
            System.out.println();
        }
    }

   
}