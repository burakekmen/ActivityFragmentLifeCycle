# ActivityFragmentLifeCycle

# Amaç

1. Git - GitHub becelerinin arttırılmasını sağlamak.
2. Fragment kullanımı öğrenmek.
3. Activity üzerine Fragment'ı ekleme yollarını araştırmak.
4. Activity Fragment Yaşam Döngüsünde (LifeCycle) eklenme sırasında neler değiştiğini kavramak.
5. Activity Fragment kullanım mantığının yerleşmesini sağlamak.

# İsterler

1. Projeyi "Fork" ediniz.
2. Master branch'inden yeni bir branch oluşturunuz.
3. Branch ismine kendi adınızı ve soyadınızı verin. Örn. ("GökhanÖztürk)
4. Bir Activity ve XML oluşturun. Activity ve XML oluştururken isimlendirme standartlarına dikkat ediniz.
5. Activity'nizin içerisine aşağıdaki methodları yazınız - sıralaması önemli değil:
  * onCreate()
  * onStart()
  * onRestoreInstanceState()
  * onResume()
  * onPause()
  * onSaveInstanceState()
  * onStop()
  * onDestroy()
  * onRestart()
  * onAttachFragment()
6. Yukarıdaki methodların içerisine Log.e methodunu kullanarak; ilk string'e kendinizin belirlediği bir String TAG,
ikinci String'e ise method isimlerini yazınız.
7. Üç adet Fragment ve bu Fragment'lara ait XML dosyalarını oluşturun. İsimlendirme standartlarına dikkat ediniz.
8. Fragment'ları aşağıdaki ekran görüntüsünde olduğu gibi yerleştiriniz.

![alt text](https://github.com/AndroidEduIO/ActivityFragmentLifeCycle/blob/master/app/src/main/res/drawable/Fragment.PNG)

9. Bu Fragment düzenini sağlarken A ve B Fragment'ını XML üzerinden C Fragment'ını ise Activity içerisinde, ID kullanarak, 
çalışma zamanında (run time) programmatically olarak ekleyiniz.
10. Eklediğiniz Fragment'ların içerisine aşağıdaki methodları yazınız - sıralaması önemli değil:
  * onCreate()
  * onCreateView()
  * onActivityCreated()
  * onStart()
  * onResume()
  * onPause()
  * onStop()
  * onDestroy()

 11. Yukarıdaki methodların içerisine Log.e methodunu kullanarak; ilk string'e kendinizin belirlediği bir String TAG,
ikinci String'e ise method isimlerini yazınız.
12. Log'ları yorumlayarak bir Fragment'ı XML içerisinde eklemek ile Activity içerisinde, ID kullanarak, çalışma zamanında (run time)
programmatically olarak eklemek arasında nasıl bir fark olduğunu araştırıp, projeniz içerisindeki README.md dosyasının içerisini 
silerek README.md içerisine bu bilgileri yazınız.
13. Hangi durumda Fragment, hangi durumda Activity kullanılması gerektiğini yine bu README.md dosyasına yazınız.
14. Hangi durumda Fragment'ı programmatically, hangi durumda XML içerisinde ekleyeceğimizi yorumlayıp yine README.md içerisine yazınız.
15. Programmatically yüklemek ile XML içerisinde eklemek arasında bir performans farkı olup olmadığını araştırıp README.md içerisine yazınız.
16. Yazdığınzı kodları Push'layınız. Ve bu adres üzerindeki ana projeye Pull Request (PR) atınız.

# En başarılı PR proje'ye "orjinal cevap" olarak kabul edilecektir.

***************************************
12. Bir Fragment'ı XML içerisine eklemek kod ile eklemeye nazaran daha önce çizdirilir. Mesela activity_main.xml dosyasını çizerken içerisinde bulunan diğer elementlerin de çizim işlemleri yapılması için onların tanımlaması yapılır. XML içerisindeki tanımlamalar bittiğinde onCreate() içerisindeki kodlar devreye girer. Ve bu aşamada da koddaki fragment taımlanır ve aktif edilir.

13. Görev tanımı kesin ve birbirinden farklı olan ekranlar için Activity, İçerisinde bulunan görev benzer ve birçok işlemde de ekran içerisinde çok fazla içerik ve tasarım değişmiyor ise Fragment kullanılması daha uygun görülür.

14. Fragment dosyamızı eğer işlemi önemli ise XML dosyamıza gömebiliriz. Eğer activity_main.xml dosyası yaratıldıktan sonra çalışmasında sıkıntı olmayacak bir durumda ise kod yöntemi ile eklenebilir.

15. XML içerisine gömdüğümüz fragment dosyamız daha hızlı oluşturulup yanıt verir. Kapsamlı ve büyük projeler için gözardı edilemeyecek artı bir özellik olarak görülebilir. Kod ile eklenen fragment dosyası onCreate() metodundan sonra aktive duruma geçeceği için geç devreye girer ve böyle bir durum büyük projelerde can sıkıcı bir özellik olabilir.
	Küçük çaplı projeler için bu iki yöntem arasından herhangi birini seçsekte arada çok fazla bir fark göremeyiz. Bu farklar projenin boyutu artınca kendini gösterecektir.
