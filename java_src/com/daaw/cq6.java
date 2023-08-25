package com.daaw;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
/* loaded from: classes.dex */
public class cq6 extends s56 {

    /* renamed from: q */
    public final pa6 f6087q;

    /* renamed from: r */
    public final int f6088r;

    public cq6(pa6 pa6Var, int i, int i2) {
        super(m25115b(2008, 1));
        this.f6087q = pa6Var;
        this.f6088r = 1;
    }

    public cq6(IOException iOException, pa6 pa6Var, int i, int i2) {
        super(iOException, m25115b(i, i2));
        this.f6087q = pa6Var;
        this.f6088r = i2;
    }

    public cq6(String str, pa6 pa6Var, int i, int i2) {
        super(str, m25115b(i, i2));
        this.f6087q = pa6Var;
        this.f6088r = i2;
    }

    public cq6(String str, IOException iOException, pa6 pa6Var, int i, int i2) {
        super(str, iOException, m25115b(i, i2));
        this.f6087q = pa6Var;
        this.f6088r = i2;
    }

    /* renamed from: a */
    public static cq6 m25116a(IOException iOException, pa6 pa6Var, int i) {
        String message = iOException.getMessage();
        int i2 = 2001;
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && wx6.m5726a(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        }
        return i2 == 2007 ? new zo6(iOException, pa6Var) : new cq6(iOException, pa6Var, i2, i);
    }

    /* renamed from: b */
    public static int m25115b(int i, int i2) {
        return i == 2000 ? i2 != 1 ? 2000 : 2001 : i;
    }
}
