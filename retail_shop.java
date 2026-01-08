class retail_shop {
    public static void main(String[] args) {
           int itema=100, itemb=50, itemc=400;
           double price;
           price = ((itema*2)+(itemb)+(itemc*3));
           price = price-(.1*price);
           price = price + (0.05*price);
           System.out.println(price);
   }
}