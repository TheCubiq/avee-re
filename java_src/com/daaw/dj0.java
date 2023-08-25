package com.daaw;

import android.app.Fragment;
import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ImageView;
import com.daaw.gh0;
import com.daaw.ie1;
import com.daaw.jh0;
import com.daaw.qw1;
import com.daaw.tx0;
import com.daaw.wc0;
import java.io.File;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public class dj0 extends Fragment implements wc0.InterfaceC3421b {

    /* renamed from: p */
    public static vw1<Integer> f7178p = new vw1<>();

    /* renamed from: q */
    public static rw1<String, String> f7179q = new rw1<>();

    /* renamed from: r */
    public static tw1<Integer, Boolean, String, sd0> f7180r = new tw1<>();

    /* renamed from: s */
    public static vw1<Integer> f7181s = new vw1<>();

    /* renamed from: t */
    public static rw1<Integer, View> f7182t = new rw1<>();

    /* renamed from: u */
    public static vw1<be0> f7183u = gh0.f11244a;

    /* renamed from: v */
    public static vw1<er0<tx0, vd0>> f7184v = gh0.f11245b;

    /* renamed from: w */
    public static qw1<Integer> f7185w = gh0.f11248e;

    /* renamed from: x */
    public static tw1<Context, List<tx0>, Boolean, C0645al> f7186x = gh0.f11251h;

    /* renamed from: y */
    public static rw1<Collection<tx0>, Integer> f7187y = gh0.f11249f;

    /* renamed from: z */
    public static sw1<List<tx0>, Integer, be0> f7188z = gh0.f11250g;

    /* renamed from: A */
    public static rw1<C0645al, List<gh0.C1408d>> f7137A = gh0.f11246c;

    /* renamed from: B */
    public static rw1<C0645al, Collection<tx0>> f7138B = gh0.f11247d;

    /* renamed from: C */
    public static qw1<vd0> f7139C = fh0.f9599d;

    /* renamed from: D */
    public static qw1<List<vd0>> f7140D = fh0.f9598c;

    /* renamed from: E */
    public static ww1<Integer, Boolean> f7141E = fh0.f9596a;

    /* renamed from: F */
    public static qw1<C0645al> f7142F = fh0.f9597b;

    /* renamed from: G */
    public static sw1<List<tx0>, Integer, be0> f7143G = hh0.f12539a;

    /* renamed from: H */
    public static sw1<List<tx0>, Integer, be0> f7144H = ih0.f13631a;

    /* renamed from: I */
    public static tw1<Context, String, String, C0645al> f7145I = eh0.f8471a;

    /* renamed from: J */
    public static tw1<Context, Long, String, C0645al> f7146J = eh0.f8472b;

    /* renamed from: K */
    public static tw1<Context, Long, String, C0645al> f7147K = eh0.f8473c;

    /* renamed from: L */
    public static sw1<Context, String, String> f7148L = dh0.f7056a;

    /* renamed from: M */
    public static rw1<Context, List<String>> f7149M = dh0.f7057b;

    /* renamed from: N */
    public static sw1<AbstractC2004l0[], Boolean, jh0.C1829a<Object>> f7150N = C3223uk.f29108H;

    /* renamed from: O */
    public static vw1<Boolean> f7151O = C3223uk.f29109I;

    /* renamed from: P */
    public static qw1<Object> f7152P = C3223uk.f29110J;

    /* renamed from: Q */
    public static sw1<C0645al, Integer, View> f7153Q = AbstractC2700qa.f23796y;

    /* renamed from: R */
    public static qw1<C0645al> f7154R = AbstractC2700qa.f23797z;

    /* renamed from: S */
    public static sw1<long[], List<String>, C0645al> f7155S = AbstractC2700qa.f23791A;

    /* renamed from: T */
    public static vw1<Boolean> f7156T = AbstractC2700qa.f23792u;

    /* renamed from: U */
    public static rw1<C0645al, View> f7157U = AbstractC2700qa.f23793v;

    /* renamed from: V */
    public static rw1<C0645al, View> f7158V = AbstractC2700qa.f23794w;

    /* renamed from: W */
    public static rw1<C0645al, View> f7159W = AbstractC2700qa.f23795x;

    /* renamed from: X */
    public static yw1<C1034d1, Integer, Integer, Boolean> f7160X = C2022la.f17168d;

    /* renamed from: Y */
    public static xw1<Integer, sd0, String> f7161Y = AbstractC3711yj.f33702r;

    /* renamed from: Z */
    public static xw1<Integer, sd0, ie1.C1695h> f7162Z = AbstractC3711yj.f33703s;

    /* renamed from: a0 */
    public static yw1<Integer, sd0, File, Boolean> f7163a0 = AbstractC3711yj.f33704t;

    /* renamed from: b0 */
    public static ww1<Class<?>, Boolean> f7164b0 = AbstractC3711yj.f33705u;

    /* renamed from: c0 */
    public static rw1<Boolean, Class<?>> f7165c0 = AbstractC3711yj.f33706v;

    /* renamed from: d0 */
    public static sw1<Integer, Integer, List<Integer>> f7166d0 = AbstractC3711yj.f33707w;

    /* renamed from: e0 */
    public static tw1<C1652i2, ImageView, Boolean, Boolean> f7167e0 = AbstractC3711yj.f33700p;

    /* renamed from: f0 */
    public static vw1<Boolean> f7168f0 = AbstractC3711yj.f33701q;

    /* renamed from: g0 */
    public static ww1<jh0.C1829a, Boolean> f7169g0 = AbstractC3711yj.f33708x;

    /* renamed from: h0 */
    public static xw1<AsyncTask, Integer, Boolean> f7170h0 = AbstractC3711yj.f33709y;

    /* renamed from: i0 */
    public static sw1<AsyncTask, Integer, Object> f7171i0 = AbstractC3711yj.f33710z;

    /* renamed from: j0 */
    public static qw1<Integer> f7172j0 = AbstractC3711yj.f33698A;

    /* renamed from: k0 */
    public static ww1<wc0, lo1<Integer, Boolean>> f7173k0 = AbstractC3711yj.f33699B;

    /* renamed from: l0 */
    public static kw1<C3223uk, tx0.C3143b, Boolean> f7174l0 = C2719qk.f24075O;

    /* renamed from: m0 */
    public static qw1<Integer> f7175m0 = new qw1<>();

    /* renamed from: n0 */
    public static qw1<Boolean> f7176n0 = new qw1<>();

    /* renamed from: o0 */
    public static qw1<Boolean> f7177o0 = new qw1<>();

    /* renamed from: h */
    public static m91 m24360h(Context context, ts1 ts1Var) {
        if (ts1Var == null) {
            return m91.f18679d;
        }
        String[] strArr = new String[1];
        sd0[] sd0VarArr = new sd0[1];
        ts1Var.m8843z().mo2230x(context, strArr, sd0VarArr);
        if (strArr[0] == null || strArr[0].isEmpty()) {
            m91 m91Var = new m91();
            m91Var.f18680a = false;
            m91Var.f18681b = "";
            m91Var.f18682c = null;
            return m91Var;
        }
        sd0 sd0Var = sd0VarArr[0];
        String str = strArr[0];
        m91 m91Var2 = new m91();
        m91Var2.f18680a = true;
        m91Var2.f18681b = str;
        m91Var2.f18682c = sd0Var;
        return m91Var2;
    }

    /* renamed from: i */
    public static void m24359i(boolean z) {
        f7176n0.m12018a(Boolean.valueOf(z));
    }

    /* renamed from: j */
    public static void m24358j(boolean z) {
        f7177o0.m12018a(Boolean.valueOf(z));
    }

    /* renamed from: k */
    public static void m24357k(int i) {
        f7175m0.m12018a(Integer.valueOf(i));
    }

    @Override // com.daaw.wc0.InterfaceC3421b
    /* renamed from: a */
    public void mo6188a(String str, String str2) {
        f7179q.m10862a(str, str2);
    }

    @Override // com.daaw.wc0.InterfaceC3421b
    /* renamed from: b */
    public void mo6187b(qw1.InterfaceC2788a<Integer> interfaceC2788a, List<Object> list) {
        f7175m0.m12017b(interfaceC2788a, list);
    }

    @Override // com.daaw.wc0.InterfaceC3421b
    /* renamed from: c */
    public int mo6186c() {
        return f7178p.m6692a(0).intValue();
    }

    @Override // com.daaw.wc0.InterfaceC3421b
    /* renamed from: d */
    public int mo6185d() {
        return f7181s.m6692a(0).intValue();
    }

    @Override // com.daaw.wc0.InterfaceC3421b
    /* renamed from: e */
    public void mo6184e(qw1.InterfaceC2788a<Boolean> interfaceC2788a, List<Object> list) {
        f7176n0.m12017b(interfaceC2788a, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    @Override // com.daaw.wc0.InterfaceC3421b
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String mo6183f(String str, String str2) {
        StringBuilder sb;
        String sb2;
        int length;
        if (str2.length() <= 0) {
            return str;
        }
        if (str.length() <= 0) {
            return str + str2;
        }
        if (str.charAt(str.length() - 1) == '/') {
            if (str2.charAt(0) == '/') {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(str2.substring(1));
                sb2 = sb.toString();
                length = sb2.length();
                if (length > 0 || sb2.charAt(length - 1) != '/') {
                    return sb2 + "/";
                }
                return sb2;
            }
            sb = new StringBuilder();
        } else if (str2.charAt(0) != '/') {
            sb = new StringBuilder();
            sb.append(str);
            sb.append("/");
            sb.append(str2);
            sb2 = sb.toString();
            length = sb2.length();
            if (length > 0) {
            }
            return sb2 + "/";
        } else {
            sb = new StringBuilder();
        }
        sb.append(str);
        sb.append(str2);
        sb2 = sb.toString();
        length = sb2.length();
        if (length > 0) {
        }
        return sb2 + "/";
    }

    @Override // com.daaw.wc0.InterfaceC3421b
    /* renamed from: g */
    public void mo6182g(qw1.InterfaceC2788a<Boolean> interfaceC2788a, List<Object> list) {
        f7177o0.m12017b(interfaceC2788a, list);
    }
}
