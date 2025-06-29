package BDP_05_MediatorDesignPattern.src.GoodCode;

import BDP_05_MediatorDesignPattern.src.GoodCode.CoreClasses.AuctionHouse;
import BDP_05_MediatorDesignPattern.src.GoodCode.CoreClasses.Bidder;

public class AuctionMediatorDemo {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new AuctionHouse();

        Bidder bidder1 = new Bidder("Alice", auctionMediator);
        Bidder bidder2 = new Bidder("Bob", auctionMediator);
        Bidder bidder3 = new Bidder("Coder", auctionMediator);

        auctionMediator.registerBidder(bidder1);
        auctionMediator.registerBidder(bidder2);
        auctionMediator.registerBidder(bidder3);

        auctionMediator.placeBid(bidder1, 10);
        auctionMediator.placeBid(bidder2, 20);
        auctionMediator.placeBid(bidder3, 30);
    }
}
