package lesson11_Enums_toString;

import java.util.Arrays;

public class House {
    private String address;
    private Room[] rooms;
    private int floors;
    private double square;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public House(String address, Room[] rooms, int floors, double square) {
        this.address = address;
        this.rooms = rooms;
        this.floors = floors;
        this.square = square;
    }


    public void printInfo() {
        System.out.println("House{" +
                "address='" + address + '\'' +
                ", rooms=" + Arrays.toString(rooms) +
                ", floors=" + floors +
                ", square=" + square +
                '}');
    }
}
