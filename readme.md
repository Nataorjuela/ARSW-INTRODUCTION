# Statement
Escriba un programa para contar las líneas de código de un archivo fuente. Las líneas de código (LOC) de un programa se utilizan a menudo como una métrica de software para comparar la complejidad y medir la productividad. Por ejemplo, suponga que dedica 6 horas a completar esta tarea, incluido el diseño, las pruebas, la documentación, la gestión del repositorio y la entrega. Ahora imagina que tu código tiene 60 LOC. Aquí su productividad para este proyecto es 10 LOC/h. Tenga en cuenta que esta métrica considera todo el ciclo de desarrollo.

Registre el tiempo dedicado a este proyecto y calcule el LOC/h.

Su programa debe ser un programa de línea de comandos que recibe un parámetro de tres letras y el nombre de un archivo con el código fuente. Luego genera el número de líneas del programa fuente.

Por ejemplo, una invocación típica será:

> java cuentalíneas phy cuentalínea.java

Si el parámetro de invocación es "phy", el programa imprime las líneas físicas del código fuente. Si el parámetro es "loc", el programa imprimirá las Líneas de Código encontradas. Los LOC son las líneas físicas sin los comentarios y las líneas blancas.

Modifique su programa para considerar comodines y selección recursiva de archivos dentro de un directorio.

Siga los principios de codificación que se encuentran en (https://google.github.io/styleguide/javaguide.html).

Prueba a fondo el programa. Pruebe el programa con dos archivos fuente y escriba un informe de las pruebas, incluidos los archivos originales.

Documente su diseño utilizando el documento Design Metaphor. Este documento incluye al menos:

Título
Autor
Fecha
Diagrama de clase
Descripción del diagrama de clases
 

Documente su proyecto en el archivo Readme.md en el repositorio usando esta guía: https://gist.github.com/PurpleBooth/109311bb0361f32d87a2
_________________________________________________________________________________________________________________________________________________________________
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
mvn clean package
```
3.Para Ejecutar el proyecto utilizamos el siguietne comando atraves de CMD.
```
java -cp "./target/classes/" arsw.app.App loc C:/Users/Natalia/Documentos/prueba1.txt
```
### Estructura al ejecutar app

después de AppCountLine va el tipo de operacion que puede ser LOC o PHY y luego la  ubicación del archivo

### Running the Tests
1. Para Compilar pruebas utilizamos el siguiente comando
```
mvn test
```
Para realizar pruebas con nuevos archivos 
Las pruebas están realizadas con archivos guardados en la computadora de la autora, cambiar la ruta del archivo en la clase

### Diagrama de clases 📖

![image](https://user-images.githubusercontent.com/54339107/173155447-7d6e5703-7f3e-4d04-9ac7-2cdefbe4e7a0.png)

### Tiempo Dedicado
111 LOC/16
### Licencia
Este proyecto está bajo la Licencia Pública General GNU - consulte el archivo de [LICENSE.txt](http://www.gnu.org/licenses/gpl-3.0.html) para obtener más detalles.

