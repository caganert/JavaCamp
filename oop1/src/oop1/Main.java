package oop1;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("xyz.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(8);
        product2.setUnitsInStock(5);
        product2.setImageUrl("xyz2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setUnitsInStock(2);
        product3.setImageUrl("xyz3.jpg");

        Product[] products = {product1, product2, product3};

        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhoneNumber("051111111");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Çağan Ege");
        individualCustomer.setLastName("Ertuğrul");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setPhoneNumber("0522222222");
        corporateCustomer.setCustomerNumber("54321");
        corporateCustomer.setCompanyName("ERT Yazılım");
        corporateCustomer.setTaxNumber("9999999");

        Customer[] customers = {individualCustomer, corporateCustomer};

    }
}