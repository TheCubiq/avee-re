package com.daaw;

import android.text.TextUtils;
import android.util.Log;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: classes.dex */
public final class om5 extends ud7 {

    /* renamed from: c */
    public char f21659c;

    /* renamed from: d */
    public long f21660d;

    /* renamed from: e */
    public String f21661e;

    /* renamed from: f */
    public final hk5 f21662f;

    /* renamed from: g */
    public final hk5 f21663g;

    /* renamed from: h */
    public final hk5 f21664h;

    /* renamed from: i */
    public final hk5 f21665i;

    /* renamed from: j */
    public final hk5 f21666j;

    /* renamed from: k */
    public final hk5 f21667k;

    /* renamed from: l */
    public final hk5 f21668l;

    /* renamed from: m */
    public final hk5 f21669m;

    /* renamed from: n */
    public final hk5 f21670n;

    public om5(dr6 dr6Var) {
        super(dr6Var);
        this.f21659c = (char) 0;
        this.f21660d = -1L;
        this.f21662f = new hk5(this, 6, false, false);
        this.f21663g = new hk5(this, 6, true, false);
        this.f21664h = new hk5(this, 6, false, true);
        this.f21665i = new hk5(this, 5, false, false);
        this.f21666j = new hk5(this, 5, true, false);
        this.f21667k = new hk5(this, 5, false, true);
        this.f21668l = new hk5(this, 4, false, false);
        this.f21669m = new hk5(this, 3, false, false);
        this.f21670n = new hk5(this, 2, false, false);
    }

    /* renamed from: A */
    public static String m14170A(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String m14169B = m14169B(z, obj);
        String m14169B2 = m14169B(z, obj2);
        String m14169B3 = m14169B(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(m14169B)) {
            sb.append(str2);
            sb.append(m14169B);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(m14169B2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(m14169B2);
        }
        if (!TextUtils.isEmpty(m14169B3)) {
            sb.append(str3);
            sb.append(m14169B3);
        }
        return sb.toString();
    }

    /* renamed from: B */
    public static String m14169B(boolean z, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (z) {
                Long l = (Long) obj;
                if (Math.abs(l.longValue()) < 100) {
                    return obj.toString();
                }
                String str2 = obj.toString().charAt(0) == '-' ? "-" : "";
                String valueOf = String.valueOf(Math.abs(l.longValue()));
                long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
                long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
                return str2 + round + "..." + str2 + round2;
            }
            return obj.toString();
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (!(obj instanceof Throwable)) {
                if (!(obj instanceof ll5)) {
                    return z ? "-" : obj.toString();
                }
                str = ((ll5) obj).f17526a;
                return str;
            }
            Throwable th = (Throwable) obj;
            StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
            String m14164G = m14164G(dr6.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m14164G(className).equals(m14164G)) {
                    sb.append(": ");
                    sb.append(stackTraceElement);
                    break;
                }
                i++;
            }
            return sb.toString();
        }
    }

    /* renamed from: G */
    public static String m14164G(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    /* renamed from: z */
    public static Object m14152z(String str) {
        if (str == null) {
            return null;
        }
        return new ll5(str);
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    /* renamed from: C */
    public final String m14168C() {
        String str;
        synchronized (this) {
            if (this.f21661e == null) {
                this.f21661e = this.f25143a.m24042Q() != null ? this.f25143a.m24042Q() : this.f25143a.m24020z().m12655w();
            }
            ry0.m10830j(this.f21661e);
            str = this.f21661e;
        }
        return str;
    }

    /* renamed from: F */
    public final void m14165F(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(m14168C(), i)) {
            Log.println(i, m14168C(), m14170A(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        ry0.m10830j(str);
        vn6 m24052G = this.f25143a.m24052G();
        if (m24052G == null) {
            Log.println(6, m14168C(), "Scheduler not set. Not logging error/warn");
        } else if (m24052G.m8307m()) {
            m24052G.m6978z(new ej5(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
        } else {
            Log.println(6, m14168C(), "Scheduler not initialized. Not logging error/warn");
        }
    }

    @Override // com.daaw.ud7
    /* renamed from: h */
    public final boolean mo6990h() {
        return false;
    }

    /* renamed from: p */
    public final hk5 m14161p() {
        return this.f21669m;
    }

    /* renamed from: q */
    public final hk5 m14160q() {
        return this.f21662f;
    }

    /* renamed from: s */
    public final hk5 m14159s() {
        return this.f21664h;
    }

    /* renamed from: t */
    public final hk5 m14158t() {
        return this.f21663g;
    }

    /* renamed from: u */
    public final hk5 m14157u() {
        return this.f21668l;
    }

    /* renamed from: v */
    public final hk5 m14156v() {
        return this.f21670n;
    }

    /* renamed from: w */
    public final hk5 m14155w() {
        return this.f21665i;
    }

    /* renamed from: x */
    public final hk5 m14154x() {
        return this.f21667k;
    }

    /* renamed from: y */
    public final hk5 m14153y() {
        return this.f21666j;
    }
}
