# ![Patterns_UML logo](https://github.com/InsaneDan/InsaneDan/blob/main/UML_logo_80x80.png) Архитектуры и шаблоны проектирования на Java

<details>
<summary>Урок 1. Архитектура Java-приложений</summary>
  
1. Установить IBM Rational Software Architect Designer, Modelio Open Source или другую похожую систему.  
a. https://www.ibm.com/developerworks/downloads/r/architect/index.html  
b. https://www.modelio.org/downloads/download-modelio.html  
c. http://staruml.io/  
2. Выбрать архитектуру домашнего CRM или ERP приложения. Обосновать выбранное решение.
</details>

<details>
<summary>Урок 2. Принципы и шаблоны проектирования</summary>
  
  1. Для домашнего проекта составить полную диаграмму классов. Какие классы будут присутствовать в системе? Какие атрибуты и методы они должны иметь? Какие из методов и атрибутов следует сделать публичными, а какие – приватными? Где можно применить наследование классов?
  2. Выделить три основных, на ваш взгляд, процесса, происходящих в проектируемой системе. Изобразить для этих процессов диаграммы последовательностей.
  
  ***Lesson 2 homework: Visual Paradigm class and sequens diagrams (e-commerce project.vpp)***  
  – диаграмма классов: описывает отношения сущностей базы данных в проекте интернет-магазина  
  – диаграмма последовательности: описывает цепочку событий при авторизации пользователя в системе (проверка логина и пароля), при смене пароля (forget password) и при выходе из аккаунта (logout)  
</details>

<details>
<summary>Урок 3. Порождающие шаблоны</summary>
  
1. Реализовать как минимум один порождающий паттерн в своем домашнем приложении.

***Lesson 3 homework: Пример Factory Method (Virtual Constructor)***
Приложение создает и отправляет пользователю напоминания. Варианты "напоминалок" – смс, e-mail, сообщение в чат, телефонный звонок.
(создает и отправляет - условно, без реализации)
</details>

<details>
<summary>Урок 4. Структурные паттерны</summary>

-----------------------------------
1. ***Адаптер (Adapter, Wrapper)***
  
<details>
<summary>Вариант 1. Выдача кредитной карты клиенту</summary>

* Адаптер (Wrapper) предоставляет клиенту требуемый интерфейс, при этом использует функционал класса с другим (несовместимым) интерфейсом.  
* Target: CreditCard - требуемый клиентом интерфейс.  
* Adaptee: BankDetails - адаптируемый класс, функциональность которого использует адаптер, а результаты "отдает" клиенту.  
* Adapter: BankCustomer - класс-обертка, который содержит требуемый интерфейс и измененную функциональность адаптируемого класса.  
* Client: DemoAdapter - взаимодействует с классом-адаптером.
</details>
<details>
<summary>Вариант 2. Плейер, который должен воспроизводить аудио из видео-файлов </summary>

* Имеется класс AudioPlayer, реализующий интерфейс MediaPlayer, по умолчанию может воспроизводить mp3-аудио файлы.  
* Также имеется интерфейс AdvancedMediaPlayer и реализующие его классы, которые воспроизводят файлы других форматов (avi, mov, mp4, midi).  
* С помощью класса MediaAdapter (имеет интефрейс MediaPlayer и использует объекты AdvancedMediaPlayer) добавляем AudioPlayer'у возможность воспроизводить файлы других форматов, не зная конкретные классы, которые это реализуют.  
* Клиент - DemoAppAdapter - запускает различные типы файлов в AudioPlayer'е.

Идея взята на https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
</details>

-----------------------------------
2. ***Мост (Bridge)***
<details>
<summary>Процесс производства печатной продукции в типографии (упрощенно)</summary>

