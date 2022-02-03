-- Alter PRI_MATRIZ_RIESGO_VARIABLE
alter table PRI_MATRIZ_RIESGO_VARIABLE add campo1 varchar2(100);

update PRI_MATRIZ_RIESGO_VARIABLE set campo1 = ID_SEGMENTO;

alter table PRI_MATRIZ_RIESGO_VARIABLE modify ID_SEGMENTO null;

update PRI_MATRIZ_RIESGO_VARIABLE set id_segmento = null;

alter table PRI_MATRIZ_RIESGO_VARIABLE modify ID_SEGMENTO number(10);

update PRI_MATRIZ_RIESGO_VARIABLE set id_segmento = campo1;

alter table PRI_MATRIZ_RIESGO_VARIABLE modify ID_SEGMENTO not null;

alter table PRI_MATRIZ_RIESGO_VARIABLE drop column campo1;

select * from PRI_MATRIZ_RIESGO_VARIABLE;

ALTER TABLE PRI_MATRIZ_RIESGO_VARIABLE ADD (
  CONSTRAINT FK_PRI_MATRIZ_RIESGO_VARI_3 
  FOREIGN KEY (ID_SEGMENTO) 
  REFERENCES PRI_SEGMENTO (ID_SEGMENTO));
  
-- Alter PRI_Perfil
alter table PRI_PERFIL RENAME COLUMN SEGMENTO TO ID_SEGMENTO;

alter table PRI_PERFIL add campo1 varchar2(100);

update PRI_PERFIL set campo1 = ID_SEGMENTO;

alter table PRI_PERFIL modify ID_SEGMENTO null;

update PRI_PERFIL set id_segmento = null;

alter table PRI_PERFIL modify ID_SEGMENTO number(10);

update PRI_PERFIL set id_segmento = campo1;

alter table PRI_PERFIL modify ID_SEGMENTO not null;

alter table PRI_PERFIL drop column campo1;

select * from PRI_PERFIL;

ALTER TABLE PRI_PERFIL ADD (
  CONSTRAINT FK_PRI_PERFIL_2 
  FOREIGN KEY (ID_SEGMENTO) 
  REFERENCES PRI_SEGMENTO (ID_SEGMENTO));