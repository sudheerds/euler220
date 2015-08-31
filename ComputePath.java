package euler220;

class ComputePath {
	
	static String str = Datum.D_temp3;
	static int l = Datum.D_temp3.length();
	static String[] dir = {"N","E","S","W"};
	//static Map<String,String> dir_cor = new HashMap<String,String>();
	
	static void path(){
		 
		/*dir_cor.put("N","y+");
		dir_cor.put("E","x+");
		dir_cor.put("S","y-");
		dir_cor.put("W","x-");*/
		int x=0;
		int y=0;
		int j=0;
		int steps=0;
		String sig = "N";
		
		for(int i=0; i < l ; i++){
			char c =str.charAt(i); 
			
			if(c=='F')
			{
				steps++;
				switch(sig){
				
				case "N":
					y++;
					break;
					
				case "E":
					x++;
					break;
					
				case "S":
					y--;
					break;
					
				case "W":
					x--;
					break;
					
				
				}//end of switch
				
			} else if(c=='R'){
					j++;
					sig=dir[j%4];
					System.out.println(sig);
				} else if(c=='L'){				
				if(j==0) 
					j=4;
				else
					j--;
				
				sig=dir[j%4];
				System.out.println(sig);
				}
			
			System.out.println(steps + " " + x+" "+ y);
			
		}// end of loop	
		
		//System.out.println(x+" "+ y);
		
	}//end of func

}// end of class
