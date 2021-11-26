package hellojpa;

import javax.persistence.Entity;

@Entity
public class Album extends Item {

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    private String artist;
}
