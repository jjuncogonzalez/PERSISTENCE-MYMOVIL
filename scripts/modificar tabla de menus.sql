ALTER TABLE `testmymovil`.`gm_men` 
ADD COLUMN `men_des` VARCHAR(100) NULL DEFAULT NULL COMMENT 'Descripción' AFTER `usu_mod`,
ADD COLUMN `men_lin` VARCHAR(50) NOT NULL COMMENT 'link ' AFTER `men_des`,
ADD COLUMN `men_ico` VARCHAR(100) NULL DEFAULT NULL COMMENT 'icono que se asociara al menu' AFTER `men_lin`,
ADD COLUMN `men_tip` TINYINT NULL DEFAULT 1 COMMENT '1 = menu, 0= header' AFTER `men_ico`;

//--agregar columna orden menus-------------------------

ALTER TABLE `testmymovil`.`gm_men` 
ADD COLUMN `men_ord` INT NOT NULL COMMENT 'orden de los menus' AFTER `men_tip`,
CHANGE COLUMN `men_lin` `men_lin` VARCHAR(50) NULL DEFAULT '' COMMENT 'link ' ,
CHANGE COLUMN `men_ico` `men_ico` VARCHAR(100) NULL DEFAULT '' COMMENT 'icono que se asociara al menu' ;

insert into gm_men (usu_cre, dat_mod, usu_mod, men_des, men_lin,men_ico,men_tip) values ('1',null,null,'Parametrización','','fa fa-suitcase',0,1);
insert into gm_men (usu_cre, dat_mod, usu_mod, men_des, men_lin,men_ico,men_tip) values ('1',null,null,'Compañías','/pages/gm_com/index','fa fa-suitcase',1,2);
insert into gm_men (usu_cre, dat_mod, usu_mod, men_des, men_lin,men_ico,men_tip) values ('1',null,null,'Soporte','','fa fa-suitcase',0,3);
insert into gm_men (usu_cre, dat_mod, usu_mod, men_des, men_lin,men_ico,men_tip) values ('1',null,null,'Usuarios','/pages/gm_use_pla/index','fa fa-user',1,4);


//----------------agregar columnas estado menu men_est y cabecera asociada  cab_id------------------------ 
ALTER TABLE `testmymovil`.`gm_men` 
ADD COLUMN `men_est` TINYINT(4) NULL DEFAULT '0' COMMENT 'Estado 0 (false) = inactivo, 1 (true) = activo' AFTER `men_ord`,
ADD COLUMN `cab_id` INT NULL DEFAULT '0' COMMENT 'Id dek header asociado' AFTER `men_est`;