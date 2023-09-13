package homeappliance;

public class LgNotebook extends Notebook implements Hdmi, UsbA, UsbC{
    @Override
    public void display() {
        System.out.println("노트북에 Hdmi 인터페이스를 통해 디스플레이 장치를 연결");
    }

    @Override
    public String ShapeA() {
        return "네모난 A타입 인터페이스";
    }
 }
