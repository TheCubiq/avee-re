package com.daaw;

import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class qr6 extends rr6 {
    public final HashSet c;
    public final JSONObject d;
    public final long e;

    public qr6(jr6 jr6Var, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(jr6Var, null);
        this.c = new HashSet(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
