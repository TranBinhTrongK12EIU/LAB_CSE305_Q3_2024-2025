public class highPriorityConcreteCreator implements RequestCreator {

    @Override
    public requestProduct createRequest() {
        return new highPriorityConcrete();
    }
    
}