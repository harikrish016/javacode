class phoneshop

{
public static void main(String args[])
{

phone s1=new phone("oppo",80,true);
phone s2=new phone("hari",89,false);
System.out.println(s1.good);

}
}
class phone
{
String modelName;
int price;
Boolean good;

public phone(String Mn,int p,boolean b)
{
modelName=Mn;
price=p;
good=b;

}
}

