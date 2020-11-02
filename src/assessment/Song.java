package assessment;

public class Song {

private int trackID;
private int trackNumber;
private String title;
private String artist;
private String genre;
private int duration;
private int releaseYear;


    public Song(String title, String artist, String genre, int duration, int releaseYear) {
        this.trackID = trackID;
        this.trackNumber = trackNumber;
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.duration = duration;
        this.releaseYear = releaseYear;
    }


        public int getTrackID() {
            return trackID;
        }

        public void setTrackID(int trackID) {
            this.trackID = trackID;
        }

        public int getTrackNumber() {
            return trackNumber;
        }

        public void setTrackNumber(int trackNumber) {
            this.trackNumber = trackNumber;
        }

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

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public int getReleaseYear() {
            return releaseYear;
        }

        public void setReleaseYear(int releaseYear) {
            this.releaseYear = releaseYear;
        }

    @Override
    public String toString() {
        return "Song{" +
                "trackID=" + trackID +
                ", trackNumber=" + trackNumber +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", duration=" + duration +
                ", releaseYear=" + releaseYear +
                '}';
    }
}

