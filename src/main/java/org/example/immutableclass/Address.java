package org.example.immutableclass;

public final class Address {
    private final String city;
    private final String state;
    private final int pinCode;

    public Address(String city, String state, int pinCode){

        this.city = city;
        this.state = state;
        this.pinCode= pinCode;
    }

    public String getCity(){
        return city;
    }

    public String getState(){
        return state;
    }
    public int getPinCode(){
        return pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
