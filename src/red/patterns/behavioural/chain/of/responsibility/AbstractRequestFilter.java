package red.patterns.behavioural.chain.of.responsibility;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public abstract class AbstractRequestFilter implements RequestFilter {
    protected RequestFilter next = new RequestFilterProxy();

    public AbstractRequestFilter() {}

    public AbstractRequestFilter(RequestFilter next) {
        this.next = next;
    }

    public RequestFilter getNext() {
        return next;
    }

    public void setNext(RequestFilter next) {
        this.next = next;
    }
}
