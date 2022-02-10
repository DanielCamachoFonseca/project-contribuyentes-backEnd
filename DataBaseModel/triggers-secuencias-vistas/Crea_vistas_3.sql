create or replace view VIS_FUENTES_INFORMACION as
SELECT ID_FUENTE_INFORMACION, NIT, PERIODO, 
   ID_VARIABLE, (select nombre from PRI_variable v where v.ID_variable = f.ID_VARIABLE) Nombre_variable,
   ID_SEGMENTO,
   (select nombre from PRI_segmento s where s.ID_SEGMENTO = F.ID_SEGMENTO) Nombre_segmento,
   VALOR_VARIABLE, 
   USUARIO_AUDITORIA, FECHA_AUDITORIA
FROM PRI_FUENTES_INFORMACION f;