import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class tokenizeer {
    private static void Kelimeleştir(String line) {
        String cikti = ""; 
        int boyut = line.length();
        for (int i = 0; i < boyut; i++) {
            char c = line.charAt(i);

            if (c != ' ') {
                if (c == '+' || c == '-' || c == '*' || c == '/' || c == '(' || c == ')') {
                    cikti += " " + c + " "; 
                } else {
                    cikti += c; 
                }
            }
        }
        
        System.out.println(cikti);
    }

    public static void main(String[] args) {
        String DosyaAdi = "src/gamze_1.txt"; 
        try (BufferedReader br = new BufferedReader(new FileReader(DosyaAdi))) {
            String satir;
            while ((satir = br.readLine()) != null) {
                Kelimeleştir(satir);
            }
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası: ");
        }
    }
}
