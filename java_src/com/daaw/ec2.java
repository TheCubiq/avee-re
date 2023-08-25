package com.daaw;
/* loaded from: classes.dex */
public final class ec2 {

    /* renamed from: a */
    public final m42 f8339a;

    /* renamed from: b */
    public boolean f8340b;

    /* renamed from: c */
    public boolean f8341c;

    /* renamed from: d */
    public boolean f8342d;

    /* renamed from: e */
    public int f8343e;

    /* renamed from: f */
    public int f8344f;

    /* renamed from: g */
    public long f8345g;

    /* renamed from: h */
    public long f8346h;

    public ec2(m42 m42Var) {
        this.f8339a = m42Var;
    }

    /* renamed from: a */
    public final void m23608a(byte[] bArr, int i, int i2) {
        if (this.f8341c) {
            int i3 = this.f8344f;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.f8344f = i3 + (i2 - i);
                return;
            }
            this.f8342d = ((bArr[i4] & 192) >> 6) == 0;
            this.f8341c = false;
        }
    }

    /* renamed from: b */
    public final void m23607b(long j, int i, boolean z) {
        if (this.f8343e == 182 && z && this.f8340b) {
            long j2 = this.f8346h;
            if (j2 != -9223372036854775807L) {
                long j3 = this.f8345g;
                this.f8339a.mo16222b(j2, this.f8342d ? 1 : 0, (int) (j - j3), i, null);
            }
        }
        if (this.f8343e != 179) {
            this.f8345g = j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m23606c(int i, long j) {
        boolean z;
        this.f8343e = i;
        this.f8342d = false;
        if (i != 182) {
            if (i != 179) {
                z = false;
                this.f8340b = z;
                this.f8341c = i == 182;
                this.f8344f = 0;
                this.f8346h = j;
            }
            i = 179;
        }
        z = true;
        this.f8340b = z;
        this.f8341c = i == 182;
        this.f8344f = 0;
        this.f8346h = j;
    }

    /* renamed from: d */
    public final void m23605d() {
        this.f8340b = false;
        this.f8341c = false;
        this.f8342d = false;
        this.f8343e = -1;
    }
}
