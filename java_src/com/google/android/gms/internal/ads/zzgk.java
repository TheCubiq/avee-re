package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzgk extends Thread {
    private final zzgf zzahz;
    private final zzadf zzaia;
    private boolean mStarted = false;
    private boolean zzahy = false;
    private boolean zzbm = false;
    private final Object mLock = new Object();
    private final int zzagx = ((Integer) zzkb.zzik().zzd(zznk.zzawl)).intValue();
    private final int zzaic = ((Integer) zzkb.zzik().zzd(zznk.zzawm)).intValue();
    private final int zzagz = ((Integer) zzkb.zzik().zzd(zznk.zzawn)).intValue();
    private final int zzaid = ((Integer) zzkb.zzik().zzd(zznk.zzawo)).intValue();
    private final int zzaie = ((Integer) zzkb.zzik().zzd(zznk.zzawr)).intValue();
    private final int zzaif = ((Integer) zzkb.zzik().zzd(zznk.zzawt)).intValue();
    private final int zzaig = ((Integer) zzkb.zzik().zzd(zznk.zzawu)).intValue();
    private final int zzaib = ((Integer) zzkb.zzik().zzd(zznk.zzawp)).intValue();
    private final String zzaih = (String) zzkb.zzik().zzd(zznk.zzaww);
    private final boolean zzaii = ((Boolean) zzkb.zzik().zzd(zznk.zzawy)).booleanValue();

    public zzgk(zzgf zzgfVar, zzadf zzadfVar) {
        this.zzahz = zzgfVar;
        this.zzaia = zzadfVar;
        setName("ContentFetchTask");
    }

    private final zzgo zza(View view, zzge zzgeVar) {
        boolean z;
        if (view == null) {
            return new zzgo(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzgo(this, 0, 0);
            }
            zzgeVar.zzb(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new zzgo(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof zzaqw)) {
            zzgeVar.zzgs();
            WebView webView = (WebView) view;
            if (PlatformVersion.isAtLeastKitKat()) {
                zzgeVar.zzgs();
                webView.post(new zzgm(this, zzgeVar, webView, globalVisibleRect));
                z = true;
            } else {
                z = false;
            }
            return z ? new zzgo(this, 0, 1) : new zzgo(this, 0, 0);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                zzgo zza = zza(viewGroup.getChildAt(i3), zzgeVar);
                i += zza.zzaiq;
                i2 += zza.zzair;
            }
            return new zzgo(this, i, i2);
        } else {
            return new zzgo(this, 0, 0);
        }
    }

    private static boolean zzgx() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            Context context = com.google.android.gms.ads.internal.zzbv.zzen().getContext();
            if (context == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return false;
                    }
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    return powerManager == null ? false : powerManager.isScreenOn();
                }
            }
            return false;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzbv.zzeo().zza(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    private final void zzgz() {
        synchronized (this.mLock) {
            this.zzahy = true;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(true);
            zzakb.zzck(sb.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007f A[EXC_TOP_SPLITTER, LOOP:1: B:43:0x007f->B:52:0x007f, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        while (true) {
            try {
            } catch (InterruptedException e) {
                zzakb.zzb("Error in ContentFetchTask", e);
            } catch (Exception e2) {
                zzakb.zzb("Error in ContentFetchTask", e2);
                this.zzaia.zza(e2, "ContentFetchTask.run");
            }
            if (zzgx()) {
                Activity activity = com.google.android.gms.ads.internal.zzbv.zzen().getActivity();
                if (activity == null) {
                    zzakb.zzck("ContentFetchThread: no activity. Sleeping.");
                } else {
                    if (activity != null) {
                        View view = null;
                        try {
                            if (activity.getWindow() != null && activity.getWindow().getDecorView() != null) {
                                view = activity.getWindow().getDecorView().findViewById(16908290);
                            }
                        } catch (Exception e3) {
                            com.google.android.gms.ads.internal.zzbv.zzeo().zza(e3, "ContentFetchTask.extractContent");
                            zzakb.zzck("Failed getting root view of activity. Content not extracted.");
                        }
                        if (view != null && view != null) {
                            view.post(new zzgl(this, view));
                        }
                    }
                    Thread.sleep(this.zzaib * 1000);
                    synchronized (this.mLock) {
                        while (this.zzahy) {
                            try {
                                zzakb.zzck("ContentFetchTask: waiting");
                                this.mLock.wait();
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                }
            } else {
                zzakb.zzck("ContentFetchTask: sleeping");
            }
            zzgz();
            Thread.sleep(this.zzaib * 1000);
            synchronized (this.mLock) {
            }
        }
    }

    public final void wakeup() {
        synchronized (this.mLock) {
            this.zzahy = false;
            this.mLock.notifyAll();
            zzakb.zzck("ContentFetchThread: wakeup");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzge zzgeVar, WebView webView, String str, boolean z) {
        zzgeVar.zzgr();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString(MimeTypes.BASE_TYPE_TEXT);
                if (this.zzaii || TextUtils.isEmpty(webView.getTitle())) {
                    zzgeVar.zza(optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    zzgeVar.zza(sb.toString(), z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzgeVar.zzgn()) {
                this.zzahz.zzb(zzgeVar);
            }
        } catch (JSONException unused) {
            zzakb.zzck("Json string may be malformed.");
        } catch (Throwable th) {
            zzakb.zza("Failed to get webview content.", th);
            this.zzaia.zza(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zzgw() {
        synchronized (this.mLock) {
            if (this.mStarted) {
                zzakb.zzck("Content hash thread already started, quiting...");
                return;
            }
            this.mStarted = true;
            start();
        }
    }

    public final zzge zzgy() {
        return this.zzahz.zzgv();
    }

    public final boolean zzha() {
        return this.zzahy;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzk(View view) {
        try {
            zzge zzgeVar = new zzge(this.zzagx, this.zzaic, this.zzagz, this.zzaid, this.zzaie, this.zzaif, this.zzaig);
            Context context = com.google.android.gms.ads.internal.zzbv.zzen().getContext();
            if (context != null && !TextUtils.isEmpty(this.zzaih)) {
                String str = (String) view.getTag(context.getResources().getIdentifier((String) zzkb.zzik().zzd(zznk.zzawv), TtmlNode.ATTR_ID, context.getPackageName()));
                if (str != null && str.equals(this.zzaih)) {
                    return;
                }
            }
            zzgo zza = zza(view, zzgeVar);
            zzgeVar.zzgt();
            if (zza.zzaiq == 0 && zza.zzair == 0) {
                return;
            }
            if (zza.zzair == 0 && zzgeVar.zzgu() == 0) {
                return;
            }
            if (zza.zzair == 0 && this.zzahz.zza(zzgeVar)) {
                return;
            }
            this.zzahz.zzc(zzgeVar);
        } catch (Exception e) {
            zzakb.zzb("Exception in fetchContentOnUIThread", e);
            this.zzaia.zza(e, "ContentFetchTask.fetchContent");
        }
    }
}
