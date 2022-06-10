package arsw.app;
import arsw.app.operaciones.Loc;
import arsw.app.operaciones.Phy;

import java.io.File;
/**
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       String tipoArchivo=args[0];
       String ruta=args[1];
       System.out.println("El tipo del archivo es: "+ tipoArchivo);
       System.out.println("la ruta del archivo es: "+ ruta);
       File documento = new File(ruta);
       Phy documentoPhy=new Phy(documento);
       Loc documentoLoc = new Loc(documento);
       if(tipoArchivo.equals("phy")){
           int totalPhy=documentoPhy.contarPhy(documento);
           System.out.println("total de lineas del archivo de tipo PHY= "+ totalPhy);
       }
       else {

           int totalLoc = documentoLoc.contarLoc(documento);
           System.out.println("total de lineas del archivo de tipo LOC= " + totalLoc);
       }
    }
}
