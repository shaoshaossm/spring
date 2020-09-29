package com.bjpowernode;
import com.bjpowernode.ba06.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest06 {

    @Test
    public void test01() {
        //使用spring容器创建的对夏
        String config = "ba06/total.xml";
        //ApplicationContext表示spring容器
        ApplicationContext application = new ClassPathXmlApplicationContext(config);
        Student myStudent = (Student) application.getBean("myStudent");
        System.out.println(myStudent);

    }

}
