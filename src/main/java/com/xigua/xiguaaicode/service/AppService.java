package com.xigua.xiguaaicode.service;

import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.xigua.xiguaaicode.model.dto.app.AppQueryRequest;
import com.xigua.xiguaaicode.model.entity.App;
import com.xigua.xiguaaicode.model.entity.User;
import com.xigua.xiguaaicode.model.vo.AppVO;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * 应用 服务层。
 *
 * @author <a href="https://github.com/apian-1">程序员西瓜</a>
 */
public interface AppService extends IService<App> {

    /**
     * 通过对话生成应用代码
     *
     * @param appId     应用ID
     * @param message   提示词
     * @param loginUser 登录用户信息
     * @return
     */
    Flux<String> chatToGenCode(Long appId, String message, User loginUser);

    /**
     * 应用部署
     *
     * @param appId 应用 ID
     * @param loginUser 登录用户
     * @return  可访问的部署地址
     */
    String deployApp(Long appId, User loginUser);

    /**
     * 获取应用封装类
     * @param app
     * @return
     */
    AppVO getAppVO(App app);

    /**
     * 获取应用封装列表
     * @param appList
     * @return
     */
    List<AppVO> getAppVOList(List<App> appList);

    /**
     * 构造应用查询条件
     * @param appQueryRequest
     * @return
     */
    public QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);



}
