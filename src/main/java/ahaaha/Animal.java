package ahaaha;

public class Animal {
    String specie;
    int age;
    long hairCount;
    boolean isAlive;
    char gender;
    public void speak(){
        specie="krokodyl";
        System.out.println("usiek " + specie);
    }

    public void feed(String food){
        System.out.println("jem sobie " + food);

    }

    public void feed(String food,int amount){
        System.out.println("jem sobie "+ amount + " " + food);

    }




}
