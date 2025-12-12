package com.example.check123123123;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SachServiceTest {
    private SachService service;
    @BeforeEach
    public void SetUp(){
        service = new SachService();
    }
    @Test
    public void testsuanamxuatbantaibienduoi(){
        Sach dt = new Sach("Sach01","java","Binh",1990,200);
        assertTrue(service.sua("Sach01",dt));
    }
    @Test
    public void testsuanamxuatbantaibientren(){
        Sach dt = new Sach("Sach01","java","Binh",2025,200);
        assertTrue(service.sua("Sach01",dt));
    }
    @Test
    public void testsuanamxuatbancanbienduoihople(){
        Sach dt = new Sach("Sach01","java","Binh",1991,200);
        assertTrue(service.sua("Sach01",dt));
    }
    @Test
    public void testsuanamxuatbancanbientrenhople(){
        Sach dt = new Sach("Sach01","java","Binh",2024,200);
        assertTrue(service.sua("Sach01",dt));
    }
    @Test
    public void testsuanmaxuatbancanbienduoikhonghople(){
        Sach dt = new Sach("Sach01","java","Binh",1989,200);
        assertThrows(IllegalArgumentException.class,() -> service.sua("Sach01",dt));
    }
    @Test
    public void testsuanmaxuatbancanbientrenkhonghople(){
        Sach dt = new Sach("Sach01","java","Binh",2026,200);
        assertThrows(IllegalArgumentException.class,() -> service.sua("Sach01",dt));
    }


}