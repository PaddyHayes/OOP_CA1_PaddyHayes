package assessment;

import javax.swing.*;

public class Album {

    private String name;
    private Song tracks;
    private String producer;
    private int releaseYear;

    public Album(String name, Song tracks, String producer, int releaseYear) {
        this.name = name;
        this.tracks = tracks;
        this.producer = producer;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == " ")
        this.name = "No name specified";
        else
        this.name = name;
    }

    public Song getTracks() {
        return tracks;
    }

    public void setTracks(Song tracks) {
        this.tracks = tracks;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    /*public int getNumberOfTracks(){
        return;
    }*/

    public int getPlayingTime(int playingTime){
        return playingTime;
    }

    public void playTrack(int tracks){
        if(tracks >= 0 || tracks <=4)
            JOptionPane.showMessageDialog(null, "The track is now playing");
        else
            JOptionPane.showMessageDialog(null, "An invaled track number was supplied!");

    }

    public int get(int numberOfTracks){
        return numberOfTracks;
    }

    //public void Shuffle()




    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", tracks=" + tracks +
                ", producer='" + producer + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
