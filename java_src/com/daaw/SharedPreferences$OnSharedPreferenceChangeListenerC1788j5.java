package com.daaw;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.preference.PreferenceManager;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* renamed from: com.daaw.j5 */
/* loaded from: classes.dex */
public class SharedPreferences$OnSharedPreferenceChangeListenerC1788j5 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    public AtomicIntegerArray f14336a = new AtomicIntegerArray(f14269E - f14309m);

    /* renamed from: b */
    public AtomicIntegerArray f14337b = new AtomicIntegerArray(f14289Y - f14270F);

    /* renamed from: c */
    public AtomicReferenceArray<String> f14338c = new AtomicReferenceArray<>(f14334y0 - f14290Z);

    /* renamed from: d */
    public String f14339d = null;

    /* renamed from: e */
    public String f14340e = null;

    /* renamed from: f */
    public boolean f14341f = false;

    /* renamed from: g */
    public static sw1<Integer, Integer, Boolean> f14297g = new sw1<>();

    /* renamed from: h */
    public static rw1<Integer, Boolean> f14299h = new rw1<>();

    /* renamed from: i */
    public static sw1<Integer, String, Boolean> f14301i = new sw1<>();

    /* renamed from: j */
    public static rw1<String, SharedPreferences$OnSharedPreferenceChangeListenerC1788j5> f14303j = new rw1<>();

    /* renamed from: k */
    public static final Object f14305k = new Object();

    /* renamed from: l */
    public static SharedPreferences$OnSharedPreferenceChangeListenerC1788j5 f14307l = null;

    /* renamed from: m */
    public static int f14309m = 1000;

    /* renamed from: n */
    public static int f14311n = 1000;

    /* renamed from: o */
    public static int f14313o = 1000 + 1;

    /* renamed from: p */
    public static int f14315p = 1000 + 2;

    /* renamed from: q */
    public static int f14317q = 1000 + 3;

    /* renamed from: r */
    public static int f14319r = 1000 + 4;

    /* renamed from: s */
    public static int f14321s = 1000 + 5;

    /* renamed from: t */
    public static int f14323t = 1000 + 6;

    /* renamed from: u */
    public static int f14325u = 1000 + 7;

    /* renamed from: v */
    public static int f14327v = 1000 + 8;

    /* renamed from: w */
    public static int f14329w = 1000 + 9;

    /* renamed from: x */
    public static int f14331x = 1000 + 10;

    /* renamed from: y */
    public static int f14333y = 1000 + 11;

    /* renamed from: z */
    public static int f14335z = 1000 + 12;

    /* renamed from: A */
    public static int f14265A = 1000 + 13;

    /* renamed from: B */
    public static int f14266B = 1000 + 14;

    /* renamed from: C */
    public static int f14267C = 1000 + 15;

    /* renamed from: D */
    public static int f14268D = 1000 + 16;

    /* renamed from: E */
    public static int f14269E = 1000 + 17;

    /* renamed from: F */
    public static int f14270F = 2000;

    /* renamed from: G */
    public static int f14271G = 2000;

    /* renamed from: H */
    public static int f14272H = 2000 + 1;

    /* renamed from: I */
    public static int f14273I = 2000 + 2;

    /* renamed from: J */
    public static int f14274J = 2000 + 3;

    /* renamed from: K */
    public static int f14275K = 2000 + 4;

    /* renamed from: L */
    public static int f14276L = 2000 + 5;

    /* renamed from: M */
    public static int f14277M = 2000 + 6;

    /* renamed from: N */
    public static int f14278N = 2000 + 7;

    /* renamed from: O */
    public static int f14279O = 2000 + 8;

    /* renamed from: P */
    public static int f14280P = 2000 + 9;

    /* renamed from: Q */
    public static int f14281Q = 2000 + 10;

    /* renamed from: R */
    public static int f14282R = 2000 + 11;

    /* renamed from: S */
    public static int f14283S = 2000 + 12;

    /* renamed from: T */
    public static int f14284T = 2000 + 13;

    /* renamed from: U */
    public static int f14285U = 2000 + 14;

    /* renamed from: V */
    public static int f14286V = 2000 + 15;

    /* renamed from: W */
    public static int f14287W = 2000 + 16;

    /* renamed from: X */
    public static int f14288X = 2000 + 17;

    /* renamed from: Y */
    public static int f14289Y = 2000 + 18;

    /* renamed from: Z */
    public static int f14290Z = 3000;

    /* renamed from: a0 */
    public static int f14291a0 = 3000;

    /* renamed from: b0 */
    public static int f14292b0 = 3000 + 1;

    /* renamed from: c0 */
    public static int f14293c0 = 3000 + 2;

    /* renamed from: d0 */
    public static int f14294d0 = 3000 + 3;

    /* renamed from: e0 */
    public static int f14295e0 = 3000 + 4;

    /* renamed from: f0 */
    public static int f14296f0 = 3000 + 5;

    /* renamed from: g0 */
    public static int f14298g0 = 3000 + 6;

    /* renamed from: h0 */
    public static int f14300h0 = 3000 + 7;

    /* renamed from: i0 */
    public static int f14302i0 = 3000 + 8;

    /* renamed from: j0 */
    public static int f14304j0 = 3000 + 9;

    /* renamed from: k0 */
    public static int f14306k0 = 3000 + 10;

    /* renamed from: l0 */
    public static int f14308l0 = 3000 + 11;

    /* renamed from: m0 */
    public static int f14310m0 = 3000 + 12;

    /* renamed from: n0 */
    public static int f14312n0 = 3000 + 13;

    /* renamed from: o0 */
    public static int f14314o0 = 3000 + 14;

    /* renamed from: p0 */
    public static int f14316p0 = 3000 + 15;

    /* renamed from: q0 */
    public static int f14318q0 = 3000 + 16;

    /* renamed from: r0 */
    public static int f14320r0 = 3000 + 17;

    /* renamed from: s0 */
    public static int f14322s0 = 3000 + 18;

    /* renamed from: t0 */
    public static int f14324t0 = 3000 + x21.f31779E0;

    /* renamed from: u0 */
    public static int f14326u0 = 3000 + x21.f31784F0;

    /* renamed from: v0 */
    public static int f14328v0 = 3000 + 220;

    /* renamed from: w0 */
    public static int f14330w0 = 3000 + 221;

    /* renamed from: x0 */
    public static int f14332x0 = 3000 + 222;

    /* renamed from: y0 */
    public static int f14334y0 = 3000 + 223;

    public SharedPreferences$OnSharedPreferenceChangeListenerC1788j5() {
        m18933b0(f14311n, false);
        m18933b0(f14313o, false);
        m18933b0(f14315p, true);
        m18933b0(f14317q, true);
        m18933b0(f14319r, false);
        m18933b0(f14321s, true);
        m18933b0(f14323t, true);
        m18933b0(f14325u, true);
        m18933b0(f14327v, true);
        m18933b0(f14329w, true);
        m18933b0(f14331x, true);
        m18933b0(f14333y, true);
        m18933b0(f14265A, true);
        m18933b0(f14266B, false);
        m18933b0(f14268D, false);
        m18933b0(f14267C, false);
        m18927e0(f14271G, 0);
        m18927e0(f14272H, 1);
        m18927e0(f14273I, 14);
        m18927e0(f14274J, 0);
        m18927e0(f14275K, 1);
        m18927e0(f14276L, 1);
        m18927e0(f14277M, 8);
        m18927e0(f14278N, 0);
        m18927e0(f14279O, 0);
        m18927e0(f14280P, -1000);
        m18927e0(f14281Q, -1);
        m18927e0(f14282R, 0);
        m18927e0(f14283S, 0);
        m18927e0(f14284T, 0);
        m18927e0(f14285U, 0);
        m18927e0(f14286V, 1);
        m18927e0(f14287W, 10);
        m18927e0(f14288X, 0);
        m18919i0(f14291a0, "");
        m18919i0(f14310m0, "");
        m18919i0(f14328v0, "");
        m18919i0(f14330w0, "");
        m18919i0(f14332x0, "");
    }

    /* renamed from: L */
    public static boolean m18951L(SharedPreferences sharedPreferences, String str, boolean z) {
        try {
            return sharedPreferences.getBoolean(str, z);
        } catch (Exception unused) {
            return z;
        }
    }

    /* renamed from: M */
    public static int m18950M(SharedPreferences sharedPreferences, String str, int i) {
        try {
            return sharedPreferences.getInt(str, i);
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: N */
    public static long m18949N(SharedPreferences sharedPreferences, String str, long j) {
        try {
            return sharedPreferences.getLong(str, j);
        } catch (Exception unused) {
            return j;
        }
    }

    /* renamed from: P */
    public static String m18947P(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            return sharedPreferences.getString(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    /* renamed from: R */
    public static void m18945R(SharedPreferences sharedPreferences, String str, boolean z) {
        try {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(str, z);
            edit.apply();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static File m18936a(int i) {
        return C2247n5.m15523a("visualizer" + i);
    }

    /* renamed from: b */
    public static File m18934b(File file, InputStream inputStream, String str) {
        File m25078b;
        if (inputStream == null || (m25078b = cr1.m25078b(file, str)) == null) {
            return null;
        }
        try {
            cr1.m25079a(inputStream, m25078b);
            return m25078b;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static SharedPreferences$OnSharedPreferenceChangeListenerC1788j5 m18928e() {
        SharedPreferences$OnSharedPreferenceChangeListenerC1788j5 sharedPreferences$OnSharedPreferenceChangeListenerC1788j5;
        SharedPreferences$OnSharedPreferenceChangeListenerC1788j5 sharedPreferences$OnSharedPreferenceChangeListenerC1788j52 = f14307l;
        if (sharedPreferences$OnSharedPreferenceChangeListenerC1788j52 != null) {
            return sharedPreferences$OnSharedPreferenceChangeListenerC1788j52;
        }
        synchronized (f14305k) {
            if (f14307l == null) {
                f14307l = new SharedPreferences$OnSharedPreferenceChangeListenerC1788j5();
            }
            sharedPreferences$OnSharedPreferenceChangeListenerC1788j5 = f14307l;
        }
        return sharedPreferences$OnSharedPreferenceChangeListenerC1788j5;
    }

    /* renamed from: g */
    public static int m18924g(String str) {
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* renamed from: j0 */
    public static int m18917j0(int i) {
        if (i >= 0) {
            int i2 = f14324t0;
            int i3 = f14322s0;
            if (i <= i2 - i3) {
                return i + i3;
            }
            return -1;
        }
        return -1;
    }

    @TargetApi(24)
    /* renamed from: u */
    public static File m18905u(StorageVolume storageVolume) {
        try {
            Field declaredField = StorageVolume.class.getDeclaredField("mPath");
            declaredField.setAccessible(true);
            return (File) declaredField.get(storageVolume);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: A */
    public void m18962A(SharedPreferences sharedPreferences) {
        m18935a0(f14265A, m18951L(sharedPreferences, "pref_visualizerGlobalSession", true));
    }

    /* renamed from: B */
    public final void m18961B(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        m18900z(defaultSharedPreferences);
        m18962A(defaultSharedPreferences);
        m18902x(defaultSharedPreferences);
        m18901y(defaultSharedPreferences);
    }

    /* renamed from: C */
    public void m18960C(String str, String str2, Context context) {
        if (str.contains(";") || str.contains(":") || str2.contains(";") || str2.contains(":")) {
            return;
        }
        SharedPreferences m18910p = m18910p(context);
        List<String> m23251b = er1.m23251b(";", m18920i(m18910p));
        String str3 = str + ":" + str2;
        SharedPreferences.Editor edit = m18910p.edit();
        edit.putString("libFolders", er1.m23245h(";", m23251b, str3, true));
        edit.apply();
    }

    /* renamed from: D */
    public void m18959D(String str, Context context) {
        String str2;
        er0<String, String> m18956G = m18956G(context);
        Random random = new Random();
        int i = 0;
        do {
            i++;
            str2 = "" + random.nextInt(1000000);
            if (!m18956G.m23272j(str2)) {
                break;
            }
        } while (i < 1000000);
        m18960C(str2, str, context);
    }

    /* renamed from: E */
    public void m18958E(Context context, String str, boolean z) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str);
        m18957F(context, arrayList, z);
    }

    /* renamed from: F */
    public void m18957F(Context context, List<String> list, boolean z) {
        String str;
        er0<String, String> m18955H = m18955H(context);
        ArrayList arrayList = new ArrayList();
        Random random = new Random();
        for (String str2 : list) {
            if (!z || !m18955H.m23271k(str2)) {
                do {
                    str = "" + random.nextInt(1000000);
                } while (m18955H.m23272j(str));
                if (!str.contains(";") && !str.contains(":") && !str2.contains(";") && !str2.contains(":")) {
                    arrayList.add(str + ":" + str2);
                }
            }
        }
        m18942U(arrayList, context, "libStandalonePlaylists");
    }

    /* renamed from: G */
    public er0<String, String> m18956G(Context context) {
        SharedPreferences m18910p = m18910p(context);
        List<String> m23251b = er1.m23251b(";", m18908r() + m18920i(m18910p));
        er0<String, String> er0Var = new er0<>(m23251b.size());
        for (String str : m23251b) {
            int indexOf = str.indexOf(":");
            if (indexOf >= 0) {
                er0Var.add(new lo1<>(str.substring(0, indexOf), str.substring(indexOf + 1)));
            }
        }
        return er0Var;
    }

    /* renamed from: H */
    public er0<String, String> m18955H(Context context) {
        List<String> m23251b = er1.m23251b(";", m18947P(m18910p(context), "libStandalonePlaylists", ""));
        er0<String, String> er0Var = new er0<>(m23251b.size());
        for (String str : m23251b) {
            int indexOf = str.indexOf(":");
            if (indexOf >= 0) {
                String substring = str.substring(0, indexOf);
                String substring2 = str.substring(indexOf + 1);
                if (cr1.m25067m(substring2)) {
                    er0Var.add(new lo1<>(substring, substring2));
                }
            }
        }
        return er0Var;
    }

    /* renamed from: I */
    public void m18954I(String str, String str2, Context context) {
        SharedPreferences m18910p = m18910p(context);
        List<String> m23251b = er1.m23251b(";", m18920i(m18910p));
        String str3 = str + ":" + str2;
        SharedPreferences.Editor edit = m18910p.edit();
        edit.putString("libFolders", er1.m23244i(";", m23251b, str3, true));
        edit.apply();
    }

    /* renamed from: J */
    public void m18953J(String str, String str2, Context context) {
        SharedPreferences m18910p = m18910p(context);
        List<String> m23251b = er1.m23251b(";", m18947P(m18910p, "libStandalonePlaylists", ""));
        String str3 = str + ":" + str2;
        SharedPreferences.Editor edit = m18910p.edit();
        edit.putString("libStandalonePlaylists", er1.m23244i(";", m23251b, str3, true));
        edit.apply();
    }

    /* renamed from: K */
    public boolean m18952K(Context context, String str, boolean z) {
        return m18951L(m18910p(context), str, z);
    }

    /* renamed from: O */
    public String m18948O(Context context, String str, String str2) {
        return m18947P(m18910p(context), str, str2);
    }

    /* renamed from: Q */
    public void m18946Q(Context context, String str, boolean z) {
        m18945R(m18910p(context), str, z);
    }

    /* renamed from: S */
    public void m18944S() {
        m18935a0(f14323t, true);
    }

    /* renamed from: T */
    public void m18943T(Context context) {
        if (this.f14341f) {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
            for (int i = 0; i < this.f14336a.length(); i++) {
                boolean z = this.f14336a.get(i) != 0;
                edit.putBoolean("bool" + i, z);
            }
            for (int i2 = 0; i2 < this.f14337b.length(); i2++) {
                int i3 = this.f14337b.get(i2);
                edit.putInt("int" + i2, i3);
            }
            for (int i4 = 0; i4 < this.f14338c.length(); i4++) {
                edit.putString("string" + i4, this.f14338c.get(i4));
            }
            m18938Y(edit);
            m18937Z(edit);
            m18939X(edit);
            edit.apply();
        }
    }

    /* renamed from: U */
    public void m18942U(List<String> list, Context context, String str) {
        SharedPreferences m18910p = m18910p(context);
        List<String> m23251b = er1.m23251b(";", m18947P(m18910p, str, ""));
        SharedPreferences.Editor edit = m18910p.edit();
        edit.putString(str, er1.m23246g(";", m23251b, list, true));
        edit.apply();
    }

    /* renamed from: V */
    public final void m18941V(int i, String str, boolean z) {
        int m18917j0 = m18917j0(i);
        if (m18917j0 < 0) {
            lz1.m16363c("invalid _identifier");
        } else if (str == null) {
            m18921h0(m18917j0, "", z);
        } else {
            m18921h0(m18917j0, str, z);
        }
    }

    /* renamed from: W */
    public void m18940W(int i, C3355vn c3355vn, boolean z) {
        m18941V(i, c3355vn != null ? c3355vn.m7005o() : null, z);
    }

    /* renamed from: X */
    public void m18939X(SharedPreferences.Editor editor) {
        editor.putString("pref_audioVisOffset", "" + m18916k(f14287W));
    }

    /* renamed from: Y */
    public void m18938Y(SharedPreferences.Editor editor) {
        editor.putBoolean("pref_visControlsTimeout", m18922h(f14311n));
    }

    /* renamed from: Z */
    public void m18937Z(SharedPreferences.Editor editor) {
        editor.putBoolean("pref_visualizerGlobalSession", m18922h(f14265A));
    }

    /* renamed from: a0 */
    public void m18935a0(int i, boolean z) {
        if (z != (this.f14336a.getAndSet(i - f14309m, z ? 1 : 0) != 0)) {
            f14299h.m10862a(Integer.valueOf(i), Boolean.valueOf(z));
        }
    }

    /* renamed from: b0 */
    public void m18933b0(int i, boolean z) {
        this.f14336a.set(i - f14309m, z ? 1 : 0);
    }

    /* renamed from: c */
    public void m18932c() {
        StringBuilder sb = new StringBuilder();
        Context m23837e = dx0.m23837e();
        if (m23837e == null || Build.VERSION.SDK_INT < 24) {
            try {
                String m24292b = C1100dl.m24292b();
                if (!m24292b.isEmpty()) {
                    sb.append("-03");
                    sb.append(":");
                    sb.append(m24292b);
                    sb.append(";");
                }
            } catch (Exception unused) {
            }
            if (m23837e != null) {
                try {
                    String m24290d = C1100dl.m24290d(m23837e);
                    if (!m24290d.isEmpty()) {
                        sb.append("-02");
                        sb.append(":");
                        sb.append(m24290d);
                        sb.append(";");
                    }
                } catch (Exception unused2) {
                }
            }
        } else {
            Iterator<String> it = m18907s(m23837e).iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(";");
            }
        }
        this.f14340e = sb.toString();
    }

    /* renamed from: c0 */
    public void m18931c0(int i, int i2) {
        m18929d0(i, i2, false);
    }

    /* renamed from: d */
    public void m18930d() {
        this.f14340e = null;
    }

    /* renamed from: d0 */
    public void m18929d0(int i, int i2, boolean z) {
        int andSet = this.f14337b.getAndSet(i - f14270F, i2);
        if (z || i2 != andSet) {
            f14297g.m9795a(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
        }
    }

    /* renamed from: e0 */
    public void m18927e0(int i, int i2) {
        this.f14337b.set(i - f14270F, i2);
    }

    /* renamed from: f */
    public final String m18926f(String str) {
        String[] split;
        m18908r();
        for (String str2 : this.f14340e.split(";")) {
            if (str2.startsWith(str)) {
                int indexOf = str2.indexOf(58) + 1;
                int indexOf2 = str2.indexOf(":", indexOf);
                if (indexOf2 == -1) {
                    indexOf2 = str2.length() - 1;
                }
                return str2.substring(indexOf, indexOf2);
            }
        }
        return null;
    }

    /* renamed from: f0 */
    public void m18925f0(List<Integer> list) {
        m18923g0(f14326u0, er1.m23248e(";", list));
    }

    /* renamed from: g0 */
    public void m18923g0(int i, String str) {
        m18921h0(i, str, false);
    }

    /* renamed from: h */
    public boolean m18922h(int i) {
        return this.f14336a.get(i - f14309m) != 0;
    }

    /* renamed from: h0 */
    public void m18921h0(int i, String str, boolean z) {
        String andSet = this.f14338c.getAndSet(i - f14290Z, str);
        if (z || !br1.m25902g(andSet, str)) {
            f14301i.m9795a(Integer.valueOf(i), str, Boolean.valueOf(z));
        }
    }

    /* renamed from: i */
    public String m18920i(SharedPreferences sharedPreferences) {
        String[] split;
        String m18947P = m18947P(sharedPreferences, "libFolders", "");
        if (m18947P.isEmpty()) {
            return m18918j();
        }
        if (m18947P.split("-0\\d:").length < 2) {
            return m18947P;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : m18947P.split(";")) {
            if (!str.startsWith("-")) {
                arrayList.add(str);
            }
        }
        String m23247f = er1.m23247f(";", arrayList);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("libFolders", m23247f);
        edit.apply();
        return m23247f;
    }

    /* renamed from: i0 */
    public void m18919i0(int i, String str) {
        this.f14338c.set(i - f14290Z, str);
    }

    /* renamed from: j */
    public String m18918j() {
        if (this.f14339d == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("001:");
            sb.append("/storage");
            sb.append(";");
            try {
                sb.append("002:");
                sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getCanonicalPath());
                sb.append(";");
            } catch (IOException unused) {
            }
            try {
                sb.append("003:");
                sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getCanonicalPath());
                sb.append(";");
            } catch (IOException unused2) {
            }
            try {
                sb.append("004:");
                sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getCanonicalPath());
                sb.append(";");
            } catch (IOException unused3) {
            }
            try {
                sb.append("005:");
                sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getCanonicalPath());
            } catch (IOException unused4) {
            }
            this.f14339d = sb.toString();
        }
        return this.f14339d;
    }

    /* renamed from: k */
    public int m18916k(int i) {
        return this.f14337b.get(i - f14270F);
    }

    /* renamed from: k0 */
    public void m18915k0(int i) {
        m18935a0(i, this.f14336a.get(i - f14309m) == 0);
    }

    /* renamed from: l */
    public String m18914l() {
        return m18926f("-03");
    }

    /* renamed from: m */
    public final String m18913m(int i) {
        int m18917j0 = m18917j0(i);
        if (m18917j0 < 0) {
            lz1.m16363c("invalid _identifier");
            return null;
        }
        String m18906t = m18906t(m18917j0);
        if (C0970cn.m25228d(m18906t)) {
            m18906t = C0970cn.m25231a(m18906t);
        }
        if (m18906t == null || m18906t.length() <= 0) {
            return null;
        }
        return m18906t;
    }

    /* renamed from: n */
    public C3355vn m18912n(int i, int[] iArr) {
        String m18913m = m18913m(i);
        if (iArr != null) {
            iArr[0] = m18924g(null);
        }
        if (m18913m == null) {
            return null;
        }
        if (iArr != null) {
            iArr[0] = m18924g(m18913m);
        }
        return C3355vn.m7013g(m18913m);
    }

    /* renamed from: o */
    public List<Integer> m18911o() {
        List<String> m23251b = er1.m23251b(";", m18906t(f14326u0));
        ArrayList arrayList = new ArrayList(m23251b.size());
        for (String str : m23251b) {
            int m25885x = br1.m25885x(str, -1);
            if (m25885x >= 0) {
                arrayList.add(Integer.valueOf(m25885x));
            }
        }
        return arrayList;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str != null) {
            char c = 65535;
            switch (str.hashCode()) {
                case -546842823:
                    if (str.equals("pref_audioVisOffset")) {
                        c = 0;
                        break;
                    }
                    break;
                case -373283545:
                    if (str.equals("pref_visControlsTimeout")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1792058231:
                    if (str.equals("pref_disableHeaderAds")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2099578649:
                    if (str.equals("pref_visualizerGlobalSession")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m18902x(sharedPreferences);
                    break;
                case 1:
                    m18900z(sharedPreferences);
                    break;
                case 2:
                    m18901y(sharedPreferences);
                    break;
                case 3:
                    m18962A(sharedPreferences);
                    break;
            }
        }
        f14303j.m10862a(str, this);
    }

    /* renamed from: p */
    public SharedPreferences m18910p(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    /* renamed from: q */
    public String m18909q() {
        return m18926f("-02");
    }

    /* renamed from: r */
    public String m18908r() {
        if (this.f14340e == null) {
            m18932c();
        }
        return this.f14340e;
    }

    @TargetApi(24)
    /* renamed from: s */
    public synchronized ArrayList<String> m18907s(Context context) {
        ArrayList<String> arrayList;
        String str;
        arrayList = new ArrayList<>();
        int i = 0;
        for (StorageVolume storageVolume : ((StorageManager) context.getSystemService(StorageManager.class)).getStorageVolumes()) {
            if (storageVolume.getState().equalsIgnoreCase("mounted") || storageVolume.getState().equalsIgnoreCase("mounted_ro")) {
                File m18905u = m18905u(storageVolume);
                String description = storageVolume.getDescription(context);
                if (!storageVolume.isPrimary() && !"Internal shared storage".equalsIgnoreCase(description)) {
                    if (storageVolume.isRemovable()) {
                        if (!description.toUpperCase().contains("USB") && !m18905u.getPath().toUpperCase().contains("USB")) {
                            str = "-02" + i;
                        }
                        str = "-01";
                    } else {
                        str = description;
                    }
                    arrayList.add(str + ":" + m18905u + ":" + description);
                    i++;
                }
                str = "-03";
                arrayList.add(str + ":" + m18905u + ":" + description);
                i++;
            }
        }
        return arrayList;
    }

    /* renamed from: t */
    public String m18906t(int i) {
        return this.f14338c.get(i - f14290Z);
    }

    /* renamed from: v */
    public boolean m18904v() {
        return m18909q() != null;
    }

    /* renamed from: w */
    public void m18903w(Context context) {
        if (this.f14341f) {
            return;
        }
        this.f14341f = true;
        m18961B(context);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        for (int i = 0; i < this.f14336a.length(); i++) {
            try {
                m18935a0(f14309m + i, m18951L(defaultSharedPreferences, "bool" + i, this.f14336a.get(i) != 0));
            } catch (Exception unused) {
            }
        }
        for (int i2 = 0; i2 < this.f14337b.length(); i2++) {
            try {
                m18931c0(f14270F + i2, m18950M(defaultSharedPreferences, "int" + i2, this.f14337b.get(i2)));
            } catch (Exception unused2) {
            }
        }
        for (int i3 = 0; i3 < this.f14338c.length(); i3++) {
            try {
                m18923g0(f14290Z + i3, m18947P(defaultSharedPreferences, "string" + i3, this.f14338c.get(i3)));
            } catch (Exception unused3) {
            }
        }
    }

    /* renamed from: x */
    public void m18902x(SharedPreferences sharedPreferences) {
        m18931c0(f14287W, br1.m25886w(m18947P(sharedPreferences, "pref_audioVisOffset", "0")));
    }

    /* renamed from: y */
    public void m18901y(SharedPreferences sharedPreferences) {
        m18935a0(f14267C, m18951L(sharedPreferences, "pref_disableHeaderAds", false));
    }

    /* renamed from: z */
    public void m18900z(SharedPreferences sharedPreferences) {
        m18935a0(f14311n, m18951L(sharedPreferences, "pref_visControlsTimeout", false));
    }
}
