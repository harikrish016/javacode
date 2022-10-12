class waterTank
{
static long x=1800000;
long y;
void doubleTank()
{
System.out.println("Total capacity of water"+x);
}
void singleTank()
{
System.out.println("capacity of water"+y);
System.out.println("Non drinking  water");
}
void singleTank(int a,int b)
{
System.out.println("capacity of water"+y);
System.out.println("drinking  water");
System.out.println("out water for daily"+(a*b));
}
String drinkingWater()
{
return ("drinking water"+y);
}
}

