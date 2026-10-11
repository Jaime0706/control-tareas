# Actividad: Fundamentos de Maven, HTTP y REST — Control de tareas personales

**Estudiante:** Jaime Alejandro Monzón Contreras
**Carné:** 9941-24-11049
**Curso:** Programación II

## Descripción del problema

Una aplicación necesita administrar las tareas pendientes de una persona. Cada tarea tiene un identificador, un título, una descripción, una prioridad y un estado de finalización.

En esta actividad se crea el proyecto Java con Maven, un programa de consola que maneja una lista de tareas y el diseño lógico (sin implementación) de la API REST que se construirá después con Spring Boot.

## Tecnologías utilizadas

- Java 17 o superior
- Apache Maven
- Git y GitHub
- Conceptos de HTTP, REST y JSON (solo diseño, sin implementar)

## Datos del proyecto Maven

| Campo | Valor |
|---|---|
| groupId | `com.estudiante` |
| artifactId | `control-tareas` |
| version | `1.0-SNAPSHOT` |
| Java | 17 |
| Codificación | UTF-8 |

### ¿Qué significa cada dato?

- **groupId:** identifica a la organización o autor del proyecto. Por convención es un dominio al revés (`com.estudiante`).
- **artifactId:** es el nombre del proyecto o artefacto que se genera. Aquí el `.jar` se llama `control-tareas`.
- **version:** indica la versión del artefacto. `SNAPSHOT` significa que está en desarrollo y todavía no es una versión final.

## Estructura del proyecto

```
control-tareas/
├── src/
│   ├── main/java/com/estudiante/
│   │   ├── Tarea.java
│   │   └── Main.java
│   └── test/java/
├── evidencias/
│   └── Evidencias_Maven_HTTP_REST_NombreApellido.docx
├── pom.xml
├── README.md
└── .gitignore
```

## Instrucciones para compilar el proyecto

Desde la carpeta raíz del proyecto (donde está `pom.xml`):

```bash
mvn clean      # elimina la carpeta target
mvn compile    # compila el código
mvn test       # ejecuta la fase de pruebas
mvn package    # genera el .jar en target/
```

Para ejecutar el programa después de empaquetar:

```bash
java -cp target/control-tareas-1.0-SNAPSHOT.jar com.estudiante.Main
```

Salida esperada:

```
===== LISTADO DE TAREAS =====

1 | Comprar alimentos | ALTA | Pendiente
2 | Realizar ejercicios | MEDIA | Completada
3 | Estudiar Programación II | ALTA | Pendiente

Tareas pendientes: 2
Tareas completadas: 1
```

## Diseño de la API REST (solo diseño)

| Operación | Método HTTP | Endpoint | Respuesta esperada |
|---|---|---|---|
| Consultar todas las tareas | GET | `/api/tareas` | 200 OK |
| Consultar una tarea | GET | `/api/tareas/{id}` | 200 OK |
| Registrar una tarea | POST | `/api/tareas` | 201 Created |
| Modificar una tarea | PUT | `/api/tareas/{id}` | 200 OK |
| Eliminar una tarea | DELETE | `/api/tareas/{id}` | 204 No Content |
| Consultar una tarea inexistente | GET | `/api/tareas/{id}` | 404 Not Found |

## Ejemplo del objeto JSON

```json
{
  "id": 1,
  "titulo": "Comprar alimentos",
  "descripcion": "Comprar productos para la semana",
  "prioridad": "ALTA",
  "completada": false
}
```

## Notas

- No se utiliza Spring Boot, JPA ni PostgreSQL en esta actividad.
- La carpeta `target/` no se sube al repositorio (ver `.gitignore`).
