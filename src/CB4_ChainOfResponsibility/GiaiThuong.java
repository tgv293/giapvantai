package CB4_ChainOfResponsibility;

/**
 * Lớp GiaiThuong đại diện cho một giải thưởng trong danh sách các giải với quy tắc xác định trúng giải dựa trên nhiều bộ số trúng thưởng và là một phần của mô hình Chain of Responsibility.
 */
public class GiaiThuong implements DoVeSo {
    DoVeSo giaiKeTiep;
    String tenGiai;
    String[] boSoTrungThuong;

    public GiaiThuong(String tenGiai, String[] boSoTrungThuong) {
        this.tenGiai = tenGiai;
        this.boSoTrungThuong = boSoTrungThuong;
    }

    @Override
    public DoVeSo giaiKeTiep(DoVeSo giaiKeTiep) {
        this.giaiKeTiep = giaiKeTiep;
        return giaiKeTiep;
    }

    @Override
    public String TrungGiai(String veSo) {
        for (String boSo : boSoTrungThuong) {
            if (veSo.endsWith(boSo)) {
                return "Chúc mừng, bạn đã trúng giải " + tenGiai + " với số: " + veSo;
            }
        }
        if (giaiKeTiep != null) {
            return giaiKeTiep.TrungGiai(veSo);
        }
        return "Chúc may mắn lần sau!";
    }
}
