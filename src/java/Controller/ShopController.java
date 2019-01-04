/*
  Shop Controller
  Here i create tow lists one to store the shops generally, and the second to store shosed/liked stores.
    
 */
package Controller;

import Model.Shop;
import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author goulahyane
 */
@Named("shopController")
@SessionScoped
public class ShopController implements Serializable {

    ArrayList<Shop> shops;  // Shops list.
    ArrayList<Shop> likedshops = new ArrayList<>(); // Liked shops list.

    //Getters & Setters.
    public ArrayList<Shop> getShops() {
        return shops;
    }

    public void setShops(ArrayList<Shop> shops) {
        this.shops = shops;
    }

    public ArrayList<Shop> getLikedshops() {
        return likedshops;
    }

    public void setLikedshops(ArrayList<Shop> likedshops) {
        this.likedshops = likedshops;
    }

    // This method help out to initialise Random shops, (random names, images, and distance).
    public ArrayList<Shop> initshops() {
        shops = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            shops.add(new Shop(i, "shop_" + (i + 1), (int) (20.6 * i + 1), false, false, i + ".jpg"));
        }
        return shops;
    }//initshops

    //This methos add the liked shop to the preferred shops list, by changing the boolean liked to true.
    public void liked(String id) {
        int idd = Integer.parseInt(id);
        Shop s = shops.get(idd);
        s.setLiked(true);
        if (!likedshops.contains(s)) {
            likedshops.add(s);
            shops.set(idd, s);
        }
    }//liked

    //This method remove the shops from the preferred shops by changing the attribute liked to False.
    public void remove(String id) {
        int idd = Integer.parseInt(id);
        Shop s = shops.get(idd);
        s.setLiked(false);
        likedshops.remove(s);
        shops.set(idd, s);
    }//remove

}
