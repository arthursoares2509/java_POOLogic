import java.util.ArrayList;

public class Order {
    
    private ArrayList<Request> requestList = new ArrayList();
    
    public void addRequestToList(Request r) {
        requestList.add(r);
    }
    
    public void listRequests() {
        System.out.println("Below is the list of requests:");
        for (int i = 0; i < requestList.size(); i++) {
            System.out.println("Item " + i + ": " + requestList.get(i).getP().getName());
            System.out.println("Request total: " + requestList.get(i).calculateTotal());
            System.out.println();
        }
    }
}
