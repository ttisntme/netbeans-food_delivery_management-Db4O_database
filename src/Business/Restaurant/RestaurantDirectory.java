/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    private ArrayList<Restaurant> restaurantList;

    public RestaurantDirectory() {
        this.restaurantList = new ArrayList<>();
        
    }
    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }
    
    public Restaurant createRestaurant(String name){
        Restaurant restaurant = new Restaurant();
        restaurant.setName(name);
        restaurantList.add(restaurant);
        return restaurant;
    }
    
    public Restaurant getRestaurantById(int id) {
        for(Restaurant r : restaurantList) {
            if(id == r.getId()) {
                return r;
            }
        }
        return null;
    }
    
    
    public boolean deleteRestaurantById(int id) {
        for(Restaurant c : restaurantList) {
            if(c.getId() == id) {
                restaurantList.remove(c);
                return true;
            }
        }
        return false;
    }
}
