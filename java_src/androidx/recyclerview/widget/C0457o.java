package androidx.recyclerview.widget;

import android.view.View;
/* renamed from: androidx.recyclerview.widget.o */
/* loaded from: classes.dex */
public class C0457o {

    /* renamed from: a */
    public final InterfaceC0459b f2265a;

    /* renamed from: b */
    public C0458a f2266b = new C0458a();

    /* renamed from: androidx.recyclerview.widget.o$a */
    /* loaded from: classes.dex */
    public static class C0458a {

        /* renamed from: a */
        public int f2267a = 0;

        /* renamed from: b */
        public int f2268b;

        /* renamed from: c */
        public int f2269c;

        /* renamed from: d */
        public int f2270d;

        /* renamed from: e */
        public int f2271e;

        /* renamed from: a */
        public void m28126a(int i) {
            this.f2267a = i | this.f2267a;
        }

        /* renamed from: b */
        public boolean m28125b() {
            int i = this.f2267a;
            if ((i & 7) == 0 || (i & (m28124c(this.f2270d, this.f2268b) << 0)) != 0) {
                int i2 = this.f2267a;
                if ((i2 & 112) == 0 || (i2 & (m28124c(this.f2270d, this.f2269c) << 4)) != 0) {
                    int i3 = this.f2267a;
                    if ((i3 & 1792) == 0 || (i3 & (m28124c(this.f2271e, this.f2268b) << 8)) != 0) {
                        int i4 = this.f2267a;
                        return (i4 & 28672) == 0 || (i4 & (m28124c(this.f2271e, this.f2269c) << 12)) != 0;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        /* renamed from: c */
        public int m28124c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* renamed from: d */
        public void m28123d() {
            this.f2267a = 0;
        }

        /* renamed from: e */
        public void m28122e(int i, int i2, int i3, int i4) {
            this.f2268b = i;
            this.f2269c = i2;
            this.f2270d = i3;
            this.f2271e = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.o$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0459b {
        /* renamed from: a */
        View mo28121a(int i);

        /* renamed from: b */
        int mo28120b(View view);

        /* renamed from: c */
        int mo28119c();

        /* renamed from: d */
        int mo28118d();

        /* renamed from: e */
        int mo28117e(View view);
    }

    public C0457o(InterfaceC0459b interfaceC0459b) {
        this.f2265a = interfaceC0459b;
    }

    /* renamed from: a */
    public View m28128a(int i, int i2, int i3, int i4) {
        int mo28119c = this.f2265a.mo28119c();
        int mo28118d = this.f2265a.mo28118d();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View mo28121a = this.f2265a.mo28121a(i);
            this.f2266b.m28122e(mo28119c, mo28118d, this.f2265a.mo28120b(mo28121a), this.f2265a.mo28117e(mo28121a));
            if (i3 != 0) {
                this.f2266b.m28123d();
                this.f2266b.m28126a(i3);
                if (this.f2266b.m28125b()) {
                    return mo28121a;
                }
            }
            if (i4 != 0) {
                this.f2266b.m28123d();
                this.f2266b.m28126a(i4);
                if (this.f2266b.m28125b()) {
                    view = mo28121a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* renamed from: b */
    public boolean m28127b(View view, int i) {
        this.f2266b.m28122e(this.f2265a.mo28119c(), this.f2265a.mo28118d(), this.f2265a.mo28120b(view), this.f2265a.mo28117e(view));
        if (i != 0) {
            this.f2266b.m28123d();
            this.f2266b.m28126a(i);
            return this.f2266b.m28125b();
        }
        return false;
    }
}
