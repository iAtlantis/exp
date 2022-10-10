package cn.bistu.main.service.impl;

import cn.bistu.main.domain.TLabelSim;
import cn.bistu.main.service.TLabelSimService;
import cn.bistu.main.mapper.TLabelSimMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* @author lon
* @description 针对表【t_label_sim】的数据库操作Service实现
* @createDate 2022-10-10 16:01:29
*/
@Service
public class TLabelSimServiceImpl extends ServiceImpl<TLabelSimMapper, TLabelSim>
implements TLabelSimService{

    @Override
    public Object page() {
        return null;
    }
}
