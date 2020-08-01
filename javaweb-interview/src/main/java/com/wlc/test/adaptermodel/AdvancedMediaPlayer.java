package com.wlc.test.adaptermodel;

/**
 * @author 王立朝
 * @date 2020-7-20
 * @description: 高级音频播放器接口
 */
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);

    void playMp4(String fileName);
}
