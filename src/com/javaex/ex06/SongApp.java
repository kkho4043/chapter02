package com.javaex.ex06;

public class SongApp {
	public static void main(String[] args) {
		Song so1 = new Song();
		
		so1.setTitle("������");
		so1.setArtist("������");
		so1.setAlbum("Real");
		so1.setComposer("�̹μ�");
		so1.setYear("2010");
		so1.setTrack(3);
		so1.showInfo();
		
		so1.toString();
		
		Song so2 = new Song("������" , "BIGBANG" , "Always" , "G-DRAGON" ,"2007" , 3);
		so2.showInfo();
		
		Song so3 = new Song("���ɿ���",4);
		so3.setArtist("����Ŀ����Ŀ");
		so3.setAlbum("����Ŀ����Ŀ 1��");
		so3.setComposer("�����");
		so3.setYear("2012");
		so3.showInfo();
	}
}
