public class House {
    public void display(){
        System.out.println("This is my house");
    }
}

class Room extends House {
    @Override
    public void display(){
        System.out.println("This is my room");
    }

    public static void main(String[] args){
        Car obj1 = new Car();
        obj1.display();
    }
}