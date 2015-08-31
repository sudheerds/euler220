package euler220;

class Datum {
	
	static  String a = "aRbFR";
	static  String b = "LFaLb";
	static String D="Fa";
	static String D_temp1="";
	static String D_temp2="";
	static String D_temp3="Fa";
	
	static void SettingUp(){	
	
		for(int i=1; i<10;i++){
		
			int len = D_temp3.length();
			//System.out.println(len);
			for(int j=0;j<len;j++){
				
				if(D_temp3.charAt(j)== 'a')
					D_temp1=a;					
				else if(D_temp3.charAt(j)=='b')
					D_temp1=b;
				else 
					D_temp1 = Character.toString(D_temp3.charAt(j));
				
				D_temp2+=D_temp1;
				
			}	
			
			D_temp3=D_temp2;
			//System.out.println(D_temp3.length());
			System.out.println(D_temp3);
			D_temp2="";
		
		}
		
	
	}
	
	


}