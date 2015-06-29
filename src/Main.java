/**
 * Created by cerebro on 25/06/15.
 */

public class Main {
    private static ArrayStack users = new ArrayStack();

    public static void main(String[] args) {

        users.push("Suresh");
        users.push("Ramesh");

        try {
            System.out.println(isEqualToLastUser("Ramesh"));
        } catch (Exception e) {
            System.out.println("Some error occured. Please try again later");
        }
    }


    private static boolean isEqualToLastUser(String name) throws Exception {
        boolean result = false;

        try {
           result = name.equals(users.pop());
        } catch (DatabaseDownException e) {
                throw e;
        } catch (StackEmptyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Code in finally block");
        }

        System.out.println("Code below finally block");

        return result;
    }
}




