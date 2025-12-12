package com.example.check123123123;

import java.util.ArrayList;

public class SachService {
    ArrayList<Sach> lst = new ArrayList<>();
    public boolean sua(String maSachs, Sach sachMoi ){
                if (maSachs.isEmpty() || maSachs == null) {
                    throw new IllegalArgumentException("ma sach khong duoc de trong");
                }
                if (sachMoi.getMaSach().isEmpty() || sachMoi.getTenSach().isEmpty() || sachMoi.getTacGia().isEmpty()) {
                    throw new IllegalArgumentException("Cac truong khong duoc de trong");
                }
                if (sachMoi.getNamXuatBan() < 1990 || sachMoi.getNamXuatBan() > 2025) {
                    throw new IllegalArgumentException("Nam xuat ban chi duoc nam trong khoang 1990 - 2025");
                }
        return true;
    }
}
