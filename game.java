import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Iterator;

public class game {

    private int rodadas;
    private Map<Integer, macaco> macacos;

    public game(int rodadas, Map<Integer, macaco> macacos) {
        this.rodadas = rodadas;
        this.macacos = macacos;
    }

    public macaco jogar() {
        for (int r = 0; r < rodadas; r++) {
            for (macaco macacoAtual : macacos.values()) {
                macaco macacoPar = macacos.get(macacoAtual.macacoPar);
                macaco macacoImpar = macacos.get(macacoAtual.macacoImpar);
    
                macacoAtual.transferirCocos(macacoPar, macacoImpar);
            }
        }
    
        macaco vencedor = null;
        for (macaco macaco : macacos.values()) {
            if (vencedor == null || macaco.getNumeroDeCocos() > vencedor.getNumeroDeCocos()) {
                vencedor = macaco;
            }
        }
    
        return vencedor;
    }

    // public macaco jogar() {
    //     for (int r = 0; r < rodadas; r++) {
    //         for (macaco macacoAtual : macacos.values()) {
    //             macaco macacoPar = macacos.get(macacoAtual.par);
    //             macaco macacoImpar = macacos.get(macacoAtual.impar);
    
    //             macacoAtual.transferirCocos(macacoPar, macacoImpar);
    //         }
    //     }
    
    //     macaco vencedor = null;
    //     for (macaco macaco : macacos.values()) {
    //         if (vencedor == null || macaco.getNumeroDeCocos() > vencedor.getNumeroDeCocos()) {
    //             vencedor = macaco;
    //         }
    //     }
    
    //     return vencedor;
    // }
}
