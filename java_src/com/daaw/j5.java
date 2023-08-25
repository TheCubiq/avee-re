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
/* loaded from: classes.dex */
public class j5 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public AtomicIntegerArray a = new AtomicIntegerArray(E - m);
    public AtomicIntegerArray b = new AtomicIntegerArray(Y - F);
    public AtomicReferenceArray<String> c = new AtomicReferenceArray<>(y0 - Z);
    public String d = null;
    public String e = null;
    public boolean f = false;
    public static sw1<Integer, Integer, Boolean> g = new sw1<>();
    public static rw1<Integer, Boolean> h = new rw1<>();
    public static sw1<Integer, String, Boolean> i = new sw1<>();
    public static rw1<String, j5> j = new rw1<>();
    public static final Object k = new Object();
    public static j5 l = null;
    public static int m = 1000;
    public static int n = 1000;
    public static int o = 1000 + 1;
    public static int p = 1000 + 2;
    public static int q = 1000 + 3;
    public static int r = 1000 + 4;
    public static int s = 1000 + 5;
    public static int t = 1000 + 6;
    public static int u = 1000 + 7;
    public static int v = 1000 + 8;
    public static int w = 1000 + 9;
    public static int x = 1000 + 10;
    public static int y = 1000 + 11;
    public static int z = 1000 + 12;
    public static int A = 1000 + 13;
    public static int B = 1000 + 14;
    public static int C = 1000 + 15;
    public static int D = 1000 + 16;
    public static int E = 1000 + 17;
    public static int F = 2000;
    public static int G = 2000;
    public static int H = 2000 + 1;
    public static int I = 2000 + 2;
    public static int J = 2000 + 3;
    public static int K = 2000 + 4;
    public static int L = 2000 + 5;
    public static int M = 2000 + 6;
    public static int N = 2000 + 7;
    public static int O = 2000 + 8;
    public static int P = 2000 + 9;
    public static int Q = 2000 + 10;
    public static int R = 2000 + 11;
    public static int S = 2000 + 12;
    public static int T = 2000 + 13;
    public static int U = 2000 + 14;
    public static int V = 2000 + 15;
    public static int W = 2000 + 16;
    public static int X = 2000 + 17;
    public static int Y = 2000 + 18;
    public static int Z = 3000;
    public static int a0 = 3000;
    public static int b0 = 3000 + 1;
    public static int c0 = 3000 + 2;
    public static int d0 = 3000 + 3;
    public static int e0 = 3000 + 4;
    public static int f0 = 3000 + 5;
    public static int g0 = 3000 + 6;
    public static int h0 = 3000 + 7;
    public static int i0 = 3000 + 8;
    public static int j0 = 3000 + 9;
    public static int k0 = 3000 + 10;
    public static int l0 = 3000 + 11;
    public static int m0 = 3000 + 12;
    public static int n0 = 3000 + 13;
    public static int o0 = 3000 + 14;
    public static int p0 = 3000 + 15;
    public static int q0 = 3000 + 16;
    public static int r0 = 3000 + 17;
    public static int s0 = 3000 + 18;
    public static int t0 = 3000 + x21.E0;
    public static int u0 = 3000 + x21.F0;
    public static int v0 = 3000 + 220;
    public static int w0 = 3000 + 221;
    public static int x0 = 3000 + 222;
    public static int y0 = 3000 + 223;

    public j5() {
        b0(n, false);
        b0(o, false);
        b0(p, true);
        b0(q, true);
        b0(r, false);
        b0(s, true);
        b0(t, true);
        b0(u, true);
        b0(v, true);
        b0(w, true);
        b0(x, true);
        b0(y, true);
        b0(A, true);
        b0(B, false);
        b0(D, false);
        b0(C, false);
        e0(G, 0);
        e0(H, 1);
        e0(I, 14);
        e0(J, 0);
        e0(K, 1);
        e0(L, 1);
        e0(M, 8);
        e0(N, 0);
        e0(O, 0);
        e0(P, -1000);
        e0(Q, -1);
        e0(R, 0);
        e0(S, 0);
        e0(T, 0);
        e0(U, 0);
        e0(V, 1);
        e0(W, 10);
        e0(X, 0);
        i0(a0, "");
        i0(m0, "");
        i0(v0, "");
        i0(w0, "");
        i0(x0, "");
    }

    public static boolean L(SharedPreferences sharedPreferences, String str, boolean z2) {
        try {
            return sharedPreferences.getBoolean(str, z2);
        } catch (Exception unused) {
            return z2;
        }
    }

    public static int M(SharedPreferences sharedPreferences, String str, int i2) {
        try {
            return sharedPreferences.getInt(str, i2);
        } catch (Exception unused) {
            return i2;
        }
    }

    public static long N(SharedPreferences sharedPreferences, String str, long j2) {
        try {
            return sharedPreferences.getLong(str, j2);
        } catch (Exception unused) {
            return j2;
        }
    }

    public static String P(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            return sharedPreferences.getString(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    public static void R(SharedPreferences sharedPreferences, String str, boolean z2) {
        try {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(str, z2);
            edit.apply();
        } catch (Exception unused) {
        }
    }

    public static File a(int i2) {
        return n5.a("visualizer" + i2);
    }

    public static File b(File file, InputStream inputStream, String str) {
        File b;
        if (inputStream == null || (b = cr1.b(file, str)) == null) {
            return null;
        }
        try {
            cr1.a(inputStream, b);
            return b;
        } catch (IOException unused) {
            return null;
        }
    }

    public static j5 e() {
        j5 j5Var;
        j5 j5Var2 = l;
        if (j5Var2 != null) {
            return j5Var2;
        }
        synchronized (k) {
            if (l == null) {
                l = new j5();
            }
            j5Var = l;
        }
        return j5Var;
    }

    public static int g(String str) {
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public static int j0(int i2) {
        if (i2 >= 0) {
            int i3 = t0;
            int i4 = s0;
            if (i2 <= i3 - i4) {
                return i2 + i4;
            }
            return -1;
        }
        return -1;
    }

    @TargetApi(24)
    public static File u(StorageVolume storageVolume) {
        try {
            Field declaredField = StorageVolume.class.getDeclaredField("mPath");
            declaredField.setAccessible(true);
            return (File) declaredField.get(storageVolume);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void A(SharedPreferences sharedPreferences) {
        a0(A, L(sharedPreferences, "pref_visualizerGlobalSession", true));
    }

    public final void B(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        z(defaultSharedPreferences);
        A(defaultSharedPreferences);
        x(defaultSharedPreferences);
        y(defaultSharedPreferences);
    }

    public void C(String str, String str2, Context context) {
        if (str.contains(";") || str.contains(":") || str2.contains(";") || str2.contains(":")) {
            return;
        }
        SharedPreferences p2 = p(context);
        List<String> b = er1.b(";", i(p2));
        String str3 = str + ":" + str2;
        SharedPreferences.Editor edit = p2.edit();
        edit.putString("libFolders", er1.h(";", b, str3, true));
        edit.apply();
    }

    public void D(String str, Context context) {
        String str2;
        er0<String, String> G2 = G(context);
        Random random = new Random();
        int i2 = 0;
        do {
            i2++;
            str2 = "" + random.nextInt(1000000);
            if (!G2.j(str2)) {
                break;
            }
        } while (i2 < 1000000);
        C(str2, str, context);
    }

    public void E(Context context, String str, boolean z2) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str);
        F(context, arrayList, z2);
    }

    public void F(Context context, List<String> list, boolean z2) {
        String str;
        er0<String, String> H2 = H(context);
        ArrayList arrayList = new ArrayList();
        Random random = new Random();
        for (String str2 : list) {
            if (!z2 || !H2.k(str2)) {
                do {
                    str = "" + random.nextInt(1000000);
                } while (H2.j(str));
                if (!str.contains(";") && !str.contains(":") && !str2.contains(";") && !str2.contains(":")) {
                    arrayList.add(str + ":" + str2);
                }
            }
        }
        U(arrayList, context, "libStandalonePlaylists");
    }

    public er0<String, String> G(Context context) {
        SharedPreferences p2 = p(context);
        List<String> b = er1.b(";", r() + i(p2));
        er0<String, String> er0Var = new er0<>(b.size());
        for (String str : b) {
            int indexOf = str.indexOf(":");
            if (indexOf >= 0) {
                er0Var.add(new lo1<>(str.substring(0, indexOf), str.substring(indexOf + 1)));
            }
        }
        return er0Var;
    }

    public er0<String, String> H(Context context) {
        List<String> b = er1.b(";", P(p(context), "libStandalonePlaylists", ""));
        er0<String, String> er0Var = new er0<>(b.size());
        for (String str : b) {
            int indexOf = str.indexOf(":");
            if (indexOf >= 0) {
                String substring = str.substring(0, indexOf);
                String substring2 = str.substring(indexOf + 1);
                if (cr1.m(substring2)) {
                    er0Var.add(new lo1<>(substring, substring2));
                }
            }
        }
        return er0Var;
    }

    public void I(String str, String str2, Context context) {
        SharedPreferences p2 = p(context);
        List<String> b = er1.b(";", i(p2));
        String str3 = str + ":" + str2;
        SharedPreferences.Editor edit = p2.edit();
        edit.putString("libFolders", er1.i(";", b, str3, true));
        edit.apply();
    }

    public void J(String str, String str2, Context context) {
        SharedPreferences p2 = p(context);
        List<String> b = er1.b(";", P(p2, "libStandalonePlaylists", ""));
        String str3 = str + ":" + str2;
        SharedPreferences.Editor edit = p2.edit();
        edit.putString("libStandalonePlaylists", er1.i(";", b, str3, true));
        edit.apply();
    }

    public boolean K(Context context, String str, boolean z2) {
        return L(p(context), str, z2);
    }

    public String O(Context context, String str, String str2) {
        return P(p(context), str, str2);
    }

    public void Q(Context context, String str, boolean z2) {
        R(p(context), str, z2);
    }

    public void S() {
        a0(t, true);
    }

    public void T(Context context) {
        if (this.f) {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
            for (int i2 = 0; i2 < this.a.length(); i2++) {
                boolean z2 = this.a.get(i2) != 0;
                edit.putBoolean("bool" + i2, z2);
            }
            for (int i3 = 0; i3 < this.b.length(); i3++) {
                int i4 = this.b.get(i3);
                edit.putInt("int" + i3, i4);
            }
            for (int i5 = 0; i5 < this.c.length(); i5++) {
                edit.putString("string" + i5, this.c.get(i5));
            }
            Y(edit);
            Z(edit);
            X(edit);
            edit.apply();
        }
    }

    public void U(List<String> list, Context context, String str) {
        SharedPreferences p2 = p(context);
        List<String> b = er1.b(";", P(p2, str, ""));
        SharedPreferences.Editor edit = p2.edit();
        edit.putString(str, er1.g(";", b, list, true));
        edit.apply();
    }

    public final void V(int i2, String str, boolean z2) {
        int j02 = j0(i2);
        if (j02 < 0) {
            lz1.c("invalid _identifier");
        } else if (str == null) {
            h0(j02, "", z2);
        } else {
            h0(j02, str, z2);
        }
    }

    public void W(int i2, vn vnVar, boolean z2) {
        V(i2, vnVar != null ? vnVar.o() : null, z2);
    }

    public void X(SharedPreferences.Editor editor) {
        editor.putString("pref_audioVisOffset", "" + k(W));
    }

    public void Y(SharedPreferences.Editor editor) {
        editor.putBoolean("pref_visControlsTimeout", h(n));
    }

    public void Z(SharedPreferences.Editor editor) {
        editor.putBoolean("pref_visualizerGlobalSession", h(A));
    }

    public void a0(int i2, boolean z2) {
        if (z2 != (this.a.getAndSet(i2 - m, z2 ? 1 : 0) != 0)) {
            h.a(Integer.valueOf(i2), Boolean.valueOf(z2));
        }
    }

    public void b0(int i2, boolean z2) {
        this.a.set(i2 - m, z2 ? 1 : 0);
    }

    public void c() {
        StringBuilder sb = new StringBuilder();
        Context e = dx0.e();
        if (e == null || Build.VERSION.SDK_INT < 24) {
            try {
                String b = dl.b();
                if (!b.isEmpty()) {
                    sb.append("-03");
                    sb.append(":");
                    sb.append(b);
                    sb.append(";");
                }
            } catch (Exception unused) {
            }
            if (e != null) {
                try {
                    String d = dl.d(e);
                    if (!d.isEmpty()) {
                        sb.append("-02");
                        sb.append(":");
                        sb.append(d);
                        sb.append(";");
                    }
                } catch (Exception unused2) {
                }
            }
        } else {
            Iterator<String> it = s(e).iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(";");
            }
        }
        this.e = sb.toString();
    }

    public void c0(int i2, int i3) {
        d0(i2, i3, false);
    }

    public void d() {
        this.e = null;
    }

    public void d0(int i2, int i3, boolean z2) {
        int andSet = this.b.getAndSet(i2 - F, i3);
        if (z2 || i3 != andSet) {
            g.a(Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z2));
        }
    }

    public void e0(int i2, int i3) {
        this.b.set(i2 - F, i3);
    }

    public final String f(String str) {
        String[] split;
        r();
        for (String str2 : this.e.split(";")) {
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

    public void f0(List<Integer> list) {
        g0(u0, er1.e(";", list));
    }

    public void g0(int i2, String str) {
        h0(i2, str, false);
    }

    public boolean h(int i2) {
        return this.a.get(i2 - m) != 0;
    }

    public void h0(int i2, String str, boolean z2) {
        String andSet = this.c.getAndSet(i2 - Z, str);
        if (z2 || !br1.g(andSet, str)) {
            i.a(Integer.valueOf(i2), str, Boolean.valueOf(z2));
        }
    }

    public String i(SharedPreferences sharedPreferences) {
        String[] split;
        String P2 = P(sharedPreferences, "libFolders", "");
        if (P2.isEmpty()) {
            return j();
        }
        if (P2.split("-0\\d:").length < 2) {
            return P2;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : P2.split(";")) {
            if (!str.startsWith("-")) {
                arrayList.add(str);
            }
        }
        String f = er1.f(";", arrayList);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("libFolders", f);
        edit.apply();
        return f;
    }

    public void i0(int i2, String str) {
        this.c.set(i2 - Z, str);
    }

    public String j() {
        if (this.d == null) {
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
            this.d = sb.toString();
        }
        return this.d;
    }

    public int k(int i2) {
        return this.b.get(i2 - F);
    }

    public void k0(int i2) {
        a0(i2, this.a.get(i2 - m) == 0);
    }

    public String l() {
        return f("-03");
    }

    public final String m(int i2) {
        int j02 = j0(i2);
        if (j02 < 0) {
            lz1.c("invalid _identifier");
            return null;
        }
        String t2 = t(j02);
        if (cn.d(t2)) {
            t2 = cn.a(t2);
        }
        if (t2 == null || t2.length() <= 0) {
            return null;
        }
        return t2;
    }

    public vn n(int i2, int[] iArr) {
        String m2 = m(i2);
        if (iArr != null) {
            iArr[0] = g(null);
        }
        if (m2 == null) {
            return null;
        }
        if (iArr != null) {
            iArr[0] = g(m2);
        }
        return vn.g(m2);
    }

    public List<Integer> o() {
        List<String> b = er1.b(";", t(u0));
        ArrayList arrayList = new ArrayList(b.size());
        for (String str : b) {
            int x2 = br1.x(str, -1);
            if (x2 >= 0) {
                arrayList.add(Integer.valueOf(x2));
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
                    x(sharedPreferences);
                    break;
                case 1:
                    z(sharedPreferences);
                    break;
                case 2:
                    y(sharedPreferences);
                    break;
                case 3:
                    A(sharedPreferences);
                    break;
            }
        }
        j.a(str, this);
    }

    public SharedPreferences p(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public String q() {
        return f("-02");
    }

    public String r() {
        if (this.e == null) {
            c();
        }
        return this.e;
    }

    @TargetApi(24)
    public synchronized ArrayList<String> s(Context context) {
        ArrayList<String> arrayList;
        String str;
        arrayList = new ArrayList<>();
        int i2 = 0;
        for (StorageVolume storageVolume : ((StorageManager) context.getSystemService(StorageManager.class)).getStorageVolumes()) {
            if (storageVolume.getState().equalsIgnoreCase("mounted") || storageVolume.getState().equalsIgnoreCase("mounted_ro")) {
                File u2 = u(storageVolume);
                String description = storageVolume.getDescription(context);
                if (!storageVolume.isPrimary() && !"Internal shared storage".equalsIgnoreCase(description)) {
                    if (storageVolume.isRemovable()) {
                        if (!description.toUpperCase().contains("USB") && !u2.getPath().toUpperCase().contains("USB")) {
                            str = "-02" + i2;
                        }
                        str = "-01";
                    } else {
                        str = description;
                    }
                    arrayList.add(str + ":" + u2 + ":" + description);
                    i2++;
                }
                str = "-03";
                arrayList.add(str + ":" + u2 + ":" + description);
                i2++;
            }
        }
        return arrayList;
    }

    public String t(int i2) {
        return this.c.get(i2 - Z);
    }

    public boolean v() {
        return q() != null;
    }

    public void w(Context context) {
        if (this.f) {
            return;
        }
        this.f = true;
        B(context);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        for (int i2 = 0; i2 < this.a.length(); i2++) {
            try {
                a0(m + i2, L(defaultSharedPreferences, "bool" + i2, this.a.get(i2) != 0));
            } catch (Exception unused) {
            }
        }
        for (int i3 = 0; i3 < this.b.length(); i3++) {
            try {
                c0(F + i3, M(defaultSharedPreferences, "int" + i3, this.b.get(i3)));
            } catch (Exception unused2) {
            }
        }
        for (int i4 = 0; i4 < this.c.length(); i4++) {
            try {
                g0(Z + i4, P(defaultSharedPreferences, "string" + i4, this.c.get(i4)));
            } catch (Exception unused3) {
            }
        }
    }

    public void x(SharedPreferences sharedPreferences) {
        c0(W, br1.w(P(sharedPreferences, "pref_audioVisOffset", "0")));
    }

    public void y(SharedPreferences sharedPreferences) {
        a0(C, L(sharedPreferences, "pref_disableHeaderAds", false));
    }

    public void z(SharedPreferences sharedPreferences) {
        a0(n, L(sharedPreferences, "pref_visControlsTimeout", false));
    }
}
