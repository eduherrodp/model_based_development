package modelbaseddevelopment.auction.subject;

import modelbaseddevelopment.auction.subscriber.Tenderer;

public interface Subject {
    void registerTenderer(Tenderer t);
    void removeTenderer(Tenderer t);
    void notifyTenderers();

}
