package com.javaex.ex06;

public class Song {
	// 필드 6개
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	// 겟셋
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

	// 생성자 0
	public Song(String title, String artist, String album, String composer, String year, int track) {
		this(title,track);
		
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		System.out.println("생성자(6)");
		
	}
	public Song() {
		
	}
	// 생성자 6

	// 생성자2 : 타이틀 아티스트
	/*
	 * public Song(String title , String artist) { this.title = title; this.artist =
	 * artist; }
	 */
	// 생성자2 : 타이틀 작곡자
	
	
	public void song(String title , String composer) { 
		this.title = title;
		this.composer = composer; 
	 }
	 
	// 생성자2 : 타이틀 트렉번호
	public Song(String title , int track) {
		this.title = title;
		
		if(track < 5) {
			this.track = 0;
		}else
			this.track = track;
		
		System.out.println("생성자(2)");
	}
	

	// 메소드 show
	public void showInfo() {
		System.out.println(artist + "," + title + "(" + album + "," + track + "번track" + composer + "작곡" );
		
		
	}
	// toString

	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
}
