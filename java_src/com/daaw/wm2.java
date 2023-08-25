package com.daaw;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.client.zzba;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class wm2 {
    public final Context a;
    public ExecutorService b;
    public DexClassLoader c;
    public yl2 d;
    public byte[] e;
    public final boolean i;
    public nl2 l;
    public final Map o;
    public pm2 q;
    public volatile AdvertisingIdClient f = null;
    public volatile boolean g = false;
    public Future h = null;
    public volatile fj2 j = null;
    public Future k = null;
    public boolean m = false;
    public boolean n = false;
    public boolean p = false;

    public wm2(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.i = applicationContext != null;
        context = applicationContext != null ? applicationContext : context;
        this.a = context;
        this.o = new HashMap();
        if (this.q != null) {
            return;
        }
        this.q = new pm2(context);
    }

    public static wm2 g(Context context, String str, String str2, boolean z) {
        yl2 yl2Var;
        wm2 wm2Var = new wm2(context);
        try {
            wm2Var.b = Executors.newCachedThreadPool(new sm2());
            wm2Var.g = z;
            if (z) {
                wm2Var.h = wm2Var.b.submit(new tm2(wm2Var));
            }
            wm2Var.b.execute(new vm2(wm2Var));
            try {
                x70 f = x70.f();
                wm2Var.m = f.a(wm2Var.a) > 0;
                wm2Var.n = f.g(wm2Var.a) == 0;
            } catch (Throwable unused) {
            }
            wm2Var.o(0, true);
            if (an2.f() && ((Boolean) zzba.zzc().b(g93.O2)).booleanValue()) {
                throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
            }
            yl2Var = new yl2(null);
            wm2Var.d = yl2Var;
        } catch (nm2 unused2) {
        }
        try {
            try {
                byte[] b = uj2.b("ocyv6C8QcbvM773uNIAZp2X4LXa0iaH/WiMOnB1xz18=", false);
                if (b.length == 32) {
                    byte[] bArr = new byte[16];
                    ByteBuffer.wrap(b, 4, 16).get(bArr);
                    for (int i = 0; i < 16; i++) {
                        bArr[i] = (byte) (bArr[i] ^ 68);
                    }
                    wm2Var.e = bArr;
                    try {
                        try {
                            File cacheDir = wm2Var.a.getCacheDir();
                            if (cacheDir == null && (cacheDir = wm2Var.a.getDir("dex", 0)) == null) {
                                throw new nm2();
                            }
                            File file = new File(String.format("%s/%s.jar", cacheDir, "1664557424545"));
                            if (!file.exists()) {
                                byte[] b2 = wm2Var.d.b(wm2Var.e, "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");
                                file.createNewFile();
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                fileOutputStream.write(b2, 0, b2.length);
                                fileOutputStream.close();
                            }
                            wm2Var.x(cacheDir, "1664557424545");
                            try {
                                wm2Var.c = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), null, wm2Var.a.getClassLoader());
                                y(file);
                                wm2Var.w(cacheDir, "1664557424545");
                                z(String.format("%s/%s.dex", cacheDir, "1664557424545"));
                                wm2Var.l = new nl2(wm2Var);
                                wm2Var.p = true;
                                return wm2Var;
                            } catch (Throwable th) {
                                y(file);
                                wm2Var.w(cacheDir, "1664557424545");
                                z(String.format("%s/%s.dex", cacheDir, "1664557424545"));
                                throw th;
                            }
                        } catch (xl2 e) {
                            throw new nm2(e);
                        } catch (IOException e2) {
                            throw new nm2(e2);
                        }
                    } catch (FileNotFoundException e3) {
                        throw new nm2(e3);
                    } catch (NullPointerException e4) {
                        throw new nm2(e4);
                    }
                }
                throw new xl2(yl2Var);
            } catch (IllegalArgumentException e5) {
                throw new xl2(yl2Var, e5);
            }
        } catch (xl2 e6) {
            throw new nm2(e6);
        }
    }

    public static final void y(File file) {
        if (file.exists()) {
            file.delete();
        } else {
            String.format("File %s not found. No need for deletion", file.getAbsolutePath());
        }
    }

    public static final void z(String str) {
        y(new File(str));
    }

    public final int a() {
        if (this.l != null) {
            return nl2.d();
        }
        return Integer.MIN_VALUE;
    }

    public final Context b() {
        return this.a;
    }

    public final fj2 c() {
        return this.j;
    }

    public final nl2 d() {
        return this.l;
    }

    public final yl2 e() {
        return this.d;
    }

    public final pm2 f() {
        return this.q;
    }

    public final AdvertisingIdClient h() {
        if (this.g) {
            if (this.f != null) {
                return this.f;
            }
            Future future = this.h;
            if (future != null) {
                try {
                    future.get(2000L, TimeUnit.MILLISECONDS);
                    this.h = null;
                } catch (InterruptedException | ExecutionException unused) {
                } catch (TimeoutException unused2) {
                    this.h.cancel(true);
                }
            }
            return this.f;
        }
        return null;
    }

    public final DexClassLoader i() {
        return this.c;
    }

    public final Method j(String str, String str2) {
        mo2 mo2Var = (mo2) this.o.get(new Pair(str, str2));
        if (mo2Var == null) {
            return null;
        }
        return mo2Var.a();
    }

    public final ExecutorService k() {
        return this.b;
    }

    public final Future l() {
        return this.k;
    }

    public final void o(int i, boolean z) {
        if (this.n) {
            Future<?> submit = this.b.submit(new um2(this, i, true));
            if (i == 0) {
                this.k = submit;
            }
        }
    }

    public final boolean p() {
        return this.n;
    }

    public final boolean q() {
        return this.m;
    }

    public final boolean r() {
        return this.p;
    }

    public final boolean s() {
        return this.q.a();
    }

    public final boolean t(String str, String str2, Class... clsArr) {
        Pair pair = new Pair(str, str2);
        if (this.o.containsKey(pair)) {
            return false;
        }
        this.o.put(pair, new mo2(this, str, str2, clsArr));
        return true;
    }

    public final byte[] u() {
        return this.e;
    }

    public final void v() {
        try {
            if (this.f == null && this.i) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.a);
                advertisingIdClient.start();
                this.f = advertisingIdClient;
            }
        } catch (a80 | IOException unused) {
            this.f = null;
        }
    }

    public final void w(File file, String str) {
        Throwable th;
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, "1664557424545"));
        if (file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, "1664557424545"));
        if (!file3.exists()) {
            return;
        }
        long length = file3.length();
        if (length <= 0) {
            return;
        }
        byte[] bArr = new byte[(int) length];
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file3);
            try {
                if (fileInputStream2.read(bArr) <= 0) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused) {
                    }
                    y(file3);
                    return;
                }
                System.out.print("test");
                System.out.print("test");
                System.out.print("test");
                ij2 L = jj2.L();
                L.u(yq7.F(Build.VERSION.SDK.getBytes()));
                L.v(yq7.F("1664557424545".getBytes()));
                byte[] bytes = this.d.a(this.e, bArr).getBytes();
                L.s(yq7.F(bytes));
                L.t(yq7.F(yj2.e(bytes)));
                file2.createNewFile();
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] a = ((jj2) L.n()).a();
                    fileOutputStream.write(a, 0, a.length);
                    fileOutputStream.close();
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused2) {
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                    }
                    y(file3);
                } catch (xl2 | IOException | NoSuchAlgorithmException unused4) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    y(file3);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused7) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused8) {
                        }
                    }
                    y(file3);
                    throw th;
                }
            } catch (xl2 | IOException | NoSuchAlgorithmException unused9) {
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (xl2 | IOException | NoSuchAlgorithmException unused10) {
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public final boolean x(File file, String str) {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, "1664557424545"));
        if (file2.exists()) {
            File file3 = new File(String.format("%s/%s.dex", file, "1664557424545"));
            if (!file3.exists()) {
                FileInputStream fileInputStream = null;
                try {
                    long length = file2.length();
                    if (length <= 0) {
                        y(file2);
                        return false;
                    }
                    byte[] bArr = new byte[(int) length];
                    FileInputStream fileInputStream2 = new FileInputStream(file2);
                    try {
                        try {
                            if (fileInputStream2.read(bArr) <= 0) {
                                y(file2);
                                try {
                                    fileInputStream2.close();
                                } catch (IOException unused) {
                                }
                                return false;
                            }
                            try {
                                try {
                                    jj2 N = jj2.N(bArr, vr7.a());
                                    if ("1664557424545".equals(new String(N.R().j())) && Arrays.equals(N.P().j(), yj2.e(N.O().j())) && Arrays.equals(N.Q().j(), Build.VERSION.SDK.getBytes())) {
                                        byte[] b = this.d.b(this.e, new String(N.O().j()));
                                        file3.createNewFile();
                                        fileOutputStream = new FileOutputStream(file3);
                                        try {
                                            fileOutputStream.write(b, 0, b.length);
                                            try {
                                                fileInputStream2.close();
                                            } catch (IOException unused2) {
                                            }
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException unused3) {
                                            }
                                            return true;
                                        } catch (xl2 | IOException | NoSuchAlgorithmException unused4) {
                                            fileInputStream = fileInputStream2;
                                            if (fileInputStream != null) {
                                                try {
                                                    fileInputStream.close();
                                                } catch (IOException unused5) {
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (IOException unused6) {
                                                }
                                            }
                                            return false;
                                        } catch (Throwable th) {
                                            th = th;
                                            fileInputStream = fileInputStream2;
                                            if (fileInputStream != null) {
                                                try {
                                                    fileInputStream.close();
                                                } catch (IOException unused7) {
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (IOException unused8) {
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                    y(file2);
                                    try {
                                        fileInputStream2.close();
                                    } catch (IOException unused9) {
                                    }
                                    return false;
                                } catch (IOException unused10) {
                                    return false;
                                }
                            } catch (NullPointerException unused11) {
                                fileInputStream2.close();
                                return false;
                            }
                        } catch (xl2 | IOException | NoSuchAlgorithmException unused12) {
                            fileOutputStream = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                    }
                } catch (xl2 | IOException | NoSuchAlgorithmException unused13) {
                    fileOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            }
            return false;
        }
        return false;
    }
}