Имеется типография, которая выпускает различную печатную продукцию: постеры, блокноты, 
журналы, книги. Ассортимент может быть разнообразным и может меняться (например, 
блокноты разных цветов). В перспективе ассортимент может быть расширен - листовки, 
газеты, ежедневники, календари и т.д.  
Каждое изделие при изготовлении проходит ряд этапов. Для изделий не реализуются 
отдельные этапы (например, WritingBook, CopyeditingBook, DesignBook и т.д.), а создается 
"производственная цепочка" (workFlows).  
Интерфейс WorkFlow будет связующим элеметном (bridge) между выпускаемыми продуктами и 
этапами производства.  

Участники паттерна «Bridge»:
* Abstarction (PrintMatter): определяет интерфейс абстракции и хранит ссылку на объект Implementor;
* RefinedAbstraction (Book, Magazine, Notepad, Poster): расширяет интерфейс определённый Abstraction;
* Implementor (WorkFlow): определяет интерфейс реализации. Интерфейс реализации необязательно должен совпадать с интерфейсом абстрации;
* ConcreteImplementor (WritingWorkFlow, CopyeditingWorkFlow, DesignWorkFlow, PrintingWorkFlow, BindingWorkFlow, ShippingWorkFlow): содержит конкретную реализацию интерфейса класса Implementor;
* Client (DemoAppBridge): использует объекты Abstraction.
</details>

-----------------------------------
3. ***Компоновщик (Дерево, Composite)***
<details>
<summary>Иерархическая структура отделов в организации – Departments</summary>

* Component (интерфейс Department) – общий интерфейс для простых и составных компонентов дерева;
* Leafs (FinancialDepartment, SalesDepartment) – оба реализуют базовый интерфейс с методом
  printDepartmentName(), не содержат ссылок на другие объекты;
* Composite (HeadDepartment) – композит или контейнер, содержит набор дочерних компонентов (листья
  или контейнеры), реализует базовый интерфейс и определяет функционал дочерних элементов.
* Client (DemoAppComposite) – работает со структурой через общий интерфейс компонентов.
</details>

<details>
<summary>Иерархическая структура (дерево) сотрудников – Employees</summary>

Компоновщиком является класс Employee, клиентом – DemoAppCompositeEmployee.
Клиент создает элементы структуры: "контейнеры" – CEO и начальники отделов, листья – сотрудники отделов. 
</details>

-----------------------------------
4. ***Декоратор (Decorator)***
<details>
<summary>Рисуем геометрические фигуры</summary>

* Component - интерфейс Shape;
* Concrete components – Cirle, Star, Triangle – содержат базовое поведение;
* Base Decorator (ShapeDecorator) – базовый декоратор, содержит ссылку на вложенный объект-компонент.
* Concrete Decorators (ColorDecorator, BorderWidthDecorator) – варианты декораторов.
* Client (DemoAppDecorator) – рисует (условно) различные варианты фигур.

</details>


-----------------------------------
5. ***Фасад (Facade)***
<details>
<summary>Понятный, но "нерабочий" пример на https://www.baeldung.com</summary>

https://www.baeldung.com/java-facade-pattern  
</details>
<details>
<summary>Система шифрования</summary>

Фасад предоставляет единый интерфейс и упрощает работу с разными компонентами системы.
</details>


-----------------------------------
6. ***Легковес (Flyweight)***
<details>
<summary>Примеры использования Flyweight + Factory</summary>

Подсмотрено на:

https://www.learn-it-with-examples.com/development/java/java-design-patterns/java-flyweight.html
https://refactoring.guru/ru/design-patterns/flyweight/java/example
</details>


-----------------------------------
7. ***Заместитель (Прокси, Proxy)***
<details>
<summary>Пример использования Proxy + Decorator (копипаст)</summary>

Источник: https://refactoring.guru/ru/design-patterns/proxy/java/example
</details>

  
-----------------------------------

</details>

<details>
<summary>Урок 5. Поведенческие шаблоны</summary>

  1. Реализовать как минимум один поведенческий паттерн в своем приложении.
</details>

<details>
<summary>Урок 6. Архитектурные системные паттерны. Часть 1</summary>

</details>

<details>
<summary>Урок 7. Архитектурные системные паттерны. Часть 2</summary>

</details>

<details>
<summary>Урок 8. Антипаттерны</summary>

</details>
