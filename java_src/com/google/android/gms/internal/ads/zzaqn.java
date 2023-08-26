package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
@zzadh
/* loaded from: classes2.dex */
public final class zzaqn extends zzaqh {
    private static final Set<String> zzdbg = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzdbh = new DecimalFormat("#,###");
    private File zzdbi;
    private boolean zzdbj;

    public zzaqn(zzapw zzapwVar) {
        super(zzapwVar);
        File cacheDir = this.mContext.getCacheDir();
        if (cacheDir == null) {
            zzakb.zzdk("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.zzdbi = file;
        if (!file.isDirectory() && !this.zzdbi.mkdirs()) {
            String valueOf = String.valueOf(this.zzdbi.getAbsolutePath());
            zzakb.zzdk(valueOf.length() != 0 ? "Could not create preload cache directory at ".concat(valueOf) : new String("Could not create preload cache directory at "));
            this.zzdbi = null;
        } else if (this.zzdbi.setReadable(true, false) && this.zzdbi.setExecutable(true, false)) {
        } else {
            String valueOf2 = String.valueOf(this.zzdbi.getAbsolutePath());
            zzakb.zzdk(valueOf2.length() != 0 ? "Could not set cache file permissions at ".concat(valueOf2) : new String("Could not set cache file permissions at "));
            this.zzdbi = null;
        }
    }

    private final File zzc(File file) {
        return new File(this.zzdbi, String.valueOf(file.getName()).concat(".done"));
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void abort() {
        this.zzdbj = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ef, code lost:
        if ((r5 instanceof java.net.HttpURLConnection) == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f1, code lost:
        r1 = r5.getResponseCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fa, code lost:
        if (r1 < 400) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fc, code lost:
        r15 = "badUrl";
        r2 = java.lang.String.valueOf(java.lang.Integer.toString(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x020c, code lost:
        if (r2.length() == 0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x020e, code lost:
        r2 = "HTTP request failed. Code: ".concat(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0214, code lost:
        r2 = new java.lang.String("HTTP request failed. Code: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0219, code lost:
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 32);
        r4.append("HTTP status code ");
        r4.append(r1);
        r4.append(" at ");
        r4.append(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0241, code lost:
        throw new java.io.IOException(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0242, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0244, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0246, code lost:
        r7 = r5.getContentLength();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x024a, code lost:
        if (r7 >= 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x024c, code lost:
        r1 = java.lang.String.valueOf(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0256, code lost:
        if (r1.length() == 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0258, code lost:
        r0 = "Stream cache aborted, missing content-length header at ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x025d, code lost:
        r0 = new java.lang.String("Stream cache aborted, missing content-length header at ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0263, code lost:
        com.google.android.gms.internal.ads.zzakb.zzdk(r0);
        zza(r31, r12.getAbsolutePath(), "contentLengthMissing", null);
        com.google.android.gms.internal.ads.zzaqn.zzdbg.remove(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0274, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0275, code lost:
        r1 = com.google.android.gms.internal.ads.zzaqn.zzdbh.format(r7);
        r3 = ((java.lang.Integer) com.google.android.gms.internal.ads.zzkb.zzik().zzd(com.google.android.gms.internal.ads.zznk.zzauy)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x028c, code lost:
        if (r7 <= r3) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x028e, code lost:
        r2 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 33) + java.lang.String.valueOf(r31).length());
        r2.append("Content length ");
        r2.append(r1);
        r2.append(" exceeds limit at ");
        r2.append(r31);
        com.google.android.gms.internal.ads.zzakb.zzdk(r2.toString());
        r1 = java.lang.String.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02c7, code lost:
        if (r1.length() == 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02c9, code lost:
        r0 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02ce, code lost:
        r0 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02d4, code lost:
        zza(r31, r12.getAbsolutePath(), "sizeExceeded", r0);
        com.google.android.gms.internal.ads.zzaqn.zzdbg.remove(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02e2, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02e3, code lost:
        r4 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 20) + java.lang.String.valueOf(r31).length());
        r4.append("Caching ");
        r4.append(r1);
        r4.append(" bytes from ");
        r4.append(r31);
        com.google.android.gms.internal.ads.zzakb.zzck(r4.toString());
        r5 = java.nio.channels.Channels.newChannel(r5.getInputStream());
        r4 = new java.io.FileOutputStream(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x031e, code lost:
        r2 = r4.getChannel();
        r1 = java.nio.ByteBuffer.allocate(1048576);
        r16 = com.google.android.gms.ads.internal.zzbv.zzer();
        r17 = r16.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x033c, code lost:
        r10 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x033d, code lost:
        r6 = new com.google.android.gms.internal.ads.zzamj(((java.lang.Long) com.google.android.gms.internal.ads.zzkb.zzik().zzd(com.google.android.gms.internal.ads.zznk.zzavb)).longValue());
        r13 = ((java.lang.Long) com.google.android.gms.internal.ads.zzkb.zzik().zzd(com.google.android.gms.internal.ads.zznk.zzava)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0356, code lost:
        r20 = r5.read(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x035a, code lost:
        if (r20 < 0) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x035c, code lost:
        r11 = r11 + r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x035e, code lost:
        if (r11 <= r3) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0360, code lost:
        r15 = "sizeExceeded";
        r1 = java.lang.String.valueOf(java.lang.Integer.toString(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0370, code lost:
        if (r1.length() == 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0372, code lost:
        r1 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0378, code lost:
        r1 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0384, code lost:
        throw new java.io.IOException("stream cache file size limit exceeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0387, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0388, code lost:
        r2 = r1;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x038b, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x038e, code lost:
        r1 = r10;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0390, code lost:
        r10 = r4;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0393, code lost:
        r1.flip();
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x039a, code lost:
        if (r2.write(r1) > 0) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x039c, code lost:
        r1.clear();
        r24 = ((r16.currentTimeMillis() - r17) > (1000 * r13) ? 1 : ((r16.currentTimeMillis() - r17) == (1000 * r13) ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03ab, code lost:
        if (r24 > 0) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x03ad, code lost:
        r20 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x03b1, code lost:
        if (r30.zzdbj != false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03b7, code lost:
        if (r6.tryAcquire() == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03bf, code lost:
        r22 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03c3, code lost:
        r24 = r10;
        r25 = r2;
        r26 = r3;
        r27 = r4;
        r21 = r5;
        r19 = r6;
        r29 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x03e1, code lost:
        com.google.android.gms.internal.ads.zzamu.zzsy.post(new com.google.android.gms.internal.ads.zzaqi(r30, r31, r12.getAbsolutePath(), r11, r7, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x03e8, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03ea, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03eb, code lost:
        r27 = r4;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x03f0, code lost:
        r25 = r2;
        r26 = r3;
        r27 = r4;
        r21 = r5;
        r19 = r6;
        r29 = r7;
        r24 = r10;
        r22 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0402, code lost:
        r6 = r19;
        r1 = r20;
        r5 = r21;
        r15 = r22;
        r10 = r24;
        r2 = r25;
        r3 = r26;
        r4 = r27;
        r7 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0425, code lost:
        throw new java.io.IOException("abort requested");
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0426, code lost:
        r27 = r4;
        r24 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x042c, code lost:
        r15 = "downloadTimeout";
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x042e, code lost:
        r0 = java.lang.Long.toString(r13);
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r2.append("Timeout exceeded. Limit: ");
        r2.append(r0);
        r2.append(" sec");
        r10 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0459, code lost:
        throw new java.io.IOException("stream cache time limit exceeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x045a, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x045d, code lost:
        r2 = r10;
        r1 = r24;
        r10 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0464, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0466, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0468, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x046b, code lost:
        r27 = r4;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0472, code lost:
        r27 = r4;
        r24 = r10;
        r22 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x047a, code lost:
        r27.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0481, code lost:
        if (com.google.android.gms.internal.ads.zzakb.isLoggable(3) == false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0483, code lost:
        r1 = com.google.android.gms.internal.ads.zzaqn.zzdbh.format(r11);
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 22) + java.lang.String.valueOf(r31).length());
        r3.append("Preloaded ");
        r3.append(r1);
        r3.append(" bytes from ");
        r3.append(r31);
        com.google.android.gms.internal.ads.zzakb.zzck(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x04ba, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x04bc, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x04bd, code lost:
        r15 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x04bf, code lost:
        r1 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x04c4, code lost:
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x04cb, code lost:
        if (r0.isFile() == false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x04cd, code lost:
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x04d5, code lost:
        r0.createNewFile();
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04ee, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x04ef, code lost:
        r1 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x04f6, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x04f7, code lost:
        r27 = r4;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x04fd, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x04fe, code lost:
        r27 = r4;
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0501, code lost:
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 22, insn: 0x0520: MOVE  (r15 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]), block:B:240:0x0520 */
    /* JADX WARN: Removed duplicated region for block: B:248:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05a9  */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4, types: [int] */
    /* JADX WARN: Type inference failed for: r24v9 */
    @Override // com.google.android.gms.internal.ads.zzaqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzdp(String str) {
        int i;
        File file;
        String str2;
        String str3;
        String str4;
        String str5;
        int intValue;
        URL url;
        int i2;
        String str6;
        FileOutputStream fileOutputStream;
        String str7;
        String str8;
        File[] listFiles;
        boolean delete;
        String str9;
        FileOutputStream fileOutputStream2 = null;
        int i3 = 0;
        if (this.zzdbi == null) {
            str9 = "noCacheDir";
        } else {
            do {
                File file2 = this.zzdbi;
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
                if (i <= ((Integer) zzkb.zzik().zzd(zznk.zzaux)).intValue()) {
                    zzkb.zzif();
                    file = new File(this.zzdbi, zzamu.zzde(str));
                    File zzc = zzc(file);
                    if (file.isFile() && zzc.isFile()) {
                        int length = (int) file.length();
                        String valueOf = String.valueOf(str);
                        zzakb.zzck(valueOf.length() != 0 ? "Stream cache hit at ".concat(valueOf) : new String("Stream cache hit at "));
                        zza(str, file.getAbsolutePath(), length);
                        return true;
                    }
                    String valueOf2 = String.valueOf(this.zzdbi.getAbsolutePath());
                    String valueOf3 = String.valueOf(str);
                    String concat = valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
                    synchronized (zzdbg) {
                        if (zzdbg.contains(concat)) {
                            String valueOf4 = String.valueOf(str);
                            zzakb.zzdk(valueOf4.length() != 0 ? "Stream cache already in progress at ".concat(valueOf4) : new String("Stream cache already in progress at "));
                            zza(str, file.getAbsolutePath(), "inProgress", null);
                            return false;
                        }
                        zzdbg.add(concat);
                        str2 = "error";
                        try {
                            com.google.android.gms.ads.internal.zzbv.zzew();
                            intValue = ((Integer) zzkb.zzik().zzd(zznk.zzavc)).intValue();
                            url = new URL(str);
                            i2 = 0;
                        } catch (IOException | RuntimeException e) {
                            e = e;
                            str3 = concat;
                        }
                        while (true) {
                            i2++;
                            try {
                            } catch (IOException | RuntimeException e2) {
                                e = e2;
                                str2 = str6;
                                str3 = intValue;
                                str4 = null;
                                fileOutputStream2 = null;
                                str5 = str3;
                                if (e instanceof RuntimeException) {
                                }
                                try {
                                    fileOutputStream2.close();
                                } catch (IOException | NullPointerException unused) {
                                }
                                if (this.zzdbj) {
                                }
                                if (file.exists()) {
                                }
                                zza(str, file.getAbsolutePath(), str2, str4);
                                zzdbg.remove(str5);
                                return false;
                            }
                            if (i2 <= 20) {
                                URLConnection openConnection = url.openConnection();
                                openConnection.setConnectTimeout(intValue);
                                openConnection.setReadTimeout(intValue);
                                if (openConnection instanceof HttpURLConnection) {
                                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                                    zzamy zzamyVar = new zzamy();
                                    zzamyVar.zza(httpURLConnection, (byte[]) null);
                                    httpURLConnection.setInstanceFollowRedirects(false);
                                    int responseCode = httpURLConnection.getResponseCode();
                                    zzamyVar.zza(httpURLConnection, responseCode);
                                    if (responseCode / 100 != 3) {
                                        break;
                                    }
                                    try {
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
                                            String valueOf5 = String.valueOf(protocol);
                                            throw new IOException(valueOf5.length() != 0 ? "Unsupported scheme: ".concat(valueOf5) : new String("Unsupported scheme: "));
                                        }
                                        String valueOf6 = String.valueOf(headerField);
                                        zzakb.zzck(valueOf6.length() != 0 ? "Redirecting to ".concat(valueOf6) : new String("Redirecting to "));
                                        httpURLConnection.disconnect();
                                        url = url2;
                                    } catch (IOException | RuntimeException e3) {
                                        e = e3;
                                        str4 = null;
                                    }
                                    str5 = concat;
                                    if (e instanceof RuntimeException) {
                                        com.google.android.gms.ads.internal.zzbv.zzeo().zza(e, "VideoStreamFullFileCache.preload");
                                    }
                                    fileOutputStream2.close();
                                    if (this.zzdbj) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
                                        sb.append("Preload aborted for URL \"");
                                        sb.append(str);
                                        sb.append("\"");
                                        zzakb.zzdj(sb.toString());
                                    } else {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25);
                                        sb2.append("Preload failed for URL \"");
                                        sb2.append(str);
                                        sb2.append("\"");
                                        zzakb.zzc(sb2.toString(), e);
                                    }
                                    if (file.exists() && !file.delete()) {
                                        String valueOf7 = String.valueOf(file.getAbsolutePath());
                                        zzakb.zzdk(valueOf7.length() == 0 ? "Could not delete partial cache file at ".concat(valueOf7) : new String("Could not delete partial cache file at "));
                                    }
                                    zza(str, file.getAbsolutePath(), str2, str4);
                                    zzdbg.remove(str5);
                                    return false;
                                }
                                throw new IOException("Invalid protocol.");
                            }
                            throw new IOException("Too many redirects (20)");
                        }
                    }
                }
                File file4 = this.zzdbi;
                if (file4 != null) {
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
                        delete = file5.delete();
                        File zzc2 = zzc(file5);
                        if (zzc2.isFile()) {
                            delete &= zzc2.delete();
                            continue;
                        } else {
                            continue;
                        }
                    }
                }
                delete = false;
                continue;
            } while (delete);
            zzakb.zzdk("Unable to expire stream cache");
            str9 = "expireFailed";
        }
        zza(str, null, str9, null);
        return false;
        zza(str, file.getAbsolutePath(), i3);
        String str10 = str7;
        try {
            zzdbg.remove(str10);
            return true;
        } catch (IOException e4) {
            e = e4;
            str2 = str8;
            String str11 = str10;
            fileOutputStream2 = fileOutputStream;
            str4 = null;
            str5 = str11;
            if (e instanceof RuntimeException) {
            }
            fileOutputStream2.close();
            if (this.zzdbj) {
            }
            if (file.exists()) {
            }
            zza(str, file.getAbsolutePath(), str2, str4);
            zzdbg.remove(str5);
            return false;
        } catch (RuntimeException e5) {
            e = e5;
            str2 = str8;
            String str112 = str10;
            fileOutputStream2 = fileOutputStream;
            str4 = null;
            str5 = str112;
            if (e instanceof RuntimeException) {
            }
            fileOutputStream2.close();
            if (this.zzdbj) {
            }
            if (file.exists()) {
            }
            zza(str, file.getAbsolutePath(), str2, str4);
            zzdbg.remove(str5);
            return false;
        }
    }
}
