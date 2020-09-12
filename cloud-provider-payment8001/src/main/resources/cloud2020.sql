drop database if EXISTS  cloud2020;
CREATE database cloud2020 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

-- ----------------------------
-- Table structure for payment
-- ----------------------------
DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment`(
                          `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
                          `serial` varchar(200) DEFAULT '',
                          PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of payment
-- ----------------------------
INSERT INTO `payment` VALUES (1, 'atguigu@q');