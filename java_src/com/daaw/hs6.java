package com.daaw;

import java.io.IOException;
import java.util.Map;
/* loaded from: classes.dex */
public final class hs6 extends cq6 {
    public final int s;
    public final String t;
    public final Map u;
    public final byte[] v;

    public hs6(int i, String str, IOException iOException, Map map, pa6 pa6Var, byte[] bArr) {
        super("Response code: " + i, iOException, pa6Var, 2004, 1);
        this.s = i;
        this.t = str;
        this.u = map;
        this.v = bArr;
    }
}
