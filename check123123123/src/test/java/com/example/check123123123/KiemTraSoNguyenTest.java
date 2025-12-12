package com.example.check123123123;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KiemTraSoNguyenTest {
    private KiemTraSoNguyen ktsn;
    @BeforeEach
    public void SetUp(){
        ktsn = new KiemTraSoNguyen();
    }
    @Test
    public void testsotaibienduoi(){
        assertTrue(ktsn.checksonguyen(1));
    }
    @Test
    public void testsotaibientren(){
        assertTrue(ktsn.checksonguyen(100));
    }
    @Test
    public void testsocanbienduoihople(){
        assertTrue(ktsn.checksonguyen(2));
    }
    @Test
    public void testsocanbienduoikhonghople(){
        assertThrows(IllegalArgumentException.class,() -> ktsn.checksonguyen(-1));
    }
    @Test
    public void testsocanbientrenkhonghople(){
        assertThrows(IllegalArgumentException.class,() -> ktsn.checksonguyen(101));
    }

}