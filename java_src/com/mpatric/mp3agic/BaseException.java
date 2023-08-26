package com.mpatric.mp3agic;
/* loaded from: classes2.dex */
public class BaseException extends Exception {
    private static final long serialVersionUID = 1;

    public BaseException() {
    }

    public BaseException(String str) {
        super(str);
    }

    public BaseException(String str, Throwable th) {
        super(str, th);
    }

    public String getDetailedMessage() {
        StringBuilder sb = new StringBuilder();
        Throwable th = this;
        while (true) {
            sb.append('[');
            sb.append(th.getClass().getName());
            if (th.getMessage() != null && th.getMessage().length() > 0) {
                sb.append(": ");
                sb.append(th.getMessage());
            }
            sb.append(']');
            th = th.getCause();
            if (th != null) {
                sb.append(" caused by ");
            } else {
                return sb.toString();
            }
        }
    }
}
