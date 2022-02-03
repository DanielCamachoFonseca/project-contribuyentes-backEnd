create or replace view VIS_MATRIZ_RIESGO_VARIABLE AS
SELECT ID_MATRIZ_RIESGO_VARIABLE, ID_MATRIZ_RIESGO, 
(select nombre from PRI_MATRIZ_RIESGO m where m.ID_MATRIZ_RIESGO = mv.ID_MATRIZ_RIESGO) Nombre_matriz,
ID_VARIABLE, 
(select nombre from PRI_variable v where v.ID_variable = mv.ID_VARIABLE) Nombre_variable,
   ID_SEGMENTO, 
(select nombre from PRI_segmento s where s.ID_SEGMENTO = mv.ID_SEGMENTO) Nombre_segmento,
   FUENTE_PESO_Y, FUENTE_EJE_X, 
   FUENTE_EJE_Y, FUENTE_PESO_CONTRIBUYENTE, ESTADO, 
   USUARIO_AUDITORIA, FECHA_AUDITORIA
FROM PRI_MATRIZ_RIESGO_VARIABLE mv;

create or replace view VIS_MATRIZ_RIESGO_CUADRANTE AS
SELECT ID_MATRIZ_RIESGO_CUADRANTE, ID_MATRIZ_RIESGO,
(select nombre from PRI_MATRIZ_RIESGO m where m.ID_MATRIZ_RIESGO = mc.ID_MATRIZ_RIESGO) Nombre_matriz,
 NUMERO_CUADRANTE, 
   VALOR_EJE_X_DESDE, VALOR_EJE_X_HASTA, VALOR_EJE_Y_DESDE, 
   VALOR_EJE_Y_HASTA, COLOR, ESTADO, 
   USUARIO_AUDITORIA, FECHA_AUDITORIA
FROM PRI_MATRIZ_RIESGO_CUADRANTE mc;

create or replace view VIS_PERFIL AS
SELECT 
   ID_PERFIL, NIT, PERIODO, 
   ID_MATRIZ_RIESGO, 
(select nombre from PRI_MATRIZ_RIESGO m where m.ID_MATRIZ_RIESGO = p.ID_MATRIZ_RIESGO) Nombre_matriz,
   SEGMENTO, 
(select nombre from PRI_segmento s where s.ID_SEGMENTO = p.SEGMENTO) Nombre_segmento,
   FECHA_DESDE, 
   PESO, VALOR_PERFIL, VALOR_EJE_X, 
   VALOR_EJE_Y, VALOR_INCUMPLIMIENTO, VALOR_LOG, 
   NUMERO_CUADRANTE, USUARIO_AUDITORIA, FECHA_AUDITORIA
FROM PRI_PERFIL p;

create or replace view VIS_PERFIL_VARIABLE AS
SELECT pv.ID_PERFIL_VARIABLE, pv.ID_PERFIL, 
   pv.ID_MATRIZ_RIESGO_VARIABLE,mrv.id_variable,mrv.nombre_variable,
   pv.VALOR_VARIABLE, pv.VALOR_NORMALIZADO, pv.VALOR_RIESGO, 
   pv.USUARIO_AUDITORIA, pv.FECHA_AUDITORIA
FROM PRI_PERFIL_VARIABLE pv, VIS_MATRIZ_RIESGO_VARIABLE mrv
where pv.id_matriz_riesgo_variable = mrv.id_matriz_riesgo_variable
order by id_perfil,id_variable;
