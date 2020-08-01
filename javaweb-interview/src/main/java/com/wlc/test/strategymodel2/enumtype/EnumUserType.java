package com.wlc.test.strategymodel2.enumtype;

/**
 * @author 王立朝
 * @date 2020-7-18
 * @description:
 */
public enum EnumUserType {

    SILVER_VIP(1,"白银会员"),
    PLATINUM_VIP(2,"白金会员"),
    GOLD_VIP(3,"黄金会员"),
    NOMAL_VIP(4,"普通会员");

    private int code;
    private String name;
    private EnumUserType(int code,String name) {
        this.code = code;
        this.name = name();
    }

    public int getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public void setName(String name) {
        this.name = name;
    }


}
