SET DEFINE OFF;
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (30, 'Ingresos declarados en ISR', 'Base datos', 'Tablas de declaraciones', 'Valor de los ingresos declarados en ISR por contribuyente', 
    'MENSUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:49', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (31, 'Ingresos declarados en IVA', 'Base datos', 'Tablas de declaraciones', 'Valor de los ingresos declarados en IVA por contribuyente', 
    'MENSUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:49', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (1, 'Contribuyente no localizados en RTU, 0=Localizado, 1= No localizado', 'Base datos', 'Oracle forms, FISAT, RTU.
Lista de Contribuyentes', 'Contribuyente con marcación: No localizado en RTU y no se encuentran en el registro RTU', 
    'ANUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:48', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (2, 'Cantidad de establecimientos por contribuyentes activos', 'Base datos', 'RTU
Establecimientos o sucursales', 'Cantidad de establecimientos de cada contribuyente que esta en el RTU', 
    'ANUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:48', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (3, 'Contribuyente con ratificación de RTU / sin ratificación, 0=Con Ratificación, 1=Sin Ratificación', 'Base datos', 'RTU
Declaraciones de IVA
Ratificaciones en RTU
Oracle Nube', 'Contribuyente Obligado al IVA y tiene Ratificación de RTU igual a 0 si no tiene Ratificación = 1', 
    'ANUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:48', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (4, 'Contribuyente con actualización en el RTU del régimen al que pertenece el contribuyente,  1=Se traslado de Régimen, 2= No se traslado de Régimen', 'Base datos', 'RTU
Régimen RTU
Solo para pequeños', 'Actualización en el RTU del régimen al que pertenece el contribuyente, realizada de oficio para pequeños que se reclasifican por la SAT, 1=Se traslado de Régimen, 2= No se traslado de Régimen', 
    'MENSUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:48', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (5, 'Declaraciones de IVA con crédito fiscal por mas de 3 meses.', 'Base datos', 'Declaraciones de IVA', 'Cantidad de Declaraciones de IVA con motivo (justificación de crédito fiscal por mas de 3 meses)', 
    'MENSUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:48', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (6, 'Cantidad de declaraciones de Renta con Ingresos por ventas y sin impuesto a pagar', 'Base datos', 'Declaraciones de ISR', 'Cantidad de Declaración de ISR con ingresos de ventas y sin impuesto a pagar', 
    'ANUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:48', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (7, 'Cantidad de declaraciones de Renta con Gastos operacionales y sin impuesto a pagar', 'Base datos', 'Declaraciones de ISR', 'Cantidad de Declaración de ISR con gastos operacionales y sin impuesto a pagar', 
    'ANUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:48', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (8, 'Cantidad de declaraciones presentadas fuera de plazo ISR', 'Base datos', 'Declaraciones y 
Plazos de los impuestos
Omisos, Oracle', 'Cantidad de DDJJ presentadas fuera de plazo, para renta', 
    'ANUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:48', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (9, 'Cantidad de Rectificativas de ISR', 'Base datos', 'Declaraciones y Rectificativas', 'Cantidad de DDJJ en ISR Rectificativas por contribuyente y periodo', 
    'ANUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:48', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (10, 'Cantidad de omisiones por Contribuyente con estado Activo, obligado a Declarar y no presentan DDJJ', 'Base datos', 'Estado de la tabla de Contribuyentes, Declaraciones.
Lista de obligaciones en RTU
Omisos
Oracle BD1', 'Cantidad de omisiones por contribuyentes con estado = Activo y no presentan DDJJ, para ISR, IVA e ISO', 
    'MENSUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:48', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (11, 'Sumatoria del Valor estimado del impuesto omitido de los periodos no declarados', 'Base datos', 'Tabla de Declaraciones, RTU y Obligaciones
Omisos, Oracle BD1', 'Valor estimado del impuesto no declarado (periodos omisos)', 
    'MENSUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:48', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (12, 'Contribuyente con obligación  y sin ninguna presentación de declaraciones', 'Base datos', 'Tabla de Declaraciones, RTU y Obligaciones', 'Contribuyentes inscritos en RTU y con obligaciones y nunca han declarado, 0=SI declaro 1=NO declaro', 
    'MENSUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:48', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (13, 'Contribuyentes que son sujetos de retención y no presentan declaraciones', 'Base datos', 'Tabla de Declaraciones, RTU, Obligaciones
Cruces con RetenIVA y Reten ISR', 'Contribuyentes que se les realizo retención y no presentaron declaración, para el impuesto y periodo, 0=Si Declaro,1= No declaro', 
    'MENSUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:48', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (14, 'Cantidad de periodos por Contribuyentes que emiten facturas y no declaran', 'Base datos', 'Tabla de Declaraciones, RTU, FEL, Cruces entre FEL y Declaración IVA,
Consulta 360', 'Cantidad de Periodos por contribuyente que tiene Facturas y no tiene Declaración de IVA, para el periodo de emisión de la factura', 
    'MENSUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:48', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (15, 'Cantidad de periodos con diferencias entre FEL y las Declaraciones de IVA', 'Nube', 'Tabla de Declaraciones, RTU, FEL', 'Cantidad de periodos con Diferencias entre valores de las FEL y la casilla de ventas de la Declaración de IVA', 
    'MENSUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:49', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (16, 'Valor de diferencias entre FEL y las Declaraciones de IVA', 'Nube', 'Tabla de Declaraciones, RTU, FEL,
Nube Azure', 'Suma del valor de Diferencias entre valores de las FEL y la casilla de ventas de la Declaración de IVA', 
    'MENSUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:49', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (17, 'Cantidad de periodos con diferencias entre El informe de Proveedores de IVA y la DDJJ de IVA', 'Nube', 'Tabla de Declaraciones, RTU, Informe de Proveedores de IVA', 'Cantidad de periodos con Diferencias entre valores de la casilla de compras de la DDJJ de IVA y los informes de Proveedores de IVA, donde las compras sean mayores al informe', 
    'MENSUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:49', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (18, 'Valor de diferencias entre El informe de Proveedores de IVA y la DDJJ de IVA', 'Nube', 'Tabla de Declaraciones, RTU, Informe de Proveedores de IVA', 'Suma del valor de Diferencias entre valores de la casilla de compras de la DDJJ de IVA y los informes de Proveedores de IVA, donde las compras sean mayores al informe', 
    'MENSUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:49', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (19, 'Cantidad de periodos con diferencias de activos entre ISR vs ISO.', 'Nube', 'Tabla de Declaraciones, 
Nube Azure', 'Cantidad y suma de diferencias de activos de ISR vs ISO', 
    'MENSUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:49', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (20, 'Valor de las diferencias de activos entre ISR vs ISO.', 'Nube', 'Tabla de Declaraciones,
Numbe Azure', 'Cantidad y suma de diferencias de activos de ISR vs ISO', 
    'MENSUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:49', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (21, 'Monto de obligaciones en mora', 'Base datos', 'Saldo de la tabla de Cuenta Corriente', 'Valor de la mora por contribuyente en CCC por impuesto y periodo', 
    'MENSUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:49', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (22, 'Cantidad de obligaciones con saldo en mora', 'Base datos', 'Saldo de la tabla de Cuenta Corriente', 'Cantidad de Periodos son saldo en mora.', 
    'MENSUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:49', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (23, 'Cantidad de Inconsistencias de cuenta corriente', 'Base datos', 'Tabla de inconsistencias de CCC, Cuenta Corriente', 'Numero de inconsistencias', 
    'MENSUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:49', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (24, 'Valor saldo en mora de vehículos', 'Base datos', 'Saldo de la tabla de Cuenta Corriente
Registro de Vehiculos', 'Valor saldo en mora en vehículos en CCC', 
    'ANUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:49', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (25, 'Cantidad de facilidades de pago incumplidas', 'Base datos', 'CCC, Facilidades de pago', 'Cantidad de facilidades de pago incumplidas, con mas de una cuota no pagada.', 
    'MENSUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:49', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (26, 'Cantidad de Facilidades de Pago activas', 'Base datos', 'Facilidades de Pagos
Oracle', 'Cantidad de Facilidades de pago por contribuyente', 
    'MENSUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:49', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (27, 'Cantidad de casos de Fiscalización trasladados a Económico coactivo FISAT-Resoluciones/Expedientes', 'Base datos', 'Procesos económico coactivo, Fiscalizacion FISAT', 'Cantidad de casos por contribuyente que pasan de fiscalización a económico coactivo', 
    'MENSUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:49', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (28, 'Cantidad de Procesos en Económico Coactivo SGEL', 'Base datos', 'Procesos económico coactivo,
SGEL', 'Cantidad de casos por contribuyente que están en económico coactivo', 
    'MENSUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:49', 'MM/DD/YYYY HH24:MI:SS'));
Insert into PRI_VARIABLE
   (ID_VARIABLE, NOMBRE, FUENTE_SISTEMA, FUENTE_INFORMACION, FORMULA, PERIODICIDAD, ESTADO, USUARIO_AUDITORIA, FECHA_AUDITORIA)
 Values
   (29, 'Cantidad de Procesos penales SGEL', 'Base datos', 'Tablas de actuaciones de fiscalización
SGEL', 'Contribuyentes con cantidad de actuaciones por impuesto y periodo', 
    'MENSUAL', 'ACTIVO', 'USER_SAT', TO_DATE('01/18/2022 21:06:49', 'MM/DD/YYYY HH24:MI:SS'));
COMMIT;
