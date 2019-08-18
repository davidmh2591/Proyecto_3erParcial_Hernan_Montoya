-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-08-2019 a las 07:23:26
-- Versión del servidor: 10.3.16-MariaDB
-- Versión de PHP: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `USUARIO` int(11) NOT NULL,
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `ID` int(11) NOT NULL,
  `NOMBRE PRODUCTO` varchar(50) NOT NULL,
  `MARCA` varchar(50) NOT NULL,
  `DESCRIPCION` varchar(60) NOT NULL,
  `PRECIO` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`ID`, `NOMBRE PRODUCTO`, `MARCA`, `DESCRIPCION`, `PRECIO`) VALUES
(1, 'Reloj Analogo Bersigae', 'Bersigae', 'Reloj Plateado para Hombre ', 300),
(2, 'Reloj Analogo Casio', 'Casio', 'Reloj Negro para Hombre ', 200),
(3, 'Reloj Analogo Lige', 'Lige', 'Reloj Negro para Hombre', 100),
(4, 'Reloj Analogo Casio Plateado', 'Casio', 'Reloj Plateado con fondo azul para Hombre', 400);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `NOMBRE` varchar(50) NOT NULL,
  `APELLIDO` varchar(50) NOT NULL,
  `EDAD` int(3) NOT NULL,
  `USUARIO` varchar(10) NOT NULL,
  `CONTRASEÑA` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`NOMBRE`, `APELLIDO`, `EDAD`, `USUARIO`, `CONTRASEÑA`) VALUES
('HERNAN DAVID', 'MONTOYA HERNANDEZ', 27, 'DAVIDMH25', 'DAVIDMH2');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`USUARIO`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
