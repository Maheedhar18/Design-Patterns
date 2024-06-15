package facade_pattern;

public class SecurityCodeCheck {
    int securityCode=123;

    public int getSecurityCode() {
        return securityCode;
    }

    public boolean checkSecurityCode(int code) {
        return code==securityCode;
    }
}
