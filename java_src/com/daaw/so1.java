package com.daaw;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class so1 {
    public static boolean a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !j(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    public static int b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !j(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    public static ColorStateList c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 != 2) {
                return (i2 < 28 || i2 > 31) ? yg.d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme) : d(typedValue);
            }
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
        }
        return null;
    }

    public static ColorStateList d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static sh e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return sh.b(typedValue.data);
            }
            sh g = sh.g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (g != null) {
                return g;
            }
        }
        return sh.b(i2);
    }

    public static float f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !j(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !j(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static int h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !j(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }

    public static String i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (j(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    public static boolean j(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static TypedValue l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (j(xmlPullParser, str)) {
            return typedArray.peekValue(i);
        }
        return null;
    }
}
