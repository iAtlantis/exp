package cn.bistu.main.common.request;

import lombok.Data;

@Data
public class ExpertRequest extends BaseRequest{
    private String name;
    private String research;
}
