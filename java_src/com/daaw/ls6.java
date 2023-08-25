package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class ls6 extends is6 {

    /* renamed from: a */
    public String f17735a;

    /* renamed from: b */
    public boolean f17736b;

    /* renamed from: c */
    public boolean f17737c;

    /* renamed from: d */
    public byte f17738d;

    @Override // com.daaw.is6
    /* renamed from: a */
    public final is6 mo16603a(String str) {
        Objects.requireNonNull(str, "Null clientVersion");
        this.f17735a = str;
        return this;
    }

    @Override // com.daaw.is6
    /* renamed from: b */
    public final is6 mo16602b(boolean z) {
        this.f17737c = true;
        this.f17738d = (byte) (this.f17738d | 2);
        return this;
    }

    @Override // com.daaw.is6
    /* renamed from: c */
    public final is6 mo16601c(boolean z) {
        this.f17736b = z;
        this.f17738d = (byte) (this.f17738d | 1);
        return this;
    }

    @Override // com.daaw.is6
    /* renamed from: d */
    public final js6 mo16600d() {
        String str;
        if (this.f17738d != 3 || (str = this.f17735a) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f17735a == null) {
                sb.append(" clientVersion");
            }
            if ((this.f17738d & 1) == 0) {
                sb.append(" shouldGetAdvertisingId");
            }
            if ((this.f17738d & 2) == 0) {
                sb.append(" isGooglePlayServicesAvailable");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new ns6(str, this.f17736b, this.f17737c, null);
    }
}
