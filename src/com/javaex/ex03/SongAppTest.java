package com.javaex.ex03;

public class SongAppTest {
	public static void main(String[] args) {
		ong[] ong = new ong[3];

		ong[0].setTitle("������");
		ong[0].setArtist("������");
		ong[0].setAlbum("Real");
		ong[0].setComposer("�̹μ�");
		ong[0].setYear(2010);
		ong[0].setTrack(3);

		ong[0].showinfo();

		ong[1].setTitle("������");
		ong[1].setArtist("BIGBANG");
		ong[1].setAlbum("Always");
		ong[1].setComposer("G-DRGON");
		ong[1].setYear(2007);
		ong[1].setTrack(2);

		ong[1].showinfo();

		ong[2].setTitle("���ɿ���");
		ong[2].setArtist("����Ŀ����Ŀ");
		ong[2].setAlbum("����Ŀ����Ŀ1��");
		ong[2].setComposer("�����");
		ong[2].setYear(2012);
		ong[2].setTrack(4);

		ong[2].showinfo();

	}
}
