规律：
    配置web相关的配置项时，要注意加上@Bean；
    没有接口可实现；
    返回值的命名规则记忆---> 相关技术名+RegistrationBean

    配置SpringMVC相关的配置项时，不需要加上@Bean；
    只需要实现WebMvcConfigurer接口，实现对应的方法即可。
