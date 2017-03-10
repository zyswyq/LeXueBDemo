package com.lanou.dllo.mvp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/*
         |              |
         | \            | \
         |   | | | | | |    | | | | |||||\
         |                          |||||||\
         |         ( )              ||||||||
         |                           |||||/
         |                  | | | | | |||/
         |    |             |          |
         |    |             |          |
       / |   | |            |          |\
      |      |/             |          \|
       \ |                  |
         |                  |
           \ | | | | | | | /
             |       |            <-----弱鸡
             |       |
             |       |
*/
public class Bean {

    /**
     * code : 0
     * data : [{"param":"1","type":"region","style":"medium","title":"动画区","body":[{"title":"【毁童年】大雄奇怪的本子","cover":"http://i0.hdslb.com/bfs/archive/cea29954b159c1bb62036072421b0fbcf9a225a3.jpg","uri":"bilibili://video/9028555","param":"9028555","goto":"av","play":17705,"danmaku":119,"is_ad":false},{"title":"【HP超会议Vol.3】瓶子君翻（怒）唱（怼）出（天）道（堂）为哪般？B站总攻教你唱歌！2P有惊喜！","cover":"http://i0.hdslb.com/bfs/archive/209b67fa049332c4166e719b345516a2a50d3d0d.jpg","uri":"bilibili://video/9043201","param":"9043201","goto":"av","play":18384,"danmaku":821,"is_ad":false},{"title":"【MMD】弱音：\u201c尽管放马过来！！！\u201d，BURNING","cover":"http://i0.hdslb.com/bfs/archive/a7bcb0698eaab56f50087ffacbd0728a320c97c0.jpg","uri":"bilibili://video/9025596","param":"9025596","goto":"av","play":12226,"danmaku":47,"is_ad":false},{"title":"（MMD）新旗袍青鸾式~巡音 Tokio·Funka 美美哒ヽ(*´з｀*)ノ","cover":"http://i0.hdslb.com/bfs/archive/22fd3af822766fd6dd592a9a7c1b2ae226737527.jpg","uri":"bilibili://video/9021906","param":"9021906","goto":"av","play":8317,"danmaku":46,"is_ad":false}],"banner":{"bottom":[{"id":37462,"title":"影视0310","image":"http://i0.hdslb.com/bfs/archive/daa72fe5eebde182a1a4642f87ca5ff470c215f9.jpg","hash":"cb911ab267ccb6966aa59c08b6285d2f","uri":"http://www.bilibili.com/blackboard/activity-HkL_qYRql.html","is_ad":false},{"id":0,"title":"崩3","image":"https://i0.hdslb.com/bfs/archive/ea7f8ccb3c56d2b5aa4efbd5c00f14fc7a3ecd09.jpg","hash":"1b2477a41b57daf5eedc4c3edabd49c1","uri":"bilibili://game/67","request_id":"1489110450296q172a18a61a211q115","creative_id":8963,"src_id":703,"is_ad":true,"is_ad_loc":true,"ad_cb":"CINGEIUYGKMbIAAoADAAOL8FQh8xNDg5MTEwNDUwMjk2cTE3MmExOGE2MWEyMTFxMTE1SPiAma+rK1IJ5Zub5bmz5biCWgnlkInmnpfnnIFiBuS4reWbvWgBcAB4AIABAIgB7QqSAQ4xMjIuMTQyLjc3LjE4MA==","client_ip":"122.142.77.180"},{"id":0,"title":"Forever Chuck! 我们搞点大动作","image":"https://i0.hdslb.com/bfs/archive/bcaa677c725886aa455f472eebd8c84bf583b96b.jpg","hash":"a1abe0a4ee801a1711cbf3f094e76db8","uri":"http://clickc.admaster.com.cn/c/a82981,b1587357,c3297,i0,m101,8a2,8b3,0a__OS__,n__MAC__,z__IDFA__,o__OPENUDID__,0d__ANDROIDID__,0c__IMEI__,f__IP__,t__TS__,q__OSVS__,r__TERM__,0i__MUDS__,0h__MUID__,0v__ISOFFLINE__,s__ADWH__,1b__CUSTOMV1__,1a__CUSTOMV2__,h","request_id":"1489110450296q172a18a61a211q115","creative_id":9327,"src_id":704,"is_ad":true,"is_ad_loc":true,"ad_cb":"CO9IEKEZGPwcIAAoADAAOMAFQh8xNDg5MTEwNDUwMjk2cTE3MmExOGE2MWEyMTFxMTE1SPiAma+rK1IJ5Zub5bmz5biCWgnlkInmnpfnnIFiBuS4reWbvWgBcAB4AIABAIgB4g2SAQ4xMjIuMTQyLjc3LjE4MA==","client_ip":"122.142.77.180"},{"id":37522,"title":"舞蹈48期","image":"http://i0.hdslb.com/bfs/archive/c7a546656cb5e0a1fd1b2f92b8fb2ae132a7773e.png","hash":"13ab5ebf26af942f17aac45a829f8460","uri":"http://www.bilibili.com/blackboard/activity-ryfH120cl.html","is_ad":false}]}},{"param":"","type":"topic","style":"large","title":"","body":[{"title":"","cover":"http://i0.hdslb.com/bfs/archive/bc2cbdf4ec40d8b93d9e5e57d8674b7633765eb4.jpg","uri":"http://www.bilibili.com/blackboard/activity-HJVXzOS5l.html","param":"http://www.bilibili.com/blackboard/activity-HJVXzOS5l.html","goto":"web","is_ad":false}]},{"param":"3","type":"region","style":"medium","title":"音乐区","body":[{"title":"【wis】这些年翻唱过的歌【36首】","cover":"http://i0.hdslb.com/bfs/archive/fa7c70e344da8f48842fab3760abacb75aea1c58.jpg","uri":"bilibili://video/9021411","param":"9021411","goto":"av","play":19395,"danmaku":209,"is_ad":false},{"title":"【猫阡陌】坏童话（祝大家妇女节快乐？祝我老妈生日快乐！）","cover":"http://i0.hdslb.com/bfs/archive/69289fcababb23f9734e8130bb5a347c36a0976a.jpg","uri":"bilibili://video/9032370","param":"9032370","goto":"av","play":7658,"danmaku":139,"is_ad":false},{"title":"【FGO】【单身情歌】非洲之嚎","cover":"http://i0.hdslb.com/bfs/archive/d435f8d1f148c73e23ac87fcfe207fcf77ffc7f7.jpg","uri":"bilibili://video/9017459","param":"9017459","goto":"av","play":31614,"danmaku":499,"is_ad":false},{"title":"【梦兮】红颜绝","cover":"http://i0.hdslb.com/bfs/archive/2641dcbc675a94634abec1ea3911ce4dad66e287.jpg","uri":"bilibili://video/9023731","param":"9023731","goto":"av","play":6325,"danmaku":30,"is_ad":false}]},{"param":"","type":"topic","style":"large","title":"","body":[{"title":"","cover":"http://i0.hdslb.com/bfs/archive/8b84dcbef4cd9f74b1b08ce25597e2084f60c85f.jpg","uri":"http://www.bilibili.com/blackboard/activity-H1Zl_ys5e.html","param":"http://www.bilibili.com/blackboard/activity-H1Zl_ys5e.html","goto":"web","is_ad":false}]},{"param":"129","type":"region","style":"medium","title":"舞蹈区","body":[{"title":"TS白小白编舞《凉凉》中国风舞蹈教学练习室{夜华版}【TS DANCE】","cover":"http://i0.hdslb.com/bfs/archive/c3d17326c0129c371176f32a6fc2d907c531abf2.jpg","uri":"bilibili://video/9038379","param":"9038379","goto":"av","play":11867,"danmaku":108,"is_ad":false},{"title":"【Yes舞蹈工作室】我们把\u201c极乐净土\u201d鬼畜了\u2014\u2014最炫极乐民族净土风之舞蹈教学（片尾有彩蛋！）","cover":"http://i0.hdslb.com/bfs/archive/7f2eb582802448dd83ce784193fae1e3ea080fe8.jpg","uri":"bilibili://video/9048722","param":"9048722","goto":"av","play":3754,"danmaku":66,"is_ad":false},{"title":"【菌子】  Girls","cover":"http://i0.hdslb.com/bfs/archive/3829e18b4697b5be826a8ce3f62b474e9fd1b690.jpg","uri":"bilibili://video/9030450","param":"9030450","goto":"av","play":62461,"danmaku":299,"is_ad":false},{"title":"【RenTo】３９【初音COS】","cover":"http://i0.hdslb.com/bfs/archive/5d369f73f69c83974ed27948cd4b9414d1880e21.jpg","uri":"bilibili://video/9048842","param":"9048842","goto":"av","play":11958,"danmaku":88,"is_ad":false}]},{"param":"4","type":"region","style":"medium","title":"游戏区","body":[{"title":"五五开连麦16岁女粉丝, 最后癫狂了","cover":"http://i0.hdslb.com/bfs/archive/4c013148359d626d86c36ed69af7465042e123e9.jpg","uri":"bilibili://video/9036519","param":"9036519","goto":"av","play":160595,"danmaku":1391,"is_ad":false},{"title":"重做的荆轲与东皇太一的技能技能展示","cover":"http://i0.hdslb.com/bfs/archive/364a9f81a575a904ee28c4bffb045e751ee7d878.jpg","uri":"bilibili://video/9052990","param":"9052990","goto":"av","play":47818,"danmaku":283,"is_ad":false},{"title":"每日撸报3.7：来，看猴哥给你们秀一波","cover":"http://i0.hdslb.com/bfs/archive/fa97dd1e094eb2ee5ff9f0ff587bb81c9b0fe46d.jpg","uri":"bilibili://video/9022859","param":"9022859","goto":"av","play":69742,"danmaku":891,"is_ad":false},{"title":"【LOL】英雄联盟加里奥重做后打野试玩","cover":"http://i0.hdslb.com/bfs/archive/e7880590c84bbe6753e3679284ed8c8c5e3fda8d.jpg","uri":"bilibili://video/9040665","param":"9040665","goto":"av","play":54192,"danmaku":1231,"is_ad":false}],"banner":{"bottom":[{"id":37172,"title":"鬼畜0309","image":"http://i0.hdslb.com/bfs/archive/19db8c6796e2309c5ab90cc3e58fcb1fe80ee5d1.jpg","hash":"ff08abd722f6ba922cbd96c1831f4f38","uri":"http://www.bilibili.com/blackboard/activity-BJk32n99e.html","is_ad":false}]}},{"param":"","type":"topic","style":"large","title":"","body":[{"title":"","cover":"http://i0.hdslb.com/bfs/archive/19db8c6796e2309c5ab90cc3e58fcb1fe80ee5d1.jpg","uri":"http://www.bilibili.com/blackboard/activity-BJk32n99e.html","param":"http://www.bilibili.com/blackboard/activity-BJk32n99e.html","goto":"web","is_ad":false}]},{"param":"119","type":"region","style":"medium","title":"鬼畜区","body":[{"title":"do back yohane","cover":"http://i0.hdslb.com/bfs/archive/88906e76360d8cdbed7e20c45013589a89b0fc93.jpg","uri":"bilibili://video/9028853","param":"9028853","goto":"av","play":8607,"danmaku":28,"is_ad":false},{"title":"王者荣耀+匆匆那年=匆匆农药","cover":"http://i0.hdslb.com/bfs/archive/b05da712545275054826ee3771c7bd0d70074892.jpg","uri":"bilibili://video/9035111","param":"9035111","goto":"av","play":18011,"danmaku":111,"is_ad":false},{"title":"【全明星RAP】Baby搞比利","cover":"http://i0.hdslb.com/bfs/archive/82c512eef7777a615612a1ef4f33318eed09fe03.jpg","uri":"bilibili://video/9043649","param":"9043649","goto":"av","play":2753,"danmaku":64,"is_ad":false},{"title":"【原曲不使用】最高还原！Minecraft版fade","cover":"http://i0.hdslb.com/bfs/archive/36d0cbce66d5ccaafab5ead27702b9208ecae1b3.jpg","uri":"bilibili://video/9045256","param":"9045256","goto":"av","play":10578,"danmaku":120,"is_ad":false}]},{"param":"","type":"topic","style":"large","title":"","body":[{"title":"","cover":"http://i0.hdslb.com/bfs/archive/4723ce715e597403c3351a7c496eb138bfb021e0.jpg","uri":"http://www.bilibili.com/blackboard/activity-SyaH5G45l.html","param":"http://www.bilibili.com/blackboard/activity-SyaH5G45l.html","goto":"web","is_ad":false}]},{"param":"160","type":"region","style":"medium","title":"生活区","body":[{"title":"中国配音演员都是怪物-单人系列-张杰","cover":"http://i0.hdslb.com/bfs/archive/bbb687109fc9b92b6f2e70779e949c7e20fb6cf5.png","uri":"bilibili://video/9034416","param":"9034416","goto":"av","play":145142,"danmaku":4157,"is_ad":false},{"title":"如果没有监控，我们不会知道这一脚有多可怕！","cover":"http://i0.hdslb.com/bfs/archive/f3c5704ce77518629a124e9880e7c1dca8a95270.jpg","uri":"bilibili://video/9032680","param":"9032680","goto":"av","play":86379,"danmaku":434,"is_ad":false},{"title":"国外一位妻子总在睡觉时被老公吵醒，便录视频发到网上让大家评理","cover":"http://i0.hdslb.com/bfs/archive/d9c1ec63c500769d922d1342e9c7dd0148f982b4.png","uri":"bilibili://video/9040123","param":"9040123","goto":"av","play":47724,"danmaku":370,"is_ad":false},{"title":"【宇宙大新闻】58 打劫呢！能不能尊重下我的职业","cover":"http://i0.hdslb.com/bfs/archive/b45470fc6ea8c3185b9a1d6718c05053fa98ca65.jpg","uri":"bilibili://video/9045846","param":"9045846","goto":"av","play":83646,"danmaku":2393,"is_ad":false}],"banner":{"bottom":[{"id":37132,"title":"科技0308","image":"http://i0.hdslb.com/bfs/archive/379d7bb8e046e8ee1a984a582a9895a87fed543e.jpg","hash":"d1967adedd12d8b6926f01d97fc640b0","uri":"http://www.bilibili.com/blackboard/activity-rybOsQVqx.html","is_ad":false}]}},{"param":"","type":"topic","style":"large","title":"","body":[{"title":"","cover":"http://i0.hdslb.com/bfs/archive/379d7bb8e046e8ee1a984a582a9895a87fed543e.jpg","uri":"http://www.bilibili.com/blackboard/activity-rybOsQVqx.html","param":"http://www.bilibili.com/blackboard/activity-rybOsQVqx.html","goto":"web","is_ad":false}]},{"param":"36","type":"region","style":"medium","title":"科技区","body":[{"title":"汝有萨德，吾有导弹雨！","cover":"http://i0.hdslb.com/bfs/archive/9ce994a7bb3d0a89c2af1be65a123e2f6fb86dd1.jpg","uri":"bilibili://video/9040159","param":"9040159","goto":"av","play":17934,"danmaku":400,"is_ad":false},{"title":"$20000的钢笔，限量99支，每个部件要500多次人工操作","cover":"http://i0.hdslb.com/bfs/archive/e414de29160bfc144ea88024f0c224520aef9e0e.jpg","uri":"bilibili://video/9027719","param":"9027719","goto":"av","play":67974,"danmaku":109,"is_ad":false},{"title":"【陀螺评测】两个陀螺三万块！爆旋飞龙GT 初代爆旋陀螺","cover":"http://i0.hdslb.com/bfs/archive/464f009030c5cae3ce78b66dfdaeba0127c53607.png","uri":"bilibili://video/9017552","param":"9017552","goto":"av","play":135965,"danmaku":1347,"is_ad":false},{"title":"乌克兰外长：什么\u201c中国威胁\u201d？风太大我听不见= =","cover":"http://i0.hdslb.com/bfs/archive/b44a3f9a83a735d84a2dcb9d885545bc60650b32.jpg","uri":"bilibili://video/9058598","param":"9058598","goto":"av","play":20814,"danmaku":33,"is_ad":false}]},{"param":"subarea","type":"activity","style":"small","title":"活动中心","body":[{"title":"Vsinger创作征集大赛！","cover":"http://i0.hdslb.com/bfs/archive/c21dd3c2514892c5ca19e3dff7891d1f5f3051ce.jpg","uri":"http://www.bilibili.com/blackboard/activity-vsinger2017-m.html","param":"http://www.bilibili.com/blackboard/activity-vsinger2017-m.html","goto":"web","is_ad":false},{"title":"一起来画出你的愿望吧！","cover":"http://i0.hdslb.com/bfs/archive/19813222000e51e55d801c857ac0df58093e4a1b.jpg","uri":"http://www.bilibili.com/blackboard/activity_17bnj_pray_m.html","param":"http://www.bilibili.com/blackboard/activity_17bnj_pray_m.html","goto":"web","is_ad":false},{"title":"拜年祭之元宵会，一起来闹元宵吧！","cover":"http://i0.hdslb.com/bfs/archive/0149792c18638219c654c2d911a5feca82f73ebd.jpg","uri":"http://www.bilibili.com/blackboard/activity-2017lantern-m.html","param":"http://www.bilibili.com/blackboard/activity-2017lantern-m.html","goto":"web","is_ad":false}]},{"param":"155","type":"region","style":"medium","title":"时尚区","body":[{"title":"请你不要这样化妆！太辣眼睛了","cover":"http://i0.hdslb.com/bfs/archive/c723cb150e8a65fef899a51c90983ad544badd1d.jpg","uri":"bilibili://video/9032665","param":"9032665","goto":"av","play":36106,"danmaku":3078,"is_ad":false},{"title":"我不喜欢的破产品们！（贵的稍稍偏多）","cover":"http://i0.hdslb.com/bfs/archive/b2976fd45eaa837a35f77dd9c422a37880b4d38d.jpg","uri":"bilibili://video/9065726","param":"9065726","goto":"av","play":6707,"danmaku":255,"is_ad":false},{"title":"打造可爱蝴蝶公主妆容让你化身迷人精致的Butterfly Party Queen！","cover":"http://i0.hdslb.com/bfs/archive/20e1fc78857364c9df4112b5a70a8692ddc5be9b.jpg","uri":"bilibili://video/9024398","param":"9024398","goto":"av","play":7083,"danmaku":60,"is_ad":false},{"title":"【Rainie】厉害了! 一年的空瓶+吐槽说个够! Product Empties &amp; Regrets","cover":"http://i0.hdslb.com/bfs/archive/63db52e26ed0bc599420a019df73c43aeecf8058.jpg","uri":"bilibili://video/9032571","param":"9032571","goto":"av","play":96102,"danmaku":2126,"is_ad":false}]},{"param":"165","type":"region","style":"medium","title":"广告区","body":[{"title":"我之前看的可能都是假广告，俄罗斯大片级广告","cover":"http://i0.hdslb.com/bfs/archive/26ef1a1e747a58867e638372f482755e41f14ba9.jpg","uri":"bilibili://video/9021464","param":"9021464","goto":"av","play":3208,"danmaku":4,"is_ad":false},{"title":"闪断腰的神转折泰国广告合集，真的是不到最后一秒都不知道会发生什么","cover":"http://i0.hdslb.com/bfs/archive/973388631f85404a451e8157449d90e37925971a.jpg","uri":"bilibili://video/9035955","param":"9035955","goto":"av","play":1729,"danmaku":15,"is_ad":false},{"title":"这视频有毒，全程不敢眨眼，我的眼睛大概是要瞎了。（转自新浪微博）","cover":"http://i0.hdslb.com/bfs/archive/80b553a8a0b28e9b7bf876e4d770e3d0703423d0.jpg","uri":"bilibili://video/9019921","param":"9019921","goto":"av","play":3082,"danmaku":9,"is_ad":false},{"title":"听说可口可乐可以用来撩汉","cover":"http://i0.hdslb.com/bfs/archive/3808a5295e45abbb5b49968570f0b0c94b512d00.jpg","uri":"bilibili://video/9012313","param":"9012313","goto":"av","play":2563,"danmaku":17,"is_ad":false}]},{"param":"5","type":"region","style":"medium","title":"娱乐区","body":[{"title":"【SNH48】【初心】重回原点，舞台依旧，互道安好，继续同行 《大家好 我们是SNH48》四周年纪念公演（2017.1.12）","cover":"http://i0.hdslb.com/bfs/archive/57173bf3adfea0e82bdbe77d23a443b0e799b0c3.jpg","uri":"bilibili://video/9021764","param":"9021764","goto":"av","play":50019,"danmaku":13746,"is_ad":false},{"title":"【暴走大事件第五季】05  王尼玛爆款直播拔剑小学生市场，韩国萨德开启作妖新篇章","cover":"http://i0.hdslb.com/bfs/archive/9254b7be9742bbda2bb495bb2f585332bbc047a1.jpg","uri":"bilibili://video/9065920","param":"9065920","goto":"av","play":94998,"danmaku":3823,"is_ad":false},{"title":"【KTL字幕组】20170301 JANIBEN【嘉宾：前野朋哉】","cover":"http://i0.hdslb.com/bfs/archive/8890532ef711094da1d4254ea2389b7886a9881a.png","uri":"bilibili://video/9038983","param":"9038983","goto":"av","play":2867,"danmaku":492,"is_ad":false},{"title":"【iPad字幕组】170224 冈田奈奈x村山彩希 Showroom 200分钟超完全放送","cover":"http://i0.hdslb.com/bfs/archive/aaef5674fb89698e3a6ec2ca028c3856dd81b0a8.jpg","uri":"bilibili://video/9054910","param":"9054910","goto":"av","play":2848,"danmaku":1032,"is_ad":false}]},{"param":"11","type":"region","style":"medium","title":"电视剧区","body":[{"title":"台剧【HIStory系列】大合集（预告+正片+花絮+OST+访谈+见面会）","cover":"http://i0.hdslb.com/bfs/archive/60acd837eb7f33ec46d6031aaa28e35b233e06e7.jpg","uri":"bilibili://video/9023565","param":"9023565","goto":"av","play":11672,"danmaku":339,"is_ad":false},{"title":"电视剧《三生三世十里桃花》片场搞笑花絮合集（已完结）【杨幂/赵又廷/张彬彬/张智尧/于朦胧/迪丽热巴/祝绪丹/黄梦莹】","cover":"http://i0.hdslb.com/bfs/archive/cea350144cdb323b3850d6fbffee9ce5411e9303.jpg","uri":"bilibili://video/9019453","param":"9019453","goto":"av","play":14891,"danmaku":154,"is_ad":false},{"title":"夫夫高甜日常，花样虐狗，我应该在车底不应该在车里，看到你们有多甜蜜","cover":"http://i0.hdslb.com/bfs/archive/392711d158d1e0e7aa99edbf4620e3cafbc27f1e.jpg","uri":"bilibili://video/9041769","param":"9041769","goto":"av","play":15360,"danmaku":264,"is_ad":false},{"title":"泰国BL腐剧混剪，有虐有糖也有\u201c毒\u201d！你们要的OT暖暖小狮子白船根八东皿暹罗一年生爱来了被错过为爱所困等一次性都给你","cover":"http://i0.hdslb.com/bfs/archive/e24c1c58ec1e143c690cf9eabbf5862e85daa85f.jpg","uri":"bilibili://video/9042066","param":"9042066","goto":"av","play":5628,"danmaku":461,"is_ad":false}]},{"param":"","type":"topic","style":"large","title":"","body":[{"title":"","cover":"http://i0.hdslb.com/bfs/archive/780e8f7112162a84193b62797c13892a89843e67.jpg","uri":"http://www.bilibili.com/blackboard/activity-r1x6ze45g.html","param":"http://www.bilibili.com/blackboard/activity-r1x6ze45g.html","goto":"web","is_ad":false}]},{"param":"23","type":"region","style":"medium","title":"电影区","body":[{"title":"【太污了！】斯嘉丽主演R级喜剧《仓惶一夜》（Rough Night） @药丸字幕组","cover":"http://i0.hdslb.com/bfs/archive/89dc394907c040da95a56259b2cb0e03a0d5613a.jpg","uri":"bilibili://video/9053772","param":"9053772","goto":"av","play":12382,"danmaku":57,"is_ad":false},{"title":"《功夫》中那些未播出的片段","cover":"http://i0.hdslb.com/bfs/archive/2eff811c26f9475dc3962386cdabdd8d7dd291d5.jpg","uri":"bilibili://video/9058713","param":"9058713","goto":"av","play":37022,"danmaku":240,"is_ad":false},{"title":"千方百计只为和女神啪啪啪，三分钟说完电影《情圣》【污贼说电影】","cover":"http://i0.hdslb.com/bfs/archive/9879f435ea68066e4c68a5e9360795a6c11cc0c2.jpg","uri":"bilibili://video/9057333","param":"9057333","goto":"av","play":13471,"danmaku":28,"is_ad":false},{"title":"【菊长】好莱坞把《爱情买卖》拍成了电影，还拍了两部","cover":"http://i0.hdslb.com/bfs/archive/f6dde68d1fb7a82a245c5b62914498d2dcfbf388.jpg","uri":"bilibili://video/9053815","param":"9053815","goto":"av","play":9666,"danmaku":128,"is_ad":false}]}]
     * message :
     */

