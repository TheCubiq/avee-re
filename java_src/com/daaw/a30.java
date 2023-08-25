package com.daaw;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class a30 {

    /* renamed from: com.daaw.a30$a */
    /* loaded from: classes.dex */
    public static class C0568a {
        /* renamed from: a */
        public static int m27736a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    /* renamed from: com.daaw.a30$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0569b {
    }

    /* renamed from: com.daaw.a30$c */
    /* loaded from: classes.dex */
    public static final class C0570c implements InterfaceC0569b {

        /* renamed from: a */
        public final C0571d[] f2736a;

        public C0570c(C0571d[] c0571dArr) {
            this.f2736a = c0571dArr;
        }

        /* renamed from: a */
        public C0571d[] m27735a() {
            return this.f2736a;
        }
    }

    /* renamed from: com.daaw.a30$d */
    /* loaded from: classes.dex */
    public static final class C0571d {

        /* renamed from: a */
        public final String f2737a;

        /* renamed from: b */
        public final int f2738b;

        /* renamed from: c */
        public final boolean f2739c;

        /* renamed from: d */
        public final String f2740d;

        /* renamed from: e */
        public final int f2741e;

        /* renamed from: f */
        public final int f2742f;

        public C0571d(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f2737a = str;
            this.f2738b = i;
            this.f2739c = z;
            this.f2740d = str2;
            this.f2741e = i2;
            this.f2742f = i3;
        }

        /* renamed from: a */
        public String m27734a() {
            return this.f2737a;
        }

        /* renamed from: b */
        public int m27733b() {
            return this.f2742f;
        }

        /* renamed from: c */
        public int m27732c() {
            return this.f2741e;
        }

        /* renamed from: d */
        public String m27731d() {
            return this.f2740d;
        }

        /* renamed from: e */
        public int m27730e() {
            return this.f2738b;
        }

        /* renamed from: f */
        public boolean m27729f() {
            return this.f2739c;
        }
    }

    /* renamed from: com.daaw.a30$e */
    /* loaded from: classes.dex */
    public static final class C0572e implements InterfaceC0569b {

        /* renamed from: a */
        public final x20 f2743a;

        /* renamed from: b */
        public final int f2744b;

        /* renamed from: c */
        public final int f2745c;

        /* renamed from: d */
        public final String f2746d;

        public C0572e(x20 x20Var, int i, int i2, String str) {
            this.f2743a = x20Var;
            this.f2745c = i;
            this.f2744b = i2;
            this.f2746d = str;
        }

        /* renamed from: a */
        public int m27728a() {
            return this.f2745c;
        }

        /* renamed from: b */
        public x20 m27727b() {
            return this.f2743a;
        }

        /* renamed from: c */
        public String m27726c() {
            return this.f2746d;
        }

        /* renamed from: d */
        public int m27725d() {
            return this.f2744b;
        }
    }

    /* renamed from: a */
    public static int m27744a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0568a.m27736a(typedArray, i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /* renamed from: b */
    public static InterfaceC0569b m27743b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m27741d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: c */
    public static List<List<byte[]>> m27742c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m27744a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m27737h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m27737h(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    public static InterfaceC0569b m27741d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m27740e(xmlPullParser, resources);
        }
        m27738g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    public static InterfaceC0569b m27740e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), r21.f24766h);
        String string = obtainAttributes.getString(r21.f24767i);
        String string2 = obtainAttributes.getString(r21.f24771m);
        String string3 = obtainAttributes.getString(r21.f24772n);
        int resourceId = obtainAttributes.getResourceId(r21.f24768j, 0);
        int integer = obtainAttributes.getInteger(r21.f24769k, 1);
        int integer2 = obtainAttributes.getInteger(r21.f24770l, 500);
        String string4 = obtainAttributes.getString(r21.f24773o);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m27738g(xmlPullParser);
            }
            return new C0572e(new x20(string, string2, string3, m27742c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(m27739f(xmlPullParser, resources));
                } else {
                    m27738g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C0570c((C0571d[]) arrayList.toArray(new C0571d[0]));
    }

    /* renamed from: f */
    public static C0571d m27739f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), r21.f24774p);
        int i = r21.f24783y;
        if (!obtainAttributes.hasValue(i)) {
            i = r21.f24776r;
        }
        int i2 = obtainAttributes.getInt(i, 400);
        int i3 = r21.f24781w;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = r21.f24777s;
        }
        boolean z = 1 == obtainAttributes.getInt(i3, 0);
        int i4 = r21.f24784z;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = r21.f24778t;
        }
        int i5 = r21.f24782x;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = r21.f24779u;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = r21.f24780v;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = r21.f24775q;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m27738g(xmlPullParser);
        }
        return new C0571d(string2, i2, z, string, i6, resourceId);
    }

    /* renamed from: g */
    public static void m27738g(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: h */
    public static List<byte[]> m27737h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
