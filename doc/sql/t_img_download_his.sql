/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : thzj

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2017-11-26 11:36:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_img_download_his
-- ----------------------------
DROP TABLE IF EXISTS `t_img_download_his`;
CREATE TABLE `t_img_download_his` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `img_url` varchar(2000) NOT NULL COMMENT '图片地址',
  `save_path` varchar(1000) NOT NULL COMMENT '保存地址',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
