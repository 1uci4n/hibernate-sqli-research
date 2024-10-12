/* 初始化数据库 */
SET NAMES utf8mb4;
SET
FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `t_user_hb`;
CREATE TABLE `t_user_hb`
(
    `id`              int(11) NOT NULL AUTO_INCREMENT,
    `user_name`       varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
    `user_pwd`        varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
    `real_name`       varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
    `sex`             varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
    `birthday`        datetime(6) NULL DEFAULT NULL,
    `create_datetime` datetime(6) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP (6),
    `remark`          varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;


INSERT INTO `t_user_hb`
VALUES (1, 'zhang', '123456', '张三', '男', '2024-07-25 16:08:03.668000', '2024-10-02 18:39:54.074677', '无');
INSERT INTO `t_user_hb`
VALUES (2, 'li', 'abcdef', '李四', '男', '2024-07-25 16:11:51.632000', '2024-10-02 18:39:57.182574', '无');
INSERT INTO `t_user_hb`
VALUES (3, 'wang', 'abc123', '王五', '女', '2024-07-25 16:14:24.412000', '2024-10-02 18:40:03.533665', '无');

SET
FOREIGN_KEY_CHECKS = 1;
