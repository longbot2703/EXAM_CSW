package com.example.nguyenhoanglong.model;

public class BaseResponse <T>{
    public int status = 200;
    public String message = "success";
    public T data;
}
