package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class g5 {
    public final gk5 a;

    /* loaded from: classes2.dex */
    public interface a extends pl7 {
    }

    public g5(gk5 gk5Var) {
        this.a = gk5Var;
    }

    public static g5 k(Context context, String str, String str2, String str3, Bundle bundle) {
        return gk5.u(context, str, str2, str3, bundle).r();
    }

    public void a(String str) {
        this.a.G(str);
    }

    public void b(String str, String str2, Bundle bundle) {
        this.a.H(str, str2, bundle);
    }

    public void c(String str) {
        this.a.I(str);
    }

    public long d() {
        return this.a.p();
    }

    public String e() {
        return this.a.w();
    }

    public String f() {
        return this.a.x();
    }

    public List<Bundle> g(String str, String str2) {
        return this.a.B(str, str2);
    }

    public String h() {
        return this.a.y();
    }

    public String i() {
        return this.a.z();
    }

    public String j() {
        return this.a.A();
    }

    public int l(String str) {
        return this.a.o(str);
    }

    public Map<String, Object> m(String str, String str2, boolean z) {
        return this.a.C(str, str2, z);
    }

    public void n(String str, String str2, Bundle bundle) {
        this.a.J(str, str2, bundle);
    }

    public void o(Bundle bundle) {
        this.a.q(bundle, false);
    }

    public Bundle p(Bundle bundle) {
        return this.a.q(bundle, true);
    }

    public void q(a aVar) {
        this.a.b(aVar);
    }

    public void r(Bundle bundle) {
        this.a.c(bundle);
    }

    public void s(Bundle bundle) {
        this.a.d(bundle);
    }

    public void t(Activity activity, String str, String str2) {
        this.a.e(activity, str, str2);
    }

    public void u(String str, String str2, Object obj) {
        this.a.g(str, str2, obj, true);
    }

    public final void v(boolean z) {
        this.a.f(z);
    }
}
