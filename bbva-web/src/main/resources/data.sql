-- clientes
INSERT INTO `T_CLIENTE` (`ID_CLIENTE`, `NOMBRE`, `AP_PATERNO`, `AP_MATERNO`, `TELEFONO`, `CORREO`, `DIRECCION`) VALUES
(1, 'Juan', 'García', 'López', '555-1234', 'juan@example.com', 'Calle 123'),
(2, 'María', 'Martínez', 'Gómez', '555-5678', 'maria@example.com', 'Avenida 456'),
(3, 'Carlos', 'Rodríguez', 'Pérez', '555-9012', 'carlos@example.com', 'Plaza 789'),
(4, 'Ana', 'Hernández', 'Sánchez', '555-3456', 'ana@example.com', 'Calle 789'),
(5, 'Pedro', 'López', 'González', '555-7890', 'pedro@example.com', 'Avenida 012'),
(6, 'Luisa', 'Torres', 'Ramírez', '555-2345', 'luisa@example.com', 'Plaza 345'),
(7, 'Sergio', 'Vargas', 'Jiménez', '555-6789', 'sergio@example.com', 'Calle 678'),
(8, 'Marta', 'González', 'Rojas', '555-9012', 'marta@example.com', 'Avenida 901'),
(9, 'Javier', 'Silva', 'Pérez', '555-2345', 'javier@example.com', 'Plaza 234'),
(10, 'Patricia', 'Gómez', 'Sánchez', '555-5678', 'patricia@example.com', 'Calle 567'),
(11, 'Roberto', 'Jiménez', 'López', '555-9012', 'roberto@example.com', 'Avenida 890'),
(12, 'Alejandra', 'Pérez', 'González', '555-3456', 'alejandra@example.com', 'Plaza 123'),
(13, 'Fernando', 'Rojas', 'Martínez', '555-7890', 'fernando@example.com', 'Calle 456'),
(14, 'Laura', 'López', 'Hernández', '555-1234', 'laura@example.com', 'Avenida 789'),
(15, 'Gabriela', 'Sánchez', 'Torres', '555-5678', 'gabriela@example.com', 'Plaza 012'),
(16, 'Ricardo', 'Ramírez', 'Vargas', '555-9012', 'ricardo@example.com', 'Calle 345'),
(17, 'Martha', 'Jiménez', 'Gómez', '555-2345', 'martha@example.com', 'Avenida 678'),
(18, 'Antonio', 'Pérez', 'Silva', '555-6789', 'antonio@example.com', 'Plaza 901'),
(19, 'Carmen', 'González', 'Rojas', '555-9012', 'carmen@example.com', 'Calle 234'),
(20, 'Andrés', 'López', 'Gómez', '555-3456', 'andres@example.com', 'Avenida' );

-- tipo transacciones
INSERT INTO `C_TIPOS_TRANS` (`ID_TIPOTRANS`, `DESCRIPCION`) VALUES
(1, 'Depósito'),
(2, 'Retiro'),
(3, 'Transferencia entre cuentas'),
(4, 'Transferencia SPEI');

-- bancos
INSERT INTO `C_BIN_BANCOS` (`ID_BANCO`, `PREFIJO_C`, `PREFIJO_T`, `BANCO`) VALUES
(1, '1234', '5678', 'Banco A'),
(2, '2345', '6789', 'Banco B'),
(3, '3456', '7890', 'Banco C'),
(4, '4567', '8901', 'Banco D'),
(5, '5678', '9012', 'Banco E'),
(6, '6789', '0123', 'Banco F'),
(7, '7890', '1234', 'Banco G'),
(8, '8901', '2345', 'Banco H'),
(9, '9012', '3456', 'Banco I'),
(10, '0123', '4567', 'Banco J'),
(11, '1234', '5678', 'Banco K'),
(12, '2345', '6789', 'Banco L'),
(13, '3456', '7890', 'Banco M'),
(14, '4567', '8901', 'Banco N'),
(15, '5678', '9012', 'Banco O'),
(16, '6789', '0123', 'Banco P'),
(17, '7890', '1234', 'Banco Q'),
(18, '8901', '2345', 'Banco R'),
(19, '9012', '3456', 'Banco S'),
(20, '0123', '4567', 'Banco T');

