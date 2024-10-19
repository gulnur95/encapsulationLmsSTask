import java.time.LocalDate;

public class Car {
    /*
    University, School, Car жана Person деген класс тузунуз.  Алардын свойстваларын ойлоп табыныз
     Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек  Ар бир класска 3-4 тон объект тузуп жана
     аларга маанилерин бериниз Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз
     */
    private String brand;
    private String color;
    private long price;
    private LocalDate date;

    public Car(){}

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public long getPrice(){
        return price;
    }
    public void setPrice(long price){
        this.price = price;
    }
    public LocalDate getDate(){
        return date;
    }
    public void setDate(LocalDate date){
        this.date = date;
    }

    @Override
    public String toString() {
        return "Car" +
                " brand: " + brand +
                ",    color: " + color +
                ",    price: " + price +
                ",    date of production: " + date ;
    }
}
