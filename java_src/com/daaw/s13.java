package com.daaw;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class s13 extends Thread {

    /* renamed from: A */
    public final int f25777A;

    /* renamed from: B */
    public final String f25778B;

    /* renamed from: C */
    public final boolean f25779C;

    /* renamed from: D */
    public final boolean f25780D;

    /* renamed from: E */
    public final boolean f25781E;

    /* renamed from: p */
    public boolean f25782p;

    /* renamed from: q */
    public boolean f25783q;

    /* renamed from: r */
    public final Object f25784r;

    /* renamed from: s */
    public final j13 f25785s;

    /* renamed from: t */
    public final int f25786t;

    /* renamed from: u */
    public final int f25787u;

    /* renamed from: v */
    public final int f25788v;

    /* renamed from: w */
    public final int f25789w;

    /* renamed from: x */
    public final int f25790x;

    /* renamed from: y */
    public final int f25791y;

    /* renamed from: z */
    public final int f25792z;

    public s13() {
        j13 j13Var = new j13();
        this.f25782p = false;
        this.f25783q = false;
        this.f25785s = j13Var;
        this.f25784r = new Object();
        this.f25787u = ((Long) sa3.f26047d.m16137e()).intValue();
        this.f25788v = ((Long) sa3.f26044a.m16137e()).intValue();
        this.f25789w = ((Long) sa3.f26048e.m16137e()).intValue();
        this.f25790x = ((Long) sa3.f26046c.m16137e()).intValue();
        this.f25791y = ((Integer) zzba.zzc().m23658b(g93.f10521Q)).intValue();
        this.f25792z = ((Integer) zzba.zzc().m23658b(g93.f10531R)).intValue();
        this.f25777A = ((Integer) zzba.zzc().m23658b(g93.f10541S)).intValue();
        this.f25786t = ((Long) sa3.f26049f.m16137e()).intValue();
        this.f25778B = (String) zzba.zzc().m23658b(g93.f10561U);
        this.f25779C = ((Boolean) zzba.zzc().m23658b(g93.f10571V)).booleanValue();
        this.f25780D = ((Boolean) zzba.zzc().m23658b(g93.f10581W)).booleanValue();
        this.f25781E = ((Boolean) zzba.zzc().m23658b(g93.f10591X)).booleanValue();
        setName("ContentFetchTask");
    }

    /* renamed from: a */
    public final i13 m10763a() {
        return this.f25785s.m19174a(this.f25781E);
    }

    /* renamed from: b */
    public final r13 m10762b(View view, i13 i13Var) {
        if (view == null) {
            return new r13(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new r13(this, 0, 0);
            }
            i13Var.m20207k(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new r13(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof a74)) {
            WebView webView = (WebView) view;
            if (vw0.m6701d()) {
                i13Var.m20210h();
                webView.post(new q13(this, i13Var, webView, globalVisibleRect));
                return new r13(this, 0, 1);
            }
            return new r13(this, 0, 0);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                r13 m10762b = m10762b(viewGroup.getChildAt(i3), i13Var);
                i += m10762b.f24727a;
                i2 += m10762b.f24728b;
            }
            return new r13(this, i, i2);
        } else {
            return new r13(this, 0, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
        if (r11 == 0) goto L24;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10761c(View view) {
        try {
            i13 i13Var = new i13(this.f25787u, this.f25788v, this.f25789w, this.f25790x, this.f25791y, this.f25792z, this.f25777A, this.f25780D);
            Context m15599b = zzt.zzb().m15599b();
            if (m15599b != null && !TextUtils.isEmpty(this.f25778B)) {
                String str = (String) view.getTag(m15599b.getResources().getIdentifier((String) zzba.zzc().m23658b(g93.f10551T), "id", m15599b.getPackageName()));
                if (str != null && str.equals(this.f25778B)) {
                    return;
                }
            }
            r13 m10762b = m10762b(view, i13Var);
            i13Var.m20205m();
            if (m10762b.f24727a == 0 && m10762b.f24728b == 0) {
                return;
            }
            int i = m10762b.f24728b;
            if (i == 0) {
                if (i13Var.m20215c() == 0) {
                    return;
                }
            }
            if (this.f25785s.m19171d(i13Var)) {
                return;
            }
            this.f25785s.m19173b(i13Var);
        } catch (Exception e) {
            k04.zzh("Exception in fetchContentOnUIThread", e);
            zzt.zzo().m11902u(e, "ContentFetchTask.fetchContent");
        }
    }

    /* renamed from: d */
    public final void m10760d(i13 i13Var, WebView webView, String str, boolean z) {
        i13Var.m20211g();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.f25779C || TextUtils.isEmpty(webView.getTitle())) {
                    i13Var.m20206l(optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    i13Var.m20206l(title + "\n" + optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (i13Var.m20203o()) {
                this.f25785s.m19172c(i13Var);
            }
        } catch (JSONException unused) {
            k04.zze("Json string may be malformed.");
        } catch (Throwable th) {
            k04.zzf("Failed to get webview content.", th);
            zzt.zzo().m11902u(th, "ContentFetchTask.processWebViewContent");
        }
    }

    /* renamed from: e */
    public final void m10759e() {
        synchronized (this.f25784r) {
            if (this.f25782p) {
                k04.zze("Content hash thread already started, quitting...");
                return;
            }
            this.f25782p = true;
            start();
        }
    }

    /* renamed from: f */
    public final void m10758f() {
        synchronized (this.f25784r) {
            this.f25783q = true;
            k04.zze("ContentFetchThread: paused, mPause = true");
        }
    }

    /* renamed from: g */
    public final void m10757g() {
        synchronized (this.f25784r) {
            this.f25783q = false;
            this.f25784r.notifyAll();
            k04.zze("ContentFetchThread: wakeup");
        }
    }

    /* renamed from: h */
    public final boolean m10756h() {
        return this.f25783q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (r3.importance != 100) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (r2.inKeyguardRestrictedInputMode() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r0 == null) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r0.isScreenOn() == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
        r0 = com.google.android.gms.ads.internal.zzt.zzb().m15600a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r0 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
        com.daaw.k04.zze("ContentFetchThread: no activity. Sleeping.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
        if (r0.getWindow() == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
        if (r0.getWindow().getDecorView() == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
        r1 = r0.getWindow().getDecorView().findViewById(16908290);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
        com.google.android.gms.ads.internal.zzt.zzo().m11902u(r0, "ContentFetchTask.extractContent");
        com.daaw.k04.zze("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c1, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c2, code lost:
        com.daaw.k04.zzh("Error in ContentFetchTask", r0);
        com.google.android.gms.ads.internal.zzt.zzo().m11902u(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d1, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d2, code lost:
        com.daaw.k04.zzh("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00da A[EXC_TOP_SPLITTER, LOOP:1: B:68:0x00da->B:73:0x00da, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        View view;
        while (true) {
            try {
                Context m15599b = zzt.zzb().m15599b();
                if (m15599b != null) {
                    ActivityManager activityManager = (ActivityManager) m15599b.getSystemService("activity");
                    KeyguardManager keyguardManager = (KeyguardManager) m15599b.getSystemService("keyguard");
                    if (activityManager != null && keyguardManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ActivityManager.RunningAppProcessInfo next = it.next();
                            if (Process.myPid() == next.pid) {
                                break;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                zzt.zzo().m11902u(th, "ContentFetchTask.isInForeground");
            }
            k04.zze("ContentFetchTask: sleeping");
            m10758f();
            Thread.sleep(this.f25786t * 1000);
            synchronized (this.f25784r) {
                while (this.f25783q) {
                    try {
                        k04.zze("ContentFetchTask: waiting");
                        this.f25784r.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        if (view != null) {
            view.post(new o13(this, view));
        }
        Thread.sleep(this.f25786t * 1000);
        synchronized (this.f25784r) {
        }
    }
}
