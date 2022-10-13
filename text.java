class box
{
int height;
int weight;
int depth;
public box(int h,int w,int d)
{   
height=h;
weight=w;
depth =d;


}
public box()
{
depth=height=weight=0;
}
public box(int len)
{ 
 weight=height=depth=len;

}
double volume()
{
return weight*height*depth;
}
}

class text
{
public static void main(String args[])
{
box mybox1=new box(3,5,6);
box mybox2=new box();
box mybox3=new box(8);
double vol;
vol=mybox1.volume();
System.out.println(vol);
vol=mybox2.volume();
System.out.println(vol);
vol=mybox3.volume();
System.out.println(vol);

}}
