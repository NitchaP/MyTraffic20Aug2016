package momo.caramelgap.trafficcar;

/**
 * Created 21/8/2559.
 */
public class MyData {

    //Explicit
    private String[] titeStrings = new String[]{"หัวข้อที่ 1","หัวข้อที่ 2","หัวข้อที่ 3",
            "หัวข้อที่ 4","หัวข้อที่ 5","หัวข้อที่ 6","หัวข้อที่ 7","หัวข้อที่ 8","หัวข้อที่ 9",
            "หัวข้อที่ 10","หัวข้อที่ 11","หัวข้อที่ 12","หัวข้อที่ 13","หัวข้อที่ 14",
            "หัวข้อที่ 15","หัวข้อที่ 16","หัวข้อที่ 17","หัวข้อที่ 18","หัวข้อที่ 19","หัวข้อที่ 20"};

    private int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

    public int[] getInts() {
        return ints;
    }

    //นำค่าให้คนอื่นใช้
    public String[] getTiteStrings() {
        return titeStrings;
    }
} //Main Class
