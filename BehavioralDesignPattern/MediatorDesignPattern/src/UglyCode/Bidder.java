package MediatorDesignPattern.src.UglyCode;

public class Bidder {
    String name;
    int bid;

    public Bidder(String name) {
        this.name = name;
    }

    public void placeBid(int amount, Bidder[] bidders) {
        this.bid = amount;
        System.out.println(name + " is placed a bid of " + amount);
        for(Bidder bidder: bidders) {
            if(this != bidder) {
                bidder.receivedBid(this, amount);
            }
        }
    }

    private void receivedBid(Bidder bidder, int amount) {
        System.out.println(this.name + " is notified: " + bidder.name + " placed a bit of " + amount);
    }
}
