package junit.framework;
/* loaded from: classes2.dex */
public class AssertionFailedError extends AssertionError {
    private static final long serialVersionUID = 1;

    private static String defaultString(String str) {
        return str == null ? "" : str;
    }

    public AssertionFailedError() {
    }

    public AssertionFailedError(String str) {
        super(defaultString(str));
    }
}
