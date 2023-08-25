package com.daaw;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class m24 extends FrameLayout implements d24 {

    /* renamed from: A */
    public long f18389A;

    /* renamed from: B */
    public long f18390B;

    /* renamed from: C */
    public String f18391C;

    /* renamed from: D */
    public String[] f18392D;

    /* renamed from: E */
    public Bitmap f18393E;

    /* renamed from: F */
    public final ImageView f18394F;

    /* renamed from: G */
    public boolean f18395G;

    /* renamed from: H */
    public final Integer f18396H;

    /* renamed from: p */
    public final y24 f18397p;

    /* renamed from: q */
    public final FrameLayout f18398q;

    /* renamed from: r */
    public final View f18399r;

    /* renamed from: s */
    public final v93 f18400s;

    /* renamed from: t */
    public final a34 f18401t;

    /* renamed from: u */
    public final long f18402u;

    /* renamed from: v */
    public final e24 f18403v;

    /* renamed from: w */
    public boolean f18404w;

    /* renamed from: x */
    public boolean f18405x;

    /* renamed from: y */
    public boolean f18406y;

    /* renamed from: z */
    public boolean f18407z;

    public m24(Context context, y24 y24Var, int i, boolean z, v93 v93Var, x24 x24Var, Integer num) {
        super(context);
        this.f18397p = y24Var;
        this.f18400s = v93Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f18398q = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        ry0.m10830j(y24Var.zzm());
        f24 f24Var = y24Var.zzm().zza;
        e24 t34Var = i == 2 ? new t34(context, new z24(context, y24Var.zzp(), y24Var.mo4241b(), v93Var, y24Var.zzn()), y24Var, z, f24.m22961a(y24Var), x24Var, num) : new c24(context, y24Var, z, f24.m22961a(y24Var), x24Var, new z24(context, y24Var.zzp(), y24Var.mo4241b(), v93Var, y24Var.zzn()), num);
        this.f18403v = t34Var;
        this.f18396H = num;
        View view = new View(context);
        this.f18399r = view;
        view.setBackgroundColor(0);
        frameLayout.addView(t34Var, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) zzba.zzc().m23658b(g93.f10391D)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10359A)).booleanValue()) {
            m16274q();
        }
        this.f18394F = new ImageView(context);
        this.f18402u = ((Long) zzba.zzc().m23658b(g93.f10411F)).longValue();
        boolean booleanValue = ((Boolean) zzba.zzc().m23658b(g93.f10381C)).booleanValue();
        this.f18407z = booleanValue;
        if (v93Var != null) {
            v93Var.m7314d("spinner_used", true != booleanValue ? "0" : "1");
        }
        this.f18401t = new a34(this);
        t34Var.mo9553t(this);
    }

    /* renamed from: A */
    public final void m16293A(MotionEvent motionEvent) {
        e24 e24Var = this.f18403v;
        if (e24Var == null) {
            return;
        }
        e24Var.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: B */
    public final void m16292B(int i) {
        e24 e24Var = this.f18403v;
        if (e24Var == null) {
            return;
        }
        e24Var.mo9549x(i);
    }

    /* renamed from: C */
    public final void m16291C(int i) {
        e24 e24Var = this.f18403v;
        if (e24Var == null) {
            return;
        }
        e24Var.mo9548y(i);
    }

    @Override // com.daaw.d24
    /* renamed from: a */
    public final void mo16290a(int i, int i2) {
        if (this.f18407z) {
            y83 y83Var = g93.f10401E;
            int max = Math.max(i / ((Integer) zzba.zzc().m23658b(y83Var)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) zzba.zzc().m23658b(y83Var)).intValue(), 1);
            Bitmap bitmap = this.f18393E;
            if (bitmap != null && bitmap.getWidth() == max && this.f18393E.getHeight() == max2) {
                return;
            }
            this.f18393E = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.f18395G = false;
        }
    }

    /* renamed from: b */
    public final void m16289b(int i) {
        e24 e24Var = this.f18403v;
        if (e24Var == null) {
            return;
        }
        e24Var.mo9547z(i);
    }

    @Override // com.daaw.d24
    /* renamed from: c */
    public final void mo16288c(String str, String str2) {
        m16278m("error", "what", str, "extra", str2);
    }

    /* renamed from: d */
    public final void m16287d(int i) {
        e24 e24Var = this.f18403v;
        if (e24Var == null) {
            return;
        }
        e24Var.mo9600A(i);
    }

    /* renamed from: e */
    public final void m16286e(int i) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10391D)).booleanValue()) {
            this.f18398q.setBackgroundColor(i);
            this.f18399r.setBackgroundColor(i);
        }
    }

    /* renamed from: f */
    public final void m16285f(int i) {
        e24 e24Var = this.f18403v;
        if (e24Var == null) {
            return;
        }
        e24Var.mo9574a(i);
    }

    public final void finalize() {
        try {
            this.f18401t.m27720a();
            final e24 e24Var = this.f18403v;
            if (e24Var != null) {
                z04.f34309e.execute(new Runnable() { // from class: com.daaw.g24
                    @Override // java.lang.Runnable
                    public final void run() {
                        e24.this.mo9551v();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public final void m16284g(String str, String[] strArr) {
        this.f18391C = str;
        this.f18392D = strArr;
    }

    /* renamed from: h */
    public final void m16283h(int i, int i2, int i3, int i4) {
        if (zze.zzc()) {
            zze.zza("Set video bounds to x:" + i + ";y:" + i2 + ";w:" + i3 + ";h:" + i4);
        }
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.f18398q.setLayoutParams(layoutParams);
        requestLayout();
    }

    /* renamed from: i */
    public final void m16282i(float f) {
        e24 e24Var = this.f18403v;
        if (e24Var == null) {
            return;
        }
        e24Var.f8053q.m22938e(f);
        e24Var.zzn();
    }

    /* renamed from: j */
    public final void m16281j(float f, float f2) {
        e24 e24Var = this.f18403v;
        if (e24Var != null) {
            e24Var.mo9550w(f, f2);
        }
    }

    /* renamed from: k */
    public final void m16280k() {
        e24 e24Var = this.f18403v;
        if (e24Var == null) {
            return;
        }
        e24Var.f8053q.m22939d(false);
        e24Var.zzn();
    }

    /* renamed from: l */
    public final void m16279l() {
        if (this.f18397p.zzk() == null || !this.f18405x || this.f18406y) {
            return;
        }
        this.f18397p.zzk().getWindow().clearFlags(128);
        this.f18405x = false;
    }

    /* renamed from: m */
    public final void m16278m(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        Integer m16276o = m16276o();
        if (m16276o != null) {
            hashMap.put("playerId", m16276o.toString());
        }
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f18397p.mo6434T("onVideoEvent", hashMap);
    }

    /* renamed from: n */
    public final boolean m16277n() {
        return this.f18394F.getParent() != null;
    }

    /* renamed from: o */
    public final Integer m16276o() {
        e24 e24Var = this.f18403v;
        return e24Var != null ? e24Var.f8054r : this.f18396H;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        a34 a34Var = this.f18401t;
        if (z) {
            a34Var.m27719b();
        } else {
            a34Var.m27720a();
            this.f18390B = this.f18389A;
        }
        zzs.zza.post(new Runnable() { // from class: com.daaw.h24
            @Override // java.lang.Runnable
            public final void run() {
                m24.this.m16271t(z);
            }
        });
    }

    @Override // android.view.View, com.daaw.d24
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.f18401t.m27719b();
            z = true;
        } else {
            this.f18401t.m27720a();
            this.f18390B = this.f18389A;
            z = false;
        }
        zzs.zza.post(new l24(this, z));
    }

    /* renamed from: q */
    public final void m16274q() {
        e24 e24Var = this.f18403v;
        if (e24Var == null) {
            return;
        }
        TextView textView = new TextView(e24Var.getContext());
        textView.setText("AdMob - ".concat(this.f18403v.mo9557p()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.f18398q.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f18398q.bringChildToFront(textView);
    }

    /* renamed from: r */
    public final void m16273r() {
        this.f18401t.m27720a();
        e24 e24Var = this.f18403v;
        if (e24Var != null) {
            e24Var.mo9551v();
        }
        m16279l();
    }

    /* renamed from: s */
    public final /* synthetic */ void m16272s() {
        m16278m("firstFrameRendered", new String[0]);
    }

    /* renamed from: t */
    public final /* synthetic */ void m16271t(boolean z) {
        m16278m("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    /* renamed from: u */
    public final void m16270u() {
        if (this.f18403v == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f18391C)) {
            m16278m("no_src", new String[0]);
        } else {
            this.f18403v.mo9572b(this.f18391C, this.f18392D);
        }
    }

    /* renamed from: v */
    public final void m16269v() {
        e24 e24Var = this.f18403v;
        if (e24Var == null) {
            return;
        }
        e24Var.f8053q.m22939d(true);
        e24Var.zzn();
    }

    /* renamed from: w */
    public final void m16268w() {
        e24 e24Var = this.f18403v;
        if (e24Var == null) {
            return;
        }
        long mo9565h = e24Var.mo9565h();
        if (this.f18389A == mo9565h || mo9565h <= 0) {
            return;
        }
        float f = ((float) mo9565h) / 1000.0f;
        if (((Boolean) zzba.zzc().m23658b(g93.f10413F1)).booleanValue()) {
            m16278m("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(this.f18403v.mo9558o()), "qoeCachedBytes", String.valueOf(this.f18403v.mo9560m()), "qoeLoadedBytes", String.valueOf(this.f18403v.mo9559n()), "droppedFrames", String.valueOf(this.f18403v.mo9564i()), "reportTime", String.valueOf(zzt.zzB().mo15860a()));
        } else {
            m16278m("timeupdate", "time", String.valueOf(f));
        }
        this.f18389A = mo9565h;
    }

    /* renamed from: x */
    public final void m16267x() {
        e24 e24Var = this.f18403v;
        if (e24Var == null) {
            return;
        }
        e24Var.mo9556q();
    }

    /* renamed from: y */
    public final void m16266y() {
        e24 e24Var = this.f18403v;
        if (e24Var == null) {
            return;
        }
        e24Var.mo9555r();
    }

    /* renamed from: z */
    public final void m16265z(int i) {
        e24 e24Var = this.f18403v;
        if (e24Var == null) {
            return;
        }
        e24Var.mo9554s(i);
    }

    @Override // com.daaw.d24
    public final void zza() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10443I1)).booleanValue()) {
            this.f18401t.m27720a();
        }
        m16278m("ended", new String[0]);
        m16279l();
    }

    @Override // com.daaw.d24
    public final void zzc(String str, String str2) {
        m16278m("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.daaw.d24
    public final void zzd() {
        m16278m("pause", new String[0]);
        m16279l();
        this.f18404w = false;
    }

    @Override // com.daaw.d24
    public final void zze() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10443I1)).booleanValue()) {
            this.f18401t.m27719b();
        }
        if (this.f18397p.zzk() != null && !this.f18405x) {
            boolean z = (this.f18397p.zzk().getWindow().getAttributes().flags & 128) != 0;
            this.f18406y = z;
            if (!z) {
                this.f18397p.zzk().getWindow().addFlags(128);
                this.f18405x = true;
            }
        }
        this.f18404w = true;
    }

    @Override // com.daaw.d24
    public final void zzf() {
        e24 e24Var = this.f18403v;
        if (e24Var != null && this.f18390B == 0) {
            m16278m("canplaythrough", "duration", String.valueOf(e24Var.mo9563j() / 1000.0f), "videoWidth", String.valueOf(this.f18403v.mo9561l()), "videoHeight", String.valueOf(this.f18403v.mo9562k()));
        }
    }

    @Override // com.daaw.d24
    public final void zzg() {
        this.f18399r.setVisibility(4);
        zzs.zza.post(new Runnable() { // from class: com.daaw.i24
            @Override // java.lang.Runnable
            public final void run() {
                m24.this.m16272s();
            }
        });
    }

    @Override // com.daaw.d24
    public final void zzh() {
        this.f18401t.m27719b();
        zzs.zza.post(new j24(this));
    }

    @Override // com.daaw.d24
    public final void zzi() {
        if (this.f18395G && this.f18393E != null && !m16277n()) {
            this.f18394F.setImageBitmap(this.f18393E);
            this.f18394F.invalidate();
            this.f18398q.addView(this.f18394F, new FrameLayout.LayoutParams(-1, -1));
            this.f18398q.bringChildToFront(this.f18394F);
        }
        this.f18401t.m27720a();
        this.f18390B = this.f18389A;
        zzs.zza.post(new k24(this));
    }

    @Override // com.daaw.d24
    public final void zzk() {
        if (this.f18404w && m16277n()) {
            this.f18398q.removeView(this.f18394F);
        }
        if (this.f18403v == null || this.f18393E == null) {
            return;
        }
        long mo15859b = zzt.zzB().mo15859b();
        if (this.f18403v.getBitmap(this.f18393E) != null) {
            this.f18395G = true;
        }
        long mo15859b2 = zzt.zzB().mo15859b() - mo15859b;
        if (zze.zzc()) {
            zze.zza("Spinner frame grab took " + mo15859b2 + "ms");
        }
        if (mo15859b2 > this.f18402u) {
            k04.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.f18407z = false;
            this.f18393E = null;
            v93 v93Var = this.f18400s;
            if (v93Var != null) {
                v93Var.m7314d("spinner_jank", Long.toString(mo15859b2));
            }
        }
    }
}
