class IfElseDemo
{
public static void main(String[] args)
{
int testscore=95;
char Grade;

	if(testscore>=90){
	Grade='A';
	}else if(testscore>=75){
	Grade='B';
	}else if(testscore>=65){
	Grade='C';
	}else if(testscore>=58){
	Grade='D';
	}else{Grade='F';}
	System.out.println("Grade:"+Grade);
}
}