import java.io.*;
/*
Mô tả bài toán

Viết một chương trình cho phép người dùng sao chép các tập tin.

 Người sử dụng cần phải cung cấp một tập
tin nguồn (source file) và một tập tin đích (target file).

Chương trình sao chép tệp nguồn vào tệp tin đích và
 hiển thị số ký tự trong tệp. Chương trình nên cảnh báo
người dùng nếu tệp nguồn không tồn tại hoặc nếu tập tin
 đích đã tồn tại.

Để sao chép nội dung từ tệp tin nguồn đến tệp tin đích,
 bạn nên sử dụng luồng đầu vào để đọc ký tự từ tệp

nguồn và luồng đầu ra để gửi byte đến tệp tin đích,
 bất kể nội dung của tệp.
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(new File(
                    "D:\\MD-2\\Bai-16\\Bai Tap\\BaiTap1\\src\\sourceFile.txt"));
            outputStream = new FileOutputStream(new File(
                    "D:\\MD-2\\Bai-16\\Bai Tap\\BaiTap1\\src\\targetFile.txt"));

            byte[] buffer = new byte[1000];
            int length = inputStream.read(buffer);
            while (length > 0) {
                outputStream.write(buffer, 0, length);
            }
            System.out.println("File copy thanh cong !");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}











