//finalizer method
class FinalizeConcept
{
FinalizeConcept()
{
System.out.println("object is created");
}
protected void finalize()
{
System.out.println("object is distroyed");
}
}
class FinalizerMethod
{
public static void main(String[] args)
{
FinalizeConcept ob=new FinalizeConcept();
ob=null;
FinalizeConcept ob1=new FinalizeConcept();
FinalizeConcept ob2=new FinalizeConcept();
ob1=ob2;
new FinalizeConcept(); 
System.gc();
}
}
