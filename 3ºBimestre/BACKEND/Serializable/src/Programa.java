import javax.swing.text.html.CSS;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Programa {

    public static void main(String[] args) {
        List<Cachorro> cachorros = new ArrayList<>();

        Cachorro c1 = new Cachorro("Ploto", "Fila", 4, "Rua das noites voas 333");

        cachorros.add(c1);

        // Salvar esta coleção em um arquivo.txt
        FileOutputStream fo = null;

        try{
            fo = new FileOutputStream("saida2.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(cachorros);

        }
        catch(FileNotFoundException e){
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
