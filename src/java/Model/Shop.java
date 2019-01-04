/*
   This is the Shop Model.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author goulahyane
 */
public class Shop implements Serializable{
    
    //Attributes
    private int id;
    private String name;
    private int distance;
    private boolean liked;
    private boolean disliked;
    private String img;
    
    public Shop() { //Constructor
    }

    public Shop(int id, String name, int distance, boolean liked, boolean disliked, String img) { //Constructor
        this.id = id;
        this.name = name;
        this.distance = distance;
        this.liked = liked;
        this.disliked = disliked;
        this.img=img;
    }

    //Getters & Setters
    
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public boolean isDisliked() {
        return disliked;
    }

    public void setDisliked(boolean disliked) {
        this.disliked = disliked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    
}
