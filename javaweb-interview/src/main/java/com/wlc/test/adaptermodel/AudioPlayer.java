package com.wlc.test.adaptermodel;

/**
 * @author 王立朝
 * @date 2020-7-20
 * @description: 音频播放器接口，实现了 MediaPlayer
 */
public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;


    /**
     * 只可以播放mp3
     *
     * @param audioType 音频类型
     * @param fileName  文件名称
     */
    @Override
    public void play(String audioType, String fileName) {
          if(audioType.equalsIgnoreCase("mp3")){
              System.out.println("播放Mp3 类型 : " +fileName);
          }else if(audioType.equalsIgnoreCase("vlc")
          || audioType.equalsIgnoreCase("mp4")){
             mediaAdapter= new MediaAdapter(audioType);
             mediaAdapter.play(audioType,fileName);
          }else{
              System.out.println("暂时不支持该类型的文件");
          }
    }
}
