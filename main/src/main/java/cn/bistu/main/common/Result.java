package cn.bistu.main.common;

import lombok.Data;

@Data
public class Result {
    private static final String SUCCESS_CODE="200";
    private static final String ERROR_CODE="-1";


    private String code;
    private Object data;
    private String msg;

    // 自定义封装成功返回空类
    public static Result success(){
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        return result;
    }

    // 自定义封装成功数据返回类
    public static Result success(Object data){
        Result result=new Result();
        result.setCode(SUCCESS_CODE);
        result.setData(data);
        return result;
    }

//    封装错误代码类
    public static Result error(String msg){
        Result result = new Result();
        result.setCode(ERROR_CODE);
        result.setMsg(msg);
        return result;
    }
}
