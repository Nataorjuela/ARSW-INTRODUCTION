package arsw.app.operaciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Loc {
    public Loc(File documento){
        contarLoc(documento);

    }

    public int contarLoc(File documento){
        int totalLineas=0;
        try {
            if(documento.exists()) {
                BufferedReader archiveRead = new BufferedReader(new FileReader(documento));
                String linea;
                while((linea = archiveRead.readLine()) != null ) {

                    //char position2 = linea.charAt(1);
                    //totalLineas=totalLineas+1;
                    if(linea.charAt(0)!='#'&& (linea.charAt(0)!='/'&& linea.charAt(1)!='/')){
                      totalLineas=totalLineas+1;
                    }
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
