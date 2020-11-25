package com.javaex.ex03;

public class SongAppTest {
	public static void main(String[] args) {
		ong[] ong = new ong[3];

		ong[0].setTitle("좋은날");
		ong[0].setArtist("아이유");
		ong[0].setAlbum("Real");
		ong[0].setComposer("이민수");
		ong[0].setYear(2010);
		ong[0].setTrack(3);

		ong[0].showinfo();

		ong[1].setTitle("거짓말");
		ong[1].setArtist("BIGBANG");
		ong[1].setAlbum("Always");
		ong[1].setComposer("G-DRGON");
		ong[1].setYear(2007);
		ong[1].setTrack(2);

		ong[1].showinfo();

		ong[2].setTitle("벚꽃엔딩");
		ong[2].setArtist("버스커버스커");
		ong[2].setAlbum("버스커버스커1집");
		ong[2].setComposer("장범준");
		ong[2].setYear(2012);
		ong[2].setTrack(4);

		ong[2].showinfo();

	}
}
