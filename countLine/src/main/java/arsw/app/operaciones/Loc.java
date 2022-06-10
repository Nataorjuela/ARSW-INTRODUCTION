package arsw.app.operaciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
/**
 * en esta clase tenemos la operacion Loc, el cual devuelve el total de las lineas del docuemnto sin comentarios
 * @author Natalia Orjuela
 */
public class Loc {
    public Loc(File documento){
        contarLoc(documento);

    }
    /* este metodo cuenta las lines del docuemtno sin comentarios
     * @param documento de tipo File
     */
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
