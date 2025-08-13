package interface_Ex;


public class BankingSystem {
	public static void main(String[] args) {
    
    InterestCalculator interestCalculator = new InterestCalculator() {
       
        
        public double SimpleInterest(double principal, double rate, double time) {
           
            return (principal * rate * time) / 100;
        }
    };

    
     EMICalculator emiCalculator = new EMICalculator() {
    	
    public double calculateEMI(double loanAmount, double annualRate, int months) {
    	
    	double monthlyRate = annualRate/(12*100);
    	
  
    	return(loanAmount * monthlyRate * Math.pow(1 + monthlyRate, months)-1)/(Math.pow(1+monthlyRate,months)-1);
   
    }
};
   
    CurrencyConverter convertor = new  CurrencyConverter() {
    	
      public double convertINRtoUSD(double inrAmount) {
			double conversionRate = 65.0;
    		return inrAmount/conversionRate;
		}

		
		
    };
    
    double amount = interestCalculator.SimpleInterest(200000, 7.5, 2);
    
    double emi =  emiCalculator.calculateEMI(700000, 9.5, 60);
    
    double usd = convertor.convertINRtoUSD(200000);
    
    System.out.println("simple interest :" + amount);
    System.out.println("EMI calculator :" +emi);
    System.out.println("Currency convertor :" + usd);
    
    }
}


    

	  

	  
	  


