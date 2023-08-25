package com.daaw;

import android.net.Uri;
import android.util.Base64;
import com.daaw.ib0;
import com.daaw.lb0;
import com.daaw.vv0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class ob0 implements vv0.a<nb0> {
    public static final Pattern a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern b = Pattern.compile("AUDIO=\"(.+?)\"");
    public static final Pattern c = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern e = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern f = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern g = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern h = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern i = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern j = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern k = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern l = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern m = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern n = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern o = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(,|$)");
    public static final Pattern p = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern q = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern r = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern s = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern t = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern u = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern v = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern w = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern x = c("AUTOSELECT");
    public static final Pattern y = c("DEFAULT");
    public static final Pattern z = c("FORCED");

    /* loaded from: classes.dex */
    public static class a {
        public final BufferedReader a;
        public final Queue<String> b;
        public String c;

        public a(Queue<String> queue, BufferedReader bufferedReader) {
            this.b = queue;
            this.a = bufferedReader;
        }

        public boolean a() {
            String trim;
            if (this.c != null) {
                return true;
            }
            if (!this.b.isEmpty()) {
                this.c = this.b.poll();
                return true;
            }
            do {
                String readLine = this.a.readLine();
                this.c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.c = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String b() {
            if (a()) {
                String str = this.c;
                this.c = null;
                return str;
            }
            return null;
        }
    }

    public static boolean b(BufferedReader bufferedReader) {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int o2 = o(bufferedReader, true, read);
        for (int i2 = 0; i2 < 7; i2++) {
            if (o2 != "#EXTM3U".charAt(i2)) {
                return false;
            }
            o2 = bufferedReader.read();
        }
        return sq1.J(o(bufferedReader, false, o2));
    }

    public static Pattern c(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    public static boolean e(String str, Pattern pattern, boolean z2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1).equals("YES") : z2;
    }

    public static double f(String str, Pattern pattern) {
        return Double.parseDouble(m(str, pattern));
    }

    public static int g(String str, Pattern pattern) {
        return Integer.parseInt(m(str, pattern));
    }

    public static long h(String str, Pattern pattern) {
        return Long.parseLong(m(str, pattern));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ib0 i(a aVar, String str) {
        char c2;
        int parseInt;
        String str2;
        int i2;
        int i3;
        int i4;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        boolean z2 = false;
        while (aVar.a()) {
            String b2 = aVar.b();
            if (b2.startsWith("#EXT")) {
                arrayList5.add(b2);
            }
            if (b2.startsWith("#EXT-X-MEDIA")) {
                arrayList4.add(b2);
            } else if (b2.startsWith("#EXT-X-STREAM-INF")) {
                z2 |= b2.contains("CLOSED-CAPTIONS=NONE");
                int g2 = g(b2, c);
                String k2 = k(b2, a);
                if (k2 != null) {
                    g2 = Integer.parseInt(k2);
                }
                int i5 = g2;
                String k3 = k(b2, d);
                String k4 = k(b2, e);
                if (k4 != null) {
                    String[] split = k4.split("x");
                    int parseInt2 = Integer.parseInt(split[0]);
                    int parseInt3 = Integer.parseInt(split[1]);
                    if (parseInt2 <= 0 || parseInt3 <= 0) {
                        i4 = -1;
                        parseInt3 = -1;
                    } else {
                        i4 = parseInt2;
                    }
                    i2 = i4;
                    i3 = parseInt3;
                } else {
                    i2 = -1;
                    i3 = -1;
                }
                String k5 = k(b2, f);
                float parseFloat = k5 != null ? Float.parseFloat(k5) : -1.0f;
                String k6 = k(b2, b);
                if (k6 != null && k3 != null) {
                    hashMap.put(k6, sq1.s(k3, 1));
                }
                String b3 = aVar.b();
                if (hashSet.add(b3)) {
                    arrayList.add(new ib0.a(b3, Format.G(Integer.toString(arrayList.size()), "application/x-mpegURL", null, k3, i5, i2, i3, parseFloat, null, 0)));
                }
            }
        }
        Format format = null;
        int i6 = 0;
        ArrayList arrayList6 = null;
        while (i6 < arrayList4.size()) {
            String str3 = (String) arrayList4.get(i6);
            int l2 = l(str3);
            String k7 = k(str3, q);
            String m2 = m(str3, u);
            String k8 = k(str3, t);
            String k9 = k(str3, v);
            String m3 = m(str3, s);
            m3.hashCode();
            ArrayList arrayList7 = arrayList4;
            switch (m3.hashCode()) {
                case -959297733:
                    if (m3.equals("SUBTITLES")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -333210994:
                    if (m3.equals("CLOSED-CAPTIONS")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 62628790:
                    if (m3.equals("AUDIO")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    arrayList3.add(new ib0.a(k7, Format.z(m2, "application/x-mpegURL", "text/vtt", null, -1, l2, k8)));
                    break;
                case 1:
                    String m4 = m(str3, w);
                    if (m4.startsWith("CC")) {
                        parseInt = Integer.parseInt(m4.substring(2));
                        str2 = "application/cea-608";
                    } else {
                        parseInt = Integer.parseInt(m4.substring(7));
                        str2 = "application/cea-708";
                    }
                    int i7 = parseInt;
                    String str4 = str2;
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                    }
                    arrayList6.add(Format.A(m2, null, str4, null, -1, l2, k8, i7));
                    break;
                case 2:
                    String str5 = (String) hashMap.get(k9);
                    Format q2 = Format.q(m2, "application/x-mpegURL", str5 != null ? hq0.d(str5) : null, str5, -1, -1, -1, null, l2, k8);
                    if (k7 != null) {
                        arrayList2.add(new ib0.a(k7, q2));
                        break;
                    } else {
                        format = q2;
                        break;
                    }
            }
            i6++;
            arrayList4 = arrayList7;
        }
        return new ib0(str, arrayList5, arrayList, arrayList2, arrayList3, format, z2 ? Collections.emptyList() : arrayList6);
    }

    public static lb0 j(a aVar, String str) {
        DrmInitData.SchemeData n2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        int i2 = 0;
        int i3 = 0;
        long j4 = 0;
        boolean z2 = false;
        int i4 = 0;
        long j5 = 0;
        int i5 = 1;
        boolean z3 = false;
        boolean z4 = false;
        DrmInitData drmInitData = null;
        long j6 = 0;
        long j7 = 0;
        boolean z5 = false;
        long j8 = -1;
        long j9 = 0;
        String str2 = null;
        String str3 = null;
        lb0.a aVar2 = null;
        loop0: while (true) {
            long j10 = 0;
            while (aVar.a()) {
                String b2 = aVar.b();
                if (b2.startsWith("#EXT")) {
                    arrayList2.add(b2);
                }
                if (b2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                    String m2 = m(b2, i);
                    if ("VOD".equals(m2)) {
                        i3 = 1;
                    } else if ("EVENT".equals(m2)) {
                        i3 = 2;
                    }
                } else if (b2.startsWith("#EXT-X-START")) {
                    j2 = (long) (f(b2, l) * 1000000.0d);
                } else if (b2.startsWith("#EXT-X-MAP")) {
                    String m3 = m(b2, q);
                    String k2 = k(b2, n);
                    if (k2 != null) {
                        String[] split = k2.split("@");
                        j8 = Long.parseLong(split[0]);
                        if (split.length > 1) {
                            j6 = Long.parseLong(split[1]);
                        }
                    }
                    aVar2 = new lb0.a(m3, j6, j8);
                    j6 = 0;
                    j8 = -1;
                } else if (b2.startsWith("#EXT-X-TARGETDURATION")) {
                    j3 = 1000000 * g(b2, g);
                } else if (b2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                    j7 = h(b2, j);
                    j5 = j7;
                } else if (b2.startsWith("#EXT-X-VERSION")) {
                    i5 = g(b2, h);
                } else if (b2.startsWith("#EXTINF")) {
                    j10 = (long) (f(b2, k) * 1000000.0d);
                } else if (b2.startsWith("#EXT-X-KEY")) {
                    String k3 = k(b2, o);
                    String k4 = k(b2, p);
                    if ("NONE".equals(k3)) {
                        str2 = null;
                        str3 = null;
                    } else {
                        String k5 = k(b2, r);
                        if ("identity".equals(k4) || k4 == null) {
                            if ("AES-128".equals(k3)) {
                                str2 = m(b2, q);
                                str3 = k5;
                            }
                        } else if (k3 != null && (n2 = n(b2, k4)) != null) {
                            drmInitData = new DrmInitData(("SAMPLE-AES-CENC".equals(k3) || "SAMPLE-AES-CTR".equals(k3)) ? "cenc" : "cbcs", n2);
                        }
                        str3 = k5;
                        str2 = null;
                    }
                } else if (b2.startsWith("#EXT-X-BYTERANGE")) {
                    String[] split2 = m(b2, m).split("@");
                    j8 = Long.parseLong(split2[0]);
                    if (split2.length > 1) {
                        j6 = Long.parseLong(split2[1]);
                    }
                } else if (b2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                    i4 = Integer.parseInt(b2.substring(b2.indexOf(58) + 1));
                    z2 = true;
                } else if (b2.equals("#EXT-X-DISCONTINUITY")) {
                    i2++;
                } else if (b2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                    if (j4 == 0) {
                        j4 = dd.a(sq1.O(b2.substring(b2.indexOf(58) + 1))) - j9;
                    }
                } else if (b2.equals("#EXT-X-GAP")) {
                    z5 = true;
                } else if (b2.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    z3 = true;
                } else if (b2.equals("#EXT-X-ENDLIST")) {
                    z4 = true;
                } else if (!b2.startsWith("#")) {
                    String hexString = str2 == null ? null : str3 != null ? str3 : Long.toHexString(j7);
                    long j11 = j7 + 1;
                    if (j8 == -1) {
                        j6 = 0;
                    }
                    arrayList.add(new lb0.a(b2, aVar2, j10, i2, j9, str2, hexString, j6, j8, z5));
                    j9 += j10;
                    if (j8 != -1) {
                        j6 += j8;
                    }
                    j7 = j11;
                    j8 = -1;
                    z5 = false;
                }
            }
            break loop0;
        }
        return new lb0(i3, str, arrayList2, j2, j4, z2, i4, j5, i5, j3, z3, z4, j4 != 0, drmInitData, arrayList);
    }

    public static String k(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public static int l(String str) {
        return (e(str, y, false) ? 1 : 0) | (e(str, z, false) ? 2 : 0) | (e(str, x, false) ? 4 : 0);
    }

    public static String m(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        throw new tv0("Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static DrmInitData.SchemeData n(String str, String str2) {
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String m2 = m(str, q);
            return new DrmInitData.SchemeData(dd.e, "video/mp4", Base64.decode(m2.substring(m2.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            try {
                return new DrmInitData.SchemeData(dd.e, "hls", str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e2) {
                throw new tv0(e2);
            }
        } else {
            return null;
        }
    }

    public static int o(BufferedReader bufferedReader, boolean z2, int i2) {
        while (i2 != -1 && Character.isWhitespace(i2) && (z2 || !sq1.J(i2))) {
            i2 = bufferedReader.read();
        }
        return i2;
    }

    @Override // com.daaw.vv0.a
    /* renamed from: d */
    public nb0 a(Uri uri, InputStream inputStream) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (b(bufferedReader)) {
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        sq1.i(bufferedReader);
                        throw new tv0("Failed to parse the playlist, could not identify any tags.");
                    }
                    trim = readLine.trim();
                    if (!trim.isEmpty()) {
                        if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                            if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                                break;
                            }
                            arrayDeque.add(trim);
                        } else {
                            arrayDeque.add(trim);
                            return i(new a(arrayDeque, bufferedReader), uri.toString());
                        }
                    }
                }
                arrayDeque.add(trim);
                return j(new a(arrayDeque, bufferedReader), uri.toString());
            }
            throw new qp1("Input does not start with the #EXTM3U header.", uri);
        } finally {
            sq1.i(bufferedReader);
        }
    }
}
