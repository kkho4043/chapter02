package com.javaex.ex03;

public class SongApp {
	public static void main(String[] args) {
		Song IU = new Song();
		
		IU.setTitle("������");
		IU.setArtist("������");
		IU.setAlbum("Real");
		IU.setComposer("�̹μ�");
		IU.setYear(2010);
		IU.setTrack(3);
		
		IU.showinfo();
		
		
		Song BIG = new Song("������","BIGBANG","Always","G-DRGON",2007,2);
		
		BIG.setTitle("������");
		BIG.setArtist("BIGBANG");
		BIG.setAlbum("Always");
		BIG.setComposer("G-DRGON");
		BIG.setYear(2007);
		BIG.setTrack(2);
		
		BIG.showinfo();
		
		Song bus = new Song();
		
		bus.setTitle("���ɿ���");
		bus.setArtist("����Ŀ����Ŀ");
		bus.setAlbum("����Ŀ����Ŀ1��");
		bus.setComposer("�����");
		bus.setYear(2012);
		bus.setTrack(4);
		
		bus.showinfo();
		
		
		
	}
}
