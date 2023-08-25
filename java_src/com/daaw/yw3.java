package com.daaw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
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

    /* renamed from: m */
    public static final List f34191m = Collections.synchronizedList(new ArrayList());

    /* renamed from: n */
    public static final /* synthetic */ int f34192n = 0;
    @GuardedBy("lock")

    /* renamed from: a */
    public final ex7 f34193a;
    @GuardedBy("lock")

    /* renamed from: b */
    public final LinkedHashMap f34194b;

    /* renamed from: e */
    public final Context f34197e;

    /* renamed from: f */
    public boolean f34198f;

    /* renamed from: g */
    public final zzcem f34199g;

    /* renamed from: l */
    public final zw3 f34204l;
    @GuardedBy("lock")

    /* renamed from: c */
    public final List f34195c = new ArrayList();
    @GuardedBy("lock")

    /* renamed from: d */
    public final List f34196d = new ArrayList();

    /* renamed from: h */
    public final Object f34200h = new Object();

    /* renamed from: i */
    public HashSet f34201i = new HashSet();

    /* renamed from: j */
    public boolean f34202j = false;

    /* renamed from: k */
    public boolean f34203k = false;

    public yw3(Context context, zzchu zzchuVar, zzcem zzcemVar, String str, zw3 zw3Var, byte[] bArr) {
        ry0.m10829k(zzcemVar, "SafeBrowsing config is not present.");
        this.f34197e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f34194b = new LinkedHashMap();
        this.f34204l = zw3Var;
        this.f34199g = zzcemVar;
        for (String str2 : zzcemVar.f36985t) {
            this.f34201i.add(str2.toLowerCase(Locale.ENGLISH));
        }
        this.f34201i.remove("cookie".toLowerCase(Locale.ENGLISH));
        ex7 m12866L = py7.m12866L();
        m12866L.m23045F(9);
        m12866L.m23049B(str);
        m12866L.m23037z(str);
        fx7 m21143L = gx7.m21143L();
        String str3 = this.f34199g.f36981p;
        if (str3 != null) {
            m21143L.m22145s(str3);
        }
        m12866L.m23038y((gx7) m21143L.m22315n());
        ky7 m16371L = ly7.m16371L();
        m16371L.m17313u(ez1.m22979a(this.f34197e).m19340g());
        String str4 = zzchuVar.f36993p;
        if (str4 != null) {
            m16371L.m17315s(str4);
        }
        long m5497a = x70.m5492f().m5497a(this.f34197e);
        if (m5497a > 0) {
            m16371L.m17314t(m5497a);
        }
        m12866L.m23039x((ly7) m16371L.m22315n());
        this.f34193a = m12866L;
    }

    @Override // com.daaw.cx3
    /* renamed from: a */
    public final void mo3152a(String str, Map map, int i) {
        synchronized (this.f34200h) {
            if (i == 3) {
                this.f34203k = true;
            }
            if (this.f34194b.containsKey(str)) {
                if (i == 3) {
                    ((iy7) this.f34194b.get(str)).m19254w(hy7.m20323a(3));
                }
                return;
            }
            iy7 m18168M = jy7.m18168M();
            int m20323a = hy7.m20323a(i);
            if (m20323a != 0) {
                m18168M.m19254w(m20323a);
            }
            m18168M.m19257t(this.f34194b.size());
            m18168M.m19255v(str);
            rx7 m7650L = ux7.m7650L();
            if (!this.f34201i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.f34201i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        px7 m11950L = qx7.m11950L();
                        m11950L.m12886s(yq7.m3422H(str2));
                        m11950L.m12885t(yq7.m3422H(str3));
                        m7650L.m10844s((qx7) m11950L.m22315n());
                    }
                }
            }
            m18168M.m19256u((ux7) m7650L.m22315n());
            this.f34194b.put(str, m18168M);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.daaw.cx3
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3151b(View view) {
        Bitmap bitmap;
        boolean isDrawingCacheEnabled;
        if (this.f34199g.f36983r && !this.f34202j) {
            zzt.zzp();
            final Bitmap bitmap2 = null;
            if (view != null) {
                try {
                    isDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                } catch (RuntimeException e) {
                    e = e;
                    bitmap = null;
                }
                try {
                    view.setDrawingCacheEnabled(isDrawingCacheEnabled);
                } catch (RuntimeException e2) {
                    e = e2;
                    k04.zzh("Fail to capture the web view", e);
                    if (bitmap != null) {
                    }
                    if (bitmap2 != null) {
                    }
                }
                if (bitmap != null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width != 0 && height != 0) {
                            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(createBitmap);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap2 = createBitmap;
                        }
                        k04.zzj("Width or height of view is zero");
                    } catch (RuntimeException e3) {
                        k04.zzh("Fail to capture the webview", e3);
                    }
                } else {
                    bitmap2 = bitmap;
                }
            }
            if (bitmap2 != null) {
                bx3.m25763a("Failed to capture the webview bitmap.");
                return;
            }
            this.f34202j = true;
            zzs.zzf(new Runnable() { // from class: com.daaw.ww3
                @Override // java.lang.Runnable
                public final void run() {
                    yw3.this.m3148e(bitmap2);
                }
            });
        }
    }

    /* renamed from: c */
    public final /* synthetic */ f77 m3150c(Map map) {
        iy7 iy7Var;
        f77 m10630m;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.f34200h) {
                            int length = optJSONArray.length();
                            synchronized (this.f34200h) {
                                iy7Var = (iy7) this.f34194b.get(str);
                            }
                            if (iy7Var == null) {
                                bx3.m25763a("Cannot find the corresponding resource object for " + str);
                            } else {
                                for (int i = 0; i < length; i++) {
                                    iy7Var.m19258s(optJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                this.f34198f = (length > 0) | this.f34198f;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) mb3.f18762b.m16137e()).booleanValue()) {
                    k04.zzf("Failed to get SafeBrowsing metadata", e);
                }
                return s67.m10635h(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f34198f) {
            synchronized (this.f34200h) {
                this.f34193a.m23045F(10);
            }
        }
        boolean z = this.f34198f;
        if (!(z && this.f34199g.f36987v) && (!(this.f34203k && this.f34199g.f36986u) && (z || !this.f34199g.f36984s))) {
            return s67.m10634i(null);
        }
        synchronized (this.f34200h) {
            for (iy7 iy7Var2 : this.f34194b.values()) {
                this.f34193a.m23042u((jy7) iy7Var2.m22315n());
            }
            this.f34193a.m23044s(this.f34195c);
            this.f34193a.m23043t(this.f34196d);
            if (bx3.m25762b()) {
                String m23047D = this.f34193a.m23047D();
                String m23048C = this.f34193a.m23048C();
                StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + m23047D + "\n  clickUrl: " + m23048C + "\n  resources: \n");
                for (jy7 jy7Var : this.f34193a.m23046E()) {
                    sb.append("    [");
                    sb.append(jy7Var.m18169L());
                    sb.append("] ");
                    sb.append(jy7Var.m18166O());
                }
                bx3.m25763a(sb.toString());
            }
            f77 zzb = new zzbo(this.f34197e).zzb(1, this.f34199g.f36982q, null, ((py7) this.f34193a.m22315n()).mo4516a());
            if (bx3.m25762b()) {
                zzb.mo6515f(new Runnable() { // from class: com.daaw.tw3
                    @Override // java.lang.Runnable
                    public final void run() {
                        bx3.m25763a("Pinged SB successfully.");
                    }
                }, z04.f34305a);
            }
            m10630m = s67.m10630m(zzb, new ey6() { // from class: com.daaw.uw3
                @Override // com.daaw.ey6
                public final Object apply(Object obj) {
                    String str2 = (String) obj;
                    int i2 = yw3.f34192n;
                    return null;
                }
            }, z04.f34310f);
        }
        return m10630m;
    }

    /* renamed from: e */
    public final /* synthetic */ void m3148e(Bitmap bitmap) {
        vq7 m3426D = yq7.m3426D();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, m3426D);
        synchronized (this.f34200h) {
            ex7 ex7Var = this.f34193a;
            zx7 m25733L = by7.m25733L();
            m25733L.m1799s(m3426D.m6906n());
            m25733L.m1798t("image/png");
            m25733L.m1797u(2);
            ex7Var.m23050A((by7) m25733L.m22315n());
        }
    }

    @Override // com.daaw.cx3
    public final zzcem zza() {
        return this.f34199g;
    }

    @Override // com.daaw.cx3
    public final void zze() {
        synchronized (this.f34200h) {
            this.f34194b.keySet();
            f77 m10634i = s67.m10634i(Collections.emptyMap());
            w57 w57Var = new w57() { // from class: com.daaw.vw3
                @Override // com.daaw.w57
                public final f77 zza(Object obj) {
                    return yw3.this.m3150c((Map) obj);
                }
            };
            g77 g77Var = z04.f34310f;
            f77 m10629n = s67.m10629n(m10634i, w57Var, g77Var);
            f77 m10628o = s67.m10628o(m10629n, 10L, TimeUnit.SECONDS, z04.f34308d);
            s67.m10625r(m10629n, new xw3(this, m10628o), g77Var);
            f34191m.add(m10628o);
        }
    }

    @Override // com.daaw.cx3
    public final void zzh(String str) {
        synchronized (this.f34200h) {
            if (str == null) {
                this.f34193a.m23041v();
            } else {
                this.f34193a.m23040w(str);
            }
        }
    }

    @Override // com.daaw.cx3
    public final boolean zzi() {
        return vw0.m6701d() && this.f34199g.f36983r && !this.f34202j;
    }
}
