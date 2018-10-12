/*
package guru.springframework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean(){
        System.out.println("-----LifeCycleBean constructor-----");
    }

    @Override
    public void destroy() throws Exception{
        System.out.println("-----LifeCycleBean has been terminated-----");
    }

    @Override
    public void afterPropertiesSet() throws Exception{
        System.out.println("-----LifeCycleBean has it's properties set");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException{
        System.out.println("-----LifeCycleBean Factory has been set");
    }

    @Override
    public void setBeanName(String name){
        System.out.println("-----LifeCycleBean name is: "+name);
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("-----App Context has been set");
    }

     @PostConstruct
    public void postConstruct(){
         System.out.println("Postconstruct has been called.");
     }

     @PreDestroy
    public void preDestroy(){
         System.out.println("Pre Destroy has been called.");
     }

     public void beforeInit(){
         System.out.println("BEfore init");
     }

     public void afterInit(){
         System.out.println("After init");
     }


}
*/
