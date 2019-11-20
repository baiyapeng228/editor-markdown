DROP TABLE IF EXISTS `editor`;
CREATE TABLE `editor` (
  `id` bigint(20) NOT NULL COMMENT '主键',
  `text_content` longtext COMMENT '内容',
  `content` longtext,
  `create_time` datetime DEFAULT NULL COMMENT '修改日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
