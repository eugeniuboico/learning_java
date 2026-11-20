package org.example.Homework.hw15;

import org.example.Homework.hw15.behavior.Touchscreen;
import org.example.Homework.hw15.customer.Customer;
import org.example.Homework.hw15.customer.Order;
import org.example.Homework.hw15.products.Product;
import org.example.Homework.hw15.products.accessories.LogitechMouse;
import org.example.Homework.hw15.products.accessories.UsbCharger;
import org.example.Homework.hw15.products.business.ThinkPadT14;
import org.example.Homework.hw15.products.gaming.AsusRogStrix;
import org.example.Homework.hw15.products.gaming.LenovoLegion5;
import org.example.Homework.hw15.products.ultrabooks.DellXps13;
import org.example.Homework.hw15.products.ultrabooks.MacbookAir;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AsusRogStrix asus = new AsusRogStrix();
        LenovoLegion5 legion = new LenovoLegion5();
        MacbookAir mac = new MacbookAir();
        DellXps13 dell = new DellXps13();
        ThinkPadT14 thinkPad = new ThinkPadT14();
        LogitechMouse mouse = new LogitechMouse();
        UsbCharger charger = new UsbCharger();


        List<Product> shop = List.of(asus, legion, mac, dell, thinkPad, mouse, charger);
        System.out.println("\nShop");
        for (Product product : shop) {
            product.describe();
        }


        System.out.println("\nTouchscreen test");
        for (Product product : shop) {
            if (product instanceof Touchscreen touchscreen) {
                touchscreen.touch();
            }
        }

        System.out.println("\nShopping");
        Customer Eugen = new Customer("Eugen", 2000);
        Eugen.addToCart(legion);
        Eugen.addToCart(mouse);
        Eugen.addToCart(charger);
        Order order = Eugen.checkout();
        System.out.println(order);
        System.out.println(Eugen);

        Customer lera = new Customer("Lera", 1000);
        lera.addToCart(legion);
        lera.addToCart(mac);
        System.out.println(lera.checkout());

        System.out.println("\nRestock");
        legion.restock(2);
        charger.restock(5);
    }
}
