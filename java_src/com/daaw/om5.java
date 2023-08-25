package com.daaw;

import android.text.TextUtils;
import android.util.Log;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: classes.dex */
public final class om5 extends ud7 {
    public char c;
    public long d;
    public String e;
    public final hk5 f;
    public final hk5 g;
    public final hk5 h;
    public final hk5 i;
    public final hk5 j;
    public final hk5 k;
    public final hk5 l;
    public final hk5 m;
    public final hk5 n;

    public om5(dr6 dr6Var) {
        super(dr6Var);
        this.c = (char) 0;
        this.d = -1L;
        this.f = new hk5(this, 6, false, false);
        this.g = new hk5(this, 6, true, false);
        this.h = new hk5(this, 6, false, true);
        this.i = new hk5(this, 5, false, false);
        this.j = new hk5(this, 5, true, false);
        this.k = new hk5(this, 5, false, true);
        this.l = new hk5(this, 4, false, false);
        this.m = new hk5(this, 3, false, false);
        this.n = new hk5(this, 2, false, false);
    }

    public static String A(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String B = B(z, obj);
        String B2 = B(z, obj2);
        String B3 = B(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(B)) {
            sb.append(str2);
            sb.append(B);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(B2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(B2);
        }
        if (!TextUtils.isEmpty(B3)) {
            sb.append(str3);
            sb.append(B3);
        }
        return sb.toString();
    }

    public static String B(boolean z, Object obj) {
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
                str = ((ll5) obj).a;
                return str;
            }
            Throwable th = (Throwable) obj;
            StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
            String G = G(dr6.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && G(className).equals(G)) {
                    sb.append(": ");
                    sb.append(stackTraceElement);
                    break;
                }
                i++;
            }
            return sb.toString();
        }
    }

    public static String G(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    public static Object z(String str) {
        if (str == null) {
            return null;
        }
        return new ll5(str);
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    public final String C() {
        String str;
        synchronized (this) {
            if (this.e == null) {
                this.e = this.a.Q() != null ? this.a.Q() : this.a.z().w();
            }
            ry0.j(this.e);
            str = this.e;
        }
        return str;
    }

    public final void F(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(C(), i)) {
            Log.println(i, C(), A(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        ry0.j(str);
        vn6 G = this.a.G();
        if (G == null) {
            Log.println(6, C(), "Scheduler not set. Not logging error/warn");
        } else if (G.m()) {
            G.z(new ej5(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
        } else {
            Log.println(6, C(), "Scheduler not initialized. Not logging error/warn");
        }
    }

    @Override // com.daaw.ud7
    public final boolean h() {
        return false;
    }

    public final hk5 p() {
        return this.m;
    }

    public final hk5 q() {
        return this.f;
    }

    public final hk5 s() {
        return this.h;
    }

    public final hk5 t() {
        return this.g;
    }

    public final hk5 u() {
        return this.l;
    }

    public final hk5 v() {
        return this.n;
    }

    public final hk5 w() {
        return this.i;
    }

    public final hk5 x() {
        return this.k;
    }

    public final hk5 y() {
        return this.j;
    }
}
