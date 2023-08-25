package com.daaw;

import android.os.IBinder;
import java.util.Objects;
/* loaded from: classes.dex */
public final class tv6 extends qw6 {

    /* renamed from: a */
    public IBinder f28170a;

    /* renamed from: b */
    public String f28171b;

    /* renamed from: c */
    public int f28172c;

    /* renamed from: d */
    public float f28173d;

    /* renamed from: e */
    public int f28174e;

    /* renamed from: f */
    public String f28175f;

    /* renamed from: g */
    public byte f28176g;

    @Override // com.daaw.qw6
    /* renamed from: a */
    public final qw6 mo8769a(String str) {
        this.f28175f = str;
        return this;
    }

    @Override // com.daaw.qw6
    /* renamed from: b */
    public final qw6 mo8768b(String str) {
        this.f28171b = str;
        return this;
    }

    @Override // com.daaw.qw6
    /* renamed from: c */
    public final qw6 mo8767c(int i) {
        this.f28176g = (byte) (this.f28176g | 8);
        return this;
    }

    @Override // com.daaw.qw6
    /* renamed from: d */
    public final qw6 mo8766d(int i) {
        this.f28172c = i;
        this.f28176g = (byte) (this.f28176g | 2);
        return this;
    }

    @Override // com.daaw.qw6
    /* renamed from: e */
    public final qw6 mo8765e(float f) {
        this.f28173d = f;
        this.f28176g = (byte) (this.f28176g | 4);
        return this;
    }

    @Override // com.daaw.qw6
    /* renamed from: f */
    public final qw6 mo8764f(boolean z) {
        this.f28176g = (byte) (this.f28176g | 1);
        return this;
    }

    @Override // com.daaw.qw6
    /* renamed from: g */
    public final qw6 mo8763g(IBinder iBinder) {
        Objects.requireNonNull(iBinder, "Null windowToken");
        this.f28170a = iBinder;
        return this;
    }

    @Override // com.daaw.qw6
    /* renamed from: h */
    public final qw6 mo8762h(int i) {
        this.f28174e = i;
        this.f28176g = (byte) (this.f28176g | 16);
        return this;
    }

    @Override // com.daaw.qw6
    /* renamed from: i */
    public final rw6 mo8761i() {
        IBinder iBinder;
        if (this.f28176g != 31 || (iBinder = this.f28170a) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f28170a == null) {
                sb.append(" windowToken");
            }
            if ((this.f28176g & 1) == 0) {
                sb.append(" stableSessionToken");
            }
            if ((this.f28176g & 2) == 0) {
                sb.append(" layoutGravity");
            }
            if ((this.f28176g & 4) == 0) {
                sb.append(" layoutVerticalMargin");
            }
            if ((this.f28176g & 8) == 0) {
                sb.append(" displayMode");
            }
            if ((this.f28176g & 16) == 0) {
                sb.append(" windowWidthPx");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new vv6(iBinder, false, this.f28171b, this.f28172c, this.f28173d, 0, null, this.f28174e, this.f28175f, null);
    }
}
