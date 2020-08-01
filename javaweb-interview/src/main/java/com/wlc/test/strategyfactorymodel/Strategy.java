package com.wlc.test.strategyfactorymodel;

/**
 * @author 王立朝
 * @date 2020-7-18
 * @description:
 */
public interface Strategy {

    /**
     * 计算
     * @param money
     * @return
     */
    double computer(double money);

    /**
     * 返回Type
     * @return
     */
    int getType();
}
