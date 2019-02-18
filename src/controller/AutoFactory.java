package controller;

import Model.Auto;

import java.util.ArrayList;
import java.util.List;

public class AutoFactory {
    private List<Auto> autos = new ArrayList<>();

    public void addAuto(String brand, String model, double price_basic) {
        Auto a = new Auto(brand, model, price_basic);
        autos.add(a);
    }

    public void getAllAuto() {
        for (Auto auto : autos) {
            System.out.println(auto);
        }
    }
    public List<Auto>getAutosList(){
        return autos;
    }
}
