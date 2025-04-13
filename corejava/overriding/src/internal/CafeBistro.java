package internal;

public class CafeBistro extends Bistro{
    @Override
    public void serveDish() {
        System.out.println("CafeBistro is serving artisanal coffee and snacks");
    }
    public void brewSpecialCoffee() {
        System.out.println("Brewing a special blend of coffee");
    }
}
