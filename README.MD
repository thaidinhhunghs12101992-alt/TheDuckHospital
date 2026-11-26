# Xây dựng hệ thống quản lý bệnh viện

## Thành viên nhóm:

| STT | Họ tên               |   MSSV     |
| :-: | -------------------- | :------:   |
|  1  | Thái Đình Hùng       | K24DTCN488 |
|  2  | Trương Khang Hy      | K24DTCN553 |
|  3  | Tạ Hùng Cường        | K24DTCN489 |

## Các công cụ và công nghệ được sử dụng

- Ngôn ngữ lập trình: Java, JavaScript
- IDE/ Text Editor: IntelliJ IDEA Ultimate, Visual Studio Code
- Database: Microsoft SQL Server
- Back-end: Java Spring Boot
- Front-end: ReactJS, React Native

## Những tính năng chính

| Người dùng       | Chức năng                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| ---------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Người dùng khách | - Đăng nhập bằng số điện thoại. <br> - Đăng ký tài khoản bệnh nhân. <br> - Quên mật khẩu.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| Bệnh nhân        | - Đăng xuất. <br> - Tạo hồ sơ bệnh nhân. <br> - Xem thông tin hồ sơ bệnh nhân. <br> - Chỉnh sửa thông tin hồ sơ bệnh nhân. <br> - Xóa hồ sơ bệnh nhân. <br> - Tìm hồ sơ bệnh nhân đã mất. <br> - Xem phiếu khám bệnh của hồ sơ bệnh nhân. <br> - Đặt lịch khám bệnh. <br> - Xem lịch sử khám chữa bệnh. <br> - Tra cứu kết quả xét nghiệm. <br> - Chat với tư vấn viên. <br> - Thanh toán viện phí. <br> - Đặt lịch nhắc thuốc.                                                                                                                                                                                                                                                                                                           |
| Quản lý          | - Đăng xuất. <br> - Thực hiện thống kê doanh thu, lượt đặt khám, phương thức thanh toán, bệnh nhân, các khoa có nhiều lượt khám nhất, số lượng bệnh nhân, số khoa. <br> - Xem danh sách các bệnh nhân và thông tin chi tiết của bệnh nhân. <br> - Xem danh sách các thanh toán và thông tin chi tiết của thanh toán. <br> - Quản lý nhân viên: Thêm, sửa, khóa, mở khóa nhân viên, xem thông tin của nhân viên. <br> - Quản lý khoa: Tìm kiếm, thêm, sửa, khóa, mở khóa khoa, thêm hoặc xóa bác sĩ khỏi khoa, thêm hoặc xóa trưởng khoa. <br> - Quản lý phòng: Tìm kiếm thêm, sửa, khóa, mở khóa phòng. <br> - Quản lý dịch vụ: Tìm kiếm thêm, sửa, khóa, mở khóa dịch vụ. <br> - Quản lý thuốc: Tìm kiếm thêm, sửa, khóa, mở khóa thuốc. |

## Source and local configuration

Original project: https://github.com/MinhTuMTN/TheDuckHospital

The web client uses the included .env.example. Copy it to .env. Configure SQL Server and local service credentials in TheDuckHospitalAPI/src/main/resources/application.properties using the included template. Provide your own Firebase service account key.json and mobile google-services.json where required. Set JWT_SECRET to a strong random signing key (at least 32 bytes). The payment integrations read MOMO_PARTNER_CODE, MOMO_ACCESS_KEY, MOMO_SECRET_KEY, VNPAY_TMN_CODE and VNPAY_SECRET_KEY from the environment. Database backups, screenshots and test fixtures containing account details are kept locally.
