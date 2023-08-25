package com.daaw;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
/* loaded from: classes.dex */
public class b30 {

    /* renamed from: com.daaw.b30$a */
    /* loaded from: classes.dex */
    public static class C0804a {

        /* renamed from: a */
        public final int f4237a;

        /* renamed from: b */
        public final C0805b[] f4238b;

        @Deprecated
        public C0804a(int i, C0805b[] c0805bArr) {
            this.f4237a = i;
            this.f4238b = c0805bArr;
        }

        /* renamed from: a */
        public static C0804a m26510a(int i, C0805b[] c0805bArr) {
            return new C0804a(i, c0805bArr);
        }

        /* renamed from: b */
        public C0805b[] m26509b() {
            return this.f4238b;
        }

        /* renamed from: c */
        public int m26508c() {
            return this.f4237a;
        }
    }

    /* renamed from: com.daaw.b30$b */
    /* loaded from: classes.dex */
    public static class C0805b {

        /* renamed from: a */
        public final Uri f4239a;

        /* renamed from: b */
        public final int f4240b;

        /* renamed from: c */
        public final int f4241c;

        /* renamed from: d */
        public final boolean f4242d;

        /* renamed from: e */
        public final int f4243e;

        @Deprecated
        public C0805b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f4239a = (Uri) ty0.m8699f(uri);
            this.f4240b = i;
            this.f4241c = i2;
            this.f4242d = z;
            this.f4243e = i3;
        }

        /* renamed from: a */
        public static C0805b m26507a(Uri uri, int i, int i2, boolean z, int i3) {
            return new C0805b(uri, i, i2, z, i3);
        }

        /* renamed from: b */
        public int m26506b() {
            return this.f4243e;
        }

        /* renamed from: c */
        public int m26505c() {
            return this.f4240b;
        }

        /* renamed from: d */
        public Uri m26504d() {
            return this.f4239a;
        }

        /* renamed from: e */
        public int m26503e() {
            return this.f4241c;
        }

        /* renamed from: f */
        public boolean m26502f() {
            return this.f4242d;
        }
    }

    /* renamed from: com.daaw.b30$c */
    /* loaded from: classes.dex */
    public static class C0806c {
        /* renamed from: a */
        public void mo8908a(int i) {
            throw null;
        }

        /* renamed from: b */
        public void mo8907b(Typeface typeface) {
            throw null;
        }
    }

    /* renamed from: a */
    public static Typeface m26513a(Context context, CancellationSignal cancellationSignal, C0805b[] c0805bArr) {
        return to1.m8915b(context, cancellationSignal, c0805bArr, 0);
    }

    /* renamed from: b */
    public static C0804a m26512b(Context context, CancellationSignal cancellationSignal, x20 x20Var) {
        return w20.m6584e(context, x20Var, cancellationSignal);
    }

    /* renamed from: c */
    public static Typeface m26511c(Context context, x20 x20Var, int i, boolean z, int i2, Handler handler, C0806c c0806c) {
        C2027ld c2027ld = new C2027ld(c0806c, handler);
        return z ? z20.m2975e(context, x20Var, c2027ld, i, i2) : z20.m2976d(context, x20Var, i, null, c2027ld);
    }
}
