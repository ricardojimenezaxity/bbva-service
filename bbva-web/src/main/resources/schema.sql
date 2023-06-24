
CREATE TABLE `C_Cliente` (
  `PK_ID_CLIENTE` integer PRIMARY KEY,
  `NOMBRE` varchar(50),
  `AP_PATERNO` varchar(30),
  `AP_MATERNO` varchar(30),
  `TELEFONO` varchar(20),
  `CORREO` varchar(50),
  `DIRECCION` varchar(100)
);

CREATE TABLE `C_CUENTAS_BAN` (
  `PK_ID_CUENTA` integer PRIMARY KEY,
  `NO_CUENTA` varchar(50),
  `FK_ID_CLIENTE` integer,
  `SALDO` double,
  `VIGENCIA` date
);

CREATE TABLE `C_TARJETAS` (
  `PK_ID_TARJETA` integer PRIMARY KEY,
  `NO_TARJETA` integer,
  `CLABE` integer,
  `VENCIMIENTO` date,
  `CVV` integer,
  `STATUS` varchar(20),
  `SALDO` double
);

CREATE TABLE `C_TIPOS_TRANS` (
  `PK_ID_TIPO` integer PRIMARY KEY,
  `DESCRIPCION` varchar(50)
);

CREATE TABLE `T_TRANSACCION` (
  `PK_ID_TRANS` integer PRIMARY KEY,
  `FK_CUENTA_B` varchar(50),
  `FK_TIPO` integer,
  `MONTO` double,
  `FK_FECHA` integer,
  `C_DESTINO` varchar(50),
  `TARJETA_DESTINO` integer,
  `DESTINATARIO` varchar(50),
  `CLABE_DESTINO` integer,
  `BANCO_DESTINO` varchar(50),
  `LOCACION` varchar(100),
  `SPEI` varchar(50)
);

CREATE TABLE `C_FECHA` (
  `PK_ID_FECHA` integer PRIMARY KEY,
  `FECHA` timestamp,
  `AÑO` integer,
  `MES` integer,
  `DIA` integer
);

CREATE TABLE `C_COD_RETIRO` (
  `PK_ID_CODIGO` integer PRIMARY KEY,
  `CODIGO` integer
);