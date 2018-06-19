class Complex{
int real,imaginary;
Complex()
{

}
Complex(int real1,int imaginary1)
{
real=real1;
imaginary=imaginary1;
}
Complex addComplex(Complex c1,Complex c2)
{
Complex csum=new Complex();
csum.real=(c1.real+c2.real);
csum.imaginary=(c1.imaginary+c2.imaginary);
return(csum);
}
public static void main(String[] args){
Complex c1=new Complex(4,5);
Complex c2=new Complex(5,6);
Complex c3=new Complex();
c3=c3.addComplex(c1,c2);
System.out.println("sum" +c3.real+"i" +"+" +c3.imaginary);
}
}