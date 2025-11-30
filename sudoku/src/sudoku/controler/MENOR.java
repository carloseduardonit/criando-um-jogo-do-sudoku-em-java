public class MENOR extends Quadrado {
    public static final short LINHAS = 3;
    public static final short COLUNAS = 3;
    short[][] tabela = new short[LINHAS][COLUNAS];

    public MENOR() {
        for (short i = 0; i < LINHAS; i++) {
            for (short j = 0; j < COLUNAS; j++) {
                tabela[i][j] = -1;
            }
        }
    }

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

    public short getValor(short linha, short coluna) {
        return tabela[linha][coluna] >= 0 ? tabela[linha][coluna] : 0;
    }

    public void setValor(short linha, short coluna, short valor) {
        tabela[linha][coluna] = valor;
    }

    
}