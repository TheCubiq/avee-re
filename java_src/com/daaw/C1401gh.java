package com.daaw;
/* renamed from: com.daaw.gh */
/* loaded from: classes2.dex */
public class C1401gh {

    /* renamed from: a */
    public int f11239a;

    /* renamed from: b */
    public String f11240b;

    /* renamed from: c */
    public String f11241c;

    /* renamed from: d */
    public int f11242d;

    /* renamed from: e */
    public int f11243e;

    public C1401gh(int i, String str, String str2) {
        this.f11239a = i;
        this.f11240b = str;
        this.f11241c = str2;
    }

    /* renamed from: a */
    public final boolean m21642a() {
        return this.f11240b.equals(this.f11241c);
    }

    /* renamed from: b */
    public String m21641b(String str) {
        String str2;
        String str3;
        if (this.f11240b == null || this.f11241c == null || m21642a()) {
            str2 = this.f11240b;
            str3 = this.f11241c;
        } else {
            m21637f();
            m21636g();
            str2 = m21640c(this.f11240b);
            str3 = m21640c(this.f11241c);
        }
        return C2691q6.m12745m(str, str2, str3);
    }

    /* renamed from: c */
    public final String m21640c(String str) {
        String str2 = "[" + str.substring(this.f11242d, (str.length() - this.f11243e) + 1) + "]";
        if (this.f11242d > 0) {
            str2 = m21639d() + str2;
        }
        if (this.f11243e > 0) {
            return str2 + m21638e();
        }
        return str2;
    }

    /* renamed from: d */
    public final String m21639d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11242d > this.f11239a ? "..." : "");
        sb.append(this.f11240b.substring(Math.max(0, this.f11242d - this.f11239a), this.f11242d));
        return sb.toString();
    }

    /* renamed from: e */
    public final String m21638e() {
        int min = Math.min((this.f11240b.length() - this.f11243e) + 1 + this.f11239a, this.f11240b.length());
        StringBuilder sb = new StringBuilder();
        String str = this.f11240b;
        sb.append(str.substring((str.length() - this.f11243e) + 1, min));
        sb.append((this.f11240b.length() - this.f11243e) + 1 < this.f11240b.length() - this.f11239a ? "..." : "");
        return sb.toString();
    }

    /* renamed from: f */
    public final void m21637f() {
        this.f11242d = 0;
        int min = Math.min(this.f11240b.length(), this.f11241c.length());
        while (true) {
            int i = this.f11242d;
            if (i >= min || this.f11240b.charAt(i) != this.f11241c.charAt(this.f11242d)) {
                return;
            }
            this.f11242d++;
        }
    }

    /* renamed from: g */
    public final void m21636g() {
        int length = this.f11240b.length() - 1;
        int length2 = this.f11241c.length() - 1;
        while (true) {
            int i = this.f11242d;
            if (length2 < i || length < i || this.f11240b.charAt(length) != this.f11241c.charAt(length2)) {
                break;
            }
            length2--;
            length--;
        }
        this.f11243e = this.f11240b.length() - length;
    }
}
