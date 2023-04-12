import java.util.Map;

public class resultArquivo {
    
    private int rodadas;
    private Map<Integer, macaco> macacos;

    public resultArquivo(int rodadas, Map<Integer, macaco> macacos) {
        this.rodadas = rodadas;
        this.macacos = macacos;
    }


    public int getRodadas() {
        return rodadas;
    }

    public Map<Integer, macaco> getMacacos() {
        return macacos;
    }
}
