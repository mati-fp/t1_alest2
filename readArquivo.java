import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class readArquivo {
    
    public resultArquivo leitura(String fileName) {
        Map<Integer, macaco> macacos = new HashMap<Integer, macaco>();
        int rodadas = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            // Ler a primeira linha do arquivo, que contém o número de rodadas
            rodadas = Integer.parseInt(br.readLine().split(" ")[1]);

            // Ler as linhas restantes com informações dos macacos
            while ((line = br.readLine()) != null) {
                String[] partes = line.split(" : ");
            
                // Obter informações sobre o macaco
                String[] infoMacaco = partes[0].split(" ");
                int id = Integer.parseInt(infoMacaco[1]);
                int par = Integer.parseInt(infoMacaco[4]);
                int impar = Integer.parseInt(infoMacaco[7]);
            
                // Obter a quantidade de cocos e as pedrinhas em cada coco
                //int numCocos = Integer.parseInt(partes[1]);
                String[] cocosStr = partes[2].split(" ");
                // List<Integer> cocosPar = new ArrayList<>();
                // List<Integer> cocosImpar = new ArrayList<>();
                int numCocosPar = 0;
                int numCocosImpar = 0;
            
                for (String coco : cocosStr) {
                    int pedrinhas = Integer.parseInt(coco);
                    if (pedrinhas % 2 == 0) {
                        // cocosPar.add(pedrinhas);
                        numCocosPar++;

                    } else {
                        // cocosImpar.add(pedrinhas);
                        numCocosImpar++;
                    }
                }
            
                // Criar um objeto Macaco e armazená-lo no HashMap
                macacos.put(id, new macaco(id, par, impar, numCocosPar, numCocosImpar));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return new resultArquivo(rodadas, macacos);
    }
}
