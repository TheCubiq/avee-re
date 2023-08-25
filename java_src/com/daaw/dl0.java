package com.daaw;
/* loaded from: classes.dex */
public final class dl0 {
    public static final dl0 c = new a().a();
    public final long a;
    public final b b;

    /* loaded from: classes.dex */
    public static final class a {
        public long a = 0;
        public b b = b.REASON_UNKNOWN;

        public dl0 a() {
            return new dl0(this.a, this.b);
        }

        public a b(long j) {
            this.a = j;
            return this;
        }

        public a c(b bVar) {
            this.b = bVar;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum b implements tz0 {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        
        public final int p;

        b(int i) {
            this.p = i;
        }

        @Override // com.daaw.tz0
        public int a() {
            return this.p;
        }
    }

    public dl0(long j, b bVar) {
        this.a = j;
        this.b = bVar;
    }

    public static a c() {
        return new a();
    }

    @uz0(tag = 1)
    public long a() {
        return this.a;
    }

    @uz0(tag = 3)
    public b b() {
        return this.b;
    }
}
