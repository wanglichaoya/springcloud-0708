package com.wlc.test.adaptermodel;

/**
 * @author 王立朝
 * @date 2020-7-20
 * @description:
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放MP4类型 "+fileName );
    }
}
