-- phpMyAdmin SQL Dump
-- version 3.1.3.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Waktu pembuatan: 14. Nopember 2013 jam 13:36
-- Versi Server: 5.1.33
-- Versi PHP: 5.2.9

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `bpn`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tabelbpn`
--

CREATE TABLE IF NOT EXISTS `tabelbpn` (
  `nama` varchar(100) NOT NULL,
  `no_telpon` int(20) NOT NULL,
  `umur` int(5) NOT NULL,
  `pekerjaan` varchar(50) NOT NULL,
  `no_ktp` varchar(30) NOT NULL,
  `alamat` varchar(1000) NOT NULL,
  `terletak_di` varchar(50) NOT NULL,
  `desa_kelurahan` varchar(50) NOT NULL,
  `kecamatan` varchar(50) NOT NULL,
  `no_hak` varchar(30) NOT NULL,
  PRIMARY KEY (`no_ktp`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tabelbpn`
--

INSERT INTO `tabelbpn` (`nama`, `no_telpon`, `umur`, `pekerjaan`, `no_ktp`, `alamat`, `terletak_di`, `desa_kelurahan`, `kecamatan`, `no_hak`) VALUES
('zarkasih', 1, 22, 'kuliah', '1', 'gak tau', 'cibubur', 'cibubur', 'cibubur', '12345'),
('qwe', 123, 123, 'asd', '123', 'aqdasd', 'asd', 'asd', 'asd', '123'),
('aasdasd', 12121, 12, '', '2231', '', '', '', '', ''),
('asd', 123, 123, 'adfdsf', '567567', 'asdasd', 'asdasd', 'asdasd', 'asdasd', 'asdasd'),
('iqbal', 232345678, 56, 'kuli', '23232345', 'jauh	', 'cibubur', 'cibubur', 'cibubur', '7865678987');
