import java.util.Vector;
class Room{
    private Vector<Customer> R_Customers = new Vector<Customer>();
    private int R_Size;
    private int  R_Floor;
    private boolean R_is_Occupied;
    private long R_Num;

    public Room(int R_Size, int R_Floor, long R_Num){
        this.R_Size = R_Size;
        this.R_Floor = R_Floor;
        this.R_Num = R_Num;
        R_is_Occupied = false;
    }
    public void Hire(Vector<Customer> R_Customers){
        if(R_is_Occupied){
            System.out.println("Room is notavailable for you");
            return;
        }
        if(R_Customers.size() > R_Size){
            System.out.println("Room is not available for you");
        }
        else{
            R_is_Occupied = true;
            this.R_Customers = R_Customers;
        }
    }
    public void Hire(Customer customer){
        if(R_is_Occupied){
            System.out.println("Room is not available for you");
            return;
        }
        else{
            R_Customers.add(customer);
            R_is_Occupied = true;
        }
    }
    public void R_print(){
        System.out.println("Room Floor: " + R_Floor);
        System.out.println("Room Size: " + R_Size);
        System.out.println("Room Number: " + R_Num);
        if(R_is_Occupied == true){
            for(int i=0;i<R_Customers.size();++i){
                R_Customers.elementAt(i).print_C();
            }
        }
        else{
            System.out.println("Room is empty");
        }

    }
    public void clear(){
        if(R_is_Occupied == true){
            R_is_Occupied = false;
            R_Customers.clear();
        }
        else{
            System.out.println("Room is empty");
        }
    }
    public static void main(String[] args) {
        Room _153 = new Room(3 ,15, 153);
        _153.Hire(new Customer("Bensu", 198502749, false, 17, 53747521));
        _153.R_print();
        _153.clear();
        _153.R_print();
    }   

};