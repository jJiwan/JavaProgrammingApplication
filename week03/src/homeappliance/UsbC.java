package homeappliance;

public interface UsbC {
    //public abstract String ShapeC();

    // public abstract는 생략 가능, JDK가 자동 삽입해줌
    default String ShapeC() {
        return "라운딩 처리된 C타입 인터페이스";
    }
}
