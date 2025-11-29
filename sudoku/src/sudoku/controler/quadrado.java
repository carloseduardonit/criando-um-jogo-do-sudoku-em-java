import javax.swing.JOptionPane;

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
        public void setValor(short linha, short coluna, short valor){
            tabela[linha][coluna] = valor;
        }

    }    
    public class MENOR extends quadrado{
        public static final short LINHAS = 3;
        public static final short COLUNAS = 3;
        short [][] tabela = new short [LINHAS][COLUNAS];
        public MENOR(){
            for(short i=0; i<LINHAS; i++){
                for(short j=0; j<COLUNAS; j++){
                    tabela[i][j] = -1;
                }
            }
        }
        public short getValor(short linha, short coluna){
            return  tabela[linha][coluna] >= 0 ? tabela[linha][coluna] : 0;
        }   
        public void setValor(short linha, short coluna, short valor){
            tabela[linha][coluna] = valor;
        }
    }

    public boolean verificaValor(short valor){
        JOptionPane.showMessageDialog(null, "Verificando valor: " + valor);
        return (valor >=1 && valor <=9);
    }

    public boolean verificaFixo(){
        return fixo;
    }

    public boolean setValor(short valor){
        if(verificaValor(valor) && !verificaFixo()){
            this.valor = valor;
            return true;
        } else {
            return false;
        }
    }

    
    MENOR menor = new MENOR();
    MAIOR maior = new MAIOR();
    
}


