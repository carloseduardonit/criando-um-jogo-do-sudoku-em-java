package sudoku.controler;

public class MAIOR extends Quadrado {
    public static final short LINHAS = 9;
    public static final short COLUNAS = 9;
    short[][] tabela;

    /**
     * Constrói o tabuleiro MAIOR do Sudoku (9x9).
     *
     * <p>
     * Este construtor inicializa a matriz principal do Sudoku com dimensões
     * definidas pelas constantes {@code LINHAS} e {@code COLUNAS}. Todas as
     * posições são preenchidas com o valor -1, indicando que a célula está vazia.
     * </p>
     */
    public MAIOR() {
        super();
        tabela = new short[LINHAS][COLUNAS];
        for (short i = 0; i < LINHAS; i++) {
            for (short j = 0; j < COLUNAS; j++) {
                tabela[i][j] = -1;
            }
        }
    }

    /**
     * Retorna o valor armazenado no tabuleiro MAIOR na posição informada.
     *
     * <p>
     * Se o valor for negativo (ex.: -1), isso indica que a célula está vazia
     * e o método retorna 0 para representar "sem valor".
     * </p>
     *
     * @param linha  a linha da célula (0 a 8)
     * @param coluna a coluna da célula (0 a 8)
     * @return o valor armazenado ou 0 caso a célula esteja vazia
     */

    public short getValorTabela(short linha, short coluna) {
        return tabela[linha][coluna] >= 0 ? tabela[linha][coluna] : 0;
    }

    /**
     * Define um valor na posição especificada do tabuleiro MAIOR.
     *
     * <p>
     * Não há validações internas neste método. Recomenda-se que a chamada
     * para este método seja precedida de verificações de regras do Sudoku,
     * como ausência do número na linha, coluna e bloco.
     * </p>
     *
     * @param linha  a linha onde o valor será inserido (0 a 8)
     * @param coluna a coluna onde o valor será inserido (0 a 8)
     * @param valor  o valor que será atribuído (1 a 9 geralmente)
     */
    public void setValor(short linha, short coluna, short valor) {
        this.tabela[linha][coluna] = valor;
    }

    /**
     * Imprime a tabela do objeto MAIOR (Sudoku 9x9) no console.
     * 
     * <p>
     * O método percorre todas as linhas e colunas do array `tabela` (9x9)
     * e imprime os valores formatados com barras verticais (|) para simular
     * uma tabela no console.
     * </p>
     *
     * <p>
     * Exemplo de saída:
     * </p>
     * 
     * <pre>
     * |5|3|0|0|7|0|0|0|0|
     * |6|0|0|1|9|5|0|0|0|
     * |0|9|8|0|0|0|0|6|0|
     * ...
     * </pre>
     */
    public void imprimeTabela() {
        System.out.println("\nInicializando tabela MAIOR (9x9)...");
        for (short i = 0; i < LINHAS; i++) {
            System.out.print("|");
            for (short j = 0; j < COLUNAS; j++) {
                System.out.print(tabela[i][j] + "|");
            }
            System.out.println();
        }
    }

    /**
     * Verifica se o valor informado já está presente na linha especificada.
     *
     * <p>
     * O método percorre todas as colunas da linha indicada e compara
     * cada elemento com o valor fornecido. Caso o valor seja encontrado,
     * uma mensagem é exibida ao usuário indicando a posição onde ocorreu
     * a duplicação e o método retorna {@code true}.
     * </p>
     *
     * @param linha a linha do tabuleiro que será verificada (0 a 8)
     * @param valor o valor que será buscado na linha
     * @return {@code true} se o valor já existir na linha,
     *         {@code false} caso contrário
     */
    public boolean verificaValorLinha(short linha, short valor) {
        for (short coluna = 0; coluna < COLUNAS; coluna++) {
            if (tabela[linha][coluna] == valor) {
                valorEstaContido(coluna, linha, valor);
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica se o valor informado já está presente na coluna especificada.
     *
     * <p>
     * O método percorre todas as linhas da coluna indicada e compara
     * cada elemento com o valor fornecido. Caso o valor seja encontrado,
     * uma mensagem é exibida ao usuário indicando a posição onde ocorreu
     * a duplicação e o método retorna {@code true}.
     * </p>
     *
     * @param coluna a coluna do tabuleiro que será verificada (0 a 8)
     * @param valor  o valor que será buscado na coluna
     * @return {@code true} se o valor já existir na coluna,
     *         {@code false} caso contrário
     */

    public boolean verificaValorColuna(short coluna, short valor) {
        for (short linha = 0; linha < LINHAS; linha++) {
            if (tabela[linha][coluna] == valor) {
                valorEstaContido(coluna, linha, valor);
                return true;
            }
        }
        return false;
    }

}