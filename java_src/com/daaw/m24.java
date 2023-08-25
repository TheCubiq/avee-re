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
    public long A;
    public long B;
    public String C;
    public String[] D;
    public Bitmap E;
    public final ImageView F;
    public boolean G;
    public final Integer H;
    public final y24 p;
    public final FrameLayout q;
    public final View r;
    public final v93 s;
    public final a34 t;
    public final long u;
    public final e24 v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public m24(Context context, y24 y24Var, int i, boolean z, v93 v93Var, x24 x24Var, Integer num) {
        super(context);
        this.p = y24Var;
        this.s = v93Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.q = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        ry0.j(y24Var.zzm());
        f24 f24Var = y24Var.zzm().zza;
        e24 t34Var = i == 2 ? new t34(context, new z24(context, y24Var.zzp(), y24Var.b(), v93Var, y24Var.zzn()), y24Var, z, f24.a(y24Var), x24Var, num) : new c24(context, y24Var, z, f24.a(y24Var), x24Var, new z24(context, y24Var.zzp(), y24Var.b(), v93Var, y24Var.zzn()), num);
        this.v = t34Var;
        this.H = num;
        View view = new View(context);
        this.r = view;
        view.setBackgroundColor(0);
        frameLayout.addView(t34Var, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) zzba.zzc().b(g93.D)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) zzba.zzc().b(g93.A)).booleanValue()) {
            q();
        }
        this.F = new ImageView(context);
        this.u = ((Long) zzba.zzc().b(g93.F)).longValue();
        boolean booleanValue = ((Boolean) zzba.zzc().b(g93.C)).booleanValue();
        this.z = booleanValue;
        if (v93Var != null) {
            v93Var.d("spinner_used", true != booleanValue ? "0" : "1");
        }
        this.t = new a34(this);
        t34Var.t(this);
    }

    public final void A(MotionEvent motionEvent) {
        e24 e24Var = this.v;
        if (e24Var == null) {
            return;
        }
        e24Var.dispatchTouchEvent(motionEvent);
    }

    public final void B(int i) {
        e24 e24Var = this.v;
        if (e24Var == null) {
            return;
        }
        e24Var.x(i);
    }

    public final void C(int i) {
        e24 e24Var = this.v;
        if (e24Var == null) {
            return;
        }
        e24Var.y(i);
    }

    @Override // com.daaw.d24
    public final void a(int i, int i2) {
        if (this.z) {
            y83 y83Var = g93.E;
            int max = Math.max(i / ((Integer) zzba.zzc().b(y83Var)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) zzba.zzc().b(y83Var)).intValue(), 1);
            Bitmap bitmap = this.E;
            if (bitmap != null && bitmap.getWidth() == max && this.E.getHeight() == max2) {
                return;
            }
            this.E = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.G = false;
        }
    }

    public final void b(int i) {
        e24 e24Var = this.v;
        if (e24Var == null) {
            return;
        }
        e24Var.z(i);
    }

    @Override // com.daaw.d24
    public final void c(String str, String str2) {
        m("error", "what", str, "extra", str2);
    }

    public final void d(int i) {
        e24 e24Var = this.v;
        if (e24Var == null) {
            return;
        }
        e24Var.A(i);
    }

    public final void e(int i) {
        if (((Boolean) zzba.zzc().b(g93.D)).booleanValue()) {
            this.q.setBackgroundColor(i);
            this.r.setBackgroundColor(i);
        }
    }

    public final void f(int i) {
        e24 e24Var = this.v;
        if (e24Var == null) {
            return;
        }
        e24Var.a(i);
    }

    public final void finalize() {
        try {
            this.t.a();
            final e24 e24Var = this.v;
            if (e24Var != null) {
                z04.e.execute(new Runnable() { // from class: com.daaw.g24
                    @Override // java.lang.Runnable
                    public final void run() {
                        e24.this.v();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    public final void g(String str, String[] strArr) {
        this.C = str;
        this.D = strArr;
    }

    public final void h(int i, int i2, int i3, int i4) {
        if (zze.zzc()) {
            zze.zza("Set video bounds to x:" + i + ";y:" + i2 + ";w:" + i3 + ";h:" + i4);
        }
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.q.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void i(float f) {
        e24 e24Var = this.v;
        if (e24Var == null) {
            return;
        }
        e24Var.q.e(f);
        e24Var.zzn();
    }

    public final void j(float f, float f2) {
        e24 e24Var = this.v;
        if (e24Var != null) {
            e24Var.w(f, f2);
        }
    }

    public final void k() {
        e24 e24Var = this.v;
        if (e24Var == null) {
            return;
        }
        e24Var.q.d(false);
        e24Var.zzn();
    }

    public final void l() {
        if (this.p.zzk() == null || !this.x || this.y) {
            return;
        }
        this.p.zzk().getWindow().clearFlags(128);
        this.x = false;
    }

    public final void m(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        Integer o = o();
        if (o != null) {
            hashMap.put("playerId", o.toString());
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
        this.p.T("onVideoEvent", hashMap);
    }

    public final boolean n() {
        return this.F.getParent() != null;
    }

    public final Integer o() {
        e24 e24Var = this.v;
        return e24Var != null ? e24Var.r : this.H;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        a34 a34Var = this.t;
        if (z) {
            a34Var.b();
        } else {
            a34Var.a();
            this.B = this.A;
        }
        zzs.zza.post(new Runnable() { // from class: com.daaw.h24
            @Override // java.lang.Runnable
            public final void run() {
                m24.this.t(z);
            }
        });
    }

    @Override // android.view.View, com.daaw.d24
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.t.b();
            z = true;
        } else {
            this.t.a();
            this.B = this.A;
            z = false;
        }
        zzs.zza.post(new l24(this, z));
    }

    public final void q() {
        e24 e24Var = this.v;
        if (e24Var == null) {
            return;
        }
        TextView textView = new TextView(e24Var.getContext());
        textView.setText("AdMob - ".concat(this.v.p()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.q.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.q.bringChildToFront(textView);
    }

    public final void r() {
        this.t.a();
        e24 e24Var = this.v;
        if (e24Var != null) {
            e24Var.v();
        }
        l();
    }

    public final /* synthetic */ void s() {
        m("firstFrameRendered", new String[0]);
    }

    public final /* synthetic */ void t(boolean z) {
        m("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    public final void u() {
        if (this.v == null) {
            return;
        }
        if (TextUtils.isEmpty(this.C)) {
            m("no_src", new String[0]);
        } else {
            this.v.b(this.C, this.D);
        }
    }

    public final void v() {
        e24 e24Var = this.v;
        if (e24Var == null) {
            return;
        }
        e24Var.q.d(true);
        e24Var.zzn();
    }

    public final void w() {
        e24 e24Var = this.v;
        if (e24Var == null) {
            return;
        }
        long h = e24Var.h();
        if (this.A == h || h <= 0) {
            return;
        }
        float f = ((float) h) / 1000.0f;
        if (((Boolean) zzba.zzc().b(g93.F1)).booleanValue()) {
            m("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(this.v.o()), "qoeCachedBytes", String.valueOf(this.v.m()), "qoeLoadedBytes", String.valueOf(this.v.n()), "droppedFrames", String.valueOf(this.v.i()), "reportTime", String.valueOf(zzt.zzB().a()));
        } else {
            m("timeupdate", "time", String.valueOf(f));
        }
        this.A = h;
    }

    public final void x() {
        e24 e24Var = this.v;
        if (e24Var == null) {
            return;
        }
        e24Var.q();
    }

    public final void y() {
        e24 e24Var = this.v;
        if (e24Var == null) {
            return;
        }
        e24Var.r();
    }

    public final void z(int i) {
        e24 e24Var = this.v;
        if (e24Var == null) {
            return;
        }
        e24Var.s(i);
    }

    @Override // com.daaw.d24
    public final void zza() {
        if (((Boolean) zzba.zzc().b(g93.I1)).booleanValue()) {
            this.t.a();
        }
        m("ended", new String[0]);
        l();
    }

    @Override // com.daaw.d24
    public final void zzc(String str, String str2) {
        m("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.daaw.d24
    public final void zzd() {
        m("pause", new String[0]);
        l();
        this.w = false;
    }

    @Override // com.daaw.d24
    public final void zze() {
        if (((Boolean) zzba.zzc().b(g93.I1)).booleanValue()) {
            this.t.b();
        }
        if (this.p.zzk() != null && !this.x) {
            boolean z = (this.p.zzk().getWindow().getAttributes().flags & 128) != 0;
            this.y = z;
            if (!z) {
                this.p.zzk().getWindow().addFlags(128);
                this.x = true;
            }
        }
        this.w = true;
    }

    @Override // com.daaw.d24
    public final void zzf() {
        e24 e24Var = this.v;
        if (e24Var != null && this.B == 0) {
            m("canplaythrough", "duration", String.valueOf(e24Var.j() / 1000.0f), "videoWidth", String.valueOf(this.v.l()), "videoHeight", String.valueOf(this.v.k()));
        }
    }

    @Override // com.daaw.d24
    public final void zzg() {
        this.r.setVisibility(4);
        zzs.zza.post(new Runnable() { // from class: com.daaw.i24
            @Override // java.lang.Runnable
            public final void run() {
                m24.this.s();
            }
        });
    }

    @Override // com.daaw.d24
    public final void zzh() {
        this.t.b();
        zzs.zza.post(new j24(this));
    }

    @Override // com.daaw.d24
    public final void zzi() {
        if (this.G && this.E != null && !n()) {
            this.F.setImageBitmap(this.E);
            this.F.invalidate();
            this.q.addView(this.F, new FrameLayout.LayoutParams(-1, -1));
            this.q.bringChildToFront(this.F);
        }
        this.t.a();
        this.B = this.A;
        zzs.zza.post(new k24(this));
    }

    @Override // com.daaw.d24
    public final void zzk() {
        if (this.w && n()) {
            this.q.removeView(this.F);
        }
        if (this.v == null || this.E == null) {
            return;
        }
        long b = zzt.zzB().b();
        if (this.v.getBitmap(this.E) != null) {
            this.G = true;
        }
        long b2 = zzt.zzB().b() - b;
        if (zze.zzc()) {
            zze.zza("Spinner frame grab took " + b2 + "ms");
        }
        if (b2 > this.u) {
            k04.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.z = false;
            this.E = null;
            v93 v93Var = this.s;
            if (v93Var != null) {
                v93Var.d("spinner_jank", Long.toString(b2));
            }
        }
    }
}
