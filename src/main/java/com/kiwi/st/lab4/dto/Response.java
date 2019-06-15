package com.kiwi.st.lab4.dto;

public class Response {

    private Boolean status;
    private String code;

    public Response() {
    }

    public Response(Boolean status, String code) {
        this.status = status;
        this.code = code;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
