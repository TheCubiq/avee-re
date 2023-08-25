package com.daaw;

import android.os.Handler;
/* loaded from: classes.dex */
public interface bp0 {

    /* renamed from: com.daaw.bp0$a */
    /* loaded from: classes.dex */
    public static final class C0880a {

        /* renamed from: a */
        public final int f5022a;

        /* renamed from: b */
        public final int f5023b;

        /* renamed from: c */
        public final int f5024c;

        /* renamed from: d */
        public final long f5025d;

        public C0880a(int i) {
            this(i, -1L);
        }

        public C0880a(int i, int i2, int i3, long j) {
            this.f5022a = i;
            this.f5023b = i2;
            this.f5024c = i3;
            this.f5025d = j;
        }

        public C0880a(int i, long j) {
            this(i, -1, -1, j);
        }

        /* renamed from: a */
        public C0880a m25955a(int i) {
            return this.f5022a == i ? this : new C0880a(i, this.f5023b, this.f5024c, this.f5025d);
        }

        /* renamed from: b */
        public boolean m25954b() {
            return this.f5023b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0880a.class != obj.getClass()) {
                return false;
            }
            C0880a c0880a = (C0880a) obj;
            return this.f5022a == c0880a.f5022a && this.f5023b == c0880a.f5023b && this.f5024c == c0880a.f5024c && this.f5025d == c0880a.f5025d;
        }

        public int hashCode() {
            return ((((((527 + this.f5022a) * 31) + this.f5023b) * 31) + this.f5024c) * 31) + ((int) this.f5025d);
        }
    }

    /* renamed from: com.daaw.bp0$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0881b {
        /* renamed from: d */
        void mo7613d(bp0 bp0Var, nl1 nl1Var, Object obj);
    }

    /* renamed from: a */
    void mo16120a(qo0 qo0Var);

    /* renamed from: c */
    void mo8404c(Handler handler, cp0 cp0Var);

    /* renamed from: e */
    void mo16119e();

    /* renamed from: f */
    void mo8403f(InterfaceC2898rz interfaceC2898rz, boolean z, InterfaceC0881b interfaceC0881b);

    /* renamed from: g */
    qo0 mo16118g(C0880a c0880a, InterfaceC2006l2 interfaceC2006l2);

    /* renamed from: h */
    void mo8402h(InterfaceC0881b interfaceC0881b);

    /* renamed from: i */
    void mo8401i(cp0 cp0Var);
}
