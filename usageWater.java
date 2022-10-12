class usageWater
{
public static void main(String args[])
{
waterTank suresh=new waterTank();
suresh.y=900000;
suresh.doubleTank();
suresh.singleTank();
suresh.singleTank(10,20);
String kumar=suresh.drinkingWater();
System.out.println(kumar);
}
}
