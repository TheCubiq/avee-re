package com.daaw;

import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* loaded from: classes.dex */
public final class n62 {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static c62 a(String str) {
        String str2;
        String str3;
        long j;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (lu5.c(newPullParser, "x:xmpmeta")) {
                y17 u = y17.u();
                long j2 = -9223372036854775807L;
                do {
                    newPullParser.next();
                    if (lu5.c(newPullParser, "rdf:Description")) {
                        String[] strArr = a;
                        int i = 0;
                        for (int i2 = 0; i2 < 4; i2++) {
                            String a2 = lu5.a(newPullParser, strArr[i2]);
                            if (a2 != null) {
                                if (Integer.parseInt(a2) != 1) {
                                    return null;
                                } else {
                                    String[] strArr2 = b;
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= 4) {
                                            break;
                                        }
                                        String a3 = lu5.a(newPullParser, strArr2[i3]);
                                        if (a3 != null) {
                                            j = Long.parseLong(a3);
                                            if (j == -1) {
                                            }
                                        } else {
                                            i3++;
                                        }
                                    }
                                    j = -9223372036854775807L;
                                    String[] strArr3 = c;
                                    while (true) {
                                        if (i >= 2) {
                                            u = y17.u();
                                            break;
                                        }
                                        String a4 = lu5.a(newPullParser, strArr3[i]);
                                        if (a4 != null) {
                                            u = y17.w(new b62("image/jpeg", "Primary", 0L, 0L), new b62("video/mp4", "MotionPhoto", Long.parseLong(a4), 0L));
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
                    if (lu5.c(newPullParser, "Container:Directory")) {
                        str2 = "Container";
                        str3 = "Item";
                    } else if (lu5.c(newPullParser, "GContainer:Directory")) {
                        str2 = "GContainer";
                        str3 = "GContainerItem";
                    }
                    u = b(newPullParser, str2, str3);
                } while (!lu5.b(newPullParser, "x:xmpmeta"));
                if (u.isEmpty()) {
                    return null;
                }
                return new c62(j2, u);
            }
            throw dl3.a("Couldn't find xmp metadata", null);
        } catch (dl3 | NumberFormatException | XmlPullParserException unused) {
            s95.e("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    public static y17 b(XmlPullParser xmlPullParser, String str, String str2) {
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        v17 o = y17.o();
        do {
            xmlPullParser.next();
            if (lu5.c(xmlPullParser, concat)) {
                String a2 = lu5.a(xmlPullParser, str2.concat(":Mime"));
                String a3 = lu5.a(xmlPullParser, str2.concat(":Semantic"));
                String a4 = lu5.a(xmlPullParser, str2.concat(":Length"));
                String a5 = lu5.a(xmlPullParser, str2.concat(":Padding"));
                if (a2 == null || a3 == null) {
                    return y17.u();
                }
                o.f(new b62(a2, a3, a4 != null ? Long.parseLong(a4) : 0L, a5 != null ? Long.parseLong(a5) : 0L));
            }
        } while (!lu5.b(xmlPullParser, concat2));
        return o.h();
    }
}
