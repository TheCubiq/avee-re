package com.daaw;

import java.math.BigInteger;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class sz3 {
    @GuardedBy("this")

    /* renamed from: a */
    public BigInteger f26816a = BigInteger.ONE;
    @GuardedBy("this")

    /* renamed from: b */
    public String f26817b = "0";

    /* renamed from: a */
    public final synchronized String m9691a() {
        String bigInteger;
        bigInteger = this.f26816a.toString();
        this.f26816a = this.f26816a.add(BigInteger.ONE);
        this.f26817b = bigInteger;
        return bigInteger;
    }

    /* renamed from: b */
    public final synchronized String m9690b() {
        return this.f26817b;
    }
}
