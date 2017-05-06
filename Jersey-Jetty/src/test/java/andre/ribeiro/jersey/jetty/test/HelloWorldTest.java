package andre.ribeiro.jersey.jetty.test;

import andre.ribeiro.jersey.jetty.HelloWorld;
import static org.junit.Assert.*;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andreribeiro
 */
public class HelloWorldTest {
    
    @Test
    public void testHelloWorld(){
       HelloWorld testHelloWorld = new HelloWorld();
       assertEquals(testHelloWorld.test().toLowerCase(), "hello world");
    }
    
    @Test
    public void testHelloWorldJson(){
       HelloWorld testHelloWorld = new HelloWorld();
       assertEquals(testHelloWorld.test().toLowerCase(), "hello world");
    }
    
}
