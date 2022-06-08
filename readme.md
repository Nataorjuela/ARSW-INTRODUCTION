# Count Lines
Este proyecto busca contar las líneas de un archivo dado dos tipo de operaciones. Una que phy que cuenta todas las lineas del archivo y otra que loc que cuenta solamente las líneas de código que no estén comentadas

### Author
**Natalia Orjuela 
Estudiante de ingeniería de sistemas**

### Date
08/06/2022 
### Requirements📋
Maven 
Git 
Java 
JUnit
### Installing
1. Para clonar Clonar el repositorio utilizamos el siguiente comando atraves de CMD. 
```
git clone https://github.com/Nataorjuela/ARSW-INTRODUCTION.git
```
2.Para Compilar el proyecto utilizamos el siguietne comando atraves de CMD.
```
mvn package
```
3.Para Ejecutar el proyecto utilizamos el siguietne comando atraves de CMD.
```
java -cp "./target/classes/" edu.escuelaing.arsw.app.AppCountLine loc /Documentos/archivo.txt
```
### Estructura al ejecutar app

Luego de AppCountLine va el tipoDeOperacion que puede ser LOC o PHY y luego la  ubicación del archivo

### Running the Tests
1. Para Compilar pruebas utilizamos el siguiente comando
```
mvn test
```
Para realizar pruebas con nuevos archivos 
Las pruebas están realizadas con archivos guardados en la computadora de la autora, cambiar la ruta del archivo en la clase AppCountLineTest

### Diagrama de clases 📖


Se tiene una interfaz con dos metodos: 
*El primero que es phyCountLines donde su lógica realiza el conteo de lineas del archivo; su parametro es un File donde es la ubicación del archivo que se va a contar.
*El segundo método locCountLines donde su lógica realiza el conteo de lineas del archivo que solo contengan líneas de código no comentada, este tambien recibe un parametro de tipo File. 
*Por último en la clase principal AppCountLine realiza el llamado de estos métodos.


### Licencia
Este proyecto está bajo la Licencia Pública General GNU - consulte el archivo de [LICENSE.txt](LICENSE.txt) para obtener más detalles.

