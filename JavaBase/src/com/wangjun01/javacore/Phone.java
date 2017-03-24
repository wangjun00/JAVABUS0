package com.wangjun01.javacore;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Phone {

	public void download() {
		System.out.println("可以下载音乐");
	}

	public String play() {
		String play = "播放下载的音乐！";
		return play;
	}

	public int storage() {
		int storage = '电';
		return storage;
	}

}
