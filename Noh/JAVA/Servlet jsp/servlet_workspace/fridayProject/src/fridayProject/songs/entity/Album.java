package fridayProject.songs.entity;

public class Album {
	String artistName;
	String albumName;
	int track;
	String title;
	
	public Album() {
		// TODO Auto-generated constructor stub
	}
	
	public Album(String artistName, String albumName, int track, String title) {
		super();
		this.artistName = artistName;
		this.albumName = albumName;
		this.track = track;
		this.title = title;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
