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
public final class ob0 implements vv0.InterfaceC3379a<nb0> {

    /* renamed from: a */
    public static final Pattern f21204a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: b */
    public static final Pattern f21205b = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: c */
    public static final Pattern f21206c = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: d */
    public static final Pattern f21207d = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: e */
    public static final Pattern f21208e = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: f */
    public static final Pattern f21209f = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: g */
    public static final Pattern f21210g = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: h */
    public static final Pattern f21211h = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: i */
    public static final Pattern f21212i = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: j */
    public static final Pattern f21213j = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: k */
    public static final Pattern f21214k = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: l */
    public static final Pattern f21215l = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: m */
    public static final Pattern f21216m = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: n */
    public static final Pattern f21217n = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: o */
    public static final Pattern f21218o = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(,|$)");

    /* renamed from: p */
    public static final Pattern f21219p = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: q */
    public static final Pattern f21220q = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: r */
    public static final Pattern f21221r = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: s */
    public static final Pattern f21222s = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: t */
    public static final Pattern f21223t = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: u */
    public static final Pattern f21224u = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: v */
    public static final Pattern f21225v = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: w */
    public static final Pattern f21226w = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: x */
    public static final Pattern f21227x = m14427c("AUTOSELECT");

    /* renamed from: y */
    public static final Pattern f21228y = m14427c("DEFAULT");

    /* renamed from: z */
    public static final Pattern f21229z = m14427c("FORCED");

    /* renamed from: com.daaw.ob0$a */
    /* loaded from: classes.dex */
    public static class C2429a {

        /* renamed from: a */
        public final BufferedReader f21230a;

        /* renamed from: b */
        public final Queue<String> f21231b;

        /* renamed from: c */
        public String f21232c;

        public C2429a(Queue<String> queue, BufferedReader bufferedReader) {
            this.f21231b = queue;
            this.f21230a = bufferedReader;
        }

        /* renamed from: a */
        public boolean m14414a() {
            String trim;
            if (this.f21232c != null) {
                return true;
            }
            if (!this.f21231b.isEmpty()) {
                this.f21232c = this.f21231b.poll();
                return true;
            }
            do {
                String readLine = this.f21230a.readLine();
                this.f21232c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f21232c = trim;
            } while (trim.isEmpty());
            return true;
        }