    private int code;
    private String message;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * param : 1
         * type : region
         * style : medium
         * title : 动画区
         * body : [{"title":"【毁童年】大雄奇怪的本子","cover":"http://i0.hdslb.com/bfs/archive/cea29954b159c1bb62036072421b0fbcf9a225a3.jpg","uri":"bilibili://video/9028555","param":"9028555","goto":"av","play":17705,"danmaku":119,"is_ad":false},{"title":"【HP超会议Vol.3】瓶子君翻（怒）唱（怼）出（天）道（堂）为哪般？B站总攻教你唱歌！2P有惊喜！","cover":"http://i0.hdslb.com/bfs/archive/209b67fa049332c4166e719b345516a2a50d3d0d.jpg","uri":"bilibili://video/9043201","param":"9043201","goto":"av","play":18384,"danmaku":821,"is_ad":false},{"title":"【MMD】弱音：\u201c尽管放马过来！！！\u201d，BURNING","cover":"http://i0.hdslb.com/bfs/archive/a7bcb0698eaab56f50087ffacbd0728a320c97c0.jpg","uri":"bilibili://video/9025596","param":"9025596","goto":"av","play":12226,"danmaku":47,"is_ad":false},{"title":"（MMD）新旗袍青鸾式~巡音 Tokio·Funka 美美哒ヽ(*´з｀*)ノ","cover":"http://i0.hdslb.com/bfs/archive/22fd3af822766fd6dd592a9a7c1b2ae226737527.jpg","uri":"bilibili://video/9021906","param":"9021906","goto":"av","play":8317,"danmaku":46,"is_ad":false}]
         * banner : {"bottom":[{"id":37462,"title":"影视0310","image":"http://i0.hdslb.com/bfs/archive/daa72fe5eebde182a1a4642f87ca5ff470c215f9.jpg","hash":"cb911ab267ccb6966aa59c08b6285d2f","uri":"http://www.bilibili.com/blackboard/activity-HkL_qYRql.html","is_ad":false},{"id":0,"title":"崩3","image":"https://i0.hdslb.com/bfs/archive/ea7f8ccb3c56d2b5aa4efbd5c00f14fc7a3ecd09.jpg","hash":"1b2477a41b57daf5eedc4c3edabd49c1","uri":"bilibili://game/67","request_id":"1489110450296q172a18a61a211q115","creative_id":8963,"src_id":703,"is_ad":true,"is_ad_loc":true,"ad_cb":"CINGEIUYGKMbIAAoADAAOL8FQh8xNDg5MTEwNDUwMjk2cTE3MmExOGE2MWEyMTFxMTE1SPiAma+rK1IJ5Zub5bmz5biCWgnlkInmnpfnnIFiBuS4reWbvWgBcAB4AIABAIgB7QqSAQ4xMjIuMTQyLjc3LjE4MA==","client_ip":"122.142.77.180"},{"id":0,"title":"Forever Chuck! 我们搞点大动作","image":"https://i0.hdslb.com/bfs/archive/bcaa677c725886aa455f472eebd8c84bf583b96b.jpg","hash":"a1abe0a4ee801a1711cbf3f094e76db8","uri":"http://clickc.admaster.com.cn/c/a82981,b1587357,c3297,i0,m101,8a2,8b3,0a__OS__,n__MAC__,z__IDFA__,o__OPENUDID__,0d__ANDROIDID__,0c__IMEI__,f__IP__,t__TS__,q__OSVS__,r__TERM__,0i__MUDS__,0h__MUID__,0v__ISOFFLINE__,s__ADWH__,1b__CUSTOMV1__,1a__CUSTOMV2__,h","request_id":"1489110450296q172a18a61a211q115","creative_id":9327,"src_id":704,"is_ad":true,"is_ad_loc":true,"ad_cb":"CO9IEKEZGPwcIAAoADAAOMAFQh8xNDg5MTEwNDUwMjk2cTE3MmExOGE2MWEyMTFxMTE1SPiAma+rK1IJ5Zub5bmz5biCWgnlkInmnpfnnIFiBuS4reWbvWgBcAB4AIABAIgB4g2SAQ4xMjIuMTQyLjc3LjE4MA==","client_ip":"122.142.77.180"},{"id":37522,"title":"舞蹈48期","image":"http://i0.hdslb.com/bfs/archive/c7a546656cb5e0a1fd1b2f92b8fb2ae132a7773e.png","hash":"13ab5ebf26af942f17aac45a829f8460","uri":"http://www.bilibili.com/blackboard/activity-ryfH120cl.html","is_ad":false}]}
         */

