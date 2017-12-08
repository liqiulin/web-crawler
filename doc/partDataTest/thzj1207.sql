/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : thzj1207

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2017-12-07 21:45:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for rb_attach
-- ----------------------------
DROP TABLE IF EXISTS `rb_attach`;
CREATE TABLE `rb_attach` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `attach_title` varchar(200) DEFAULT NULL,
  `attach_real_title` varchar(100) DEFAULT NULL,
  `attach_file_type` varchar(200) DEFAULT NULL,
  `attach_sequence` int(11) DEFAULT NULL,
  `attach_path` varchar(1024) DEFAULT NULL,
  `attach_tablename` varchar(50) DEFAULT NULL,
  `attach_relate_id` int(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=462 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rb_attach
-- ----------------------------

-- ----------------------------
-- Table structure for rb_unit_message
-- ----------------------------
DROP TABLE IF EXISTS `rb_unit_message`;
CREATE TABLE `rb_unit_message` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) DEFAULT NULL,
  `company_name` varchar(128) DEFAULT NULL COMMENT '单位名称',
  `company_industry` int(10) DEFAULT NULL COMMENT '单位性质',
  `work` int(10) DEFAULT NULL COMMENT '单位行业',
  `work_grade` varchar(300) DEFAULT NULL COMMENT '工作级别',
  `zhiwei` varchar(128) DEFAULT NULL COMMENT '职 位',
  `serve_time` datetime DEFAULT NULL COMMENT '服务时间',
  `to_serve_time` datetime DEFAULT NULL COMMENT '服务时间',
  `work_year` int(10) DEFAULT NULL COMMENT '工作年限',
  `work_tel` varchar(20) DEFAULT NULL COMMENT '工作电话',
  `company_add` varchar(200) DEFAULT NULL COMMENT '公司地址',
  `company_website` varchar(200) DEFAULT NULL COMMENT '公司网站',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注说明',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rb_unit_message
-- ----------------------------

-- ----------------------------
-- Table structure for rb_user
-- ----------------------------
DROP TABLE IF EXISTS `rb_user`;
CREATE TABLE `rb_user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type_id` int(11) DEFAULT NULL COMMENT '1.钻石会员 2.黄金会员3.白银会员4.普通会员5.客服  //1.普通会员 2.高级会员',
  `user_account` varchar(30) DEFAULT NULL,
  `user_password` varchar(50) DEFAULT NULL,
  `user_paypassword` varchar(255) DEFAULT NULL COMMENT '该字段改为公司名',
  `user_vouch` int(2) DEFAULT '0' COMMENT '担保资格 0否，1',
  `user_islock` int(2) NOT NULL DEFAULT '0' COMMENT '0否，1是',
  `invite_userid` int(11) DEFAULT NULL COMMENT '邀请好友',
  `invite_money` varchar(10) DEFAULT '0' COMMENT '邀请注册提成',
  `card_type` int(11) DEFAULT NULL,
  `card_number` char(20) DEFAULT NULL,
  `card_front_img` varchar(1024) DEFAULT NULL,
  `card_back_img` varchar(1024) DEFAULT NULL,
  `user_nation` varchar(20) DEFAULT NULL,
  `user_realname` varchar(20) DEFAULT NULL,
  `user_integral` varchar(10) DEFAULT NULL COMMENT '资料完整度',
  `avatar_status` int(2) DEFAULT '0',
  `realname_status` int(2) DEFAULT '-2' COMMENT '-2 未申请，-1申请中，1未通过，2，通过',
  `email_status` int(2) DEFAULT '-2',
  `phone_status` int(2) DEFAULT '-2',
  `video_status` int(2) DEFAULT '-2' COMMENT '视频认证',
  `scene_status` int(2) DEFAULT '-2' COMMENT '现场认证',
  `user_email` varchar(30) DEFAULT NULL,
  `user_sex` char(10) DEFAULT NULL,
  `avatar_img` varchar(1024) DEFAULT NULL,
  `user_tel` varchar(50) DEFAULT NULL,
  `user_phone` varchar(50) DEFAULT NULL,
  `user_qq` varchar(50) DEFAULT NULL,
  `user_question` varchar(10) DEFAULT NULL,
  `user_answer` varchar(100) DEFAULT NULL,
  `user_birthday` datetime DEFAULT NULL,
  `user_province` varchar(50) DEFAULT NULL,
  `user_city` varchar(50) DEFAULT NULL,
  `user_area` varchar(50) DEFAULT NULL COMMENT '这个字段改为职位',
  `user_address` varchar(200) DEFAULT NULL,
  `user_remind` text COMMENT '提醒设置',
  `user_privacy` text COMMENT '隐私设置',
  `user_addtime` timestamp NULL DEFAULT NULL,
  `user_addip` varchar(16) DEFAULT NULL,
  `user_logintime` timestamp NULL DEFAULT NULL,
  `user_loginip` varchar(16) DEFAULT NULL,
  `is_system` int(11) DEFAULT '2' COMMENT '1，是 2，不是',
  `isThirdparty` int(11) DEFAULT NULL,
  `uid` varchar(50) DEFAULT NULL,
  `invitation_code` varchar(50) DEFAULT NULL COMMENT '邀请码',
  `yb_register_status` int(1) DEFAULT '-2' COMMENT '易宝注册状态（-2 未申请，-1申请中，1通过，0，未通过）',
  `yb_register_time` timestamp NULL DEFAULT NULL COMMENT '易宝注册时间',
  `partner_account` int(1) DEFAULT '0' COMMENT '是否合伙企业账号(0:不是；1:是)',
  `autoRed_flag` int(11) NOT NULL DEFAULT '1' COMMENT '开启自动打开红包;1不开启；2开启',
  `deposit_userid` varchar(50) DEFAULT NULL,
  `deposit_usrCustId` varchar(30) DEFAULT NULL,
  `isOwnerAuthed` int(1) DEFAULT '0' COMMENT '业主认证 1 已认证 其他 未认证',
  `user_des` varchar(1000) DEFAULT NULL,
  `comp_des` varchar(1000) DEFAULT NULL,
  `weixin` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1758 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rb_user
