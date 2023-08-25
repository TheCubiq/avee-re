package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class ls6 extends is6 {
    public String a;
    public boolean b;
    public boolean c;
    public byte d;

    @Override // com.daaw.is6
    public final is6 a(String str) {
        Objects.requireNonNull(str, "Null clientVersion");
        this.a = str;
        return this;
    }

    @Override // com.daaw.is6
    public final is6 b(boolean z) {
        this.c = true;
        this.d = (byte) (this.d | 2);
        return this;
    }

    @Override // com.daaw.is6
    public final is6 c(boolean z) {
        this.b = z;
        this.d = (byte) (this.d | 1);
        return this;
    }

    @Override // com.daaw.is6
    public final js6 d() {
        String str;
        if (this.d != 3 || (str = this.a) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" clientVersion");
            }
            if ((this.d & 1) == 0) {
                sb.append(" shouldGetAdvertisingId");
            }
            if ((this.d & 2) == 0) {
                sb.append(" isGooglePlayServicesAvailable");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new ns6(str, this.b, this.c, null);
    }
}
