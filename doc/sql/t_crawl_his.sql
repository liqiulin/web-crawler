/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : thzj

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2017-11-26 11:35:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_crawl_his
-- ----------------------------
DROP TABLE IF EXISTS `t_crawl_his`;
CREATE TABLE `t_crawl_his` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `model_id` varchar(200) NOT NULL COMMENT '抓取对象存储表ID',
  `crawl_id` varchar(100) NOT NULL COMMENT '抓取',
  `crawl_type` int(11) NOT NULL COMMENT '抓取类型：1 投资机构 2 投资人 3 项目',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `src_type` int(11) NOT NULL COMMENT '数据来源：1 创投圈',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
