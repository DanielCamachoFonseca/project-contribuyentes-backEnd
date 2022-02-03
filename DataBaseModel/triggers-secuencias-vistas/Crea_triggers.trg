CREATE OR REPLACE TRIGGER trg_matriz_riesgo
BEFORE INSERT   ON PRI_MATRIZ_RIESGO   FOR EACH ROW
DECLARE
   v_username varchar2(10);
BEGIN
   -- Obtiene el nombre del usuario
   SELECT user INTO v_username  FROM dual;

   -- Actualzia la fecha y hora de la creacion del registro
   :new.FECHA_AUDITORIA := sysdate;

   -- Actualzia el nombre dle usuario que hizo el cambio
   :new.USUARIO_AUDITORIA := v_username;
   
   -- Actualiza el id llave primaria del registro
   :new.ID_MATRIZ_RIESGO := SEQ_MATRIZ_RIESGO.nextval;

  -- Actualzia el estado activo del registro
   :new.ESTADO := 'ACTIVO';
END;
/

CREATE OR REPLACE TRIGGER trg_matriz_riesgo_cuadrante
BEFORE INSERT   ON PRI_MATRIZ_RIESGO_CUADRANTE   FOR EACH ROW
DECLARE
   v_username varchar2(10);
BEGIN
   -- Obtiene el nombre del usuario
   SELECT user INTO v_username  FROM dual;

   -- Actualzia la fecha y hora de la creacion del registro
   :new.FECHA_AUDITORIA := sysdate;

   -- Actualzia el nombre dle usuario que hizo el cambio
   :new.USUARIO_AUDITORIA := v_username;
   
   -- Actualiza el id llave primaria del registro
   :new.ID_MATRIZ_RIESGO_CUADRANTE := SEQ_MATRIZ_RIESGO_CUADRANTE.nextval;

  -- Actualzia el estado activo del registro
   :new.ESTADO := 'ACTIVO';
END;
/

CREATE OR REPLACE TRIGGER trg_matriz_riesgo_variable
BEFORE INSERT   ON PRI_MATRIZ_RIESGO_VARIABLE   FOR EACH ROW
DECLARE
   v_username varchar2(10);
BEGIN
   -- Obtiene el nombre del usuario
   SELECT user INTO v_username  FROM dual;

   -- Actualzia la fecha y hora de la creacion del registro
   :new.FECHA_AUDITORIA := sysdate;

   -- Actualzia el nombre dle usuario que hizo el cambio
   :new.USUARIO_AUDITORIA := v_username;
   
   -- Actualiza el id llave primaria del registro
   :new.ID_MATRIZ_RIESGO_VARIABLE := SEQ_MATRIZ_RIESGO_VARIABLE.nextval;

  -- Actualzia el estado activo del registro
   :new.ESTADO := 'ACTIVO';
END;
/

CREATE OR REPLACE TRIGGER trg_segmento
BEFORE INSERT   ON PRI_SEGMENTO   FOR EACH ROW
DECLARE
   v_username varchar2(10);
BEGIN
   -- Obtiene el nombre del usuario
   SELECT user INTO v_username  FROM dual;

   -- Actualzia la fecha y hora de la creacion del registro
   :new.FECHA_AUDITORIA := sysdate;

   -- Actualzia el nombre dle usuario que hizo el cambio
   :new.USUARIO_AUDITORIA := v_username;
   
   -- Actualiza el id llave primaria del registro
   :new.ID_SEGMENTO := SEQ_SEGMENTO.nextval;

  -- Actualzia el estado activo del registro
   :new.ESTADO := 'ACTIVO';
END;
/

CREATE OR REPLACE TRIGGER trg_variable
BEFORE INSERT   ON PRI_VARIABLE   FOR EACH ROW
DECLARE
   v_username varchar2(10);
BEGIN
   -- Obtiene el nombre del usuario
   SELECT user INTO v_username  FROM dual;

   -- Actualzia la fecha y hora de la creacion del registro
   :new.FECHA_AUDITORIA := sysdate;

   -- Actualzia el nombre dle usuario que hizo el cambio
   :new.USUARIO_AUDITORIA := v_username;
   
   -- Actualiza el id llave primaria del registro
   :new.ID_VARIABLE := SEQ_VARIABLE.nextval;

  -- Actualzia el estado activo del registro
   :new.ESTADO := 'ACTIVO';
END;
/

/* ejemplos
insert into PRI_MATRIZ_RIESGO values (null,'Matriz 2',sysdate,null,null,null,null);

insert into PRI_MATRIZ_RIESGO_CUADRANTE values (null,2, 99,0,1,0,1,'VERDE',null,null,null);

insert into PRI_MATRIZ_RIESGO_VARIABLE values (null,2,1,1,null,null,'S',null, null,null,null);

insert into PRI_SEGMENTO values (null,'segmento 2',null,null,null);

insert into PRI_VARIABLE values (null,'variable 2', 'Base datos','Tablas de declaraciones', 'Formula 2', 'MENSUAL',null,null,null,null);

*/