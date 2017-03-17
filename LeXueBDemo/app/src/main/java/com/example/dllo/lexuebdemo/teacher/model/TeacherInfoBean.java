package com.example.dllo.lexuebdemo.teacher.model;

import java.util.List;

/*
    by Mr.L
    data 2017-03-11
    desc 描述
*/
public class TeacherInfoBean {
    /**
     * assistants : []
     * chat_room_id : 10004
     * display_fans_count : 9951
     * error_info :
     * fans : [{"city":"红河哈尼族彝族自治州","contribute":0,"follow_time":1472224878,"province":"云南省","rank":0,"role":0,"school":"个旧市第一中学","sex":0,"teacher_id":0,"user_icon":{"height":0,"url":"http://q.qlogo.cn/qqapp/1104177532/50C5479EF97ECFE5FC9F437AF4B7C607/100","width":0},"user_id":135,"user_name":"禾女鬼文子"},{"city":"重庆","contribute":0,"follow_time":1469788462,"province":"重庆市","rank":0,"role":0,"school":"重庆市渝北中学校","sex":1,"teacher_id":0,"user_icon":{"height":300,"url":"https://esfile.lexue.com/file/T1kthTB7KT1RCvBVdK.jpg","width":300},"user_id":440,"user_name":"硫氰化晏"},{"city":"汕头市","contribute":4000,"follow_time":1457748786,"province":"广东省","rank":0,"role":0,"school":"汕头市聿怀中学","sex":1,"teacher_id":0,"user_icon":{"height":0,"url":"http://wx.qlogo.cn/mmopen/b2ONlmmVZRrwpjLAm8mKVZ4dUGic8MDoJlpnj0pZu3h6NcDEgtNbU4icT3so82egzibic0sWW9g1LR5AmRCE6zRk5ww8a7tEHvHj/0","width":0},"user_id":656,"user_name":"我就是我"},{"city":"肇庆市","contribute":0,"follow_time":1464083019,"province":"广东省","rank":0,"role":0,"school":"封开江口中学","sex":0,"teacher_id":0,"user_icon":{"height":0,"url":"http://q.qlogo.cn/qqapp/1104177532/42779F63056EF5BAF3B35BB6710EA92F/100","width":0},"user_id":661,"user_name":"高氯酸钙"},{"city":"福州市","contribute":0,"follow_time":1461214773,"province":"福建省","rank":0,"role":0,"school":"平潭县私立翰英中学","sex":0,"teacher_id":0,"user_icon":{"height":177,"url":"https://esfile.lexue.com/file/T1YtJTBjDT1RCvBVdK.png","width":177},"user_id":776,"user_name":"你是sow"},{"city":"咸阳市","contribute":3300,"follow_time":1465300906,"province":"陕西省","rank":0,"role":0,"school":"咸阳市实验中学","sex":1,"teacher_id":0,"user_icon":{"height":139,"url":"https://esfile.lexue.com/file/T12RJTB7Ev1RCvBVdK.png","width":139},"user_id":1343,"user_name":"大小说家"},{"city":"安庆市","contribute":0,"follow_time":1462275665,"province":"安徽省","rank":0,"role":0,"school":"安庆市第九中学","sex":0,"teacher_id":0,"user_icon":{"height":0,"url":"http://q.qlogo.cn/qqapp/1104177532/7DEB5799BB886A4D57A74AFA45110159/100","width":0},"user_id":1411,"user_name":"牧师"},{"city":"渭南市","contribute":0,"follow_time":1457085606,"province":"陕西省","rank":0,"role":0,"school":"陕西白水中学","sex":1,"teacher_id":0,"user_icon":{"height":0,"url":"http://q.qlogo.cn/qqapp/1104177532/B21615BF7E9013AA5D9AF55B6EAB98F4/100","width":0},"user_id":1614,"user_name":"ミ 旧时光"},{"city":"贵阳市","contribute":0,"follow_time":1463408202,"province":"贵州省","rank":0,"role":0,"school":"贵阳市第二中学","sex":1,"teacher_id":0,"user_icon":{"height":0,"url":"http://q.qlogo.cn/qqapp/1104177532/D80C38C032A89CEA76C30E14C6652DF6/100","width":0},"user_id":1643,"user_name":"Intellectual"},{"city":"株洲市","contribute":4200,"follow_time":1463114160,"province":"湖南省","rank":0,"role":0,"school":"株洲县潇湘双语学校","sex":0,"teacher_id":0,"user_icon":{"height":0,"url":"http://q.qlogo.cn/qqapp/1104177532/625CEF902CCC53ACBBB975F72D1E1B01/100","width":0},"user_id":1708,"user_name":" tale,"},{"city":"湛江市","contribute":0,"follow_time":1462089217,"province":"广东省","rank":0,"role":0,"school":"徐闻县徐闻中学","sex":0,"teacher_id":0,"user_icon":{"height":300,"url":"https://esfile.lexue.com/file/T1FthTB4Jv1RCvBVdK.jpg","width":300},"user_id":1804,"user_name":"人来人往"},{"city":"乌鲁木齐市","contribute":5,"follow_time":1462683406,"province":"新疆维吾尔自治区","rank":0,"role":0,"school":"乌市第五十四中学","sex":1,"teacher_id":0,"user_icon":{"height":200,"url":"https://esfile.lexue.com/file/T1atJTBTLT1RCvBVdK.png","width":200},"user_id":2074,"user_name":"ζั͡ޓއއއ 陌上桑。"},{"city":"九江市","contribute":55,"follow_time":1464445373,"province":"江西省","rank":0,"role":0,"school":"江西省九江市第一中学","sex":1,"teacher_id":0,"user_icon":{"height":0,"url":"https://esfile.lexue.com/file/T1HRhTB5Av1RCvBVdK.jpg","width":0},"user_id":2228,"user_name":"阿毛233333"},{"city":"抚州市","contribute":0,"follow_time":1456508948,"province":"江西省","rank":0,"role":0,"school":"东乡县第一中学","sex":1,"teacher_id":0,"user_icon":{"height":200,"url":"https://esfile.lexue.com/file/T1ItJTBvEv1RCvBVdK.png","width":200},"user_id":2305,"user_name":"七月未央"},{"city":"重庆","contribute":0,"follow_time":1460274152,"province":"重庆市","rank":0,"role":0,"school":"重庆市万州武陵中学","sex":0,"teacher_id":0,"user_icon":{"height":300,"url":"https://esfile.lexue.com/file/T1NahTBTJv1RCvBVdK.jpg","width":300},"user_id":2310,"user_name":"Idle "},{"city":"西宁市","contribute":0,"follow_time":1484235714,"province":"青海省","rank":0,"role":0,"school":"大通县第二完全中学","sex":0,"teacher_id":0,"user_icon":{"height":200,"url":"https://esfile.lexue.com/file/T1UyJTB7hT1RCvBVdK.png","width":200},"user_id":2522,"user_name":"史迪仔"},{"city":"呼伦贝尔市","contribute":0,"follow_time":1460554344,"province":"内蒙古自治区","rank":0,"role":0,"school":"牙克石市第一中学","sex":0,"teacher_id":0,"user_icon":{"height":0,"url":"https://esfile.lexue.com/file/T1JRJTBmJv1RCvBVdK.jpg","width":0},"user_id":5534,"user_name":"Hardy"},{"city":"石嘴山市","contribute":0,"follow_time":1456982571,"province":"宁夏回族自治区","rank":0,"role":0,"school":"石嘴山市第三中学","sex":1,"teacher_id":0,"user_icon":{"height":0,"url":"http://q.qlogo.cn/qqapp/1104177532/26384109EBD7CE14558712493A50D585/100","width":0},"user_id":5776,"user_name":"◆◇L F"},{"city":"焦作市","contribute":199855,"follow_time":1463796802,"province":"河南省","rank":0,"role":0,"school":"孟州市第五高级中学","sex":2,"teacher_id":0,"user_icon":{"height":0,"url":"http://q.qlogo.cn/qqapp/1104177532/E8DE920ED2B2111555268C3B4DE629D4/100","width":0},"user_id":5796,"user_name":"哒哒哒"},{"city":"天津","contribute":0,"follow_time":1468746447,"province":"天津市","rank":0,"role":0,"school":"静海县第一中学","sex":0,"teacher_id":0,"user_icon":{"height":300,"url":"https://esfile.lexue.com/file/T1WRJTB__v1RCvBVdK.jpg","width":300},"user_id":5812,"user_name":"冥羽"}]
     * fans_count : 9951
     * gift_num : 21925
     * gifts : [{"gift_count":6091,"gift_icon":{"height":220,"url":"https://esfile.lexue.com/file/T1RRxTBTbv1RCvBVdK.gif","width":220},"gift_name":"666","product_id":77},{"gift_count":893,"gift_icon":{"height":220,"url":"https://esfile.lexue.com/file/T1FaxTBbbg1RCvBVdK.gif","width":220},"gift_name":"233","product_id":78},{"gift_count":2767,"gift_icon":{"height":220,"url":"https://esfile.lexue.com/file/T1jyhTBQdj1RCvBVdK.gif","width":220},"gift_name":"男神证书","product_id":79},{"gift_count":1320,"gift_icon":{"height":220,"url":"https://esfile.lexue.com/file/T1FRxTBjDg1RCvBVdK.gif","width":220},"gift_name":"大宝剑","product_id":80},{"gift_count":3269,"gift_icon":{"height":220,"url":"https://esfile.lexue.com/file/T1ZaxTBKbj1RCvBVdK.gif","width":220},"gift_name":"豪华跑车","product_id":107},{"gift_count":6594,"gift_icon":{"height":220,"url":"https://esfile.lexue.com/file/T1QyhTBTZj1RCvBVdK.gif","width":220},"gift_name":"豪华别墅","product_id":108},{"gift_count":571,"gift_icon":{"height":220,"url":"https://esfile.lexue.com/file/T1FtxTBQhv1RCvBVdK.gif","width":220},"gift_name":"女神证书","product_id":35494},{"gift_count":49,"gift_icon":{"height":220,"url":"https://esfile.lexue.com/file/T1RyxTBTKv1RCvBVdK.gif","width":220},"gift_name":"鬼畜教鞭","product_id":35495},{"gift_count":80,"gift_icon":{"height":220,"url":"https://esfile.lexue.com/file/T1FyxTBb__1RCvBVdK.gif","width":220},"gift_name":"惊呆了","product_id":35496},{"gift_count":203,"gift_icon":{"height":220,"url":"https://esfile.lexue.com/file/T1RaxTBghv1RCvBVdK.gif","width":220},"gift_name":"吻","product_id":35497},{"gift_count":88,"gift_icon":{"height":220,"url":"https://esfile.lexue.com/file/T1dyxTBCLv1RCvBVdK.gif","width":220},"gift_name":"给跪了","product_id":35498}]
     * horoscope : 魔羯座
     * photo_total : 0
     * popularity : 7106885
     * sign : 路漫漫其修远兮，吾将上下而求索
     * status : 0
     * teacher_area : 全国
     * teacher_description : 从教十年，积累了丰富的教学经验。注重学生对课堂的参与，善于调动学生积极性。对知识理解深入到位，对习题的分析鞭辟入里。
     * teacher_icon : {"height":600,"url":"https://esfile.lexue.com/file/T1URxTBTLT1RCvBVdK.jpg","width":600}
     * teacher_id : 31
     * teacher_name : 张鹏
     * teacher_sex : 0
     * teacher_subject : 4
     * teacher_subject_icon : {"height":135,"url":"https://esfile.lexue.com/file/T1FyhTBsET1RCvBVdK.png","width":135}
     * teacher_subject_name : 生物
     * top_fans : [{"city":"四平市","contribute":2000,"follow_time":1463184159,"province":"吉林省","rank":1,"role":0,"school":"四平市实验中学","sex":1,"teacher_id":0,"user_icon":{"height":300,"url":"https://esfile.lexue.com/file/T1URhTB5Cv1RCvBVdK.jpg","width":300},"user_id":1411793,"user_name":"蓦然","weekly_contribute":0},{"city":"福州市","contribute":3695,"follow_time":1476538761,"province":"福建省","rank":2,"role":0,"school":"福州十一中","sex":0,"teacher_id":0,"user_id":1323703,"user_name":"魑魅魍魉吓死你","weekly_contribute":0}]
     * video_count : 37
     * video_play_times : 544681
     * videos : [{"bought":false,"diamond_price":30,"expiration_time":90,"forward":"","forward_note":"","is_best":true,"product_id":56647,"real_diamond_price":30,"user_praise":316,"video_cover":{"height":422,"url":"https://esfile.lexue.com/file/T15yxTBmCT1RCvBVdK.jpg","width":750},"video_description":"#适用于全国各地高考\r\n#高考占分6-12分\r\n#课本&考纲实验梳理，重点突破各实验的考点及难点\r\n#很繁琐？没意思？但是它是考试的内容，这都是白给的分数\r\n#你肯定没听过如此全面的实验总结课程","video_duration":0,"video_id":1538,"video_title":"考纲实验与课本实验（下） 生物二轮复习（十二）","video_type":4,"watcher_count":1922},{"bought":false,"diamond_price":30,"expiration_time":90,"forward":"","forward_note":"","is_best":true,"product_id":56640,"real_diamond_price":30,"user_praise":281,"video_cover":{"height":422,"url":"https://esfile.lexue.com/file/T1KyxTBTJT1RCvBVdK.jpg","width":750},"video_description":"#适用于全国各地高考\r\n#高考占分6-12分\r\n#课本&考纲实验梳理，重点突破各实验的考点及难点\r\n#很繁琐？没意思？但是它是考试的内容，这都是白给的分数\r\n#你肯定没听过如此全面的实验总结课程","video_duration":0,"video_id":1537,"video_title":"考纲实验与课本实验（上） 生物二轮复习（十一）","video_type":4,"watcher_count":2632},{"bought":false,"diamond_price":30,"expiration_time":90,"forward":"","forward_note":"","is_best":true,"product_id":55825,"real_diamond_price":30,"user_praise":252,"video_cover":{"height":422,"url":"https://esfile.lexue.com/file/T14axTB_Kv1RCvBVdK.jpg","width":750},"video_description":"#适用于全国各地考生\r\n#刷什么题？怎么刷题？哪找好题来刷？不会的题怎么办？乐考生物2017，用考试辅助学习，解决你关于生物的一切问题！\r\n视频锚点（锚点有助于同学们快速查找对应题号）：\r\n第一题：00'23'' 第三题：04'26'' \r\n第六题：13'30'' 第七题：15'35'' \r\n第八题：19'08'' 第九题：28'00'' \r\n第十题：34'08''","video_duration":2274,"video_id":1462,"video_title":"乐考生物2017卷（十七）解析","video_type":2,"watcher_count":1557},{"bought":false,"diamond_price":30,"expiration_time":90,"forward":"","forward_note":"","is_best":true,"product_id":52204,"real_diamond_price":30,"user_praise":278,"video_cover":{"height":422,"url":"https://esfile.lexue.com/file/T1ztxTBsZv1RCvBVdK.jpg","width":750},"video_description":"#适用于全国各地高考\r\n#选修一补完篇\r\n#传统发酵技术；DNA粗提取；蛋白质分离；固定化酶技术一次扫清\r\n# 选修一综合刷题实战\r\n#已打印四十一四十二讲讲义的同学无需重新打印","video_duration":4291,"video_id":1291,"video_title":"选修一综合实战篇 生物二轮复习（四）","video_type":4,"watcher_count":2107},{"bought":false,"diamond_price":30,"expiration_time":90,"forward":"","forward_note":"","is_best":true,"product_id":52202,"real_diamond_price":30,"user_praise":298,"video_cover":{"height":422,"url":"https://esfile.lexue.com/file/T1VaxTBbW_1RCvBVdK.jpg","width":750},"video_description":"#适用于全国各地高考\r\n#选修一补完篇\r\n#传统发酵技术；DNA粗提取；蛋白质分离；固定化酶技术一次扫清\r\n# 选修一综合刷题实战\r\n#已打印四十一四十二讲讲义的同学无需重新打印","video_duration":4136,"video_id":1290,"video_title":"选修一拾遗补完篇 生物二轮复习（三）","video_type":4,"watcher_count":2379},{"bought":false,"diamond_price":30,"expiration_time":90,"forward":"","forward_note":"","is_best":true,"product_id":52690,"real_diamond_price":30,"user_praise":258,"video_cover":{"height":422,"url":"https://esfile.lexue.com/file/T1WaxTBjLT1RCvBVdK.jpg","width":750},"video_description":"#适用于全国各地考生\r\n#刷什么题？怎么刷题？哪找好题来刷？不会的题怎么办？乐考生物2017，用考试辅助学习，解决你关于生物的一切问题！\r\n视频锚点（锚点有助于同学们快速查找对应题号）：\r\n第一题：02'05'' 第三题：7'56'' \r\n第六题：19'50'' 第七题：24'27'' \r\n第八题：29'22'' 第九题：44'19'' \r\n第十题：48'20''","video_duration":3360,"video_id":1320,"video_title":"乐考生物2017卷（十四）解析","video_type":2,"watcher_count":1766},{"bought":false,"diamond_price":30,"expiration_time":90,"forward":"","forward_note":"","is_best":true,"product_id":48698,"real_diamond_price":30,"user_praise":253,"video_cover":{"height":422,"url":"https://esfile.lexue.com/file/T1HRxTBTLv1RCvBVdK.jpg","width":750},"video_description":"#适用于全国各地高考\r\n#本年度生物考纲变动最大的知识点\r\n#选修一生物技术实践终极复习，仅此一次\r\n#平板划线法&稀释涂布平板法还傻傻分不清楚？现场模拟演示，更简单，更直观！！！","video_duration":0,"video_id":1170,"video_title":"选修一生物技术实践（下） 生物二轮复习（二）","video_type":4,"watcher_count":2547},{"bought":false,"diamond_price":30,"expiration_time":90,"forward":"","forward_note":"","is_best":true,"product_id":48696,"real_diamond_price":30,"user_praise":340,"video_cover":{"height":422,"url":"https://esfile.lexue.com/file/T1fRxTB4__1RCvBVdK.jpg","width":750},"video_description":"#适用于全国各地高考\r\n#本年度生物考纲变动最大的知识点\r\n#选修一生物技术实践终极复习，仅此一次\r\n#平板划线法&稀释涂布平板法还傻傻分不清楚？现场模拟演示，更简单，更直观！！！","video_duration":0,"video_id":1169,"video_title":"选修一生物技术实践（上） 生物二轮复习（一）","video_type":4,"watcher_count":3050},{"bought":false,"diamond_price":30,"expiration_time":90,"forward":"","forward_note":"","is_best":true,"product_id":48843,"real_diamond_price":30,"user_praise":275,"video_cover":{"height":422,"url":"https://esfile.lexue.com/file/T19yxTBbh_1RCvBVdK.jpg","width":750},"video_description":"#适用全国各地考生\r\n#高考真题精华集萃\r\n#一轮各个知识点大小boss，寻找弱点打死它！\r\n#老司机详解生物经典真题，带你突飞猛进！","video_duration":5955,"video_id":1191,"video_title":"一轮复习完结篇（下）生物一轮复习（四十）","video_type":1,"watcher_count":2476},{"bought":false,"diamond_price":30,"expiration_time":90,"forward":"","forward_note":"","is_best":true,"product_id":45179,"real_diamond_price":30,"user_praise":265,"video_cover":{"height":422,"url":"https://esfile.lexue.com/file/T1xRxTBjWv1RCvBVdK.jpg","width":750},"video_description":"#适用于全国各地考生\r\n#刷什么题？怎么刷题？哪找好题来刷？不会的题怎么办？乐考生物2017，用考试辅助学习，解决你关于生物的一切问题！\r\n视频锚点（锚点有助于同学们快速查找对应题号）：\r\n第一题：00'47'' 第六题：12'16'' \r\n第十一题：28'03'' 第十六题：39'11'' \r\n第二十一题：53'30'' 第二十二题：59'44'' \r\n第二十三题：74'34'' 第二十四题：82'58'' \r\n第二十五题：86'37''","video_duration":5381,"video_id":1078,"video_title":"乐考生物2017卷（十一）解析","video_type":2,"watcher_count":1964},{"bought":false,"diamond_price":30,"expiration_time":90,"forward":"","forward_note":"","is_best":true,"product_id":44366,"real_diamond_price":30,"user_praise":364,"video_cover":{"height":422,"url":"https://esfile.lexue.com/file/T1aRxTBTx_1RCvBVdK.jpg","width":750},"video_description":"#适用于全国各地高考\r\n#必修三最热命题点之一\r\n#柱状图题型基本分析法\r\n#探究生长素的前生今世，植物激素相关内容一网打尽","video_duration":0,"video_id":1006,"video_title":"植物激素 生物一轮复习（三四）","video_type":4,"watcher_count":3734},{"bought":false,"diamond_price":30,"expiration_time":90,"forward":"","forward_note":"","is_best":true,"product_id":43341,"real_diamond_price":30,"user_praise":380,"video_cover":{"height":422,"url":"https://esfile.lexue.com/file/T1IRxTBjWT1RCvBVdK.jpg","width":750},"video_description":"#适用于全国各地高考\r\n#考纲重要考点，难度不高但内容复杂混乱\r\n#非特异性免疫及特异性免疫全考点覆盖\r\n#二次免疫、过敏反应、免疫接种等细节考点逐个击破\r\n#一节课，进击的免疫全攻略","video_duration":0,"video_id":969,"video_title":"免疫调节 生物一轮复习（三三）","video_type":4,"watcher_count":3902},{"bought":false,"diamond_price":30,"expiration_time":90,"forward":"","forward_note":"","is_best":true,"product_id":42121,"real_diamond_price":30,"user_praise":358,"video_cover":{"height":422,"url":"https://esfile.lexue.com/file/T1hRxTB7bT1RCvBVdK.jpg","width":750},"video_description":"#适用于全国各地高考\r\n#三条线涵盖体液调节考点\r\n#两个点突破体液调节考法","video_duration":0,"video_id":947,"video_title":"体液调节（下） 生物一轮复习（三二）","video_type":4,"watcher_count":3004},{"bought":false,"diamond_price":30,"expiration_time":90,"forward":"","forward_note":"","is_best":true,"product_id":42119,"real_diamond_price":30,"user_praise":346,"video_cover":{"height":422,"url":"https://esfile.lexue.com/file/T1oaxTBvYT1RCvBVdK.jpg","width":750},"video_description":"#适用于全国各地高考\r\n#三条线涵盖体液调节考点\r\n#两个点突破体液调节考法","video_duration":0,"video_id":946,"video_title":"体液调节（上） 生物一轮复习（三一）","video_type":4,"watcher_count":3588},{"bought":false,"diamond_price":30,"expiration_time":90,"forward":"","forward_note":"","is_best":true,"product_id":39786,"real_diamond_price":30,"user_praise":322,"video_cover":{"height":422,"url":"https://esfile.lexue.com/file/T1aaxTBKCT1RCvBVdK.jpg","width":750},"video_description":"#适用于全国各地高考\r\n#内环境稳态深入梳理，三大调节的内容灵魂\r\n#本次课下半场有小豹老师的倾情讲解，回顾那些高考中与生理相关的内容。","video_duration":0,"video_id":891,"video_title":"内环境与稳态 生物一轮复习（二八）","video_type":4,"watcher_count":3986},{"bought":false,"diamond_price":30,"expiration_time":90,"forward":"","forward_note":"","is_best":true,"product_id":40297,"real_diamond_price":30,"user_praise":298,"video_cover":{"height":422,"url":"https://esfile.lexue.com/file/T1BtxTBCD_1RCvBVdK.jpg","width":750},"video_description":"#适用于全国各地考生\r\n#刷什么题？怎么刷题？哪找好题来刷？不会的题怎么办？乐考生物2017，用考试辅助学习，解决你关于生物的一切问题！\r\n视频锚点（锚点有助于同学们快速查找对应题号）：\r\n第一题：01'47'' 第六题：13'50'' \r\n第十一题：29'02'' 第十六题：40'27'' \r\n第二十一题：52'05'' 第二十二题：56'14'' \r\n第二十三题：60'23'' 第二十四题：66'20'' \r\n第二十五题：69'50''","video_duration":4631,"video_id":902,"video_title":"乐考生物2017卷（六）解析","video_type":2,"watcher_count":2038},{"bought":false,"diamond_price":30,"expiration_time":90,"forward":"","forward_note":"","is_best":true,"product_id":38823,"real_diamond_price":30,"user_praise":353,"video_cover":{"height":422,"url":"https://esfile.lexue.com/file/T1uyxTBK_v1RCvBVdK.jpg","width":750},"video_description":"#适用于全国各地高考\r\n#变异模块的深入探究，育种进化模块的拓展梳理\r\n#从生化危机到农民伯伯种地，这是一节包罗万象的一轮复习课程","video_duration":0,"video_id":864,"video_title":"变异育种进化（下） 生物一轮复习（二六）","video_type":4,"watcher_count":3237},{"bought":false,"diamond_price":30,"expiration_time":90,"forward":"","forward_note":"","is_best":true,"product_id":38821,"real_diamond_price":30,"user_praise":366,"video_cover":{"height":422,"url":"https://esfile.lexue.com/file/T1YtxTBQCv1RCvBVdK.jpg","width":750},"video_description":"#适用于全国各地高考\r\n#变异模块的深入探究，育种进化模块的拓展梳理\r\n#从生化危机到农民伯伯种地，这是一节包罗万象的一轮复习课程","video_duration":0,"video_id":863,"video_title":"变异育种进化（上） 生物一轮复习（二五）","video_type":4,"watcher_count":3927},{"bought":false,"diamond_price":30,"expiration_time":90,"forward":"","forward_note":"","is_best":true,"product_id":38137,"real_diamond_price":30,"user_praise":304,"video_cover":{"height":422,"url":"https://esfile.lexue.com/file/T1RtxTBj__1RCvBVdK.jpg","width":750},"video_description":"#适用于全国各地考生\r\n#刷什么题？怎么刷题？哪找好题来刷？不会的题怎么办？乐考生物2017，用考试辅助学习，解决你关于生物的一切问题\r\n视频锚点（锚点有助于同学们快速查找对应题号）：\r\n第一题：00'22'' 第六题：14'25'' \r\n第十一题：32'15'' 第十六题：46'56'' \r\n第二十一题：57'38'' 第二十二题：62'59'' \r\n第二十三题：78'13'' 第二十四题：83'09'' \r\n第二十五题：87'44''","video_duration":5632,"video_id":840,"video_title":"乐考生物2017卷（四）解析","video_type":2,"watcher_count":2418},{"bought":false,"diamond_price":30,"expiration_time":90,"forward":"","forward_note":"","is_best":true,"product_id":37290,"real_diamond_price":30,"user_praise":368,"video_cover":{"height":422,"url":"https://esfile.lexue.com/file/T1ERxTB_ZT1RCvBVdK.jpg","width":750},"video_description":"#适用于全国各地高考\r\n#性别决定、伴性遗传、遗传图谱\r\n#解决除遗传学实验设计之外的所有内容\r\n#本堂课习题有彩蛋","video_duration":0,"video_id":816,"video_title":"一记勾拳----性别决定和伴性遗传（下）（生物一轮复习（二四））","video_type":4,"watcher_count":3741}]
     */

