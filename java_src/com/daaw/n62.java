package com.daaw;

import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* loaded from: classes.dex */
public final class n62 {

    /* renamed from: a */
    public static final String[] f19505a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    public static final String[] f19506b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    public static final String[] f19507c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: a */
    public static c62 m15502a(String str) {
        String str2;
        String str3;
        long j;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (lu5.m16499c(newPullParser, "x:xmpmeta")) {
                y17 m4260u = y17.m4260u();
                long j2 = -9223372036854775807L;
                do {
                    newPullParser.next();
                    if (lu5.m16499c(newPullParser, "rdf:Description")) {
                        String[] strArr = f19505a;
                        int i = 0;
                        for (int i2 = 0; i2 < 4; i2++) {
                            String m16501a = lu5.m16501a(newPullParser, strArr[i2]);
                            if (m16501a != null) {
                                if (Integer.parseInt(m16501a) != 1) {
                                    return null;
                                } else {
                                    String[] strArr2 = f19506b;
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= 4) {
                                            break;
                                        }
                                        String m16501a2 = lu5.m16501a(newPullParser, strArr2[i3]);
                                        if (m16501a2 != null) {
                                            j = Long.parseLong(m16501a2);
                                            if (j == -1) {
                                            }
                                        } else {
                                            i3++;
                                        }
                                    }
                                    j = -9223372036854775807L;
                                    String[] strArr3 = f19507c;
                                    while (true) {
                                        if (i >= 2) {
                                            m4260u = y17.m4260u();
                                            break;
                                        }
                                        String m16501a3 = lu5.m16501a(newPullParser, strArr3[i]);
                                        if (m16501a3 != null) {
                                            m4260u = y17.m4258w(new b62("image/jpeg", "Primary", 0L, 0L), new b62("video/mp4", "MotionPhoto", Long.parseLong(m16501a3), 0L));
                                            break;
                                        }
                                        i++;
                                    }
                                    j2 = j;
                                }
                            }
                        }
                        return null;
                    }
                    if (lu5.m16499c(newPullParser, "Container:Directory")) {
                        str2 = "Container";
                        str3 = "Item";
                    } else if (lu5.m16499c(newPullParser, "GContainer:Directory")) {
                        str2 = "GContainer";
                        str3 = "GContainerItem";
                    }
                    m4260u = m15501b(newPullParser, str2, str3);
                } while (!lu5.m16500b(newPullParser, "x:xmpmeta"));
                if (m4260u.isEmpty()) {
                    return null;
                }
                return new c62(j2, m4260u);
            }
            throw dl3.m24267a("Couldn't find xmp metadata", null);
        } catch (dl3 | NumberFormatException | XmlPullParserException unused) {
            s95.m10493e("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* renamed from: b */
    public static y17 m15501b(XmlPullParser xmlPullParser, String str, String str2) {
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        v17 m4266o = y17.m4266o();
        do {
            xmlPullParser.next();
            if (lu5.m16499c(xmlPullParser, concat)) {
                String m16501a = lu5.m16501a(xmlPullParser, str2.concat(":Mime"));
                String m16501a2 = lu5.m16501a(xmlPullParser, str2.concat(":Semantic"));
                String m16501a3 = lu5.m16501a(xmlPullParser, str2.concat(":Length"));
                String m16501a4 = lu5.m16501a(xmlPullParser, str2.concat(":Padding"));
                if (m16501a == null || m16501a2 == null) {
                    return y17.m4260u();
                }
                m4266o.m7548f(new b62(m16501a, m16501a2, m16501a3 != null ? Long.parseLong(m16501a3) : 0L, m16501a4 != null ? Long.parseLong(m16501a4) : 0L));
            }
        } while (!lu5.m16500b(xmlPullParser, concat2));
        return m4266o.m7546h();
    }
}
