package com.wlc.test.adaptermodel;

/**
 * @author 王立朝
 * @date 2020-7-20
 * @description:媒体播放器接口，
 */
public interface MediaPlayer {

    /**
     *只可以播放mp3
     * @param audioType 音频类型
     * @param fileName 文件名称
     */
    void play(String audioType,String fileName);
}
