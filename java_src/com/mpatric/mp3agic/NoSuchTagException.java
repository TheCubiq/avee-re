package com.mpatric.mp3agic;
/* loaded from: classes2.dex */
public class NoSuchTagException extends BaseException {
    private static final long serialVersionUID = 1;

    public NoSuchTagException() {
    }

    public NoSuchTagException(String str) {
        super(str);
    }

    public NoSuchTagException(String str, Throwable th) {
        super(str, th);
    }
}
