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

    /* renamed from: com.daaw.dt0$a */
    /* loaded from: classes.dex */
    public static class C1133a {

        /* renamed from: a */
        public final Bundle f7721a;

        /* renamed from: b */
        public IconCompat f7722b;

        /* renamed from: c */
        public final s31[] f7723c;

        /* renamed from: d */
        public final s31[] f7724d;

        /* renamed from: e */
        public boolean f7725e;

        /* renamed from: f */
        public boolean f7726f;

        /* renamed from: g */
        public final int f7727g;

        /* renamed from: h */
        public final boolean f7728h;
        @Deprecated

        /* renamed from: i */
        public int f7729i;

        /* renamed from: j */
        public CharSequence f7730j;

        /* renamed from: k */
        public PendingIntent f7731k;

        /* renamed from: l */
        public boolean f7732l;

        public C1133a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m29726g(null, "", i) : null, charSequence, pendingIntent);
        }

        public C1133a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        public C1133a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, s31[] s31VarArr, s31[] s31VarArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.f7726f = true;
            this.f7722b = iconCompat;
            if (iconCompat != null && iconCompat.m29723j() == 2) {
                this.f7729i = iconCompat.m29725h();
            }
            this.f7730j = C1136d.m23974d(charSequence);
            this.f7731k = pendingIntent;
            this.f7721a = bundle == null ? new Bundle() : bundle;
            this.f7723c = s31VarArr;
            this.f7724d = s31VarArr2;
            this.f7725e = z;
            this.f7727g = i;
            this.f7726f = z2;
            this.f7728h = z3;
            this.f7732l = z4;
        }

        /* renamed from: a */
        public PendingIntent m23990a() {
            return this.f7731k;
        }

        /* renamed from: b */
        public boolean m23989b() {
            return this.f7725e;
        }

        /* renamed from: c */
        public s31[] m23988c() {
            return this.f7724d;
        }

        /* renamed from: d */
        public Bundle m23987d() {
            return this.f7721a;
        }

        /* renamed from: e */
        public IconCompat m23986e() {
            int i;
            if (this.f7722b == null && (i = this.f7729i) != 0) {
                this.f7722b = IconCompat.m29726g(null, "", i);
            }
            return this.f7722b;
        }

        /* renamed from: f */
        public s31[] m23985f() {
            return this.f7723c;
        }

        /* renamed from: g */
        public int m23984g() {
            return this.f7727g;
        }

        /* renamed from: h */
        public boolean m23983h() {
            return this.f7726f;
        }

        /* renamed from: i */
        public CharSequence m23982i() {
            return this.f7730j;
        }

        /* renamed from: j */
        public boolean m23981j() {
            return this.f7732l;
        }

        /* renamed from: k */
        public boolean m23980k() {
            return this.f7728h;
        }
    }

    /* renamed from: com.daaw.dt0$b */
    /* loaded from: classes.dex */
    public static class C1134b extends AbstractC1137e {

        /* renamed from: e */
        public CharSequence f7733e;

        @Override // com.daaw.dt0.AbstractC1137e
        /* renamed from: a */
        public void mo23960a(Bundle bundle) {
            super.mo23960a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f7733e);
            }
        }

        @Override // com.daaw.dt0.AbstractC1137e
        /* renamed from: b */
        public void mo23959b(ct0 ct0Var) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(ct0Var.mo23208a()).setBigContentTitle(this.f7782b).bigText(this.f7733e);
            if (this.f7784d) {
                bigText.setSummaryText(this.f7783c);
            }
        }

        @Override // com.daaw.dt0.AbstractC1137e
        /* renamed from: c */
        public String mo23958c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        /* renamed from: h */
        public C1134b m23979h(CharSequence charSequence) {
            this.f7733e = C1136d.m23974d(charSequence);
            return this;
        }
    }

    /* renamed from: com.daaw.dt0$c */
    /* loaded from: classes.dex */
    public static final class C1135c {
        /* renamed from: a */
        public static Notification.BubbleMetadata m23978a(C1135c c1135c) {
            return null;
        }
    }

    /* renamed from: com.daaw.dt0$d */
    /* loaded from: classes.dex */
    public static class C1136d {

        /* renamed from: A */
        public boolean f7734A;

        /* renamed from: B */
        public boolean f7735B;

        /* renamed from: C */
        public String f7736C;

        /* renamed from: D */
        public Bundle f7737D;

        /* renamed from: E */
        public int f7738E;

        /* renamed from: F */
        public int f7739F;

        /* renamed from: G */
        public Notification f7740G;

        /* renamed from: H */
        public RemoteViews f7741H;

        /* renamed from: I */
        public RemoteViews f7742I;

        /* renamed from: J */
        public RemoteViews f7743J;

        /* renamed from: K */
        public String f7744K;

        /* renamed from: L */
        public int f7745L;

        /* renamed from: M */
        public String f7746M;

        /* renamed from: N */
        public long f7747N;

        /* renamed from: O */
        public int f7748O;

        /* renamed from: P */
        public int f7749P;

        /* renamed from: Q */
        public boolean f7750Q;

        /* renamed from: R */
        public Notification f7751R;

        /* renamed from: S */
        public boolean f7752S;

        /* renamed from: T */
        public Icon f7753T;
        @Deprecated

        /* renamed from: U */
        public ArrayList<String> f7754U;

        /* renamed from: a */
        public Context f7755a;

        /* renamed from: b */
        public ArrayList<C1133a> f7756b;

        /* renamed from: c */
        public ArrayList<lw0> f7757c;

        /* renamed from: d */
        public ArrayList<C1133a> f7758d;

        /* renamed from: e */
        public CharSequence f7759e;

        /* renamed from: f */
        public CharSequence f7760f;

        /* renamed from: g */
        public PendingIntent f7761g;

        /* renamed from: h */
        public PendingIntent f7762h;

        /* renamed from: i */
        public RemoteViews f7763i;

        /* renamed from: j */
        public Bitmap f7764j;

        /* renamed from: k */
        public CharSequence f7765k;

        /* renamed from: l */
        public int f7766l;

        /* renamed from: m */
        public int f7767m;

        /* renamed from: n */
        public boolean f7768n;

        /* renamed from: o */
        public boolean f7769o;

        /* renamed from: p */
        public AbstractC1137e f7770p;

        /* renamed from: q */
        public CharSequence f7771q;

        /* renamed from: r */
        public CharSequence f7772r;

        /* renamed from: s */
        public CharSequence[] f7773s;

        /* renamed from: t */
        public int f7774t;

        /* renamed from: u */
        public int f7775u;

        /* renamed from: v */
        public boolean f7776v;

        /* renamed from: w */
        public String f7777w;

        /* renamed from: x */
        public boolean f7778x;

        /* renamed from: y */
        public String f7779y;

        /* renamed from: z */
        public boolean f7780z;

        @Deprecated
        public C1136d(Context context) {
            this(context, null);
        }

        public C1136d(Context context, String str) {
            this.f7756b = new ArrayList<>();
            this.f7757c = new ArrayList<>();
            this.f7758d = new ArrayList<>();
            this.f7768n = true;
            this.f7780z = false;
            this.f7738E = 0;
            this.f7739F = 0;
            this.f7745L = 0;
            this.f7748O = 0;
            this.f7749P = 0;
            Notification notification = new Notification();
            this.f7751R = notification;
            this.f7755a = context;
            this.f7744K = str;
            notification.when = System.currentTimeMillis();
            this.f7751R.audioStreamType = -1;
            this.f7767m = 0;
            this.f7754U = new ArrayList<>();
            this.f7750Q = true;
        }

        /* renamed from: d */
        public static CharSequence m23974d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* renamed from: a */
        public C1136d m23977a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f7756b.add(new C1133a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: b */
        public Notification m23976b() {
            return new et0(this).m23206c();
        }

        /* renamed from: c */
        public Bundle m23975c() {
            if (this.f7737D == null) {
                this.f7737D = new Bundle();
            }
            return this.f7737D;
        }

        /* renamed from: e */
        public C1136d m23973e(boolean z) {
            m23967k(16, z);
            return this;
        }

        /* renamed from: f */
        public C1136d m23972f(String str) {
            this.f7744K = str;
            return this;
        }

        /* renamed from: g */
        public C1136d m23971g(PendingIntent pendingIntent) {
            this.f7761g = pendingIntent;
            return this;
        }

        /* renamed from: h */
        public C1136d m23970h(CharSequence charSequence) {
            this.f7760f = m23974d(charSequence);
            return this;
        }

        /* renamed from: i */
        public C1136d m23969i(CharSequence charSequence) {
            this.f7759e = m23974d(charSequence);
            return this;
        }

        /* renamed from: j */
        public C1136d m23968j(PendingIntent pendingIntent) {
            this.f7751R.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: k */
        public final void m23967k(int i, boolean z) {
            Notification notification;
            int i2;
            if (z) {
                notification = this.f7751R;
                i2 = i | notification.flags;
            } else {
                notification = this.f7751R;
                i2 = (i ^ (-1)) & notification.flags;
            }
            notification.flags = i2;
        }

        /* renamed from: l */
        public C1136d m23966l(boolean z) {
            this.f7780z = z;
            return this;
        }

        /* renamed from: m */
        public C1136d m23965m(int i) {
            this.f7767m = i;
            return this;
        }

        /* renamed from: n */
        public C1136d m23964n(int i) {
            this.f7751R.icon = i;
            return this;
        }

        /* renamed from: o */
        public C1136d m23963o(AbstractC1137e abstractC1137e) {
            if (this.f7770p != abstractC1137e) {
                this.f7770p = abstractC1137e;
                if (abstractC1137e != null) {
                    abstractC1137e.m23954g(this);
                }
            }
            return this;
        }

        /* renamed from: p */
        public C1136d m23962p(CharSequence charSequence) {
            this.f7751R.tickerText = m23974d(charSequence);
            return this;
        }

        /* renamed from: q */
        public C1136d m23961q(long j) {
            this.f7751R.when = j;
            return this;
        }
    }

    /* renamed from: com.daaw.dt0$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1137e {

        /* renamed from: a */
        public C1136d f7781a;

        /* renamed from: b */
        public CharSequence f7782b;

        /* renamed from: c */
        public CharSequence f7783c;

        /* renamed from: d */
        public boolean f7784d = false;

        /* renamed from: a */
        public void mo23960a(Bundle bundle) {
            if (this.f7784d) {
                bundle.putCharSequence("android.summaryText", this.f7783c);
            }
            CharSequence charSequence = this.f7782b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String mo23958c = mo23958c();
            if (mo23958c != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", mo23958c);
            }
        }

        /* renamed from: b */
        public abstract void mo23959b(ct0 ct0Var);

        /* renamed from: c */
        public abstract String mo23958c();

        /* renamed from: d */
        public RemoteViews m23957d(ct0 ct0Var) {
            return null;
        }

        /* renamed from: e */
        public RemoteViews m23956e(ct0 ct0Var) {
            return null;
        }

        /* renamed from: f */
        public RemoteViews m23955f(ct0 ct0Var) {
            return null;
        }

        /* renamed from: g */
        public void m23954g(C1136d c1136d) {
            if (this.f7781a != c1136d) {
                this.f7781a = c1136d;
                if (c1136d != null) {
                    c1136d.m23963o(this);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m23991a(Notification notification) {
        return notification.extras;
    }
}
