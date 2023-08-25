package androidx.recyclerview.widget;

import android.view.View;
/* loaded from: classes.dex */
public class o {
    public final b a;
    public a b = new a();

    /* loaded from: classes.dex */
    public static class a {
        public int a = 0;
        public int b;
        public int c;
        public int d;
        public int e;

        public void a(int i) {
            this.a = i | this.a;
        }

        public boolean b() {
            int i = this.a;
            if ((i & 7) == 0 || (i & (c(this.d, this.b) << 0)) != 0) {
                int i2 = this.a;
                if ((i2 & 112) == 0 || (i2 & (c(this.d, this.c) << 4)) != 0) {
                    int i3 = this.a;
                    if ((i3 & 1792) == 0 || (i3 & (c(this.e, this.b) << 8)) != 0) {
                        int i4 = this.a;
                        return (i4 & 28672) == 0 || (i4 & (c(this.e, this.c) << 12)) != 0;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        public void d() {
            this.a = 0;
        }

        public void e(int i, int i2, int i3, int i4) {
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        View a(int i);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    public o(b bVar) {
        this.a = bVar;
    }

    public View a(int i, int i2, int i3, int i4) {
        int c = this.a.c();
        int d = this.a.d();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a2 = this.a.a(i);
            this.b.e(c, d, this.a.b(a2), this.a.e(a2));
            if (i3 != 0) {
                this.b.d();
                this.b.a(i3);
                if (this.b.b()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                this.b.d();
                this.b.a(i4);
                if (this.b.b()) {
                    view = a2;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean b(View view, int i) {
        this.b.e(this.a.c(), this.a.d(), this.a.b(view), this.a.e(view));
        if (i != 0) {
            this.b.d();
            this.b.a(i);
            return this.b.b();
        }
        return false;
    }
}
