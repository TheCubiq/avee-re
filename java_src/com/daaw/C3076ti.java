package com.daaw;

import android.content.Context;
import com.daaw.qw1;
import com.daaw.wc0;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
/* renamed from: com.daaw.ti */
/* loaded from: classes.dex */
public class C3076ti implements wc0 {

    /* renamed from: a */
    public wc0.InterfaceC3422c f27725a;

    /* renamed from: b */
    public wc0[] f27726b;

    /* renamed from: c */
    public C3078b[] f27727c;

    /* renamed from: e */
    public C3079c[] f27729e;

    /* renamed from: g */
    public me0<String> f27731g;

    /* renamed from: h */
    public int f27732h;

    /* renamed from: i */
    public InterfaceC3077a f27733i;

    /* renamed from: d */
    public wc0.InterfaceC3420a f27728d = null;

    /* renamed from: f */
    public wc0.InterfaceC3421b f27730f = null;

    /* renamed from: com.daaw.ti$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3077a {
        /* renamed from: a */
        ts1 mo9099a(Context context, int i, wc0 wc0Var);
    }

    /* renamed from: com.daaw.ti$b */
    /* loaded from: classes.dex */
    public class C3078b implements wc0.InterfaceC3420a {

        /* renamed from: a */
        public int f27734a = 0;

        /* renamed from: b */
        public int f27735b = 0;

        /* renamed from: c */
        public boolean f27736c = false;

        /* renamed from: d */
        public boolean f27737d = false;

        /* renamed from: e */
        public String f27738e = "";

        public C3078b() {
        }

        @Override // com.daaw.wc0.InterfaceC3420a
        /* renamed from: a */
        public void mo6190a(String str) {
            this.f27738e = str;
            C3076ti.this.m9106B();
        }

        @Override // com.daaw.wc0.InterfaceC3420a
        /* renamed from: b */
        public void mo6189b(int i, int i2, boolean z, boolean z2) {
            this.f27734a = i;
            this.f27735b = i2;
            this.f27736c = z;
            this.f27737d = z2;
            C3076ti.this.m9107A();
        }
    }

    /* renamed from: com.daaw.ti$c */
    /* loaded from: classes.dex */
    public class C3079c implements wc0.InterfaceC3421b {

        /* renamed from: p */
        public int f27740p;

        public C3079c(int i) {
            this.f27740p = i;
        }

        @Override // com.daaw.wc0.InterfaceC3421b
        /* renamed from: a */
        public void mo6188a(String str, String str2) {
            wc0.InterfaceC3421b interfaceC3421b = C3076ti.this.f27730f;
            interfaceC3421b.mo6188a(str, C3076ti.m9100v(this.f27740p) + str2);
        }

        @Override // com.daaw.wc0.InterfaceC3421b
        /* renamed from: b */
        public void mo6187b(qw1.InterfaceC2788a<Integer> interfaceC2788a, List<Object> list) {
            C3076ti.this.f27730f.mo6187b(interfaceC2788a, list);
        }

        @Override // com.daaw.wc0.InterfaceC3421b
        /* renamed from: c */
        public int mo6186c() {
            return C3076ti.this.f27730f.mo6186c();
        }

        @Override // com.daaw.wc0.InterfaceC3421b
        /* renamed from: d */
        public int mo6185d() {
            return C3076ti.this.f27730f.mo6185d();
        }

        @Override // com.daaw.wc0.InterfaceC3421b
        /* renamed from: e */
        public void mo6184e(qw1.InterfaceC2788a<Boolean> interfaceC2788a, List<Object> list) {
            C3076ti.this.f27730f.mo6184e(interfaceC2788a, list);
        }

        @Override // com.daaw.wc0.InterfaceC3421b
        /* renamed from: f */
        public String mo6183f(String str, String str2) {
            wc0.InterfaceC3421b interfaceC3421b = C3076ti.this.f27730f;
            return interfaceC3421b.mo6183f(str, C3076ti.m9100v(this.f27740p) + str2);
        }

        @Override // com.daaw.wc0.InterfaceC3421b
        /* renamed from: g */
        public void mo6182g(qw1.InterfaceC2788a<Boolean> interfaceC2788a, List<Object> list) {
            C3076ti.this.f27730f.mo6182g(interfaceC2788a, list);
        }
    }

    public C3076ti(wc0[] wc0VarArr, me0<String> me0Var, int i, InterfaceC3077a interfaceC3077a) {
        this.f27726b = wc0VarArr;
        this.f27731g = me0Var;
        this.f27732h = i;
        this.f27733i = interfaceC3077a;
        this.f27727c = new C3078b[wc0VarArr.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C3078b[] c3078bArr = this.f27727c;
            if (i3 >= c3078bArr.length) {
                break;
            }
            c3078bArr[i3] = new C3078b();
            i3++;
        }
        this.f27729e = new C3079c[wc0VarArr.length];
        while (true) {
            C3079c[] c3079cArr = this.f27729e;
            if (i2 >= c3079cArr.length) {
                return;
            }
            c3079cArr[i2] = new C3079c(i2);
            i2++;
        }
    }

    /* renamed from: v */
    public static String m9100v(int i) {
        return String.format(Locale.US, "%05d", Integer.valueOf(i));
    }

    /* renamed from: A */
    public final void m9107A() {
        C3078b[] c3078bArr;
        if (this.f27728d == null) {
            return;
        }
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        for (C3078b c3078b : this.f27727c) {
            i += c3078b.f27734a;
            i2 += c3078b.f27735b;
            if (c3078b.f27736c) {
                z = true;
            }
            if (c3078b.f27737d) {
                z2 = true;
            }
        }
        this.f27728d.mo6189b(i, i2, z, z2);
    }

    /* renamed from: B */
    public final void m9106B() {
        C3078b[] c3078bArr;
        if (this.f27728d == null) {
            return;
        }
        String str = "";
        for (C3078b c3078b : this.f27727c) {
            str = str + c3078b.f27738e;
        }
        this.f27728d.mo6190a(str);
    }

    @Override // com.daaw.wc0, com.daaw.ts1.InterfaceC3115a
    /* renamed from: a */
    public int mo2250a() {
        int i = 0;
        for (wc0 wc0Var : this.f27726b) {
            i += wc0Var.mo2250a();
        }
        return i;
    }

    @Override // com.daaw.wc0
    /* renamed from: b */
    public boolean mo3672b() {
        return this.f27726b[0].mo3672b();
    }

    @Override // com.daaw.wc0
    /* renamed from: c */
    public void mo3671c(boolean z) {
    }

    @Override // com.daaw.wc0
    /* renamed from: d */
    public ts1 mo2246d(Context context, String str) {
        StringBuilder sb;
        if (str.length() > 5) {
            String substring = str.substring(0, 5);
            String substring2 = str.substring(5);
            int m25885x = br1.m25885x(substring, -1);
            if (m25885x >= 0) {
                wc0[] wc0VarArr = this.f27726b;
                if (m25885x < wc0VarArr.length) {
                    return wc0VarArr[m25885x].mo2246d(context, substring2);
                }
            }
            sb = new StringBuilder();
            sb.append("invalid prefix value ");
            sb.append(m25885x);
        } else {
            sb = new StringBuilder();
            sb.append("invalid relativeAddressItem <");
            sb.append(str);
            sb.append(">");
        }
        lz1.m16363c(sb.toString());
        return null;
    }

    @Override // com.daaw.wc0
    /* renamed from: e */
    public String mo3670e() {
        return this.f27726b[0].mo3670e();
    }

    @Override // com.daaw.wc0
    /* renamed from: g */
    public void mo2241g(C0645al c0645al, int i) {
        for (wc0 wc0Var : this.f27726b) {
            wc0Var.mo2241g(c0645al, i);
        }
    }

    @Override // com.daaw.wc0
    /* renamed from: h */
    public boolean mo3669h(boolean z) {
        boolean z2 = true;
        int i = 0;
        while (true) {
            wc0[] wc0VarArr = this.f27726b;
            if (i >= wc0VarArr.length) {
                return z2;
            }
            if (!wc0VarArr[i].mo3669h(z)) {
                z2 = false;
            }
            i++;
        }
    }

    @Override // com.daaw.wc0
    /* renamed from: i */
    public int mo3668i() {
        return this.f27732h;
    }

    @Override // com.daaw.wc0
    /* renamed from: l */
    public me0<String> mo3667l() {
        return this.f27731g;
    }

    @Override // com.daaw.wc0
    /* renamed from: m */
    public boolean mo3666m(int i, Context context) {
        C2691q6.m12748j();
        return false;
    }

    @Override // com.daaw.wc0
    /* renamed from: n */
    public void mo3665n(WeakReference<wc0.InterfaceC3420a> weakReference) {
        this.f27728d = weakReference.get();
        int i = 0;
        while (true) {
            wc0[] wc0VarArr = this.f27726b;
            if (i >= wc0VarArr.length) {
                return;
            }
            wc0VarArr[i].mo3665n(new WeakReference<>(this.f27727c[i]));
            i++;
        }
    }

    @Override // com.daaw.wc0
    /* renamed from: o */
    public void mo2234o(Context context, String str) {
        for (wc0 wc0Var : this.f27726b) {
            wc0Var.mo2234o(context, str);
        }
    }

    @Override // com.daaw.wc0
    /* renamed from: p */
    public String mo3664p(String str) {
        return this.f27726b[0].mo3664p(str);
    }

    @Override // com.daaw.wc0
    /* renamed from: q */
    public void mo3663q(WeakReference<wc0.InterfaceC3421b> weakReference) {
        this.f27730f = weakReference.get();
        int i = 0;
        while (true) {
            wc0[] wc0VarArr = this.f27726b;
            if (i >= wc0VarArr.length) {
                return;
            }
            wc0VarArr[i].mo3663q(new WeakReference<>(this.f27729e[i]));
            i++;
        }
    }

    /* renamed from: r */
    public ts1 m9102r(Context context) {
        return m9101t(context, -1);
    }

    @Override // com.daaw.wc0
    /* renamed from: s */
    public lo1<Integer, Boolean> mo3662s() {
        return this.f27726b[0].mo3662s();
    }

    /* renamed from: t */
    public ts1 m9101t(Context context, int i) {
        return this.f27733i.mo9099a(context, i, this);
    }

    @Override // com.daaw.wc0
    /* renamed from: u */
    public wc0.InterfaceC3422c mo3661u() {
        return this.f27725a;
    }

    @Override // com.daaw.wc0
    /* renamed from: w */
    public wc0.InterfaceC3421b mo3660w() {
        wc0[] wc0VarArr = this.f27726b;
        if (wc0VarArr.length > 0) {
            return wc0VarArr[0].mo3660w();
        }
        return null;
    }

    @Override // com.daaw.wc0
    /* renamed from: x */
    public void mo2230x(Context context, String[] strArr, sd0[] sd0VarArr) {
        this.f27726b[0].mo2230x(context, strArr, sd0VarArr);
    }

    @Override // com.daaw.wc0
    /* renamed from: y */
    public boolean mo3659y(sd0 sd0Var) {
        for (wc0 wc0Var : this.f27726b) {
            if (wc0Var.mo3659y(sd0Var)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.wc0
    /* renamed from: z */
    public boolean mo3658z() {
        return true;
    }
}
