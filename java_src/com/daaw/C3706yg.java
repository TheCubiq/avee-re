package com.daaw;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: com.daaw.yg */
/* loaded from: classes.dex */
public final class C3706yg {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f33639a = new ThreadLocal<>();

    /* renamed from: a */
    public static ColorStateList m3772a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m3771b(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    public static ColorStateList m3771b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m3768e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* renamed from: c */
    public static TypedValue m3770c() {
        ThreadLocal<TypedValue> threadLocal = f33639a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    /* renamed from: d */
    public static ColorStateList m3769d(Resources resources, int i, Resources.Theme theme) {
        try {
            return m3772a(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
        if (r9.hasValue(r12) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r9.hasValue(r12) != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList m3768e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        int i;
        int i2;
        int attributeCount;
        int i3;
        Resources resources2 = resources;
        int i4 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20];
        int[] iArr2 = new int[20];
        int i5 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i4 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray m3765h = m3765h(resources2, theme, attributeSet, r21.f24760b);
                int i6 = r21.f24761c;
                int resourceId = m3765h.getResourceId(i6, -1);
                if (resourceId != -1 && !m3767f(resources2, resourceId)) {
                    try {
                        color = m3772a(resources2, resources2.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        i6 = r21.f24761c;
                    }
                    float f = 1.0f;
                    i = r21.f24762d;
                    if (!m3765h.hasValue(i)) {
                        i = r21.f24764f;
                    }
                    f = m3765h.getFloat(i, 1.0f);
                    if (Build.VERSION.SDK_INT >= 31) {
                        i2 = r21.f24763e;
                    }
                    i2 = r21.f24765g;
                    float f2 = m3765h.getFloat(i2, -1.0f);
                    m3765h.recycle();
                    attributeCount = attributeSet.getAttributeCount();
                    int[] iArr3 = new int[attributeCount];
                    int i7 = 0;
                    for (i3 = 0; i3 < attributeCount; i3++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i3);
                        if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != u01.alpha && attributeNameResource != u01.lStar) {
                            int i8 = i7 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr3[i7] = attributeNameResource;
                            i7 = i8;
                        }
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr3, i7);
                    iArr2 = j80.m18738a(iArr2, i5, m3766g(color, f, f2));
                    iArr = (int[][]) j80.m18737b(iArr, i5, trimStateSet);
                    i5++;
                }
                color = m3765h.getColor(i6, -65281);
                float f3 = 1.0f;
                i = r21.f24762d;
                if (!m3765h.hasValue(i)) {
                }
                f3 = m3765h.getFloat(i, 1.0f);
                if (Build.VERSION.SDK_INT >= 31) {
                }
                i2 = r21.f24765g;
                float f22 = m3765h.getFloat(i2, -1.0f);
                m3765h.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr32 = new int[attributeCount];
                int i72 = 0;
                while (i3 < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr32, i72);
                iArr2 = j80.m18738a(iArr2, i5, m3766g(color, f3, f22));
                iArr = (int[][]) j80.m18737b(iArr, i5, trimStateSet2);
                i5++;
            }
            i4 = 1;
            resources2 = resources;
        }
        int[] iArr4 = new int[i5];
        int[][] iArr5 = new int[i5];
        System.arraycopy(iArr2, 0, iArr4, 0, i5);
        System.arraycopy(iArr, 0, iArr5, 0, i5);
        return new ColorStateList(iArr5, iArr4);
    }

    /* renamed from: f */
    public static boolean m3767f(Resources resources, int i) {
        TypedValue m3770c = m3770c();
        resources.getValue(i, m3770c, true);
        int i2 = m3770c.type;
        return i2 >= 28 && i2 <= 31;
    }

    /* renamed from: g */
    public static int m3766g(int i, float f, float f2) {
        boolean z = f2 >= 0.0f && f2 <= 100.0f;
        if (f != 1.0f || z) {
            int m10152b = sn0.m10152b((int) ((Color.alpha(i) * f) + 0.5f), 0, 255);
            if (z) {
                C2284nd m15237c = C2284nd.m15237c(i);
                i = C2284nd.m15227m(m15237c.m15230j(), m15237c.m15231i(), f2);
            }
            return (i & 16777215) | (m10152b << 24);
        }
        return i;
    }

    /* renamed from: h */
    public static TypedArray m3765h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
