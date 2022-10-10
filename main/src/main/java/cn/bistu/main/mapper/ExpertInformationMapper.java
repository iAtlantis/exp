package cn.bistu.main.mapper;

import cn.bistu.main.domain.ExpertInformation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author lon
* @description 针对表【expert_information】的数据库操作Mapper
* @createDate 2022-10-10 15:29:38
* @Entity cn.bistu.main.domain.ExpertInformation
*/
@Mapper
public interface ExpertInformationMapper extends BaseMapper<ExpertInformation> {


}
