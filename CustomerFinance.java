
import javax.swing.JOptionPane;



public class CustomerFinance {

    public static void main(String[] args){

        // initializing and invoking the method from Customer class...
         
        Customer cu = new Customer();
        Customer fin= new Finance_Period();
                
     cu.setCustomerName();
     cu.setContactNumber();
     cu.setProductPrice();
     cu.setMonths();
     cu.calculateRepayment();
     
    fin.setCustomerName();
    fin.setContactNumber();
    fin.setProductPrice();
    fin.setMonths();
    fin.calculateRepayment();
     
     
     
    
         // prompting the user for data for the first object where no interest is applied
         
                 JOptionPane.showMessageDialog(null, "**************************************\n Customer Name: " +cu.getCustomerName()
                + "\n" + " Customer Contact: 0" + cu.getContactNumber()
                + "\n" + " Product Amount:R " + cu.getProductPrice()
                + "\n" + " Repayment Months: " + cu.getMonths()
                + "\n" + " Monthly Repayement:R "+cu.calculateRepayment()
                + "\n" + " Total due: R " + cu.getMonths()*cu.calculateRepayment()
                
                + "\n"  + "*****************************************");
    
         
         
        //and second object where interest is applied.
        JOptionPane.showMessageDialog(null, "**************************************\n Customer Name: " +fin.getCustomerName()
                + "\n" + " Customer Contact: 0" + fin.getContactNumber()
                + "\n" + " Product Amount:R " + fin.getProductPrice()
                + "\n" + " Repayment Months: " + fin.getMonths()
                + "\n" + " Monthly Repayement:R " +fin.calculateRepayment()
                + "\n" + " Total due: R " + fin.getMonths()*fin.calculateRepayment()
                + "\n"  + "*****************************************");
}
}


    


