CREATE TABLE `CLIENT` (
  `CLIENT_KEY` bigint(20) NOT NULL AUTO_INCREMENT,
  `NAME_TYPE_CODE` int(11) DEFAULT NULL COMMENT 'Name Data Quality',
  `NAME_LAST` varchar(200) DEFAULT NULL,
  `NAME_FIRST` varchar(200) DEFAULT NULL,
  `NAME_MIDDLE` varchar(200) DEFAULT NULL,
  `NAME_SUFFIX` varchar(200) DEFAULT NULL,
  `SOC_SEC_TYPE_CODE` int(11) DEFAULT NULL,
  `SOC_SEC_NUMBER` varchar(40) DEFAULT NULL,
  `DOB_TYPE_CODE` int(11) DEFAULT NULL,
  `DATE_OF_BIRTH` date DEFAULT NULL,
  `ETHNICITY_CODE` int(11) DEFAULT NULL,
  `GENDER_CODE` int(11) DEFAULT NULL,
  `VETERAN_STATUS_GCT` int(11) DEFAULT NULL,
  `REC_ACTIVE_GCT` int(11) DEFAULT '1',
  `ENTRY_DATE_TIME` timestamp NULL DEFAULT NULL,
  `ENTRY_USER_KEY` bigint(20) DEFAULT NULL,
  `LOG_DATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `LOG_USER_KEY` bigint(20) DEFAULT NULL,
  `ACT_DATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`CLIENT_KEY`),
  KEY `CLIENT_H_NAME_MIDDLE_IDX_` (`NAME_MIDDLE`),
  KEY `CLIENT_H_NAME_LAST_IDX` (`NAME_LAST`),
  KEY `CLIENT_H_ETHNICITY_IDX` (`ETHNICITY_CODE`),
  KEY `CLIENT_H_SOC_SEC_NUM_IDX` (`SOC_SEC_NUMBER`),
  KEY `CLIENT_H_GENDER_IDX` (`GENDER_CODE`),
  KEY `CLIENT_H_VETERAN_IDX` (`VETERAN_STATUS_GCT`),
  KEY `CLIENT_H_NAME_FIRST_IDX` (`NAME_FIRST`)
) ENGINE=InnoDB AUTO_INCREMENT=86713 DEFAULT CHARSET=utf8;