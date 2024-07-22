class CheckSynThread
{
int total_ticket=15;
synchronized void bookTicket(int ticket)
{
if(total_ticket>=ticket)
{
System.out.println("ticket booked successfully");
total_ticket=total_ticket-ticket;
System.out.println("ticket available" +total_ticket);
}
else
{
System.out.println("ticket can not be booked");
System.out.println("ticket available"+ total_ticket);
}
}
}
class ThreadSynchronization extends Thread
{
static  CheckSynThread obj;
int ticket;
public void run()
{
obj.bookTicket(ticket);
}
public static void main(String[] args)
{
obj=new CheckSynThread();
ThreadSynchronization ram=new ThreadSynchronization();
ram.ticket=7;
ram.start();
ThreadSynchronization hari=new ThreadSynchronization();
hari.ticket=10;
hari.start();
}
}
 