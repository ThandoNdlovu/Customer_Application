
import javax.swing.JOptionPane;



public class Customer {
    //**Attributes for details
  String customerName;
  long contactNumber;
  double productPrice;
  int Months;
  double monthlyRepayementAmount;
  
    

    public String getCustomerName()  //get and set method for customer name
    {
        return customerName;
    }

    public void setCustomerName()
    {
        this.customerName = JOptionPane.showInputDialog(null, "Please enter the customer name");
    }

    public long getContactNumber() //get and set for contact number
    {
        return contactNumber;
    }

    public void setContactNumber()
    {
        String strchoice = JOptionPane.showInputDialog(null, "Please enter customer contact number");
        long ContactNumber=Long.parseLong(strchoice);
        this.contactNumber =ContactNumber;
    }

    public double getProductPrice()//get and set for product price
    {
        return productPrice;
    }

    public void setProductPrice()
    {
         String strchoice1 = JOptionPane.showInputDialog(null, "Please enter the price of the product");
         double productPrice=Double.parseDouble(strchoice1);
        this.productPrice = productPrice;
    }

    public int getMonths() //get and set for months 
    {
        return Months;
    }

    public void setMonths()
    {
        String strmonths = JOptionPane.showInputDialog(null, "Please enter the number of repayement months");
        int Months= Integer.parseInt(strmonths);
        this.Months = Months;
    }
    

    public double calculateRepayment()//method that calculates the monthly repayment
    {
        return productPrice/Months;
    }

}
   
        
       
    
   
    
   


            
    
    
    
   

