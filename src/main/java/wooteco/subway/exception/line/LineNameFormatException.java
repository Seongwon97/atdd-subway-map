package wooteco.subway.exception.line;

import org.springframework.http.HttpStatus;

public class LineNameFormatException extends LineException {
    public LineNameFormatException() {
        super(HttpStatus.BAD_REQUEST, "올바르지 않은 노선 이름입니다.");
    }
}