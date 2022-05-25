CREATE DATABASE ludoteca;
/*DROP table empleados;*/
USE ludoteca;

CREATE TABLE inscritos(
id_usuario int auto_increment not null,
nombre_usuario varchar(30) not null,
f_inscripcion date not null, /*YYYY-MM-DD*/
actividades_inscritas varchar(30),
nombre_tutor varchar(30) not null,
telefono_tutor varchar(15) not null,
correo_tutor varchar(30) not null,  
primary key(id_usuario));

CREATE TABLE empleados(
id_empleado int auto_increment not null,
nombre_empleado varchar(30) not null,
actividades_asignadas varchar(30),
rfc varchar(10) not null,
telefono varchar(15) not null,
correo varchar(30) not null, 
primary key(id_empleado));

CREATE TABLE actividades(
id_actividad int auto_increment not null,
nombre_actividad varchar(20) not null,
total_inscritos int,
profesor_asignado varchar(30) not null,
primary key(id_actividad));

DELETE FROM inscritos WHERE id_usuario = 2;

INSERT INTO inscritos (nombre_usuario, f_inscripcion, actividades_inscritas, nombre_tutor, telefono_tutor, correo_tutor) VALUES ('Gabriel Tellez','2021-05-12','Danza','Daniel Ortiz','5588339725','gabo@gmial.com');
INSERT INTO inscritos (nombre_usuario, f_inscripcion, nombre_tutor, telefono_tutor, correo_tutor) VALUES ('Alan Roman','2021-07-11','Javier Loret','5548796325','vallejo@gmail.com');


SELECT * FROM actividades;
SELECT * FROM inscritos;
SELECT * FROM empleados;
INSERT INTO actividades (nombre_actividad, profesor_asignado) VALUES ('Danza','Daniel Ortega');

SET SQL_SAFE_UPDATES = 0;
UPDATE actividades set total_inscritos = total_inscritos + 1 WHERE nombre_actividad = 'Ajedrez';
SET SQL_SAFE_UPDATES = 1;