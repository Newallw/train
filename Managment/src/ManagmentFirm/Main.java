package ManagmentFirm;

public class Main {
    public static void main (String [] args){
        Staff staff1 = new Staff ("Peter");
        staff1.setHoursWorked(160);
        int pay = staff1.calculatePay(1000,400);
        System.out.println("Pay = " + pay);

        Staff staff2 = new Staff ("Leon", "Jane");
        staff2.setHoursWorked(160);
        int pay1 = staff1.calculatePay();
        System.out.println("Pay = " + pay1);

    }
}
