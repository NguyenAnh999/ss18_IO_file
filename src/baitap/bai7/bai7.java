package baitap.bai7;

import java.io.*;

public class bai7 {
    //    Đề bài: Viết chương trình Java để đọc một file nhị phân chứa một danh sách các đối tượng và hiển thị danh sách đó lên màn hình.
//    Hướng dẫn làm bài:
//            - Bước 1: Xây dựng lớp đối tượng
//    Xây dựng lớp đối tượng mà bạn muốn đọc từ tệp nhị phân. Đảm bảo rằng lớp này thực hiện giao diện Serializable để cho phép ghi và đọc từ tệp nhị phân.
//            - Bước 2: Sử dụng ObjectInputStream để đọc từ tệp
//    Sử dụng FileInputStream để mở một luồng vào tệp nhị phân.
//    Tạo một đối tượng ObjectInputStream và liên kết nó với luồng vào.
//    Sử dụng readObject() để đọc danh sách các đối tượng từ tệp.
//            - Bước 3: Hiển thị danh sách lên màn hình
//    Duyệt qua danh sách các đối tượng và hiển thị chúng lên màn hình hoặc thực hiện các thao tác khác với chúng.
//- Bước 4: Đóng tệp và kết thúc chương trình
    public static void main(String[] args) {
        File file = new File("student.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("file đã được tạo");
        }

        Student student  = new Student(1,"anh");
        ObjectOutputStream oos=null;
        FileOutputStream fos = null;
try{
    fos=new FileOutputStream(file);
    oos=new ObjectOutputStream(fos);
    oos.writeObject(student);
}catch (IOException e){
}

        ObjectInputStream ops = null;
        FileInputStream fis = null;
        try{
            fis=new FileInputStream(file);
            ops=new ObjectInputStream(fis);
            System.out.println( ops.readObject().toString());;

        }catch (IOException e){

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
