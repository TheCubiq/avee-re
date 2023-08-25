package com.daaw;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class so1 {
    /* renamed from: a */
    public static boolean m10127a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !m10118j(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: b */
    public static int m10126b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m10118j(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    /* renamed from: c */
    public static ColorStateList m10125c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (m10118j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 != 2) {
                return (i2 < 28 || i2 > 31) ? C3706yg.m3769d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme) : m10124d(typedValue);
            }
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
        }
        return null;
    }

    /* renamed from: d */
    public static ColorStateList m10124d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: e */
    public static C2939sh m10123e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (m10118j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C2939sh.m10354b(typedValue.data);
            }
            C2939sh m10349g = C2939sh.m10349g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (m10349g != null) {
                return m10349g;
            }
        }
        return C2939sh.m10354b(i2);
    }

    /* renamed from: f */
    public static float m10122f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m10118j(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: g */
    public static int m10121g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m10118j(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: h */
    public static int m10120h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m10118j(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }

    /* renamed from: i */
    public static String m10119i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m10118j(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m10118j(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: k */
    public static TypedArray m10117k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: l */
    public static TypedValue m10116l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m10118j(xmlPullParser, str)) {
            return typedArray.peekValue(i);
        }
        return null;
    }
}
