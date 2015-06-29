public interface Stack {
    public Object pop() throws DatabaseDownException, StackEmptyException;
    public void push(Object o);
    public boolean isEmpty();
    public Object slideOut();
    public void slideIn(Object o);
}