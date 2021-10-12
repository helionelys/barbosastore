-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: dbbarbosashop
-- ------------------------------------------------------
-- Server version	8.0.26

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
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cliente`
--

LOCK TABLES `tbl_cliente` WRITE;
/*!40000 ALTER TABLE `tbl_cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_compra`
--

DROP TABLE IF EXISTS `tbl_compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_compra` (
  `CODCOMPRA` int NOT NULL AUTO_INCREMENT,
  `CODFORNECEDOR` int NOT NULL,
  `DATACOMPRA` date DEFAULT NULL,
  `DESCONTO` decimal(10,2) DEFAULT NULL,
  `TOTALCOMPRA` decimal(10,2) DEFAULT NULL,
  `CODSTATUSCOMPRA` int DEFAULT NULL,
  `CODTIPOPAGAMENTO` int DEFAULT NULL,
  `OBSERVACAO` varchar(100) DEFAULT NULL,
  `DATAATUALIZACAO` date DEFAULT NULL,
  PRIMARY KEY (`CODCOMPRA`),
  KEY `TBL_COMPRA_FK01_idx` (`CODFORNECEDOR`),
  KEY `TBL_COMPRA_FK02_idx` (`CODSTATUSCOMPRA`),
  KEY `TBL_COMPRA_FK03_idx` (`CODTIPOPAGAMENTO`),
  CONSTRAINT `TBL_compra_FK01` FOREIGN KEY (`CODFORNECEDOR`) REFERENCES `tbl_fornecedor` (`CODFORNECEDOR`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `TBL_compra_FK02` FOREIGN KEY (`CODSTATUSCOMPRA`) REFERENCES `tbl_statuscompra` (`CODSTATUSCOMPRA`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `TBL_compra_FK03` FOREIGN KEY (`CODTIPOPAGAMENTO`) REFERENCES `tbl_tipopagamento` (`CODTIPOPAGAMENTO`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_fornecedor`
--

