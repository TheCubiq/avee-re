package com.daaw;

import android.content.Context;
import android.os.AsyncTask;
import com.daaw.s91;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public abstract class n10<T, V extends List<T>> extends bk0<T, V> {

    /* renamed from: G */
    public V f19333G;

    /* renamed from: H */
    public V f19334H;

    /* renamed from: I */
    public String f19335I;

    /* renamed from: J */
    public s91.InterfaceC2926b<T> f19336J;

    /* renamed from: com.daaw.n10$a */
    /* loaded from: classes.dex */
    public class C2233a implements s91.InterfaceC2926b<T> {
        public C2233a() {
        }

        @Override // com.daaw.s91.InterfaceC2926b
        /* renamed from: a */
        public void mo10504a(AsyncTask asyncTask, boolean z) {
            if (m15601d(asyncTask)) {
                n10 n10Var = n10.this;
                if (n10Var.f19334H == null) {
                    return;
                }
                n10Var.m3674N(false, true);
                n10.this.mo2264A();
            }
        }

        @Override // com.daaw.s91.InterfaceC2926b
        /* renamed from: b */
        public void mo10503b(AsyncTask asyncTask) {
            if (m15601d(asyncTask)) {
                n10 n10Var = n10.this;
                if (n10Var.f19334H == null) {
                    return;
                }
                n10Var.m3674N(true, false);
                n10.this.f19334H.clear();
                n10.this.mo2264A();
            }
        }

        @Override // com.daaw.s91.InterfaceC2926b
        /* renamed from: c */
        public void mo10502c(AsyncTask asyncTask, T t) {
            if (n10.this.f19334H != null && m15601d(asyncTask)) {
                n10.this.m15604U(t);
            }
        }

        /* renamed from: d */
        public boolean m15601d(AsyncTask asyncTask) {
            return AbstractC3711yj.f33709y.m4425a(asyncTask, Integer.valueOf(n10.this.f33722l), Boolean.FALSE).booleanValue();
        }
    }

    public n10(Context context, r40<AbstractC3711yj, V> r40Var, w40<V> w40Var, String str, me0<String> me0Var, int i, m10<T> m10Var, int i2) {
        super(context, r40Var, w40Var, str, me0Var, i, i2);
        this.f19335I = null;
        this.f19336J = new C2233a();
        m15602W(context, AbstractC3711yj.f33702r.m4425a(Integer.valueOf(i2), m3678J(), ""), m10Var);
    }

    @Override // com.daaw.bk0
    /* renamed from: Q */
    public lo1<V, String> mo15605Q(boolean z) {
        V v = this.f19334H;
        if (v == null) {
            return super.mo15605Q(z);
        }
        if (z) {
            v = null;
        }
        return new lo1<>(v, this.f19335I + this.f19334H.size());
    }

    /* renamed from: U */
    public void m15604U(T t) {
        this.f19334H.add(t);
    }

    /* renamed from: V */
    public final void m15603V(String str, m10<T> m10Var, V v) {
        Context m23837e = dx0.m23837e();
        if (m23837e == null) {
            return;
        }
        s91 s91Var = new s91(m23837e, v, m10Var, new WeakReference(this.f19336J));
        AbstractC3711yj.f33710z.m9795a(s91Var, Integer.valueOf(this.f33722l), str);
        s91Var.execute(str);
    }

    /* renamed from: W */
    public void m15602W(Context context, String str, m10<T> m10Var) {
        if (str == null || str.isEmpty() || m10Var == null) {
            this.f19334H = null;
            this.f19335I = null;
            this.f19333G = null;
            m3674N(false, true);
            mo2264A();
            return;
        }
        this.f19334H = this.f4872E.mo3478a();
        this.f19335I = str;
        m3674N(true, false);
        if (this.f19333G == null) {
            this.f19333G = (V) super.m26095S();
        }
        mo2264A();
        m15603V(str, m10Var, this.f19333G);
    }
}
