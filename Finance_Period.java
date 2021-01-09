
class Finance_Period extends Customer {
	//Overriding the customer class...
    @Override
    public double calculateRepayment() 
    {
        
       if (Months>3) {
               return
            monthlyRepayementAmount= productPrice/Months*(0.25)*(5);
           
           } 
        else {
           return monthlyRepayementAmount= productPrice/Months;
        }
       
       
    }

}