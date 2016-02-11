package client;

public class Client {
    private static int countId =0;
    private String name;
    private String address;
    private int id;

    public Client(String name, String address) {
        ++countId;
        id = countId;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }
}
