package cn.bistu.main.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.bistu.main.domain.ExpertInformation;
import cn.bistu.main.service.ExpertInformationService;
import cn.bistu.main.mapper.ExpertInformationMapper;
import org.springframework.stereotype.Service;

/**
* @author lon
* @description 针对表【expert_information】的数据库操作Service实现
* @createDate 2022-10-10 15:29:38
*/
@Service
public class ExpertInformationServiceImpl extends ServiceImpl<ExpertInformationMapper, ExpertInformation>
implements ExpertInformationService{

}
