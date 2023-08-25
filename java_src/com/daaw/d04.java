package com.daaw;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.conscrypt.EvpMdRef;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class d04 {
    public static final Handler b = new gv6(Looper.getMainLooper());
    public static final String c = AdView.class.getName();
    public static final String d = InterstitialAd.class.getName();
    public static final String e = AdManagerAdView.class.getName();
    public static final String f = AdManagerInterstitialAd.class.getName();
    public static final String g = SearchAdView.class.getName();
    public static final String h = AdLoader.class.getName();
    public float a = -1.0f;

    public static final boolean A() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final int B(DisplayMetrics displayMetrics, int i) {
        return Math.round(i / displayMetrics.density);
    }

    public static final void C(Context context, String str, String str2, Bundle bundle, boolean z, c04 c04Var) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            str = x70.f().a(context) + ".224400000";
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        c04Var.zza(appendQueryParameter.toString());
    }

    public static final int D(Context context, int i) {
        return v(context.getResources().getDisplayMetrics(), i);
    }

    public static final String E(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        return a(((contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id")) == null || x()) ? "emulator" : "emulator", EvpMdRef.MD5.JCA_NAME);
    }

    public static String a(String str, String str2) {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    public static final void e(ViewGroup viewGroup, zzq zzqVar, String str, int i, int i2) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i);
        textView.setBackgroundColor(i2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i);
        int D = D(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(zzqVar.zzf - D, zzqVar.zzc - D, 17));
        viewGroup.addView(frameLayout, zzqVar.zzf, zzqVar.zzc);
    }

    public static int f(Context context, int i) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i2 = configuration.orientation;
        if (i == 0) {
            i = i2;
        }
        return Math.round((i == i2 ? displayMetrics.heightPixels : displayMetrics.widthPixels) / displayMetrics.density);
    }

    public static AdSize h(Context context, int i, int i2, int i3) {
        float f2;
        float f3;
        int i4;
        int f4 = f(context, i3);
        if (f4 == -1) {
            return AdSize.INVALID;
        }
        int min = Math.min(90, Math.round(f4 * 0.15f));
        if (i <= 655) {
            if (i > 632) {
                i4 = 81;
            } else if (i > 526) {
                f2 = i / 468.0f;
                f3 = 60.0f;
            } else if (i > 432) {
                i4 = 68;
            } else {
                f2 = i / 320.0f;
                f3 = 50.0f;
            }
            return new AdSize(i, Math.max(Math.min(i4, min), 50));
        }
        f2 = i / 728.0f;
        f3 = 90.0f;
        i4 = Math.round(f2 * f3);
        return new AdSize(i, Math.max(Math.min(i4, min), 50));
    }

    public static String i() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(EvpMdRef.MD5.JCA_NAME);
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    public static String j(String str) {
        return a(str, EvpMdRef.MD5.JCA_NAME);
    }

    public static String k(String str) {
        return a(str, EvpMdRef.SHA256.JCA_NAME);
    }

    public static Throwable l(Throwable th) {
        if (((Boolean) nb3.f.e()).booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (u(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (TextUtils.isEmpty(className) || (!className.startsWith("android.") && !className.startsWith("java."))) {
                        stackTraceElement = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
                    }
                    arrayList.add(stackTraceElement);
                }
            }
            if (z) {
                th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    public static boolean u(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) nb3.d.e());
    }

    public static final int v(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, i, displayMetrics);
    }

    public static final String w(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        int i2;
        String str2;
        while (true) {
            i2 = i + 1;
            if (i2 >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            String className = stackTraceElement.getClassName();
            i = ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (c.equalsIgnoreCase(className) || d.equalsIgnoreCase(className) || e.equalsIgnoreCase(className) || f.equalsIgnoreCase(className) || g.equalsIgnoreCase(className) || h.equalsIgnoreCase(className))) ? 0 : i2;
        }
        str2 = stackTraceElementArr[i2].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                int i3 = 2;
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0 || !stringTokenizer.hasMoreElements()) {
                        break;
                    }
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                    i3 = i4;
                }
                str = sb.toString();
            }
            if (str2 != null && !str2.contains(str)) {
                return str2;
            }
        }
        return null;
    }

    public static final boolean x() {
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.FINGERPRINT;
            return str.contains("generic") || str.contains("emulator");
        }
        return Build.DEVICE.startsWith("generic");
    }

    public static final boolean y(Context context, int i) {
        return x70.f().h(context, i) == 0;
    }

    public static final boolean z(Context context) {
        int h2 = x70.f().h(context, c80.a);
        return h2 == 0 || h2 == 2;
    }

    public final JSONArray b(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : collection) {
            c(jSONArray, obj);
        }
        return jSONArray;
    }

    public final void c(JSONArray jSONArray, Object obj) {
        Object m;
        if (obj instanceof Bundle) {
            m = n((Bundle) obj);
        } else if (obj instanceof Map) {
            m = o((Map) obj);
        } else if (obj instanceof Collection) {
            m = b((Collection) obj);
        } else if (!(obj instanceof Object[])) {
            jSONArray.put(obj);
            return;
        } else {
            m = m((Object[]) obj);
        }
        jSONArray.put(m);
    }

    public final void d(JSONObject jSONObject, String str, Object obj) {
        Boolean[] boolArr;
        Object m;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        Collection asList;
        if (((Boolean) zzba.zzc().b(g93.r)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            m = n((Bundle) obj);
        } else if (obj instanceof Map) {
            m = o((Map) obj);
        } else {
            if (obj instanceof Collection) {
                str = String.valueOf(str);
                asList = (Collection) obj;
            } else if (obj instanceof Object[]) {
                asList = Arrays.asList((Object[]) obj);
            } else {
                int i = 0;
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    if (iArr == null) {
                        numArr = new Integer[0];
                    } else {
                        int length = iArr.length;
                        Integer[] numArr2 = new Integer[length];
                        while (i < length) {
                            numArr2[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                        numArr = numArr2;
                    }
                    m = m(numArr);
                } else if (obj instanceof double[]) {
                    double[] dArr2 = (double[]) obj;
                    if (dArr2 == null) {
                        dArr = new Double[0];
                    } else {
                        int length2 = dArr2.length;
                        Double[] dArr3 = new Double[length2];
                        while (i < length2) {
                            dArr3[i] = Double.valueOf(dArr2[i]);
                            i++;
                        }
                        dArr = dArr3;
                    }
                    m = m(dArr);
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    if (jArr == null) {
                        lArr = new Long[0];
                    } else {
                        int length3 = jArr.length;
                        Long[] lArr2 = new Long[length3];
                        while (i < length3) {
                            lArr2[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                        lArr = lArr2;
                    }
                    m = m(lArr);
                } else if (!(obj instanceof boolean[])) {
                    jSONObject.put(str, obj);
                    return;
                } else {
                    boolean[] zArr = (boolean[]) obj;
                    if (zArr == null) {
                        boolArr = new Boolean[0];
                    } else {
                        int length4 = zArr.length;
                        Boolean[] boolArr2 = new Boolean[length4];
                        while (i < length4) {
                            boolArr2[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                        boolArr = boolArr2;
                    }
                    m = m(boolArr);
                }
            }
            m = b(asList);
        }
        jSONObject.put(str, m);
    }

    public final int g(Context context, int i) {
        if (this.a < 0.0f) {
            synchronized (this) {
                if (this.a < 0.0f) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.a = displayMetrics.density;
                }
            }
        }
        return Math.round(i / this.a);
    }

    public final JSONArray m(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            c(jSONArray, obj);
        }
        return jSONArray;
    }

    public final JSONObject n(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            d(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject o(Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                d(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e2) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e2.getMessage())));
        }
    }

    public final JSONObject p(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return n(bundle);
            } catch (JSONException e2) {
                k04.zzh("Error converting Bundle to JSON", e2);
                return null;
            }
        }
        return null;
    }

    public final void q(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject2.get(next);
            try {
                Object obj2 = jSONObject.get(next);
                if (JSONObject.class.isInstance(obj2) && JSONObject.class.isInstance(obj)) {
                    q((JSONObject) obj2, (JSONObject) obj);
                }
            } catch (JSONException unused) {
                jSONObject.put(next, obj);
            }
        }
    }

    public final void r(ViewGroup viewGroup, zzq zzqVar, String str, String str2) {
        if (str2 != null) {
            k04.zzj(str2);
        }
        e(viewGroup, zzqVar, str, -65536, -16777216);
    }

    public final void s(ViewGroup viewGroup, zzq zzqVar, String str) {
        e(viewGroup, zzqVar, "Ads by Google", -16777216, -1);
    }

    public final void t(Context context, String str, String str2, Bundle bundle, boolean z) {
        C(context, str, "gmob-apps", bundle, true, new c04() { // from class: com.daaw.a04
            @Override // com.daaw.c04
            public final boolean zza(String str3) {
                new b04(d04.this, str3).start();
                return true;
            }
        });
    }
}
