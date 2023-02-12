package modelbaseddevelopment.auction.subscriber;

import modelbaseddevelopment.auction.subject.Subject;

public interface Subscriber {
    void update(Subject subject);
}
