package com.example.kotlinzoomders1.odevler

import android.health.connect.datatypes.units.Length


//1-Parametre olarak girilen dereceyi fahrenhiet'a dönüştürdükten sonra geri döndüren(return) metod yazınız.

fun fDonustur(derece:Int) : Double {  //Return demek bir şey döndürmek demek yani geri dönüş tipini koymak zorundasın :))
    val sonuc=derece*1.8+32
    return sonuc

}

//2-Kenarları parametre olarak girilen ve dikdörtgenin çevresini hesaplayan bir metod yazınız.
//Return kullanmadım void kullanırsak amaç direkt sonucu yazdırmak printi burda kullanırız.

fun cevreHesapla(en:Int,boy:Int)  {
    val cevre = (en + boy) * 2
    println("Dikdortgenin cevresi: $cevre")

}

//3-Parametre olarak girilen sayının faktoriyel değerini hesaplayıp geri döndüren metod yazınız.

fun faktoriyel(sayi:Int):Int{ //geri dönüş değerini belirttik
    var sonuc=1
    for(i in sayi downTo 1) //sayi değerini i ye atar sırayla
    {
        sonuc*=i
    }
    return sonuc

}

//4-Paramtere olarak girilen kelime içinde kaç adet a harfi olduğunu gösteren metod
//a harfi gördüğünde sayaç artmalı

fun harfSayaci(kelime:String) {
    var sayac = 0
    for (harf in kelime) {
        if (harf == 'a' || harf == 'A') {
            sayac++
        }

    }
    println("Kelime icindeki a harfi sayisi : $sayac")
}

//5-Parametre olarak girilen kenar sayısına göre iç açılar toplamını hesaplayan,sonucu geri döndüren metod yazın.

fun icAcilarToplami(kenar_sayisi:Int) : Int {
    val toplam_sonuc=(kenar_sayisi-2)*180
    return toplam_sonuc
}

//6-Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren metod yazın.
//1 günde 8 saat calisma
//calisma saat ücreti 10
//mesai saat ücreti 20
//160 saat üzeri mesai

fun maasHesapla(gun:Int): Int {
    val saat=gun*8
    val maas=160*10 //160 saat icin normal maas
    if(saat>160)
    {
        val mesai_saatleri=saat-160
        val mesai_maas=mesai_saatleri*20
        return maas+mesai_maas

    }
    else{
        return saat*10 //mesai yoksa normal maasi yazdırır
    }

}


//7-Parametre olarak girilen kota miktarına göre ücreti hesaplayarak geri döndüren metodu yazınız
//50GB=100TL
//Kota aşımından sonra her 1GB,4tl

fun ucretHesapla(kota_miktari:Int):Int{
    val n_ucret=100
    if(kota_miktari>50)
    {
        val kota_asimi=kota_miktari-50
        val kota_ucret=kota_asimi*4+n_ucret
        return kota_ucret
    }
    else{
        val ucret=kota_miktari*2
        return ucret
    }

}





