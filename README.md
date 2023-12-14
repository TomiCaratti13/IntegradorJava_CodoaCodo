## Codo a Codo - Integrador Java
# Sistema de Gestión de Oradores
### README
 <br>
 
> [!Note]
> Este es un sistema de gestión de oradores desarrollado en Java utilizando la interfaz gráfica de usuario (GUI) Swing. El sistema permite realizar operaciones básicas de CRUD (Crear, Leer, Actualizar y Eliminar) sobre la información de los oradores almacenada en una base de datos.

> [!Tip]
> ### Requisitos Previos <br>
> &ensp;Java Development Kit (JDK) instalado <br>
> &ensp;MySQL Server instalado y configurado <br>
> &ensp;IDE de Java (por ejemplo, IntelliJ IDEA, Eclipse) para ejecutar el código <br>
> &ensp;Configuración de la Base de Datos <br>
> &ensp;Asegúrate de tener una base de datos MySQL creada con el nombre "nombre_de_tu_base_de_datos" y la siguiente tabla:

### Copie el código SQL: <br>
CREATE TABLE oradores ( <br>
&emsp;&emsp; id_orador INT AUTO_INCREMENT PRIMARY KEY, <br>
&emsp;&emsp; nombre VARCHAR(255) NOT NULL, <br>
&emsp;&emsp; apellido VARCHAR(255) NOT NULL, <br>
&emsp;&emsp; mail VARCHAR(255) NOT NULL, <br>
&emsp;&emsp; tema VARCHAR(255) NOT NULL, <br>
&emsp;&emsp; fecha_alta TIMESTAMP DEFAULT CURRENT_TIMESTAMP <br>
); <br><br>

>[!Important]
>Configuración de Conexión a la Base de Datos
En el archivo DBConnection.java, asegúrate de modificar la URL, usuario y contraseña de la conexión a tu base de datos:

### Copie el código JAVA: <br>
&emsp; private static final String URL = "jdbc:mysql://localhost:3306/nombre_de_tu_base_de_datos"; <br>
&emsp; private static final String USER = "tu_usuario"; <br>
&emsp; private static final String PASSWORD = "tu_contraseña";
<br>
### Ejecución del Programa <br>
Abre el proyecto en tu IDE de Java. <br>
Asegúrate de tener configurada la conexión a la base de datos. <br>
Ejecuta la clase FormOradores.java. <br>

### Crear Archivo JAR <br>
En tu IDE, busca la opción para construir o exportar el proyecto como un archivo JAR ejecutable. <br>
Configura la clase principal como Vista.FormOradores. <br>
Guarda el archivo JAR en la carpeta dist del proyecto. <br>
Ejecutar desde el Archivo JAR <br>
Abre una terminal o símbolo del sistema. <br>
Navega hasta la carpeta dist del proyecto. <br>
Ejecuta el siguiente comando: <br>
> [!Warning]
> ### Copie el código en la TERMINAL: <br>
> &emsp; java -jar TP_Final_CaC_Java.jar <br>

<br>

### Funcionalidades Principales <br>
<b>Agregar Orador:</b> Ingresa los detalles del orador y haz clic en "Agregar". <br>
<b>Modificar Orador:</b> Selecciona un orador de la tabla, realiza las modificaciones y haz clic en "Actualizar". <br>
<b>Eliminar Orador:</b> Selecciona un orador de la tabla y haz clic en "Eliminar". <br>
<b>Listar Oradores:</b> Muestra la información de todos los oradores en la tabla. <br>
<b>Generar XML:</b> Crea un archivo XML (Oradores.xml) con la información de los oradores. <br>

### Estructura del Proyecto <br>
Vista/FormOradores.java: Contiene la lógica principal y la interfaz gráfica. <br>
Vista/DBConnection.java: Maneja la conexión a la base de datos. <br>
Otros archivos de configuración y recursos. <br>

### Autor <br>
Tomás Rafael Caratti <br>

### Licencia <br>
Este proyecto está bajo la Licencia <a href="License.txt">MIT</a>. <br><br>

#### ¡Gracias por usar nuestro sistema de gestión de oradores! Si tienes alguna pregunta o problema, no dudes en contactarnos.
