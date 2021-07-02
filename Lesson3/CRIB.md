# Урок 3. Порождающие шаблоны
  
<details>
<summary>Примеры использования в стандартных библиотеках java (шпаргалка для себя)</summary>

**Factory**:  
  * Многие классы, имеющие метод getInstance(), например java.text.NumberFormat, java.util.Calendar и др.;  
  * Все классы-обертки, которые реализуют метод valueOf();  
  * Выбор кодировки в java.nio.charset.Charset.forNam();  
  * Установка соединения в JDBC - DriverManager.getConnection(URL);  
  * java.lang.Class.newInstance(), java.lang.Class.forName()  

**Abstract Factory**:  
  * javax.xml.parsers.DocumentBuilderFactory#newInstance()  
  * javax.xml.transform.TransformerFactory#newInstance()  
  * javax.xml.xpath.XPathFactory#newInstance()  

**Builder**:
  * java.lang.StringBuilder#append() (unsynchronized)  
  * java.lang.StringBuffer#append() (synchronized)  
  * java.nio.ByteBuffer#put() (также в CharBuffer, ShortBuffer, IntBuffer, LongBuffer, FloatBuffer и DoubleBuffer)  
  * javax.swing.GroupLayout.Group#addComponent()  
  * Все реализации java.lang.Appendable  
  * Lombok (@Builder)

**Prototype** (реализуется через интерфейс Cloneable, имеет методы clone, copy и т.п.):  
  * java.lang.Object#clone()  
  * Spring Framework  

**Singleton**:  
  * java.lang.Runtime#getRuntime()  
  * java.awt.Desktop#getDesktop()  
  * java.lang.System#getSecurityManager()  
  * Spring Framework  
</details>
