enum Mobile {
SAMSUNG,ONEPLUS,NOKIA,VIVO,OPPO
}
public class MobileTester{
public static void main(String[] brands)
{

System.out.println("invoked main,mobile name using enum");
for(int name=0;name<brands.length;name++){
Mobile mobileName=Mobile.valueOf(brands[name]);

System.out.println("Mobile name  "+mobileName);
}

}
}
