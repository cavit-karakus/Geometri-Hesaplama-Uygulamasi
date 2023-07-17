# Geometri-Hesaplama-Uygulamasi

Bu proje, geometrik şekillerin alanını ve çevresini hesaplayan bir uygulama içermektedir.
İki sınıf ve bir arayüz bulunmaktadır: Sekil, Dikdortgen ve Daire.

--------------------------------------------------------------------
Sekil Arayüzü

Sekil arayüzü, geometrik şekillerin alanını ve çevresini hesaplamak için kullanılır. 

Bu arayüzde iki metot tanımlanmıştır:

alanHesapla Metodu:

"double alanHesapla();"

Dönüş Değeri: Hesaplanan şeklin alanı (double).

-------------------------------------------------------------------
cevreHesapla Metodu :

"double cevreHesapla();"

Dönüş Değeri: Hesaplanan şeklin çevresi (double).

-----------------------------------------------------------------

Dikdortgen Sınıfı

Dikdortgen sınıfı, Sekil arayüzünden türetilmiş olup, dikdörtgen şekillerinin alanını ve çevresini hesaplamak için kullanılır.

Kurucu Metod:

"public Dikdortgen(double uzunKenar, double kisaKenar)"

----------------------------------------------------------------------
Parametreler:

uzunKenar: Dikdörtgenin uzun kenarı (double).

kisaKenar: Dikdörtgenin kısa kenarı (double).

-----------------------------------------------------------------
alanHesapla Metodu:

public double alanHesapla()

Dönüş Değeri: Dikdörtgenin alanı (double)

------------------------------------------------------------------------
cevreHesapla Metodu:

public double cevreHesapla()

Dönüş Değeri: Dikdörtgenin çevresi (double).

---------------------------------------------------------------------

Daire Sınıfı

Daire sınıfı, Sekil arayüzünden türetilmiş olup, daire şekillerinin alanını ve çevresini hesaplamak için kullanılır.


Kurucu Metod:

"public Daire(double yariCap)"

---------------------------------------------------------------------------
Parametreler:

yariCap: Dairenin yarıçapı (double).

----------------------------------------------------------------------------
alanHesapla Metodu:

"public double alanHesapla()"

Dönüş Değeri: Dairenin alanı (double).

---------------------------------------------------------------------

cevreHesapla Metodu:

public double cevreHesapla()

 Dönüş Değeri: Dairenin çevresi (double).

 --------------------------------------------------------------------------
Main Sınıfı

Main sınıfı, örnek dikdörtgen ve daire oluşturarak alan ve çevre hesaplamalarını gerçekleştirir ve sonuçları ekrana yazdırır.

Dikdortgen dikdortgen = new Dikdortgen(5, 3);

double dikdortgenAlani = dikdortgen.alanHesapla();

double dikdortgenCevresi = dikdortgen.cevreHesapla();

System.out.println("Dikdörtgen Alanı: " + dikdortgenAlani);

System.out.println("Dikdörtgen Çevresi: " + dikdortgenCevresi);

-------------------------------------------------------------------------------------------
Daire daire = new Daire(4);

double daireAlani = daire.alanHesapla();

double daireCevresi = daire.cevreHesapla();

System.out.println("Daire Alanı: " + daireAlani);

System.out.println("Daire Çevresi: " + daireCevresi);

---------------------------------------------------------------------------------------

Yukarıdaki örnek kodda, bir dikdörtgen ve bir daire örneği oluşturulur.

Bu örnekler üzerinde alan ve çevre hesaplamaları gerçekleştirilir ve sonuçlar ekrana yazdırılır.

Bu projede arayüzler ve sınıflar kullanılarak nesneye yönelik programlama prensipleri (soyutlama) uygulanmıştır.








