package com.example.vietpham.myapplication;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by vietpham on 5/3/16.
 */
public class JenkinTest {

    Jenkin grade = new Jenkin();

    @Test
    public void scrore0ShouldGetF() {
        assertEquals("F", grade.convert(0));
    }

    @Test
    public void scrore50ShouldGetD() {
        assertEquals("D", grade.convert(50));
    }

    @Test
    public void scrore60ShouldGetC() {
        assertEquals("C", grade.convert(60));
    }

    @Test
    public void scrore70ShouldGetB() {
        assertEquals("B", grade.convert(70));
    }

    @Test
    public void scrore80ShouldGetA() {
        assertEquals("A", grade.convert(80));
    }
}
