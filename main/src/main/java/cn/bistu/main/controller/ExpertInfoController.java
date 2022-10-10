package cn.bistu.main.controller;

import cn.bistu.main.common.Result;
import cn.bistu.main.common.request.ExpertRequest;
import cn.bistu.main.domain.ExpertInformation;
import cn.bistu.main.domain.TLabelSim;
import cn.bistu.main.service.ExpertInformationService;
import cn.bistu.main.service.TExpertSimService;
import cn.bistu.main.service.TLabelSimService;
import cn.bistu.main.service.impl.ExpertInformationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/expert")
public class ExpertInfoController {

    @Autowired
    TExpertSimService tExpertSimService;

    // 实现模糊分页查询
    @GetMapping("/page")
    public Result page(ExpertRequest expertRequest){
        tExpertSimService.page(expertRequest);
        return Result.success();
    }

}
