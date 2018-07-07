# swagger2

参见：https://blog.csdn.net/saytime/article/details/74937664

但是在api上面添加Swagger的注解ApiOperation和ApiImplicitParam，弄脏api。看着有点乱。

五、Swagger注解
- swagger通过注解表明该接口会生成文档，包括接口名、请求方法、参数、返回信息的等等。

- @Api：修饰整个类，描述Controller的作用
- @ApiOperation：描述一个类的一个方法，或者说一个接口
- @ApiParam：单个参数描述
- @ApiModel：用对象来接收参数
- @ApiProperty：用对象接收参数时，描述对象的一个字段
- @ApiResponse：HTTP响应其中1个描述
- @ApiResponses：HTTP响应整体描述
- @ApiIgnore：使用该注解忽略这个API
- @ApiError ：发生错误返回的信息
- @ApiImplicitParam：一个请求参数
- @ApiImplicitParams：多个请求参数



![截图](https://github.com/shmp2005/swagger2/blob/master/%E6%A0%B7%E4%BE%8B%E6%88%AA%E5%9B%BE.png)