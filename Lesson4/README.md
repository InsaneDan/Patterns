#Урок 4. Структурные паттерны  
  
###***Адаптер (Adapter, Wrapper)***
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

###***Мост (Bridge)***
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

###***Компоновщик (Дерево, Composite)***
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

###***Декоратор (Decorator)***
<details>
<summary>Рисуем геометрические фигуры</summary>

* Component - интерфейс Shape;
* Concrete components – Cirle, Star, Triangle – содержат базовое поведение;
* Base Decorator (ShapeDecorator) – базовый декоратор, содержит ссылку на вложенный объект-компонент.
* Concrete Decorators (ColorDecorator, BorderWidthDecorator) – варианты декораторов.
* Client (DemoAppDecorator) – рисует (условно) различные варианты фигур.

</details>


###***Фасад (Facade)***
<details>
<summary>Понятный, но "нерабочий" пример на https://www.baeldung.com</summary>

https://www.baeldung.com/java-facade-pattern  
</details>
<details>
<summary>Система шифрования</summary>

https://examples.javacodegeeks.com/core-java/java-facade-design-pattern-example/
</details>


###***Легковес (Flyweight)***
<details>
<summary>Примеры использования Flyweight + Factory</summary>

Подсмотрено на:

https://www.learn-it-with-examples.com/development/java/java-design-patterns/java-flyweight.html
https://refactoring.guru/ru/design-patterns/flyweight/java/example
</details>


###***Заместитель (Прокси, Proxy)***
<details>
<summary>Пример использования Proxy + Decorator (копипаст)</summary>

Источник: https://refactoring.guru/ru/design-patterns/proxy/java/example
</details>
