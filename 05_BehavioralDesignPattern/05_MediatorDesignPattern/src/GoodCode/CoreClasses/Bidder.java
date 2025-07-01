package GoodCode.CoreClasses;

import GoodCode.AuctionMediator;

public class Bidder {
    String name;
    AuctionMediator auctionMediator;

    public Bidder(String name, AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
    }

    public String getName() {
        return name;
    }

    public void receivedBid(Bidder bidder, int amount) {
        System.out.println(this.name + " is notified: " + bidder.getName() + " has placed a bid of " + amount);
    }
}
