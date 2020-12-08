public class Customer {
    private int customerID;
    private String name;
    private String surname;
    private int account;
    private int card;

    public Customer(int pCustomerID,String pName,String pSurname){
        customerID = pCustomerID;
        name = pName;
        surname = pSurname;
    }

    public void setCustomerID(int pCustomerID){customerID = pCustomerID;}
    public int getCustomerID(){return customerID;}

    public void setName(String pName){name = pName;}
    public String getName(){return name;}

    public void setSurnameSurname(String pSurname){surname = pSurname;}
    public String getSurname(){return surname;}

    public void setAccount(int pAccount){account = pAccount;}
    public int getAccount(){return account;}

    public void setCard(int pCard){card = pCard;}
    public int getCard(){return card;}

    @Override
    public String toString(){
        return getCustomerID()+ ", " + getName() +", " + getSurname();

    }


}
