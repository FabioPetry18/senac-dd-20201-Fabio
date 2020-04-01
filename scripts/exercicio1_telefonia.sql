drop database EXEMPLOS;
CREATE SCHEMA EXEMPLOS;

use EXEMPLOS;
CREATE TABLE `exemplos`.`telefone` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `codigoPais` VARCHAR(2) NOT NULL,
  `ddd` VARCHAR(2) NOT NULL,
  `numero` VARCHAR(12) NOT NULL,
  `movel` INTEGER NOT NULL,
  `ativo` INT(1) NOT NULL,
  PRIMARY KEY (`id`));
  
  CREATE TABLE `exemplos`.`endereco` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `cep` VARCHAR(8) NOT NULL,
  `estado` VARCHAR(255) NOT NULL,
  `cidade` VARCHAR(255) NOT NULL,
  `bairro` VARCHAR(255) NOT NULL,
  `numero` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`));
  
ALTER TABLE `exemplos`.`endereco` 
ADD COLUMN `rua` VARCHAR(255) NOT NULL AFTER `numero`;

  
  CREATE TABLE `exemplos`.`cliente` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  `sobrenome` VARCHAR(255) NOT NULL,
  `cpf` VARCHAR(11) NOT NULL,
  `idEndereco` INT NOT NULL,
  PRIMARY KEY (`id`));

ALTER TABLE `exemplos`.`cliente` 
ADD INDEX `id_idx` (`idEndereco` ASC);
ALTER TABLE `exemplos`.`cliente` 
ADD CONSTRAINT `id`
  FOREIGN KEY (`idEndereco`)
  REFERENCES `exemplos`.`endereco` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `exemplos`.`telefone` 
ADD COLUMN `idCliente` INT NULL AFTER `ativo`;

INSERT INTO `endereco` (`id`,`cep`,`estado`,`cidade`,`bairro`,`numero`,`rua`) VALUES (1,'43294870','SC','SÃ£o JosÃ©','Centro','189','Rua 51');
INSERT INTO `endereco` (`id`,`cep`,`estado`,`cidade`,`bairro`,`numero`,`rua`) VALUES (2,'38476242','SC','Lages','Centro','515','Rua  79');
INSERT INTO `endereco` (`id`,`cep`,`estado`,`cidade`,`bairro`,`numero`,`rua`) VALUES (3,'78529663','SC','FlorianÃ³polis','Centro','804','Rua  81');
INSERT INTO `endereco` (`id`,`cep`,`estado`,`cidade`,`bairro`,`numero`,`rua`) VALUES (4,'39152270','SC','Lages','Centro','640','Rua 28');
INSERT INTO `endereco` (`id`,`cep`,`estado`,`cidade`,`bairro`,`numero`,`rua`) VALUES (5,'78015242','SC','FlorianÃ³polis','Centro','126','Rua  6');
INSERT INTO `endereco` (`id`,`cep`,`estado`,`cidade`,`bairro`,`numero`,`rua`) VALUES (6,'41857751','SC','ChapecÃ³','Centro','125','Rua 66');
INSERT INTO `cliente`	(`id`, `nome`, `sobrenome`, `cpf`, `idendereco`) VALUES ( 1, 'edson','arantes', '11122233311','2');
INSERT INTO `cliente`	(`id`, `nome`, `sobrenome`, `cpf`, `idendereco`) VALUES ( 2, 'arthur','antunes', '11122233322','4');
INSERT INTO `cliente`	(`id`, `nome`, `sobrenome`, `cpf`, `idendereco`) VALUES ( 3, 'marcos','andre', '11122233333','6');

select * from cliente;