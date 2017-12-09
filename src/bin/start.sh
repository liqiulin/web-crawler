#!/bin/sh
echo -------------------------------------------
echo start server
echo -------------------------------------------
# 设置项目代码路径
export CODE_HOME="/usr/getd/app/test/web-crawler"
#日志路径
export LOG_PATH="$CODE_HOME/log"
mkdir -p $LOG_PATH
# 设置依赖路径
export CLASSPATH="$CODE_HOME/classes:$CODE_HOME/lib/*"
# java可执行文件位置
export _EXECJAVA="/usr/getd/jdk/jdk1.8.0_151/bin/java"
# JVM启动参数
export JAVA_OPTS="-server -Xms512m -Xmx512m -verbose:gc -Xloggc:$LOG_PATHE/gc.log -XX:+PrintGCDetails -XX:+PrintGCTimeStamps"
# 启动类
export MAIN_CLASS=com.thzj.webcrawler.App

$_EXECJAVA $JAVA_OPTS -classpath $CLASSPATH $MAIN_CLASS &
tail -f $LOG_PATH/stdout.log