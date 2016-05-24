package com.polymorphism.interfes;

public class ILavender implements IBunga {

    @Override
    public void mekar() {
        System.out.println("Tahap kedua dalam kehidupan bunga adalah mekar");
    }

    @Override
    public void tumbuh() {
        System.out.println("Tahap awal dalam kehidupan bunga adalah tumbuh");
    }

    @Override
    public void mati() {
        System.out.println("Tahap akhir dalam kehidupan bunga adalah layu sampai akhirnya mati.");
    }
    
    public void layu() {
        System.out.println("Bunga Layu karena kurang perawatan atau sudah waktunya mati.");
    }
}
