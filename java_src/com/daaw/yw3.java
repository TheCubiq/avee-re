package com.daaw;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.internal.ads.zzcem;
import com.google.android.gms.internal.ads.zzchu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class yw3 implements cx3 {
    public static final List m = Collections.synchronizedList(new ArrayList());
    public static final /* synthetic */ int n = 0;
    @GuardedBy("lock")
    public final ex7 a;
    @GuardedBy("lock")
    public final LinkedHashMap b;
    public final Context e;
    public boolean f;
    public final zzcem g;
    public final zw3 l;
    @GuardedBy("lock")
    public final List c = new ArrayList();
    @GuardedBy("lock")
    public final List d = new ArrayList();
    public final Object h = new Object();
    public HashSet i = new HashSet();
    public boolean j = false;
    public boolean k = false;

    public yw3(Context context, zzchu zzchuVar, zzcem zzcemVar, String str, zw3 zw3Var, byte[] bArr) {
        ry0.k(zzcemVar, "SafeBrowsing config is not present.");
        this.e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.b = new LinkedHashMap();
        this.l = zw3Var;
        this.g = zzcemVar;
        for (String str2 : zzcemVar.t) {
            this.i.add(str2.toLowerCase(Locale.ENGLISH));
        }
        this.i.remove("cookie".toLowerCase(Locale.ENGLISH));
        ex7 L = py7.L();
        L.F(9);
        L.B(str);
        L.z(str);
        fx7 L2 = gx7.L();
        String str3 = this.g.p;
        if (str3 != null) {
            L2.s(str3);
        }
        L.y((gx7) L2.n());
        ky7 L3 = ly7.L();
        L3.u(ez1.a(this.e).g());
        String str4 = zzchuVar.p;
        if (str4 != null) {
            L3.s(str4);
        }
        long a = x70.f().a(this.e);
        if (a > 0) {
            L3.t(a);
        }
        L.x((ly7) L3.n());
        this.a = L;
    }

    @Override // com.daaw.cx3
    public final void a(String str, Map map, int i) {
        synchronized (this.h) {
            if (i == 3) {
                this.k = true;
            }
            if (this.b.containsKey(str)) {
                if (i == 3) {
                    ((iy7) this.b.get(str)).w(hy7.a(3));
                }
                return;
            }
            iy7 M = jy7.M();
            int a = hy7.a(i);
            if (a != 0) {
                M.w(a);
            }
            M.t(this.b.size());
            M.v(str);
            rx7 L = ux7.L();
            if (!this.i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        px7 L2 = qx7.L();
                        L2.s(yq7.H(str2));
                        L2.t(yq7.H(str3));
                        L.s((qx7) L2.n());
                    }
                }
            }
            M.u((ux7) L.n());
            this.b.put(str, M);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.daaw.cx3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzcem r0 = r7.g
            boolean r0 = r0.r
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r7.j
            if (r0 == 0) goto Lc
            return
        Lc:
            com.google.android.gms.ads.internal.zzt.zzp()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L14
            goto L6d
        L14:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2d
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2d
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2d
            if (r3 == 0) goto L26
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L2d
            goto L27
        L26:
            r3 = r1
        L27:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2b
            goto L34
        L2b:
            r2 = move-exception
            goto L2f
        L2d:
            r2 = move-exception
            r3 = r1
        L2f:
            java.lang.String r4 = "Fail to capture the web view"
            com.daaw.k04.zzh(r4, r2)
        L34:
            if (r3 != 0) goto L6c
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            if (r2 == 0) goto L5f
            if (r3 != 0) goto L43
            goto L5f
        L43:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L65
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L65
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L65
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L65
            r1 = r4
            goto L6d
        L5f:
            java.lang.String r8 = "Width or height of view is zero"
            com.daaw.k04.zzj(r8)     // Catch: java.lang.RuntimeException -> L65
            goto L6d
        L65:
            r8 = move-exception
            java.lang.String r2 = "Fail to capture the webview"
            com.daaw.k04.zzh(r2, r8)
            goto L6d
        L6c:
            r1 = r3
        L6d:
            if (r1 != 0) goto L75
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.daaw.bx3.a(r8)
            return
        L75:
            r7.j = r0
            com.daaw.ww3 r8 = new com.daaw.ww3
            r8.<init>()
            com.google.android.gms.ads.internal.util.zzs.zzf(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.yw3.b(android.view.View):void");
    }

    public final /* synthetic */ f77 c(Map map) {
        iy7 iy7Var;
        f77 m2;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.h) {
                            int length = optJSONArray.length();
                            synchronized (this.h) {
                                iy7Var = (iy7) this.b.get(str);
                            }
                            if (iy7Var == null) {
                                bx3.a("Cannot find the corresponding resource object for " + str);
                            } else {
                                for (int i = 0; i < length; i++) {
                                    iy7Var.s(optJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                this.f = (length > 0) | this.f;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) mb3.b.e()).booleanValue()) {
                    k04.zzf("Failed to get SafeBrowsing metadata", e);
                }
                return s67.h(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f) {
            synchronized (this.h) {
                this.a.F(10);
            }
        }
        boolean z = this.f;
        if (!(z && this.g.v) && (!(this.k && this.g.u) && (z || !this.g.s))) {
            return s67.i(null);
        }
        synchronized (this.h) {
            for (iy7 iy7Var2 : this.b.values()) {
                this.a.u((jy7) iy7Var2.n());
            }
            this.a.s(this.c);
            this.a.t(this.d);
            if (bx3.b()) {
                String D = this.a.D();
                String C = this.a.C();
                StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + D + "\n  clickUrl: " + C + "\n  resources: \n");
                for (jy7 jy7Var : this.a.E()) {
                    sb.append("    [");
                    sb.append(jy7Var.L());
                    sb.append("] ");
                    sb.append(jy7Var.O());
                }
                bx3.a(sb.toString());
            }
            f77 zzb = new zzbo(this.e).zzb(1, this.g.q, null, ((py7) this.a.n()).a());
            if (bx3.b()) {
                zzb.f(new Runnable() { // from class: com.daaw.tw3
                    @Override // java.lang.Runnable
                    public final void run() {
                        bx3.a("Pinged SB successfully.");
                    }
                }, z04.a);
            }
            m2 = s67.m(zzb, new ey6() { // from class: com.daaw.uw3
                @Override // com.daaw.ey6
                public final Object apply(Object obj) {
                    String str2 = (String) obj;
                    int i2 = yw3.n;
                    return null;
                }
            }, z04.f);
        }
        return m2;
    }

    public final /* synthetic */ void e(Bitmap bitmap) {
        vq7 D = yq7.D();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, D);
        synchronized (this.h) {
            ex7 ex7Var = this.a;
            zx7 L = by7.L();
            L.s(D.n());
            L.t("image/png");
            L.u(2);
            ex7Var.A((by7) L.n());
        }
    }

    @Override // com.daaw.cx3
    public final zzcem zza() {
        return this.g;
    }

    @Override // com.daaw.cx3
    public final void zze() {
        synchronized (this.h) {
            this.b.keySet();
            f77 i = s67.i(Collections.emptyMap());
            w57 w57Var = new w57() { // from class: com.daaw.vw3
                @Override // com.daaw.w57
                public final f77 zza(Object obj) {
                    return yw3.this.c((Map) obj);
                }
            };
            g77 g77Var = z04.f;
            f77 n2 = s67.n(i, w57Var, g77Var);
            f77 o = s67.o(n2, 10L, TimeUnit.SECONDS, z04.d);
            s67.r(n2, new xw3(this, o), g77Var);
            m.add(o);
        }
    }

    @Override // com.daaw.cx3
    public final void zzh(String str) {
        synchronized (this.h) {
            if (str == null) {
                this.a.v();
            } else {
                this.a.w(str);
            }
        }
    }

    @Override // com.daaw.cx3
    public final boolean zzi() {
        return vw0.d() && this.g.r && !this.j;
    }
}
