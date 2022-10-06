class customer1
{
public static void main(String args[])

{
bank manager=new bank();
int output=manager.deposit();
System.out.println(output);


}}
class bank
{
int deposit()
{
int availableAmount=1000;
int depositAmount=500;
int totalAmount=availableAmount+depositAmount;
return totalAmount;
}
}