-- 20 registros de ejemplo para la tabla C_CUENTAS_BAN
INSERT INTO `C_CUENTAS_BAN` (`ID_CUENTA`, `NO_CUENTA`, `SALDO`, `VIGENCIA`, `CLABE`, `FK_ID_CLIENTE`) VALUES
(1, '123456789012345678', 1000.50, '2024-06-01', '987654321098765432', 1),
(2, '234567890123456789', 500.25, '2023-12-31', '876543210987654321', 2),
(3, '345678901234567890', 750.75, '2024-03-15', '765432109876543210', 3),
(4, '456789012345678901', 1200.80, '2025-02-28', '654321098765432109', 4),
(5, '567890123456789012', 350.90, '2023-09-30', '543210987654321098', 5),
(6, '678901234567890123', 900.60, '2024-07-12', '432109876543210987', 6),
(7, '789012345678901234', 200.30, '2023-11-15', '321098765432109876', 7),
(8, '890123456789012345', 1500.20, '2024-05-20', '210987654321098765', 8),
(9, '901234567890123456', 100.50, '2025-01-01', '109876543210987654', 9),
(10, '012345678901234567', 800.75, '2023-12-31', '098765432109876543', 10),
(11, '123456789012345678', 600.90, '2024-09-15', '987654321098765432', 11),
(12, '234567890123456789', 950.25, '2025-08-31', '876543210987654321', 12),
(13, '345678901234567890', 400.10, '2023-06-30', '765432109876543210', 13),
(14, '456789012345678901', 1100.35, '2024-01-15', '654321098765432109', 14),
(15, '567890123456789012', 250.50, '2023-10-20', '543210987654321098', 15),
(16, '678901234567890123', 1800.70, '2024-12-31', '432109876543210987', 16),
(17, '789012345678901234', 700.25, '2025-07-15', '321098765432109876', 17),
(18, '890123456789012345', 950.90, '2023-12-31', '210987654321098765', 18),
(19, '901234567890123456', 300.80, '2024-10-31', '109876543210987654', 19),
(20, '012345678901234567', 600.50, '2025-03-15', '098765432109876543', 20);

-- 20 registros de ejemplo para la tabla C_TARJETAS coincidiendo con la tabla C_CUENTAS_BAN
INSERT INTO `C_TARJETAS` (`ID_TARJETA`, `NO_TARJETA`, `VENCIMIENTO`, `CVV`, `STATUS`, `SALDO`, `FK_ID_CUENTA`) VALUES
(1, '1234567812345678', '2024-06-01', 123, 'Activa', 1000.50, 1),
(2, '2345678923456789', '2023-12-31', 234, 'Activa', 500.25, 2),
(3, '3456789034567890', '2024-03-15', 345, 'Activa', 750.75, 3),
(4, '4567890145678901', '2025-02-28', 456, 'Activa', 1200.80, 4),
(5, '5678901256789012', '2023-09-30', 567, 'Activa', 350.90, 5),
(6, '6789012367890123', '2024-07-12', 678, 'Activa', 900.60, 6),
(7, '7890123478901234', '2023-11-15', 789, 'Activa', 200.30, 7),
(8, '8901234589012345', '2024-05-20', 890, 'Activa', 1500.20, 8),
(9, '9012345690123456', '2025-01-01', 901, 'Activa', 100.50, 9),
(10, '0123456701234567', '2023-12-31', 12, 'Activa', 800.75, 10),
(11, '1234567812345678', '2024-09-15', 123, 'Activa', 600.90, 11),
(12, '2345678923456789', '2025-08-31', 234, 'Activa', 950.25, 12),
(13, '3456789034567890', '2023-06-30', 345, 'Activa', 400.10, 13),
(14, '4567890145678901', '2024-01-15', 456, 'Activa', 1100.35, 14),
(15, '5678901256789012', '2023-10-20', 567, 'Activa', 250.50, 15),
(16, '6789012367890123', '2024-12-31', 678, 'Activa', 1800.70, 16),
(17, '7890123478901234', '2025-07-15', 789, 'Activa', 700.25, 17),
(18, '8901234589012345', '2023-12-31', 890, 'Activa', 950.90, 18),
(19, '9012345690123456', '2024-10-31', 901, 'Activa', 300.80, 19),
(20, '0123456701234567', '2025-03-15', 12, 'Activa', 600.50, 20);

