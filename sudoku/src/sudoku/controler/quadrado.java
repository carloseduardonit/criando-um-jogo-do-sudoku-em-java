public class quadrado{
    short linha;
    short coluna;
    short [][] tabela;
    short valor;
    boolean fixo;
    public class MAIOR extends quadrado{
        public static final short LINHAS = 9;
        public static final short COLUNAS = 9;
        short [][] tabela = new short [LINHAS][COLUNAS];
        public MAIOR(){
            for(short i=0; i<LINHAS; i++){
                for(short j=0; j<COLUNAS; j++){
                    tabela[i][j] = -1;
                }
            }
        }
        public short getValor(short linha, short coluna){
            return  tabela[linha][coluna] >= 0 ? tabela[linha][coluna] : 0;
        }   

    }    
    public class MENOR extends quadrado{
        public static final short LINHAS = 3;
        public static final short COLUNAS = 3;
        short [][] tabela = new short [LINHAS][COLUNAS];
    }

    MENOR menor = new MENOR();
    MAIOR maior = new MAIOR();
    
}


