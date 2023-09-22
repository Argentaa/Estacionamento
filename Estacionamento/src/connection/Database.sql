CREATE DATABASE IF NOT EXISTS estacionamento;
USE estacionamento;

CREATE TABLE vaga(
    idVaga INT NOT NULL AUTO_INCREMENT,
    numero INT NOT NULL,
    rua VARCHAR(50) NOT NULL,
    obliqua BOOLEAN NOT NULL,
    PRIMARY KEY (idVaga)
);