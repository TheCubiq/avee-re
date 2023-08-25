package com.daaw;

import com.daaw.jx0;
import com.daaw.mx0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public class lx0 {

    /* renamed from: c */
    public static lx0 f17885c;

    /* renamed from: a */
    public final bl0 f17886a = el0.m23398a(getClass());

    /* renamed from: b */
    public Iterable<pe1> f17887b;

    public lx0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cv0());
        arrayList.add(new gv0());
        arrayList.add(new cm0());
        arrayList.add(new ev0());
        arrayList.add(new am0());
        this.f17887b = arrayList;
    }

    /* renamed from: f */
    public static String m16394f(String str, String str2, kx0 kx0Var) {
        if (str == null || str.length() <= 0) {
            str = "//";
        } else if (str.charAt(str.length() - 1) != '/') {
            str = str + "/";
        }
        return str + str2 + "." + kx0Var.f16802b;
    }

    /* renamed from: h */
    public static lx0 m16392h() {
        if (f17885c == null) {
            f17885c = new lx0();
        }
        return f17885c;
    }

    /* renamed from: a */
    public int m16399a(wf1 wf1Var, String str, List<String> list, boolean z, boolean z2) {
        return m16398b(wf1Var, str, tx0.m8735q(list), z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m16398b(wf1 wf1Var, String str, List<tx0> list, boolean z, boolean z2) {
        URL url;
        oe1 oe1Var;
        pe1 pe1Var;
        try {
            if (str.startsWith("file:")) {
                url = new URL(str);
            } else {
                url = new URL("file://" + str);
            }
            File file = new File(str);
            if (file.exists()) {
                try {
                    oe1Var = m16393g(url);
                    try {
                        pe1Var = oe1Var.mo2137a();
                        try {
                            if (oe1Var instanceof zl0) {
                                ((zl0) oe1Var).m2134d(true);
                            }
                            if (z) {
                                try {
                                    oe1Var = pe1Var.mo13425c(new ix0());
                                } catch (Exception e) {
                                    lz1.m16363c(e.getMessage());
                                }
                            }
                        } catch (IOException e2) {
                            e = e2;
                            lz1.m16363c(e.getMessage());
                            if (oe1Var != null) {
                            }
                            if (z) {
                            }
                        }
                    } catch (IOException e3) {
                        e = e3;
                        pe1Var = null;
                    }
                } catch (IOException e4) {
                    e = e4;
                    oe1Var = null;
                    pe1Var = null;
                }
                if (oe1Var != null || pe1Var == null) {
                    if (z) {
                        return 0;
                    }
                    try {
                        oe1Var = m16396d(str).mo13425c(new ix0());
                    } catch (Exception e5) {
                        lz1.m16363c(e5.getMessage());
                    }
                }
            } else {
                try {
                    oe1Var = m16396d(str).mo13425c(new ix0());
                } catch (Exception e6) {
                    lz1.m16363c(e6.getMessage());
                    oe1Var = null;
                }
            }
            if (oe1Var == null) {
                lz1.m16363c("error specificPlaylist is null");
                wf1Var.m6096a("Error specificPlaylist is null");
                return 0;
            }
            mx0.C2218a c2218a = new mx0.C2218a();
            c2218a.f19222b = z2;
            try {
                c2218a.f19221a = file.getCanonicalPath();
            } catch (Exception unused) {
                c2218a.f19221a = file.getAbsolutePath();
            }
            int m15725f = mx0.m15725f(oe1Var, c2218a, list);
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    parentFile.mkdirs();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    oe1Var.mo2136b(fileOutputStream, null);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } catch (Exception e7) {
                    lz1.m16363c("outputSpecificPlaylist.writeTo: " + e7.getMessage());
                    wf1Var.m6095b("OutputSpecificPlaylist", e7);
                }
                return m15725f;
            } catch (Exception e8) {
                wf1Var.m6095b("File Output", e8);
                return 0;
            }
        } catch (MalformedURLException unused2) {
            wf1Var.m6096a("MalformedURLException");
            return 0;
        }
    }

    /* renamed from: c */
    public int m16397c(wf1 wf1Var, String str, kx0 kx0Var, List<String> list, boolean z) {
        return m16399a(wf1Var, str, list, true, z);
    }

    /* renamed from: d */
    public final pe1 m16396d(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        pe1 pe1Var = null;
        for (pe1 pe1Var2 : this.f17887b) {
            C3445wk[] mo13426b = pe1Var2.mo13426b();
            int length = mo13426b.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (mo13426b[i].m6038a(lowerCase)) {
                    pe1Var = pe1Var2;
                    continue;
                    break;
                } else {
                    i++;
                }
            }
            if (pe1Var != null) {
                break;
            }
        }
        return pe1Var;
    }

    /* renamed from: e */
    public List<tx0> m16395e(String str) {
        URL url;
        File file;
        oe1 oe1Var;
        ArrayList arrayList = null;
        try {
            url = new URL("file://" + str);
            file = new File(str);
        } catch (MalformedURLException unused) {
        }
        if (dx0.m23837e() == null) {
            return null;
        }
        try {
            oe1Var = m16393g(url);
        } catch (IOException e) {
            lz1.m16363c(e.getMessage());
            oe1Var = null;
        }
        if (oe1Var == null) {
            return null;
        }
        arrayList = new ArrayList();
        if (file.exists()) {
            jx0.C1887a c1887a = new jx0.C1887a();
            try {
                c1887a.f15491a = file.getCanonicalPath();
            } catch (Exception unused2) {
                c1887a.f15491a = file.getAbsolutePath();
            }
            jx0.m18182k(oe1Var, c1887a, arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:12|13|14|15|(2:17|18)(2:20|(2:22|23)(1:24))|19) */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (r8.f17886a.mo23394d() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        r4 = r8.f17886a;
        r4.mo23396b("Playlist provider " + r1.getId() + " cannot unmarshal <" + r9 + ">", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
        if (r8.f17886a.mo23395c() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
        r4 = r8.f17886a;
        r4.mo23397a("Playlist provider " + r1.getId() + " cannot unmarshal <" + r9 + ">: " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ad, code lost:
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
        r9 = move-exception;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final oe1 m16393g(URL url) {
        Iterator<pe1> it = this.f17887b.iterator();
        while (it.hasNext()) {
            pe1 next = it.next();
            URLConnection openConnection = url.openConnection();
            openConnection.setAllowUserInteraction(false);
            openConnection.setConnectTimeout(10000);
            openConnection.setDoInput(true);
            openConnection.setDoOutput(false);
            openConnection.setReadTimeout(60000);
            openConnection.setUseCaches(true);
            openConnection.connect();
            String contentEncoding = openConnection.getContentEncoding();
            InputStream inputStream = openConnection.getInputStream();
            return next.mo13427a(inputStream, contentEncoding, this.f17886a);
        }
        return null;
    }
}
