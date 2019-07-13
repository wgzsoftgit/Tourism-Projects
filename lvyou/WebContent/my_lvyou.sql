# Host: 127.0.0.1  (Version 5.7.14-log)
# Date: 2019-06-11 22:24:00
# Generator: MySQL-Front 6.1  (Build 1.26)


#
# Structure for table "activity"
#

DROP TABLE IF EXISTS `activity`;
CREATE TABLE `activity` (
  `act_id` int(11) NOT NULL AUTO_INCREMENT,
  `act_time` varchar(30) DEFAULT NULL,
  `act_content` varchar(4000) DEFAULT NULL,
  `act_ispush` int(11) DEFAULT '1',
  `act_count` int(11) DEFAULT NULL,
  PRIMARY KEY (`act_id`)
) ENGINE=MyISAM AUTO_INCREMENT=39 DEFAULT CHARSET=utf8;

#
# Data for table "activity"
#

/*!40000 ALTER TABLE `activity` DISABLE KEYS */;
INSERT INTO `activity` VALUES (35,'2019-05-06','活动1：戏水温泉运动会\r\n　　气筏水上斗力、水球对抗、沙滩羽毛球.....五花八门的游戏环节丰富您的戏水体验，玩个痛快',1,222),(36,'2019-05-06','活动2：光棍神抢手\r\n\r\n　　单身狗的手速是你们无法想象的\r\n\r\n　　抢票什么的根本不在话下\r\n\r\n　　但是你们敢试试“水下魔方速拼”么\r\n\r\n　　单身的你带着单身的他(她)\r\n\r\n　　来米立方弄上一弄',1,33),(37,'2019-05-06','活动2：重阳节\r\n\r\n　10月28日重阳节当天，60周岁以上老年人凭身份证可享免门票游梨木台，仅需购买10元摆渡车优惠往返票。',1,21),(38,'2019-05-06','活动2：漫展大型庆典狂欢节与小伙伴们相约北京展览馆!5月3-4日,现场准备了各种好玩有趣又炫酷的内容，欢乐满场哦~光彩耀目的嘉宾,精彩纷呈的舞台,超精彩的LIVE，还有高大典雅的场馆任由小伙伴们狂欢!【',1,44);
/*!40000 ALTER TABLE `activity` ENABLE KEYS */;

#
# Structure for table "message"
#

DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `mes_id` int(11) NOT NULL AUTO_INCREMENT,
  `mes_title` varchar(30) DEFAULT NULL,
  `mes_content` varchar(300) DEFAULT NULL,
  `mes_time` varchar(30) DEFAULT NULL,
  `user_name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`mes_id`)
) ENGINE=MyISAM AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

#
# Data for table "message"
#

/*!40000 ALTER TABLE `message` DISABLE KEYS */;
INSERT INTO `message` VALUES (8,'问问','速度大法师打发打发似的','2019-04-27 03:02:41','为2'),(11,'阿诗丹顿','阿诗丹顿','2019-04-27 03:06:50','阿萨是多少'),(15,'傻傻的','萨达','2019-05-09 01:16:31','11112'),(16,'是多少','实打实','2019-05-09 01:09:51','admin1'),(18,'傻傻的','ssssss','2019-05-16 02:41:23','用户');
/*!40000 ALTER TABLE `message` ENABLE KEYS */;

#
# Structure for table "scenic"
#

DROP TABLE IF EXISTS `scenic`;
CREATE TABLE `scenic` (
  `sce_id` int(11) NOT NULL AUTO_INCREMENT,
  `sce_name` varchar(550) DEFAULT NULL,
  `sce_picture` varchar(50) DEFAULT NULL,
  `sce_content` varchar(4000) DEFAULT NULL,
  `sce_price` float(3,1) DEFAULT NULL,
  `sce_vprice` float(3,1) DEFAULT NULL,
  `sce_count` int(11) DEFAULT NULL,
  `sce_ispush` int(11) DEFAULT NULL,
  PRIMARY KEY (`sce_id`)
) ENGINE=MyISAM AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;

#
# Data for table "scenic"
#

/*!40000 ALTER TABLE `scenic` DISABLE KEYS */;
INSERT INTO `scenic` VALUES (36,'云台山','/lvyou_yuan/upload/20190520163021192.jpg','云台山风景区处在华北陆块新生代东亚裂谷系的华北裂谷带与西安—郑州—徐州近东西向裂谷转换带的交汇部位。受太行山前深大断裂控制，在喜马拉雅造山运动过程中，于寒武系—奥陶系石灰岩地层中形成了一系列“之”字形、线形、环形、台阶状长崖、翁谷、深切障谷、悬沟等地形组合的“云台”地貌，构成了区内峡谷幽深、群山耸峙、飞瀑清泉的太行景观，对研究新构造运动和裂谷的演化具有意义 [11]  。',12.0,25.0,54,1),(37,'二七塔','/lvyou_yuan/upload/20190520163006914.jpg','<p>二七纪念塔，位于郑州市二七广场，建于1971年，钢筋混凝土结构，是我国建筑独特的仿古联体双塔，它是为纪念京汉铁路工人大罢工而修建的纪念性建筑物。2006年被列为全国重点文物保护单位，中国最年轻的全国重点文物保护单位（建于1971年，距今有四十八年的历史）</p>',22.0,20.0,222,1),(38,'龙门石窟','/lvyou_yuan/upload/20190520162955127.jpg','龙门石窟与山西云冈石窟、敦煌莫高窟和天水麦积山石窟并称中国四大石窟。 它位于洛阳市城南十三公里，这里是香山和龙门山两山对峙，伊河水从中穿流而过，远望犹如一座天然的门阙，所以古称“伊阙”。到了隋朝，隋炀帝杨广曾登上洛阳北面的邙山，远远望见了洛阳南面的伊阙，就对..',22.0,12.0,12,1),(39,'石人山','/lvyou_yuan/upload/20190520160223585.jpg','尧山山峰奇特，瀑布众多，森林茂密，温泉优良，人文景观辉煌，集雄、险、秀、奇、幽于一体，分为冬凌潭、石扉玉章、三岔口、白龙潭、半仙居、石人、鸡冠石、白牛城、秘洞、温泉十大部分。专家评价具有华山之险、峨嵋之峻、张家界之美、黄山之秀。是旅游观光、避暑、疗养、科研、探险的好地方。其中玉皇极顶海拔2153.1米，为我国24大名山之一',33.0,20.0,22,1),(40,'鸡公山','/lvyou_yuan/upload/20190520160209319.jpg','鸡公山地处中原龙脉大别山脉北坡，为亚热带向南温带的过渡地段。植被属于泛北极植物区、中国-日本森林植物亚区的华中植物区系范围，以亚热带植物成分为主，兼有暖温带的成分。植被地带性表现出典型的由北亚热带常绿阔叶林与落叶阔叶林地带向暖温带落叶阔叶林地带过渡的特征，是多种区系成分的交汇带',22.0,12.0,44,1),(41,'清明上河园','/lvyou_yuan/upload/20190520160235342.jpg','虹桥是飞架在汴河之上的。据史书记载，汴河始于战国的魏，通于隋，畅于宋，上起河洛，下至淮泗，直通长江，为北宋南北贯通的大动脉。各地所产的粮食，所收的赋税，各种奇珍异果都是沿着这条河运到京城来的。汴河对于当时的北宋可谓至关重要。由于舟船往来，客商众多，于是在河的两边就出现了许多店铺，在当时的东京城，汴河两岸是最繁华热闹的地方，虹桥左右让铺林立，舟船如梭，商贾云集。',22.0,23.0,22,1);
/*!40000 ALTER TABLE `scenic` ENABLE KEYS */;

#
# Structure for table "user"
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(30) NOT NULL DEFAULT '',
  `user_pwd` varchar(303) NOT NULL DEFAULT '',
  `user_age` int(11) DEFAULT NULL,
  `user_state` int(11) DEFAULT NULL,
  `user_time` varchar(30) DEFAULT NULL,
  `user_email` varchar(50) DEFAULT NULL,
  `user_phone` bigint(11) DEFAULT NULL,
  `user_pic` varchar(500) DEFAULT NULL,
  `type_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM AUTO_INCREMENT=52 DEFAULT CHARSET=utf8;

