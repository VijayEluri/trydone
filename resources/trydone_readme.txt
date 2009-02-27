基于 jforum 2007.02.15 bata 的中文化更改
-----------------------------------------------------------
最近由于升级事件搞火了,于是自己就做了个汉化,也更改了些2.1.7中的内容,大部分都已经汉化
算是给支持TryDone.com及JForum中文爱好者的春节小礼物:) 希望大家能喜欢,
-----------------------------------------------------------
@author : www.trydone.com

更改记录 2007-2-16
1 增加简体中文(/WEB-INF/config/languages/language_zh_CN.properties),把语言文件重命名为language${locale}.properties ,方便于Idea的编辑使用.
2 增加"繁体转简体"工具(/tools/繁体转简体.htm)
3 增加邮件简体中文包(/templates/mail/zh_CN/)
4 对后台管理"权限"设置的页面进行汉化,修改了(src\net\jforum\view\admin\GroupAction.java)使之可以本地化,增加两个文件(/WEB-INF/config/permissions_en_US.xml原英文,permissions_zh_CN.xml简体中文)
5 汉化了初始化的mysql数据,增加文件 (/WEB-INF/config/database/mysql_data_dump_zh_CN.sql) 同时修改了 net.jforum.view.install.InstallAction.java 使之能本地化调用 mysql_data_dump_zh_CN.sql
6 修改log4j.xml 增加logger(com.mchange)

其它
运行于jdk1.4/jdk1.5以上版本,最好1.5以上
测试运行环境: Idea 6.04 + Resin 3.0.19 + JDK1.4.2 +MySQL 5.1
第一次运行安装程序: /install/install.page?module=install&action=welcome



-----------------------------------
2007-02-18
增加hsqldb-1.8.0.jar hsqldb.properties

-----------------------------------
2007-02-26
增加注册提示的内容(直接COPY动网:)) /templates/agreement/terms_zh_CN.txt
增加汉化文件(非Unicode)            /WEB-INF/config/languages/language_zh_CN.txt
修改部分汉化内容
修改"繁体转简体"工具
-----------------------------------
2007-3-1
修改邮件发送的一些汉化,同时把文件由ASCII 改 Unicode   (/templates/mail/zh_CN/*)    Tks:木匠
Tools里增加一个PHPBB2 的模板转为JForum模析的一个Bat (/tools/convertSkin.bat) 主要设置三参数
多花了点时间修改了几个不人性化汉化 :) (/WEB-INF/config/languages/language_zh_CN.properties,language_zh_CN.txt )
改SVN版式管理
合并jforum-2.1.7-b3-src

-----------------------------------
2007-3-2
合并时漏了选择中文的options及locales修改导致无法找到选择中文的选项
同时修改默认打开主页时直接转到中文安装页面

-----------------------------------
2007-3-15
对后台管理部分汉化做些修改,包括"jwgao"提出的内容( http://www.trydone.com/posts/list/78.page#136 )

-----------------------------------
2007-3-16
修改一个后台汉化:版页分类为版面分类
修改文件:/WEB-INF/config/languages/language_zh_CN.properties
更新文件:/WEB-INF/config/languages/language_zh_CN.txt

-----------------------------------
2007-3-20
修改了样式中文在IE中太小看不清的问题 /templates/default/styles/zh_CN.css , /templates/default/admin/style.css
修改添加到收藏时的弹出窗口太小的问题 /templates/default/js/utils.js
修改rida发现使用oracle数据库时无法发送主题目邮件的问题: /WEB-INF/config/databases/oracle/oracle.sql 参考( http://www.trydone.com/posts/list/92.page#209 )


-----------------------------------
2007-3-21
解决在oracle中设置附件配额时出错(rida发现的错: http://www.trydone.com/posts/list/101.page#241)


-----------------------------------
2007-3-22
解决
[code]
log4j:WARN No appenders could be found for logger (com.mchange.v2.log.MLog).
[/code] 
[code]
2007-3-22 14:22:08 uk.ltd.getahead.dwr.util.CommonsLoggingOutput error
严重: Line=2 Document root element "dwr", must match DOCTYPE root "null".
2007-3-22 14:22:08 uk.ltd.getahead.dwr.util.CommonsLoggingOutput error
严重: Line=2 Document is invalid: no grammar found.
[/code]
[code]
2007-3-22 14:22:08 uk.ltd.getahead.dwr.util.CommonsLoggingOutput error
严重: The 'session' and 'static' creators are deprecated. Use the 'new' creator
2007-3-22 14:22:08 uk.ltd.getahead.dwr.util.CommonsLoggingOutput error
严重:   For more information see the DWR website
[/code]
修改文件
/WEB-INF/log4j.xml
/WEB-INF/jforum-dwr.xml


-----------------------------------
2007-4-2
修改译文理解错误: 其订阅主题,不包含回复通知,回复通知在个人资料设置里设置,或在发贴子时设置
修改文件
 /WEB-INF/config/languages/language_zh_CN.properties
 /WEB-INF/config/languages/language_zh_CN.text

-----------------------------------
2007-4-4
修改不能显示带附件的主题提示信息.
修改文件: /WEB-INF/config/database/generic/generic_queries.sql

-----------------------------------
2007-4-5
修正邮件回复通知时乱码问题
修改文件 /tempates/mail/zh_CN/mailNewReplay.txt

-----------------------------------
2007-4-9
修改附件下载限制设置上的问题
修改文件
/WEB-INF/config/permissions_zh_CN.xml
/WEB-INF/config/languages/language_zh_CN.properties
/WEB-INF/config/languages/language_zh_CN.txt

------------------------------------
2007-4-18
修改后台封锁设置把"会员名称"改为"会员ID"
修改文件
/WEB-INF/config/languages/language_zh_CN.properties
/WEB-INF/config/languages/language_zh_CN.txt


-------------------------------------
2007-4-23
增加AJAX阅读(同时增加trydone.com的源代码)
增加媒体UBB代码 (SWF/MP3/MP/RM)
增加源代码语法高亮 (dp.
把trydone.com模板加入到jforum的源码中
修改封锁设置汉化

--------------------------------------
2007-4-24
增加log4j com.trydone 配置
增加commons-logging-1.1.jar
增加 commons-logging.properties 主要把dwr的log配置转到log4j中来



19:35 2007-5-16
--------------------------------------
更正
[quote](2007-05-16 18:25:47)   Silver(50833)
同时点两forum的预览的话，第一个的结果就跑去第二个那 [/quote]

主要更新文件:
/templates/trydone/forum_show.htm
/templates/trydone/forum_list.htm
/templates/trydone/recent_thread.htm

更新连接,使用JForum默认连接
/trydone_src/com/trydone/forum/action/ajax/PostAjaxAction.java

2007-5-30
更正主页(版块列表页)点"+"后提示出错
修改文件: /templates/trydone/forum_list.htm

final
今后最近更新,请查看SVN修改日志及论坛发表的贴子,不在此文件中列表!