# SpringInAction

Spring is light weighted Framework ,i.e Framework of Framework because it supports various frameworks such as Structs, Hibernate , security , EJB etc , in broader sense,
it can be defined as a structure where we can find solution for various technical problems 

The spring framework comprises several modules such as IOC , AOP , DAO ,ORM , MVC ,JPA


Inversion of Control / Dependency Injection 

These are the design pattern that are used to remove the Dependency from the programming code. 
_Dependency Injection makes the code easier to test and maintain_ 
_The IOC/DI makes the code as loosely coupled_, In such case we do not need to modify the code , if our logic is moved to new environment 

IOC container is responsible to inject the dependency, we provide metadata to the IOC container either by XML file or annotation 
 the main task performed by IOC container are 
 1. instantiate the application class
 2. to configure the object 
 3. to assemble the dependencies between the objects

There 2 types of IOC containers 
1. Bean Factory 
2. Application Context 


Bean Factory vs Applicaiton Context 

1. org.springframework.beans.factory.BeanFactory and org.springframework.context.ApplicationContext interfaces acts as the IOC container 

The ApplicationContext interface is built on top of the BeanFactory Interface. its adds some extra functionality than BeanFactory such as 
Simple intergation with Spring AOP , message resouce handling , webapp context , so its better to use Application context than Bean Factory

UsingBeanFactory: 

Resource resource = new ClassPathResource("applicationContext.xml");
BeanFactory factory = new XmlBeanFactory(resource);

Application Context 

ApplicationContext context = new ClassPathApplicationContext("applicationContext.xml");


