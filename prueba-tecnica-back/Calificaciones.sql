drop database if exists calificaciones;
create database calificaciones;
use calificaciones;
CREATE TABLE `Estudiante` (
  `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
  `nombre` VARCHAR(255) NOT NULL,
  `edad` INT NOT NULL,
  `ciudad` VARCHAR(255) NOT NULL,
  `zonaHoraria` VARCHAR(255) NOT NULL
);

CREATE TABLE `Examen` (
  `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
  `puntajeTotal` INT NOT NULL,
  `fechaExamen` DATETIME NOT NULL,
  `estudiante_id` BIGINT,
  CONSTRAINT `fk_examen_estudiante` FOREIGN KEY (`estudiante_id`) REFERENCES `Estudiante` (`id`)

);




CREATE TABLE `Pregunta` (
  `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
  `enunciado` TEXT NOT NULL,
  `opcionA` VARCHAR(255) NOT NULL,
  `opcionB` VARCHAR(255) NOT NULL,
  `opcionC` VARCHAR(255) NOT NULL,
  `opcionD` VARCHAR(255) NOT NULL,
  `opcionCorrecta` VARCHAR(255) NOT NULL,
  `puntaje` INT NOT NULL,
  `examen_id` BIGINT NOT NULL,
  CONSTRAINT `fk_pregunta_examen` FOREIGN KEY (`examen_id`) REFERENCES `Examen` (`id`)
);

CREATE TABLE `Respuesta` (
  `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
  `respuesta` VARCHAR(255) NOT NULL,
  `correcta` TINYINT(1) NOT NULL,
  `examen_id` BIGINT NOT NULL,
  CONSTRAINT `fk_respuesta_examen` FOREIGN KEY (`examen_id`) REFERENCES `Examen` (`id`)
);


ALTER TABLE `Examen`
ADD COLUMN `respuesta_id` BIGINT,
ADD CONSTRAINT `fk_respuesta` FOREIGN KEY (`Respuesta_id`) REFERENCES `Respuesta` (`id`);


