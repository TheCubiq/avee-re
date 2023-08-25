package com.daaw;

import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public final class iz1 {
    /* renamed from: a */
    public static String m19251a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (str.equals(xmlPullParser.getAttributeName(i))) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m19250b(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    /* renamed from: c */
    public static boolean m19249c(XmlPullParser xmlPullParser, String str) {
        return m19250b(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: d */
    public static boolean m19248d(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    /* renamed from: e */
    public static boolean m19247e(XmlPullParser xmlPullParser, String str) {
        return m19248d(xmlPullParser) && xmlPullParser.getName().equals(str);
    }
}
