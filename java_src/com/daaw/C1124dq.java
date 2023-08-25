package com.daaw;

import android.util.Log;
import com.daaw.InterfaceC3255ut;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* renamed from: com.daaw.dq */
/* loaded from: classes.dex */
public class C1124dq<A, T, Z> {

    /* renamed from: m */
    public static final C1126b f7607m = new C1126b();

    /* renamed from: a */
    public final C1766ix f7608a;

    /* renamed from: b */
    public final int f7609b;

    /* renamed from: c */
    public final int f7610c;

    /* renamed from: d */
    public final InterfaceC1744ip<A> f7611d;

    /* renamed from: e */
    public final InterfaceC1849jp<A, T> f7612e;

    /* renamed from: f */
    public final cn1<T> f7613f;

    /* renamed from: g */
    public final i51<T, Z> f7614g;

    /* renamed from: h */
    public final InterfaceC1125a f7615h;

    /* renamed from: i */
    public final EnumC3465wt f7616i;

    /* renamed from: j */
    public final dz0 f7617j;

    /* renamed from: k */
    public final C1126b f7618k;

    /* renamed from: l */
    public volatile boolean f7619l;

    /* renamed from: com.daaw.dq$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1125a {
        /* renamed from: a */
        InterfaceC3255ut mo22171a();
    }

    /* renamed from: com.daaw.dq$b */
    /* loaded from: classes.dex */
    public static class C1126b {
        /* renamed from: a */
        public OutputStream m24081a(File file) {
            return new BufferedOutputStream(new FileOutputStream(file));
        }
    }

    /* renamed from: com.daaw.dq$c */
    /* loaded from: classes.dex */
    public class C1127c<DataType> implements InterfaceC3255ut.InterfaceC3257b {

        /* renamed from: a */
        public final InterfaceC3911zw<DataType> f7620a;

        /* renamed from: b */
        public final DataType f7621b;

        public C1127c(InterfaceC3911zw<DataType> interfaceC3911zw, DataType datatype) {
            this.f7620a = interfaceC3911zw;
            this.f7621b = datatype;
        }

        @Override // com.daaw.InterfaceC3255ut.InterfaceC3257b
        /* renamed from: a */
        public boolean mo7739a(File file) {
            boolean z;
            OutputStream outputStream = null;
            try {
                try {
                    outputStream = C1124dq.this.f7618k.m24081a(file);
                    z = this.f7620a.mo1827a(this.f7621b, outputStream);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (Throwable th) {
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused3) {
                Log.isLoggable("DecodeJob", 3);
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public C1124dq(C1766ix c1766ix, int i, int i2, InterfaceC1744ip<A> interfaceC1744ip, InterfaceC1849jp<A, T> interfaceC1849jp, cn1<T> cn1Var, i51<T, Z> i51Var, InterfaceC1125a interfaceC1125a, EnumC3465wt enumC3465wt, dz0 dz0Var) {
        this(c1766ix, i, i2, interfaceC1744ip, interfaceC1849jp, cn1Var, i51Var, interfaceC1125a, enumC3465wt, dz0Var, f7607m);
    }

    public C1124dq(C1766ix c1766ix, int i, int i2, InterfaceC1744ip<A> interfaceC1744ip, InterfaceC1849jp<A, T> interfaceC1849jp, cn1<T> cn1Var, i51<T, Z> i51Var, InterfaceC1125a interfaceC1125a, EnumC3465wt enumC3465wt, dz0 dz0Var, C1126b c1126b) {
        this.f7608a = c1766ix;
        this.f7609b = i;
        this.f7610c = i2;
        this.f7611d = interfaceC1744ip;
        this.f7612e = interfaceC1849jp;
        this.f7613f = cn1Var;
        this.f7614g = i51Var;
        this.f7615h = interfaceC1125a;
        this.f7616i = enumC3465wt;
        this.f7617j = dz0Var;
        this.f7618k = c1126b;
    }

    /* renamed from: b */
    public final z41<T> m24094b(A a) {
        long m18440b = jl0.m18440b();
        this.f7615h.mo22171a().mo6808b(this.f7608a.m19302b(), new C1127c(this.f7612e.mo6618a(), a));
        if (Log.isLoggable("DecodeJob", 2)) {
            m24086j("Wrote source to cache", m18440b);
        }
        long m18440b2 = jl0.m18440b();
        z41<T> m24087i = m24087i(this.f7608a.m19302b());
        if (Log.isLoggable("DecodeJob", 2) && m24087i != null) {
            m24086j("Decoded source from cache", m18440b2);
        }
        return m24087i;
    }

    /* renamed from: c */
    public void m24093c() {
        this.f7619l = true;
        this.f7611d.cancel();
    }

    /* renamed from: d */
    public z41<Z> m24092d() {
        return m24083m(m24089g());
    }

    /* renamed from: e */
    public final z41<T> m24091e(A a) {
        if (this.f7616i.m5818b()) {
            return m24094b(a);
        }
        long m18440b = jl0.m18440b();
        z41<T> mo2793c = this.f7612e.mo6616d().mo2793c(a, this.f7609b, this.f7610c);
        if (Log.isLoggable("DecodeJob", 2)) {
            m24086j("Decoded from source", m18440b);
            return mo2793c;
        }
        return mo2793c;
    }

    /* renamed from: f */
    public z41<Z> m24090f() {
        if (this.f7616i.m5819a()) {
            long m18440b = jl0.m18440b();
            z41<T> m24087i = m24087i(this.f7608a);
            if (Log.isLoggable("DecodeJob", 2)) {
                m24086j("Decoded transformed from cache", m18440b);
            }
            long m18440b2 = jl0.m18440b();
            z41<Z> m24085k = m24085k(m24087i);
            if (Log.isLoggable("DecodeJob", 2)) {
                m24086j("Transcoded transformed from cache", m18440b2);
            }
            return m24085k;
        }
        return null;
    }

    /* renamed from: g */
    public final z41<T> m24089g() {
        try {
            long m18440b = jl0.m18440b();
            A mo4085a = this.f7611d.mo4085a(this.f7617j);
            if (Log.isLoggable("DecodeJob", 2)) {
                m24086j("Fetched data", m18440b);
            }
            if (this.f7619l) {
                return null;
            }
            return m24091e(mo4085a);
        } finally {
            this.f7611d.mo4084b();
        }
    }

    /* renamed from: h */
    public z41<Z> m24088h() {
        if (this.f7616i.m5818b()) {
            long m18440b = jl0.m18440b();
            z41<T> m24087i = m24087i(this.f7608a.m19302b());
            if (Log.isLoggable("DecodeJob", 2)) {
                m24086j("Decoded source from cache", m18440b);
            }
            return m24083m(m24087i);
        }
        return null;
    }

    /* renamed from: i */
    public final z41<T> m24087i(hi0 hi0Var) {
        File mo6807c = this.f7615h.mo22171a().mo6807c(hi0Var);
        if (mo6807c == null) {
            return null;
        }
        try {
            z41<T> mo2793c = this.f7612e.mo6615e().mo2793c(mo6807c, this.f7609b, this.f7610c);
            if (mo2793c == null) {
            }
            return mo2793c;
        } finally {
            this.f7615h.mo22171a().mo6809a(hi0Var);
        }
    }

    /* renamed from: j */
    public final void m24086j(String str, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(jl0.m18441a(j));
        sb.append(", key: ");
        sb.append(this.f7608a);
    }

    /* renamed from: k */
    public final z41<Z> m24085k(z41<T> z41Var) {
        if (z41Var == null) {
            return null;
        }
        return this.f7614g.mo15864a(z41Var);
    }

    /* renamed from: l */
    public final z41<T> m24084l(z41<T> z41Var) {
        if (z41Var == null) {
            return null;
        }
        z41<T> mo7395a = this.f7613f.mo7395a(z41Var, this.f7609b, this.f7610c);
        if (!z41Var.equals(mo7395a)) {
            z41Var.mo2827c();
        }
        return mo7395a;
    }

    /* renamed from: m */
    public final z41<Z> m24083m(z41<T> z41Var) {
        long m18440b = jl0.m18440b();
        z41<T> m24084l = m24084l(z41Var);
        if (Log.isLoggable("DecodeJob", 2)) {
            m24086j("Transformed resource from source", m18440b);
        }
        m24082n(m24084l);
        long m18440b2 = jl0.m18440b();
        z41<Z> m24085k = m24085k(m24084l);
        if (Log.isLoggable("DecodeJob", 2)) {
            m24086j("Transcoded transformed from source", m18440b2);
        }
        return m24085k;
    }

    /* renamed from: n */
    public final void m24082n(z41<T> z41Var) {
        if (z41Var == null || !this.f7616i.m5819a()) {
            return;
        }
        long m18440b = jl0.m18440b();
        this.f7615h.mo22171a().mo6808b(this.f7608a, new C1127c(this.f7612e.mo6617c(), z41Var));
        if (Log.isLoggable("DecodeJob", 2)) {
            m24086j("Wrote transformed from source to cache", m18440b);
        }
    }
}
