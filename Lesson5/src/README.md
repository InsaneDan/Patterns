#Урок 4. Поведенческие паттерны  
  
###***Цепочка обязанностей (Chain of Responsibility)***
<details>
<summary>Обработка файла в цепочке хэндлеров в зависимости от типа (расширения)</summary>

* Клиент формирует последовательность выполнения обработчиков  
* Имеется общий интерфейс (Handler) и его конкретные реализации (TextFileHandler, DocFileHandler, ExcelFileHandler, AudioFileHandler, VideoFileHandler, ImageFileHandler)    
* File – "имитация" файла, содержит поля *наименование* и *тип* файла

Воспроизведено с https://www.javacodegeeks.com/2015/09/chain-of-responsibility-design-pattern-2.html
</details>

###***Команда (Command)***
<details>
<summary>Выполнение очереди команд</summary>

* в пакете Actions находятся классы, выполняющие определенные действия
* Command – общий интерфейс команд с единственным методом run
* Invokers: реализуют общий интерфейс Command и инкапсулируют действия классов из пакета Actions
* Reciever: CommandQueue – создает пул рабочих потоков, которые ожидают появление команды в очереди, 
выполняют, удаляют из очереди и ожидают следующую команду. Когда очередь команд опустошается, закрывается пул потоков.
* клиент (DemoAppCommand) – создает очередь из 20 команд (в цикле из 5 итераций по 4 команды) и запускает несколько 
потоков, в каждом из которых выполняется одна команда

Воспроизведено с https://www.javacodegeeks.com/2015/09/command-design-pattern.html
</details>

###***Интерпретатор (Interpreter)***
<details>
<summary>Интерпретатор даты текущей даты в зависимости от заданного формата</summary>

Воспроизведено с https://examples.javacodegeeks.com/core-java/java-interpreter-design-pattern-example/
</details>

<details>
<summary>Управление данными о сотрудниках</summary>

Копипаст с https://dzone.com/articles/using-interpreter-design-pattern-in-java
</details>

###***Итератор (Iterator)***
<details>
<summary>Итератор ArrayList'а</summary>
самый простой вариант, проверяется только следующий элемент (hasNext)
</details>

###***Медиатор (Mediator)***
<details>
<summary>GUI для хранилища заметок</summary>
Посредник/Медиатор размещает элементы на форме, получает от них извещения о событиях и выполняет 
соответствующие действия.

Копипаст с https://refactoring.guru/ru/design-patterns/mediator/java/example
</details>

###***Мементо (Memento)***
<details>
<summary>Сохранение состояния "условного" документа</summary>

Сохранение состояния небольшого объекта (3 поля), изменение значений полей и откат в исходное состояние.

Воспроизведено с https://examples.javacodegeeks.com/core-java/java-memento-design-pattern-example/
</details>







