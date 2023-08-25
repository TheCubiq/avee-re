package com.daaw;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
/* loaded from: classes.dex */
public class cq6 extends s56 {
    public final pa6 q;
    public final int r;

    public cq6(pa6 pa6Var, int i, int i2) {
        super(b(2008, 1));
        this.q = pa6Var;
        this.r = 1;
    }

    public cq6(IOException iOException, pa6 pa6Var, int i, int i2) {
        super(iOException, b(i, i2));
        this.q = pa6Var;
        this.r = i2;
    }

    public cq6(String str, pa6 pa6Var, int i, int i2) {
        super(str, b(i, i2));
        this.q = pa6Var;
        this.r = i2;
    }

    public cq6(String str, IOException iOException, pa6 pa6Var, int i, int i2) {
        super(str, iOException, b(i, i2));
        this.q = pa6Var;
        this.r = i2;
    }

    public static cq6 a(IOException iOException, pa6 pa6Var, int i) {
        String message = iOException.getMessage();
        int i2 = 2001;
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && wx6.a(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        }
        return i2 == 2007 ? new zo6(iOException, pa6Var) : new cq6(iOException, pa6Var, i2, i);
    }

    public static int b(int i, int i2) {
        return i == 2000 ? i2 != 1 ? 2000 : 2001 : i;
    }
}
