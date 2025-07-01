package UglyCode;

public class AuctionTraditionalDemo {
    public static void main(String[] args) {
        Bidder bidder1 = new Bidder("Alice");
        Bidder bidder2 = new Bidder("Bob");
        Bidder bidder3 = new Bidder("Coder");

        Bidder[] bidders = {bidder1, bidder2, bidder3};

        bidder1.placeBid(10, bidders);
        bidder2.placeBid(20, bidders);
        bidder3.placeBid(30, bidders);
    }
}
