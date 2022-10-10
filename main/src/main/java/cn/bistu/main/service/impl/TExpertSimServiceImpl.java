package cn.bistu.main.service.impl;

import cn.bistu.main.common.request.ExpertRequest;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import cn.bistu.main.domain.TExpertSim;
import cn.bistu.main.service.TExpertSimService;
import cn.bistu.main.mapper.TExpertSimMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author lon
* @description 针对表【t_expert_sim】的数据库操作Service实现
* @createDate 2022-10-10 16:34:47
*/
@Service
public class TExpertSimServiceImpl extends ServiceImpl<TExpertSimMapper, TExpertSim>
implements TExpertSimService{


    @Override
    public Object page(ExpertRequest expertRequest) {

        String name = expertRequest.getName();
        String research = expertRequest.getResearch();
        return null;
    }
}