LOCK TABLES `tbl_fornecedor` WRITE;
/*!40000 ALTER TABLE `tbl_fornecedor` DISABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_funcionario`
--

LOCK TABLES `tbl_funcionario` WRITE;
/*!40000 ALTER TABLE `tbl_funcionario` DISABLE KEYS */;
INSERT INTO `tbl_funcionario` VALUES (1,'MESTRE','2021-10-11','MASCULINO','685.554.689-73','114271331','SSD/PE',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `tbl_funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_itenscompra`
--

DROP TABLE IF EXISTS `tbl_itenscompra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_itenscompra` (
  `CODITEMCOMPRA` int NOT NULL AUTO_INCREMENT,
  `CODCOMPRA` int DEFAULT NULL,
  `CODPRODUTO` int DEFAULT NULL,
  `QUANTIDADE` int DEFAULT NULL,
  `SUBTOTAL` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`CODITEMCOMPRA`),
  KEY `TBL_ITENSCOMPRAS_FK01_idx` (`CODCOMPRA`),
  KEY `TBL_ITENSCOMPRAS_FK02_idx` (`CODPRODUTO`),
  CONSTRAINT `TBL_ITENSCOMPRAS_FK01` FOREIGN KEY (`CODCOMPRA`) REFERENCES `tbl_compra` (`CODCOMPRA`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `TBL_ITENSCOMPRAS_FK02` FOREIGN KEY (`CODPRODUTO`) REFERENCES `tbl_produto` (`CODPRODUTO`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
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
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_itensvenda`
--

LOCK TABLES `tbl_itensvenda` WRITE;
/*!40000 ALTER TABLE `tbl_itensvenda` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_itensvenda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_lancamento`
--

DROP TABLE IF EXISTS `tbl_lancamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_lancamento` (
  `CODLANCAMENTO` int NOT NULL AUTO_INCREMENT,
  `CODCLIENTE` int DEFAULT NULL,
  `CODFORNECEDOR` int DEFAULT NULL,
  `DESCRICAO` varchar(80) DEFAULT NULL,
  `DATALANCAMENTO` date DEFAULT NULL,
  `DATAVENCIMENTO` date DEFAULT NULL,
  `DATAPAGAMENTO` date DEFAULT NULL,
  `VALOR` decimal(10,2) DEFAULT NULL,
  `CODTIPOPAGAMENTO` int DEFAULT NULL,
  `OBSERVACAO` varchar(200) DEFAULT NULL,
  `CODTIPOLANCAMENTO` int DEFAULT NULL,
  `CODSTATUSLANCAMENTO` int DEFAULT NULL,
  PRIMARY KEY (`CODLANCAMENTO`),
  KEY `TBL_FINANCEIRO_FK01_idx` (`CODCLIENTE`),
  KEY `TBL_FINANCEIRO_FK02_idx` (`CODTIPOPAGAMENTO`),
  KEY `TBL_FINANCEIRO_FK03_idx` (`CODTIPOLANCAMENTO`),
  KEY `TBL_FINANCEIRO_FK04_idx` (`CODSTATUSLANCAMENTO`),
  KEY `TBL_FINANCEIRO_FK04_idx1` (`CODFORNECEDOR`),
  CONSTRAINT `TBL_FINANCEIRO_FK01` FOREIGN KEY (`CODCLIENTE`) REFERENCES `tbl_cliente` (`CODCLIENTE`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `TBL_FINANCEIRO_FK02` FOREIGN KEY (`CODTIPOPAGAMENTO`) REFERENCES `tbl_tipopagamento` (`CODTIPOPAGAMENTO`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `TBL_FINANCEIRO_FK03` FOREIGN KEY (`CODTIPOLANCAMENTO`) REFERENCES `tbl_lancamentotipo` (`CODTIPOLANCAMENTO`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `TBL_FINANCEIRO_FK04` FOREIGN KEY (`CODSTATUSLANCAMENTO`) REFERENCES `tbl_statuslancamento` (`CODSTATUSLANCAMENTO`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `TBL_FINAnCEIRO_FK05` FOREIGN KEY (`CODFORNECEDOR`) REFERENCES `tbl_fornecedor` (`CODFORNECEDOR`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_lancamento`
--

LOCK TABLES `tbl_lancamento` WRITE;
/*!40000 ALTER TABLE `tbl_lancamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_lancamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_lancamentotipo`
--

DROP TABLE IF EXISTS `tbl_lancamentotipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_lancamentotipo` (
  `CODTIPOLANCAMENTO` int NOT NULL,
  `DESCRICAO` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`CODTIPOLANCAMENTO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_lancamentotipo`
--

LOCK TABLES `tbl_lancamentotipo` WRITE;
/*!40000 ALTER TABLE `tbl_lancamentotipo` DISABLE KEYS */;
INSERT INTO `tbl_lancamentotipo` VALUES (1,'A RECEBER'),(2,'A PAGAR');
/*!40000 ALTER TABLE `tbl_lancamentotipo` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_perfilusuario`
--

LOCK TABLES `tbl_perfilusuario` WRITE;
/*!40000 ALTER TABLE `tbl_perfilusuario` DISABLE KEYS */;
INSERT INTO `tbl_perfilusuario` VALUES (1,'ADMIN'),(2,'COMERCIAL'),(3,'GERENCIA'),(4,'FINANCEIRO'),(5,'CAIXA');
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
  `VALOR` decimal(10,2) DEFAULT NULL,
  `CODFORNECEDOR` int DEFAULT NULL,
  `VALORCOMPRA` decimal(10,2) DEFAULT NULL,
  `QUANTIDADE` int DEFAULT NULL,
  `DATAATUALIZACAOESTOQUE` date DEFAULT NULL,
  PRIMARY KEY (`CODPRODUTO`),
  KEY `CODCATEGORIA` (`CODCATEGORIA`),
  KEY `CODUNIDADEMEDIDA` (`CODUNIDADEMEDIDA`),
  KEY `CODSTATUSPRODUTO` (`CODSTATUSPRODUTO`,`CODFORNECEDOR`),
  KEY `TBL_PRODUTO_ibfk_4_idx` (`CODFORNECEDOR`),
  CONSTRAINT `TBL_PRODUTO_ibfk_2` FOREIGN KEY (`CODCATEGORIA`) REFERENCES `tbl_categoriaproduto` (`CODCATEGORIA`),
  CONSTRAINT `TBL_PRODUTO_ibfk_3` FOREIGN KEY (`CODUNIDADEMEDIDA`) REFERENCES `tbl_unidademedida` (`CODUNIDADE`),
  CONSTRAINT `TBL_PRODUTO_ibfk_4` FOREIGN KEY (`CODFORNECEDOR`) REFERENCES `tbl_fornecedor` (`CODFORNECEDOR`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_produto`
--

LOCK TABLES `tbl_produto` WRITE;
/*!40000 ALTER TABLE `tbl_produto` DISABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_statuscompra`
--

LOCK TABLES `tbl_statuscompra` WRITE;
/*!40000 ALTER TABLE `tbl_statuscompra` DISABLE KEYS */;
INSERT INTO `tbl_statuscompra` VALUES (1,'FATURADA'),(2,'PENDENTE'),(3,'CANCELADA');
/*!40000 ALTER TABLE `tbl_statuscompra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_statuslancamento`
--

DROP TABLE IF EXISTS `tbl_statuslancamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_statuslancamento` (
  `CODSTATUSLANCAMENTO` int NOT NULL,
  `DESCRICAO` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`CODSTATUSLANCAMENTO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_statuslancamento`
--

LOCK TABLES `tbl_statuslancamento` WRITE;
/*!40000 ALTER TABLE `tbl_statuslancamento` DISABLE KEYS */;
INSERT INTO `tbl_statuslancamento` VALUES (1,'BAIXADO'),(2,'ABERTO');
/*!40000 ALTER TABLE `tbl_statuslancamento` ENABLE KEYS */;
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
INSERT INTO `tbl_statusvenda` VALUES (1,'FATURADA'),(2,'PENDENTE'),(3,'CANCELADA');
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
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_usuario`
--

LOCK TABLES `tbl_usuario` WRITE;
/*!40000 ALTER TABLE `tbl_usuario` DISABLE KEYS */;
INSERT INTO `tbl_usuario` VALUES (1,'MESTRE','25f9e794323b453885f5181f1b624d0b',1,1);
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
  `DATAATUALIZACAO` date DEFAULT NULL,
  PRIMARY KEY (`CODVENDA`),
  KEY `TBL_VENDA_FK01_idx` (`CODCLIENTE`),
  KEY `TBL_VENDA_FK02_idx` (`CODSTATUSVENDA`),
  KEY `TBL_VENDA_FK03_idx` (`CODTIPOPAGAMENTO`),
  CONSTRAINT `TBL_VENDA_FK01` FOREIGN KEY (`CODCLIENTE`) REFERENCES `tbl_cliente` (`CODCLIENTE`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `TBL_VENDA_FK02` FOREIGN KEY (`CODSTATUSVENDA`) REFERENCES `tbl_statusvenda` (`CODSTATUSVENDA`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `TBL_VENDA_FK03` FOREIGN KEY (`CODTIPOPAGAMENTO`) REFERENCES `tbl_tipopagamento` (`CODTIPOPAGAMENTO`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=153 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_venda`
--

LOCK TABLES `tbl_venda` WRITE;
/*!40000 ALTER TABLE `tbl_venda` DISABLE KEYS */;
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

-- Dump completed on 2021-10-11 23:02:07
