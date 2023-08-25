package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class wb1 implements zb1 {

    /* renamed from: a */
    public final Context f31135a;

    /* renamed from: b */
    public final ac1 f31136b;

    /* renamed from: c */
    public final xb1 f31137c;

    /* renamed from: d */
    public final InterfaceC2196mn f31138d;

    /* renamed from: e */
    public final C1530hd f31139e;

    /* renamed from: f */
    public final bc1 f31140f;

    /* renamed from: g */
    public final C1209ep f31141g;

    /* renamed from: h */
    public final AtomicReference<tb1> f31142h;

    /* renamed from: i */
    public final AtomicReference<tj1<tb1>> f31143i;

    /* renamed from: com.daaw.wb1$a */
    /* loaded from: classes2.dex */
    public class C3418a implements ai1<Void, Void> {
        public C3418a() {
        }

        @Override // com.daaw.ai1
        /* renamed from: b */
        public rj1<Void> mo6209a(Void r5) {
            JSONObject mo4796a = wb1.this.f31140f.mo4796a(wb1.this.f31136b, true);
            if (mo4796a != null) {
                tb1 m5312b = wb1.this.f31137c.m5312b(mo4796a);
                wb1.this.f31139e.m20839c(m5312b.f27201c, mo4796a);
                wb1.this.m6211q(mo4796a, "Loaded settings: ");
                wb1 wb1Var = wb1.this;
                wb1Var.m6210r(wb1Var.f31136b.f3060f);
                wb1.this.f31142h.set(m5312b);
                ((tj1) wb1.this.f31143i.get()).m9078e(m5312b);
            }
            return dk1.m24304e(null);
        }
    }

    public wb1(Context context, ac1 ac1Var, InterfaceC2196mn interfaceC2196mn, xb1 xb1Var, C1530hd c1530hd, bc1 bc1Var, C1209ep c1209ep) {
        AtomicReference<tb1> atomicReference = new AtomicReference<>();
        this.f31142h = atomicReference;
        this.f31143i = new AtomicReference<>(new tj1());
        this.f31135a = context;
        this.f31136b = ac1Var;
        this.f31138d = interfaceC2196mn;
        this.f31137c = xb1Var;
        this.f31139e = c1530hd;
        this.f31140f = bc1Var;
        this.f31141g = c1209ep;
        atomicReference.set(C3463wr.m5842b(interfaceC2196mn));
    }

    /* renamed from: l */
    public static wb1 m6216l(Context context, String str, ue0 ue0Var, vb0 vb0Var, String str2, String str3, h10 h10Var, C1209ep c1209ep) {
        String m8298g = ue0Var.m8298g();
        wi1 wi1Var = new wi1();
        return new wb1(context, new ac1(str, ue0Var.m8297h(), ue0Var.m8296i(), ue0Var.m8295j(), ue0Var, C1279fh.m22659h(C1279fh.m22653n(context), str, str3, str2), str3, str2, EnumC3464ws.m5831a(m8298g).m5830b()), wi1Var, new xb1(wi1Var), new C1530hd(h10Var), new C3565xr(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), vb0Var), c1209ep);
    }

    @Override // com.daaw.zb1
    /* renamed from: a */
    public rj1<tb1> mo2555a() {
        return this.f31143i.get().m9082a();
    }

    @Override // com.daaw.zb1
    /* renamed from: b */
    public tb1 mo2554b() {
        return this.f31142h.get();
    }

    /* renamed from: k */
    public boolean m6217k() {
        return !m6214n().equals(this.f31136b.f3060f);
    }

    /* renamed from: m */
    public final tb1 m6215m(vb1 vb1Var) {
        tb1 tb1Var = null;
        try {
            if (!vb1.SKIP_CACHE_LOOKUP.equals(vb1Var)) {
                JSONObject m20840b = this.f31139e.m20840b();
                if (m20840b != null) {
                    tb1 m5312b = this.f31137c.m5312b(m20840b);
                    if (m5312b != null) {
                        m6211q(m20840b, "Loaded cached settings: ");
                        long mo6059a = this.f31138d.mo6059a();
                        if (!vb1.IGNORE_CACHE_EXPIRATION.equals(vb1Var) && m5312b.m9372a(mo6059a)) {
                            ml0.m15976f().m15973i("Cached settings have expired.");
                        }
                        try {
                            ml0.m15976f().m15973i("Returning cached settings.");
                            tb1Var = m5312b;
                        } catch (Exception e) {
                            e = e;
                            tb1Var = m5312b;
                            ml0.m15976f().m15977e("Failed to get cached settings", e);
                            return tb1Var;
                        }
                    } else {
                        ml0.m15976f().m15977e("Failed to parse cached settings data.", null);
                    }
                } else {
                    ml0.m15976f().m15980b("No cached settings data found.");
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        return tb1Var;
    }

    /* renamed from: n */
    public final String m6214n() {
        return C1279fh.m22649r(this.f31135a).getString("existing_instance_identifier", "");
    }

    /* renamed from: o */
    public rj1<Void> m6213o(vb1 vb1Var, Executor executor) {
        tb1 m6215m;
        if (!m6217k() && (m6215m = m6215m(vb1Var)) != null) {
            this.f31142h.set(m6215m);
            this.f31143i.get().m9078e(m6215m);
            return dk1.m24304e(null);
        }
        tb1 m6215m2 = m6215m(vb1.IGNORE_CACHE_EXPIRATION);
        if (m6215m2 != null) {
            this.f31142h.set(m6215m2);
            this.f31143i.get().m9078e(m6215m2);
        }
        return this.f31141g.m23318h(executor).mo11234p(executor, new C3418a());
    }

    /* renamed from: p */
    public rj1<Void> m6212p(Executor executor) {
        return m6213o(vb1.USE_CACHE, executor);
    }

    /* renamed from: q */
    public final void m6211q(JSONObject jSONObject, String str) {
        ml0 m15976f = ml0.m15976f();
        m15976f.m15980b(str + jSONObject.toString());
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: r */
    public final boolean m6210r(String str) {
        SharedPreferences.Editor edit = C1279fh.m22649r(this.f31135a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }
}
