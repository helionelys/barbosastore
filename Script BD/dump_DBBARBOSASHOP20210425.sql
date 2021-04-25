-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: dbbarbosashop
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbl_caixa`
--

DROP TABLE IF EXISTS `tbl_caixa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_caixa` (
  `CODCAIXA` int unsigned NOT NULL AUTO_INCREMENT,
  `DINHEIRO` decimal(10,2) NOT NULL,
  `CHEQUE` decimal(10,2) NOT NULL,
  `CARTAO` decimal(10,2) NOT NULL,
  `VALE` decimal(10,2) NOT NULL,
  PRIMARY KEY (`CODCAIXA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_caixa`
--

LOCK TABLES `tbl_caixa` WRITE;
/*!40000 ALTER TABLE `tbl_caixa` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_caixa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_categoriaproduto`
--

DROP TABLE IF EXISTS `tbl_categoriaproduto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_categoriaproduto` (
  `CODCATEGORIA` int NOT NULL AUTO_INCREMENT,
  `DESCRICAO` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`CODCATEGORIA`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_categoriaproduto`
--

LOCK TABLES `tbl_categoriaproduto` WRITE;
/*!40000 ALTER TABLE `tbl_categoriaproduto` DISABLE KEYS */;
INSERT INTO `tbl_categoriaproduto` VALUES (1,'CESTA BASICA'),(2,'GDGD'),(3,'DVDV');
/*!40000 ALTER TABLE `tbl_categoriaproduto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_categoriaservico`
--

DROP TABLE IF EXISTS `tbl_categoriaservico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_categoriaservico` (
  `CODCATEGORIA` int NOT NULL AUTO_INCREMENT,
  `DESCRICAO` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`CODCATEGORIA`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_categoriaservico`
--

LOCK TABLES `tbl_categoriaservico` WRITE;
/*!40000 ALTER TABLE `tbl_categoriaservico` DISABLE KEYS */;
INSERT INTO `tbl_categoriaservico` VALUES (1,'tttt');
/*!40000 ALTER TABLE `tbl_categoriaservico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_cliente`
--

DROP TABLE IF EXISTS `tbl_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_cliente` (
  `CODCLIENTE` int NOT NULL AUTO_INCREMENT,
  `TIPOCLIENTE` int DEFAULT NULL,
  `DATANASCIMENTO` date DEFAULT NULL,
  `NOME_RAZAOSOCIAL` varchar(100) DEFAULT NULL,
  `APELIDO_NOMEFANTASIA` varchar(100) DEFAULT NULL,
  `CPF_CNPJ` varchar(20) DEFAULT NULL,
  `RG_INSCRICAOESTADUAL` varchar(20) DEFAULT NULL,
  `CEP` varchar(10) DEFAULT NULL,
  `CIDADE` varchar(50) DEFAULT NULL,
  `UF` varchar(2) DEFAULT NULL,
  `LOGRADOURO` varchar(100) DEFAULT NULL,
  `NUMERO` varchar(20) DEFAULT NULL,
  `BAIRRO` varchar(30) DEFAULT NULL,
  `COMPLEMENTO` varchar(100) DEFAULT NULL,
  `CELULAR` varchar(15) DEFAULT NULL,
  `TELEFONE` varchar(14) DEFAULT NULL,
  `EMAIL` varchar(100) DEFAULT NULL,
  `DATACADASTRAMENTO` date DEFAULT NULL,
  PRIMARY KEY (`CODCLIENTE`),
  UNIQUE KEY `CPF_CNPJ_INDEX` (`CPF_CNPJ`),
  KEY `TIPOCLIENTE` (`TIPOCLIENTE`),
  CONSTRAINT `TBL_CLIENTE_ibfk_1` FOREIGN KEY (`TIPOCLIENTE`) REFERENCES `tbl_pessoatipo` (`CODPESSOATIPO`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cliente`
--

LOCK TABLES `tbl_cliente` WRITE;
/*!40000 ALTER TABLE `tbl_cliente` DISABLE KEYS */;
INSERT INTO `tbl_cliente` VALUES (1,1,'1990-04-21','TIRADENTES','JOSE SILVERIO DE PESSOA','888.888.888-88','8','77.777-777','888888c','AM','88','8','8','8','(88)8 8888-8888','(88) 8888-8888','88888888888888888888','2020-09-13'),(3,1,'1990-04-24','HELIONELYS DA CRUZ BARBOSA','LEO BARBOSA','999.999.997-95','8045801','55.840-000','RECIFE','PE',' RUA JOSEFA MARIA','15','CENTRO','CASA PROXIMA AO PREDIO DO EXTRA','(81)9 9391-0797','(81) 3653-1152','HELIONELYS@GMAIL.COM','2021-03-28'),(4,2,'0001-01-01','USINA PETRIIBU SA','USINA PETRIBU','10.645.075/0001-83','5448844','55.840-555','LAGOA DE ITAENGA','PE','ZONA RURAL','03','','1','(18)8 8888-8888','(88) 8888-8888','8888','2021-04-04'),(5,1,'1990-04-24','LUCAS DE ABREU SANTOS','LEO','777.777.777-77','7','77.777-777','77777777777777','AM','RUA JOSEFA MARIA','16','CENTRO','CASA','(88)8 8888-8888','(88) 8888-8888','888888','2021-04-04');
/*!40000 ALTER TABLE `tbl_cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_compra`
--

DROP TABLE IF EXISTS `tbl_compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_compra` (
  `CODCOMPRA` int NOT NULL,
  `CODFORNECEDOR` int DEFAULT NULL,
  `DATACOMPRA` datetime DEFAULT NULL,
  `DESCONTO` decimal(10,2) DEFAULT NULL,
  `TOTALCOMPRA` decimal(10,2) DEFAULT NULL,
  `CODSTATUSCOMPRA` int DEFAULT NULL,
  PRIMARY KEY (`CODCOMPRA`),
  KEY `TBL_COMPRA_FK02_idx` (`CODFORNECEDOR`),
  CONSTRAINT `TBL_COMPRA_FK01` FOREIGN KEY (`CODCOMPRA`) REFERENCES `tbl_statuscompra` (`CODSTATUSCOMPRA`),
  CONSTRAINT `TBL_COMPRA_FK02` FOREIGN KEY (`CODFORNECEDOR`) REFERENCES `tbl_fornecedor` (`CODFORNECEDOR`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_compra`
--

LOCK TABLES `tbl_compra` WRITE;
/*!40000 ALTER TABLE `tbl_compra` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_compra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_dadosempresa`
--

DROP TABLE IF EXISTS `tbl_dadosempresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_dadosempresa` (
  `CODEMPRESA` int NOT NULL AUTO_INCREMENT,
  `NOMEFANTASIA` varchar(80) NOT NULL,
  `RAZAOSOCIAL` varchar(80) DEFAULT NULL,
  `CNPJ` varchar(20) NOT NULL,
  `INSCRICAOESTADUAL` varchar(20) NOT NULL,
  `TELEFONE` varchar(14) DEFAULT NULL,
  `EMAIL` varchar(100) DEFAULT NULL,
  `IMAGEM` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`CODEMPRESA`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_dadosempresa`
--

LOCK TABLES `tbl_dadosempresa` WRITE;
/*!40000 ALTER TABLE `tbl_dadosempresa` DISABLE KEYS */;
INSERT INTO `tbl_dadosempresa` VALUES (1,'BARBOSA STORE','BARBOSA STORE E COMERCIO E SERVIÇOS LTDA','32.327.118/0001-15','18898995959','(81) 3636-4474','contato@barbosastore.com.br',NULL);
/*!40000 ALTER TABLE `tbl_dadosempresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_fornecedor`
--

DROP TABLE IF EXISTS `tbl_fornecedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_fornecedor` (
  `CODFORNECEDOR` int NOT NULL AUTO_INCREMENT,
  `TIPOFORNECEDOR` int DEFAULT NULL,
  `NOMEREPRESENTANTE` varchar(50) DEFAULT NULL,
  `NOME_RAZAOSOCIAL` varchar(100) DEFAULT NULL,
  `APELIDO_NOMEFANTASIA` varchar(100) DEFAULT NULL,
  `CPF_CNPJ` varchar(20) DEFAULT NULL,
  `RG_INSCRICAOESTADUAL` varchar(20) DEFAULT NULL,
  `CEP` varchar(10) DEFAULT NULL,
  `CIDADE` varchar(50) DEFAULT NULL,
  `UF` varchar(2) DEFAULT NULL,
  `LOGRADOURO` varchar(100) DEFAULT NULL,
  `NUMERO` varchar(20) DEFAULT NULL,
  `BAIRRO` varchar(30) DEFAULT NULL,
  `COMPLEMENTO` varchar(100) DEFAULT NULL,
  `CELULAR` varchar(15) DEFAULT NULL,
  `TELEFONE` varchar(14) DEFAULT NULL,
  `EMAIL` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`CODFORNECEDOR`),
  UNIQUE KEY `CPF_CNPJ` (`CPF_CNPJ`),
  KEY `TIPOFORNECEDOR` (`TIPOFORNECEDOR`),
  CONSTRAINT `TBL_FORNECEDOR_ibfk_1` FOREIGN KEY (`TIPOFORNECEDOR`) REFERENCES `tbl_pessoatipo` (`CODPESSOATIPO`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_fornecedor`
--

LOCK TABLES `tbl_fornecedor` WRITE;
/*!40000 ALTER TABLE `tbl_fornecedor` DISABLE KEYS */;
INSERT INTO `tbl_fornecedor` VALUES (2,2,'','JAIR MESSIAS BOLSONARO','BOLSONARO','88.888.888/8888-88','8','99.999-999','999999999999999','PE','OOOOOOOOOOOO','O','O','O','(99)9 9999-9999','(88) 8888-8888','888'),(3,1,'','LUIZ INACIO LULA DA SILVA','LULA','888.888.888-88','8','88.888-888','88888888888888888','PE','OOOOOOOOOOOO','O','O','O','(88)8 8888-8888','(88) 8888-8888','88'),(4,2,'denis','uuuuuuuuuuuuuuuuuuu','uuuuuuuuuuuuuuuuuuuuuuuuuuuuu','99.999.999/9999-99','88888888888','88.888-888','888888888888888','SP','999999999999','9','9','9999999999999','(99)9 9999-9999','(99) 9999-9999','9');
/*!40000 ALTER TABLE `tbl_fornecedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_funcionario`
--

DROP TABLE IF EXISTS `tbl_funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_funcionario` (
  `CODFUNCIONARIO` int NOT NULL AUTO_INCREMENT,
  `NOME` varchar(100) DEFAULT NULL,
  `DATANASCIMENTO` date DEFAULT NULL,
  `SEXO` varchar(30) DEFAULT NULL,
  `CPF` varchar(14) DEFAULT NULL,
  `RG` varchar(30) DEFAULT NULL,
  `RGORGEXPEDIDOR` varchar(30) DEFAULT NULL,
  `NOMEMAE` varchar(100) DEFAULT NULL,
  `NOMEPAI` varchar(100) DEFAULT NULL,
  `ESCOLARIDADE` varchar(50) DEFAULT NULL,
  `ESTADOCIVIL` varchar(50) DEFAULT NULL,
  `SALARIO` double(18,2) DEFAULT NULL,
  `FUNCAO` varchar(50) DEFAULT NULL,
  `DEPARTAMENTO` varchar(50) DEFAULT NULL,
  `CEP` varchar(10) DEFAULT NULL,
  `CIDADE` varchar(50) DEFAULT NULL,
  `UF` varchar(2) DEFAULT NULL,
  `LOGRADOURO` varchar(100) DEFAULT NULL,
  `NUMERO` varchar(20) DEFAULT NULL,
  `BAIRRO` varchar(30) DEFAULT NULL,
  `COMPLEMENTO` varchar(100) DEFAULT NULL,
  `CELULAR` varchar(15) DEFAULT NULL,
  `EMAIL` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`CODFUNCIONARIO`),
  UNIQUE KEY `CPF_FUNCIONARIO_INDEX` (`CPF`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_funcionario`
--

LOCK TABLES `tbl_funcionario` WRITE;
/*!40000 ALTER TABLE `tbl_funcionario` DISABLE KEYS */;
INSERT INTO `tbl_funcionario` VALUES (1,'LUIZ INACIO LULA DA SILVA','1990-04-24','MASCULINO','084.888.888-88','8888888','SDS/PE','HELENA MARTA DE MOURA','JOSE FRANCISCO BARBOSA','SUPERIOR INCOMPLETO','SOLTEIRO',4500.00,'ADMINISTRADOR DE REDES','TECNOLOGIA DA INFORMAÇÃO','55.840-000','LAGOA DE ITAENGA','PE','RUA JOSEFA MARIA','16','CENTRO','CASA PROXIMA AO PREDIO DO EXTRA','(81)9 9391-0797','HELIONELYS@GMAIL.COM'),(2,'FERNANDO HENRIQUE CARDOSO','2000-01-01','Masculino','785.555.555-55','5555555','SSP/RS','LAURA','FERNANDO','Superior Completo','Viúvo(a)',5000.00,'PRESIDENTE','EXECUTIVO','55.555-555','LAGOA DE ITAENGA','RJ','RUA EXEMPLO','2','CENTRO','CASA','(81)1 1111-1111','FHC@EXEMPLO.COM'),(3,'ITAMAR FRANCO DE AZEVENDO','2012-10-31','Masculino','777.777.777-77','5555','88888','88888','888888888888','Fundamental Incompleto','Casado(a)',8000.00,'PRESIDENTE','PRESIDENTE','77.777-777','5555','PE','55555555555','5','5','555','(55)5 5555-5555','55'),(4,'HELIONELYS DA CRUZ BARBOSA','1990-04-24','Masculino','084.888.488-88','44555','SDS/PE','HELENA','IZAEL','Superior Incompleto','Divorciado(a)',5000.00,'ANALISTA','TECNOLOGIA','55.555-555','LAGOA DE ITAENGA','PE','CENTRO','1561','CENTRO','CASA','(88)8 8888-8888','888888');
/*!40000 ALTER TABLE `tbl_funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_itenscompra`
--

DROP TABLE IF EXISTS `tbl_itenscompra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_itenscompra` (
  `CODITEMCOMPRA` int NOT NULL,
  `CODCOMPRA` int DEFAULT NULL,
  `CODPRODUTO` int DEFAULT NULL,
  `QUANTIDADE` int DEFAULT NULL,
  `SUBTOTAL` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`CODITEMCOMPRA`),
  KEY `TBL_ITENSCOMPRA_FK01_idx` (`CODCOMPRA`),
  KEY `TBL_ITENSCOMPRA_FK02_idx` (`CODPRODUTO`),
  CONSTRAINT `TBL_ITENSCOMPRA_FK01` FOREIGN KEY (`CODCOMPRA`) REFERENCES `tbl_compra` (`CODCOMPRA`),
  CONSTRAINT `TBL_ITENSCOMPRA_FK02` FOREIGN KEY (`CODPRODUTO`) REFERENCES `tbl_produto` (`CODPRODUTO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_itenscompra`
--

LOCK TABLES `tbl_itenscompra` WRITE;
/*!40000 ALTER TABLE `tbl_itenscompra` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_itenscompra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_itensvenda`
--

DROP TABLE IF EXISTS `tbl_itensvenda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_itensvenda` (
  `CODITEMVENDA` int NOT NULL AUTO_INCREMENT,
  `CODVENDA` int DEFAULT NULL,
  `CODPRODUTO` int DEFAULT NULL,
  `QUANTIDADE` int DEFAULT NULL,
  `SUBTOTAL` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`CODITEMVENDA`),
  KEY `TBL_ITENSVENDAS_FK01_idx` (`CODVENDA`),
  KEY `TBL_ITENSVENDAS_FK02_idx` (`CODPRODUTO`),
  CONSTRAINT `TBL_ITENSVENDAS_FK01` FOREIGN KEY (`CODVENDA`) REFERENCES `tbl_venda` (`CODVENDA`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `TBL_ITENSVENDAS_FK02` FOREIGN KEY (`CODPRODUTO`) REFERENCES `tbl_produto` (`CODPRODUTO`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_itensvenda`
--

LOCK TABLES `tbl_itensvenda` WRITE;
/*!40000 ALTER TABLE `tbl_itensvenda` DISABLE KEYS */;
INSERT INTO `tbl_itensvenda` VALUES (4,99,2,2,6.00),(5,99,2,1,3.00),(6,99,4,1,2.99),(7,100,1,2,13.76),(8,100,2,1,3.00),(9,100,4,12,35.88),(10,101,1,2,13.76),(11,101,4,2,5.98),(12,101,2,3,9.00),(13,102,4,2,5.98),(14,102,1,22,151.36),(15,102,3,3,18.00),(16,102,2,223,669.00),(17,103,2,2,6.00),(18,103,3,1,6.00),(19,105,2,2,6.00),(20,106,2,2,6.00),(21,107,4,1,2.99),(22,107,2,2,6.00),(23,108,1,2,13.76);
/*!40000 ALTER TABLE `tbl_itensvenda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_perfilusuario`
--

DROP TABLE IF EXISTS `tbl_perfilusuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_perfilusuario` (
  `CODPERFIL` int NOT NULL AUTO_INCREMENT,
  `NOME` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`CODPERFIL`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_perfilusuario`
--

LOCK TABLES `tbl_perfilusuario` WRITE;
/*!40000 ALTER TABLE `tbl_perfilusuario` DISABLE KEYS */;
INSERT INTO `tbl_perfilusuario` VALUES (1,'ADMIN'),(2,'VENDAS'),(3,'COMERCIAL');
/*!40000 ALTER TABLE `tbl_perfilusuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_pessoatipo`
--

DROP TABLE IF EXISTS `tbl_pessoatipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_pessoatipo` (
  `CODPESSOATIPO` int NOT NULL AUTO_INCREMENT,
  `DESCRICAO` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`CODPESSOATIPO`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_pessoatipo`
--

LOCK TABLES `tbl_pessoatipo` WRITE;
/*!40000 ALTER TABLE `tbl_pessoatipo` DISABLE KEYS */;
INSERT INTO `tbl_pessoatipo` VALUES (1,'FISICA'),(2,'JURIDICA');
/*!40000 ALTER TABLE `tbl_pessoatipo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_produto`
--

DROP TABLE IF EXISTS `tbl_produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_produto` (
  `CODPRODUTO` int NOT NULL AUTO_INCREMENT,
  `CODSTATUSPRODUTO` int DEFAULT NULL,
  `DATACADASTRAMENTO` date DEFAULT NULL,
  `DESCRICAO` varchar(100) DEFAULT NULL,
  `CODCATEGORIA` int DEFAULT NULL,
  `FABRICANTE` varchar(100) DEFAULT NULL,
  `CODUNIDADEMEDIDA` int DEFAULT NULL,
  `OBSERVACAO` varchar(200) DEFAULT NULL,
  `VALOR` double(18,2) DEFAULT NULL,
  `CODFORNECEDOR` int DEFAULT NULL,
  PRIMARY KEY (`CODPRODUTO`),
  KEY `CODCATEGORIA` (`CODCATEGORIA`),
  KEY `CODUNIDADEMEDIDA` (`CODUNIDADEMEDIDA`),
  KEY `CODSTATUSPRODUTO` (`CODSTATUSPRODUTO`,`CODFORNECEDOR`),
  KEY `TBL_PRODUTO_ibfk_4_idx` (`CODFORNECEDOR`),
  CONSTRAINT `TBL_PRODUTO_ibfk_2` FOREIGN KEY (`CODCATEGORIA`) REFERENCES `tbl_categoriaproduto` (`CODCATEGORIA`),
  CONSTRAINT `TBL_PRODUTO_ibfk_3` FOREIGN KEY (`CODUNIDADEMEDIDA`) REFERENCES `tbl_unidademedida` (`CODUNIDADE`),
  CONSTRAINT `TBL_PRODUTO_ibfk_4` FOREIGN KEY (`CODFORNECEDOR`) REFERENCES `tbl_fornecedor` (`CODFORNECEDOR`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_produto`
--

LOCK TABLES `tbl_produto` WRITE;
/*!40000 ALTER TABLE `tbl_produto` DISABLE KEYS */;
INSERT INTO `tbl_produto` VALUES (1,NULL,'2020-09-12','FEIJAO CARIOCA TURQUESA TIPO 1',1,'turquesa',1,'si',6.88,2),(2,NULL,'2020-09-13','ARRROZ',1,'',1,'SS',3.00,3),(3,NULL,'2020-09-13','WYWH',2,'RR',1,'TT',6.00,3),(4,NULL,'2021-03-27','FARINHA DA MANDIOCA ITAENGA',1,'CASA DE FARINHA ITAENGA',1,'CADASTRO DE PRODUTOS',2.99,3);
/*!40000 ALTER TABLE `tbl_produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_servico`
--

DROP TABLE IF EXISTS `tbl_servico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_servico` (
  `CODSERVICO` int NOT NULL AUTO_INCREMENT,
  `CODSTATUSSERVICO` int DEFAULT NULL,
  `DATACADASTRAMENTO` date DEFAULT NULL,
  `DESCRICAO` varchar(100) DEFAULT NULL,
  `CODCATEGORIA` int DEFAULT NULL,
  `OBSERVACAO` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`CODSERVICO`),
  KEY `CODCATEGORIA` (`CODCATEGORIA`),
  CONSTRAINT `TBL_SERVICO_ibfk_1` FOREIGN KEY (`CODCATEGORIA`) REFERENCES `tbl_categoriaservico` (`CODCATEGORIA`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_servico`
--

LOCK TABLES `tbl_servico` WRITE;
/*!40000 ALTER TABLE `tbl_servico` DISABLE KEYS */;
INSERT INTO `tbl_servico` VALUES (1,NULL,'2020-09-12','ssfs',1,'sss');
/*!40000 ALTER TABLE `tbl_servico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_status`
--

DROP TABLE IF EXISTS `tbl_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_status` (
  `CODSTATUS` int NOT NULL AUTO_INCREMENT,
  `DESCRICAO` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`CODSTATUS`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_status`
--

LOCK TABLES `tbl_status` WRITE;
/*!40000 ALTER TABLE `tbl_status` DISABLE KEYS */;
INSERT INTO `tbl_status` VALUES (1,'ATIVO'),(2,'DESATIVADO');
/*!40000 ALTER TABLE `tbl_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_statuscompra`
--

DROP TABLE IF EXISTS `tbl_statuscompra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_statuscompra` (
  `CODSTATUSCOMPRA` int NOT NULL AUTO_INCREMENT,
  `DESCRICAO` varchar(45) NOT NULL,
  PRIMARY KEY (`CODSTATUSCOMPRA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_statuscompra`
--

LOCK TABLES `tbl_statuscompra` WRITE;
/*!40000 ALTER TABLE `tbl_statuscompra` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_statuscompra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_statusvenda`
--

DROP TABLE IF EXISTS `tbl_statusvenda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_statusvenda` (
  `CODSTATUSVENDA` int NOT NULL AUTO_INCREMENT,
  `DESCRICAO` varchar(45) NOT NULL,
  PRIMARY KEY (`CODSTATUSVENDA`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_statusvenda`
--

LOCK TABLES `tbl_statusvenda` WRITE;
/*!40000 ALTER TABLE `tbl_statusvenda` DISABLE KEYS */;
INSERT INTO `tbl_statusvenda` VALUES (1,'APROVADA'),(2,'AGUARDANDO'),(3,'REPROVADA');
/*!40000 ALTER TABLE `tbl_statusvenda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_tipopagamento`
--

DROP TABLE IF EXISTS `tbl_tipopagamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_tipopagamento` (
  `CODTIPOPAGAMENTO` int NOT NULL,
  `DESCRICAO` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`CODTIPOPAGAMENTO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_tipopagamento`
--

LOCK TABLES `tbl_tipopagamento` WRITE;
/*!40000 ALTER TABLE `tbl_tipopagamento` DISABLE KEYS */;
INSERT INTO `tbl_tipopagamento` VALUES (1,'DINHEIRO'),(2,'CARTAO'),(3,'CHEQUE'),(4,'PIX');
/*!40000 ALTER TABLE `tbl_tipopagamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_unidademedida`
--

DROP TABLE IF EXISTS `tbl_unidademedida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_unidademedida` (
  `CODUNIDADE` int NOT NULL AUTO_INCREMENT,
  `DESCRICAO` varchar(20) DEFAULT NULL,
  `DESCRICAOCOMPLETA` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`CODUNIDADE`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_unidademedida`
--

LOCK TABLES `tbl_unidademedida` WRITE;
/*!40000 ALTER TABLE `tbl_unidademedida` DISABLE KEYS */;
INSERT INTO `tbl_unidademedida` VALUES (1,'KG',NULL),(2,'TTSFSS','CADASTRO COMPLETO');
/*!40000 ALTER TABLE `tbl_unidademedida` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_usuario`
--

DROP TABLE IF EXISTS `tbl_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_usuario` (
  `CODUSUARIO` int NOT NULL AUTO_INCREMENT,
  `LOGIN` varchar(45) DEFAULT NULL,
  `SENHA` varchar(45) DEFAULT NULL,
  `CODFUNCIONARIO` int DEFAULT NULL,
  `CODPERFIL` int DEFAULT NULL,
  PRIMARY KEY (`CODUSUARIO`),
  UNIQUE KEY `CODFUNCIONARIO_UNIQUE` (`CODFUNCIONARIO`),
  KEY `TBL_USUARIO_FK01_idx` (`CODFUNCIONARIO`),
  KEY `TBL_USUARIO_FK02_idx` (`CODPERFIL`),
  CONSTRAINT `TBL_USUARIO_FK01` FOREIGN KEY (`CODFUNCIONARIO`) REFERENCES `tbl_funcionario` (`CODFUNCIONARIO`) ON UPDATE CASCADE,
  CONSTRAINT `TBL_USUARIO_FK02` FOREIGN KEY (`CODPERFIL`) REFERENCES `tbl_perfilusuario` (`CODPERFIL`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_usuario`
--

LOCK TABLES `tbl_usuario` WRITE;
/*!40000 ALTER TABLE `tbl_usuario` DISABLE KEYS */;
INSERT INTO `tbl_usuario` VALUES (16,'HELIONELYS','ae88ba380595351b9cc4b5baf4c0ff59',4,1),(24,'leo','123',3,1),(32,'lula','827ccb0eea8a706c4c34a16891f84e7b',1,1),(33,'FHC','a906449d5769fa7361d7ecc6aa3f6d28',2,2);
/*!40000 ALTER TABLE `tbl_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_venda`
--

DROP TABLE IF EXISTS `tbl_venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_venda` (
  `CODVENDA` int NOT NULL AUTO_INCREMENT,
  `CODCLIENTE` int NOT NULL,
  `DATAVENDA` date DEFAULT NULL,
  `DESCONTO` decimal(10,2) DEFAULT NULL,
  `TOTALVENDA` decimal(10,2) DEFAULT NULL,
  `CODSTATUSVENDA` int DEFAULT NULL,
  `CODTIPOPAGAMENTO` int DEFAULT NULL,
  `OBSERVACAO` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`CODVENDA`),
  KEY `TBL_VENDA_FK01_idx` (`CODCLIENTE`),
  KEY `TBL_VENDA_FK02_idx` (`CODSTATUSVENDA`),
  CONSTRAINT `TBL_VENDA_FK01` FOREIGN KEY (`CODCLIENTE`) REFERENCES `tbl_cliente` (`CODCLIENTE`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `TBL_VENDA_FK02` FOREIGN KEY (`CODSTATUSVENDA`) REFERENCES `tbl_statusvenda` (`CODSTATUSVENDA`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `TBL_VENDA_FK03` FOREIGN KEY (`CODSTATUSVENDA`) REFERENCES `tbl_tipopagamento` (`CODTIPOPAGAMENTO`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_venda`
--

LOCK TABLES `tbl_venda` WRITE;
/*!40000 ALTER TABLE `tbl_venda` DISABLE KEYS */;
INSERT INTO `tbl_venda` VALUES (99,1,'2021-04-25',0.00,11.99,1,0,''),(100,1,'2021-04-25',10.00,42.64,1,0,'venda para teste'),(101,5,'2021-04-25',0.00,28.74,2,0,'teste 03'),(102,3,'2021-04-25',0.00,844.34,2,0,'tste ssfa'),(103,1,'2021-04-25',0.00,12.00,2,0,''),(104,3,'2021-04-25',0.00,0.00,2,0,''),(105,4,'2021-04-25',0.00,6.00,3,0,''),(106,1,'2021-04-25',0.00,6.00,3,0,''),(107,4,'2021-04-25',1.00,8.99,2,0,'wtrwtwtst'),(108,3,'2021-04-25',0.75,13.01,2,0,'');
/*!40000 ALTER TABLE `tbl_venda` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-25 17:52:58
