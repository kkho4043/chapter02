package com.javaex.ex06;

public class SongApp {
	public static void main(String[] args) {
		Song so1 = new Song();
		
		so1.setTitle("좋은날");
		so1.setArtist("아이유");
		so1.setAlbum("Real");
		so1.setComposer("이민수");
		so1.setYear("2010");
		so1.setTrack(3);
		so1.showInfo();
		
		so1.toString();
		
		Song so2 = new Song("거짓말" , "BIGBANG" , "Always" , "G-DRAGON" ,"2007" , 3);
		so2.showInfo();
		
		Song so3 = new Song("벚꽃엔딩",4);
		so3.setArtist("버스커버스커");
		so3.setAlbum("버스커버스커 1집");
		so3.setComposer("장범준");
		so3.setYear("2012");
		so3.showInfo();
	}
}
