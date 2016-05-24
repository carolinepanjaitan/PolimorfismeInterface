package com.polymorphism.interfes;

public class ILily implements IBunga {

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
        System.out.println("Tahap akhir dalam kehidupan bunga adalah mati");
    }
    
     public void layu() {
        System.out.println("Bunga Layu karena kurang perawatan atau sudah waktunya mati.");
    }
    
}
