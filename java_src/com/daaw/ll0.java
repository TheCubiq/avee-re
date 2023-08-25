package com.daaw;
/* loaded from: classes.dex */
public abstract class ll0 {

    /* renamed from: a */
    public static ll0 f17495a = null;

    /* renamed from: b */
    public static final int f17496b = 20;

    /* renamed from: com.daaw.ll0$a */
    /* loaded from: classes.dex */
    public static class C2056a extends ll0 {

        /* renamed from: c */
        public int f17497c;

        public C2056a(int i) {
            super(i);
            this.f17497c = i;
        }

        @Override // com.daaw.ll0
        /* renamed from: a */
        public void mo16882a(String str, String str2, Throwable... thArr) {
            if (this.f17497c > 3 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // com.daaw.ll0
        /* renamed from: b */
        public void mo16881b(String str, String str2, Throwable... thArr) {
            if (this.f17497c > 6 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // com.daaw.ll0
        /* renamed from: d */
        public void mo16880d(String str, String str2, Throwable... thArr) {
            if (this.f17497c > 4 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // com.daaw.ll0
        /* renamed from: g */
        public void mo16879g(String str, String str2, Throwable... thArr) {
            if (this.f17497c > 2 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // com.daaw.ll0
        /* renamed from: h */
        public void mo16878h(String str, String str2, Throwable... thArr) {
            if (this.f17497c > 5 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }
    }

    public ll0(int i) {
    }

    /* renamed from: c */
    public static synchronized ll0 m16885c() {
        ll0 ll0Var;
        synchronized (ll0.class) {
            if (f17495a == null) {
                f17495a = new C2056a(3);
            }
            ll0Var = f17495a;
        }
        return ll0Var;
    }

    /* renamed from: e */
    public static synchronized void m16884e(ll0 ll0Var) {
        synchronized (ll0.class) {
            f17495a = ll0Var;
        }
    }

    /* renamed from: f */
    public static String m16883f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = f17496b;
        if (length >= i) {
            str = str.substring(0, i);
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public abstract void mo16882a(String str, String str2, Throwable... thArr);

    /* renamed from: b */
    public abstract void mo16881b(String str, String str2, Throwable... thArr);

    /* renamed from: d */
    public abstract void mo16880d(String str, String str2, Throwable... thArr);

    /* renamed from: g */
    public abstract void mo16879g(String str, String str2, Throwable... thArr);

    /* renamed from: h */
    public abstract void mo16878h(String str, String str2, Throwable... thArr);
}