    private int chat_room_id;
    private int display_fans_count;
    private String error_info;
    private int fans_count;
    private int gift_num;
    private String horoscope;
    private int photo_total;
    private int popularity;
    private String sign;
    private int status;
    private String teacher_area;
    private String teacher_description;
    private TeacherIconBean teacher_icon;
    private int teacher_id;
    private String teacher_name;
    private int teacher_sex;
    private int teacher_subject;
    private TeacherSubjectIconBean teacher_subject_icon;
    private String teacher_subject_name;
    private int video_count;
    private int video_play_times;
    private List<?> assistants;
    private List<FansBean> fans;
    private List<GiftsBean> gifts;
    private List<TopFansBean> top_fans;
    private List<VideosBean> videos;

    public int getChat_room_id() {
        return chat_room_id;
    }

    public void setChat_room_id(int chat_room_id) {
        this.chat_room_id = chat_room_id;
    }

    public int getDisplay_fans_count() {
        return display_fans_count;
    }

    public void setDisplay_fans_count(int display_fans_count) {
        this.display_fans_count = display_fans_count;
    }

    public String getError_info() {
        return error_info;
    }

    public void setError_info(String error_info) {
        this.error_info = error_info;
    }

    public int getFans_count() {
        return fans_count;
    }

    public void setFans_count(int fans_count) {
        this.fans_count = fans_count;
    }

