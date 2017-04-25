package edu.upc.dsa;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @org.junit.Test
    public void createEtakemonTest() {
        Etakemon e = new Etakemon("carlos",15);
        assertEquals("carlos", e.getName());
        assertEquals(15, e.getLevel());
    }


    @org.junit.Test
    public void createUserTest() {
        User u = new User("xavi","xavi@xavi.com","123");
        assertEquals("xavi", u.getUsername());
        assertEquals("xavi@xavi.com", u.getMail());
        assertEquals("123", u.getPassword());
    }



}