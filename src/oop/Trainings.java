package oop;

public class Trainings {
    private String nameTraning;
    private String kategory;
    private int numberUsers;
    private String date;
    private String trainer;

    public Trainings(String nameTraning, String kategory, int numberUsers, String date, String trainer) {
        this.nameTraning = nameTraning;
        this.kategory = kategory;
        this.numberUsers = numberUsers;
        this.date = date;
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return "Trainings{" +
                "nameTraning='" + nameTraning + '\'' +
                ", kategory='" + kategory + '\'' +
                ", numberUsers=" + numberUsers +
                ", date='" + date + '\'' +
                ", trainer='" + trainer + '\'' +
                '}';
    }

    public String getNameTraning() {
        return nameTraning;
    }

    public void setNameTraning(String nameTraning) {
        this.nameTraning = nameTraning;
    }

    public String getKategory() {
        return kategory;
    }

    public void setKategory(String kategory) {
        this.kategory = kategory;
    }

    public int getNumberUsers() {
        return numberUsers;
    }

    public void setNumberUsers(int numberUsers) {
        this.numberUsers = numberUsers;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }
}