    public int getGift_num() {
        return gift_num;
    }

    public void setGift_num(int gift_num) {
        this.gift_num = gift_num;
    }

    public String getHoroscope() {
        return horoscope;
    }

    public void setHoroscope(String horoscope) {
        this.horoscope = horoscope;
    }

    public int getPhoto_total() {
        return photo_total;
    }

    public void setPhoto_total(int photo_total) {
        this.photo_total = photo_total;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTeacher_area() {
        return teacher_area;
    }

    public void setTeacher_area(String teacher_area) {
        this.teacher_area = teacher_area;
    }

    public String getTeacher_description() {
        return teacher_description;
    }

    public void setTeacher_description(String teacher_description) {
        this.teacher_description = teacher_description;
    }

    public TeacherIconBean getTeacher_icon() {
        return teacher_icon;
    }

    public void setTeacher_icon(TeacherIconBean teacher_icon) {
        this.teacher_icon = teacher_icon;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public int getTeacher_sex() {
        return teacher_sex;
    }

    public void setTeacher_sex(int teacher_sex) {
        this.teacher_sex = teacher_sex;
    }

    public int getTeacher_subject() {
        return teacher_subject;
    }

    public void setTeacher_subject(int teacher_subject) {
        this.teacher_subject = teacher_subject;
    }

    public TeacherSubjectIconBean getTeacher_subject_icon() {
        return teacher_subject_icon;
    }

    public void setTeacher_subject_icon(TeacherSubjectIconBean teacher_subject_icon) {
        this.teacher_subject_icon = teacher_subject_icon;
    }

    public String getTeacher_subject_name() {
        return teacher_subject_name;
    }

    public void setTeacher_subject_name(String teacher_subject_name) {
        this.teacher_subject_name = teacher_subject_name;
    }

    public int getVideo_count() {
        return video_count;
    }

    public void setVideo_count(int video_count) {
        this.video_count = video_count;
    }

    public int getVideo_play_times() {
        return video_play_times;
    }

    public void setVideo_play_times(int video_play_times) {
        this.video_play_times = video_play_times;
    }

    public List<?> getAssistants() {
        return assistants;
    }

    public void setAssistants(List<?> assistants) {
        this.assistants = assistants;
    }

    public List<FansBean> getFans() {
        return fans;
    }

    public void setFans(List<FansBean> fans) {
        this.fans = fans;
    }

    public List<GiftsBean> getGifts() {
        return gifts;
    }

    public void setGifts(List<GiftsBean> gifts) {
        this.gifts = gifts;
    }

    public List<TopFansBean> getTop_fans() {
        return top_fans;
    }

    public void setTop_fans(List<TopFansBean> top_fans) {
        this.top_fans = top_fans;
    }

    public List<VideosBean> getVideos() {
        return videos;
    }

    public void setVideos(List<VideosBean> videos) {
        this.videos = videos;
    }

    public static class TeacherIconBean {
        /**
         * height : 600
         * url : https://esfile.lexue.com/file/T1URxTBTLT1RCvBVdK.jpg
         * width : 600
         */

        private int height;
        private String url;
        private int width;

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }
    }

    public static class TeacherSubjectIconBean {
        /**
         * height : 135
         * url : https://esfile.lexue.com/file/T1FyhTBsET1RCvBVdK.png
         * width : 135
         */

        private int height;
        private String url;
        private int width;

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }
    }