        /* renamed from: b */
        public String m14413b() {
            if (m14414a()) {
                String str = this.f21232c;
                this.f21232c = null;
                return str;
            }
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m14428b(BufferedReader bufferedReader) {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int m14415o = m14415o(bufferedReader, true, read);
        for (int i = 0; i < 7; i++) {
            if (m14415o != "#EXTM3U".charAt(i)) {
                return false;
            }
            m14415o = bufferedReader.read();
        }
        return sq1.m10035J(m14415o(bufferedReader, false, m14415o));
    }

    /* renamed from: c */
    public static Pattern m14427c(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    /* renamed from: e */
    public static boolean m14425e(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1).equals("YES") : z;
    }

    /* renamed from: f */
    public static double m14424f(String str, Pattern pattern) {
        return Double.parseDouble(m14417m(str, pattern));
    }

    /* renamed from: g */
    public static int m14423g(String str, Pattern pattern) {
        return Integer.parseInt(m14417m(str, pattern));
    }

    /* renamed from: h */
    public static long m14422h(String str, Pattern pattern) {
        return Long.parseLong(m14417m(str, pattern));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: i */
    public static ib0 m14421i(C2429a c2429a, String str) {
        char c;
        int parseInt;
        String str2;
        int i;
        int i2;
        int i3;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        boolean z = false;
        while (c2429a.m14414a()) {
            String m14413b = c2429a.m14413b();
            if (m14413b.startsWith("#EXT")) {
                arrayList5.add(m14413b);
            }
            if (m14413b.startsWith("#EXT-X-MEDIA")) {
                arrayList4.add(m14413b);
            } else if (m14413b.startsWith("#EXT-X-STREAM-INF")) {
                z |= m14413b.contains("CLOSED-CAPTIONS=NONE");
                int m14423g = m14423g(m14413b, f21206c);
                String m14419k = m14419k(m14413b, f21204a);
                if (m14419k != null) {
                    m14423g = Integer.parseInt(m14419k);
                }
                int i4 = m14423g;
                String m14419k2 = m14419k(m14413b, f21207d);
                String m14419k3 = m14419k(m14413b, f21208e);
                if (m14419k3 != null) {
                    String[] split = m14419k3.split("x");
                    int parseInt2 = Integer.parseInt(split[0]);
                    int parseInt3 = Integer.parseInt(split[1]);
                    if (parseInt2 <= 0 || parseInt3 <= 0) {
                        i3 = -1;
                        parseInt3 = -1;
                    } else {
                        i3 = parseInt2;
                    }
                    i = i3;
                    i2 = parseInt3;
                } else {
                    i = -1;
                    i2 = -1;
                }
                String m14419k4 = m14419k(m14413b, f21209f);
                float parseFloat = m14419k4 != null ? Float.parseFloat(m14419k4) : -1.0f;
                String m14419k5 = m14419k(m14413b, f21205b);
                if (m14419k5 != null && m14419k2 != null) {
                    hashMap.put(m14419k5, sq1.m9997s(m14419k2, 1));
                }
                String m14413b2 = c2429a.m14413b();
                if (hashSet.add(m14413b2)) {
                    arrayList.add(new ib0.C1674a(m14413b2, Format.m1739G(Integer.toString(arrayList.size()), "application/x-mpegURL", null, m14419k2, i4, i, i2, parseFloat, null, 0)));
                }
            }
        }
        Format format = null;
        int i5 = 0;
        ArrayList arrayList6 = null;
        while (i5 < arrayList4.size()) {
            String str3 = (String) arrayList4.get(i5);
            int m14418l = m14418l(str3);
            String m14419k6 = m14419k(str3, f21220q);
            String m14417m = m14417m(str3, f21224u);
            String m14419k7 = m14419k(str3, f21223t);
            String m14419k8 = m14419k(str3, f21225v);
            String m14417m2 = m14417m(str3, f21222s);
            m14417m2.hashCode();
            ArrayList arrayList7 = arrayList4;
            switch (m14417m2.hashCode()) {
                case -959297733:
                    if (m14417m2.equals("SUBTITLES")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -333210994:
                    if (m14417m2.equals("CLOSED-CAPTIONS")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 62628790:
                    if (m14417m2.equals("AUDIO")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    arrayList3.add(new ib0.C1674a(m14419k6, Format.m1717z(m14417m, "application/x-mpegURL", "text/vtt", null, -1, m14418l, m14419k7)));
                    break;
                case 1:
                    String m14417m3 = m14417m(str3, f21226w);
                    if (m14417m3.startsWith("CC")) {
                        parseInt = Integer.parseInt(m14417m3.substring(2));
                        str2 = "application/cea-608";
                    } else {
                        parseInt = Integer.parseInt(m14417m3.substring(7));
                        str2 = "application/cea-708";
                    }
                    int i6 = parseInt;
                    String str4 = str2;
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                    }
                    arrayList6.add(Format.m1745A(m14417m, null, str4, null, -1, m14418l, m14419k7, i6));
                    break;
                case 2:
                    String str5 = (String) hashMap.get(m14419k8);
                    Format m1725q = Format.m1725q(m14417m, "application/x-mpegURL", str5 != null ? hq0.m20501d(str5) : null, str5, -1, -1, -1, null, m14418l, m14419k7);
                    if (m14419k6 != null) {
                        arrayList2.add(new ib0.C1674a(m14419k6, m1725q));
                        break;
                    } else {
                        format = m1725q;
                        break;
                    }
            }
            i5++;
            arrayList4 = arrayList7;
        }
        return new ib0(str, arrayList5, arrayList, arrayList2, arrayList3, format, z ? Collections.emptyList() : arrayList6);
    }

    /* renamed from: j */
    public static lb0 m14420j(C2429a c2429a, String str) {
        DrmInitData.SchemeData m14416n;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long j = -9223372036854775807L;
        long j2 = -9223372036854775807L;
        int i = 0;
        int i2 = 0;
        long j3 = 0;
        boolean z = false;
        int i3 = 0;
        long j4 = 0;
        int i4 = 1;
        boolean z2 = false;
        boolean z3 = false;
        DrmInitData drmInitData = null;
        long j5 = 0;
        long j6 = 0;
        boolean z4 = false;
        long j7 = -1;
        long j8 = 0;
        String str2 = null;
        String str3 = null;
        lb0.C2025a c2025a = null;
        loop0: while (true) {
            long j9 = 0;
            while (c2429a.m14414a()) {
                String m14413b = c2429a.m14413b();
                if (m14413b.startsWith("#EXT")) {
                    arrayList2.add(m14413b);
                }
                if (m14413b.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                    String m14417m = m14417m(m14413b, f21212i);
                    if ("VOD".equals(m14417m)) {
                        i2 = 1;
                    } else if ("EVENT".equals(m14417m)) {
                        i2 = 2;
                    }
                } else if (m14413b.startsWith("#EXT-X-START")) {
                    j = (long) (m14424f(m14413b, f21215l) * 1000000.0d);
                } else if (m14413b.startsWith("#EXT-X-MAP")) {
                    String m14417m2 = m14417m(m14413b, f21220q);
                    String m14419k = m14419k(m14413b, f21217n);
                    if (m14419k != null) {
                        String[] split = m14419k.split("@");
                        j7 = Long.parseLong(split[0]);
                        if (split.length > 1) {
                            j5 = Long.parseLong(split[1]);
                        }
                    }
                    c2025a = new lb0.C2025a(m14417m2, j5, j7);
                    j5 = 0;
                    j7 = -1;
                } else if (m14413b.startsWith("#EXT-X-TARGETDURATION")) {
                    j2 = 1000000 * m14423g(m14413b, f21210g);
                } else if (m14413b.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                    j6 = m14422h(m14413b, f21213j);
                    j4 = j6;
                } else if (m14413b.startsWith("#EXT-X-VERSION")) {
                    i4 = m14423g(m14413b, f21211h);
                } else if (m14413b.startsWith("#EXTINF")) {
                    j9 = (long) (m14424f(m14413b, f21214k) * 1000000.0d);
                } else if (m14413b.startsWith("#EXT-X-KEY")) {
                    String m14419k2 = m14419k(m14413b, f21218o);
                    String m14419k3 = m14419k(m14413b, f21219p);
                    if ("NONE".equals(m14419k2)) {
                        str2 = null;
                        str3 = null;
                    } else {
                        String m14419k4 = m14419k(m14413b, f21221r);
                        if ("identity".equals(m14419k3) || m14419k3 == null) {
                            if ("AES-128".equals(m14419k2)) {
                                str2 = m14417m(m14413b, f21220q);
                                str3 = m14419k4;
                            }
                        } else if (m14419k2 != null && (m14416n = m14416n(m14413b, m14419k3)) != null) {
                            drmInitData = new DrmInitData(("SAMPLE-AES-CENC".equals(m14419k2) || "SAMPLE-AES-CTR".equals(m14419k2)) ? "cenc" : "cbcs", m14416n);
                        }
                        str3 = m14419k4;
                        str2 = null;
                    }
                } else if (m14413b.startsWith("#EXT-X-BYTERANGE")) {
                    String[] split2 = m14417m(m14413b, f21216m).split("@");
                    j7 = Long.parseLong(split2[0]);
                    if (split2.length > 1) {
                        j5 = Long.parseLong(split2[1]);
                    }
                } else if (m14413b.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                    i3 = Integer.parseInt(m14413b.substring(m14413b.indexOf(58) + 1));
                    z = true;
                } else if (m14413b.equals("#EXT-X-DISCONTINUITY")) {
                    i++;
                } else if (m14413b.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                    if (j3 == 0) {
                        j3 = C1075dd.m24527a(sq1.m10030O(m14413b.substring(m14413b.indexOf(58) + 1))) - j8;
                    }
                } else if (m14413b.equals("#EXT-X-GAP")) {
                    z4 = true;
                } else if (m14413b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    z2 = true;
                } else if (m14413b.equals("#EXT-X-ENDLIST")) {
                    z3 = true;
                } else if (!m14413b.startsWith("#")) {
                    String hexString = str2 == null ? null : str3 != null ? str3 : Long.toHexString(j6);
                    long j10 = j6 + 1;
                    if (j7 == -1) {
                        j5 = 0;
                    }
                    arrayList.add(new lb0.C2025a(m14413b, c2025a, j9, i, j8, str2, hexString, j5, j7, z4));
                    j8 += j9;
                    if (j7 != -1) {
                        j5 += j7;
                    }
                    j6 = j10;
                    j7 = -1;
                    z4 = false;
                }
            }
            break loop0;
        }
        return new lb0(i2, str, arrayList2, j, j3, z, i3, j4, i4, j2, z2, z3, j3 != 0, drmInitData, arrayList);
    }

    /* renamed from: k */
    public static String m14419k(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: l */
    public static int m14418l(String str) {
        return (m14425e(str, f21228y, false) ? 1 : 0) | (m14425e(str, f21229z, false) ? 2 : 0) | (m14425e(str, f21227x, false) ? 4 : 0);
    }

    /* renamed from: m */
    public static String m14417m(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        throw new tv0("Couldn't match " + pattern.pattern() + " in " + str);
    }

    /* renamed from: n */
    public static DrmInitData.SchemeData m14416n(String str, String str2) {
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String m14417m = m14417m(str, f21220q);
            return new DrmInitData.SchemeData(C1075dd.f6945e, "video/mp4", Base64.decode(m14417m.substring(m14417m.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            try {
                return new DrmInitData.SchemeData(C1075dd.f6945e, "hls", str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw new tv0(e);
            }
        } else {
            return null;
        }
    }

    /* renamed from: o */
    public static int m14415o(BufferedReader bufferedReader, boolean z, int i) {
        while (i != -1 && Character.isWhitespace(i) && (z || !sq1.m10035J(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    @Override // com.daaw.vv0.InterfaceC3379a
    /* renamed from: d */
    public nb0 mo3834a(Uri uri, InputStream inputStream) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (m14428b(bufferedReader)) {
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        sq1.m10007i(bufferedReader);
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
                            return m14421i(new C2429a(arrayDeque, bufferedReader), uri.toString());
                        }
                    }
                }
                arrayDeque.add(trim);
                return m14420j(new C2429a(arrayDeque, bufferedReader), uri.toString());
            }
            throw new qp1("Input does not start with the #EXTM3U header.", uri);
        } finally {
            sq1.m10007i(bufferedReader);
        }
    }
}
