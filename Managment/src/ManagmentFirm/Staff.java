package ManagmentFirm;

public class Staff {
    private String nameOfStaff;
    private final int hoursRate=30;
    private int hoursWorked;

    public void printMessage () {
        System.out.println("Calculating pay ...");
    }

    public int calculatePay () {
        printMessage();
        int staffPay;
        staffPay = hoursRate * hoursWorked;
        if(hoursWorked > 0)
            return staffPay;
        else
            return -1;
    }
    public int calculatePay(int bonus, int allowance){
        printMessage();
        if (hoursWorked > 0)
            return hoursWorked * hoursRate + bonus + allowance;
        else
            return 0;
    }

    public void setHoursWorked (int hours){
        if(hours > 0)
            hoursWorked = hours;
        else {
            System.out.println("Error: hoursWorked cannot be smaller than zero");
            System.out.println("Error: hoursWorked is not update");
        }
    }
    public int getHoursWorked(){
        return hoursWorked;
    }

    public Staff (String name){
        nameOfStaff = name;
        System.out.println("\n" + nameOfStaff);
        System.out.println("----------------------------");

    }

    public Staff (String firstName, String secondName){
        nameOfStaff = firstName + " " + secondName;
        System.out.println ("\n" + nameOfStaff);
        System.out.println("-----------------");
    }

}
