package com.google.android.gms.ads.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.daaw.a84;
import com.daaw.av3;
import com.daaw.c80;
import com.daaw.co;
import com.daaw.ez1;
import com.daaw.f77;
import com.daaw.g93;
import com.daaw.gv6;
import com.daaw.ia3;
import com.daaw.j04;
import com.daaw.k04;
import com.daaw.km8;
import com.daaw.la5;
import com.daaw.lc1;
import com.daaw.n08;
import com.daaw.nb3;
import com.daaw.ph8;
import com.daaw.r64;
import com.daaw.s67;
import com.daaw.th6;
import com.daaw.tp8;
import com.daaw.vf;
import com.daaw.wh6;
import com.daaw.xl;
import com.daaw.y83;
import com.daaw.z04;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.nativead.NativeAdView;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzs {
    public static final gv6 zza = new zzf(Looper.getMainLooper());
    @GuardedBy("userAgentLock")
    public String e;
    public final AtomicReference a = new AtomicReference(null);
    public final AtomicReference b = new AtomicReference(null);
    public boolean c = true;
    public final Object d = new Object();
    public boolean f = false;
    public boolean g = false;
    public final Executor h = Executors.newSingleThreadExecutor();

    public static KeyguardManager a(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    public static Bundle b(Context context) {
        try {
            return ez1.a(context).c(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            zze.zzb("Error getting metadata", e);
            return null;
        }
    }

    public static String c(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return TextUtils.isEmpty(string) ? "" : (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    public static boolean d(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static final void e(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static final String g() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final int[] h() {
        return new int[]{0, 0};
    }

    public static final boolean zzA(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            k04.zzh("Error loading class.", th);
            com.google.android.gms.ads.internal.zzt.zzo().u(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzB() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public static final boolean zzC(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzD(Context context) {
        Bundle b = b(context);
        return TextUtils.isEmpty(c(b)) && !TextUtils.isEmpty(b.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    public static final boolean zzE(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void zzF(View view, int i, MotionEvent motionEvent) {
        String str;
        int i2;
        int i3;
        int i4;
        String str2;
        th6 d;
        wh6 v;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (view2 instanceof la5) {
                view2 = ((la5) view2).getChildAt(0);
            }
            if ((view2 instanceof com.google.android.gms.ads.formats.zzg) || (view2 instanceof NativeAdView)) {
                str = "NATIVE";
                i2 = 1;
            } else {
                str = "UNKNOWN";
                i2 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i4 = rect.width();
                i3 = rect.height();
            } else {
                i3 = 0;
                i4 = 0;
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            long zzt = zzt(view2);
            view2.getLocationOnScreen(iArr);
            int i5 = iArr[0];
            int i6 = iArr[1];
            String str3 = "none";
            if (!(view2 instanceof a84) || (v = ((a84) view2).v()) == null) {
                str2 = "none";
            } else {
                str2 = v.b;
                int hashCode = view2.hashCode();
                view2.setContentDescription(str2 + ":" + hashCode);
            }
            if ((view2 instanceof r64) && (d = ((r64) view2).d()) != null) {
                str = th6.a(d.b);
                i2 = d.f;
                str3 = d.F;
            }
            k04.zzi(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i2), view2.getClass().getName(), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i4), Integer.valueOf(i3), Long.valueOf(zzt), Integer.toString(i, 2)));
        } catch (Exception e) {
            k04.zzh("Failure getting view location.", e);
        }
    }

    public static final AlertDialog.Builder zzG(Context context) {
        return new AlertDialog.Builder(context, com.google.android.gms.ads.internal.zzt.zzq().zza());
    }

    public static final void zzH(Context context, String str, String str2) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add(str2);
        for (String str3 : arrayList) {
            new zzby(context, str, str3).zzb();
        }
    }

    public static final void zzI(Context context, Throwable th) {
        if (context != null) {
            try {
                if (((Boolean) nb3.b.e()).booleanValue()) {
                    xl.a(context, th);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final String zzJ(InputStreamReader inputStreamReader) {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    public static final int zzK(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            k04.zzj("Could not parse value:".concat(e.toString()));
            return 0;
        }
    }

    public static final Map zzL(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public static final WebResourceResponse zzM(HttpURLConnection httpURLConnection) {
        com.google.android.gms.ads.internal.zzt.zzp();
        String contentType = httpURLConnection.getContentType();
        String str = "";
        String trim = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
        com.google.android.gms.ads.internal.zzt.zzp();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    if (split[i].trim().startsWith("charset")) {
                        String[] split2 = split[i].trim().split("=");
                        if (split2.length > 1) {
                            str = split2[1].trim();
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        String str2 = str;
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null && !entry.getValue().isEmpty()) {
                hashMap.put(entry.getKey(), entry.getValue().get(0));
            }
        }
        return com.google.android.gms.ads.internal.zzt.zzq().zzc(trim, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    public static final int[] zzN(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(16908290)) == null) ? h() : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static final int[] zzO(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] h = (window == null || (findViewById = window.findViewById(16908290)) == null) ? h() : new int[]{findViewById.getTop(), findViewById.getBottom()};
        return new int[]{com.google.android.gms.ads.internal.client.zzay.zzb().g(activity, h[0]), com.google.android.gms.ads.internal.client.zzay.zzb().g(activity, h[1])};
    }

    public static final boolean zzP(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = com.google.android.gms.ads.internal.zzt.zzp().c || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzl(view);
        long zzt = zzt(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z)) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.e1)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.N8)).booleanValue()) {
                    return true;
                }
                if (zzt >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.P8)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void zzQ(Context context, Intent intent) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.f9)).booleanValue()) {
            e(context, intent);
            return;
        }
        try {
            e(context, intent);
        } catch (SecurityException e) {
            k04.zzk("", e);
            com.google.android.gms.ads.internal.zzt.zzo().u(e, "AdUtil.startActivityWithUnknownContext");
        }
    }

    public static final void zzR(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzm(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            k04.zze("Opening " + uri2 + " in a new browser.");
        } catch (ActivityNotFoundException e) {
            k04.zzh("No browser is found.", e);
        }
    }

    public static final int[] zzS(Activity activity) {
        int[] zzN = zzN(activity);
        return new int[]{com.google.android.gms.ads.internal.client.zzay.zzb().g(activity, zzN[0]), com.google.android.gms.ads.internal.client.zzay.zzb().g(activity, zzN[1])};
    }

    public static final boolean zzT(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return zzP(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, a(context));
    }

    public static int zza(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i > 0) {
            k04.zzj("HTTP timeout too low: " + i + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
            return 60000;
        }
        return 60000;
    }

    public static void zzf(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            z04.a.execute(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean zzl(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzs.zzl(android.view.View):boolean");
    }

    public static final void zzm(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final ViewGroup.LayoutParams zzn() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public static final String zzo(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return c(b(context));
    }

    public static final String zzq() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + " " + str2;
    }

    public static final DisplayMetrics zzr(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final long zzt(View view) {
        int i;
        float f = Float.MAX_VALUE;
        ViewParent viewParent = view;
        do {
            if (!(viewParent instanceof View)) {
                break;
            }
            View view2 = viewParent;
            f = Math.min(f, view2.getAlpha());
            i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            viewParent = view2.getParent();
        } while (i > 0);
        return Math.round((f >= 0.0f ? f : 0.0f) * 100.0f);
    }

    public static final WebResourceResponse zzu(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzp().zzc(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzbo(context).zzb(0, str2, hashMap, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            k04.zzk("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    public static final String zzv() {
        Resources d = com.google.android.gms.ads.internal.zzt.zzo().d();
        return d != null ? d.getString(R.string.s7) : "Test Ad";
    }

    public static final zzbr zzw(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                k04.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return queryLocalInterface instanceof zzbr ? (zzbr) queryLocalInterface : new zzbp(iBinder);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzo().u(e, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean zzx(Context context, String str) {
        Context a = av3.a(context);
        return ez1.a(a).b(str, a.getPackageName()) == 0;
    }

    public static final boolean zzy(String str) {
        if (j04.l()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.u4)).booleanValue()) {
                String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.w4);
                if (!str2.isEmpty()) {
                    for (String str3 : str2.split(";")) {
                        if (str3.equals(str)) {
                            return false;
                        }
                    }
                }
                String str4 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.v4);
                if (str4.isEmpty()) {
                    return true;
                }
                for (String str5 : str4.split(";")) {
                    if (str5.equals(str)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean zzz(Context context) {
        KeyguardManager a;
        return (context == null || (a = a(context)) == null || !a.isKeyguardLocked()) ? false : true;
    }

    public final f77 zzb(final Uri uri) {
        return s67.k(new Callable() { // from class: com.google.android.gms.ads.internal.util.zzl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Uri uri2 = uri;
                gv6 gv6Var = zzs.zza;
                com.google.android.gms.ads.internal.zzt.zzp();
                return zzs.zzL(uri2);
            }
        }, this.h);
    }

    public final String zzc(final Context context, String str) {
        Object zza2;
        synchronized (this.d) {
            String str2 = this.e;
            if (str2 != null) {
                return str2;
            }
            if (str == null) {
                return g();
            }
            try {
                zzce zza3 = zzce.zza();
                if (TextUtils.isEmpty(zza3.a)) {
                    if (vf.a()) {
                        zza2 = zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcc
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Context context2 = context;
                                SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                                String string = sharedPreferences.getString("user_agent", "");
                                if (!TextUtils.isEmpty(string)) {
                                    zze.zza("User agent is already initialized on Google Play Services.");
                                    return string;
                                }
                                zze.zza("User agent is not initialized on Google Play Services. Initializing.");
                                String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                                lc1.a(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                                return defaultUserAgent;
                            }
                        });
                    } else {
                        final Context c = c80.c(context);
                        zza2 = zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcd
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                SharedPreferences sharedPreferences;
                                Context context2 = c;
                                Context context3 = context;
                                boolean z = false;
                                if (context2 != null) {
                                    zze.zza("Attempting to read user agent from Google Play Services.");
                                    sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                                } else {
                                    zze.zza("Attempting to read user agent from local cache.");
                                    sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                    z = true;
                                }
                                String string = sharedPreferences.getString("user_agent", "");
                                if (TextUtils.isEmpty(string)) {
                                    zze.zza("Reading user agent from WebSettings");
                                    string = WebSettings.getDefaultUserAgent(context3);
                                    if (z) {
                                        sharedPreferences.edit().putString("user_agent", string).apply();
                                        zze.zza("Persisting user agent.");
                                    }
                                }
                                return string;
                            }
                        });
                    }
                    zza3.a = (String) zza2;
                }
                this.e = zza3.a;
            } catch (Exception unused) {
            }
            if (TextUtils.isEmpty(this.e)) {
                this.e = WebSettings.getDefaultUserAgent(context);
            }
            if (TextUtils.isEmpty(this.e)) {
                this.e = g();
            }
            this.e = this.e + " (Mobile; " + str;
            try {
                if (ez1.a(context).g()) {
                    this.e = this.e + ";aia";
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.zzt.zzo().u(e, "AdUtil.getUserAgent");
            }
            String str3 = this.e + ")";
            this.e = str3;
            return str3;
        }
    }

    public final void zze(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i) {
        int zza2 = zza(i);
        k04.zzi("HTTP timeout: " + zza2 + " milliseconds.");
        httpURLConnection.setConnectTimeout(zza2);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(zza2);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", zzc(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final boolean zzg(String str) {
        return d(str, this.a, (String) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.Z));
    }

    public final boolean zzh(String str) {
        return d(str, this.b, (String) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.a0));
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzi(Context context) {
        if (this.g) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        g93.c(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.e9)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new km8(this, null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new km8(this, null), intentFilter, 4);
        }
        this.g = true;
        return true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzj(Context context) {
        if (this.f) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        g93.c(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.e9)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new tp8(this, null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new tp8(this, null), intentFilter, 4);
        }
        this.f = true;
        return true;
    }

    public final int zzk(Context context, Uri uri) {
        int i;
        if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (context instanceof Activity) {
            i = 0;
        } else {
            zze.zza("Chrome Custom Tabs can only work with Activity context.");
            i = 2;
        }
        y83 y83Var = g93.a4;
        y83 y83Var2 = g93.b4;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(y83Var)).equals(com.google.android.gms.ads.internal.client.zzba.zzc().b(y83Var2))) {
            i = 9;
        }
        if (i != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(y83Var)).booleanValue()) {
            ia3 ia3Var = new ia3();
            ia3Var.e(new ph8(this, ia3Var, context, uri));
            ia3Var.b((Activity) context);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(y83Var2)).booleanValue()) {
            co a = new co.a().a();
            a.a.setPackage(n08.a(context));
            a.a(context, uri);
            return 5;
        }
        return 5;
    }
}