-- Generar 20 registros de ejemplo para la tabla T_TRANSACCION con variaciones en tarjeta destino, cuenta destino, clabe destino y SPEI
INSERT INTO `T_TRANSACCION` (`ID_TRANS`, `MONTO`, `FECHA`, `TARJETA_DESTINO`, `CUENTA_DESTINO`, `CLABE_DESTINO`, `DESTINATARIO`, `LOCACION`, `SPEI`, `FK_ID_CUENTA`, `FK_ID_TIPOTRANS`, `FK_ID_BANCO`) VALUES
(1, 100.50, CURRENT_TIMESTAMP, '1234567812345678', '12345678901234', '987654321098765432', 'Destinatario 1', 'Locación 1', '1001', 1, 1, 1),
(2, 200.75, CURRENT_TIMESTAMP, '2345678923456789', '23456789012345', '876543210987654321', 'Destinatario 2', 'Locación 2', '1002', 2, 2, 2),
(3, 150.25, CURRENT_TIMESTAMP, '3456789034567890', '34567890123456', '765432109876543210', 'Destinatario 3', 'Locación 3', '1003', 3, 3, 3),
(4, 250.90, CURRENT_TIMESTAMP, '4567890145678901', '45678901234567', '654321098765432109', 'Destinatario 4', 'Locación 4', '1004', 4, 4, 4),
(5, 300.10, CURRENT_TIMESTAMP, '5678901256789012', '56789012345678', '543210987654321098', 'Destinatario 5', 'Locación 5', '1005', 5, 1, 2),
(6, 400.80, CURRENT_TIMESTAMP, '6789012367890123', '67890123456789', '432109876543210987', 'Destinatario 6', 'Locación 6', '1006', 6, 2, 3),
(7, 500.30, CURRENT_TIMESTAMP, '7890123478901234', '78901234567890', '321098765432109876', 'Destinatario 7', 'Locación 7', '1007', 7, 3, 4),
(8, 450.20, CURRENT_TIMESTAMP, '8901234589012345', '89012345678901', '210987654321098765', 'Destinatario 8', 'Locación 8', '1008', 8, 4, 5),
(9, 350.50, CURRENT_TIMESTAMP, '9012345690123456', '90123456789012', '109876543210987654', 'Destinatario 9', 'Locación 9', '1009', 9, 1, 2),
(10, 550.75, CURRENT_TIMESTAMP, '0123456701234567', '01234567890123', '098765432109876543', 'Destinatario 10', 'Locación 10', '1010', 10, 2, 3),
(11, 450.90, CURRENT_TIMESTAMP, '1234567812345678', '12345678901234', '987654321098765432', 'Destinatario 11', 'Locación 11', '1011', 11, 3, 4),
(12, 650.25, CURRENT_TIMESTAMP, '2345678923456789', '23456789012345', '876543210987654321', 'Destinatario 12', 'Locación 12', '1012', 12, 4, 5),
(13, 550.10, CURRENT_TIMESTAMP, '3456789034567890', '34567890123456', '765432109876543210', 'Destinatario 13', 'Locación 13', '1013', 13, 1, 2),
(14, 750.35, CURRENT_TIMESTAMP, '4567890145678901', '45678901234567', '654321098765432109', 'Destinatario 14', 'Locación 14', '1014', 14, 2, 3),
(15, 400.50, CURRENT_TIMESTAMP, '5678901256789012', '56789012345678', '543210987654321098', 'Destinatario 15', 'Locación 15', '1015', 15, 3, 4),
(16, 550.80, CURRENT_TIMESTAMP, '6789012367890123', '67890123456789', '432109876543210987', 'Destinatario 16', 'Locación 16', '1016', 16, 4, 5),
(17, 650.30, CURRENT_TIMESTAMP, '7890123478901234', '78901234567890', '321098765432109876', 'Destinatario 17', 'Locación 17', '1017', 17, 1, 2),
(18, 550.20, CURRENT_TIMESTAMP, '8901234589012345', '89012345678901', '210987654321098765', 'Destinatario 18', 'Locación 18', '1018', 18, 2, 3),
(19, 350.50, CURRENT_TIMESTAMP, '9012345690123456', '90123456789012', '109876543210987654', 'Destinatario 19', 'Locación 19', '1019', 19, 3, 4),
(20, 450.75, CURRENT_TIMESTAMP, '0123456701234567', '01234567890123', '098765432109876543', 'Destinatario 20', 'Locación 20', '1020', 20, 4, 5);





