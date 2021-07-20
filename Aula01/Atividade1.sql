create database dados_RH;

use dados_RH;

create table atributos_funcionarios(
matricula bigint auto_increment,
nome varchar(300),
cargo varchar(300),
salario decimal(8,2),
-- datacontratacao date,
ensino_superior boolean,  
primary key (matricula)
);

insert into atributos_funcionarios(nome, cargo, salario, ensino_superior) values ("Gabriel Reis", "Dev Senior", 37985.98, true);

select * from atributos_funcionarios;

delete from atributos_funcionarios where matricula = 1;  

insert into atributos_funcionarios(nome, cargo, salario, ensino_superior) values ("Pedro Alves", "Dev Pleno", 27985.98, true);
insert into atributos_funcionarios(nome, cargo, salario, ensino_superior) values ("Luiz Alberto", "Dev Junior", 3985.98, false);
insert into atributos_funcionarios(nome, cargo, salario, ensino_superior) values ("Regiane Santos", "Dev Senior", 40985.98, true);
insert into atributos_funcionarios(nome, cargo, salario, ensino_superior) values ("Sabrina Sato", "Dev Junior", 3985.98, false); 

select * from atributos_funcionarios where salario > 2000; 
select * from atributos_funcionarios where salario < 2000; 

update atributos_funcionarios set salario = 4500.00 where matricula = 6; 



