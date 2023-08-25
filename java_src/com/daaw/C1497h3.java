package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import com.daaw.bw0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: com.daaw.h3 */
/* loaded from: classes.dex */
public class C1497h3 {

    /* renamed from: com.daaw.h3$a */
    /* loaded from: classes.dex */
    public static class C1498a implements TypeEvaluator<bw0.C0891b[]> {

        /* renamed from: a */
        public bw0.C0891b[] f11980a;

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public bw0.C0891b[] evaluate(float f, bw0.C0891b[] c0891bArr, bw0.C0891b[] c0891bArr2) {
            if (bw0.m25799b(c0891bArr, c0891bArr2)) {
                if (!bw0.m25799b(this.f11980a, c0891bArr)) {
                    this.f11980a = bw0.m25795f(c0891bArr);
                }
                for (int i = 0; i < c0891bArr.length; i++) {
                    this.f11980a[i].m25787d(c0891bArr[i], c0891bArr2[i], f);
                }
                return this.f11980a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* renamed from: a */
    public static Animator m21078a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) {
        return m21077b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Animator m21077b(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i, float f) {
        int i2;
        int depth = xmlPullParser.getDepth();
        ValueAnimator valueAnimator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            i2 = 0;
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (name.equals("objectAnimator")) {
                        valueAnimator = m21065n(context, resources, theme, attributeSet, f, xmlPullParser);
                    } else if (name.equals("animator")) {
                        valueAnimator = m21067l(context, resources, theme, attributeSet, null, f, xmlPullParser);
                    } else {
                        if (name.equals("set")) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            TypedArray m10117k = so1.m10117k(resources, theme, attributeSet, C0567a3.f2731h);
                            m21077b(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, so1.m10121g(m10117k, xmlPullParser, "ordering", 0, 0), f);
                            m10117k.recycle();
                            valueAnimator = animatorSet2;
                        } else if (!name.equals("propertyValuesHolder")) {
                            throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                        } else {
                            PropertyValuesHolder[] m21063p = m21063p(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser));
                            if (m21063p != null && (valueAnimator instanceof ValueAnimator)) {
                                valueAnimator.setValues(m21063p);
                            }
                            i2 = 1;
                        }
                        if (animatorSet != null && i2 == 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(valueAnimator);
                        }
                    }
                    if (animatorSet != null) {
                        if (arrayList == null) {
                        }
                        arrayList.add(valueAnimator);
                    }
                }
            }
        }
        if (animatorSet != null && arrayList != null) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorArr[i2] = (Animator) it.next();
                i2++;
            }
            if (i == 0) {
                animatorSet.playTogether(animatorArr);
            } else {
                animatorSet.playSequentially(animatorArr);
            }
        }
        return valueAnimator;
    }

    /* renamed from: c */
    public static Keyframe m21076c(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    /* renamed from: d */
    public static void m21075d(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((i2 - i) + 2);
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* renamed from: e */
    public static PropertyValuesHolder m21074e(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder ofFloat;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i4 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i5 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((z && m21071h(i4)) || (z2 && m21071h(i5))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i != 2) {
            C3668y5 m4103a = i == 3 ? C3668y5.m4103a() : null;
            if (z3) {
                if (z) {
                    float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                    if (z2) {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                    } else {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                }
                propertyValuesHolder = ofFloat;
            } else if (z) {
                int dimension2 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : m21071h(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
                if (z2) {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m21071h(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z2) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m21071h(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
            }
            if (propertyValuesHolder == null || m4103a == null) {
                return propertyValuesHolder;
            }
            propertyValuesHolder.setEvaluator(m4103a);
            return propertyValuesHolder;
        }
        String string = typedArray.getString(i2);
        String string2 = typedArray.getString(i3);
        bw0.C0891b[] m25797d = bw0.m25797d(string);
        bw0.C0891b[] m25797d2 = bw0.m25797d(string2);
        if (m25797d == null && m25797d2 == null) {
            return null;
        }
        if (m25797d == null) {
            if (m25797d2 != null) {
                return PropertyValuesHolder.ofObject(str, new C1498a(), m25797d2);
            }
            return null;
        }
        C1498a c1498a = new C1498a();
        if (m25797d2 == null) {
            ofObject = PropertyValuesHolder.ofObject(str, c1498a, m25797d);
        } else if (!bw0.m25799b(m25797d, m25797d2)) {
            throw new InflateException(" Can't morph from " + string + " to " + string2);
        } else {
            ofObject = PropertyValuesHolder.ofObject(str, c1498a, m25797d, m25797d2);
        }
        return ofObject;
    }

    /* renamed from: f */
    public static int m21073f(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z = peekValue != null;
        int i3 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        boolean z2 = peekValue2 != null;
        return ((z && m21071h(i3)) || (z2 && m21071h(z2 ? peekValue2.type : 0))) ? 3 : 0;
    }

    /* renamed from: g */
    public static int m21072g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m10117k = so1.m10117k(resources, theme, attributeSet, C0567a3.f2733j);
        int i = 0;
        TypedValue m10116l = so1.m10116l(m10117k, xmlPullParser, "value", 0);
        if ((m10116l != null) && m21071h(m10116l.type)) {
            i = 3;
        }
        m10117k.recycle();
        return i;
    }

    /* renamed from: h */
    public static boolean m21071h(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: i */
    public static Animator m21070i(Context context, int i) {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i) : m21069j(context, context.getResources(), context.getTheme(), i);
    }

    /* renamed from: j */
    public static Animator m21069j(Context context, Resources resources, Resources.Theme theme, int i) {
        return m21068k(context, resources, theme, i, 1.0f);
    }

    /* renamed from: k */
    public static Animator m21068k(Context context, Resources resources, Resources.Theme theme, int i, float f) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i);
                    return m21078a(context, resources, theme, xmlResourceParser, f);
                } catch (XmlPullParserException e) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                    notFoundException.initCause(e);
                    throw notFoundException;
                }
            } catch (IOException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    /* renamed from: l */
    public static ValueAnimator m21067l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray m10117k = so1.m10117k(resources, theme, attributeSet, C0567a3.f2730g);
        TypedArray m10117k2 = so1.m10117k(resources, theme, attributeSet, C0567a3.f2734k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m21062q(valueAnimator, m10117k, m10117k2, f, xmlPullParser);
        int m10120h = so1.m10120h(m10117k, xmlPullParser, "interpolator", 0, 0);
        if (m10120h > 0) {
            valueAnimator.setInterpolator(C1358g3.m22056b(context, m10120h));
        }
        m10117k.recycle();
        if (m10117k2 != null) {
            m10117k2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: m */
    public static Keyframe m21066m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) {
        TypedArray m10117k = so1.m10117k(resources, theme, attributeSet, C0567a3.f2733j);
        float m10122f = so1.m10122f(m10117k, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue m10116l = so1.m10116l(m10117k, xmlPullParser, "value", 0);
        boolean z = m10116l != null;
        if (i == 4) {
            i = (z && m21071h(m10116l.type)) ? 3 : 0;
        }
        Keyframe ofInt = z ? i != 0 ? (i == 1 || i == 3) ? Keyframe.ofInt(m10122f, so1.m10121g(m10117k, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(m10122f, so1.m10122f(m10117k, xmlPullParser, "value", 0, 0.0f)) : i == 0 ? Keyframe.ofFloat(m10122f) : Keyframe.ofInt(m10122f);
        int m10120h = so1.m10120h(m10117k, xmlPullParser, "interpolator", 1, 0);
        if (m10120h > 0) {
            ofInt.setInterpolator(C1358g3.m22056b(context, m10120h));
        }
        m10117k.recycle();
        return ofInt;
    }

    /* renamed from: n */
    public static ObjectAnimator m21065n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m21067l(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: o */
    public static PropertyValuesHolder m21064o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i) {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            } else if (xmlPullParser.getName().equals("keyframe")) {
                if (i == 4) {
                    i = m21072g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe m21066m = m21066m(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i, xmlPullParser);
                if (m21066m != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m21066m);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), m21076c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, m21076c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i2 = 0; i2 < size; i2++) {
                Keyframe keyframe3 = keyframeArr[i2];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i2 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i3 = size - 1;
                        if (i2 == i3) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i4 = i2;
                            for (int i5 = i2 + 1; i5 < i3 && keyframeArr[i5].getFraction() < 0.0f; i5++) {
                                i4 = i5;
                            }
                            m21075d(keyframeArr, keyframeArr[i4 + 1].getFraction() - keyframeArr[i2 - 1].getFraction(), i2, i4);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i == 3) {
                propertyValuesHolder.setEvaluator(C3668y5.m4103a());
            }
        }
        return propertyValuesHolder;
    }

    /* renamed from: p */
    public static PropertyValuesHolder[] m21063p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        int i;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("propertyValuesHolder")) {
                TypedArray m10117k = so1.m10117k(resources, theme, attributeSet, C0567a3.f2732i);
                String m10119i = so1.m10119i(m10117k, xmlPullParser, "propertyName", 3);
                int m10121g = so1.m10121g(m10117k, xmlPullParser, "valueType", 2, 4);
                PropertyValuesHolder m21064o = m21064o(context, resources, theme, xmlPullParser, m10119i, m10121g);
                if (m21064o == null) {
                    m21064o = m21074e(m10117k, m10121g, 0, 1, m10119i);
                }
                if (m21064o != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m21064o);
                }
                m10117k.recycle();
            }
            xmlPullParser.next();
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i = 0; i < size; i++) {
                propertyValuesHolderArr[i] = (PropertyValuesHolder) arrayList.get(i);
            }
        }
        return propertyValuesHolderArr;
    }

    /* renamed from: q */
    public static void m21062q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long m10121g = so1.m10121g(typedArray, xmlPullParser, "duration", 1, 300);
        long m10121g2 = so1.m10121g(typedArray, xmlPullParser, "startOffset", 2, 0);
        int m10121g3 = so1.m10121g(typedArray, xmlPullParser, "valueType", 7, 4);
        if (so1.m10118j(xmlPullParser, "valueFrom") && so1.m10118j(xmlPullParser, "valueTo")) {
            if (m10121g3 == 4) {
                m10121g3 = m21073f(typedArray, 5, 6);
            }
            PropertyValuesHolder m21074e = m21074e(typedArray, m10121g3, 5, 6, "");
            if (m21074e != null) {
                valueAnimator.setValues(m21074e);
            }
        }
        valueAnimator.setDuration(m10121g);
        valueAnimator.setStartDelay(m10121g2);
        valueAnimator.setRepeatCount(so1.m10121g(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(so1.m10121g(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m21061r(valueAnimator, typedArray2, m10121g3, f, xmlPullParser);
        }
    }

    /* renamed from: r */
    public static void m21061r(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String m10119i = so1.m10119i(typedArray, xmlPullParser, "pathData", 1);
        if (m10119i == null) {
            objectAnimator.setPropertyName(so1.m10119i(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String m10119i2 = so1.m10119i(typedArray, xmlPullParser, "propertyXName", 2);
        String m10119i3 = so1.m10119i(typedArray, xmlPullParser, "propertyYName", 3);
        if (i != 2) {
        }
        if (m10119i2 != null || m10119i3 != null) {
            m21060s(bw0.m25796e(m10119i), objectAnimator, f * 0.5f, m10119i2, m10119i3);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    /* renamed from: s */
    public static void m21060s(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f2 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f3 = 0.0f;
        do {
            f3 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f3));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f3 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f4 = f3 / (min - 1);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f2 += f4;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f2 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder ofFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            objectAnimator.setValues(ofFloat2);
        } else if (ofFloat2 == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, ofFloat2);
        }
    }
}
