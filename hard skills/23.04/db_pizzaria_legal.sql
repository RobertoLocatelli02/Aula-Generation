-- MySQL Script generated by MySQL Workbench
-- Thu Apr 22 15:28:34 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_pizzaria_legal
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_pizzaria_legal
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_pizzaria_legal` DEFAULT CHARACTER SET utf8 ;
USE `db_pizzaria_legal` ;

-- -----------------------------------------------------
-- Table `db_pizzaria_legal`.`tb_categoria`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_pizzaria_legal`.`tb_categoria` ;

CREATE TABLE IF NOT EXISTS `db_pizzaria_legal`.`tb_categoria` (
  `id_categoria` INT NOT NULL AUTO_INCREMENT,
  `tipo` VARCHAR(45) NOT NULL,
  `disponibilidade` TINYINT NOT NULL,
  PRIMARY KEY (`id_categoria`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_pizzaria_legal`.`tb_pizza`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_pizzaria_legal`.`tb_pizza` ;

CREATE TABLE IF NOT EXISTS `db_pizzaria_legal`.`tb_pizza` (
  `id_pizza` INT NOT NULL AUTO_INCREMENT,
  `sabor` VARCHAR(45) NOT NULL,
  `borda` TINYINT NOT NULL,
  `preço` DECIMAL(10,2) NOT NULL,
  `categoria_id` INT NOT NULL,
  PRIMARY KEY (`id_pizza`),
  INDEX `fk_tb_pizza_tb_categoria_idx` (`categoria_id` ASC) VISIBLE,
  CONSTRAINT `fk_tb_pizza_tb_categoria`
    FOREIGN KEY (`categoria_id`)
    REFERENCES `db_pizzaria_legal`.`tb_categoria` (`id_categoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


INSERT INTO `db_pizzaria_legal`.`tb_categoria` (`tipo`, `disponibilidade`) VALUES ('salgada', true);
INSERT INTO `db_pizzaria_legal`.`tb_categoria` (`tipo`, `disponibilidade`) VALUES ('doce', false);

INSERT INTO `db_pizzaria_legal`.`tb_pizza` (`sabor`, `borda`, `preço`, `categoria_id`) VALUES ('Mussarela', true, '28.00', '1');
INSERT INTO `db_pizzaria_legal`.`tb_pizza` (`sabor`, `borda`, `preço`, `categoria_id`) VALUES ('Calabresa', true, '28.00', '1');
INSERT INTO `db_pizzaria_legal`.`tb_pizza` (`sabor`, `borda`, `preço`, `categoria_id`) VALUES ('Toscana', false, '30.00', '1');
INSERT INTO `db_pizzaria_legal`.`tb_pizza` (`sabor`, `borda`, `preço`, `categoria_id`) VALUES ('Portuguesa', false, '35.00', '1');
INSERT INTO `db_pizzaria_legal`.`tb_pizza` (`sabor`, `borda`, `preço`, `categoria_id`) VALUES ('Frango com catupiry', true, '31.00', '1');
INSERT INTO `db_pizzaria_legal`.`tb_pizza` (`sabor`, `borda`, `preço`, `categoria_id`) VALUES ('Caipira', true, '34.00', '1');
INSERT INTO `db_pizzaria_legal`.`tb_pizza` (`sabor`, `borda`, `preço`, `categoria_id`) VALUES ('Chocomorango', false, '45.00', '2');
INSERT INTO `db_pizzaria_legal`.`tb_pizza` (`sabor`, `borda`, `preço`, `categoria_id`) VALUES ('Chocobanana', false, '45.00', '2');

 SELECT * FROM tb_pizza;

-- SELECT * FROM tb_pizza WHERE preço >= 45.00;
-- SELECT * FROM tb_pizza WHERE preço >= 29.00 and preço <= 60.00;
-- SELECT * FROM tb_pizza WHERE sabor LIKE "%C%";
-- SELECT tb_pizza.sabor, tb_pizza.borda, tb_pizza.preço, tb_categoria.tipo FROM tb_pizza INNER JOIN tb_categoria ON tb_categoria.id_categoria = tb_pizza.categoria_id;
-- SELECT tb_pizza.sabor, tb_pizza.borda, tb_pizza.preço, tb_categoria.tipo FROM tb_pizza INNER JOIN tb_categoria ON tb_categoria.id_categoria = tb_pizza.categoria_id WHERE tb_categoria.tipo = "doce";