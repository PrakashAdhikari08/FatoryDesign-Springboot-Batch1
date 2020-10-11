# FatoryDesign-Springboot-Batch1

The design is implemented using ServiceLocatorFactoryBean.

This approach is handy when we have multiple implementation of an interface and want to create bean during runtime.

1. Create an interface ---- That will be implemented by services.
** make sure you have generic type means <T> (ShapeService.java interface)

2. Create services and implement the interface with Generic type being the bean determiner entity or modal. ( Service implements ShapeService<Shapes>)

3. Once implemneted create another interface that is for factory design  and create a method. (ShapeFactory.java interface)

4. Configure the FactoryBean 
@Bean
    public FactoryBean<?> factoryBean(){
        final ServiceLocatorFactoryBean bean = new ServiceLocatorFactoryBean();
        bean.setServiceLocatorInterface(ShapeFactory.class); //*** this class is the one that is used for bean defination during runtime. 
        return bean;
    }
  
 5. Create Controller and autowire the Factory interface used for FactoryBean and call the service implemented methods.
 
 6. Run the application by passing the Shape name on path variable make sure you pass  the exact name as of the Services on path variable.
