package day45_Abstraction;

public interface PropertiesOfInterface {    // interfacede Encapsulation yapamayız nedeni sadece PUBLİC KULLANABİLİYOR OLMAMIZ. PRİVATE KULLANAMAYIZ.

    int a = 100;      // static & final by default
    static int b = 200; // final by default

    /*
    public PropertiesOfInterface(int a){
        this.a = a;
    }
     */

    /*
    static {    // interfacede static blok olamaz
        b = 100;
    }

     */

    /*
    public void method1(){       // instance olamaz çünkü interface de objectk oluşturulmaz.
        System.out.println("Instance method");
    }

     */

    public static void method2() {             // 1 COPYSİ OLACAK SADECE SUB CLASSLARDA
        System.out.println("Static method");
    }

    void method3();  // ABSTRACT METHOD

    default void method4() {             // sub class için ovverride yapmana gerek yok bunu kullanırsan.
        System.out.println("Default method");
    }

}

class Test implements PropertiesOfInterface{   // sub class sadece abstrack methodu ovveride yapmazsan hatta verir.


    @Override
    public void method3() {

    }

    public static void main(String[] args){   // default methodu çağırdık burada alt sınıf için.

        new Test().method4();
    }


}



// interfaceye :  default method- abstract method- static method kullanabiliriz.
// ABSTRACT METHODUN AVANTAJI = HERHANGİ BİR BODYE İHTİYACI YOK.
// Static METHODUN AVANTAJI : İNTERFACE İSMİYLE ÇAĞIRILABİLİR. ALT SINIFLARA. HERHANGİ BİR OBJECTE İHTİYACI YOK.
// İNTERFACEDE = STATİC & FİNAL VERİABLE OLABİLİR SADECE.
// ABSTRACT CLASS NEDEN DAFAULT METHOD KULLANMAZ ÇÜNKÜ İNSTANCE KULLANIYOR . O YÜZDEN GEREK DUYMUYOR. FAKAT İNTERFACE KULLANAMADIĞI İÇİN DEFAULT KULLANIYOR.
// İNTERFACEDE TO STRİNG METHOD OLMAZ ÇÜNKÜ ODA İNSTANCE METHODDUR.
// İNTERFACEDE HEPSİNİ OVERLODİNG YAPABİLİRİZ.
// SUB CLASSLAR interfaceden default methodu nasıl çağıracak : True the object kullanarak.

