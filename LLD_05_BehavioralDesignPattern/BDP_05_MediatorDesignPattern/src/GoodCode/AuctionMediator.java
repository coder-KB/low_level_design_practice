package BDP_05_MediatorDesignPattern.src.GoodCode;

import BDP_05_MediatorDesignPattern.src.GoodCode.CoreClasses.Bidder;

public interface AuctionMediator {
    void registerBidder(Bidder bidder);
    void placeBid(Bidder bidder, int amount);
}
