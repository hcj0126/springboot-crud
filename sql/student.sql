/*
 Navicat Premium Data Transfer

 Source Server         : hcj
 Source Server Type    : MySQL
 Source Server Version : 50734
 Source Host           : localhost:3306
 Source Schema         : java352

 Target Server Type    : MySQL
 Target Server Version : 50734
 File Encoding         : 65001

 Date: 11/07/2023 22:31:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_german2_ci NOT NULL,
  `gender` varchar(5) CHARACTER SET utf8 COLLATE utf8_german2_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  `address` varchar(32) CHARACTER SET utf8 COLLATE utf8_german2_ci NULL DEFAULT NULL,
  `qq` varchar(20) CHARACTER SET utf8 COLLATE utf8_german2_ci NULL DEFAULT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_german2_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 41 CHARACTER SET = utf8 COLLATE = utf8_german2_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (2, '李四', '男', 20, '无锡市', '62345129', '62345129@qq.com');
INSERT INTO `student` VALUES (3, '黄晓霞', '女', 21, '合肥市', '522467452', '522467452@qq.com');
INSERT INTO `student` VALUES (4, '王非', '女', 43, '宁波市', '32154322', '32154322@qq.com');
INSERT INTO `student` VALUES (5, '赵薇', '女', 39, '广州市', '3624839', '3624839@qq.com');
INSERT INTO `student` VALUES (6, '黄传建', '男', 20, '南京市', '33333', 'hcj126@126.com');
INSERT INTO `student` VALUES (7, '黄传建352', '女', 18, '上海市', '12345444444', '4@qq.com');
INSERT INTO `student` VALUES (8, '金瓶梅', '女', 18, '宁波市', '11111325', 'ls2@itcast.cn');
INSERT INTO `student` VALUES (9, '马六', '女', 25, '广州市', '33333', 'hcj0126@126.com');
INSERT INTO `student` VALUES (12, '李四', '男', 20, '无锡市', '62345129', '62345129@qq.com');
INSERT INTO `student` VALUES (13, '黄晓霞', '女', 21, '合肥市', '522467452', '522467452@qq.com');
INSERT INTO `student` VALUES (14, '马六', '女', 25, '广州市', '33333', 'hcj0126@126.com');
INSERT INTO `student` VALUES (15, '赵薇', '女', 39, '广州市', '3624839', '3624839@qq.com');
INSERT INTO `student` VALUES (16, '黄传建', '男', 20, '南京市', '33333', 'hcj126@126.com');
INSERT INTO `student` VALUES (17, '黄传建352', '女', 18, '上海市', '12345444444', '4@qq.com');
INSERT INTO `student` VALUES (18, '金瓶梅', '女', 18, '宁波市', '11111325', 'ls2@itcast.cn');
INSERT INTO `student` VALUES (19, '马六', '女', 25, '广州市', '33333', 'hcj0126@126.com');
INSERT INTO `student` VALUES (20, '张小三', '女', 218, '上海市', '234567122222222222', '2345671222222222222@qq.com');
INSERT INTO `student` VALUES (21, '李四', '男', 20, '无锡市', '62345129', '62345129@qq.com');
INSERT INTO `student` VALUES (22, '黄晓霞', '女', 21, '合肥市', '522467452', '522467452@qq.com');
INSERT INTO `student` VALUES (23, '赵薇', '女', 39, '广州市', '3624839', '3624839@qq.com');
INSERT INTO `student` VALUES (24, '黄传建', '男', 20, '南京市', '33333', 'hcj126@126.com');
INSERT INTO `student` VALUES (25, '黄传建352', '女', 18, '上海市', '12345444444', '4@qq.com');
INSERT INTO `student` VALUES (26, '马六', '女', 25, '广州市', '33333', 'hcj0126@126.com');
INSERT INTO `student` VALUES (27, '张小三', '女', 218, '合肥市', '234567122222222222', '2345671222222222222@qq.com');
INSERT INTO `student` VALUES (28, '张三', '女', 218, '合肥市', '234567122222222222', '2345671222222222222@qq.com');
INSERT INTO `student` VALUES (29, '李四', '男', 20, '无锡市', '62345129', '62345129@qq.com');
INSERT INTO `student` VALUES (30, '黄晓霞', '女', 21, '合肥市', '522467452', '522467452@qq.com');
INSERT INTO `student` VALUES (31, '赵薇', '女', 39, '广州市', '3624839', '3624839@qq.com');
INSERT INTO `student` VALUES (32, '黄传建', '男', 20, '南京市', '33333', 'hcj126@126.com');
INSERT INTO `student` VALUES (33, '黄传建352', '女', 18, '上海市', '12345444444', '4@qq.com');
INSERT INTO `student` VALUES (34, '金瓶梅', '女', 18, '宁波市', '11111325', 'ls2@itcast.cn');
INSERT INTO `student` VALUES (35, '马六', '女', 25, '广州市', '33333', 'hcj0126@126.com');
INSERT INTO `student` VALUES (36, '台式机2', '女', 35, '合肥市', '33333', '4@qq.com');
INSERT INTO `student` VALUES (40, '巴特勒', '男', 20, '北京', '33333', 'ls2@itcast.cn');

SET FOREIGN_KEY_CHECKS = 1;
