package com.daaw;
/* loaded from: classes.dex */
public final class zf1 {
    public static final zf1 c = new a().a();
    public final long a;
    public final long b;

    /* loaded from: classes.dex */
    public static final class a {
        public long a = 0;
        public long b = 0;

        public zf1 a() {
            return new zf1(this.a, this.b);
        }

        public a b(long j) {
            this.a = j;
            return this;
        }

        public a c(long j) {
            this.b = j;
            return this;
        }
    }

    public zf1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static a c() {
        return new a();
    }

    @uz0(tag = 1)
    public long a() {
        return this.a;
    }

    @uz0(tag = 2)
    public long b() {
        return this.b;
    }
}
