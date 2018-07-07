package com.zhongba.swagger2.bean;

public class JsonResult {
    private String status = null;
    private Object result = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public static JsonResult ok(Object object){
        JsonResult result = new JsonResult();
        result.setStatus("ok");
        result.setResult(object);
        return result;
    }

    public static JsonResult error(Object object){
        JsonResult result = new JsonResult();
        result.setStatus("error");
        result.setResult(object);
        return result;
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "status='" + status + '\'' +
                ", result=" + result +
                '}';
    }
}
