package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class m54 extends j54 {

    /* renamed from: u */
    public static final Set f18460u = Collections.synchronizedSet(new HashSet());

    /* renamed from: v */
    public static final DecimalFormat f18461v = new DecimalFormat("#,###");

    /* renamed from: w */
    public static final /* synthetic */ int f18462w = 0;

    /* renamed from: s */
    public File f18463s;

    /* renamed from: t */
    public boolean f18464t;

    public m54(y24 y24Var) {
        super(y24Var);
        File cacheDir = this.f14365p.getCacheDir();
        if (cacheDir == null) {
            k04.zzj("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.f18463s = file;
        if (!file.isDirectory() && !this.f18463s.mkdirs()) {
            k04.zzj("Could not create preload cache directory at ".concat(String.valueOf(this.f18463s.getAbsolutePath())));
            this.f18463s = null;
        } else if (this.f18463s.setReadable(true, false) && this.f18463s.setExecutable(true, false)) {
        } else {
            k04.zzj("Could not set cache file permissions at ".concat(String.valueOf(this.f18463s.getAbsolutePath())));
            this.f18463s = null;
        }
    }

    @Override // com.daaw.j54
    /* renamed from: h */
    public final void mo10703h() {
        this.f18464t = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0343, code lost:
        r26 = r4;
        r24 = r14;
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0349, code lost:
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0351, code lost:
        if (com.daaw.k04.zzm(3) == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0353, code lost:
        com.daaw.k04.zze("Preloaded " + com.daaw.m54.f18461v.format(r13) + " bytes from " + r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0376, code lost:
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x037f, code lost:
        if (r0.isFile() == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0381, code lost:
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0389, code lost:
        r0.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x040d  */
    @Override // com.daaw.j54
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo10698s(final String str) {
        int i;
        File file;
        String str2;
        String str3;
        String str4;
        FileOutputStream fileOutputStream;
        String str5;
        int i2;
        String str6;
        zzbz zzbzVar;
        FileChannel fileChannel;
        ReadableByteChannel readableByteChannel;
        int i3;
        int i4;
        int responseCode;
        String str7;
        File[] listFiles;
        boolean z;
        FileOutputStream fileOutputStream2 = null;
        if (this.f18463s == null) {
            m18856j(str, null, "noCacheDir", null);
            return false;
        }
        do {
            File file2 = this.f18463s;
            if (file2 == null) {
                i = 0;
            } else {
                i = 0;
                for (File file3 : file2.listFiles()) {
                    if (!file3.getName().endsWith(".done")) {
                        i++;
                    }
                }
            }
            if (i > ((Integer) zzba.zzc().m23658b(g93.f10819s)).intValue()) {
                File file4 = this.f18463s;
                if (file4 == null) {
                    break;
                }
                long j = Long.MAX_VALUE;
                File file5 = null;
                for (File file6 : file4.listFiles()) {
                    if (!file6.getName().endsWith(".done")) {
                        long lastModified = file6.lastModified();
                        if (lastModified < j) {
                            file5 = file6;
                            j = lastModified;
                        }
                    }
                }
                if (file5 != null) {
                    z = file5.delete();
                    File m16200v = m16200v(file5);
                    if (m16200v.isFile()) {
                        z &= m16200v.delete();
                        continue;
                    } else {
                        continue;
                    }
                } else {
                    z = false;
                    continue;
                }
            } else {
                file = new File(this.f18463s, d04.m24822j(str));
                File m16200v2 = m16200v(file);
                if (file.isFile() && m16200v2.isFile()) {
                    long length = file.length();
                    k04.zze("Stream cache hit at ".concat(String.valueOf(str)));
                    m18855k(str, file.getAbsolutePath(), (int) length);
                    return true;
                }
                String concat = String.valueOf(this.f18463s.getAbsolutePath()).concat(String.valueOf(str));
                Set set = f18460u;
                synchronized (set) {
                    if (set.contains(concat)) {
                        k04.zzj("Stream cache already in progress at " + str);
                        m18856j(str, file.getAbsolutePath(), "inProgress", null);
                        return false;
                    }
                    set.add(concat);
                    str2 = "error";
                    try {
                        HttpURLConnection m3220E = ru6.m10935d().m3220E(new xu6() { // from class: com.daaw.l54
                            @Override // com.daaw.xu6
                            public final URLConnection zza() {
                                String str8 = str;
                                int i5 = m54.f18462w;
                                zzt.zzw();
                                int intValue = ((Integer) zzba.zzc().m23658b(g93.f10874x)).intValue();
                                URL url = new URL(str8);
                                int i6 = 0;
                                while (true) {
                                    i6++;
                                    if (i6 > 20) {
                                        throw new IOException("Too many redirects (20)");
                                    }
                                    URLConnection openConnection = url.openConnection();
                                    openConnection.setConnectTimeout(intValue);
                                    openConnection.setReadTimeout(intValue);
                                    if (!(openConnection instanceof HttpURLConnection)) {
                                        throw new IOException("Invalid protocol.");
                                    }
                                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                                    j04 j04Var = new j04(null);
                                    j04Var.m19197c(httpURLConnection, null);
                                    httpURLConnection.setInstanceFollowRedirects(false);
                                    int responseCode2 = httpURLConnection.getResponseCode();
                                    j04Var.m19195e(httpURLConnection, responseCode2);
                                    if (responseCode2 / 100 != 3) {
                                        return httpURLConnection;
                                    }
                                    String headerField = httpURLConnection.getHeaderField("Location");
                                    if (headerField == null) {
                                        throw new IOException("Missing Location header in redirect");
                                    }
                                    URL url2 = new URL(url, headerField);
                                    String protocol = url2.getProtocol();
                                    if (protocol == null) {
                                        throw new IOException("Protocol is null");
                                    }
                                    if (!protocol.equals("http") && !protocol.equals("https")) {
                                        throw new IOException("Unsupported scheme: ".concat(protocol));
                                    }
                                    k04.zze("Redirecting to ".concat(headerField));
                                    httpURLConnection.disconnect();
                                    url = url2;
                                }
                            }
                        }, 265, -1);
                        if ((m3220E instanceof HttpURLConnection) && (responseCode = m3220E.getResponseCode()) >= 400) {
                            str2 = "badUrl";
                            try {
                                str7 = "HTTP request failed. Code: " + Integer.toString(responseCode);
                            } catch (IOException | RuntimeException e) {
                                e = e;
                                str4 = null;
                            }
                            try {
                                throw new IOException("HTTP status code " + responseCode + " at " + str);
                            } catch (IOException | RuntimeException e2) {
                                e = e2;
                                str4 = str7;
                                str3 = concat;
                                if (e instanceof RuntimeException) {
                                }
                                try {
                                    fileOutputStream2.close();
                                } catch (IOException | NullPointerException unused) {
                                }
                                if (this.f18464t) {
                                }
                                if (file.exists()) {
                                }
                                m18856j(str, file.getAbsolutePath(), str2, str4);
                                f18460u.remove(str3);
                                return false;
                            }
                        }
                        int contentLength = m3220E.getContentLength();
                        if (contentLength < 0) {
                            k04.zzj("Stream cache aborted, missing content-length header at " + str);
                            m18856j(str, file.getAbsolutePath(), "contentLengthMissing", null);
                            set.remove(concat);
                            return false;
                        }
                        String format = f18461v.format(contentLength);
                        int intValue = ((Integer) zzba.zzc().m23658b(g93.f10830t)).intValue();
                        if (contentLength > intValue) {
                            k04.zzj("Content length " + format + " exceeds limit at " + str);
                            StringBuilder sb = new StringBuilder();
                            sb.append("File too big for full file cache. Size: ");
                            sb.append(format);
                            m18856j(str, file.getAbsolutePath(), "sizeExceeded", sb.toString());
                            set.remove(concat);
                            return false;
                        }
                        k04.zze("Caching " + format + " bytes from " + str);
                        ReadableByteChannel newChannel = Channels.newChannel(m3220E.getInputStream());
                        FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                        try {
                            FileChannel channel = fileOutputStream3.getChannel();
                            ByteBuffer allocate = ByteBuffer.allocate(1048576);
                            InterfaceC0623ag zzB = zzt.zzB();
                            long mo15860a = zzB.mo15860a();
                            zzbz zzbzVar2 = new zzbz(((Long) zzba.zzc().m23658b(g93.f10863w)).longValue());
                            y83 y83Var = g93.f10852v;
                            e93 zzc = zzba.zzc();
                            long longValue = ((Long) zzc.m23658b(y83Var)).longValue();
                            i2 = 0;
                            while (true) {
                                int read = newChannel.read(allocate);
                                if (read < 0) {
                                    break;
                                }
                                i2 += read;
                                try {
                                    try {
                                        if (i2 > intValue) {
                                            String str8 = "File too big for full file cache. Size: " + Integer.toString(i2);
                                            throw new IOException("stream cache file size limit exceeded");
                                        }
                                        try {
                                            allocate.flip();
                                            do {
                                            } while (channel.write(allocate) > 0);
                                            allocate.clear();
                                            if (zzB.mo15860a() - mo15860a > 1000 * longValue) {
                                                String str9 = "Timeout exceeded. Limit: " + Long.toString(longValue) + " sec";
                                                throw new IOException("stream cache time limit exceeded");
                                            }
                                            ByteBuffer byteBuffer = allocate;
                                            if (this.f18464t) {
                                                throw new IOException("abort requested");
                                            }
                                            if (zzbzVar2.zzb()) {
                                                str5 = str2;
                                                try {
                                                    zzbzVar = zzbzVar2;
                                                    str6 = concat;
                                                    fileChannel = channel;
                                                    fileOutputStream = fileOutputStream3;
                                                    readableByteChannel = newChannel;
                                                    i3 = intValue;
                                                    i4 = contentLength;
                                                    try {
                                                        try {
                                                            d04.f6340b.post(new a54(this, str, file.getAbsolutePath(), i2, contentLength, false));
                                                        } catch (IOException e3) {
                                                            e = e3;
                                                            str3 = str6;
                                                            str2 = str5;
                                                            fileOutputStream2 = fileOutputStream;
                                                            str4 = null;
                                                            if (e instanceof RuntimeException) {
                                                                zzt.zzo().m11902u(e, "VideoStreamFullFileCache.preload");
                                                            }
                                                            fileOutputStream2.close();
                                                            if (this.f18464t) {
                                                                k04.zzi("Preload aborted for URL \"" + str + "\"");
                                                            } else {
                                                                k04.zzk("Preload failed for URL \"" + str + "\"", e);
                                                            }
                                                            if (file.exists() && !file.delete()) {
                                                                k04.zzj("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                            }
                                                            m18856j(str, file.getAbsolutePath(), str2, str4);
                                                            f18460u.remove(str3);
                                                            return false;
                                                        }
                                                    } catch (RuntimeException e4) {
                                                        e = e4;
                                                        str3 = str6;
                                                        str2 = str5;
                                                        fileOutputStream2 = fileOutputStream;
                                                        str4 = null;
                                                        if (e instanceof RuntimeException) {
                                                        }
                                                        fileOutputStream2.close();
                                                        if (this.f18464t) {
                                                        }
                                                        if (file.exists()) {
                                                            k04.zzj("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                        }
                                                        m18856j(str, file.getAbsolutePath(), str2, str4);
                                                        f18460u.remove(str3);
                                                        return false;
                                                    }
                                                } catch (IOException e5) {
                                                    e = e5;
                                                    fileOutputStream = fileOutputStream3;
                                                    str3 = concat;
                                                    str2 = str5;
                                                    fileOutputStream2 = fileOutputStream;
                                                    str4 = null;
                                                    if (e instanceof RuntimeException) {
                                                    }
                                                    fileOutputStream2.close();
                                                    if (this.f18464t) {
                                                    }
                                                    if (file.exists()) {
                                                    }
                                                    m18856j(str, file.getAbsolutePath(), str2, str4);
                                                    f18460u.remove(str3);
                                                    return false;
                                                } catch (RuntimeException e6) {
                                                    e = e6;
                                                    fileOutputStream = fileOutputStream3;
                                                    str3 = concat;
                                                    str2 = str5;
                                                    fileOutputStream2 = fileOutputStream;
                                                    str4 = null;
                                                    if (e instanceof RuntimeException) {
                                                    }
                                                    fileOutputStream2.close();
                                                    if (this.f18464t) {
                                                    }
                                                    if (file.exists()) {
                                                    }
                                                    m18856j(str, file.getAbsolutePath(), str2, str4);
                                                    f18460u.remove(str3);
                                                    return false;
                                                }
                                            } else {
                                                zzbzVar = zzbzVar2;
                                                fileChannel = channel;
                                                fileOutputStream = fileOutputStream3;
                                                readableByteChannel = newChannel;
                                                i3 = intValue;
                                                i4 = contentLength;
                                                str6 = concat;
                                                str5 = str2;
                                            }
                                            allocate = byteBuffer;
                                            newChannel = readableByteChannel;
                                            str2 = str5;
                                            zzbzVar2 = zzbzVar;
                                            concat = str6;
                                            channel = fileChannel;
                                            fileOutputStream3 = fileOutputStream;
                                            intValue = i3;
                                            contentLength = i4;
                                        } catch (IOException | RuntimeException e7) {
                                            e = e7;
                                            fileOutputStream = fileOutputStream3;
                                            str5 = str2;
                                        }
                                    } catch (IOException | RuntimeException e8) {
                                        e = e8;
                                        str4 = zzc;
                                        str3 = str6;
                                        fileOutputStream2 = fileOutputStream;
                                        if (e instanceof RuntimeException) {
                                        }
                                        fileOutputStream2.close();
                                        if (this.f18464t) {
                                        }
                                        if (file.exists()) {
                                        }
                                        m18856j(str, file.getAbsolutePath(), str2, str4);
                                        f18460u.remove(str3);
                                        return false;
                                    }
                                } catch (IOException | RuntimeException e9) {
                                    e = e9;
                                    str3 = str6;
                                    fileOutputStream2 = fileOutputStream;
                                    str4 = null;
                                    if (e instanceof RuntimeException) {
                                    }
                                    fileOutputStream2.close();
                                    if (this.f18464t) {
                                    }
                                    if (file.exists()) {
                                    }
                                    m18856j(str, file.getAbsolutePath(), str2, str4);
                                    f18460u.remove(str3);
                                    return false;
                                }
                            }
                        } catch (IOException | RuntimeException e10) {
                            e = e10;
                            fileOutputStream = fileOutputStream3;
                            str3 = concat;
                            str5 = str2;
                        }
                    } catch (IOException | RuntimeException e11) {
                        e = e11;
                        str3 = concat;
                        str2 = "error";
                        str4 = null;
                        fileOutputStream2 = null;
                    }
                }
            }
        } while (z);
        k04.zzj("Unable to expire stream cache");
        m18856j(str, null, "expireFailed", null);
        return false;
        m18855k(str, file.getAbsolutePath(), i2);
        str3 = str6;
        try {
            f18460u.remove(str3);
            return true;
        } catch (IOException e12) {
            e = e12;
            str2 = str5;
            fileOutputStream2 = fileOutputStream;
            str4 = null;
            if (e instanceof RuntimeException) {
            }
            fileOutputStream2.close();
            if (this.f18464t) {
            }
            if (file.exists()) {
            }
            m18856j(str, file.getAbsolutePath(), str2, str4);
            f18460u.remove(str3);
            return false;
        } catch (RuntimeException e13) {
            e = e13;
            str2 = str5;
            fileOutputStream2 = fileOutputStream;
            str4 = null;
            if (e instanceof RuntimeException) {
            }
            fileOutputStream2.close();
            if (this.f18464t) {
            }
            if (file.exists()) {
            }
            m18856j(str, file.getAbsolutePath(), str2, str4);
            f18460u.remove(str3);
            return false;
        }
    }

    /* renamed from: v */
    public final File m16200v(File file) {
        return new File(this.f18463s, String.valueOf(file.getName()).concat(".done"));
    }
}
