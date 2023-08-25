package com.daaw;
/* loaded from: classes.dex */
public abstract class ll0 {
    public static ll0 a = null;
    public static final int b = 20;

    /* loaded from: classes.dex */
    public static class a extends ll0 {
        public int c;

        public a(int i) {
            super(i);
            this.c = i;
        }

        @Override // com.daaw.ll0
        public void a(String str, String str2, Throwable... thArr) {
            if (this.c > 3 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // com.daaw.ll0
        public void b(String str, String str2, Throwable... thArr) {
            if (this.c > 6 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // com.daaw.ll0
        public void d(String str, String str2, Throwable... thArr) {
            if (this.c > 4 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // com.daaw.ll0
        public void g(String str, String str2, Throwable... thArr) {
            if (this.c > 2 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // com.daaw.ll0
        public void h(String str, String str2, Throwable... thArr) {
            if (this.c > 5 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }
    }

    public ll0(int i) {
    }

    public static synchronized ll0 c() {
        ll0 ll0Var;
        synchronized (ll0.class) {
            if (a == null) {
                a = new a(3);
            }
            ll0Var = a;
        }
        return ll0Var;
    }

    public static synchronized void e(ll0 ll0Var) {
        synchronized (ll0.class) {
            a = ll0Var;
        }
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = b;
        if (length >= i) {
            str = str.substring(0, i);
        }
        sb.append(str);
        return sb.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void g(String str, String str2, Throwable... thArr);

    public abstract void h(String str, String str2, Throwable... thArr);
}
