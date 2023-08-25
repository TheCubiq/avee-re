package com.daaw;
/* loaded from: classes.dex */
public final class dl0 {

    /* renamed from: c */
    public static final dl0 f7222c = new C1101a().m24283a();

    /* renamed from: a */
    public final long f7223a;

    /* renamed from: b */
    public final EnumC1102b f7224b;

    /* renamed from: com.daaw.dl0$a */
    /* loaded from: classes.dex */
    public static final class C1101a {

        /* renamed from: a */
        public long f7225a = 0;

        /* renamed from: b */
        public EnumC1102b f7226b = EnumC1102b.REASON_UNKNOWN;

        /* renamed from: a */
        public dl0 m24283a() {
            return new dl0(this.f7225a, this.f7226b);
        }

        /* renamed from: b */
        public C1101a m24282b(long j) {
            this.f7225a = j;
            return this;
        }

        /* renamed from: c */
        public C1101a m24281c(EnumC1102b enumC1102b) {
            this.f7226b = enumC1102b;
            return this;
        }
    }

    /* renamed from: com.daaw.dl0$b */
    /* loaded from: classes.dex */
    public enum EnumC1102b implements tz0 {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: p */
        public final int f7235p;

        EnumC1102b(int i) {
            this.f7235p = i;
        }

        @Override // com.daaw.tz0
        /* renamed from: a */
        public int mo8669a() {
            return this.f7235p;
        }
    }

    public dl0(long j, EnumC1102b enumC1102b) {
        this.f7223a = j;
        this.f7224b = enumC1102b;
    }

    /* renamed from: c */
    public static C1101a m24284c() {
        return new C1101a();
    }

    @uz0(tag = 1)
    /* renamed from: a */
    public long m24286a() {
        return this.f7223a;
    }

    @uz0(tag = 3)
    /* renamed from: b */
    public EnumC1102b m24285b() {
        return this.f7224b;
    }
}
