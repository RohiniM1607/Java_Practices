package Arrays;

public class JaggedArray2 {

	public static void main(String[] args) {

		String [][] seatType = new String[][] {
			{"B","A","A"},
			{"A","A","A","B","B"},
			{"A","B","B","B","B"},
			{"B","A","A","A"}
		};

		int vipcount = 0, premiumcount = 0, regularcount = 0;
		int viptotal = 5, premiumtotal = 10, regulartotal = 5;

		System.out.println("--MOVIE SEAT ARRANGEMENT--");

		for(int i=0; i < seatType.length; i++) {

			if (i==0)
				System.out.println("--------VIP SEATS--------");
			else if(i==1)
				System.out.println("------PREMIUM SEATS------");
			else if(i==3)
				System.out.println("------REGULAR SEATS------"); 

			for (int j=0; j < seatType[i].length; j++) {

				System.out.print(" "+seatType[i][j]+" ");

				if(i==0 && seatType[i][j].equalsIgnoreCase("B"))
					vipcount++;

				else if(i>0 && i<3 && seatType[i][j].equalsIgnoreCase("B"))
					premiumcount++;

				else if(i==3 && seatType[i][j].equalsIgnoreCase("B"))
					regularcount++;
			}

			System.out.println();
		}

		System.out.println("----SEAT BOOKED DETAIL----");

		System.out.println("--------VIP SEATS--------");
		System.out.println("BOOKED : "+vipcount+" AVAILABLE : "+(viptotal-vipcount)+" TOTAL : "+viptotal);

		System.out.println("-----PREMIUM SEATS-----");
		System.out.println("BOOKED : "+premiumcount+" AVAILABLE : "+(premiumtotal-premiumcount)+" TOTAL : "+premiumtotal);

		System.out.println("-----REGULAR SEATS-----");
		System.out.println("BOOKED : "+regularcount+" AVAILABLE : "+(regulartotal-regularcount)+" TOTAL : "+regulartotal);
	}
}