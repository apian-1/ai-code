package com.xigua.xiguaaicode.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.xigua.xiguaaicode.model.entity.App;
import com.xigua.xiguaaicode.mapper.AppMapper;
import com.xigua.xiguaaicode.service.AppService;
import org.springframework.stereotype.Service;

/**
 * 应用 服务层实现。
 *
 * @author <a href="https://github.com/apian-1">程序员西瓜</a>
 */
@Service
public class AppServiceImpl extends ServiceImpl<AppMapper, App>  implements AppService{

}
