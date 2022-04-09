
package day6;

public class Airplane {
   private String manufacturer;
   private int year, fuel, length, weight;

   public Airplane(String manufacturer, int length, int weight, int year) {
       this.manufacturer = manufacturer;
       this.length = length;
       this.weight = weight;
       this.year = year;
       this.fuel = 0;
   }

   // Сеттеры

   public void setManufacturer(String manufacturer) {this.manufacturer = manufacturer;}

   public void setLength(int length) {this.length = length;}

   public void setWeight(int weight) {this.weight = weight;}

   public void setYear(int year) {this.year = year;}

   public void setFuel(int fuel) {this.fuel = fuel;}

  // Геттеры
   public int getFuel() {return fuel;}

   //Методы
 public void info() {
       System.out.println("Изготовитель: " + manufacturer + ", Год производства: " + year + ", Длинна: " + length + ", Вес: " + weight + ", Кол-во топлива: " + fuel);
   }
   public void fillUp(int input) {
    fuel += input;
   }
}
