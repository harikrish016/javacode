class wood
{
void chair()
{
System.out.println("this is an wooden chair");
}}
class plastic extends wood 
{
void chair()
{
System.out.println("this is an plastic chair");
}}
class kushen extends plastic
{
void chair()
{
System.out.println("this is an kushen chair");
}}
class practice
{
public static void main(String args[])
{
kushen k=new kushen();
k.chair();
}}




