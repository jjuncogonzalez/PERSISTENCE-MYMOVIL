ALTER TABLE `mymovil`.`gm_col_gen` 
ADD COLUMN `dat_cre` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Fecha Creacion ',
ADD COLUMN `usu_cre` int(11) NOT NULL COMMENT 'Usuario Creacion',
ADD COLUMN `dat_mod` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT 'Fecha Modificacion',
ADD COLUMN `usu_mod` int(11) DEFAULT NULL COMMENT 'Usuario Modificacion';