import java.util.Map;

public class t1 {
    public static void main(String[] args) {

        String arquivos[] = {"caso0050.txt", "caso0100.txt", "caso0200.txt", "caso0400.txt", "caso0600.txt", "caso0800.txt", "caso0900.txt", "caso1000.txt"};
        for (String fileName : arquivos){
        long startTime = System.nanoTime();
        resultArquivo result = new readArquivo().leitura(fileName);
        int rodadas = result.getRodadas();
        Map<Integer, macaco> macacos = result.getMacacos();

        game jogo = new game(rodadas, macacos);

        macaco vencedor = jogo.jogar();

        long endTime = System.nanoTime();

        double durationSeconds = (endTime - startTime) / 1000000000.0;
        double durationMinutes = durationSeconds / 60.0;
        System.out.println("Arquivo: " + fileName);
        System.out.println("O macaco vencedor foi o " + vencedor.getId() + " com " + vencedor.getNumeroDeCocos() + " cocos");
        System.out.printf("Tempo gasto: %.2f segundos (%.2f minutos)%n", durationSeconds, durationMinutes);
        System.out.println();
        }
        // System.out.println("Tempo de execução: " + durationSeconds + " segundos");
        // System.out.println("Tempo de execução: " + durationMinutes + " minutos");
    }
}
