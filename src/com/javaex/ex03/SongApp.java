package com.javaex.ex03;

public class SongApp {
	public static void main(String[] args) {
		Song IU = new Song();
		
		IU.setTitle("좋은날");
		IU.setArtist("아이유");
		IU.setAlbum("Real");
		IU.setComposer("이민수");
		IU.setYear(2010);
		IU.setTrack(3);
		
		IU.showinfo();
		
		
		Song BIG = new Song("거짓말","BIGBANG","Always","G-DRGON",2007,2);
		
		BIG.setTitle("거짓말");
		BIG.setArtist("BIGBANG");
		BIG.setAlbum("Always");
		BIG.setComposer("G-DRGON");
		BIG.setYear(2007);
		BIG.setTrack(2);
		
		BIG.showinfo();
		
		Song bus = new Song();
		
		bus.setTitle("벚꽃엔딩");
		bus.setArtist("버스커버스커");
		bus.setAlbum("버스커버스커1집");
		bus.setComposer("장범준");
		bus.setYear(2012);
		bus.setTrack(4);
		
		bus.showinfo();
		
		
		
	}
}
