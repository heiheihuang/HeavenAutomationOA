# HeavenAutomation OA system
天庭自动化OA管理系统

## 需求 
* 基于天宫财产管理，物联网管理各类天兵、神器、蟠桃树等财产； 
* 基于天宫人力管理，分级别管理天兵天将以及各部门之间沟通；
* 基于天宫军部人员管理； 

## 系统设计【产品架构】
##### 后端模块设计
1. 数据操作模块 √
2. 服务治理模块 √
3. 日志处理模块
4. 接口调用模块 √
5. solr数据搜索模块
6. 权限认证模块

##### 业务模块设计
1. 人员档案信息构建模块
2. 数据调度模块
3. 预警业务模块
4. 批量核查业务模块

##### 前端模块设计：
1. 外国人人员档案信息展示
2. 核查业务模块功能
3. 预警数量信息展示
4. 日志信息展示
5. 外部数据信息查询展示

## 技术框架
* spring-boot
* spring-cloud
* fegin
* mybaits-plus[待集成][多数据源处理]
* OAuth认证[token]
* redis
* solr
* quartz
* Eureka[注册中心]
* gateway[API路由管理][网关]