    public static class FansBean {
        /**
         * city : 红河哈尼族彝族自治州
         * contribute : 0
         * follow_time : 1472224878
         * province : 云南省
         * rank : 0
         * role : 0
         * school : 个旧市第一中学
         * sex : 0
         * teacher_id : 0
         * user_icon : {"height":0,"url":"http://q.qlogo.cn/qqapp/1104177532/50C5479EF97ECFE5FC9F437AF4B7C607/100","width":0}
         * user_id : 135
         * user_name : 禾女鬼文子
         */

        private String city;
        private int contribute;
        private int follow_time;
        private String province;
        private int rank;
        private int role;
        private String school;
        private int sex;
        private int teacher_id;
        private UserIconBean user_icon;
        private int user_id;
        private String user_name;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getContribute() {
            return contribute;
        }

        public void setContribute(int contribute) {
            this.contribute = contribute;
        }

        public int getFollow_time() {
            return follow_time;
        }

        public void setFollow_time(int follow_time) {
            this.follow_time = follow_time;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        public int getRole() {
            return role;
        }

        public void setRole(int role) {
            this.role = role;
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public int getTeacher_id() {
            return teacher_id;
        }

        public void setTeacher_id(int teacher_id) {
            this.teacher_id = teacher_id;
        }

        public UserIconBean getUser_icon() {
            return user_icon;
        }

        public void setUser_icon(UserIconBean user_icon) {
            this.user_icon = user_icon;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public static class UserIconBean {
            /**
             * height : 0
             * url : http://q.qlogo.cn/qqapp/1104177532/50C5479EF97ECFE5FC9F437AF4B7C607/100
             * width : 0
             */

            private int height;
            private String url;
            private int width;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }
        }
    }

    public static class GiftsBean {
        /**
         * gift_count : 6091
         * gift_icon : {"height":220,"url":"https://esfile.lexue.com/file/T1RRxTBTbv1RCvBVdK.gif","width":220}
         * gift_name : 666
         * product_id : 77
         */

        private int gift_count;
        private GiftIconBean gift_icon;
        private String gift_name;
        private int product_id;

        public int getGift_count() {
            return gift_count;
        }

        public void setGift_count(int gift_count) {
            this.gift_count = gift_count;
        }

        public GiftIconBean getGift_icon() {
            return gift_icon;
        }

        public void setGift_icon(GiftIconBean gift_icon) {
            this.gift_icon = gift_icon;
        }

        public String getGift_name() {
            return gift_name;
        }

        public void setGift_name(String gift_name) {
            this.gift_name = gift_name;
        }

        public int getProduct_id() {
            return product_id;
        }

        public void setProduct_id(int product_id) {
            this.product_id = product_id;
        }

        public static class GiftIconBean {
            /**
             * height : 220
             * url : https://esfile.lexue.com/file/T1RRxTBTbv1RCvBVdK.gif
             * width : 220
             */

            private int height;
            private String url;
            private int width;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }
        }
    }