-- ----------------------------
INSERT INTO `rb_user` VALUES ('1751', null, null, null, null, '0', '0', null, '0', null, null, null, null, null, '庆雪辉', null, '0', '-2', '-2', '-2', '-2', '-2', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2', null, null, null, '-2', null, '0', '1', null, null, '0', null, null, null);
INSERT INTO `rb_user` VALUES ('1752', null, null, null, null, '0', '0', null, '0', null, null, null, null, null, '胡丹', null, '0', '-2', '-2', '-2', '-2', '-2', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2', null, null, null, '-2', null, '0', '1', null, null, '0', null, null, null);
INSERT INTO `rb_user` VALUES ('1753', null, null, null, null, '0', '0', null, '0', null, null, null, null, null, '陈俊竹', null, '0', '-2', '-2', '-2', '-2', '-2', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2', null, null, null, '-2', null, '0', '1', null, null, '0', null, null, null);
INSERT INTO `rb_user` VALUES ('1754', null, null, null, null, '0', '0', null, '0', null, null, null, null, null, '余海洋', null, '0', '-2', '-2', '-2', '-2', '-2', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2', null, null, null, '-2', null, '0', '1', null, null, '0', null, null, null);
INSERT INTO `rb_user` VALUES ('1755', null, null, null, null, '0', '0', null, '0', null, null, null, null, null, '沈南鹏', null, '0', '-2', '-2', '-2', '-2', '-2', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2', null, null, null, '-2', null, '0', '1', null, null, '0', null, null, null);
INSERT INTO `rb_user` VALUES ('1756', null, null, null, null, '0', '0', null, '0', null, null, null, null, null, '王柏凯', null, '0', '-2', '-2', '-2', '-2', '-2', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2', null, null, null, '-2', null, '0', '1', null, null, '0', null, null, null);
INSERT INTO `rb_user` VALUES ('1757', null, null, null, null, '0', '0', null, '0', null, null, null, null, null, '李张鲁Dennis Roudenko', null, '0', '-2', '-2', '-2', '-2', '-2', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2', null, null, null, '-2', null, '0', '1', null, null, '0', null, null, null);

-- ----------------------------
-- Table structure for t_article
-- ----------------------------
DROP TABLE IF EXISTS `t_article`;
CREATE TABLE `t_article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL COMMENT '标题',
  `image` varchar(1024) DEFAULT NULL COMMENT '图片',
  `keyword` varchar(255) DEFAULT NULL COMMENT '关键字',
  `author_id` int(11) NOT NULL COMMENT '作者',
  `type` int(11) NOT NULL COMMENT '分类1:投融事件, 2:投资人说, 3:行业观察, 4:创业心路',
  `publish_date` datetime DEFAULT NULL COMMENT '发布时间',
  `content` text COMMENT '文章类容',
  `external_url` varchar(1024) DEFAULT NULL COMMENT '外部文章地址',
  `summary` varchar(1024) DEFAULT NULL COMMENT '概要',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_article
-- ----------------------------

-- ----------------------------
-- Table structure for t_bp_primary_table
-- ----------------------------
DROP TABLE IF EXISTS `t_bp_primary_table`;
CREATE TABLE `t_bp_primary_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `generation_time` datetime DEFAULT NULL,
  `industry` varchar(50) DEFAULT NULL COMMENT '行业',
  `stage` varchar(50) DEFAULT NULL COMMENT '阶段（1初创阶段，2成长阶段，3稳定阶段）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_bp_primary_table
-- ----------------------------

-- ----------------------------
-- Table structure for t_bp_slave_table
-- ----------------------------
DROP TABLE IF EXISTS `t_bp_slave_table`;
CREATE TABLE `t_bp_slave_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'bp从表id',
  `bp_id` int(11) DEFAULT NULL COMMENT 'bp主表id',
  `node` varchar(255) DEFAULT NULL COMMENT '节点',
  `content` text COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_bp_slave_table
-- ----------------------------

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
) ENGINE=InnoDB AUTO_INCREMENT=255 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_crawl_his
-- ----------------------------
INSERT INTO `t_crawl_his` VALUES ('234', '216', '6155', '1', '2017-12-07 21:00:34', '1');
INSERT INTO `t_crawl_his` VALUES ('235', '217', '6171', '1', '2017-12-07 21:00:34', '1');
INSERT INTO `t_crawl_his` VALUES ('236', '218', '2999', '1', '2017-12-07 21:00:34', '1');
INSERT INTO `t_crawl_his` VALUES ('237', '219', '2734', '1', '2017-12-07 21:00:34', '1');
INSERT INTO `t_crawl_his` VALUES ('238', '220', '2996', '1', '2017-12-07 21:00:34', '1');
INSERT INTO `t_crawl_his` VALUES ('239', '221', '2752', '1', '2017-12-07 21:00:35', '1');
INSERT INTO `t_crawl_his` VALUES ('240', '222', '2982', '1', '2017-12-07 21:00:35', '1');
INSERT INTO `t_crawl_his` VALUES ('241', '223', '174063', '2', '2017-12-07 21:00:35', '1');
INSERT INTO `t_crawl_his` VALUES ('242', '224', '19662', '2', '2017-12-07 21:00:35', '1');
INSERT INTO `t_crawl_his` VALUES ('243', '225', '132107', '2', '2017-12-07 21:00:36', '1');
INSERT INTO `t_crawl_his` VALUES ('244', '226', '30538', '2', '2017-12-07 21:00:36', '1');
INSERT INTO `t_crawl_his` VALUES ('245', '227', '43380', '2', '2017-12-07 21:00:36', '1');
INSERT INTO `t_crawl_his` VALUES ('246', '228', '175681', '2', '2017-12-07 21:00:36', '1');
INSERT INTO `t_crawl_his` VALUES ('247', '229', '13633', '2', '2017-12-07 21:00:36', '1');
INSERT INTO `t_crawl_his` VALUES ('248', '48', '124086', '3', '2017-12-07 21:00:37', '1');
INSERT INTO `t_crawl_his` VALUES ('249', '49', '124381', '3', '2017-12-07 21:00:37', '1');
INSERT INTO `t_crawl_his` VALUES ('250', '50', '124403', '3', '2017-12-07 21:00:37', '1');
INSERT INTO `t_crawl_his` VALUES ('251', '51', '124402', '3', '2017-12-07 21:00:38', '1');
INSERT INTO `t_crawl_his` VALUES ('252', '52', '124224', '3', '2017-12-07 21:00:39', '1');
INSERT INTO `t_crawl_his` VALUES ('253', '53', '80373', '3', '2017-12-07 21:00:39', '1');
INSERT INTO `t_crawl_his` VALUES ('254', '54', '103418', '3', '2017-12-07 21:00:40', '1');

-- ----------------------------
-- Table structure for t_development_history
-- ----------------------------
DROP TABLE IF EXISTS `t_development_history`;
CREATE TABLE `t_development_history` (
  `id` int(11) NOT NULL COMMENT '主键id',
  `project_id` int(11) DEFAULT NULL COMMENT '项目id',
  `add_time` datetime DEFAULT NULL COMMENT '时间',
  `profile` text COMMENT '简介',
  `stage` varchar(255) DEFAULT NULL COMMENT '阶段',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_development_history
-- ----------------------------

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
) ENGINE=InnoDB AUTO_INCREMENT=329 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_img_download_his
-- ----------------------------
INSERT INTO `t_img_download_his` VALUES ('281', 'https://assets1.vc.cn/assets.vc.cn/system/institution/avatars/2999/thumb/5cb150129cef49fcb423214ac8be833b.jpg?1490091501', '/files/2017-12-07/9bebd9fc-6483-40cb-b201-c4680d01c3dd.jpg', '2017-12-07 21:00:34');
INSERT INTO `t_img_download_his` VALUES ('282', 'https://assets3.vc.cn/assets.vc.cn/system/institution/avatars/2734/thumb/b0b29bdd674d949c19c2598ce025f902.jpg?1490091255', '/files/2017-12-07/894ec5f8-c486-4cee-9a55-55ad72cbfbdc.jpg', '2017-12-07 21:00:34');
INSERT INTO `t_img_download_his` VALUES ('283', 'https://assets1.vc.cn/assets.vc.cn/system/institution/avatars/2996/thumb/451192a6e611ae912c73ad4a37153f47.jpg?1490091495', '/files/2017-12-07/d4466a17-636b-4118-ab55-7ec915db48a5.jpg', '2017-12-07 21:00:34');
INSERT INTO `t_img_download_his` VALUES ('284', 'https://assets2.vc.cn/assets.vc.cn/system/institution/avatars/2752/thumb/5c5c491c612a23c34e895adbef090a20.jpg?1490091270', '/files/2017-12-07/ff5ff3c7-15fc-4ee6-80e9-6400c974efdb.jpg', '2017-12-07 21:00:35');
INSERT INTO `t_img_download_his` VALUES ('285', 'https://assets0.vc.cn/assets.vc.cn/system/institution/avatars/2982/thumb/219cc4c6c75b12c5c02016b155012827.jpg?1490091474', '/files/2017-12-07/2d24cf3f-509e-4a7b-8031-cb4a24acfc0e.jpg', '2017-12-07 21:00:35');
INSERT INTO `t_img_download_his` VALUES ('286', 'https://assets0.vc.cn/assets.vc.cn/system/user/avatars/174063/thumb/802d9f09681bc61766d305b0032bba18.jpg?1490748141', '/files/2017-12-07/25bcc9ae-96cc-4262-a816-9c6d82c36449.jpg', '2017-12-07 21:00:35');
INSERT INTO `t_img_download_his` VALUES ('287', 'https://assets3.vc.cn/assets.vc.cn/system/user/avatars/19662/thumb/6733da2953eebdd3021d8ed5d4d70655.jpg?1368254104', '/files/2017-12-07/51a20494-55cf-4beb-ac68-c08c2c00893e.jpg', '2017-12-07 21:00:35');
INSERT INTO `t_img_download_his` VALUES ('288', 'https://assets1.vc.cn/assets.vc.cn/system/user/avatars/132107/thumb/9e1601c8a99d691c09eb8da441f17c0b.png?1486373225', '/files/2017-12-07/c0dd05ef-9d36-475a-9148-d1200d9505a9.png', '2017-12-07 21:00:36');
INSERT INTO `t_img_download_his` VALUES ('289', 'https://www.vc.cn/images/web/users/icon_investor.png', '/files/2017-12-07/54d3743d-0a73-4465-824b-608ffd5b4f9a.png', '2017-12-07 21:00:36');
INSERT INTO `t_img_download_his` VALUES ('290', 'https://assets1.vc.cn/assets.vc.cn/system/user/avatars/175681/thumb/938a7a908c8283089d435f97212a50af.png?1491467563', '/files/2017-12-07/825450cf-b4e9-4291-8091-204fd84fb42a.png', '2017-12-07 21:00:36');
INSERT INTO `t_img_download_his` VALUES ('291', 'https://assets1.vc.cn/assets.vc.cn/system/user/avatars/13633/thumb/174c60a232e3724da3534f08cd496fc8.jpg?1455852546', '/files/2017-12-07/3d4d2aa5-ea74-4bce-9489-bd5069b3c8f3.jpg', '2017-12-07 21:00:36');
INSERT INTO `t_img_download_his` VALUES ('292', 'https://assets1.vc.cn/assets.vc.cn/system/startup/avatars/124086/thumb/04dcf09be32eeec3fbaad36fd3bf1d8d.png?1509523049', '/files/2017-12-07/04ea5b4e-ba5e-439b-97a4-28ec861f0475.png', '2017-12-07 21:00:37');
INSERT INTO `t_img_download_his` VALUES ('293', 'https://assets1.vc.cn/assets.vc.cn/system/photos/avatars/000/132/231/original/7b237777050eac30fa05cdc47f875d13.png?1509523049', '/files/2017-12-07/b07f9918-17bb-42f1-b93d-d983e122f7f4.png', '2017-12-07 21:00:37');
INSERT INTO `t_img_download_his` VALUES ('294', 'https://assets2.vc.cn/assets.vc.cn/system/startup/avatars/124381/thumb/e98b01649b6340ef7f049619360d8b47.png?1510282739', '/files/2017-12-07/1364e210-9623-4a1e-985f-f331851685cd.png', '2017-12-07 21:00:37');
INSERT INTO `t_img_download_his` VALUES ('295', 'https://assets3.vc.cn/assets.vc.cn/system/startup/avatars/124403/thumb/96b9ca05b271de606ec907b62d114cb8.jpg?1510305042', '/files/2017-12-07/d1a314c4-3844-43de-aa3c-a66093e1f291.jpg', '2017-12-07 21:00:37');
INSERT INTO `t_img_download_his` VALUES ('296', 'https://assets2.vc.cn/assets.vc.cn/system/photos/avatars/000/132/911/original/5bdcaa36002418a87a7aec101626138b.jpg?1510305042', '/files/2017-12-07/768e65a6-eb05-4aea-8b79-4e421e93f30e.jpg', '2017-12-07 21:00:37');
INSERT INTO `t_img_download_his` VALUES ('297', 'https://assets3.vc.cn/assets.vc.cn/system/startup/avatars/124402/thumb/a0f846d8951910f92a2cbbf2580328b0.png?1510304888', '/files/2017-12-07/642edcd4-33e1-4484-bce4-4c9c8d667b57.png', '2017-12-07 21:00:37');
INSERT INTO `t_img_download_his` VALUES ('298', 'https://assets1.vc.cn/assets.vc.cn/system/photos/avatars/000/132/910/original/cfac60218472977d36eb18516bafc0ec.png?1510304889', '/files/2017-12-07/4c4e362c-3f07-44db-a0f5-8a7508285b29.png', '2017-12-07 21:00:38');
INSERT INTO `t_img_download_his` VALUES ('299', 'https://assets3.vc.cn/assets.vc.cn/system/startup/avatars/124224/thumb/cd237d8257ee1787292bc91bf1dfdf51.png?1509937923', '/files/2017-12-07/a7e35c19-a532-44a6-b814-7aec30a35fe9.png', '2017-12-07 21:00:38');
INSERT INTO `t_img_download_his` VALUES ('300', 'https://assets2.vc.cn/assets.vc.cn/system/photos/avatars/000/132/536/original/89fbffd34bdeb97d009e7b88cf8e8428.png?1509937923', '/files/2017-12-07/320e095f-7d90-43d5-87e0-bf0b1e5cee6e.png', '2017-12-07 21:00:39');
INSERT INTO `t_img_download_his` VALUES ('301', 'https://assets2.vc.cn/assets.vc.cn/system/startup/avatars/80373/thumb/d6cb96794a9232cb476a885c8ba325d4.jpg?1510728891', '/files/2017-12-07/2b86a7ef-aad9-4b07-aad2-b04f113ebd2e.jpg', '2017-12-07 21:00:39');
INSERT INTO `t_img_download_his` VALUES ('302', 'https://assets2.vc.cn/assets.vc.cn/system/photos/avatars/000/082/430/original/4.png?1510728892', '/files/2017-12-07/b3b7c04c-53a5-4dd5-b103-1ada8f9e46f0.png', '2017-12-07 21:00:39');
INSERT INTO `t_img_download_his` VALUES ('303', 'https://assets1.vc.cn/assets.vc.cn/system/startup/avatars/103418/thumb/569ddec04be6b62c1d445a9a3e9b3156.png?1490178997', '/files/2017-12-07/6ac34bc7-dbc4-4a3e-b0c3-c25c1df9b2bb.png', '2017-12-07 21:00:39');
INSERT INTO `t_img_download_his` VALUES ('304', 'https://assets2.vc.cn/assets.vc.cn/system/photos/avatars/000/104/532/original/4350babbc2fb0915eabe0c02022b9654.png?1490178998', '/files/2017-12-07/cede8ea2-b5ba-4aa0-a5a2-050eb791369a.png', '2017-12-07 21:00:40');
INSERT INTO `t_img_download_his` VALUES ('305', 'https://assets0.vc.cn/assets.vc.cn/system/institution/avatars/2999/thumb/5cb150129cef49fcb423214ac8be833b.jpg?1490091501', '/files/2017-12-07/152e9cf2-57cc-4cc8-9eb1-4964f04c9495.jpg', '2017-12-07 21:43:16');
INSERT INTO `t_img_download_his` VALUES ('306', 'https://assets3.vc.cn/assets.vc.cn/system/institution/avatars/2996/thumb/451192a6e611ae912c73ad4a37153f47.jpg?1490091495', '/files/2017-12-07/f047d8c9-6688-42c1-ba33-a10905c133a7.jpg', '2017-12-07 21:43:17');
INSERT INTO `t_img_download_his` VALUES ('307', 'https://assets3.vc.cn/assets.vc.cn/system/institution/avatars/2752/thumb/5c5c491c612a23c34e895adbef090a20.jpg?1490091270', '/files/2017-12-07/84db99d1-e55f-4433-a6e9-df421e2c87b7.jpg', '2017-12-07 21:43:17');
INSERT INTO `t_img_download_his` VALUES ('308', 'https://assets1.vc.cn/assets.vc.cn/system/institution/avatars/2982/thumb/219cc4c6c75b12c5c02016b155012827.jpg?1490091474', '/files/2017-12-07/ceb0ef49-f857-4446-a040-54c9e0aae729.jpg', '2017-12-07 21:43:17');
INSERT INTO `t_img_download_his` VALUES ('309', 'https://assets3.vc.cn/assets.vc.cn/system/user/avatars/174063/thumb/802d9f09681bc61766d305b0032bba18.jpg?1490748141', '/files/2017-12-07/fb837829-40a3-4ad4-92d8-f519f6623f75.jpg', '2017-12-07 21:43:17');
INSERT INTO `t_img_download_his` VALUES ('310', 'https://assets0.vc.cn/assets.vc.cn/system/user/avatars/19662/thumb/6733da2953eebdd3021d8ed5d4d70655.jpg?1368254104', '/files/2017-12-07/ec01f988-7027-4881-8610-9cfd56be38ad.jpg', '2017-12-07 21:43:17');
INSERT INTO `t_img_download_his` VALUES ('311', 'https://assets2.vc.cn/assets.vc.cn/system/user/avatars/132107/thumb/9e1601c8a99d691c09eb8da441f17c0b.png?1486373225', '/files/2017-12-07/e0cf1c26-813a-48dd-8038-46ad29a673da.png', '2017-12-07 21:43:18');
INSERT INTO `t_img_download_his` VALUES ('312', 'https://assets0.vc.cn/assets.vc.cn/system/user/avatars/175681/thumb/938a7a908c8283089d435f97212a50af.png?1491467563', '/files/2017-12-07/02bd0467-6bf4-4bf8-aea8-5ca0c060cd6b.png', '2017-12-07 21:43:19');
INSERT INTO `t_img_download_his` VALUES ('313', 'https://assets2.vc.cn/assets.vc.cn/system/user/avatars/13633/thumb/174c60a232e3724da3534f08cd496fc8.jpg?1455852546', '/files/2017-12-07/c0ae6b3c-580d-4ec2-9c97-60c4dba93470.jpg', '2017-12-07 21:43:19');
INSERT INTO `t_img_download_his` VALUES ('314', 'https://assets0.vc.cn/assets.vc.cn/system/startup/avatars/124086/thumb/04dcf09be32eeec3fbaad36fd3bf1d8d.png?1509523049', '/files/2017-12-07/71eaec16-cf90-4537-a994-86c82200e093.png', '2017-12-07 21:43:19');
INSERT INTO `t_img_download_his` VALUES ('315', 'https://assets1.vc.cn/assets.vc.cn/system/startup/avatars/124403/thumb/96b9ca05b271de606ec907b62d114cb8.jpg?1510305042', '/files/2017-12-07/11aaca78-1f27-4423-aa83-1a907161c33b.jpg', '2017-12-07 21:43:19');
INSERT INTO `t_img_download_his` VALUES ('316', 'https://assets1.vc.cn/assets.vc.cn/system/photos/avatars/000/132/911/original/5bdcaa36002418a87a7aec101626138b.jpg?1510305042', '/files/2017-12-07/399ff22b-1940-4bd7-9d1b-e932bd2f417f.jpg', '2017-12-07 21:43:19');
INSERT INTO `t_img_download_his` VALUES ('317', 'https://assets1.vc.cn/assets.vc.cn/system/startup/avatars/124402/thumb/a0f846d8951910f92a2cbbf2580328b0.png?1510304888', '/files/2017-12-07/1eaf0fea-949c-47c4-a1f1-cdef30d33c08.png', '2017-12-07 21:43:19');
INSERT INTO `t_img_download_his` VALUES ('318', 'https://assets3.vc.cn/assets.vc.cn/system/photos/avatars/000/132/910/original/cfac60218472977d36eb18516bafc0ec.png?1510304889', '/files/2017-12-07/70b5ae9e-bb19-4671-9b6d-4c7293d4e4f4.png', '2017-12-07 21:43:20');
INSERT INTO `t_img_download_his` VALUES ('319', 'https://assets1.vc.cn/assets.vc.cn/system/startup/avatars/124224/thumb/cd237d8257ee1787292bc91bf1dfdf51.png?1509937923', '/files/2017-12-07/75517bfb-181f-4edd-8c5d-eb394e0fe72c.png', '2017-12-07 21:43:20');
INSERT INTO `t_img_download_his` VALUES ('320', 'https://assets0.vc.cn/assets.vc.cn/system/startup/avatars/80373/thumb/d6cb96794a9232cb476a885c8ba325d4.jpg?1510728891', '/files/2017-12-07/616ae3ab-2301-4f25-a9bb-289cfe00063b.jpg', '2017-12-07 21:43:20');
INSERT INTO `t_img_download_his` VALUES ('321', 'https://assets0.vc.cn/assets.vc.cn/system/photos/avatars/000/082/430/original/4.png?1510728892', '/files/2017-12-07/ed4ca198-8e20-4d01-9ea3-4285e400ace3.png', '2017-12-07 21:43:21');
INSERT INTO `t_img_download_his` VALUES ('322', 'https://assets1.vc.cn/assets.vc.cn/system/user/avatars/142322/thumb/ff5ad66d65fafba6efea24b5ee341e7c.jpg?1490075681', '/files/2017-12-07/6bc2aebe-8598-4691-9def-81ff09543dcf.jpg', '2017-12-07 21:43:21');
INSERT INTO `t_img_download_his` VALUES ('323', 'https://assets3.vc.cn/assets.vc.cn/system/user/avatars/156825/thumb/f1ed3b6b2f5f201a5d1357013b77b2f6.jpg?1490080156', '/files/2017-12-07/e74a8763-8a72-4d76-a923-6c93e7a24747.jpg', '2017-12-07 21:43:21');
INSERT INTO `t_img_download_his` VALUES ('324', 'https://assets2.vc.cn/assets.vc.cn/system/startup/avatars/103418/thumb/569ddec04be6b62c1d445a9a3e9b3156.png?1490178997', '/files/2017-12-07/135fe7b0-307d-4982-9d9b-6796a6734ea3.png', '2017-12-07 21:43:21');
INSERT INTO `t_img_download_his` VALUES ('325', 'https://assets0.vc.cn/assets.vc.cn/system/photos/avatars/000/104/532/original/4350babbc2fb0915eabe0c02022b9654.png?1490178998', '/files/2017-12-07/c9247429-40cc-43c8-babb-4d9639382a0f.png', '2017-12-07 21:43:21');
INSERT INTO `t_img_download_his` VALUES ('326', 'https://assets3.vc.cn/assets.vc.cn/system/user/avatars/166609/thumb/5962e1ca5b7e52c85038d4dc3024231e.jpg?1490086062', '/files/2017-12-07/74dfaea3-3fae-45dc-b809-89846eb23e69.jpg', '2017-12-07 21:43:22');
INSERT INTO `t_img_download_his` VALUES ('327', 'https://assets3.vc.cn/assets.vc.cn/system/user/avatars/166610/thumb/8d66ed11b115e794a67afd328fdab977.jpg?1490086062', '/files/2017-12-07/fb06efc8-1099-4962-93d4-1a080c66bb64.jpg', '2017-12-07 21:43:22');
INSERT INTO `t_img_download_his` VALUES ('328', 'https://assets0.vc.cn/assets.vc.cn/system/user/avatars/166612/thumb/903eced1e2f758882e5bb44d370d2119.jpg?1490086063', '/files/2017-12-07/858d8974-91c5-425d-98ce-58e367c99918.jpg', '2017-12-07 21:43:22');

-- ----------------------------
-- Table structure for t_investor
-- ----------------------------
DROP TABLE IF EXISTS `t_investor`;
CREATE TABLE `t_investor` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` int(11) DEFAULT NULL,
  `investor_form` varchar(20) DEFAULT NULL COMMENT '投资人类型(1表示投资人，2表示投资机构)',
  `province` varchar(50) DEFAULT NULL COMMENT '省',
  `city` varchar(50) DEFAULT NULL COMMENT '市',
  `area` varchar(1024) DEFAULT NULL COMMENT '名片地址',
  `real_name` varchar(50) DEFAULT NULL COMMENT '真实姓名',
  `investor_company` varchar(500) DEFAULT NULL COMMENT '投资人所属公司简称',
  `investor_position` varchar(100) DEFAULT NULL COMMENT '职位',
  `investor_card` varchar(50) DEFAULT NULL COMMENT '身份证号码',
  `phone` varchar(50) DEFAULT NULL COMMENT '联系方式',
  `weixin` varchar(100) DEFAULT NULL COMMENT '微信号',
  `visit_img` varchar(1024) DEFAULT NULL COMMENT '头像地址',
  `investor_asset` varchar(200) DEFAULT NULL COMMENT '资产',
  `org_logo_img` varchar(1024) DEFAULT NULL COMMENT '机构logo地址',
  `org_name` varchar(200) DEFAULT NULL COMMENT '投资机构简称',
  `org_license` varchar(1024) DEFAULT NULL COMMENT '营业执照',
  `org_introduce` text COMMENT '投资机构介绍',
  `org_website` varchar(255) DEFAULT NULL COMMENT '机构网站',
  `org_members` int(20) DEFAULT NULL COMMENT '投资机构人数',
  `invested_count` int(50) DEFAULT NULL COMMENT '投资笔数',
  `collect_number` int(50) DEFAULT NULL COMMENT '被收藏数',
  `auditor` varchar(255) DEFAULT NULL COMMENT '审核人',
  `auditor_state` varchar(50) DEFAULT NULL COMMENT '审核状态(0-待审核,1审核未通过,2审核通过)',
  `auditor_time` datetime DEFAULT NULL COMMENT '审核时间',
  `auditor_comment` varchar(255) DEFAULT NULL COMMENT '审核备注',
  `reqauth_time` datetime DEFAULT NULL COMMENT '投资人认证申请时间',
  `mail_box` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `investors_profile` varchar(2048) DEFAULT NULL COMMENT '投资人简介',
  `investors_company_name` varchar(255) DEFAULT NULL COMMENT '公司全名',
  `investment_time` datetime DEFAULT NULL COMMENT '最新投资时间,用于排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=230 DEFAULT CHARSET=utf8 COMMENT='投资人认证';

-- ----------------------------
-- Records of t_investor
-- ----------------------------
INSERT INTO `t_investor` VALUES ('216', null, '2', '香港', '', null, null, null, null, null, '暂未收录', null, null, null, null, '工银国际', null, '工银国际是中国工商银行的全资金融机构，为全球客户提供投资银行服务。工银国际的历史始于1993年，中国工商银行在收购厦门国际财务有限公司49%股权时成立，1996年更名為“工商国际金融有限公司”（工商国际），并获准升格为有限制牌照银行。2002年5月，工商银行收购工商国际其余51%的股权，自此工商国际成為中国工商银行全资拥有的附属机构。2008年9月12日，工商国际正式更名为“工银国际控股有限公司”（工银国际），实现由传统商业银行向投资银行的业务转型。', 'http://www.icbci.com.hk', null, null, null, '超级管理员', '2', '2017-12-07 21:00:34', null, null, 'enquiry@icbci.com.hk', null, null, '2017-06-16 00:00:00');
INSERT INTO `t_investor` VALUES ('217', null, '2', '香港', '', null, null, null, null, null, '暂未收录', null, null, null, null, '交银国际', null, '交银国际资产管理有限公司隶属于交银国际控股有限公司，专业从事资产管理业务。业务范围包括：现金管理、股票投资、混合投资、直接投资及产业投资基金管理。', 'http://www.bocomgroup.com', null, null, null, '超级管理员', '2', '2017-12-07 21:00:34', null, null, 'enquiry@bocomgroup.com', null, null, '2017-06-16 00:00:00');
INSERT INTO `t_investor` VALUES ('218', null, '2', '北京', '东城区', null, null, null, null, null, '', null, null, null, '/files/2017-12-07/152e9cf2-57cc-4cc8-9eb1-4964f04c9495.jpg', '高通QualcommVentures', null, '高通公司风险投资基金成立于2000年，投资领域主要是电信通讯、信息电子等TMT领域。', 'https://qualcommventures.com', null, null, null, '超级管理员', '2', '2017-12-07 21:00:34', null, null, '', null, null, '2017-11-19 00:00:00');
INSERT INTO `t_investor` VALUES ('219', null, '2', '', '', null, null, null, null, null, '暂未收录', null, null, null, '/files/2017-12-07/894ec5f8-c486-4cee-9a55-55ad72cbfbdc.jpg', 'FarallonCapital法拉龙资本', null, 'Farallon Capital法拉龙资本成立于1986年，是一家对冲基金及股权管理投资机构。', 'http://www.faralloncapital.com', null, null, null, '超级管理员', '2', '2017-12-07 21:00:34', null, null, '暂未收录', null, null, '2017-06-16 00:00:00');
INSERT INTO `t_investor` VALUES ('220', null, '2', '北京', '朝阳区', null, null, null, null, null, '', null, null, null, '/files/2017-12-07/f047d8c9-6688-42c1-ba33-a10905c133a7.jpg', '红杉资本中国', null, '红杉资本创始于1972年，共有近30支基金，拥有逾100亿美元总管理资本。红杉资本中国基金目前管理总额约25亿美元和逾40亿人民币的总计8期基金，用于投资中国的高成长企业。红杉重点关注的四个方向为科技/传媒、消费品/服务、医疗健康、新能源/环保/先进制造，但所投资的公司并不限于此。', 'http://www.sequoiacap.cn', null, null, null, '超级管理员', '2', '2017-12-07 21:00:34', null, null, '', null, null, '2017-12-06 00:00:00');
INSERT INTO `t_investor` VALUES ('221', null, '2', '', '', null, null, null, null, null, '', null, null, null, '/files/2017-12-07/84db99d1-e55f-4433-a6e9-df421e2c87b7.jpg', '高瓴资本HillhouseCapital', null, '高瓴资本（Hillhouse Capital）是一家专注于长期结构性价值投资的投资公司，重点投资领域包括互联网与媒体、消费与零售、医疗健康、能源与制造业等。', 'http://HillhouseCapital_CN', null, null, null, '超级管理员', '2', '2017-12-07 21:00:35', null, null, '', null, null, '2017-11-23 00:00:00');
INSERT INTO `t_investor` VALUES ('222', null, '2', '上海', '徐汇区', null, null, null, null, null, '', null, null, null, '/files/2017-12-07/ceb0ef49-f857-4446-a040-54c9e0aae729.jpg', '腾讯', null, '腾讯产业共赢基金是腾讯公司旗下的企业创业投资平台，主要关注网络游戏、社交网络、无线互联网、电子商务以及新媒体等领域。', 'http://www.tencent.com', null, null, null, '超级管理员', '2', '2017-12-07 21:00:35', null, null, '', null, null, '2017-12-06 00:00:00');
INSERT INTO `t_investor` VALUES ('223', '1751', '1', '北京', '海淀区', null, '庆雪辉', '', '', null, null, null, '/files/2017-12-07/fb837829-40a3-4ad4-92d8-f519f6623f75.jpg', null, null, null, null, null, null, null, null, null, '超级管理员', '2', '2017-12-07 21:00:35', null, null, null, '', null, null);
INSERT INTO `t_investor` VALUES ('224', '1752', '1', '北京', '', null, '胡丹', '红杉资本中国', '副总裁', null, null, null, '/files/2017-12-07/ec01f988-7027-4881-8610-9cfd56be38ad.jpg', null, null, null, null, null, null, null, null, null, '超级管理员', '2', '2017-12-07 21:00:35', null, null, null, '胡丹 (Dan Hu)，红杉资本中国基金副总裁。关注领域为传媒与科技行业。在2010年加入红杉之前，胡丹先生曾担任麦肯锡咨询公司咨询顾问。在麦肯锡咨询，胡丹先生为包括世界银行、中国国家电网、印度Tata集团和美国TPG集团在内的世界五百强企业提供投资、战略和运营咨询意见。在此之前，胡丹先生任职于通用电器，积累了在供应链、生产、产品研发及六西格玛领域丰富的运营经验。胡丹先生拥有斯坦福大学的工商管理硕士学位， 清华大学工程学学士学位。', null, null);
INSERT INTO `t_investor` VALUES ('225', '1753', '1', '北京', '海淀区', null, '陈俊竹', '腾讯', '投资经理', null, null, null, '/files/2017-12-07/e0cf1c26-813a-48dd-8038-46ad29a673da.png', null, null, null, null, null, null, null, null, null, '超级管理员', '2', '2017-12-07 21:00:36', null, null, null, '', null, null);
INSERT INTO `t_investor` VALUES ('226', '1754', '1', '北京', '东城区', null, '余海洋', '腾讯', '投资总监', null, null, null, '/files/2017-12-07/54d3743d-0a73-4465-824b-608ffd5b4f9a.png', null, null, null, null, null, null, null, null, null, '超级管理员', '2', '2017-12-07 21:00:36', null, null, null, '', null, null);
INSERT INTO `t_investor` VALUES ('227', '1755', '1', '北京', '', null, '沈南鹏', '红杉资本中国', '合伙人', null, null, null, '/files/2017-12-07/54d3743d-0a73-4465-824b-608ffd5b4f9a.png', null, null, null, null, null, null, null, null, null, '超级管理员', '2', '2017-12-07 21:00:36', null, null, null, '沈南鹏（Neil Shen)，红杉资本中国基金创始及执行合伙人。 沈先生是携程旅行网的创始人及董事、如家连锁酒店的创始人及董事长；是分众传媒及易居中国的投资人及董事。 在创建携程旅行网之前,沈先生在纽约和香港的投资银行业工作了八年多，曾任德意志银行的董事兼中国资本市场主管。这以前,沈先生任职于美国雷曼兄弟证券和花旗银行的投资银行部门。 沈先生现任中国企业家论坛理事，浙江商会常务副会长,天津私募股权协会会长和北京私募股权协会副会长。 沈先生拥有耶鲁大学管理学硕士学位， 上海交通大学学士学位。', null, null);
INSERT INTO `t_investor` VALUES ('228', '1756', '1', '北京', '朝阳区', null, '王柏凯', '', '', null, null, null, '/files/2017-12-07/02bd0467-6bf4-4bf8-aea8-5ca0c060cd6b.png', null, null, null, null, null, null, null, null, null, '超级管理员', '2', '2017-12-07 21:00:36', null, null, null, '', null, null);
INSERT INTO `t_investor` VALUES ('229', '1757', '1', '北京', '', null, '李张鲁Dennis Roudenko', '红杉资本中国', '副总裁', null, null, null, '/files/2017-12-07/c0ae6b3c-580d-4ec2-9c97-60c4dba93470.jpg', null, null, null, null, null, null, null, null, null, '超级管理员', '2', '2017-12-07 21:00:36', null, null, null, '目前在红杉主要看互联网金融及传统产业互联网和金融升级领域。 我之前在宜信从事一些金融创新工作，也主导投资过铜板街，JRQ.com/Formax等十几家和金融结合的公司，对各种金融业务都较熟悉，同时我也深入关注物流领域,投资了云鸟与运满满', null, null);

-- ----------------------------
-- Table structure for t_investor_answer
-- ----------------------------
DROP TABLE IF EXISTS `t_investor_answer`;
CREATE TABLE `t_investor_answer` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `investor_id` int(11) DEFAULT NULL COMMENT '投资人/投资机构ID',
  `question_from_id` int(11) DEFAULT NULL COMMENT '提问人ID',
  `question_text` varchar(500) DEFAULT NULL COMMENT '问题内容',
  `reply_text` varchar(500) DEFAULT NULL COMMENT '回答内容',
  `question_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '提问时间',
  `reply_time` timestamp NULL DEFAULT NULL COMMENT '回答时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='投资人项目表';

-- ----------------------------
-- Records of t_investor_answer
-- ----------------------------

-- ----------------------------
-- Table structure for t_investor_industry
-- ----------------------------
DROP TABLE IF EXISTS `t_investor_industry`;
CREATE TABLE `t_investor_industry` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `investor_id` int(11) DEFAULT NULL COMMENT '投资人/投资机构ID',
  `industry` varchar(200) DEFAULT NULL COMMENT '关注领域',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1458 DEFAULT CHARSET=utf8 COMMENT='投资人项目表';

-- ----------------------------
-- Records of t_investor_industry
-- ----------------------------
INSERT INTO `t_investor_industry` VALUES ('1452', '217', '金融');
INSERT INTO `t_investor_industry` VALUES ('1453', '218', '互联网、移动互联网、硬件');
INSERT INTO `t_investor_industry` VALUES ('1454', '219', '互联网、移动互联网、医疗健康、环保能源、制造业、电子商务、消费、文化娱乐体育、教育、金融、硬件、农业');
INSERT INTO `t_investor_industry` VALUES ('1455', '220', '互联网、移动互联网、医疗健康、环保能源、制造业、电子商务、消费、文化娱乐体育、教育、金融、硬件、农业、游戏、工具软件、汽车交通、房产家居、旅游、企业服务、媒体营销、SNS社交网络');
INSERT INTO `t_investor_industry` VALUES ('1456', '221', '互联网、移动互联网、医疗健康、环保能源、制造业、电子商务、消费、文化娱乐体育、教育、金融、硬件');
INSERT INTO `t_investor_industry` VALUES ('1457', '222', '互联网、移动互联网、文化娱乐体育、医疗健康、制造业、消费、教育、金融、硬件、农业、游戏、电子商务、工具软件、汽车交通、房产家居、旅游、企业服务、媒体营销、SNS社交网络');

-- ----------------------------
-- Table structure for t_investor_project
-- ----------------------------
DROP TABLE IF EXISTS `t_investor_project`;
CREATE TABLE `t_investor_project` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `project_name` varchar(255) DEFAULT NULL COMMENT '项目名称',
  `investment_id` int(11) DEFAULT NULL COMMENT '投资人id',
  `investment_time` datetime DEFAULT NULL COMMENT '投资时间',
  `project_profile` varchar(1000) DEFAULT NULL COMMENT '项目简介',
  `project_url` varchar(1024) DEFAULT NULL COMMENT '项目logo',
  `investment_rounds` varchar(50) DEFAULT NULL COMMENT '融资轮次',
  `project_id` int(11) DEFAULT NULL COMMENT '项目id',
  `amount` varchar(255) DEFAULT NULL COMMENT '融投金额',
  `project_company` varchar(255) DEFAULT NULL COMMENT '项目方的公司',
  `industry` varchar(255) DEFAULT NULL COMMENT '项目所属行业',
  `audit_state` varchar(11) DEFAULT NULL COMMENT '审核状态(0表示未审核，1表示审核通过，2表示审核未通过)',
  `audit_man` varchar(255) DEFAULT NULL COMMENT '审核人',
  `audit_time` datetime DEFAULT NULL COMMENT '审核时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=512 DEFAULT CHARSET=utf8 COMMENT='投资人项目表';

-- ----------------------------
-- Records of t_investor_project
-- ----------------------------
INSERT INTO `t_investor_project` VALUES ('486', '摩拜单车', '216', '2017-06-16 00:00:00', '一家互联网短途出行解决方案', null, 'E轮', null, '6亿美元', '工银国际,高瓴资本HillhouseCapital,红杉资本中国', '汽车交通', null, null, null);
INSERT INTO `t_investor_project` VALUES ('487', '摩拜单车', '217', '2017-06-16 00:00:00', '一家互联网短途出行解决方案', null, 'E轮', null, '6亿美元', '工银国际,高瓴资本HillhouseCapital,红杉资本中国', '汽车交通', null, null, null);
INSERT INTO `t_investor_project` VALUES ('488', '爱乐奇-说宝堂', '218', '2017-11-19 00:00:00', '说宝堂信息科技（上海）有限公司是一家智能英语学习产品提供商', null, 'D轮', null, '$3750万', '高通QualcommVentures,君联资本,伟高达创投VickersCapital', '教育', null, null, null);
INSERT INTO `t_investor_project` VALUES ('489', '爱乐奇-说宝堂', '218', '2017-11-15 00:00:00', '说宝堂信息科技（上海）有限公司是一家智能英语学习产品提供商', null, '战略投资', null, '未透露', '高通QualcommVentures', '教育', null, null, null);
INSERT INTO `t_investor_project` VALUES ('490', 'Microduino/美科科技', '218', '2017-11-15 00:00:00', '美科科技专注于人工智能/创客/STEAM教育方向，为学...', null, 'Pre-A轮', null, '未透露', '高通QualcommVentures', '硬件', null, null, null);
INSERT INTO `t_investor_project` VALUES ('491', '摩拜单车', '219', '2017-06-16 00:00:00', '一家互联网短途出行解决方案', null, 'E轮', null, '6亿美元', '工银国际,高瓴资本HillhouseCapital,红杉资本中国', '汽车交通', null, null, null);
INSERT INTO `t_investor_project` VALUES ('492', '医联Medlinker/医云科技', '220', '2017-12-06 00:00:00', '面向医生群体的移动社交应用', null, 'C轮', null, '￥4亿', '华兴资本,红杉资本中国,腾讯', '医疗健康', null, null, null);
INSERT INTO `t_investor_project` VALUES ('493', '果派联合', '220', '2017-12-04 00:00:00', '一个IP增值服务平台', null, 'A+轮', null, '￥8000万', '云锋基金,天善资本,红杉资本中国', '文化娱乐', null, null, null);
INSERT INTO `t_investor_project` VALUES ('494', 'OneMena泛阿网络', '220', '2017-12-01 00:00:00', '移动软件及服务提供商', null, 'A轮', null, '$数千万', '红杉资本中国', '工具软件', null, null, null);
INSERT INTO `t_investor_project` VALUES ('495', '怪兽充电', '221', '2017-11-23 00:00:00', '桌面型共享充电宝租赁品牌', null, 'B轮', null, '2亿人民币', '顺为资本,蓝驰创投,广发信德-广发证券', '消费', null, null, null);
INSERT INTO `t_investor_project` VALUES ('496', '链家网', '221', '2017-11-20 00:00:00', '一家综合房产O2O服务公司', null, '战略投资', null, '未透露', '高瓴资本HillhouseCapital,治平资本,华兴资本', '房产家居', null, null, null);
INSERT INTO `t_investor_project` VALUES ('497', '编程猫', '221', '2017-11-17 00:00:00', '主打青少年编程教育和IT培训业务', null, 'B轮', null, '1.2亿人民币', '高瓴资本HillhouseCapital,CrystalStream清流资本,猎豹移动', '教育', null, null, null);
INSERT INTO `t_investor_project` VALUES ('498', '医联Medlinker/医云科技', '222', '2017-12-06 00:00:00', '面向医生群体的移动社交应用', null, 'C轮', null, '￥4亿', '华兴资本,红杉资本中国,腾讯', '医疗健康', null, null, null);
INSERT INTO `t_investor_project` VALUES ('499', '十字星', '222', '2017-11-22 00:00:00', '漫画内容提供商', null, 'Pre-A轮', null, '￥数百万', '腾讯', '文化娱乐', null, null, null);
INSERT INTO `t_investor_project` VALUES ('500', '猫眼电影', '222', '2017-11-10 00:00:00', '看电影提前选座不排队', null, '战略投资', null, '10亿人民币', '腾讯', '文化娱乐', null, null, null);
INSERT INTO `t_investor_project` VALUES ('501', null, null, '2017-11-01 00:00:00', null, null, '种子轮', '48', '450万人民币', null, null, '1', '超级管理员', '2017-12-07 21:43:19');
INSERT INTO `t_investor_project` VALUES ('502', null, null, '2017-11-10 00:00:00', null, null, '天使轮', '49', '数百万人民币', null, null, '1', '超级管理员', '2017-12-07 21:43:19');
INSERT INTO `t_investor_project` VALUES ('503', null, null, '2017-11-10 00:00:00', null, null, 'A轮', '50', '数千万人民币', null, null, '1', '超级管理员', '2017-12-07 21:43:19');
INSERT INTO `t_investor_project` VALUES ('504', null, null, '2017-11-10 00:00:00', null, null, '战略投资', '51', '未透露', null, null, '1', '超级管理员', '2017-12-07 21:43:20');
INSERT INTO `t_investor_project` VALUES ('505', null, null, '2017-11-04 00:00:00', null, null, '天使轮', '52', '数百万人民币', null, null, '1', '超级管理员', '2017-12-07 21:43:20');
INSERT INTO `t_investor_project` VALUES ('506', null, null, '2017-11-15 00:00:00', null, null, '战略投资', '53', '未透露', null, null, '1', '超级管理员', '2017-12-07 21:43:21');
INSERT INTO `t_investor_project` VALUES ('507', null, null, '2017-06-16 00:00:00', null, null, 'E轮', '53', '6亿美元', null, null, '1', '超级管理员', '2017-12-07 21:43:21');
INSERT INTO `t_investor_project` VALUES ('508', null, null, '2017-02-20 00:00:00', null, null, 'E轮', '53', '亿元及以上美元', null, null, '1', '超级管理员', '2017-12-07 21:43:21');
INSERT INTO `t_investor_project` VALUES ('509', null, null, '2017-11-10 00:00:00', null, null, 'IPO上市', '54', '2.98亿美元', null, null, '1', '超级管理员', '2017-12-07 21:43:21');
INSERT INTO `t_investor_project` VALUES ('510', null, null, '2015-03-20 00:00:00', null, null, 'C轮', '54', '数千万美元', null, null, '1', '超级管理员', '2017-12-07 21:43:21');
INSERT INTO `t_investor_project` VALUES ('511', null, null, '2014-04-01 00:00:00', null, null, 'B轮', '54', '5000万美元', null, null, '1', '超级管理员', '2017-12-07 21:43:21');

-- ----------------------------
-- Table structure for t_investor_round
-- ----------------------------
DROP TABLE IF EXISTS `t_investor_round`;
CREATE TABLE `t_investor_round` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `investor_id` int(11) DEFAULT NULL COMMENT '投资人/投资机构ID',
  `round` varchar(200) DEFAULT NULL COMMENT '偏好轮次',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=700 DEFAULT CHARSET=utf8 COMMENT='投资人项目表';

-- ----------------------------
-- Records of t_investor_round
-- ----------------------------
INSERT INTO `t_investor_round` VALUES ('693', '216', 'A轮、B轮、C轮及以后、IPO上市');
INSERT INTO `t_investor_round` VALUES ('694', '217', 'A轮、B轮、C轮及以后');
INSERT INTO `t_investor_round` VALUES ('695', '218', '种子轮、天使轮、Pre-A轮、A轮、B轮、收购、战略投资');
INSERT INTO `t_investor_round` VALUES ('696', '219', 'A轮、B轮、C轮及以后、IPO上市、IPO上市后');
INSERT INTO `t_investor_round` VALUES ('697', '220', 'Pre-A轮、A轮、B轮、C轮及以后');
INSERT INTO `t_investor_round` VALUES ('698', '221', 'A轮、B轮、C轮及以后、IPO上市、IPO上市后');
INSERT INTO `t_investor_round` VALUES ('699', '222', '种子轮、天使轮、Pre-A轮、A轮、B轮、C轮及以后、IPO上市、IPO上市后、收购、战略投资');

-- ----------------------------
-- Table structure for t_project
-- ----------------------------
DROP TABLE IF EXISTS `t_project`;
CREATE TABLE `t_project` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` int(11) DEFAULT NULL COMMENT '项目发起人id',
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `project_name` varchar(255) DEFAULT NULL COMMENT '项目名',
  `company_name` varchar(255) DEFAULT NULL COMMENT '公司名\r\n\r\n',
  `instruction` text COMMENT '项目简介',
  `team_lightspot` text COMMENT '团队亮点',
  `logo_url` varchar(1024) DEFAULT NULL COMMENT '项目logo地址',
  `my_identity` varchar(255) DEFAULT NULL COMMENT '我的身份',
  `project_stage` varchar(255) DEFAULT NULL COMMENT '项目阶段',
  `province` varchar(255) DEFAULT NULL COMMENT '省',
  `city` varchar(255) DEFAULT NULL COMMENT '市 (地区)',
  `industry` varchar(255) DEFAULT NULL COMMENT '所在行业',
  `labelling` varchar(255) DEFAULT NULL COMMENT '项目摘要',
  `add_time` datetime DEFAULT NULL COMMENT '创建时间',
  `financing_rounds` varchar(255) DEFAULT NULL COMMENT '融资轮次',
  `auditor` varchar(50) DEFAULT NULL COMMENT '审核人',
  `audit_time` datetime DEFAULT NULL,
  `audit_state` varchar(50) DEFAULT NULL COMMENT '状态（0未审核，1已通过，2未通过）',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `collect_number` int(50) DEFAULT NULL COMMENT '项目关注数',
  `amount_of_financing` varchar(255) DEFAULT NULL COMMENT '融资额度',
  `financing_state` varchar(255) DEFAULT NULL COMMENT '融资状态(0-进行中,1已结束)',
  `business_plan_url` varchar(1024) DEFAULT NULL COMMENT '商业计划书保存路径',
  `is_open` varchar(50) DEFAULT NULL COMMENT '是否公开给投资人  0-为不公开 1-为公开',
  `company_set_up_time` datetime DEFAULT NULL COMMENT '公司成立时间',
  `develop_journey` varchar(255) DEFAULT NULL COMMENT '发展历程',
  `products_url` varchar(1024) DEFAULT NULL COMMENT '产品图片',
  `website` varchar(255) DEFAULT NULL COMMENT '官网',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8 COMMENT='深交所项目表';

-- ----------------------------
-- Records of t_project
-- ----------------------------
INSERT INTO `t_project` VALUES ('48', null, null, '果以优', '', '果以优是一个水果新零售品牌，产品包括整果、果切以及果汁；通过办公室无人零售冷柜和线下体验店，向中高端客户提供全球优选水果。', null, '/files/2017-12-07/71eaec16-cf90-4537-a994-86c82200e093.png', null, null, '四川', '成都', '消费·本地生活', '水果新零售品牌', null, null, '超级管理员', '2017-12-07 21:00:37', '1', null, null, null, null, null, null, '2017-01-01 00:00:00', null, '/files/2017-12-07/b07f9918-17bb-42f1-b93d-d983e122f7f4.png', '');
INSERT INTO `t_project` VALUES ('49', null, null, '易未来电竞俱乐部', '中教易未来（北京）文化传媒有限公司', '易未来电竞俱乐部是一家电子竞技俱乐部，主要参与《反恐精英：全球攻势》项目的竞技赛事，同时俱乐部涉足《炉石传说》等电竞项目。俱乐部主要有于照衡、高志超等多个成员，隶属于中教易未来（北京）文化传媒有限公司。', null, '/files/2017-12-07/1364e210-9623-4a1e-985f-f331851685cd.png', null, null, '北京', '西城区', '游戏·电子竞技', '电子竞技俱乐部', null, null, '超级管理员', '2017-12-07 21:00:37', '1', null, null, null, null, null, null, '2016-02-01 00:00:00', null, null, '');
INSERT INTO `t_project` VALUES ('50', null, null, '上海劳勤COHO', '广州市创鸿信息技术有限公司', 'COHO是一个劳动力与考勤管理套件，专注于劳动力管理软件领域的研发和服务，隶属于上海劳勤信息技术有限公司。', null, '/files/2017-12-07/11aaca78-1f27-4423-aa83-1a907161c33b.jpg', null, null, '广东', '广州', '企业服务·人力资源', '劳动力与考勤管理套件', null, null, '超级管理员', '2017-12-07 21:00:37', '1', null, null, null, null, null, null, '2014-11-01 00:00:00', null, '/files/2017-12-07/399ff22b-1940-4bd7-9d1b-e932bd2f417f.jpg', '');
INSERT INTO `t_project` VALUES ('51', null, null, '知豆电动', '知豆电动汽车有限公司', '知豆智信是一家集研发、制造、销售为一体的无地域纯电动车生产企业，将新能源、智能科技和互联科技创新融合于微型化车身，聚焦微行，专注于解决城市大交通最后一公里的出行需要，已开启私人购买和租赁服务。', null, '/files/2017-12-07/1eaf0fea-949c-47c4-a1f1-cdef30d33c08.png', null, null, '浙江', '宁波', '汽车交通·交通出行', '电动汽车研发商', null, null, '超级管理员', '2017-12-07 21:00:38', '1', null, null, null, null, null, null, '2015-03-01 00:00:00', null, '/files/2017-12-07/70b5ae9e-bb19-4671-9b6d-4c7293d4e4f4.png', '');
INSERT INTO `t_project` VALUES ('52', null, null, '开工大吉', '北京开工大吉科技有限公司', '开工大吉是一家聚焦办公空间生态环境的互联网企业，以提供标准化办公室装修和办公家具为主营业务，为企业提供多元化服务解决方案。在国内首推“办公空间共享经济”模式，配合“开工租赁”模式，隶属于北京开工大吉科技有限公司。', null, '/files/2017-12-07/75517bfb-181f-4edd-8c5d-eb394e0fe72c.png', null, null, '北京', '海淀区', '房产家居·商业地产', '聚焦办公空间生态环境', null, null, '超级管理员', '2017-12-07 21:00:39', '1', null, null, null, null, null, null, '2017-07-01 00:00:00', null, '/files/2017-12-07/320e095f-7d90-43d5-87e0-bf0b1e5cee6e.png', '');
INSERT INTO `t_project` VALUES ('53', null, null, '摩拜单车', '北京摩拜科技有限公司', '摩拜单车是一家互联网短途出行解决方案，是无桩借还车模式的智能硬件，旨在让用户无需办卡,只需下载摩拜单车App完成注册,扫码解锁,支付的全过程。还车时只需在路边白线内, 手动关锁,无固定车桩。', null, '/files/2017-12-07/616ae3ab-2301-4f25-a9bb-289cfe00063b.jpg', null, null, '北京', '海淀区', '汽车交通·交通出行', '一家互联网短途出行解决方案', null, null, '超级管理员', '2017-12-07 21:00:39', '1', null, null, null, null, null, null, '2015-01-27 00:00:00', null, '/files/2017-12-07/ed4ca198-8e20-4d01-9ea3-4285e400ace3.png', 'http://www.mobike.com');
INSERT INTO `t_project` VALUES ('54', null, null, '拍拍贷', '上海拍拍贷金融信息服务有限公司', '拍拍贷是一家P2P在线借贷服务网站，隶属于上海拍拍贷金融信息服务有限公司。', null, '/files/2017-12-07/135fe7b0-307d-4982-9d9b-6796a6734ea3.png', null, null, '上海', '浦东新区', '金融·借贷', '一家P2P在线借贷服务网站', null, null, '超级管理员', '2017-12-07 21:00:40', '1', null, null, null, null, null, null, '2011-01-18 00:00:00', null, '/files/2017-12-07/c9247429-40cc-43c8-babb-4d9639382a0f.png', 'http://www.ppdai.com');

-- ----------------------------
-- Table structure for t_service_agencies
-- ----------------------------
DROP TABLE IF EXISTS `t_service_agencies`;
CREATE TABLE `t_service_agencies` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '公司名称',
  `picture_url` varchar(1024) DEFAULT NULL COMMENT '图片地址',
  `profile` varchar(255) DEFAULT NULL COMMENT '简介',
  `address_one` varchar(255) DEFAULT NULL,
  `address_two` varchar(255) DEFAULT NULL,
  `address_three` varchar(255) DEFAULT NULL,
  `address_four` varchar(255) DEFAULT NULL,
  `address_five` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL COMMENT '服务机构类型',
  `key_word` varchar(255) DEFAULT NULL COMMENT '关键字',
  `phone` varchar(255) DEFAULT NULL COMMENT '服务网站地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_service_agencies
-- ----------------------------

-- ----------------------------
-- Table structure for t_team_members
-- ----------------------------
DROP TABLE IF EXISTS `t_team_members`;
CREATE TABLE `t_team_members` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `project_id` int(11) DEFAULT NULL COMMENT '项目id',
  `members_name` varchar(50) DEFAULT NULL COMMENT '成员名字',
  `profile` text COMMENT '简介',
  `photographs_url` varchar(1024) DEFAULT NULL COMMENT '头像地址',
  `identity` varchar(255) DEFAULT NULL COMMENT '身份',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_team_members
-- ----------------------------
INSERT INTO `t_team_members` VALUES ('1', '48', '李勇', '（小黑哥）有6年企业互联网服务基因，带领BD团队创下微盟全国代理TOP3记录', null, '创始人');
INSERT INTO `t_team_members` VALUES ('2', '48', '田维军', '15年零售基因，自创NFC果汁品牌“原本果子”在全国超过8000个商超上架销售，开始筹备新三板', null, '联合创始人');
INSERT INTO `t_team_members` VALUES ('3', '49', '黄晓天', '黄晓天，电竞选手出身，从接触电竞到组建俱乐部已有15年。易未来天使（北京）国际文化传媒有限公司创始人，重庆天使埃姆电子竞技体育赛事策划有限公司执行董事。', null, '创始人');
INSERT INTO `t_team_members` VALUES ('4', '49', '赵小宇', '曾获多次CS中国冠军，效力EHOME等知名战队。后任职AMD渠道市场部游戏整合营销负责人4年，主要负责商务与市场统筹。', null, '联合创始人');
INSERT INTO `t_team_members` VALUES ('5', '50', '汪友宝', '汪友宝，上海劳勤COHO创始人、CEO。', null, 'CEO');
INSERT INTO `t_team_members` VALUES ('6', '51', '鲍文光', '知豆智信', null, 'CEO');
INSERT INTO `t_team_members` VALUES ('7', '52', '张世凯', '张世凯，为上海柚桔网络科技有限公司创始人', null, 'CEO');
INSERT INTO `t_team_members` VALUES ('8', '53', '王晓峰', '王晓峰，北京摩拜科技有限公司CEO，曾担任Uber上海总经理、腾讯副总经理、Coty销售总监、Google中国华东渠道负责人等，还曾在宝洁先后担任各种销售岗位销售各种产品 从纸尿裤到SK II ...', '/files/2017-12-07/6bc2aebe-8598-4691-9def-81ff09543dcf.jpg', '创始人');
INSERT INTO `t_team_members` VALUES ('9', '53', '胡玮炜', '胡玮炜，摩拜单车联合创始人、总裁，前GeekCar极客汽车创始人、CEO，资深媒体人。行走于汽车江湖多年，职业贯穿汽车厂商、财经类报纸、都市类媒体、网络媒体和一线杂志，以灵秀气质、犀利笔锋和上下...', '/files/2017-12-07/e74a8763-8a72-4d76-a923-6c93e7a24747.jpg', '创始人');
INSERT INTO `t_team_members` VALUES ('10', '53', '李斌', '李斌，易车网创始人、总裁。毕业于北京大学社会学系，辅修法律及计算机。在大三的时候，曾在中国青年报当记者；1996年初创办北京南极科技发展有限公司，1997年创办北京科文书业信息技术有限公司；20...', null, '董事长');
INSERT INTO `t_team_members` VALUES ('11', '54', '张俊', '张俊，拍拍贷创始人及CEO。毕业于上海交通大学，通信工程学士，工业工程硕士，通过特许金融分析师认证（CFA Program）二级考试。曾任职于微软全球技术中心和上海微创软件有限公司，担任高级客户...', '/files/2017-12-07/74dfaea3-3fae-45dc-b809-89846eb23e69.jpg', '创始人');
INSERT INTO `t_team_members` VALUES ('12', '54', '胡宏辉', '胡宏辉，拍拍贷首席市场官。毕业于上海交通大学管理学院和复旦大学经济学院，拥有经济学学士和硕士学位。曾任职于中国工商银行信贷部门，参与过多个重点融资项目，在银行市场业务方面有丰富经验。', '/files/2017-12-07/fb06efc8-1099-4962-93d4-1a080c66bb64.jpg', '首席市场官');
INSERT INTO `t_team_members` VALUES ('13', '54', '李铁铮', '李铁铮，拍拍贷首席风险官。毕业于上海交通大学，拥有工学学士学位。曾任职于中国民生银行总行中小企业部，亲历了民生银行小企业信贷业务从无到有、从小到大的整个发展历程，并在此过程中担任了风险管理相关的...', '/files/2017-12-07/858d8974-91c5-425d-98ce-58e367c99918.jpg', '首席风险官');
