import java.security.GeneralSecurityException;

class program {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien("Nguyen Van A", 10000, 2.5, 100000);

        nv.inTTin();
        System.out.println("\n");
        nv.setTenNhanVien("Nguyen Van B");
        nv.inTTin();
        System.out.println(nv.getTenNhanVien());

    }
}

class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    private double LUONG_MAX;

    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong, double LUONG_MAX) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.LUONG_MAX = LUONG_MAX;
    }

    public void inTTin() {
        System.out.println(tenNhanVien);
        System.out.println(luongCoBan);
        System.out.println(heSoLuong);
        System.out.println(LUONG_MAX);
    }

    public boolean tangLuong(double param) {
        if((luongCoBan * heSoLuong) > (luongCoBan * param)) {
            heSoLuong = param;
            return true;
        }
        else {
            System.out.println("Khong duoc thay doi");
            return false;
        }
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }
    public void setTenNhanVien(String tenMoi) {
        tenNhanVien = tenMoi;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }
    public void setLuongCoBan(double luongCoBanMoi) {
        luongCoBan = luongCoBanMoi;
    }
    
    public double getHeSoLuong() {
        return heSoLuong;
    }
    public void setHeSoLuong(double heSoLuongMoi) {
        heSoLuong = heSoLuongMoi;
    }

    public double getLuongMax() {
        return LUONG_MAX;
    }
    public void setLuongMax(double luongMaxMoi) {
        LUONG_MAX = luongMaxMoi;
    }
}