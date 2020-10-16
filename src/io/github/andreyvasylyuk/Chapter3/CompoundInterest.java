package io.github.andreyvasylyuk.Chapter3;

public class CompoundInterest {
    public static void main(String[] args) {
        
        final double STARTSRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;
        
        double[] interestRate = new double[NRATES];
        for(int j = 0; j < interestRate.length; j++) {
            interestRate[j] = (STARTSRATE + j) / 100;
        }
        
        // initialize empty matrix
        double[][] balances = new double[NYEARS][NRATES];
        
        // set values of first row
        for(int i = 0; i < balances[0].length; i++) {
            balances[0][i] = 10000;
        }
        
//        System.out.println(balances.length);
//        System.out.println(balances[0].length);
        
        // compute interests for future years
        for(int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                double oldBalance = balances[i-1][j];
                double interest = oldBalance * interestRate[j];
                balances[i][j] = oldBalance + interest;
            }
        }
        
        // print row of interest rates
        for(double interest : interestRate) {
            System.out.printf("%9.0f%%", 100 * interest);
        }
        
        // print balance table using for-each
//        for(double rows[] : balances) {
//            for(double row : rows) {
//                System.out.printf("%10.2f", row);
//            }
//            System.out.println();
//        }
        
        System.out.println();
        
        for(int i = 1; i < balances.length; i++) {
            System.out.print(i);
            for(int j = 0; j < balances[0].length; j++) {
                System.out.printf("%10.2f", balances[i][j]);
            }
            System.out.println();
        }
    }
}
