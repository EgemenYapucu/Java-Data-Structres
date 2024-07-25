class Customer{
    private String C_Name;
    private long C_IDNumber;
    private boolean C_Sex;
    private int C_Age;
    private long C_PayNum;

    public String getter_name() { return C_Name;}
    public long getter_id() { return C_IDNumber;}
    public boolean getter_sex() { return C_Sex;}
    public int getter_age() { return C_Age;}
    public long getter_paynum() { return C_PayNum;}

    public void setter_name(String C_Name) { this.C_Name = C_Name;}
    public void setter_id(long C_IDNumber) { this.C_IDNumber = C_IDNumber;}
    public void setter_sex(boolean C_Sex){ this.C_Sex = C_Sex;}
    public void setter_age(int C_Age) { this.C_Age = C_Age;}
    public void setter_paynum(long C_PayNum) { this.C_PayNum = C_PayNum;}
    public Customer(String C_Name, long C_IDNumber, boolean C_Sex, int C_Age, long C_PayNum ){
        setter_name(C_Name);
        setter_age(C_Age);
        setter_id(C_IDNumber);
        setter_paynum(C_PayNum);
        setter_sex(C_Sex);
    }
    public void print_C(){
        System.out.println("Customer Name: " + C_Name );
        System.out.println("Customer Age: " + C_Age);
        if(!C_Sex)
            System.out.println("Customer Sex: Female");
        else
            System.out.println("Customer Sex: Male");
        System.out.println("Customer ID: " + C_IDNumber);
        System.out.println("Customer Payment Number: " + C_PayNum);
    }
};