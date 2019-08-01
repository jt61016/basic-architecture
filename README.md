# basic-architecture
basic architecture
一个简单的JAVA后端框架，将不同的功能模块化，会不断增加一些基础框架功能，如工具类、异常处理、日志处理、常用第三方功能封装等。

## 项目结构说明

|模块             |说明                                  |
|-----------------|-------------------------------------|
|demo-boot        |启动模块                              |
|demo-common      |通用功能模块                           |
|demo-dal         |Data Access Layer 数据访问层模块       |
|demo-facade      |对外服务能力                           |
|demo-facade-api  |对外服务能力接口                        |
|demo-rpc         |Remote Procedure Call 调用第三方服务封装|
|demo-rpc-api     |Remote Procedure Call 调用第三方API封装|
|demo-service     |业务层                                |
|demo-service-api |业务层API                             |
|demo-web         |web层                                |

**需要注意的是，**

- demo-common模块作为基础功能可以被其他任何模块依赖。
- demo-rpc作为封装第三方服务的模块，会依赖很多第三方服务，不应该被其他模块所依赖，其他模块应该依赖的是demo-rpc-api。
- demo-facade层将本系统的功能封装后对外提供服务能力，外部系统应当只需要依赖demo-facade-api模块，屏蔽具体实现。
- 因此，demo-rpc-api和demo-facade-api两个模块的pom依赖应当尽可能简单、干净。