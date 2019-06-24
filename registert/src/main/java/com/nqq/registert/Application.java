/**
 * Copyright (C), 2015-2019, 付临门有限公司
 * FileName: Application
 * Author:   user
 * Date:     2019/6/24 14:40
 * Description: 注册中心启动类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.nqq.registert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈注册中心启动类〉
 *
 * @author user
 * @create 2019/6/24
 * @since 1.0.0
 */
@SpringBootApplication
@EnableConfigServer
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
