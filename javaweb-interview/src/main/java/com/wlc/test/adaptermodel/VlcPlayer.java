package com.wlc.test.adaptermodel;

/**
 * @author 王立朝
 * @date 2020-7-20
 * @description:
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("播放VLC 类型  " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
