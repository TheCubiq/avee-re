package com.daaw;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ImageView;
import com.daaw.avee.R;
import com.daaw.ie1;
import com.daaw.jh0;
import com.daaw.wc0;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
/* renamed from: com.daaw.yj */
/* loaded from: classes.dex */
public abstract class AbstractC3711yj implements wc0 {

    /* renamed from: a */
    public wc0.InterfaceC3422c f33711a;

    /* renamed from: b */
    public WeakReference<wc0.InterfaceC3420a> f33712b;

    /* renamed from: c */
    public WeakReference<wc0.InterfaceC3421b> f33713c;

    /* renamed from: d */
    public me0<String> f33714d;

    /* renamed from: e */
    public int f33715e;

    /* renamed from: f */
    public String f33716f;

    /* renamed from: g */
    public int f33717g;

    /* renamed from: h */
    public int f33718h;

    /* renamed from: i */
    public int f33719i;

    /* renamed from: j */
    public int f33720j;

    /* renamed from: k */
    public sd0 f33721k;

    /* renamed from: l */
    public int f33722l;

    /* renamed from: m */
    public String f33723m;

    /* renamed from: n */
    public boolean f33724n;

    /* renamed from: o */
    public boolean f33725o;

    /* renamed from: p */
    public static tw1<C1652i2, ImageView, Boolean, Boolean> f33700p = new tw1<>();

    /* renamed from: q */
    public static vw1<Boolean> f33701q = new vw1<>();

    /* renamed from: r */
    public static xw1<Integer, sd0, String> f33702r = new xw1<>();

    /* renamed from: s */
    public static xw1<Integer, sd0, ie1.C1695h> f33703s = new xw1<>();

    /* renamed from: t */
    public static yw1<Integer, sd0, File, Boolean> f33704t = new yw1<>();

    /* renamed from: u */
    public static ww1<Class<?>, Boolean> f33705u = new ww1<>();

    /* renamed from: v */
    public static rw1<Boolean, Class<?>> f33706v = new rw1<>();

    /* renamed from: w */
    public static sw1<Integer, Integer, List<Integer>> f33707w = new sw1<>();

    /* renamed from: x */
    public static ww1<jh0.C1829a, Boolean> f33708x = new ww1<>();

    /* renamed from: y */
    public static xw1<AsyncTask, Integer, Boolean> f33709y = new xw1<>();

    /* renamed from: z */
    public static sw1<AsyncTask, Integer, Object> f33710z = new sw1<>();

    /* renamed from: A */
    public static qw1<Integer> f33698A = new qw1<>();

    /* renamed from: B */
    public static ww1<wc0, lo1<Integer, Boolean>> f33699B = new ww1<>();

    /* renamed from: com.daaw.yj$a */
    /* loaded from: classes.dex */
    public static class C3712a implements be0, sd0 {

        /* renamed from: a */
        public String f33726a;

        public C3712a(String str) {
            this.f33726a = str;
        }

        @Override // com.daaw.be0, com.daaw.sd0
        public boolean equals(Object obj) {
            return (obj instanceof C3712a) && this.f33726a.compareTo(((C3712a) obj).f33726a) == 0;
        }

        @Override // com.daaw.sd0
        public int hashCode() {
            return this.f33726a.hashCode();
        }
    }

    public AbstractC3711yj(Context context, String str, me0<String> me0Var, int i, int i2) {
        this(context, str, me0Var, i, i2, new WeakReference(null));
    }

    public AbstractC3711yj(Context context, String str, me0<String> me0Var, int i, int i2, WeakReference<wc0.InterfaceC3421b> weakReference) {
        this.f33712b = new WeakReference<>(null);
        this.f33723m = null;
        this.f33724n = false;
        this.f33725o = false;
        this.f33722l = i2;
        this.f33714d = me0Var;
        this.f33715e = i;
        this.f33716f = str;
        mo3663q(weakReference);
        this.f33717g = gr1.m21322m(context.getTheme(), R.attr.containerFG);
        this.f33718h = gr1.m21322m(context.getTheme(), R.attr.containerFGw);
        this.f33719i = gr1.m21322m(context.getTheme(), R.attr.containerFG);
        this.f33720j = gr1.m21322m(context.getTheme(), R.attr.containerBackgroundDark);
        this.f33721k = m3677K(str);
    }

    /* renamed from: K */
    public static sd0 m3677K(String str) {
        return new C3712a(str);
    }

    /* renamed from: A */
    public abstract boolean mo2264A();

