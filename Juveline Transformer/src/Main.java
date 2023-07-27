import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

class Crop implements Serializable{
	String Weather;
	int temp1;
	int temp2;
	int height;
	
	Crop(String W,int t1,int t2,int h){
		Weather=W;
		temp1=t1;
		temp2=t2;
		height=h;
		
	}
	void FunctionalityMenu(String p,String q,String s) {
		System.out.println("Enter the Option Realted to which you need Information");
		System.out.println(" 1.Fertilizers\t 2.Irrigation Method\t 3.Steps For Juveline Transformation ");
		Scanner sc=new Scanner(System.in);
		int Fch=sc.nextInt();
		if(Fch==1) {
		System.out.println(p);
		}
		else if(Fch==2) {
		System.out.println(q);
		}
		else if(Fch==3) {
	    System.out.println(s);
		}
	}
	 
	}
public class Main {

	public static void main(String[] args) {
		
		 
		System.out.println("ENTER YOUR NAME");
		Scanner sc= new Scanner (System.in);
		String name=sc.nextLine();
		System.out.println("Do you have a ID");
		System.out.println("1.YES      2.NO");
		int choice=sc.nextInt();
		 if(choice==1)
		 {
			 System.out.println("Thank you for your respone.. ");
			 System.out.println("Enter your 6 digit ID");
			 int YID=sc.nextInt();
			 int m=YID;
			 if(m>100000&&m<300000)
			 {
				 System.out.println("\t\t\tYour Crop was Maize");
				 main7("");
			 }
			 else if(m>300000&&m<600000)
			 {
				 System.out.println("\t\t\tYour Crop was Sasame");
				 main4("");
			 }
			 else if(m>600000&&m<900000)
			 {
				 System.out.println("\t\t\tYour Crop was Watermelon");
				 main11("");
			 }
			 else {
				 System.out.println("\t\t\tYour Crop was Groundnut");
				 main10("");
			 }
			  	
		 }
		 else if(choice==2)
		 {
			 System.out.println("Your ID is created");
			 System.out.print("Your ID number is ");
			int z= random();
			 System.out.println("\t \t "+name.toUpperCase()+" you have succesfully registerd with your ID "+z);
			 MainMenu();
		 }
		  	
	}
	