#
# Data for table "user"
#

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (15,'admin','123456',21,1,'2019-03-28 08:56:45','1332234@ww.cn',32,'/lvyou_yuan/upload/20190520162907833.jpg',1),(16,'管理员','123456',22,1,'2019-03-28 08:57:46','1332234@ww.cn',2312,'/lvyou_yuan/upload/20190520162920142.jpg',1),(17,'用户','123456',22,1,'2019-03-28 08:58:23','1332234@ww.cn',2312,'/lvyou_yuan/upload/20190520162933988.jpg',1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

#
# Structure for table "video"
#

DROP TABLE IF EXISTS `video`;
CREATE TABLE `video` (
  `vid_id` int(11) NOT NULL AUTO_INCREMENT,
  `vid_name` varchar(30) DEFAULT NULL,
  `vid_live` varchar(50) DEFAULT NULL,
  `vid_ispush` int(11) DEFAULT '1',
  `vid_count` int(11) DEFAULT NULL,
  PRIMARY KEY (`vid_id`)
) ENGINE=MyISAM AUTO_INCREMENT=74 DEFAULT CHARSET=utf8;

#
# Data for table "video"
#

/*!40000 ALTER TABLE `video` DISABLE KEYS */;
INSERT INTO `video` VALUES (68,'二七','/lvyou_yuan/upload/20190520163249234.mp4',1,22),(69,'云台山','/lvyou_yuan/upload/20190520163222106.mp4',1,33),(70,'清明上河园','/lvyou_yuan/upload/20190520163154686.mp4',1,33),(71,'石人山','/lvyou_yuan/upload/20190520163054899.mp4',1,2222),(73,'二七区','/lvyou_yuan/upload/20190520163130160.mp4',1,22);
/*!40000 ALTER TABLE `video` ENABLE KEYS */;

#
# Structure for table "ways"
#

DROP TABLE IF EXISTS `ways`;
CREATE TABLE `ways` (
  `way_id` int(11) NOT NULL AUTO_INCREMENT,
  `way_name` varchar(30) NOT NULL,
  `way_content` varchar(300) NOT NULL DEFAULT '',
  PRIMARY KEY (`way_id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

#
# Data for table "ways"
#

/*!40000 ALTER TABLE `ways` DISABLE KEYS */;
INSERT INTO `ways` VALUES (1,'洛阳--郑州','郑州→登封→禅宗祖庭→少林寺→洛阳→龙门石窟→白马寺→焦作'),(3,'登封→禅宗祖庭','郑州→登封→禅宗祖庭→少林寺→洛阳→龙门石窟→白马寺→焦作'),(5,'开封→大相国寺','开封→开封府→宋都御街→大相国寺1'),(6,'开封府→清明上河园','开封府→龙亭→清明上河园'),(7,'撒网','sd');
/*!40000 ALTER TABLE `ways` ENABLE KEYS */;
