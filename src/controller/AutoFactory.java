package controller;

import Model.Auto;

import java.util.ArrayList;
import java.util.List;

public class AutoFactory {
    private List<Auto> autos = new ArrayList<>();
    private static int id = 1;

    public void addAuto(String brand, String model, double price_basic) {
        Auto a = new Auto(id, brand, model, price_basic);
        autos.add(a);
        id++;
    }

    public void getAllAuto() {
        for (Auto auto : autos) {
            System.out.println(auto);
        }
    }

    public void getEqipment(int id_selected, String eq_name, double eq_price) {
        if (searchByld(id_selected) != null) {
            System.out.println("Dodano wyposażenie dodatkowe");
        } else {
            System.out.println("Nie znaleziono auta o id=" + id_selected);
        }
    }

    public void deleteAutoById(int id_selected) {
        if (searchByld(id_selected) != null) {
            autos.remove(searchByld(id_selected));
        } else {
            System.out.println("NIe znaleziono o id=" + id_selected);
        }
    }

    public Auto searchByld(int id_seleced) {
        for (Auto auto : autos) {
            if (auto.getId() == id_seleced) {
                return auto;
            }
        }
        return null;
    }
}

