package Demo;

import java.util.Scanner;

public class SeatReservation extends Thread {

	public void run()
	{
	int noOfTickets;
	String []names;
	Scanner sc = new Scanner(System.in);
	
	synchronized(this){
	
	System.out.print("Enter the No of tickets you want to book : ");
	noOfTickets = sc.nextInt();
	
	names=new String[noOfTickets];
	
	for(int i=0;i<noOfTickets;i++)
	{
	System.out.print("Name of "+(i+1)+" passenger : ");
	names[i]=sc.next();
	}
	
	System.out.println(Thread.currentThread().getName() + " has booked "+noOfTickets+" Ticket(s).");
	for(int i=0;i<noOfTickets;i++)
	{
	System.out.println((i+1)+" Passenger : "+names[i]);
	}
}
	}
	public static void main(String[] args) {
		
		System.out.println("\n***********Welcome to Online Bus Reservation Services****************\n\n");
		
		SeatReservation thread  = new SeatReservation();
		
		thread.setName("Thread 1");
		
		thread.start();
	}
		
}
