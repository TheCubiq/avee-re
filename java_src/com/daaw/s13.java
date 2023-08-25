package com.daaw;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class s13 extends Thread {
    public final int A;
    public final String B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public boolean p;
    public boolean q;
    public final Object r;
    public final j13 s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public s13() {
        j13 j13Var = new j13();
        this.p = false;
        this.q = false;
        this.s = j13Var;
        this.r = new Object();
        this.u = ((Long) sa3.d.e()).intValue();
        this.v = ((Long) sa3.a.e()).intValue();
        this.w = ((Long) sa3.e.e()).intValue();
        this.x = ((Long) sa3.c.e()).intValue();
        this.y = ((Integer) zzba.zzc().b(g93.Q)).intValue();
        this.z = ((Integer) zzba.zzc().b(g93.R)).intValue();
        this.A = ((Integer) zzba.zzc().b(g93.S)).intValue();
        this.t = ((Long) sa3.f.e()).intValue();
        this.B = (String) zzba.zzc().b(g93.U);
        this.C = ((Boolean) zzba.zzc().b(g93.V)).booleanValue();
        this.D = ((Boolean) zzba.zzc().b(g93.W)).booleanValue();
        this.E = ((Boolean) zzba.zzc().b(g93.X)).booleanValue();
        setName("ContentFetchTask");
    }

    public final i13 a() {
        return this.s.a(this.E);
    }

    public final r13 b(View view, i13 i13Var) {
        if (view == null) {
            return new r13(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new r13(this, 0, 0);
            }
            i13Var.k(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new r13(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof a74)) {
            WebView webView = (WebView) view;
            if (vw0.d()) {
                i13Var.h();
                webView.post(new q13(this, i13Var, webView, globalVisibleRect));
                return new r13(this, 0, 1);
            }
            return new r13(this, 0, 0);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                r13 b = b(viewGroup.getChildAt(i3), i13Var);
                i += b.a;
                i2 += b.b;
            }
            return new r13(this, i, i2);
        } else {
            return new r13(this, 0, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
        if (r11 == 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.view.View r11) {
        /*
            r10 = this;
            com.daaw.i13 r9 = new com.daaw.i13     // Catch: java.lang.Exception -> L83
            int r1 = r10.u     // Catch: java.lang.Exception -> L83
            int r2 = r10.v     // Catch: java.lang.Exception -> L83
            int r3 = r10.w     // Catch: java.lang.Exception -> L83
            int r4 = r10.x     // Catch: java.lang.Exception -> L83
            int r5 = r10.y     // Catch: java.lang.Exception -> L83
            int r6 = r10.z     // Catch: java.lang.Exception -> L83
            int r7 = r10.A     // Catch: java.lang.Exception -> L83
            boolean r8 = r10.D     // Catch: java.lang.Exception -> L83
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L83
            com.daaw.n13 r0 = com.google.android.gms.ads.internal.zzt.zzb()     // Catch: java.lang.Exception -> L83
            android.content.Context r0 = r0.b()     // Catch: java.lang.Exception -> L83
            if (r0 == 0) goto L54
            java.lang.String r1 = r10.B     // Catch: java.lang.Exception -> L83
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L83
            if (r1 != 0) goto L54
            android.content.res.Resources r1 = r0.getResources()     // Catch: java.lang.Exception -> L83
            com.daaw.y83 r2 = com.daaw.g93.T     // Catch: java.lang.Exception -> L83
            com.daaw.e93 r3 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Exception -> L83
            java.lang.Object r2 = r3.b(r2)     // Catch: java.lang.Exception -> L83
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L83
            java.lang.String r3 = "id"
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Exception -> L83
            int r0 = r1.getIdentifier(r2, r3, r0)     // Catch: java.lang.Exception -> L83
            java.lang.Object r0 = r11.getTag(r0)     // Catch: java.lang.Exception -> L83
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L83
            if (r0 == 0) goto L54
            java.lang.String r1 = r10.B     // Catch: java.lang.Exception -> L83
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L83
            if (r0 != 0) goto L53
            goto L54
        L53:
            return
        L54:
            com.daaw.r13 r11 = r10.b(r11, r9)     // Catch: java.lang.Exception -> L83
            r9.m()     // Catch: java.lang.Exception -> L83
            int r0 = r11.a     // Catch: java.lang.Exception -> L83
            if (r0 != 0) goto L65
            int r0 = r11.b     // Catch: java.lang.Exception -> L83
            if (r0 == 0) goto L64
            goto L65
        L64:
            return
        L65:
            int r11 = r11.b     // Catch: java.lang.Exception -> L83
            if (r11 != 0) goto L71
            int r11 = r9.c()     // Catch: java.lang.Exception -> L83
            if (r11 == 0) goto L70
            goto L73
        L70:
            return
        L71:
            if (r11 != 0) goto L7d
        L73:
            com.daaw.j13 r11 = r10.s     // Catch: java.lang.Exception -> L83
            boolean r11 = r11.d(r9)     // Catch: java.lang.Exception -> L83
            if (r11 != 0) goto L7c
            goto L7d
        L7c:
            return
        L7d:
            com.daaw.j13 r11 = r10.s     // Catch: java.lang.Exception -> L83
            r11.b(r9)     // Catch: java.lang.Exception -> L83
            return
        L83:
            r11 = move-exception
            java.lang.String r0 = "Exception in fetchContentOnUIThread"
            com.daaw.k04.zzh(r0, r11)
            com.daaw.qz3 r0 = com.google.android.gms.ads.internal.zzt.zzo()
            java.lang.String r1 = "ContentFetchTask.fetchContent"
            r0.u(r11, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.s13.c(android.view.View):void");
    }

    public final void d(i13 i13Var, WebView webView, String str, boolean z) {
        i13Var.g();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.C || TextUtils.isEmpty(webView.getTitle())) {
                    i13Var.l(optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    i13Var.l(title + "\n" + optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (i13Var.o()) {
                this.s.c(i13Var);
            }
        } catch (JSONException unused) {
            k04.zze("Json string may be malformed.");
        } catch (Throwable th) {
            k04.zzf("Failed to get webview content.", th);
            zzt.zzo().u(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void e() {
        synchronized (this.r) {
            if (this.p) {
                k04.zze("Content hash thread already started, quitting...");
                return;
            }
            this.p = true;
            start();
        }
    }

    public final void f() {
        synchronized (this.r) {
            this.q = true;
            k04.zze("ContentFetchThread: paused, mPause = true");
        }
    }

    public final void g() {
        synchronized (this.r) {
            this.q = false;
            this.r.notifyAll();
            k04.zze("ContentFetchThread: wakeup");
        }
    }

    public final boolean h() {
        return this.q;
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
        r0 = com.google.android.gms.ads.internal.zzt.zzb().a();
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
        com.google.android.gms.ads.internal.zzt.zzo().u(r0, "ContentFetchTask.extractContent");
        com.daaw.k04.zze("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c1, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c2, code lost:
        com.daaw.k04.zzh("Error in ContentFetchTask", r0);
        com.google.android.gms.ads.internal.zzt.zzo().u(r0, "ContentFetchTask.run");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r6 = this;
        L0:
            com.daaw.n13 r0 = com.google.android.gms.ads.internal.zzt.zzb()     // Catch: java.lang.Throwable -> La8
            android.content.Context r0 = r0.b()     // Catch: java.lang.Throwable -> La8
            if (r0 != 0) goto Lc
            goto Lb2
        Lc:
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> La8
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "keyguard"
            java.lang.Object r2 = r0.getSystemService(r2)     // Catch: java.lang.Throwable -> La8
            android.app.KeyguardManager r2 = (android.app.KeyguardManager) r2     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto Lb2
            if (r2 == 0) goto Lb2
            java.util.List r1 = r1.getRunningAppProcesses()     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto Lb2
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La8
        L2a:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> La8
            if (r3 == 0) goto Lb2
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> La8
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3     // Catch: java.lang.Throwable -> La8
            int r4 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> La8
            int r5 = r3.pid     // Catch: java.lang.Throwable -> La8
            if (r4 != r5) goto L2a
            int r1 = r3.importance     // Catch: java.lang.Throwable -> La8
            r3 = 100
            if (r1 != r3) goto Lb2
            boolean r1 = r2.inKeyguardRestrictedInputMode()     // Catch: java.lang.Throwable -> La8
            if (r1 != 0) goto Lb2
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> La8
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto Lb2
            boolean r0 = r0.isScreenOn()     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto Lb2
            com.daaw.n13 r0 = com.google.android.gms.ads.internal.zzt.zzb()     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            android.app.Activity r0 = r0.a()     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            if (r0 != 0) goto L6d
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.daaw.k04.zze(r0)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
        L69:
            r6.f()     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            goto Lb8
        L6d:
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L9d
            android.view.Window r2 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L9d
            android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Exception -> L8e
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r0.findViewById(r2)     // Catch: java.lang.Exception -> L8e
            goto L9d
        L8e:
            r0 = move-exception
            com.daaw.qz3 r2 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.u(r0, r3)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            com.daaw.k04.zze(r0)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
        L9d:
            if (r1 == 0) goto Lb8
            com.daaw.o13 r0 = new com.daaw.o13     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            r0.<init>(r6, r1)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            r1.post(r0)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            goto Lb8
        La8:
            r0 = move-exception
            com.daaw.qz3 r1 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            java.lang.String r2 = "ContentFetchTask.isInForeground"
            r1.u(r0, r2)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
        Lb2:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.daaw.k04.zze(r0)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            goto L69
        Lb8:
            int r0 = r6.t     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Exception -> Lc1 java.lang.InterruptedException -> Ld1
            goto Ld7
        Lc1:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.daaw.k04.zzh(r1, r0)
            com.daaw.qz3 r1 = com.google.android.gms.ads.internal.zzt.zzo()
            java.lang.String r2 = "ContentFetchTask.run"
            r1.u(r0, r2)
            goto Ld7
        Ld1:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.daaw.k04.zzh(r1, r0)
        Ld7:
            java.lang.Object r0 = r6.r
            monitor-enter(r0)
        Lda:
            boolean r1 = r6.q     // Catch: java.lang.Throwable -> Lec
            if (r1 == 0) goto Le9
            java.lang.String r1 = "ContentFetchTask: waiting"
            com.daaw.k04.zze(r1)     // Catch: java.lang.InterruptedException -> Lda java.lang.Throwable -> Lec
            java.lang.Object r1 = r6.r     // Catch: java.lang.InterruptedException -> Lda java.lang.Throwable -> Lec
            r1.wait()     // Catch: java.lang.InterruptedException -> Lda java.lang.Throwable -> Lec
            goto Lda
        Le9:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lec
            goto L0
        Lec:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lec
            goto Lf0
        Lef:
            throw r1
        Lf0:
            goto Lef
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.s13.run():void");
    }
}
