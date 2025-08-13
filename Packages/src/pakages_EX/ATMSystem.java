package pakages_EX;



public class ATMSystem {
    public static void main(String[] args) {
    	AccountDeposit account = new AccountDeposit();

        // Two users trying to withdraw simultaneously
       Thread user1 = new Thread(
    		   ()->{for(int i =0; i<3; i++) {
    	   account.withdraw(300, "user1");
       }
       });
        Thread user2 = new Thread(
        		()->{for(int i =0; i<3;i++) {
        	account.withdraw(200,"user2");
        }
        });

        user1.start();
        user2.start();

        try {
            user1.join();
            user2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}