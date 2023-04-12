import java.util.ArrayList;
import java.util.List;

public class macaco {

    public int id;
    public int macacoPar;
    public int macacoImpar;
    // List<Integer> cocosPar;
    // List<Integer> cocosImpar;
    public int numCocosPar;
    public int numCocosImpar;

    // public macaco(int id, int par, int impar, List<Integer> cocosPar, List<Integer> cocosImpar) {
    //     this.id = id;
    //     this.macacoPar = par;
    //     this.macacoImpar = impar;
    //     this.cocosPar = cocosPar;
    //     this.cocosImpar = cocosImpar;
    // }

    public macaco(int id, int par, int impar, int numCocosPar, int numCocosImpar) {
        this.id = id;
        this.macacoPar = par;
        this.macacoImpar = impar;
        this.numCocosPar = numCocosPar;
        this.numCocosImpar = numCocosImpar;
    }

    // public int getNumeroDeCocos() {
    //     return cocosPar.size() + cocosImpar.size();
    // }

    public int getNumeroDeCocos() {
        return numCocosPar + numCocosImpar;
    }

    // public void transferirCocos(macaco macacoPar, macaco macacoImpar) {
    //     // Transfere todos os cocos pares
    //     macacoPar.cocosPar.addAll(this.cocosPar);
    //     this.cocosPar.clear();
    
    //     // Transfere todos os cocos ímpares
    //     macacoImpar.cocosImpar.addAll(this.cocosImpar);
    //     this.cocosImpar.clear();
    // }

    public void transferirCocos(macaco macacoPar, macaco macacoImpar) {
        // Transfere todos os cocos pares
        macacoPar.numCocosPar += this.numCocosPar;
        this.numCocosPar = 0;
        
        // Transfere todos os cocos ímpares
        macacoImpar.numCocosImpar += this.numCocosImpar;
        this.numCocosImpar = 0;

    }

    public int getId() {
        return id;
    }

}
