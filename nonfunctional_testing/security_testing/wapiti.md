# Giới thiệu công cụ kiểm thử Wapiti - A web-application vulnerability scanner

## 1. Giới thiệu

Wapiti là công cụ mã nguồn mở, được viết bằng python, chuyên quét lỗ hổng bảo mật trên các web. Wapiti hỗ trở quét rất nhiều loại lỗ hổng khác nhau như SQL Injection, Blind SQL Injection, File Handling, Cross Site Scripting, CRLF Injection, Commands execution,... Chúng ta nên sử dụng Wapiti không chỉ bởi vì nó cung cấp khả năng quét được nhiều lỗ hổng như đã kể trên, mà còn dễ cài đặt và sử dụng, các bản báo cáo tìm kiếm lỗ hổng trả về của Wapiti rất rõ ràng, cụ thể, thân thiện với người dùng.
Các bạn có thể xem thêm thông tin về project Wapiti tại [Github](https://github.com/IFGHou/wapiti), và tải Wapiti [tại đây](https://sourceforge.net/projects/wapiti/files/).

## 2. Hướng dẫn cài đặt và sử dụng

### Các bước thực hiện cài đặt:
### Bước 1: Cài đặt python
Tại cửa sổ cmd, các bạn kiểm tra máy đã cài đặt python hay chưa bằng lệnh: <br>
`python`
<br>
Nếu chưa cài đặt, các bạn tải python về và cài đặt như một gói cài đặt bình thường. <br>
Download: https://www.python.org/downloads/

### Bước 2: Chạy lệnh để tạo virtual env
`python -m venv wapiti3`
<br>

### Bước 3: Chạy lệnh để kích hoạt env đã tạo ở bước 2
`wapiti3\Scripts\activate.bat`
<br>

### Bước 4: Tải và cài đặt lxml
Với hệ điều hành Linux, tiến hành cài đặt theo các lệnh như trong [hướng dẫn](https://lxml.de/installation.html). <br>
Với hệ điều hành Windows, tải lxml [tại đây](https://www.lfd.uci.edu/~gohlke/pythonlibs/#lxml), sau đó cài đặt bằng lệnh: <br>
`pip install *tên file lxml* `

### Bước 4: Cài đặt Wapiti
Sau khi giải nén thư mục Wapiti đã tải, các bạn cd tới thư mục đã được giải nén đó và cài đặt bằng lệnh như sau:<br>
`python setup.py install`
<br>
Kiểm tra Wapiti đã cài đặt thành công hay chưa bằng lệnh: <br>
`wapiti -h`
<br>

### Bước 5: Tiến hành sử dụng Wapiti tìm kiếm lỗ hổng cho một ứng dụng web bất kỳ
`wapiti -u *địa chỉ trang web* `
<br>

### Bước 6: Mở file output để theo dõi kết quả
Chú ý các bước Wapiti chạy trong cửa sổ cmd, sau khi chạy xong, Wapiti sẽ hiện cho bạn đường dẫn tới file output, đây chính là file kết quả mà Wapiti báo cáo về cho bạn sau khi thực hiện việc tìm kiếm lỗ hổng.
<br>
#### Chú ý: Các bạn có thể theo dõi clip mình hướng dẫn cài đặt và sử dụng trên [Youtube](https://youtu.be/cGpruz8yNQ8) để có thể dễ hình dung hơn.

## 3. Kết quả thực nghiệm với trang hoclieu.sachmem
Sau khi thực hiện tìm kiếm lỗ hổng cho trang [hoclieu.sachmem](https://hoclieu.sachmem.vn/folder/0) bằng công cụ **Wapiti**, báo cáo trả về cho thấy trang web không có bất kỳ lỗ hổng nào.
