# Sistema de Mentoría Académica

API backend para gestionar mentorías académicas entre estudiantes y mentores: agenda, sesiones, evaluaciones y chat.

## Tecnologías

- Java y Spring Boot
- Spring Security
- Spring Data JPA (Hibernate)
- MySQL
- Lombok y Maven

## Modelo de datos

| Entidad | Descripción |
| --- | --- |
| Usuario | Datos base de acceso al sistema |
| Estudiante | Estudiante que solicita mentorías |
| Mentor | Persona que acompaña al estudiante |
| Coordinador | Supervisa y asigna mentorías |
| Agenda | Disponibilidad de los mentores |
| SesionMentoria | Sesión programada entre mentor y estudiante |
| EvaluacionMentoria | Calificación de la sesión |
| MensajeChat | Mensajes entre mentor y estudiante |
| RecomendacionMentor | Recomendaciones de mentores para el estudiante |

## Cómo ejecutarlo

1. Crea la base de datos en MySQL:

   ```sql
   CREATE DATABASE mentoria_academica;
   ```

2. Revisa el usuario y la contraseña de MySQL en `backend/mentoria_academica/src/main/resources/application.properties`.
3. Inicia la aplicación:

   ```bash
   cd backend/mentoria_academica
   mvn spring-boot:run
   ```

## Autora

Lizet Mariana Colorado Esguerra · [GitHub](https://github.com/MarianaColorado01) · [LinkedIn](https://www.linkedin.com/in/lizet-colorado-92a71b1a0/)
