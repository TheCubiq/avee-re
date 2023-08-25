package com.daaw;

import java.math.BigInteger;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class sz3 {
    @GuardedBy("this")
    public BigInteger a = BigInteger.ONE;
    @GuardedBy("this")
    public String b = "0";

    public final synchronized String a() {
        String bigInteger;
        bigInteger = this.a.toString();
        this.a = this.a.add(BigInteger.ONE);
        this.b = bigInteger;
        return bigInteger;
    }

    public final synchronized String b() {
        return this.b;
    }
}
