package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private Long id;
    private String brand;
    private int series;

    public Car() {
    }

    public Car(Long id, String brand, int series) {
        this.id = id;
        this.brand = brand;
        this.series = series;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", series=" + series +
                '}';
    }
}
