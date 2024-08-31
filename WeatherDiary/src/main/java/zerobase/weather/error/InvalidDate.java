package zerobase.weather.error;

public class InvalidDate extends RuntimeException {
    private static final String MESSAGE = "날짜 값이 잘못 입력되었습니다.";

    public InvalidDate() {
        super(MESSAGE);
    }
}

