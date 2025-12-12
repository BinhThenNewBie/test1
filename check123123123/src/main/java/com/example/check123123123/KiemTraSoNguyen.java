package com.example.check123123123;

public class KiemTraSoNguyen {
    public boolean checksonguyen(int so){
        if(so < 0 || so > 100){
            throw new IllegalArgumentException("So phai nam trong khoang tu 1 - 100");
        }else{
        return true;
    }}
}
