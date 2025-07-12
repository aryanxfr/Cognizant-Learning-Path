# 🌱 Spring XML Configuration – Key Concepts Explained

When working with Spring's XML configuration style, you'll often encounter certain tags and classes. Here's a quick and clear guide to understand what each of them does:

| 🔧 Element / Concept               | 💬 What It Means                                                                 |
|----------------------------------|----------------------------------------------------------------------------------|
| `<bean>` tag                     | Tells Spring to manage a Java object (a bean) for you.                          |
| `id` attribute                   | A unique name you assign to the bean so you can fetch it later in code.         |
| `class` attribute                | The full class name of the Java object that Spring should create.               |
| `<property>` tag                 | Used to set values in the bean's fields using setters.                          |
| `name` attribute (inside `<property>`) | Matches the Java property name (used by `setName()` etc.).               |
| `value` attribute                | The actual value that gets injected into the property.                          |
| `ApplicationContext`             | The main Spring container that reads config and creates all the beans.          |
| `ClassPathXmlApplicationContext` | A specific implementation of `ApplicationContext` that reads an XML file from your project’s `classpath`. |
| `context.getBean("id", Class)`   | Used in code to retrieve a specific bean (by ID) from the Spring container.     |

