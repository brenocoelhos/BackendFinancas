create database financas;
use financas;

create table usuario (
id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome varchar (50) not null,
senha varchar (30) not null
);

insert into usuario (nome, senha) values
('adrianresende', '11987654321'),
('brenocoelho', '21912345678');

ALTER TABLE usuario CHANGE nome login VARCHAR(50) NOT NULL;

select * from usuario;
