public class midPriorityConcreteCreator implements RequestCreator {

    @Override
    public requestProduct createRequest() {
        return new midPriorityConcrete();
    }

}