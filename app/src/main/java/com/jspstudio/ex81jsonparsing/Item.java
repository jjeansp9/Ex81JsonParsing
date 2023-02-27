package com.jspstudio.ex81jsonparsing;

public class Item {
    int no;
    String name;
    Address addr;

    public Item(int no, String name, Address addr) {
        this.no = no;
        this.name = name;
        this.addr = addr;
    }

}

class Address{
    String nation;
    String city;

    public Address(String nation, String city) {
        this.nation = nation;
        this.city = city;
    }

}
