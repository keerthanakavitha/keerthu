class program
{
public static void main(String[]args)
{
char c,lowercase=0,uppercase=0;
System.out.println("enter the character:"+c);
lowercase=(c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
uppercase=(c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
if(lowercase||uppercase)
System.out.println("is a vowel"+c);
else
System.out.println("is a consonant"+c);
}
}
