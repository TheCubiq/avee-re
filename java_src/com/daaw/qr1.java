package com.daaw;

import android.opengl.GLES20;
/* loaded from: classes.dex */
public class qr1 {

    /* renamed from: a */
    public rc0 f24272a;

    /* renamed from: b */
    public sr1 f24273b;

    /* renamed from: c */
    public wr1[] f24274c;

    /* renamed from: e */
    public final int f24276e = 4;

    /* renamed from: f */
    public InterfaceC1240f0<y31, sr1> f24277f = null;

    /* renamed from: g */
    public InterfaceC1240f0<y31, sr1> f24278g = null;

    /* renamed from: h */
    public boolean f24279h = true;

    /* renamed from: i */
    public boolean f24280i = true;

    /* renamed from: d */
    public int f24275d = 0;

    /* renamed from: com.daaw.qr1$a */
    /* loaded from: classes.dex */
    public static class C2750a {

        /* renamed from: a */
        public final int f24281a = 4;

        /* renamed from: b */
        public final String f24282b;

        /* renamed from: c */
        public final int f24283c;

        /* renamed from: d */
        public final int f24284d;

        /* renamed from: e */
        public final int f24285e;

        public C2750a(String str, int i, int i2) {
            this.f24282b = str;
            this.f24283c = i;
            this.f24284d = i2;
            this.f24285e = i * m12270a();
        }

        /* renamed from: a */
        public final int m12270a() {
            int i = this.f24284d;
            if (i == 5126) {
                return 4;
            }
            if (i == 5121) {
                return 1;
            }
            C2691q6.m12747k("unknown dataType");
            return 4;
        }

        public String toString() {
            return this.f24282b + " (" + this.f24283c + ")";
        }
    }

    public qr1(rc0 rc0Var, sr1 sr1Var, C2750a... c2750aArr) {
        this.f24272a = rc0Var;
        this.f24273b = sr1Var;
        this.f24274c = new wr1[c2750aArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            wr1[] wr1VarArr = this.f24274c;
            if (i2 >= wr1VarArr.length) {
                break;
            }
            C2750a c2750a = c2750aArr[i2];
            wr1VarArr[i2] = new wr1(sr1Var.m24549i(c2750a.f24282b), c2750a.f24282b, c2750a.f24283c, c2750a.f24284d, c2750a.f24285e);
            this.f24275d += c2750a.f24285e;
            i2++;
        }
        while (true) {
            wr1[] wr1VarArr2 = this.f24274c;
            if (i >= wr1VarArr2.length) {
                return;
            }
            if (wr1VarArr2[i].f17727c < 0) {
                lz1.m16363c("ERROR attribute not found " + this.f24274c[i].f17725a);
            }
            i++;
        }
    }

    /* renamed from: a */
    public void m12274a(y31 y31Var, InterfaceC1348g0<y31, sr1, w31> interfaceC1348g0, w31 w31Var) {
        y31Var.m4201p(this.f24273b);
        InterfaceC1240f0<y31, sr1> interfaceC1240f0 = this.f24277f;
        if (interfaceC1240f0 != null) {
            interfaceC1240f0.mo4189a(y31Var, this.f24273b);
        }
        InterfaceC1240f0<y31, sr1> interfaceC1240f02 = this.f24278g;
        if (interfaceC1240f02 != null) {
            interfaceC1240f02.mo4189a(y31Var, this.f24273b);
        }
        if (interfaceC1348g0 != null) {
            interfaceC1348g0.mo2428a(y31Var, this.f24273b, w31Var);
        }
        this.f24272a.mo11433b();
        int i = this.f24275d;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            wr1[] wr1VarArr = this.f24274c;
            if (i2 >= wr1VarArr.length) {
                return;
            }
            wr1 wr1Var = wr1VarArr[i2];
            int i4 = wr1Var.f17727c;
            if (i4 >= 0) {
                GLES20.glEnableVertexAttribArray(i4);
                int i5 = wr1Var.f17727c;
                int i6 = wr1Var.f17726b;
                int i7 = wr1Var.f31466d;
                GLES20.glVertexAttribPointer(i5, i6, i7, i7 != 5126, i, i3);
                i3 += wr1Var.f31467e;
            }
            i2++;
        }
    }

    /* renamed from: b */
    public void m12273b(int i, int i2, int i3) {
        this.f24272a.mo11432c(i, i2, i3);
    }

    /* renamed from: c */
    public void m12272c(boolean z, InterfaceC1240f0<y31, sr1> interfaceC1240f0) {
        this.f24279h = z;
        this.f24277f = interfaceC1240f0;
    }

    /* renamed from: d */
    public void m12271d(y31 y31Var) {
        y31Var.m4208V();
        this.f24272a.mo11434a();
        int i = 0;
        while (true) {
            wr1[] wr1VarArr = this.f24274c;
            if (i >= wr1VarArr.length) {
                return;
            }
            GLES20.glDisableVertexAttribArray(wr1VarArr[i].f17727c);
            i++;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof qr1) && this == ((qr1) obj);
    }
}
