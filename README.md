Gestión de Contenido Audiovisual v 1.0.0

Este proyecto tiene como objetivo desarrollar una aplicación Java para la gestión eficiente de contenido audiovisual, permitiendo almacenar y gestionar información detallada sobre diferentes tipos de contenido, como películas, series, documentales y transmisiones en vivo. Se busca facilitar la búsqueda y consulta de información relevante, mejorando la organización y acceso a los datos.

Objetivos:

- Desarrollar una aplicación Java robusta y eficiente para la gestión de contenido audiovisual.
- Permitir el almacenamiento y gestión de información detallada sobre diferentes tipos de contenido.
- Facilitar la búsqueda y consulta de información relevante.
- Mejorar la organización y acceso a los datos.


Clases añadidas a las ya especificadas en el proyecto:

- TransmisionEnVivo: Hereda de ContenidoAudiovisual e incluye atributos como plataforma de transmisión, fecha y hora de emisión, número de espectadores.
- GameplayComentado: Hereda de ContenidoAudiovisual e incluye atributos como juego, comentarista, plataforma de transmisión.

Cómo clonar el proyecto:

- Puedes clonar el proyecto utilizando el siguiente comando: "git clone <https://github.com/Chrstqn/U2POOcodigo>"
- El comando "git" puedes usarlo en la terminal de tu sistema operativo (como Command Prompt en Windows, Terminal en macOS o cualquier terminal en Linux). Pero asegúrate de tener Git instalado en tu máquina. Puedes verificarlo ejecutando git --version.

Para Importar a Eclipse:

- Importa el proyecto en Eclipse como un proyecto Maven.
    - Abre Eclipse
    - Accede al Menú de Importación
    - Ve al menú File (Archivo) en la parte superior izquierda
    - Selecciona Import... (Importar)
    - Selecciona el Tipo de Proyecto
    - En la ventana de importación, expande la carpeta Maven
    - Selecciona Existing Maven Projects (Proyectos Maven Existentes) y haz clic en Next (Siguiente)
    - Selecciona la Ruta del Proyecto
    - En la siguiente ventana, haz clic en Browse... (Examinar) para buscar la carpeta donde se encuentra tu proyecto Maven
    - Asegúrate de que la opción "Search for nested projects" (Buscar proyectos anidados) esté marcada si tu proyecto tiene subproyectos
    - Finaliza la Importación
    - Haz clic en Finish (Finalizar) para completar la importación

- Verifica la Importación
- Una vez que el proyecto se haya importado, deberías verlo en el Package Explorer (Explorador de Paquetes) de Eclipse
- Eclipse comenzará a descargar las dependencias definidas en el archivo pom.xml. Esto puede tardar un poco, dependiendo de la cantidad de dependencias
- Ejecuta la clase principal (Main.java) ubicado en la carpeta DeberU2 para probar la funcionalidad de la aplicación

Mejoras Adicionales:

- Se han implementado pruebas unitarias para verificar la funcionalidad de cada clase individualmente, asegurando la calidad del código.
- Se ha implementado un manejo robusto de excepciones para evitar errores inesperados.
- Se ha incluido documentación en el código para facilitar la comprensión y el mantenimiento.

Consideraciones Futuras:

- Implementar una interfaz gráfica de usuario (GUI) para una mejor interacción con el usuario.
- Integrar una base de datos para el almacenamiento persistente de datos.
- Agregar nuevas funcionalidades, como la búsqueda avanzada y la generación de informes.
