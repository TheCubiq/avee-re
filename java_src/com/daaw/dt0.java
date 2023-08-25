package com.daaw;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class dt0 {

    /* loaded from: classes.dex */
    public static class a {
        public final Bundle a;
        public IconCompat b;
        public final s31[] c;
        public final s31[] d;
        public boolean e;
        public boolean f;
        public final int g;
        public final boolean h;
        @Deprecated
        public int i;
        public CharSequence j;
        public PendingIntent k;
        public boolean l;

        public a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.g(null, "", i) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, s31[] s31VarArr, s31[] s31VarArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.f = true;
            this.b = iconCompat;
            if (iconCompat != null && iconCompat.j() == 2) {
                this.i = iconCompat.h();
            }
            this.j = d.d(charSequence);
            this.k = pendingIntent;
            this.a = bundle == null ? new Bundle() : bundle;
            this.c = s31VarArr;
            this.d = s31VarArr2;
            this.e = z;
            this.g = i;
            this.f = z2;
            this.h = z3;
            this.l = z4;
        }

        public PendingIntent a() {
            return this.k;
        }

        public boolean b() {
            return this.e;
        }

        public s31[] c() {
            return this.d;
        }

        public Bundle d() {
            return this.a;
        }

        public IconCompat e() {
            int i;
            if (this.b == null && (i = this.i) != 0) {
                this.b = IconCompat.g(null, "", i);
            }
            return this.b;
        }

        public s31[] f() {
            return this.c;
        }

        public int g() {
            return this.g;
        }

        public boolean h() {
            return this.f;
        }

        public CharSequence i() {
            return this.j;
        }

        public boolean j() {
            return this.l;
        }

        public boolean k() {
            return this.h;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends e {
        public CharSequence e;

        @Override // com.daaw.dt0.e
        public void a(Bundle bundle) {
            super.a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.e);
            }
        }

        @Override // com.daaw.dt0.e
        public void b(ct0 ct0Var) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(ct0Var.a()).setBigContentTitle(this.b).bigText(this.e);
            if (this.d) {
                bigText.setSummaryText(this.c);
            }
        }

        @Override // com.daaw.dt0.e
        public String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public b h(CharSequence charSequence) {
            this.e = d.d(charSequence);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static Notification.BubbleMetadata a(c cVar) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public boolean A;
        public boolean B;
        public String C;
        public Bundle D;
        public int E;
        public int F;
        public Notification G;
        public RemoteViews H;
        public RemoteViews I;
        public RemoteViews J;
        public String K;
        public int L;
        public String M;
        public long N;
        public int O;
        public int P;
        public boolean Q;
        public Notification R;
        public boolean S;
        public Icon T;
        @Deprecated
        public ArrayList<String> U;
        public Context a;
        public ArrayList<a> b;
        public ArrayList<lw0> c;
        public ArrayList<a> d;
        public CharSequence e;
        public CharSequence f;
        public PendingIntent g;
        public PendingIntent h;
        public RemoteViews i;
        public Bitmap j;
        public CharSequence k;
        public int l;
        public int m;
        public boolean n;
        public boolean o;
        public e p;
        public CharSequence q;
        public CharSequence r;
        public CharSequence[] s;
        public int t;
        public int u;
        public boolean v;
        public String w;
        public boolean x;
        public String y;
        public boolean z;

        @Deprecated
        public d(Context context) {
            this(context, null);
        }

        public d(Context context, String str) {
            this.b = new ArrayList<>();
            this.c = new ArrayList<>();
            this.d = new ArrayList<>();
            this.n = true;
            this.z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.O = 0;
            this.P = 0;
            Notification notification = new Notification();
            this.R = notification;
            this.a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.R.audioStreamType = -1;
            this.m = 0;
            this.U = new ArrayList<>();
            this.Q = true;
        }

        public static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public d a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.b.add(new a(i, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new et0(this).c();
        }

        public Bundle c() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public d e(boolean z) {
            k(16, z);
            return this;
        }

        public d f(String str) {
            this.K = str;
            return this;
        }

        public d g(PendingIntent pendingIntent) {
            this.g = pendingIntent;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.f = d(charSequence);
            return this;
        }

        public d i(CharSequence charSequence) {
            this.e = d(charSequence);
            return this;
        }

        public d j(PendingIntent pendingIntent) {
            this.R.deleteIntent = pendingIntent;
            return this;
        }

        public final void k(int i, boolean z) {
            Notification notification;
            int i2;
            if (z) {
                notification = this.R;
                i2 = i | notification.flags;
            } else {
                notification = this.R;
                i2 = (i ^ (-1)) & notification.flags;
            }
            notification.flags = i2;
        }

        public d l(boolean z) {
            this.z = z;
            return this;
        }

        public d m(int i) {
            this.m = i;
            return this;
        }

        public d n(int i) {
            this.R.icon = i;
            return this;
        }

        public d o(e eVar) {
            if (this.p != eVar) {
                this.p = eVar;
                if (eVar != null) {
                    eVar.g(this);
                }
            }
            return this;
        }

        public d p(CharSequence charSequence) {
            this.R.tickerText = d(charSequence);
            return this;
        }

        public d q(long j) {
            this.R.when = j;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public d a;
        public CharSequence b;
        public CharSequence c;
        public boolean d = false;

        public void a(Bundle bundle) {
            if (this.d) {
                bundle.putCharSequence("android.summaryText", this.c);
            }
            CharSequence charSequence = this.b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c = c();
            if (c != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c);
            }
        }

        public abstract void b(ct0 ct0Var);

        public abstract String c();

        public RemoteViews d(ct0 ct0Var) {
            return null;
        }

        public RemoteViews e(ct0 ct0Var) {
            return null;
        }

        public RemoteViews f(ct0 ct0Var) {
            return null;
        }

        public void g(d dVar) {
            if (this.a != dVar) {
                this.a = dVar;
                if (dVar != null) {
                    dVar.o(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }
}
