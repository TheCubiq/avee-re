package com.daaw;

import android.os.Bundle;
import com.daaw.jt1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public class nk0 extends mk0 {

    /* renamed from: c */
    public static boolean f20178c;

    /* renamed from: a */
    public final sj0 f20179a;

    /* renamed from: b */
    public final C2303b f20180b;

    /* renamed from: com.daaw.nk0$a */
    /* loaded from: classes.dex */
    public static class C2302a<D> extends kr0<D> {

        /* renamed from: l */
        public final int f20181l;

        /* renamed from: m */
        public final Bundle f20182m;

        /* renamed from: n */
        public sj0 f20183n;

        @Override // androidx.lifecycle.LiveData
        /* renamed from: f */
        public void mo15136f() {
            if (nk0.f20178c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Starting: ");
                sb.append(this);
            }
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: g */
        public void mo15135g() {
            if (nk0.f20178c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Stopping: ");
                sb.append(this);
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        /* renamed from: i */
        public void mo15134i(qt0<? super D> qt0Var) {
            super.mo15134i(qt0Var);
            this.f20183n = null;
        }

        @Override // com.daaw.kr0, androidx.lifecycle.LiveData
        /* renamed from: j */
        public void mo15133j(D d) {
            super.mo15133j(d);
        }

        /* renamed from: k */
        public kk0<D> m15132k(boolean z) {
            if (nk0.f20178c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Destroying: ");
                sb.append(this);
            }
            throw null;
        }

        /* renamed from: l */
        public void m15131l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f20181l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f20182m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            throw null;
        }

        /* renamed from: m */
        public void m15130m() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f20181l);
            sb.append(" : ");
            C0882bq.m25924a(null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: com.daaw.nk0$b */
    /* loaded from: classes.dex */
    public static class C2303b extends ht1 {

        /* renamed from: f */
        public static final jt1.InterfaceC1864b f20184f = new C2304a();

        /* renamed from: d */
        public me1<C2302a> f20185d = new me1<>();

        /* renamed from: e */
        public boolean f20186e = false;

        /* renamed from: com.daaw.nk0$b$a */
        /* loaded from: classes.dex */
        public static class C2304a implements jt1.InterfaceC1864b {
            @Override // com.daaw.jt1.InterfaceC1864b
            /* renamed from: a */
            public <T extends ht1> T mo5153a(Class<T> cls) {
                return new C2303b();
            }

            @Override // com.daaw.jt1.InterfaceC1864b
            /* renamed from: b */
            public /* synthetic */ ht1 mo5152b(Class cls, AbstractC1589hn abstractC1589hn) {
                return kt1.m17441b(this, cls, abstractC1589hn);
            }
        }

        /* renamed from: f */
        public static C2303b m15128f(mt1 mt1Var) {
            return (C2303b) new jt1(mt1Var, f20184f).m18255a(C2303b.class);
        }

        @Override // com.daaw.ht1
        /* renamed from: d */
        public void mo7531d() {
            super.mo7531d();
            int m16051m = this.f20185d.m16051m();
            for (int i = 0; i < m16051m; i++) {
                this.f20185d.m16050n(i).m15132k(true);
            }
            this.f20185d.m16059b();
        }

        /* renamed from: e */
        public void m15129e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f20185d.m16051m() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f20185d.m16051m(); i++) {
                    C2302a m16050n = this.f20185d.m16050n(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f20185d.m16053j(i));
                    printWriter.print(": ");
                    printWriter.println(m16050n.toString());
                    m16050n.m15131l(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* renamed from: g */
        public void m15127g() {
            int m16051m = this.f20185d.m16051m();
            for (int i = 0; i < m16051m; i++) {
                this.f20185d.m16050n(i).m15130m();
            }
        }
    }

    public nk0(sj0 sj0Var, mt1 mt1Var) {
        this.f20179a = sj0Var;
        this.f20180b = C2303b.m15128f(mt1Var);
    }

    @Override // com.daaw.mk0
    @Deprecated
    /* renamed from: a */
    public void mo15138a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f20180b.m15129e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.daaw.mk0
    /* renamed from: c */
    public void mo15137c() {
        this.f20180b.m15127g();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0882bq.m25924a(this.f20179a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
