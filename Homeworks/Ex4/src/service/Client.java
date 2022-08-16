package service;

import java.util.Objects;

public class Client extends Order {
    private String name;
    private int telephone;
    private String adress;

    public Client(String name, int telephone, String adress) {
        this.name = name;
        this.telephone = telephone;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Klient: " + name +
                ", numer telefonu=" + telephone +
                ", adres=" + adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Client client = (Client) o;
        return telephone == client.telephone && Objects.equals(name, client.name) && Objects.equals(adress, client.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, telephone, adress);
    }
}