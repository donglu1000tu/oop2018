package week3;

public class Week3 {

    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        if (m > n) return m
        return n;
        //return -1;
    }

    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = max(max, array[i]);
        }
        return max;
        //return -1;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     *
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        //return null;
        double BMI = weight / (height * height);
        if (BMI < 18.5) return "Thiếu cân";
        if (BMI >= 18.5 && BMI < 23) return "Bình thường";
        if (BMI >= 23 && BMI < 25) return "Thừa cân";
        return "Béo phì";
    }

}

