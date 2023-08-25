package com.daaw;

import android.os.Bundle;
import com.daaw.jt1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public class nk0 extends mk0 {
    public static boolean c;
    public final sj0 a;
    public final b b;

    /* loaded from: classes.dex */
    public static class a<D> extends kr0<D> {
        public final int l;
        public final Bundle m;
        public sj0 n;

        @Override // androidx.lifecycle.LiveData
        public void f() {
            if (nk0.c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Starting: ");
                sb.append(this);
            }
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        public void g() {
            if (nk0.c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Stopping: ");
                sb.append(this);
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void i(qt0<? super D> qt0Var) {
            super.i(qt0Var);
            this.n = null;
        }

        @Override // com.daaw.kr0, androidx.lifecycle.LiveData
        public void j(D d) {
            super.j(d);
        }

        public kk0<D> k(boolean z) {
            if (nk0.c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Destroying: ");
                sb.append(this);
            }
            throw null;
        }

        public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.l);
            printWriter.print(" mArgs=");
            printWriter.println(this.m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            throw null;
        }

        public void m() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.l);
            sb.append(" : ");
            bq.a(null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class b extends ht1 {
        public static final jt1.b f = new a();
        public me1<a> d = new me1<>();
        public boolean e = false;

        /* loaded from: classes.dex */
        public static class a implements jt1.b {
            @Override // com.daaw.jt1.b
            public <T extends ht1> T a(Class<T> cls) {
                return new b();
            }

            @Override // com.daaw.jt1.b
            public /* synthetic */ ht1 b(Class cls, hn hnVar) {
                return kt1.b(this, cls, hnVar);
            }
        }

        public static b f(mt1 mt1Var) {
            return (b) new jt1(mt1Var, f).a(b.class);
        }

        @Override // com.daaw.ht1
        public void d() {
            super.d();
            int m = this.d.m();
            for (int i = 0; i < m; i++) {
                this.d.n(i).k(true);
            }
            this.d.b();
        }

        public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.d.m() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.d.m(); i++) {
                    a n = this.d.n(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.d.j(i));
                    printWriter.print(": ");
                    printWriter.println(n.toString());
                    n.l(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        public void g() {
            int m = this.d.m();
            for (int i = 0; i < m; i++) {
                this.d.n(i).m();
            }
        }
    }

    public nk0(sj0 sj0Var, mt1 mt1Var) {
        this.a = sj0Var;
        this.b = b.f(mt1Var);
    }

    @Override // com.daaw.mk0
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.b.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.daaw.mk0
    public void c() {
        this.b.g();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        bq.a(this.a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
