package com.javaex.ex06;

public class Song {
	// �ʵ� 6��
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	// �ټ�
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	// ������ 0
	public Song(String title, String artist, String album, String composer, String year, int track) {
		this(title,track);
		
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		System.out.println("������(6)");
		
	}
	public Song() {
		
	}
	// ������ 6

	// ������2 : Ÿ��Ʋ ��Ƽ��Ʈ
	/*
	 * public Song(String title , String artist) { this.title = title; this.artist =
	 * artist; }
	 */
	// ������2 : Ÿ��Ʋ �۰���
	
	
	public void song(String title , String composer) { 
		this.title = title;
		this.composer = composer; 
	 }
	 
	// ������2 : Ÿ��Ʋ Ʈ����ȣ
	public Song(String title , int track) {
		this.title = title;
		
		if(track < 5) {
			this.track = 0;
		}else
			this.track = track;
		
		System.out.println("������(2)");
	}
	

	// �޼ҵ� show
	public void showInfo() {
		System.out.println(artist + "," + title + "(" + album + "," + track + "��track" + composer + "�۰�" );
		
		
	}
	// toString

	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
}
