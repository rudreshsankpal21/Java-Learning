/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bcs3;

/**
 *
 * @author User28
 */

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;
public class main {
    public static void main(String[] args) {
        Resource r = new ClassPathResource("app.xml");
        BeanFactory b = new XmlBeanFactory(r);
        student s = (student) b.getBean("sbean");
        s.display();
    }
}
