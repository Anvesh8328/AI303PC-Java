import java.util.Scanner;
void main(){
	IO.println("enter name of model of phones:");
 	String cname = new Scanner(System.in).nextLine();
 	String str = switch(cname){
 		case "iPhone15","iPhone14"->{
 				yield "Apple";
 			}
 		default->{
 			yield "the model is not found";
 			}
 	};
 	IO.println(str);
 	
}