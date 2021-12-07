class Org1 {
    private int id;
    private String name;
    private String JoiningDate;
    private String Dept;
    private double salary;
 
    public Org1(int id, String name, String JoiningDate, String Dept, double salary) {
        this.id = id;
        this.name = name;
        this.JoiningDate = JoiningDate;
        this.Dept = Dept;
        this.salary = salary;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getDateOfJoining() {
        return JoiningDate;
    }
 
    public void setDateOfJoining(String JoiningDate) {
        this.JoiningDate = JoiningDate;
    }
 
    public String getDepartment() {
        return Dept;
    }
 
    public void setDepartment(String Dept) {
        this.Dept = Dept;
    }
 
    public double getSalary() {
        return salary;
    }
 
    public void setSalary(double salary) {
        this.salary = salary;
    }
 
    public Org1() {
    }
 
    @Override
    public String toString() {
        return "Org1 [id=" + id + ", name=" + name + ", JoiningDate=" + JoiningDate + ", Dept="
                + Dept + ", salary=" + salary + "]";
    }
 
 }
 
 class Org2 {
    private int id;
    private String name;
    private String address;
    private String ContactNo;
    private String gender;
   
   
    public Org2(int id, String name, String address, String ContactNo, String gender) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
        this.ContactNo = ContactNo;
        this.gender = gender;
    }
 
 
    public int getId() {
        return id;
    }
 
 
    public void setId(int id) {
        this.id = id;
    }
 
 
    public String getName() {
        return name;
    }
 
 
    public void setName(String name) {
        this.name = name;
    }
 
 
    public String getAddress() {
        return address;
    }
 
 
    public void setAddress(String address) {
        this.address = address;
    }
 
 
    public String getPhoneNumber() {
        return ContactNo;
    }
 
 
    public void setPhoneNumber(String ContactNo) {
        this.ContactNo = ContactNo;
    }
 
 
    public String getGender() {
        return gender;
    }
 
 
    public void setGender(String gender) {
        this.gender = gender;
    }
 
 
    public Org2() {
    }
 
 
    @Override
    public String toString() {
        return "Org2 [id=" + id + ", name=" + name + ", address=" + address + ", ContactNo=" + ContactNo
                + ", gender=" + gender + "]";
    }
 
 }
 class Organization{
    public static void main(String[] args) {
        Org1 org1=new Org1(1,"Ayush","20-10-2000","IT",300000);
        System.out.println(org1.toString());
        Org2 org2=new Org2(124,"Pratap","Lucknow","1234567890","male");
        System.out.println(org2.toString());
 
    }
 }