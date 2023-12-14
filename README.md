
# README
## Sistema de Gestión de Oradores
### Codo a Codo - Integrador Java

>!Note
> Este es un sistema de gestión de oradores desarrollado en Java utilizando la interfaz gráfica de usuario (GUI) Swing. El sistema permite realizar operaciones básicas de CRUD (Crear, Leer, Actualizar y Eliminar) sobre la información de los oradores almacenada en una base de datos.

Requisitos Previos
Java Development Kit (JDK) instalado
MySQL Server instalado y configurado
IDE de Java (por ejemplo, IntelliJ IDEA, Eclipse) para ejecutar el código
Configuración de la Base de Datos
Asegúrate de tener una base de datos MySQL creada con el nombre "nombre_de_tu_base_de_datos" y la siguiente tabla:

sql
Copy code
CREATE TABLE oradores (
    id_orador INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL,
    mail VARCHAR(255) NOT NULL,
    tema VARCHAR(255) NOT NULL,
    fecha_alta TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
Configuración de Conexión a la Base de Datos
En el archivo DBConnection.java, asegúrate de modificar la URL, usuario y contraseña de la conexión a tu base de datos:

java
Copy code
private static final String URL = "jdbc:mysql://localhost:3306/nombre_de_tu_base_de_datos";
private static final String USER = "tu_usuario";
private static final String PASSWORD = "tu_contraseña";
Ejecución del Programa
Abre el proyecto en tu IDE de Java.
Asegúrate de tener configurada la conexión a la base de datos.
Ejecuta la clase FormOradores.java.
Crear Archivo JAR
En tu IDE, busca la opción para construir o exportar el proyecto como un archivo JAR ejecutable.
Configura la clase principal como Vista.FormOradores.
Guarda el archivo JAR en la carpeta dist del proyecto.
Ejecutar desde el Archivo JAR
Abre una terminal o símbolo del sistema.
Navega hasta la carpeta dist del proyecto.
Ejecuta el siguiente comando:
bash
Copy code
java -jar NombreDelArchivo.jar
Funcionalidades Principales
Agregar Orador: Ingresa los detalles del orador y haz clic en "Agregar".
Modificar Orador: Selecciona un orador de la tabla, realiza las modificaciones y haz clic en "Actualizar".
Eliminar Orador: Selecciona un orador de la tabla y haz clic en "Eliminar".
Listar Oradores: Muestra la información de todos los oradores en la tabla.
Generar XML: Crea un archivo XML (Oradores.xml) con la información de los oradores.
Estructura del Proyecto
Vista/FormOradores.java: Contiene la lógica principal y la interfaz gráfica.
Vista/DBConnection.java: Maneja la conexión a la base de datos.
Otros archivos de configuración y recursos.
Autor
Nombre del Autor

Licencia
Este proyecto está bajo la Licencia MIT.

¡Gracias por usar nuestro sistema de gestión de oradores! Si tienes alguna pregunta o problema, no dudes en contactarnos.