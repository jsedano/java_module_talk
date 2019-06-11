%title: Java Platform Module System - Rompiendo el monolito
%author: Juan Carlos Sedano Salas - Back-End Dev @Kenzan

-> Rompiendo el monolito <-
=========

***

-> Un poco sobre mi: <-
=========

- Desarrollador Java con +7 años de experiencia
- Me gusta Unity, Objective C, Swift, Python, Linux / Unix
- Actualmente en Kenzan

***

-> Qué es un módulo? <-
=========

- Una parte de un programa.
- Desarrollado independientemente.
- Encapsula código para implementar una funcionalidad.
- Tiene una interfaz que permite a los clientes acceder a esa funcionalidad en una forma uniforme.
- Se añade fácilmente a otro modulo que espera su interfaz.
- Usualmente empaquetado en una sola unidad para que pueda ser fácilmente desplegado

***

-> Como modularizamos sin la plataforma de módulos? <-
=========

- Agrupando paquetes, clases e interfaces.
- Con artefactos.

***

-> JDK Antes de Java 9 <-
=========

> * "... un programa de linea de comando trivial como "hola mundo" carga e inicializa cerca de 300 clases diferentes..." [1]
-Mark Reinhold, Chief Architect of the Java Platform Group at Oracle, 2008




[1]: https://mreinhold.org/blog/massive-monolithic-jdk

***

-> Java Plataform Module System <-
=========

***

-> Que se rompió con este cambio? <-
=========

- Librerías que usan JDK-internal API, por ejemplo:
    - Spring
    - Netty
    - Mockito

***

-> Veamos algunos ejemplos <-
=========

> * "talk is cheap, show me the code"
-Linus Torvalds

***

-> Conclusiones <-
=========

- JDK fue reorganizado en Java 9 para usar módulos.
- A pesar de que la plataforma de módulos es totalmente funcional todavía podemos usar el classpath.
- No existe aun el manejo de versiones para módulos. No a los fat jars en el mundo de los módulos por ahora. Preguntas?
