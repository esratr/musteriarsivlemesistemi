## MÜŞTERİ ARŞİVLEME SİSTEMİ

Bu projede Java ile Spring Boot backend , database olarak da PostgreSQL kullanılmıştır.

DB Er diagramı Jpeg dosyası olarak ve java kodları eklenmiştir.

SOLID prensipleri ve DesignPattern kurallarına dikkat edilerek oluşturulmuştur.

## * Dependencies:
-Spring Boot DevTools
-Spring Web
-Spring Data JPA
-PostgreSQL Driver
-Lombok

Her controllerın kendine ait servisleri ve repoları oluşturuldu. 
Service katmanımızda abstract ve concretes olarak iş sınıflarımızı oluşturmuş olduk. İmplemantasyon yaparak interfacelerde oluşturduğumuz metotları classlarda işlendi.

Entityler SystemUser , Customer , File olarak oluşturuldu.
Customer ve File arasında bire çok ilişki , Filedan Customer a ise çoktan bire ilişki verilerek iki entity arasında bağ kuruldu.

## Database
![müsterisistemdb](https://user-images.githubusercontent.com/38962792/124757130-f3b63f00-df35-11eb-9698-c0e52ed3eced.PNG)


