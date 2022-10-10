package cn.bistu.main.service;

import cn.bistu.main.common.request.ExpertRequest;
import cn.bistu.main.domain.TExpertSim;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author lon
* @description 针对表【t_expert_sim】的数据库操作Service
* @createDate 2022-10-10 16:34:47
*/
public interface TExpertSimService extends IService<TExpertSim> {

    Object page(ExpertRequest expertRequest);
}
