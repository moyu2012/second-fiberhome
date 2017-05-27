# second-fiberhome
本demo主要作为spring cloud的学习，用以熟悉spring cloud整体框架，同时，结合docker进行服务发布。
--------------------------------------------------------------------------------------------

second-fiberhome作为maven工程父类工程，基于spring boot的其他子类工程在其工程下。
second-config：用以配置文件服务器server
second-fiberhome-repo：配置文件夹
second-config-client:作为client，访问配置文件服务器server

second-consul-server-1:consul服务server1，为client提供服务
second-consul-server-2:consul服务server2，为client提供服务
second-consul-client:consul服务cleint，用以通过consul访问server1（2）



--------------------------------------------------------------------------------------------