public class lowPriorityConcreteCreator implements RequestCreator {

    @Override
    public requestProduct createRequest() {
        return new lowPriorityConcrete();
    }

}
