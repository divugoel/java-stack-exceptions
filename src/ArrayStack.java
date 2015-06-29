public class ArrayStack implements Stack {

    private int top = -1;
    private Object[] stackArray = new Object[100];

    @Override
    public Object pop() throws DatabaseDownException, StackEmptyException {

        if(!this.isDBWorking()) {
            throw new DatabaseDownException("Database is down.");
        }

        if(this.isEmpty()) {
            throw new StackEmptyException("Stack is empty");
        }
        Object temp = stackArray[top];
        stackArray[top] = null;
        top--;
        return temp;
    }

    private boolean isDBWorking() {
        return false;
    }

    @Override
    public void push(Object o) {
        top++;
        stackArray[top] = o;
    }

    @Override
    public boolean isEmpty() {
        if(top == -1) {
            return true;
        }


        return false;
    }

    @Override
    public Object slideOut() {
        if(this.isEmpty()) {
            return null;
        }

        Object temp = stackArray[0];
        for(int i = 0; i < top; i++) {
            stackArray[i] = stackArray[i + 1];
        }

        top--;

        return temp;
    }

    //Derek Banas
    //New Boston

    @Override
    public void slideIn(Object o) {

    }


}