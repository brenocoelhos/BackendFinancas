use financas;

create table usuario (
id int not null primary key auto_increment,
nome varchar (50) not null,
senha varchar (30) not null
);

insert into usuario (nome, senha) values
('adrianresende', '11987654321'),
('brenocoelho', '21912345678');

select * from usuario;