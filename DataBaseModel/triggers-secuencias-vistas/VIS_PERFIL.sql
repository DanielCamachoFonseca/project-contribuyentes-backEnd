/* Formatted on 6/02/2022 11:50:15 p. m. (QP5 v5.149.1003.31008) */
CREATE OR REPLACE FORCE VIEW VIS_PERFIL
(
   ID_PERFIL,
   NIT,
   PERIODO,
   ID_MATRIZ_RIESGO,
   NOMBRE_MATRIZ,
   ID_SEGMENTO,
   NOMBRE_SEGMENTO,
   FECHA_DESDE,
   PESO,
   VALOR_PERFIL,
   VALOR_EJE_X,
   VALOR_EJE_Y,
   VALOR_INCUMPLIMIENTO,
   VALOR_LOG,
   NUMERO_CUADRANTE,
   USUARIO_AUDITORIA,
   FECHA_AUDITORIA
)
AS
   SELECT ID_PERFIL,
          NIT,
          PERIODO,
          ID_MATRIZ_RIESGO,
          (SELECT nombre
             FROM PRI_MATRIZ_RIESGO m
            WHERE m.ID_MATRIZ_RIESGO = p.ID_MATRIZ_RIESGO)
             Nombre_matriz,
          ID_SEGMENTO,
          (SELECT nombre
             FROM PRI_segmento s
            WHERE s.ID_SEGMENTO = p.ID_SEGMENTO)
             Nombre_segmento,
          FECHA_DESDE,
          PESO,
          VALOR_PERFIL,
          VALOR_EJE_X,
          VALOR_EJE_Y,
          VALOR_INCUMPLIMIENTO,
          VALOR_LOG,
          NUMERO_CUADRANTE,
          USUARIO_AUDITORIA,
          FECHA_AUDITORIA
     FROM PRI_PERFIL p;
