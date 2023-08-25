package com.daaw;

import java.io.IOException;
/* loaded from: classes.dex */
public class px2 extends IOException {
    public final mx2 p;

    public px2(IOException iOException, mx2 mx2Var, int i) {
        super(iOException);
        this.p = mx2Var;
    }

    public px2(String str, mx2 mx2Var, int i) {
        super(str);
        this.p = mx2Var;
    }

    public px2(String str, IOException iOException, mx2 mx2Var, int i) {
        super(str, iOException);
        this.p = mx2Var;
    }
}
