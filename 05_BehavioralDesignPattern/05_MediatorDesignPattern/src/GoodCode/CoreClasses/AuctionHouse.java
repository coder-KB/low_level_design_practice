package GoodCode.CoreClasses;

import GoodCode.AuctionMediator;

import java.util.ArrayList;
import java.util.List;

public class AuctionHouse implements AuctionMediator {
    private final List<Bidder> bidderList = new ArrayList<>();

    @Override
    public void registerBidder(Bidder bidder) {
        bidderList.add(bidder);
    }

    @Override
    public void placeBid(Bidder bidder, int amount) {
        System.out.println(bidder.getName() + " is placed a bid of " + amount);

        for(Bidder b: bidderList) {
            if(b != bidder) {
                b.receivedBid(bidder, amount);
            }
        }
    }
}
