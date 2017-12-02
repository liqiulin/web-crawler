/*
Navicat MySQL Data Transfer

Source Server         : czm
Source Server Version : 50552
Source Host           : localhost:3306
Source Database       : tourongzhongguo

Target Server Type    : MYSQL
Target Server Version : 50552
File Encoding         : 65001

Date: 2017-11-29 21:34:39
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `rb_attach`
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
-- Table structure for `rb_unit_message`
-- ----------------------------
DROP TABLE IF EXISTS `rb_unit_message`;
CREATE TABLE `rb_unit_message` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) DEFAULT NULL,
  `company_name` varchar(50) DEFAULT NULL COMMENT '单位名称',
  `company_industry` int(10) DEFAULT NULL COMMENT '单位性质',
  `work` int(10) DEFAULT NULL COMMENT '单位行业',
  `work_grade` varchar(300) DEFAULT NULL COMMENT '工作级别',
  `zhiwei` varchar(255) DEFAULT NULL COMMENT '职 位',
  `serve_time` timestamp NULL DEFAULT NULL COMMENT '服务时间',
  `to_serve_time` timestamp NULL DEFAULT NULL COMMENT '服务时间',
  `work_year` int(10) DEFAULT NULL COMMENT '工作年限',
  `work_tel` varchar(20) DEFAULT NULL COMMENT '工作电话',
  `company_add` varchar(200) DEFAULT NULL COMMENT '公司地址',
  `company_website` varchar(200) DEFAULT NULL COMMENT '公司网站',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注说明',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `rb_user`
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
) ENGINE=InnoDB AUTO_INCREMENT=1676 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `t_article`
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
-- Table structure for `t_bp_primary_table`
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
-- Table structure for `t_bp_slave_table`
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
-- Table structure for `t_development_history`
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
-- Table structure for `t_investor`
-- ----------------------------
DROP TABLE IF EXISTS `t_investor`;
CREATE TABLE `t_investor` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` int(11) DEFAULT NULL,
  `investor_form` varchar(20) DEFAULT NULL COMMENT '投资人类型(1表示投资人，2表示投资机构)',
  `province` varchar(50) DEFAULT NULL COMMENT '省',
  `city` varchar(50) DEFAULT NULL COMMENT '市',
  `area` varchar(255) DEFAULT NULL COMMENT '名片地址',
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
  `investors_profile` varchar(255) DEFAULT NULL COMMENT '投资人简介',
  `investors_company_name` varchar(255) DEFAULT NULL COMMENT '公司全名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='投资人认证';

-- ----------------------------
-- Table structure for `t_investor_answer`
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
-- Table structure for `t_investor_industry`
-- ----------------------------
DROP TABLE IF EXISTS `t_investor_industry`;
CREATE TABLE `t_investor_industry` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `investor_id` int(11) DEFAULT NULL COMMENT '投资人/投资机构ID',
  `industry` varchar(200) DEFAULT NULL COMMENT '关注领域',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='投资人项目表';

-- ----------------------------
-- Table structure for `t_investor_project`
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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='投资人项目表';

-- ----------------------------
-- Table structure for `t_investor_round`
-- ----------------------------
DROP TABLE IF EXISTS `t_investor_round`;
CREATE TABLE `t_investor_round` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `investor_id` int(11) DEFAULT NULL COMMENT '投资人/投资机构ID',
  `round` varchar(200) DEFAULT NULL COMMENT '偏好轮次',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='投资人项目表';

-- ----------------------------
-- Table structure for `t_project`
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='深交所项目表';

-- ----------------------------
-- Table structure for `t_service_agencies`
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
-- Table structure for `t_team_members`
-- ----------------------------
DROP TABLE IF EXISTS `t_team_members`;
CREATE TABLE `t_team_members` (
  `id` int(11) NOT NULL COMMENT '主键id',
  `project_id` int(11) DEFAULT NULL COMMENT '项目id',
  `members_name` varchar(255) DEFAULT NULL COMMENT '成员名字',
  `profile` text COMMENT '简介',
  `photographs_url` varchar(1024) DEFAULT NULL COMMENT '头像地址',
  `identity` varchar(255) DEFAULT NULL COMMENT '身份',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_team_members
-- ----------------------------