    /* renamed from: B */
    public boolean m3684B(String str, boolean z) {
        if (this.f33723m == null || !m3683C(str)) {
            if (z) {
                this.f33723m = str;
                return false;
            }
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public boolean m3683C(String str) {
        String str2 = this.f33723m;
        return (str2 == null || str == null || !br1.m25901h(str2, str)) ? false : true;
    }

    /* renamed from: D */
    public void m3682D() {
        this.f33723m = null;
    }

    /* renamed from: E */
    public abstract ts1 mo2263E(Context context, int i);

    /* renamed from: F */
    public ts1 m3681F(Context context) {
        return m3680G(context, -1);
    }

    /* renamed from: G */
    public ts1 m3680G(Context context, int i) {
        return mo2263E(context, i);
    }

    /* renamed from: H */
    public abstract String mo2262H(int i);

    /* renamed from: I */
    public int m3679I() {
        return this.f33722l;
    }

    /* renamed from: J */
    public sd0 m3678J() {
        return this.f33721k;
    }

    /* renamed from: L */
    public void m3676L(boolean z) {
        this.f33725o = z;
        wc0.InterfaceC3420a interfaceC3420a = this.f33712b.get();
        if (interfaceC3420a != null) {
            interfaceC3420a.mo6189b(mo2250a(), 0, this.f33724n, z);
        }
    }

    /* renamed from: M */
    public void m3675M(wc0.InterfaceC3422c interfaceC3422c) {
        this.f33711a = interfaceC3422c;
    }

    /* renamed from: N */
    public void m3674N(boolean z, boolean z2) {
        this.f33724n = z;
        wc0.InterfaceC3420a interfaceC3420a = this.f33712b.get();
        if (interfaceC3420a != null) {
            interfaceC3420a.mo6189b(z2 ? mo2250a() : -1, 0, this.f33724n, this.f33725o);
        }
    }

    /* renamed from: O */
    public void m3673O(String str) {
        wc0.InterfaceC3420a interfaceC3420a = this.f33712b.get();
        if (interfaceC3420a != null) {
            interfaceC3420a.mo6190a(str);
        }
    }

    @Override // com.daaw.wc0, com.daaw.ts1.InterfaceC3115a
    /* renamed from: a */
    public abstract int mo2250a();

    @Override // com.daaw.wc0
    /* renamed from: b */
    public boolean mo3672b() {
        return f33701q.m6692a(Boolean.TRUE).booleanValue();
    }

    @Override // com.daaw.wc0
    /* renamed from: c */
    public void mo3671c(boolean z) {
    }

    @Override // com.daaw.wc0
    /* renamed from: e */
    public String mo3670e() {
        return this.f33716f;
    }

    @Override // com.daaw.wc0
    /* renamed from: g */
    public void mo2241g(C0645al c0645al, int i) {
    }

    @Override // com.daaw.wc0
    /* renamed from: h */
    public boolean mo3669h(boolean z) {
        if (z) {
            m3682D();
        }
        return mo2264A();
    }

    @Override // com.daaw.wc0
    /* renamed from: i */
    public int mo3668i() {
        return this.f33715e;
    }

    @Override // com.daaw.wc0
    /* renamed from: l */
    public me0<String> mo3667l() {
        return this.f33714d;
    }

    @Override // com.daaw.wc0
    /* renamed from: m */
    public boolean mo3666m(int i, Context context) {
        wc0.InterfaceC3421b interfaceC3421b = this.f33713c.get();
        if (interfaceC3421b != null) {
            interfaceC3421b.mo6188a(mo3670e(), mo2262H(i));
            return false;
        }
        return false;
    }

    @Override // com.daaw.wc0
    /* renamed from: n */
    public void mo3665n(WeakReference<wc0.InterfaceC3420a> weakReference) {
        this.f33712b = weakReference;
        wc0.InterfaceC3420a interfaceC3420a = weakReference.get();
        if (interfaceC3420a != null) {
            interfaceC3420a.mo6189b(mo2250a(), 0, this.f33724n, this.f33725o);
        }
    }

    @Override // com.daaw.wc0
    /* renamed from: p */
    public String mo3664p(String str) {
        wc0.InterfaceC3421b interfaceC3421b = this.f33713c.get();
        return interfaceC3421b != null ? interfaceC3421b.mo6183f(mo3670e(), str) : mo3670e();
    }

    @Override // com.daaw.wc0
    /* renamed from: q */
    public void mo3663q(WeakReference<wc0.InterfaceC3421b> weakReference) {
        this.f33713c = weakReference;
    }

    @Override // com.daaw.wc0
    /* renamed from: s */
    public lo1<Integer, Boolean> mo3662s() {
        return f33699B.m5753a(this, new lo1<>(56, Boolean.TRUE));
    }

    @Override // com.daaw.wc0
    /* renamed from: u */
    public wc0.InterfaceC3422c mo3661u() {
        return this.f33711a;
    }

    @Override // com.daaw.wc0
    /* renamed from: w */
    public wc0.InterfaceC3421b mo3660w() {
        return this.f33713c.get();
    }

    @Override // com.daaw.wc0
    /* renamed from: x */
    public void mo2230x(Context context, String[] strArr, sd0[] sd0VarArr) {
        strArr[0] = null;
        sd0VarArr[0] = null;
    }

    @Override // com.daaw.wc0
    /* renamed from: y */
    public boolean mo3659y(sd0 sd0Var) {
        return this.f33721k.equals(sd0Var);
    }

    @Override // com.daaw.wc0
    /* renamed from: z */
    public boolean mo3658z() {
        return true;
    }
}