        private String param;
        private String type;
        private String style;
        private String title;
        private BannerBean banner;
        private List<BodyBean> body;

        public String getParam() {
            return param;
        }

        public void setParam(String param) {
            this.param = param;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getStyle() {
            return style;
        }

        public void setStyle(String style) {
            this.style = style;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public BannerBean getBanner() {
            return banner;
        }

        public void setBanner(BannerBean banner) {
            this.banner = banner;
        }

        public List<BodyBean> getBody() {
            return body;
        }

        public void setBody(List<BodyBean> body) {
            this.body = body;
        }

        public static class BannerBean {
            private List<BottomBean> bottom;

            public List<BottomBean> getBottom() {
                return bottom;
            }

            public void setBottom(List<BottomBean> bottom) {
                this.bottom = bottom;
            }

            public static class BottomBean {
                /**
                 * id : 37462
                 * title : 影视0310
                 * image : http://i0.hdslb.com/bfs/archive/daa72fe5eebde182a1a4642f87ca5ff470c215f9.jpg
                 * hash : cb911ab267ccb6966aa59c08b6285d2f
                 * uri : http://www.bilibili.com/blackboard/activity-HkL_qYRql.html
                 * is_ad : false
                 * request_id : 1489110450296q172a18a61a211q115
                 * creative_id : 8963
                 * src_id : 703
                 * is_ad_loc : true
                 * ad_cb : CINGEIUYGKMbIAAoADAAOL8FQh8xNDg5MTEwNDUwMjk2cTE3MmExOGE2MWEyMTFxMTE1SPiAma+rK1IJ5Zub5bmz5biCWgnlkInmnpfnnIFiBuS4reWbvWgBcAB4AIABAIgB7QqSAQ4xMjIuMTQyLjc3LjE4MA==
                 * client_ip : 122.142.77.180
                 */

                private int id;
                private String title;
                private String image;
                private String hash;
                private String uri;
                private boolean is_ad;
                private String request_id;
                private int creative_id;
                private int src_id;
                private boolean is_ad_loc;
                private String ad_cb;
                private String client_ip;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getHash() {
                    return hash;
                }

                public void setHash(String hash) {
                    this.hash = hash;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public boolean isIs_ad() {
                    return is_ad;
                }

                public void setIs_ad(boolean is_ad) {
                    this.is_ad = is_ad;
                }

                public String getRequest_id() {
                    return request_id;
                }

                public void setRequest_id(String request_id) {
                    this.request_id = request_id;
                }

                public int getCreative_id() {
                    return creative_id;
                }

                public void setCreative_id(int creative_id) {
                    this.creative_id = creative_id;
                }

                public int getSrc_id() {
                    return src_id;
                }

                public void setSrc_id(int src_id) {
                    this.src_id = src_id;
                }

                public boolean isIs_ad_loc() {
                    return is_ad_loc;
                }

                public void setIs_ad_loc(boolean is_ad_loc) {
                    this.is_ad_loc = is_ad_loc;
                }

                public String getAd_cb() {
                    return ad_cb;
                }

                public void setAd_cb(String ad_cb) {
                    this.ad_cb = ad_cb;
                }

                public String getClient_ip() {
                    return client_ip;
                }

                public void setClient_ip(String client_ip) {
                    this.client_ip = client_ip;
                }
            }
        }

        public static class BodyBean {
            /**
             * title : 【毁童年】大雄奇怪的本子
             * cover : http://i0.hdslb.com/bfs/archive/cea29954b159c1bb62036072421b0fbcf9a225a3.jpg
             * uri : bilibili://video/9028555
             * param : 9028555
             * goto : av
             * play : 17705
             * danmaku : 119
             * is_ad : false
             */

            private String title;
            private String cover;
            private String uri;
            private String param;
            @SerializedName("goto")
            private String gotoX;
            private int play;
            private int danmaku;
            private boolean is_ad;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public String getParam() {
                return param;
            }

            public void setParam(String param) {
                this.param = param;
            }

            public String getGotoX() {
                return gotoX;
            }

            public void setGotoX(String gotoX) {
                this.gotoX = gotoX;
            }

            public int getPlay() {
                return play;
            }

            public void setPlay(int play) {
                this.play = play;
            }

            public int getDanmaku() {
                return danmaku;
            }

            public void setDanmaku(int danmaku) {
                this.danmaku = danmaku;
            }

            public boolean isIs_ad() {
                return is_ad;
            }

            public void setIs_ad(boolean is_ad) {
                this.is_ad = is_ad;
            }
        }
    }
}
