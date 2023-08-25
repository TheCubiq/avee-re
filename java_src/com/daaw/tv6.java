package com.daaw;

import android.os.IBinder;
import java.util.Objects;
/* loaded from: classes.dex */
public final class tv6 extends qw6 {
    public IBinder a;
    public String b;
    public int c;
    public float d;
    public int e;
    public String f;
    public byte g;

    @Override // com.daaw.qw6
    public final qw6 a(String str) {
        this.f = str;
        return this;
    }

    @Override // com.daaw.qw6
    public final qw6 b(String str) {
        this.b = str;
        return this;
    }

    @Override // com.daaw.qw6
    public final qw6 c(int i) {
        this.g = (byte) (this.g | 8);
        return this;
    }

    @Override // com.daaw.qw6
    public final qw6 d(int i) {
        this.c = i;
        this.g = (byte) (this.g | 2);
        return this;
    }

    @Override // com.daaw.qw6
    public final qw6 e(float f) {
        this.d = f;
        this.g = (byte) (this.g | 4);
        return this;
    }

    @Override // com.daaw.qw6
    public final qw6 f(boolean z) {
        this.g = (byte) (this.g | 1);
        return this;
    }

    @Override // com.daaw.qw6
    public final qw6 g(IBinder iBinder) {
        Objects.requireNonNull(iBinder, "Null windowToken");
        this.a = iBinder;
        return this;
    }

    @Override // com.daaw.qw6
    public final qw6 h(int i) {
        this.e = i;
        this.g = (byte) (this.g | 16);
        return this;
    }

    @Override // com.daaw.qw6
    public final rw6 i() {
        IBinder iBinder;
        if (this.g != 31 || (iBinder = this.a) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" windowToken");
            }
            if ((this.g & 1) == 0) {
                sb.append(" stableSessionToken");
            }
            if ((this.g & 2) == 0) {
                sb.append(" layoutGravity");
            }
            if ((this.g & 4) == 0) {
                sb.append(" layoutVerticalMargin");
            }
            if ((this.g & 8) == 0) {
                sb.append(" displayMode");
            }
            if ((this.g & 16) == 0) {
                sb.append(" windowWidthPx");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new vv6(iBinder, false, this.b, this.c, this.d, 0, null, this.e, this.f, null);
    }
}
