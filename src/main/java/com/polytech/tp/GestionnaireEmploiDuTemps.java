package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps implements Subject {

    private List<ICours> listeCours = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    public void ajouterCours(ICours cours) {
        this.listeCours.add(cours);
        notifyObservers(cours.getDescription());
    }

    public void modifierCours(ICours cours, String message) {
        notifyObservers(message);   // 🔥 correction
    }

    public void setChangement(String changement) {
        notifyObservers(changement);  // 🔥 correction
    }
}
