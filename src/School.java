import java.time.LocalDate;

public class School {
    private String name;
    private double square;
    private LocalDate date;

    public School(){}

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }



    public double getSquare(){
        return square;
    }
    public void setSquare(double square){
        this.square = square;
    }



    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "School" +
                " name: " + name +
                ",   square: " + square +
                ",   date of foundation: " + date ;
    }
}