    public static class TopFansBean {
        /**
         * city : 四平市
         * contribute : 2000
         * follow_time : 1463184159
         * province : 吉林省
         * rank : 1
         * role : 0
         * school : 四平市实验中学
         * sex : 1
         * teacher_id : 0
         * user_icon : {"height":300,"url":"https://esfile.lexue.com/file/T1URhTB5Cv1RCvBVdK.jpg","width":300}
         * user_id : 1411793
         * user_name : 蓦然
         * weekly_contribute : 0
         */

        private String city;
        private int contribute;
        private int follow_time;
        private String province;
        private int rank;
        private int role;
        private String school;
        private int sex;
        private int teacher_id;
        private UserIconBeanX user_icon;
        private int user_id;
        private String user_name;
        private int weekly_contribute;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getContribute() {
            return contribute;
        }

        public void setContribute(int contribute) {
            this.contribute = contribute;
        }

        public int getFollow_time() {
            return follow_time;
        }

        public void setFollow_time(int follow_time) {
            this.follow_time = follow_time;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        public int getRole() {
            return role;
        }

        public void setRole(int role) {
            this.role = role;
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public int getTeacher_id() {
            return teacher_id;
        }

        public void setTeacher_id(int teacher_id) {
            this.teacher_id = teacher_id;
        }

        public UserIconBeanX getUser_icon() {
            return user_icon;
        }

        public void setUser_icon(UserIconBeanX user_icon) {
            this.user_icon = user_icon;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public int getWeekly_contribute() {
            return weekly_contribute;
        }

        public void setWeekly_contribute(int weekly_contribute) {
            this.weekly_contribute = weekly_contribute;
        }

        public static class UserIconBeanX {
            /**
             * height : 300
             * url : https://esfile.lexue.com/file/T1URhTB5Cv1RCvBVdK.jpg
             * width : 300
             */

            private int height;
            private String url;
            private int width;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }
        }
    }

    public static class VideosBean {
        /**
         * bought : false
         * diamond_price : 30
         * expiration_time : 90
         * forward :
         * forward_note :
         * is_best : true
         * product_id : 56647
         * real_diamond_price : 30
         * user_praise : 316
         * video_cover : {"height":422,"url":"https://esfile.lexue.com/file/T15yxTBmCT1RCvBVdK.jpg","width":750}
         * video_description : #适用于全国各地高考
         #高考占分6-12分
         #课本&考纲实验梳理，重点突破各实验的考点及难点
         #很繁琐？没意思？但是它是考试的内容，这都是白给的分数
         #你肯定没听过如此全面的实验总结课程
         * video_duration : 0
         * video_id : 1538
         * video_title : 考纲实验与课本实验（下） 生物二轮复习（十二）
         * video_type : 4
         * watcher_count : 1922
         */

        private boolean bought;
        private int diamond_price;
        private int expiration_time;
        private String forward;
        private String forward_note;
        private boolean is_best;
        private int product_id;
        private int real_diamond_price;
        private int user_praise;
        private VideoCoverBean video_cover;
        private String video_description;
        private int video_duration;
        private int video_id;
        private String video_title;
        private int video_type;
        private int watcher_count;

        public boolean isBought() {
            return bought;
        }

        public void setBought(boolean bought) {
            this.bought = bought;
        }

        public int getDiamond_price() {
            return diamond_price;
        }

        public void setDiamond_price(int diamond_price) {
            this.diamond_price = diamond_price;
        }

        public int getExpiration_time() {
            return expiration_time;
        }

        public void setExpiration_time(int expiration_time) {
            this.expiration_time = expiration_time;
        }

        public String getForward() {
            return forward;
        }

        public void setForward(String forward) {
            this.forward = forward;
        }

        public String getForward_note() {
            return forward_note;
        }

        public void setForward_note(String forward_note) {
            this.forward_note = forward_note;
        }

        public boolean isIs_best() {
            return is_best;
        }

        public void setIs_best(boolean is_best) {
            this.is_best = is_best;
        }

        public int getProduct_id() {
            return product_id;
        }

        public void setProduct_id(int product_id) {
            this.product_id = product_id;
        }

        public int getReal_diamond_price() {
            return real_diamond_price;
        }

        public void setReal_diamond_price(int real_diamond_price) {
            this.real_diamond_price = real_diamond_price;
        }

        public int getUser_praise() {
            return user_praise;
        }

        public void setUser_praise(int user_praise) {
            this.user_praise = user_praise;
        }

        public VideoCoverBean getVideo_cover() {
            return video_cover;
        }

        public void setVideo_cover(VideoCoverBean video_cover) {
            this.video_cover = video_cover;
        }

        public String getVideo_description() {
            return video_description;
        }

        public void setVideo_description(String video_description) {
            this.video_description = video_description;
        }

        public int getVideo_duration() {
            return video_duration;
        }

        public void setVideo_duration(int video_duration) {
            this.video_duration = video_duration;
        }

        public int getVideo_id() {
            return video_id;
        }

        public void setVideo_id(int video_id) {
            this.video_id = video_id;
        }

        public String getVideo_title() {
            return video_title;
        }

        public void setVideo_title(String video_title) {
            this.video_title = video_title;
        }

        public int getVideo_type() {
            return video_type;
        }

        public void setVideo_type(int video_type) {
            this.video_type = video_type;
        }

        public int getWatcher_count() {
            return watcher_count;
        }

        public void setWatcher_count(int watcher_count) {
            this.watcher_count = watcher_count;
        }

        public static class VideoCoverBean {
            /**
             * height : 422
             * url : https://esfile.lexue.com/file/T15yxTBmCT1RCvBVdK.jpg
             * width : 750
             */

            private int height;
            private String url;
            private int width;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }
        }
    }
}
