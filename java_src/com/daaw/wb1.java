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
    public final Context a;
    public final ac1 b;
    public final xb1 c;
    public final mn d;
    public final hd e;
    public final bc1 f;
    public final ep g;
    public final AtomicReference<tb1> h;
    public final AtomicReference<tj1<tb1>> i;

    /* loaded from: classes2.dex */
    public class a implements ai1<Void, Void> {
        public a() {
        }

        @Override // com.daaw.ai1
        /* renamed from: b */
        public rj1<Void> a(Void r5) {
            JSONObject a = wb1.this.f.a(wb1.this.b, true);
            if (a != null) {
                tb1 b = wb1.this.c.b(a);
                wb1.this.e.c(b.c, a);
                wb1.this.q(a, "Loaded settings: ");
                wb1 wb1Var = wb1.this;
                wb1Var.r(wb1Var.b.f);
                wb1.this.h.set(b);
                ((tj1) wb1.this.i.get()).e(b);
            }
            return dk1.e(null);
        }
    }

    public wb1(Context context, ac1 ac1Var, mn mnVar, xb1 xb1Var, hd hdVar, bc1 bc1Var, ep epVar) {
        AtomicReference<tb1> atomicReference = new AtomicReference<>();
        this.h = atomicReference;
        this.i = new AtomicReference<>(new tj1());
        this.a = context;
        this.b = ac1Var;
        this.d = mnVar;
        this.c = xb1Var;
        this.e = hdVar;
        this.f = bc1Var;
        this.g = epVar;
        atomicReference.set(wr.b(mnVar));
    }

    public static wb1 l(Context context, String str, ue0 ue0Var, vb0 vb0Var, String str2, String str3, h10 h10Var, ep epVar) {
        String g = ue0Var.g();
        wi1 wi1Var = new wi1();
        return new wb1(context, new ac1(str, ue0Var.h(), ue0Var.i(), ue0Var.j(), ue0Var, fh.h(fh.n(context), str, str3, str2), str3, str2, ws.a(g).b()), wi1Var, new xb1(wi1Var), new hd(h10Var), new xr(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), vb0Var), epVar);
    }

    @Override // com.daaw.zb1
    public rj1<tb1> a() {
        return this.i.get().a();
    }

    @Override // com.daaw.zb1
    public tb1 b() {
        return this.h.get();
    }

    public boolean k() {
        return !n().equals(this.b.f);
    }

    public final tb1 m(vb1 vb1Var) {
        tb1 tb1Var = null;
        try {
            if (!vb1.SKIP_CACHE_LOOKUP.equals(vb1Var)) {
                JSONObject b = this.e.b();
                if (b != null) {
                    tb1 b2 = this.c.b(b);
                    if (b2 != null) {
                        q(b, "Loaded cached settings: ");
                        long a2 = this.d.a();
                        if (!vb1.IGNORE_CACHE_EXPIRATION.equals(vb1Var) && b2.a(a2)) {
                            ml0.f().i("Cached settings have expired.");
                        }
                        try {
                            ml0.f().i("Returning cached settings.");
                            tb1Var = b2;
                        } catch (Exception e) {
                            e = e;
                            tb1Var = b2;
                            ml0.f().e("Failed to get cached settings", e);
                            return tb1Var;
                        }
                    } else {
                        ml0.f().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    ml0.f().b("No cached settings data found.");
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        return tb1Var;
    }

    public final String n() {
        return fh.r(this.a).getString("existing_instance_identifier", "");
    }

    public rj1<Void> o(vb1 vb1Var, Executor executor) {
        tb1 m;
        if (!k() && (m = m(vb1Var)) != null) {
            this.h.set(m);
            this.i.get().e(m);
            return dk1.e(null);
        }
        tb1 m2 = m(vb1.IGNORE_CACHE_EXPIRATION);
        if (m2 != null) {
            this.h.set(m2);
            this.i.get().e(m2);
        }
        return this.g.h(executor).p(executor, new a());
    }

    public rj1<Void> p(Executor executor) {
        return o(vb1.USE_CACHE, executor);
    }

    public final void q(JSONObject jSONObject, String str) {
        ml0 f = ml0.f();
        f.b(str + jSONObject.toString());
    }

    @SuppressLint({"CommitPrefEdits"})
    public final boolean r(String str) {
        SharedPreferences.Editor edit = fh.r(this.a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }
}
