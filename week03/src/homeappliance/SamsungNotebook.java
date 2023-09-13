package homeappliance;

public class SamsungNotebook extends Notebook implements UsbA, UsbC{
    @Override
    public String ShapeA() {
        return "네모난 A타입 인터페이스";
    }

}