	public static int random() {
		int q=0;
		
		Random r=new Random();
		HashSet<Integer> set=new HashSet<>();
		while(set.size()<1)
		{
			int random=r.nextInt(999999)+10;
			set.add(random);
			for(int randomNumbers:set)
			{
				 				 q=randomNumbers;
				 				System.out.println(q);

			}
		}
		
		return q;
		
	}
	  static void MainMenu(){
		 System.out.println(" \t MAIN MENU");
		 System.out.println(" ENTER THE TYPE OF JUVELINE ");
		 System.out.println(" 1.RABI CROPS\n 2.KHARIF CROPS\n 3.ZAID CROPS\n 4.ADDITIONALS");
		 Scanner sc= new Scanner (System.in);
		 int ch= sc.nextInt();
		 switch(ch)
		 {
		 case 1: RabiCrops();
		 break;
		 case 2: KharifCrops();
		 break;
		 case 3: ZaidCrops();
		 break;
		 case 4:Additionals();
		 break;
		 }
	  }
		 static void RabiCrops(){
			 System.out.println(" Below is the list of Crops\n Please Select the one about which"
			 		+ " you need information  ");
			 System.out.println(" 1.Wheat\n 2.Barley\n 3.Mustard\n 4.Seasame\n 5.Peas");
			 Scanner sc=new Scanner(System.in);
			 int c=sc.nextInt();
			 switch(c)
			 {
			 case 1:main1("");
			 break;
			 case 2:main2("");
			 break;
			 case 3:main3("");
			 break;
			 case 4:main4("");
			 break;
			 case 5:main5("");
			 break;
			 default :System.out.println("Please select the valid crop");
			 break;
			 }
			  
		  }
		 public static void main1(String args) {
				Crop Wheat=new Crop("Cool Climate and Medium Rainfall",24,25,85);
					 
				Wheat.FunctionalityMenu("The fertilizers used are Muriate of potash and potassium sulphate",
							 " Drip Irrigation ",
							 "1.Wheat is grown from seeds. \n"
							        + " 2.After ploughing the "
							 		+ "paddocks to break up the soil,"
							 		+ " the farmer uses a tractor to pull a machine called a drill "
							 		+ "that plants the seeds"
							 		+ " into long ditches. \n"
							 		+ " 3.Fertiliser, (food for plants) can be "
							 		+ "added by the"
							 		+ " machine to make the wheat plants grow strong.");
					 System.out.println(" ");
					 System.out.println("Basic info related to the selected crop:");
					 System.out.println("        Weather:\t\t\t"+Wheat.Weather);
					 System.out.println("        Optimum temperature range:\t"+Wheat.temp1+" to "+Wheat.temp2);
					 System.out.println("        Average height of the Crop:\t"+Wheat.height+"cm");
					 System.out.println("                     THANK   YOU   FOR   VISITING                         " );
				  
			  }
			  public static void main2(String args) {
				  Crop Barley=new Crop("Subtropical climatic condition",12,15,90);
				  Barley.FunctionalityMenu("The fertilizers used are Nitrogen and Phosphorus",
						  "Furrow Irrigation", 
						  "1.Scatter seed across a fallow bed, or sow in the rows with twenty to "
						  + "twenty-five seeds"
						  + " per foot.\n"
						  + " 2.Months to Bearing: two months once growth begins in spring.\n"
						  + " 3. Harvest:"
						  + " spring-sown barley matures in about 70 days; fall-planted barley ripens about"
						  + " 60 days"
						  + " after growth resumes in the spring.\n"
						  + " 4.Reap when barley is dry.");
				  System.out.println(" ");
					 System.out.println("Basic info related to the selected crop:");
					 System.out.println("        Weather:\t\t\t"+Barley.Weather);
					 System.out.println("        Optimum temperature range:\t"+Barley.temp1+" to "+Barley.temp2);
					 System.out.println("        Average height of the Crop:\t"+Barley.height+"cm");
					 System.out.println("                     THANK   YOU   FOR   VISITING                         " );
				  
			  }
			  public static void main3(String args) {
				  Crop Mustard=new Crop("Low Humidity",18,25,55);
				  Mustard.FunctionalityMenu("The fertilizers used are FYM ,Potassium oxide,"
				  		+ "Phosphorus and Nitrogen",
						  "Pre-Sowing Drip Irrigation", 
						   " 1.Purchase seeds and plant them in enriched soil.\n"
						   + " 2.Then uproot and"
						   + " replant the seedlings that emerge.\n "
						   + " 3.Make sure to water, weed, "
						   + "and protect your plants from plant-munching bugs.\n "
						   + " 4.Once they're ready,"
						   + " you can harvest the leaves and, if you wish, let the plants "
						   + "seed to harvest mustard seeds as well.");
				  System.out.println(" ");
					 System.out.println("Basic info related to the selected crop:");
					 System.out.println("        Weather:\t\t\t"+Mustard.Weather);
					 System.out.println("        Optimum temperature range:\t"+Mustard.temp1+" to "
					                            +Mustard.temp2);
					 System.out.println("        Average height of the Crop:\t"+Mustard.height+"cm");
					 System.out.println("                     THANK   YOU   FOR   VISITING                         " );
				  
			  }
			  public static void main4(String args) {
				  Crop Seasame=new Crop("Hot Summer Climate",25,35,90);
				  Seasame.FunctionalityMenu("The fertilizers used are NPK and Urea", "Drip irrigation"
				  		+ " treatment with"
				  		+ " dripper discharge × dripper spacing × lateral spacing as\n "
				  		+ "14 lph × 0.8 × 2.1 m with 5 t/ha wheat straw mulch proved to be the best irrigation",
				  		      " 1.Germinate plants indoors"
				  				+ " by planting seeds ¼” deep in a rich growing medium.\n"
				  				+ " 2.Kept moist, plants will emerge in 10-14 days and will be ready to "
				  				+ "transplant once outside temperatures reach 70 degrees.\n"
				  				+ " 3.Once established, sesame is drought-tolerant and will grow to "
				  				+ "3-5 feet or taller with white and sometimes pink flowers.");
				  System.out.println(" ");
					 System.out.println("Basic info related to the selected crop:");
					 System.out.println("        Weather:\t\t\t"+Seasame.Weather);
					 System.out.println("        Optimum temperature range:\t"+Seasame.temp1+" "
					 		                        + "to "+Seasame.temp2);
					 System.out.println("        Average height of the Crop:\t"+Seasame.height+"cm");
					 System.out.println("                     THANK   YOU   FOR   VISITING                         " );
				  
			  }
			  public static void main5(String args) {
				  Crop Peas=new Crop("Cool and moderate temperature",12,22,55);
				  Peas.FunctionalityMenu("The fertilizers used are low-nitrogen,"
				  		+ " high-phosphorus, high-potassium fertilizer ",
						 " micro sprinkler system followed by drip",
						     " 1.Prepare your soil\n"
						        + " 2.Sow your peas  very close together in the trenches.\n"
						 		+ " 3.Unlike many vegetables, they will perform better when"
						 		+ " crowded and even touching.\n"
						 		+ " 4.Water your peas\n "
						 		+ " 5.Harvest, it’s important to keep harvesting"
						 		+ " the peas when they’re ready,");
				  System.out.println(" ");
					 System.out.println("Basic info related to the selected crop:");
					 System.out.println("        Weather:\t\t\t"+Peas.Weather);
					 System.out.println("        Optimum temperature range:\t"+Peas.temp1+" to "+Peas.temp2);
					 System.out.println("        Average height of the Crop:\t"+Peas.height+"cm");
					 System.out.println("                     THANK   YOU   FOR   VISITING                         " );
              }
				  
