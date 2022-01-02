package com.ProjeB.WeatherAPI.Entities;


import javax.persistence.*;

@Entity
@Table(name="cities")
public class Cities {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @Column(name="city_name")
    private String city_name;

    public Cities(String city_name) {
        this.city_name = city_name;
    }

    public Cities() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }
}
