package com.polymorphism.interfes;

public class KelasMain {
    public static void main(String[] args) {
        IBunga bunga = new IBunga() {
            @Override
            public void mekar() {
                System.out.println("Bunga Mekar");
            }

            @Override
            public void tumbuh() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mati() {
                System.out.println("Bunga layu sebelum mati");
            }
        };
        
        bunga.mekar();
        bunga.mati();
        Polymorp poly = new Polymorp();
        poly.polyTest(new ILavender());
        poly.polyTest(new ILily());
    }
}
