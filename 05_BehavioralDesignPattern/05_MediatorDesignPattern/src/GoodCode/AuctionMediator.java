package GoodCode;

import GoodCode.CoreClasses.Bidder;

public interface AuctionMediator {
    void registerBidder(Bidder bidder);
    void placeBid(Bidder bidder, int amount);
}