		 static void KharifCrops() {
			 System.out.println(" Below is the list of Crops\n Please Select the one about which you need information  ");
			 System.out.println(" 1.Rice\n 2.Maize\n 3.Soyabean\n 4.Ragi\n 5.Groundnut");
			 Scanner sc=new Scanner(System.in);
			 int c=sc.nextInt();
			 switch(c)
			 {
			 case 1:main6("");
			 break;
			 case 2:main7("");
			 break;
			 case 3:main8("");
			 break;
			 case 4:main9("");
			 break;
			 case 5:main10("");
			 break;
			 default :System.out.println("Please select the valid crop");
			 break;
			 }
			  
		 }
		 
		
	  
	  public static void main6(String args) {
		  Crop Rice=new Crop(" Hot and humid climate",21,37,90);
		  Rice.FunctionalityMenu("The fertilizers used are Ammonium sulphate, phosphorus ",
				 " Drip Irrigation",
				       " 1.The seeds are sown in prepared beds.\n"
				 		+ " 2.When the seedlings are 25 to 50 days old, they are transplanted to a"
				 		+ " field, or paddy.\n"
				 		+ " 3.This Paddy has been enclosed by leaves and submerged"
				 		+ " under 5 to 10 cm (2 to 4 inches) of water,"
				 		+ " remaining submerged during the growing season.\n"
				 		+ " 4.Harvesting");
		  System.out.println(" ");
			 System.out.println("Basic info related to the selected crop:");
			 System.out.println("        Weather:\t\t\t"+Rice.Weather);
			 System.out.println("        Optimum temperature range:\t"+Rice.temp1+" to "+Rice.temp2);
			 System.out.println("        Average height of the Crop:\t"+Rice.height+"cm");
			 System.out.println("                     THANK   YOU   FOR   VISITING                         " );
		  
		  
	  }
	  public static void main7(String args) {
		  Crop Maize=new Crop(" Warm and Humid Climate,",18,27,330);
		  Maize.FunctionalityMenu("The fertilizers used are NPK, Urea ",
					 " Furrow irrigation",
					       " 1.Maize is sown in rows, 60-75 cm apart, "
					 		+ "whereas the plants in the row are spaced at 20 to 25 cm.\n"
					 		+ " 2.A population of 60-75 thousand plants per hectare at harvest"
					 		+ " are required for obtaining the optimum yield.\n"
					 		+ " 3.Sowing in rows is generally done with drill"
					 		+ " or by dropping the seed behind the plough.");
					 		  
			  System.out.println(" ");
				 System.out.println("Basic info related to the selected crop:");
				 System.out.println("        Weather:\t\t\t"+Maize.Weather);
				 System.out.println("        Optimum temperature range:\t"+Maize.temp1+" to "+Maize.temp2);
				 System.out.println("        Average height of the Crop:\t"+Maize.height+"cm");
				 System.out.println("                     THANK   YOU   FOR   VISITING                         " );
			  
		  
	  }
	  public static void main8(String args) {
		  Crop Soyabean=new Crop(" Warm and moist climate,",26,30,150);
		  Soyabean.FunctionalityMenu("The fertilizers used are Phosphorus and potassium  ",
					 " Mechanized irrigation (center pivots), hard hose travelers, and solid set irrigation.",
				     " 1.Sow the soybeans 1.5 inches (3.8 cm) deep into the soil, and space the beans about"
				     + " 3 inches (7.6 cm) apart.\n "
				     + " 2.Plant the beans in rows that are about 30 inches (76 cm) apart.\n "
				     + " 3.Water the beans once they've been planted, but only until the soil is moist.\n "
				     + " 4.Do not overwater newly planted beans, otherwise they may crack.");
					 		  
			  System.out.println(" ");
				 System.out.println("Basic info related to the selected crop:");
				 System.out.println("        Weather:\t\t\t"+Soyabean.Weather);
				 System.out.println("        Optimum temperature range:\t"+Soyabean.temp1+" to "+Soyabean.temp2);
				 System.out.println("        Average height of the Crop:\t"+Soyabean.height+"cm");
				 System.out.println("                     THANK   YOU   FOR   VISITING                         " );
			  
		  
	  }
	  public static void main9(String args) {
		  Crop Ragi=new Crop("  Tropical and subtropical climate,",20,40,85);
		  Ragi.FunctionalityMenu("The fertilizers used are Phosphorus pentaoxide and nitrogen  ",
					 " Drip irrigation.",
				     " 1.Prepare a well pulverized seed bed for direct seeding of ragi.\n "
				     + " 2.Apply FYM or compost 5t/ha and incorporate well into the soil along with"
				     + " fertilizer before sowing.\n"
				     + " 3.Sow the direct seeded crop in line 22.5 cm apart, seed rate of 10kg/ha will be"
				     + " adequate for line sow crop.");
					 		  
			  System.out.println(" ");
				 System.out.println("Basic info related to the selected crop:");
				 System.out.println("        Weather:\t\t\t"+Ragi.Weather);
				 System.out.println("        Optimum temperature range:\t"+Ragi.temp1+" to "+Ragi.temp2);
				 System.out.println("        Average height of the Crop:\t"+Ragi.height+"cm");
				 System.out.println("                     THANK   YOU   FOR   VISITING                         " );
				  
				 
		  
	  }
	  public static void main10(String args) {
		  Crop Groundnut=new Crop(" Tropical and subtropical climate",20,25,45);
		  Groundnut.FunctionalityMenu("The fertilizers used are FYM , Superphosphate and nitrogen  ",
					 " Border Strip irrigation.",
				     " 1.Ploughing in summer (Just before Rainy/Planting Season) is advantageous to kill weed seeds,\n"
				     + " hibernating insects, and disease organisms, "
				     + " by exposing them to the heat of summer.\n"
				     + " 2.Plant high-quality seeds.\n"
				     + " 3.Moisten the soil before planting the seeds,the spacing should be at 50cm between rows and\n"
				     + " about 30cm between plants.\n"
				     + " 4.To harvest your groundnut, pull out the plant from the soil"
				     + " and shake off the excess soil attached to the root, \n leaving the pods attached.");
					 		  
			  System.out.println(" ");
				 System.out.println("Basic info related to the selected crop:");
				 System.out.println("        Weather:\t\t\t"+Groundnut.Weather);
				 System.out.println("        Optimum temperature range:\t"+Groundnut.temp1+" to "+Groundnut.temp2);
				 System.out.println("        Average height of the Crop:\t"+Groundnut.height+"cm");
				 System.out.println("                     THANK   YOU   FOR   VISITING                         " );
				  
				 
		  
	  }
	  static void ZaidCrops() {
		 System.out.println(" Below is the list of Crops\n Please Select the one about which you need information  ");
		 System.out.println(" 1. Watermelon\n 2. Muskmelon\n 3. Cucumber\n ");
		 Scanner sc=new Scanner(System.in);
		 int c=sc.nextInt();
		 switch(c)
		 {
		 case 1:main11("");
		 break;
		 case 2:main12("");
		 break;
		 case 3:main13("");
		 break;
		 default :System.out.println("Please select the valid crop");
		 break;
		 }
		 }
	  public static void main11(String args) {
		  Crop Watermelon=new Crop("Dry weather with abundant sunshine",24,27,60);
		  Watermelon.FunctionalityMenu("The fertilizers used are Phosphorus , Potassium and nitrogen  ",
					 " Drip irrigation.",
				     " 1.Make sure the soil is warm. Wait until the soil is consistently 70°F or warmer"
				     + " before planting out your watermelon.\n"
				     + " 2.Remember that watermelon are heavy feeders. Watermelon plants need lots of nutrients.\n"
				     + " 3.Water thoroughly.\n"
				     + " 4.Water wisely. ...\r\n"
				     + " 5.Give your plants space.\n"
				     + " 6.Don't harvest too early.\n"
				     + " 7.Rotate your crops.");
					 		  
			  System.out.println(" ");
				 System.out.println("Basic info related to the selected crop:");
				 System.out.println("        Weather:\t\t\t"+Watermelon.Weather);
				 System.out.println("        Optimum temperature range:\t"+Watermelon.temp1+" to "+Watermelon.temp2);
				 System.out.println("        Average height of the Crop:\t"+Watermelon.height+"cm");
				 System.out.println("                     THANK   YOU   FOR   VISITING                         " );
				  
		  
	  }
	  public static void main12(String args) {
		  Crop Muskmelon=new Crop(" Tropical and subtropical climate,",20,30,38);
		  Muskmelon.FunctionalityMenu(" The fertilizers used are  FYM,NPK,Phosphorus,Potassium and nitrogen ",
					 " Border Strip irrigation.",
				     " 1.Sow seeds 1 inch deep in rows, or in hills spaced 6 feet apart.\n"
				     + " 2.After 2 weeks, thin to 2 plants per hill.\n "
				     + " 3.To prevent insect problems and encourage early growth, cover seedlings with row cover (fleece)\n"
				     + " tunnels until they begin to bloom.");
					 		  
			  System.out.println(" ");
				 System.out.println("Basic info related to the selected crop:");
				 System.out.println("        Weather:\t\t\t"+Muskmelon.Weather);
				 System.out.println("        Optimum temperature range:\t"+Muskmelon.temp1+" to "+Muskmelon.temp2);
				 System.out.println("        Average height of the Crop:\t"+Muskmelon.height+"cm");
				 System.out.println("                     THANK   YOU   FOR   VISITING                         " );
				  
		  
	  }
	  public static void main13(String args) {
		  Crop Cucumber=new Crop("Hot climate,",25,35,90);
		  Cucumber.FunctionalityMenu(" The fertilizers used are Phosphorus,Potassium and nitrogen   ",
					 " Border Strip irrigation.",
				     " 1.Space cucumbers 36 to 60 inches apart (12 inches apart for trellised plants) in an area with\n"
				     + " abundant sun and fertile, well-drained soil with a pH of 6.0 to 6.8.\n"
				     + " 2.Improve native soil by mixing in several inches of aged compost or other rich organic matter. "
				     + " 3.Cucumbers will grow quickly with little care.");
					 		  
			  System.out.println(" ");
				 System.out.println("Basic info related to the selected crop:");
				 System.out.println("        Weather:\t\t\t"+Cucumber.Weather);
				 System.out.println("        Optimum temperature range:\t"+Cucumber.temp1+" to "+Cucumber.temp2);
				 System.out.println("        Average height of the Crop:\t"+Cucumber.height+"cm");
				 System.out.println("                     THANK   YOU   FOR   VISITING                         " );
				  
	  }
	  static void Additionals() {
		  main14("");
	  }
	  public static void main14(String args) {
		  int fname1;
		  String line = null;
	        Scanner scan = new Scanner(System.in);
	        
	        // enter filename along with its extension
	        System.out.print("Enter the choice from given Crop:\n ");
	        System.out.println("\t1.Mango\n\t2.Apple\n ");
	        
	        fname1 = scan.nextInt();
	        if(fname1==1)
	        {
	        try
	        {
	             
	            BufferedReader bufferedReader = new BufferedReader( new FileReader("C:\\\\Users\\\\Shambhavi\\\\Desktop\\\\Juveline Transformer\\\\mango.txt"));
	            
	            while((line = bufferedReader.readLine()) != null)
	            {
	                System.out.println(line);
	            }
	            
	     
	            bufferedReader.close();
	        }
	        catch(IOException ex)
	        {
	            System.out.println("\nError occurred");
	            System.out.println("Exception Name: " +ex);
	        }
	        }
	        else {
	        	try
		        {
		             
		            BufferedReader bufferedReader = new BufferedReader( new FileReader("C:\\\\Users\\\\Shambhavi\\\\Desktop\\\\Juveline Transformer\\\\apple.txt"));
		            
		            while((line = bufferedReader.readLine()) != null)
		            {
		                System.out.println(line);
		            }
		            
		     
		            bufferedReader.close();
		        }
		        catch(IOException ex)
		        {
		            System.out.println("\nError occurred");
		            System.out.println("Exception Name: " +ex);
		        }
		        }
	        	
	        }
	  }

	  
	  


