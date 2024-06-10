public class DumpEmp
{
    private String ename;
    private String emailId;
    private String resaddr;
    private int mobileno;

    public void setEname(String ename) 
    {
        this.ename = ename;
    }

    public void setEmailId(String emailId) 
    {
        this.emailId = emailId;
    }

    public void setResaddr(String resaddr) 
    {
        this.resaddr = resaddr;
    }

    public void setMobileno(int mobileno) 
    {
        this.mobileno = mobileno;
    }
    
    public String toString() 
    {
        return "Employee Name: " + ename + ", Email: " + emailId + ", Address: " + resaddr + ", Mobile No: " + mobileno;
    }
    
    public static void main(String[] args)
    {
        DumpEmp de = new DumpEmp();

        de.setEname("Ritu");
        de.setEmailId("rituparekh14@gmail.com");
        de.setResaddr("Ahmedabad");
        de.setMobileno(6354228950);

        System.out.println(de);

        DumpEmp ed1 = new DumpEmp();

        ed1.setEname("Neha");
        ed1.setResaddr("Baroda");

        System.out.println(ed1);
    }
}