## Условия домашки

---
### Задание
Напишите небольшой библиотечный справочник, где хранится информация о книгах.

1. Создайте класс
   ```Book```, который будет содержать в себе данные о названии, авторе и годе публикации книги. Убедитесь, что типы полей класса Book выбраны правильно: это
   ```String```,
   ```Author``` и ```int```.
1. Создайте класс
   ```Author```, который содержит в себе данные об имени и фамилии автора.
1. Напишите конструкторы для обоих классов, заполняющие все поля.
1. Создайте геттеры для всех полей автора и всех полей книги.
1. Создайте сеттер для поля «Год публикации» у книги.
1. В методе
   ```main``` создайте несколько объектов «Книга» (достаточно двух) и несколько объектов «Автор» (достаточно тоже двух) и инициализируйте их. Учтите, что авторы являются обязательными и книги не могут создаваться без авторов.
   Метод
   ```main``` не должен находиться в классах
   ```Book``` и ```Author```.
   Создайте отдельный класс для запуска приложения и объявите метод ```main```
   в нем.
1. В том же методе
   ```main```
   измените год публикации одной из книг с помощью сеттера.
---
Теперь, когда вы изучили геттеры и сеттеры, не оставляйте поля открытыми — то есть без модификатора доступа
```private```
.
---
<details>
  <summary>Подсказка</summary>

При вызове переменных с объектом в методе
main
сначала вызовите переменную ```Author```, а уже после — переменную
```Book```. Это нужно, чтобы при записи имени переменной
```Author```
в значение переменной
```Book```
не возникало ошибки.
</details>
<details>
  <summary>Критерии оценки</summary>

- Классы созданы корректно через конструктор.
- Поля созданы корректно.
- Использованы корректные имена и типы.
- Классы имеют все необходимые геттеры и сеттеры.
- Созданы объекты в методе
  ```main```.
</details>

---
### Часто спрашивают
<details>
  <summary>Вопрос</summary>

Есть ли разница между созданием класса как отдельного файла через левую панель
```project```
→
```new```
→
```java class```
(и тогда класс открывается в отдельной вкладке IDEA) и простым написанием через
```public class```
в уже созданном классе с
```homework8```?
<details>
  <summary>Ответ</summary>

Разница есть. Когда класс создается не через
```new```
→
```java class```, то создается внутренний класс. Нам пока не подходит и не нужен этот функционал.
</details>
</details>