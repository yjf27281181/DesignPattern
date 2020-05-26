package edu.csu.prototype;

/**
 * @author yanjuefei
 * @date 2020/5/24 0024
 * @Description
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("Yjf", new Location("111 w 22nd st", 1));

        Person clonePerson = (Person) person.clone();

        System.out.println(clonePerson);

        System.out.println(person.location == clonePerson.location);

        clonePerson.location = (Location) person.location.clone();

        System.out.println(person.location == clonePerson.location);
    }
}

class Person implements Cloneable {
    String name;
    Location location;

    public Person(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", location=" + location +
                '}';
    }
}

class Location implements Cloneable {
    String address;
    int num;

    public Location(String address, int num) {
        this.address = address;
        this.num = num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Location{" +
                "address='" + address + '\'' +
                ", num=" + num +
                '}';
    }
}