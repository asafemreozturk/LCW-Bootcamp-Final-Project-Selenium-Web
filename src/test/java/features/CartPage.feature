@CartPage
Feature: Cart Page

  @UrunEkleme
  Scenario Outline: Sepete Urun Ekleme
    Given Uygulama acilir
    When Arama cubuguna <bluz> yazilir
    Then Ara butonuna tiklanir
    When Filtreden siyahı seç
    Then Ürünü seç
    When Sepete ekleye tiklanir
    Then Sepete gidilir
    Then Urunun <model> kontrol edilir
    Examples:
      | bluz   | model     |
      | "Bluz" | "S2FU58Z8 - RQL" |


  @UrunOdeme
  Scenario Outline: Sepete Urun Ekleme ve Odeme
    Given Uygulama acilir
    When Arama cubuguna <bluz> yazilir
    Then Ara butonuna tiklanir
    When Filtreden siyahı seç
    Then Ürünü seç
    When Sepete ekleye tiklanir
    Then Sepete gidilir
    Then Urunun <model> kontrol edilir
    When Odeme adımına gec butonuna tıklanır
    Then Uye olmadan siparis kısmına <email> yazılır
    Then Kullanım sözlesmesi tıklenir
    Then Uye olmadan devam et butonuna tıklanır
    Examples:
      | bluz   | model     | email  |
      | "Bluz" | "S2FU58Z8 - RQL" | "sdsds@gmail.com" |


