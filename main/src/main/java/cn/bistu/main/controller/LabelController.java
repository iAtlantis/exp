package cn.bistu.main.controller;


import cn.bistu.main.common.Result;
import cn.bistu.main.domain.TLabelSim;
import cn.bistu.main.service.TLabelSimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/label")
public class LabelController {
    @Autowired
    TLabelSimService tLabelSimService;


    @GetMapping("/list")
    public Result listExperts(){
        List<TLabelSim> tLabelSims = tLabelSimService.list();
        return Result.success(tLabelSims);
    }
}
