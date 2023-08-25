package com.daaw;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.C0182c;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: com.daaw.nj */
/* loaded from: classes.dex */
public class C2294nj {

    /* renamed from: a */
    public final ConstraintLayout f20142a;

    /* renamed from: b */
    public int f20143b = -1;

    /* renamed from: c */
    public int f20144c = -1;

    /* renamed from: d */
    public SparseArray<C2295a> f20145d = new SparseArray<>();

    /* renamed from: e */
    public SparseArray<C0182c> f20146e = new SparseArray<>();

    /* renamed from: com.daaw.nj$a */
    /* loaded from: classes.dex */
    public static class C2295a {

        /* renamed from: a */
        public int f20147a;

        /* renamed from: b */
        public ArrayList<C2296b> f20148b = new ArrayList<>();

        /* renamed from: c */
        public int f20149c;

        /* renamed from: d */
        public C0182c f20150d;

        public C2295a(Context context, XmlPullParser xmlPullParser) {
            this.f20149c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), p21.f22242E4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == p21.f22248F4) {
                    this.f20147a = obtainStyledAttributes.getResourceId(index, this.f20147a);
                } else if (index == p21.f22254G4) {
                    this.f20149c = obtainStyledAttributes.getResourceId(index, this.f20149c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f20149c);
                    context.getResources().getResourceName(this.f20149c);
                    if ("layout".equals(resourceTypeName)) {
                        C0182c c0182c = new C0182c();
                        this.f20150d = c0182c;
                        c0182c.m29855f(context, this.f20149c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void m15155a(C2296b c2296b) {
            this.f20148b.add(c2296b);
        }
    }

    /* renamed from: com.daaw.nj$b */
    /* loaded from: classes.dex */
    public static class C2296b {

        /* renamed from: a */
        public float f20151a;

        /* renamed from: b */
        public float f20152b;

        /* renamed from: c */
        public float f20153c;

        /* renamed from: d */
        public float f20154d;

        /* renamed from: e */
        public int f20155e;

        /* renamed from: f */
        public C0182c f20156f;

        public C2296b(Context context, XmlPullParser xmlPullParser) {
            this.f20151a = Float.NaN;
            this.f20152b = Float.NaN;
            this.f20153c = Float.NaN;
            this.f20154d = Float.NaN;
            this.f20155e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), p21.f22375a5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == p21.f22382b5) {
                    this.f20155e = obtainStyledAttributes.getResourceId(index, this.f20155e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f20155e);
                    context.getResources().getResourceName(this.f20155e);
                    if ("layout".equals(resourceTypeName)) {
                        C0182c c0182c = new C0182c();
                        this.f20156f = c0182c;
                        c0182c.m29855f(context, this.f20155e);
                    }
                } else if (index == p21.f22389c5) {
                    this.f20154d = obtainStyledAttributes.getDimension(index, this.f20154d);
                } else if (index == p21.f22396d5) {
                    this.f20152b = obtainStyledAttributes.getDimension(index, this.f20152b);
                } else if (index == p21.f22403e5) {
                    this.f20153c = obtainStyledAttributes.getDimension(index, this.f20153c);
                } else if (index == p21.f22410f5) {
                    this.f20151a = obtainStyledAttributes.getDimension(index, this.f20151a);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public C2294nj(Context context, ConstraintLayout constraintLayout, int i) {
        this.f20142a = constraintLayout;
        m15158a(context, i);
    }

    /* renamed from: a */
    public final void m15158a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        C2295a c2295a = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    char c = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (c != 0 && c != 1) {
                        if (c == 2) {
                            c2295a = new C2295a(context, xml);
                            this.f20145d.put(c2295a.f20147a, c2295a);
                            continue;
                        } else if (c == 3) {
                            C2296b c2296b = new C2296b(context, xml);
                            if (c2295a != null) {
                                c2295a.m15155a(c2296b);
                                continue;
                            } else {
                                continue;
                            }
                        } else if (c != 4) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("unknown tag ");
                            sb.append(name);
                            continue;
                        } else {
                            m15157b(context, xml);
                            continue;
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void m15157b(Context context, XmlPullParser xmlPullParser) {
        C0182c c0182c = new C0182c();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if ("id".equals(xmlPullParser.getAttributeName(i))) {
                String attributeValue = xmlPullParser.getAttributeValue(i);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                c0182c.m29847n(context, xmlPullParser);
                this.f20146e.put(identifier, c0182c);
                return;
            }
        }
    }

    /* renamed from: c */
    public void m15156c(AbstractC3080tj abstractC3080tj) {
    }
}
