package src.ss10_dsa_list.bai_tap.array_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(50);

        System.out.println("Kích thước của danh sách: " + myList.size());
        System.out.println("Danh sách hiện tại: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();

        // Kiểm tra phương thức contains
        System.out.println("Danh sách có chứa 30 không? " + myList.contains(30));
        System.out.println("Danh sách có chứa 60 không? " + myList.contains(60));

        // Lấy phần tử ở vị trí 2
        System.out.println("Phần tử ở vị trí 2: " + myList.get(2));

        // Xóa phần tử ở vị trí 1
        System.out.println("Đã xóa phần tử: " + myList.remove(1));
        System.out.println("Danh sách sau khi xóa: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();

        // Thêm phần tử tại vị trí 1
        myList.add(1, 25);
        System.out.println("Danh sách sau khi thêm 25 vào vị trí 1: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();

        // Kiểm tra chỉ số của một phần tử
        System.out.println("Chỉ số của phần tử 30: " + myList.indexOf(30));
        System.out.println("Chỉ số của phần tử 100: " + myList.indexOf(100));

        // Sao chép danh sách
        MyList<Integer> clonedList = myList;
        System.out.println("Danh sách sao chép: ");
        for (int i = 0; i < clonedList.size(); i++) {
            System.out.print(clonedList.get(i) + " ");
        }
        System.out.println();

        // Xóa tất cả phần tử
        myList.clear();
        System.out.println("Danh sách sau khi xóa tất cả phần tử: " + myList.size());
    }
}

