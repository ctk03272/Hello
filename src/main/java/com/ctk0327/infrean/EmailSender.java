package com.ctk0327.infrean;

public class EmailSender {
    String id;
    String address;

    public EmailSender(String id, String address) {
        this.id = id;
        this.address = address;
    }

    public void setAddress(String address,String id) {
        this.id=id;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
