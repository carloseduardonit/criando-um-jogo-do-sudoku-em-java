package sudoku.controler;


public class MENOR extends Quadrado {
    public static final short LINHAS = 3;
    public static final short COLUNAS = 3;
    short[][] tabela = new short[LINHAS][COLUNAS];
     /**
     * Construtor do bloco MENOR.
     *
     * <p>Inicializa todas as posições da matriz com -1,
     * indicando que o bloco começa vazio.</p>
     */
    public MENOR() {
        for (short i = 0; i < LINHAS; i++) {
            for (short j = 0; j < COLUNAS; j++) {
                tabela[i][j] = -1;
            }
        }
    }
     /**
     * Imprime no console o conteúdo do bloco 3x3.
     *
     * <p>Cada linha é exibida entre barras verticais (|),
     * simulando uma grade visual simples no terminal.</p>
     *
     * <pre>
     * Exemplo:
     * | -1 | -1 | -1 |
     * | -1 | -1 | -1 |
     * | -1 | -1 | -1 |
     * </pre>
     */
    public void imprimeTabela() {
        System.out.println("\nInicializando tabela MENOR...");
        for (short i = 0; i < LINHAS; i++) {
            System.out.print("|");
            for (short j = 0; j < COLUNAS; j++) {
                System.out.print(tabela[i][j] + "|");
            }
            System.out.println();
        }
    }
    /**
     * Retorna o valor armazenado na posição especificada do bloco.
     *
     * <p>Se o valor armazenado for negativo (ex.: -1),
     * ele é interpretado como célula vazia e o método retorna 0.</p>
     *
     * @param linha a linha da célula (0 a 2)
     * @param coluna a coluna da célula (0 a 2)
     * @return o valor da célula ou 0 caso esteja vazia
     */
    public short getValor(short linha, short coluna) {
        return tabela[linha][coluna] >= 0 ? tabela[linha][coluna] : 0;
    }
     /**
     * Define um novo valor na posição especificada do bloco.
     *
     * @param linha a linha da célula (0 a 2)
     * @param coluna a coluna da célula (0 a 2)
     * @param valor o valor que será armazenado na célula
     */
    public void setValor(short linha, short coluna, short valor) {
        tabela[linha][coluna] = valor;
    }
    
    public boolean  verificaValorTabela(short valor){
        for(short linha=0; linha<LINHAS; linha++){
            for(short coluna=0; coluna<COLUNAS; coluna++){
                if(tabela[linha][coluna] == valor){
                    valorEstaContido(coluna, linha, valor);
                    return true;
                }
            }
        }
        return false;
    }
    
}