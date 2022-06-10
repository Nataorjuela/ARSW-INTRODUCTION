package arsw.app.operaciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Phy {
    public Phy(File documento){
        contarPhy(documento);
    }
    public int contarPhy(File documento){
        int totalLineas=0;
        try {
            if(documento.exists()) {
                BufferedReader archiveRead = new BufferedReader(new FileReader(documento));
                String linea;
                while((linea = archiveRead.readLine()) != null ) {
                    totalLineas = totalLineas +1;
                }
                archiveRead.close();
            }else {
                System.out.println("No existe el Documento");
            }
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return totalLineas;

    }
}

