/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    private ArrayList<DeliveryMan> deliveryManList;

    public DeliveryManDirectory() {
        this.deliveryManList = new ArrayList<>();
        
    }

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }
    
    
    public DeliveryMan createDeliveryMan(String name){
        DeliveryMan dm = new DeliveryMan();
        dm.setName(name);
        deliveryManList.add(dm);
        return dm;
    }
    public DeliveryMan getDeliveryManByName(String name) {
        for(DeliveryMan dm : deliveryManList) {
            if(dm.getName().equals(name)) {
                return dm;
            }
        }
        return null;
    }
    public DeliveryMan getDeliveryManById(int id) {
        for(DeliveryMan dm : deliveryManList) {
            if(dm.getId() == id) {
                return dm;
            }
        }
        return null;
    }
    
    public boolean deleteDeliveryManById(int id) {
        for(DeliveryMan c : deliveryManList) {
            if(c.getId() == id) {
                deliveryManList.remove(c);
                return true;
            }
        }
        return false;
    }
}
