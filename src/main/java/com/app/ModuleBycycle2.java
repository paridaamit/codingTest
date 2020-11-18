package com.app;

import java.time.LocalDate;
import java.util.Scanner;

public class ModuleBycycle2 implements Runnable 
{
	int sFrame,sFork,hSet,sPost,hBar,grips,gear,paddle,pRack,spokes,rim,tube,
	tyre,chain,cover,frame,hb,seating,wheels,ca,eCost;
	public void run()
	{
		for(int i =1; i<=1000 ; i++)
		{
		
		Scanner s = new Scanner(System.in);
		System.out.println("please provide Cycle Assembly Frame details");
		System.out.println("need steel frame(then type)->  yes  (otherwise)->  no");
		String sf = s.next();
		if("yes".equalsIgnoreCase(sf))
		{
			 sFrame=100 ;
		}
		else 
		{  
			sFrame = 0;
		}
		System.out.println("need fork(then type)->  yes  (otherwise)->  no");
		String f = s.next();
		if("yes".equalsIgnoreCase(f))
		{
			 sFork=150 ;
		}
		else 
		{  
			sFork = 0;
		}
		System.out.println("need Headset(then type)->  yes  (otherwise)->  no");
		String h = s.next();
		if("yes".equalsIgnoreCase(h))
		{
			 hSet=200 ;
		}
		else 
		{  
			hSet = 0;
		}
		System.out.println("need seat post(then type)->  yes  (otherwise)->  no");
		String sp = s.next();
		if("yes".equalsIgnoreCase(sp))
		{
			 sPost=200 ;
		}
		else 
		{  
			sPost = 0;
		}
		
		System.out.println("please provide Handlebar and beake details");
		System.out.println("need HandleBars(then type)->  yes  (otherwise)->  no");
		
		String hp = s.next();
		if("yes".equalsIgnoreCase(hp))
		{
			 hBar=300 ;
		}
		else 
		{  
			hBar = 0;
		}
		
		System.out.println("need handle Grip(then type)->  yes  (otherwise)->  no");
		
		String g = s.next();
		if("yes".equalsIgnoreCase(g))
		{
			 grips=200 ;
		}
		else 
		{  
			grips = 0;
		}
		
		System.out.println("need gear(then type)->  yes  (otherwise)->  no");
		
		String gr = s.next();
		if("yes".equalsIgnoreCase(gr))
		{
			 System.out.println("how many gear do you want ? please enter valid number");
			 gear= s.nextInt();
			 gear= gear*100;
		}
		else 
		{  
			gear = 0;
		}
		

		System.out.println("please provide seating details");
		System.out.println("need seat-paddle(then type)->  yes  (otherwise)->  no");
		String spd = s.next();
		if("yes".equalsIgnoreCase(spd))
		{
			 paddle=450 ;
		}
		else 
		{  
			paddle = 0;
		}
		
		System.out.println("need pannier-rack(then type)->  yes  (otherwise)->  no");
		
		String pr = s.next();
		if("yes".equalsIgnoreCase(pr))
		{
			 pRack=250 ;
		}
		else 
		{  
			pRack = 0;
		}
		
		System.out.println("please provide wheels details");
		System.out.println("need SPOKES(then type)->  yes  (otherwise)->  no");
		
		String sk = s.next();
		if("yes".equalsIgnoreCase(sk))
		{
			 spokes=270 ;
		}
		else 
		{  
			spokes = 0;
		}
		
		System.out.println("need RIM(then type)->  yes  (otherwise)->  no");
		
		String ri = s.next();
		if("yes".equalsIgnoreCase(ri))
		{
			 rim=300 ;
		}
		else 
		{  
			rim = 0;
		}
		System.out.println("need TUBE(then type)->  yes  (otherwise)->  no");
		
		String tu = s.next();
		if("yes".equalsIgnoreCase(tu))
		{
			 tube=100 ;
		}
		else 
		{  
			tube = 0;
		}
		System.out.println("need TYRE(then type)->  yes  (otherwise)->  no");
		
		String ty = s.next();
		if("yes".equalsIgnoreCase(ty))
		{
			 tyre=150 ;
		}
		else 
		{  
			tyre = 0;
		}
		System.out.println("please provide chain-assembly  details");
		System.out.println("need chain(then type)->  yes  (otherwise)->  no");
		
		String ch = s.next();
		if("yes".equalsIgnoreCase(ch))
		{
			 chain=275 ;
		}
		else 
		{  
			chain = 0;
		}
		System.out.println("need chain cover(then type)->  yes  (otherwise)->  no");
		
		String cv = s.next();
		if("yes".equalsIgnoreCase(cv))
		{
			 cover=270 ;
		}
		else 
		{  
			cover = 0;
		}
		
		System.out.println("please Enter date of pricing in YYYY-MM-DD format");
		String date = s.next();
		LocalDate it = LocalDate.parse(date);
		System.out.println(it);
		int year = it.getYear();
		int month = it.getMonthValue();
		if(year >=2017 || year ==2016 && month ==12)
		{
			sFrame=sFrame+sFrame*15/100;sFork=sFork+sFork*15/100;
			hSet=hSet+hSet*15/100;sPost=sPost+sPost*15/100;
			hBar=hBar+hBar*15/100;grips=grips+grips*15/100;
			gear=gear+gear*15/100;paddle=paddle+paddle*15/100;
			pRack=pRack+pRack*15/100;spokes=spokes+spokes*15/100;
			rim=rim+rim*15/100;tube=tube+tube*15/100;
			tyre=tyre+tyre*15/100;chain=chain+chain*15/100;cover=cover+cover*15/100;
		}
		
		else 
		{
			
		}
		frame=sFrame+sFork+hSet+sPost;
		hb=hBar+grips+gear;
		seating=paddle+pRack;
		wheels=spokes+rim+tube+tyre;
		ca=chain+cover;
		eCost=frame+hb+seating+wheels+ca;
		System.out.println("Total Cycle cost " + eCost);
		System.out.println("High levle componets costs :" +'\n' + "frame="+frame +'\n'+"handle bar with breaks= "+hb+'\n'+ "seating= "+seating
				+'\n'+"wheels= "+wheels+'\n'+ "chain assembly= "+ca);
		System.out.println("---------------------------------");
		System.out.println("PLEASE PROVIDE NEXT CYCLE ASSEMBLY DETAILS");
		}
	}
	public static void main(String[] args) 
	{
		ModuleBycycle2 obj = new ModuleBycycle2();
		Thread t1 = new Thread(obj);
		t1.start();
	}
}
