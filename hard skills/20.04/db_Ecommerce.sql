-- MySQL Script generated by MySQL Workbench
-- Tue Apr 20 20:05:35 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_ecommerce
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_ecommerce
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_ecommerce` DEFAULT CHARACTER SET utf8 ;
USE `db_ecommerce` ;

-- -----------------------------------------------------
-- Table `db_ecommerce`.`tb_marcas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_ecommerce`.`tb_marcas` ;

CREATE TABLE IF NOT EXISTS `db_ecommerce`.`tb_marcas` (
  `id_marcas` INT NOT NULL AUTO_INCREMENT,
  `marca` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_marcas`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_ecommerce`.`tb_tipos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_ecommerce`.`tb_tipos` ;

CREATE TABLE IF NOT EXISTS `db_ecommerce`.`tb_tipos` (
  `id_tipos` INT NOT NULL AUTO_INCREMENT,
  `tipo` VARCHAR(45) NULL,
  PRIMARY KEY (`id_tipos`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_ecommerce`.`tb_produtos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_ecommerce`.`tb_produtos` ;

CREATE TABLE IF NOT EXISTS `db_ecommerce`.`tb_produtos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `preço` VARCHAR(45) NOT NULL,
  `marca_id` INT NOT NULL,
  `tipo_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_tb_produtos_tb_marcas_idx` (`marca_id` ASC) VISIBLE,
  INDEX `fk_tb_produtos_tb_tipos1_idx` (`tipo_id` ASC) VISIBLE,
  CONSTRAINT `fk_tb_produtos_tb_marcas`
    FOREIGN KEY (`marca_id`)
    REFERENCES `db_ecommerce`.`tb_marcas` (`id_marcas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_produtos_tb_tipos1`
    FOREIGN KEY (`tipo_id`)
    REFERENCES `db_ecommerce`.`tb_tipos` (`id_tipos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

INSERT INTO `db_ecommerce`.`tb_marcas` (`marca`) VALUES ('NIKE');
INSERT INTO `db_ecommerce`.`tb_marcas` (`marca`) VALUES ('SAMSUNG');
INSERT INTO `db_ecommerce`.`tb_marcas` (`marca`) VALUES ('ELECTROLUX');
INSERT INTO `db_ecommerce`.`tb_marcas` (`marca`) VALUES ('YPÊ');
INSERT INTO `db_ecommerce`.`tb_marcas` (`marca`) VALUES ('BIC');

INSERT INTO `db_ecommerce`.`tb_tipos` (`tipo`) VALUES ('Roupas');
INSERT INTO `db_ecommerce`.`tb_tipos` (`tipo`) VALUES ('Eletrodomésticos');
INSERT INTO `db_ecommerce`.`tb_tipos` (`tipo`) VALUES ('Produtos de limpeza');
INSERT INTO `db_ecommerce`.`tb_tipos` (`tipo`) VALUES ('Material escolar');

INSERT INTO `db_ecommerce`.`tb_produtos` (`nome`, `preço`, `marca_id`, `tipo_id`) VALUES ('Camisa', '39', '1', '1');
INSERT INTO `db_ecommerce`.`tb_produtos` (`nome`, `preço`, `marca_id`, `tipo_id`) VALUES ('Celular', '800', '2', '2');
INSERT INTO `db_ecommerce`.`tb_produtos` (`nome`, `preço`, `marca_id`, `tipo_id`) VALUES ('Geladeira', '2200', '3', '2');
INSERT INTO `db_ecommerce`.`tb_produtos` (`nome`, `preço`, `marca_id`, `tipo_id`) VALUES ('Fogão 4 bocas', '2000', '3', '2');
INSERT INTO `db_ecommerce`.`tb_produtos` (`nome`, `preço`, `marca_id`, `tipo_id`) VALUES ('Sabão em pó', '7', '4', '3');
INSERT INTO `db_ecommerce`.`tb_produtos` (`nome`, `preço`, `marca_id`, `tipo_id`) VALUES ('Caneta azul', '1', '5', '4');
INSERT INTO `db_ecommerce`.`tb_produtos` (`nome`, `preço`, `marca_id`, `tipo_id`) VALUES ('Multiuso', '1', '4', '3');
INSERT INTO `db_ecommerce`.`tb_produtos` (`nome`, `preço`, `marca_id`, `tipo_id`) VALUES ('Caneta preta', '1', '5', '4');

SELECT * FROM tb_produtos;
-- SELECT * FROM tb_produtos WHERE preço < 500;
-- SELECT * FROM tb_produtos WHERE preço >= 500;