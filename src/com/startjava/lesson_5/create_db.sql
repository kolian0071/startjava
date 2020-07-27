-- create database

CREATE TABLE Jaegers (
	id        SERIAL PRIMARY KEY,
	modelName TEXT,
	mark      CHAR(6),
	height    INTEGER,
	weight    FLOAT8,
	status    TEXT,
	origin    TEXT,
	launch    DATE,
	kaijuKill INTEGER
);