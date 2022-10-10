package cn.bistu.main.service;

import cn.bistu.main.domain.TLabelSim;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author lon
* @description 针对表【t_label_sim】的数据库操作Service
* @createDate 2022-10-10 16:01:29
*/
public interface TLabelSimService extends IService<TLabelSim> {

    Object page();
}
