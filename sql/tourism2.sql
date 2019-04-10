/*
SQLyog Ultimate v8.32 
MySQL - 5.7.10-log : Database - tourism2
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`tourism2` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `tourism2`;

/*Table structure for table `blog` */

DROP TABLE IF EXISTS `blog`;

CREATE TABLE `blog` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `content` text COMMENT '博客内容',
  `blogtitle` varchar(255) DEFAULT NULL COMMENT '博客名称',
  `blogtype` varchar(255) DEFAULT NULL COMMENT '博客类型',
  `blogstatus` varchar(255) DEFAULT NULL COMMENT '状态(0失效，1有效)',
  `userID` int(255) DEFAULT NULL COMMENT '用户id（外键）',
  `blogblank` varchar(255) DEFAULT NULL COMMENT '保留字段',
  `createtime` datetime DEFAULT NULL,
  `updatetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Table structure for table `blogpicture` */

DROP TABLE IF EXISTS `blogpicture`;

CREATE TABLE `blogpicture` (
  `id` varchar(40) NOT NULL COMMENT 'UUID生成的主键',
  `path` varchar(255) DEFAULT NULL COMMENT '路径',
  `originname` varchar(255) DEFAULT NULL COMMENT '图片名称',
  `blogpictureblank` varchar(255) DEFAULT NULL COMMENT '保留字段',
  `createtime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `comment` */

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `content` text NOT NULL COMMENT '评论内容',
  `viewID` int(11) DEFAULT NULL COMMENT '景点id（外键）',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `updatetime` datetime DEFAULT NULL COMMENT '更新时间',
  `commentblank` varchar(255) DEFAULT NULL COMMENT '保留字段1',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Table structure for table `food` */

DROP TABLE IF EXISTS `food`;

CREATE TABLE `food` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `foodname` varchar(255) NOT NULL COMMENT '食品名称',
  `price` varchar(255) DEFAULT NULL COMMENT '价格',
  `viewID` int(255) NOT NULL COMMENT '景点id(外键)',
  `foodblank` varchar(255) DEFAULT NULL COMMENT '保留字段',
  `createtime` datetime DEFAULT NULL,
  `updatetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `message` */

DROP TABLE IF EXISTS `message`;

CREATE TABLE `message` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '标题',
  `content` text COMMENT '消息内容',
  `createtime` datetime DEFAULT NULL,
  `updatetime` datetime DEFAULT NULL,
  `messageblank` varchar(255) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Table structure for table `picture` */

DROP TABLE IF EXISTS `picture`;

CREATE TABLE `picture` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(255) NOT NULL COMMENT '图片名称',
  `path` varchar(255) NOT NULL COMMENT '图片路径',
  `viewID` int(255) NOT NULL COMMENT '(外键)关联字段，与景点id想关联',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `updatetime` datetime DEFAULT NULL COMMENT '修改时间',
  `type` varchar(255) DEFAULT NULL COMMENT '类型（1图片，2视频）',
  `pictureblank` varchar(255) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Table structure for table `ticket` */

DROP TABLE IF EXISTS `ticket`;

CREATE TABLE `ticket` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `ticketname` varchar(255) NOT NULL COMMENT '票名',
  `starttime` datetime NOT NULL COMMENT '开始生效时间',
  `endtime` datetime NOT NULL COMMENT '生效结束时间',
  `ticketnum` int(255) NOT NULL COMMENT '门票数',
  `price` int(255) NOT NULL COMMENT '门票价格',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `updatetime` datetime DEFAULT NULL COMMENT '修改时间',
  `viewID` int(255) NOT NULL COMMENT '(外键)关联字段，与景点id相关联',
  `ticketblank` varchar(255) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(255) NOT NULL COMMENT '登录账号',
  `password` varchar(255) NOT NULL COMMENT '登录密码',
  `fullname` varchar(255) DEFAULT NULL COMMENT '用户姓名',
  `sex` varchar(255) DEFAULT NULL COMMENT '性别',
  `phone` varchar(255) DEFAULT NULL COMMENT '手机号',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱信息',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `updatetime` datetime DEFAULT NULL,
  `roles` varchar(255) DEFAULT NULL COMMENT '角色（1管理员，2普通用户）',
  `userblank` varchar(255) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Table structure for table `view` */

DROP TABLE IF EXISTS `view`;

CREATE TABLE `view` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `viewname` varchar(255) NOT NULL COMMENT '景点名称',
  `introduction` text COMMENT '景点简介',
  `type` varchar(255) DEFAULT NULL COMMENT '景点类型(人文，自然)',
  `address` varchar(255) DEFAULT NULL COMMENT '景点地址',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `updatetime` datetime DEFAULT NULL COMMENT '修改时间',
  `starttime` datetime DEFAULT NULL COMMENT '开放日期',
  `endtime` datetime DEFAULT NULL COMMENT '结束日期',
  `viewblank` varchar(255) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
