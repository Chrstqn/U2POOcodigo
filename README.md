Proyecto de Gestión de Contenido Audiovisual (v1.1.2) 🎬 

Descripción General:

Este proyecto es una aplicación Java para la gestión de contenido audiovisual, diseñada para organizar y administrar información detallada sobre películas, series, documentales, transmisiones en vivo y gameplays comentados. La aplicación se ha desarrollado con un enfoque en la modularidad, escalabilidad y la aplicación de buenas prácticas de programación.

Estructura del Proyecto:

El proyecto se ha estructurado en varias etapas de desarrollo, cada una enfocada en mejorar la funcionalidad, la calidad del código y la arquitectura del sistema.

Actualizaciones Clave (v1.1.2):

Este documento detalla las actualizaciones y mejoras implementadas en el proyecto, divididas en etapas clave:

Etapa 1: Manejo de Archivos 💾

Objetivo: Implementar la persistencia de datos, permitiendo la lectura y escritura de información desde y hacia archivos. 

Implementación: 
- Se desarrollaron métodos para leer datos desde archivos CSV, inicializando objetos ContenidoAudiovisual, Pelicula, SerieDeTV, Documental, Actor, Temporada e Investigador.
- Se implementaron métodos para guardar el estado actual del sistema (listas de contenidos) en archivos. 

Etapa 2: Refactorización y Código Limpio 🧹

Objetivo: Mejorar la legibilidad, mantenibilidad y eficiencia del código. 

Implementación: 

- Se utilizaron nombres descriptivos para clases, métodos y variables, facilitando la comprensión del código.
- Se refactorizaron métodos largos en métodos más pequeños y específicos, mejorando la modularidad.
- Se identificó y eliminó código duplicado mediante la creación de métodos reutilizables. Comentarios: Se revisaron y limpiaron los comentarios, eliminando los redundantes y manteniendo solo los necesarios para explicar la lógica compleja. 

Etapa 3: Aplicación de Principios SOLID 🧱

Objetivo: Mejorar el diseño y la estructura del sistema, promoviendo la flexibilidad y la escalabilidad. 
Se aplicaron los principios SOLID: Single Responsibility Principle (SRP): Cada clase tiene una única responsabilidad. 

- Open/Closed Principle (OCP): Las clases están abiertas para extensión, pero cerradas para modificación.
- Liskov Substitution Principle (LSP): Las subclases pueden sustituir a sus clases base sin afectar el funcionamiento.
- Interface Segregation Principle (ISP): Se crearon interfaces pequeñas y específicas.
- Dependency Inversion Principle (DIP): Se utiliza la dependencia en abstracciones en lugar de implementaciones concretas, con inyección de dependencias donde es necesario. 

Etapa 4: Implementación del Patrón MVC 🏛️

Objetivo: Separar la lógica de la aplicación de la interfaz de usuario, mejorando la organización y la mantenibilidad.

- Se implementó el patrón Modelo-Vista-Controlador (MVC): Modelo (Model): Implementación de las clases de negocio que representan los contenidos audiovisuales, actores, etc. Vista (View): Creación de una interfaz de usuario en consola para interactuar con el sistema. Controlador (Controller): Manejo de la lógica que conecta el modelo con la vista, gestionando las interacciones del usuario y actualizando el modelo.

Etapa 5: Desarrollo de Pruebas Unitarias 🧪

Objetivo: Asegurar la calidad y fiabilidad del código mediante pruebas automatizadas. 

- Se implementaron pruebas unitarias exhaustivas utilizando JUnit para todas las clases principales, ubicadas en la carpeta test/.
- Se aseguró una cobertura de código adecuada, probando casos normales, límite y excepcionales, garantizando la robustez del sistema.

Tecnologías Utilizadas:

- Java JUnit 5 (para pruebas unitarias)
- IDE Eclipse

Cómo Ejecutar el Proyecto:

Clonar el repositorio:

Abre tu terminal o línea de comandos. Usa el comando git clone [https://github.com/Chrstqn/U2POOcodigo]

Importar el proyecto en tu IDE:

Eclipse:

•	Ve a File > Import...

•	Selecciona Existing Projects into Workspace y haz clic en Next.

•	Haz clic en Browse... y selecciona la carpeta donde clonaste el repositorio.

•	Haz clic en Finish.

IntelliJ IDEA:

•	Ve a File > Open...

•	Selecciona la carpeta donde clonaste el repositorio y abre el archivo pom.xml (si usas Maven) o el archivo build.gradle (si usas Gradle).

•	IntelliJ IDEA detectará automáticamente el proyecto y lo importará.

Otros IDEs: Sigue las instrucciones específicas de tu IDE para importar un proyecto existente. Generalmente, buscarás una opción como "Import Project" o "Open Project" y seleccionarás la carpeta raíz del proyecto.

Ejecutar la aplicación:

•	En tu IDE, busca la clase principal de tu aplicación (generalmente, una clase con un método main()).

•	Haz clic derecho en esa clase y selecciona "Run As" o "Ejecutar como" y luego "Java Application". Esto ejecutará tu aplicación.

Alternativamente, puedes usar la terminal:

•	Navega a la carpeta raíz de tu proyecto.

•	Usa el comando java -cp .:/ruta/a/tus/librerias/ (si usas librerias externas) nombre.de.la.clase.Principal (reemplaza nombre.de.la.clase.Principal con el nombre completo de la clase principal, incluyendo el paquete).

•	Ejecutar las pruebas unitarias:

Eclipse:

•	Haz clic derecho en el proyecto y selecciona Run As > JUnit Test.

•	También puedes hacer clic derecho en una clase de prueba individual y seleccionar Run As > JUnit Test.

IntelliJ IDEA:

•	Haz clic derecho en el proyecto y selecciona Run Tests o Run 'All Tests'.

•	También puedes hacer clic derecho en una clase de prueba individual y seleccionar Run.

Desde la línea de comandos (Maven):

•	Navega a la carpeta raíz de tu proyecto.

•	Ejecuta el comando mvn test.

Desde la línea de comandos (Gradle):

•	Navega a la carpeta raíz de tu proyecto.

•	Ejecuta el comando ./gradlew test (en Linux/macOS) o gradlew test (en Windows).

Autor:

Christian Taipe

