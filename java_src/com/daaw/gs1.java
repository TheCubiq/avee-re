package com.daaw;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import com.daaw.bw0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class gs1 extends fs1 {

    /* renamed from: z */
    public static final PorterDuff.Mode f11634z = PorterDuff.Mode.SRC_IN;

    /* renamed from: q */
    public C1467h f11635q;

    /* renamed from: r */
    public PorterDuffColorFilter f11636r;

    /* renamed from: s */
    public ColorFilter f11637s;

    /* renamed from: t */
    public boolean f11638t;

    /* renamed from: u */
    public boolean f11639u;

    /* renamed from: v */
    public Drawable.ConstantState f11640v;

    /* renamed from: w */
    public final float[] f11641w;

    /* renamed from: x */
    public final Matrix f11642x;

    /* renamed from: y */
    public final Rect f11643y;

    /* renamed from: com.daaw.gs1$b */
    /* loaded from: classes.dex */
    public static class C1461b extends AbstractC1465f {
        public C1461b() {
        }

        public C1461b(C1461b c1461b) {
            super(c1461b);
        }

        @Override // com.daaw.gs1.AbstractC1465f
        /* renamed from: c */
        public boolean mo21273c() {
            return true;
        }

        /* renamed from: e */
        public void m21284e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (so1.m10118j(xmlPullParser, "pathData")) {
                TypedArray m10117k = so1.m10117k(resources, theme, attributeSet, C0567a3.f2727d);
                m21283f(m10117k, xmlPullParser);
                m10117k.recycle();
            }
        }

        /* renamed from: f */
        public final void m21283f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f11670b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f11669a = bw0.m25797d(string2);
            }
            this.f11671c = so1.m10121g(typedArray, xmlPullParser, "fillType", 2, 0);
        }
    }

    /* renamed from: com.daaw.gs1$c */
    /* loaded from: classes.dex */
    public static class C1462c extends AbstractC1465f {

        /* renamed from: e */
        public int[] f11644e;

        /* renamed from: f */
        public C2939sh f11645f;

        /* renamed from: g */
        public float f11646g;

        /* renamed from: h */
        public C2939sh f11647h;

        /* renamed from: i */
        public float f11648i;

        /* renamed from: j */
        public float f11649j;

        /* renamed from: k */
        public float f11650k;

        /* renamed from: l */
        public float f11651l;

        /* renamed from: m */
        public float f11652m;

        /* renamed from: n */
        public Paint.Cap f11653n;

        /* renamed from: o */
        public Paint.Join f11654o;

        /* renamed from: p */
        public float f11655p;

        public C1462c() {
            this.f11646g = 0.0f;
            this.f11648i = 1.0f;
            this.f11649j = 1.0f;
            this.f11650k = 0.0f;
            this.f11651l = 1.0f;
            this.f11652m = 0.0f;
            this.f11653n = Paint.Cap.BUTT;
            this.f11654o = Paint.Join.MITER;
            this.f11655p = 4.0f;
        }

        public C1462c(C1462c c1462c) {
            super(c1462c);
            this.f11646g = 0.0f;
            this.f11648i = 1.0f;
            this.f11649j = 1.0f;
            this.f11650k = 0.0f;
            this.f11651l = 1.0f;
            this.f11652m = 0.0f;
            this.f11653n = Paint.Cap.BUTT;
            this.f11654o = Paint.Join.MITER;
            this.f11655p = 4.0f;
            this.f11644e = c1462c.f11644e;
            this.f11645f = c1462c.f11645f;
            this.f11646g = c1462c.f11646g;
            this.f11648i = c1462c.f11648i;
            this.f11647h = c1462c.f11647h;
            this.f11671c = c1462c.f11671c;
            this.f11649j = c1462c.f11649j;
            this.f11650k = c1462c.f11650k;
            this.f11651l = c1462c.f11651l;
            this.f11652m = c1462c.f11652m;
            this.f11653n = c1462c.f11653n;
            this.f11654o = c1462c.f11654o;
            this.f11655p = c1462c.f11655p;
        }

        @Override // com.daaw.gs1.AbstractC1464e
        /* renamed from: a */
        public boolean mo21275a() {
            return this.f11647h.m10347i() || this.f11645f.m10347i();
        }

        @Override // com.daaw.gs1.AbstractC1464e
        /* renamed from: b */
        public boolean mo21274b(int[] iArr) {
            return this.f11645f.m10346j(iArr) | this.f11647h.m10346j(iArr);
        }

        /* renamed from: e */
        public final Paint.Cap m21282e(int i, Paint.Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        /* renamed from: f */
        public final Paint.Join m21281f(int i, Paint.Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        /* renamed from: g */
        public void m21280g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m10117k = so1.m10117k(resources, theme, attributeSet, C0567a3.f2726c);
            m21279h(m10117k, xmlPullParser, theme);
            m10117k.recycle();
        }

        public float getFillAlpha() {
            return this.f11649j;
        }

        public int getFillColor() {
            return this.f11647h.m10351e();
        }

        public float getStrokeAlpha() {
            return this.f11648i;
        }

        public int getStrokeColor() {
            return this.f11645f.m10351e();
        }

        public float getStrokeWidth() {
            return this.f11646g;
        }

        public float getTrimPathEnd() {
            return this.f11651l;
        }

        public float getTrimPathOffset() {
            return this.f11652m;
        }

        public float getTrimPathStart() {
            return this.f11650k;
        }

        /* renamed from: h */
        public final void m21279h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f11644e = null;
            if (so1.m10118j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f11670b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f11669a = bw0.m25797d(string2);
                }
                this.f11647h = so1.m10123e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f11649j = so1.m10122f(typedArray, xmlPullParser, "fillAlpha", 12, this.f11649j);
                this.f11653n = m21282e(so1.m10121g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f11653n);
                this.f11654o = m21281f(so1.m10121g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f11654o);
                this.f11655p = so1.m10122f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f11655p);
                this.f11645f = so1.m10123e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f11648i = so1.m10122f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f11648i);
                this.f11646g = so1.m10122f(typedArray, xmlPullParser, "strokeWidth", 4, this.f11646g);
                this.f11651l = so1.m10122f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f11651l);
                this.f11652m = so1.m10122f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f11652m);
                this.f11650k = so1.m10122f(typedArray, xmlPullParser, "trimPathStart", 5, this.f11650k);
                this.f11671c = so1.m10121g(typedArray, xmlPullParser, "fillType", 13, this.f11671c);
            }
        }

        public void setFillAlpha(float f) {
            this.f11649j = f;
        }

        public void setFillColor(int i) {
            this.f11647h.m10345k(i);
        }

        public void setStrokeAlpha(float f) {
            this.f11648i = f;
        }

        public void setStrokeColor(int i) {
            this.f11645f.m10345k(i);
        }

        public void setStrokeWidth(float f) {
            this.f11646g = f;
        }

        public void setTrimPathEnd(float f) {
            this.f11651l = f;
        }

        public void setTrimPathOffset(float f) {
            this.f11652m = f;
        }

        public void setTrimPathStart(float f) {
            this.f11650k = f;
        }
    }

    /* renamed from: com.daaw.gs1$d */
    /* loaded from: classes.dex */
    public static class C1463d extends AbstractC1464e {

        /* renamed from: a */
        public final Matrix f11656a;

        /* renamed from: b */
        public final ArrayList<AbstractC1464e> f11657b;

        /* renamed from: c */
        public float f11658c;

        /* renamed from: d */
        public float f11659d;

        /* renamed from: e */
        public float f11660e;

        /* renamed from: f */
        public float f11661f;

        /* renamed from: g */
        public float f11662g;

        /* renamed from: h */
        public float f11663h;

        /* renamed from: i */
        public float f11664i;

        /* renamed from: j */
        public final Matrix f11665j;

        /* renamed from: k */
        public int f11666k;

        /* renamed from: l */
        public int[] f11667l;

        /* renamed from: m */
        public String f11668m;

        public C1463d() {
            super();
            this.f11656a = new Matrix();
            this.f11657b = new ArrayList<>();
            this.f11658c = 0.0f;
            this.f11659d = 0.0f;
            this.f11660e = 0.0f;
            this.f11661f = 1.0f;
            this.f11662g = 1.0f;
            this.f11663h = 0.0f;
            this.f11664i = 0.0f;
            this.f11665j = new Matrix();
            this.f11668m = null;
        }

        public C1463d(C1463d c1463d, C1370g6<String, Object> c1370g6) {
            super();
            AbstractC1465f c1461b;
            this.f11656a = new Matrix();
            this.f11657b = new ArrayList<>();
            this.f11658c = 0.0f;
            this.f11659d = 0.0f;
            this.f11660e = 0.0f;
            this.f11661f = 1.0f;
            this.f11662g = 1.0f;
            this.f11663h = 0.0f;
            this.f11664i = 0.0f;
            Matrix matrix = new Matrix();
            this.f11665j = matrix;
            this.f11668m = null;
            this.f11658c = c1463d.f11658c;
            this.f11659d = c1463d.f11659d;
            this.f11660e = c1463d.f11660e;
            this.f11661f = c1463d.f11661f;
            this.f11662g = c1463d.f11662g;
            this.f11663h = c1463d.f11663h;
            this.f11664i = c1463d.f11664i;
            this.f11667l = c1463d.f11667l;
            String str = c1463d.f11668m;
            this.f11668m = str;
            this.f11666k = c1463d.f11666k;
            if (str != null) {
                c1370g6.put(str, this);
            }
            matrix.set(c1463d.f11665j);
            ArrayList<AbstractC1464e> arrayList = c1463d.f11657b;
            for (int i = 0; i < arrayList.size(); i++) {
                AbstractC1464e abstractC1464e = arrayList.get(i);
                if (abstractC1464e instanceof C1463d) {
                    this.f11657b.add(new C1463d((C1463d) abstractC1464e, c1370g6));
                } else {
                    if (abstractC1464e instanceof C1462c) {
                        c1461b = new C1462c((C1462c) abstractC1464e);
                    } else if (!(abstractC1464e instanceof C1461b)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    } else {
                        c1461b = new C1461b((C1461b) abstractC1464e);
                    }
                    this.f11657b.add(c1461b);
                    String str2 = c1461b.f11670b;
                    if (str2 != null) {
                        c1370g6.put(str2, c1461b);
                    }
                }
            }
        }

        @Override // com.daaw.gs1.AbstractC1464e
        /* renamed from: a */
        public boolean mo21275a() {
            for (int i = 0; i < this.f11657b.size(); i++) {
                if (this.f11657b.get(i).mo21275a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.daaw.gs1.AbstractC1464e
        /* renamed from: b */
        public boolean mo21274b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f11657b.size(); i++) {
                z |= this.f11657b.get(i).mo21274b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public void m21278c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m10117k = so1.m10117k(resources, theme, attributeSet, C0567a3.f2725b);
            m21276e(m10117k, xmlPullParser);
            m10117k.recycle();
        }

        /* renamed from: d */
        public final void m21277d() {
            this.f11665j.reset();
            this.f11665j.postTranslate(-this.f11659d, -this.f11660e);
            this.f11665j.postScale(this.f11661f, this.f11662g);
            this.f11665j.postRotate(this.f11658c, 0.0f, 0.0f);
            this.f11665j.postTranslate(this.f11663h + this.f11659d, this.f11664i + this.f11660e);
        }

        /* renamed from: e */
        public final void m21276e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f11667l = null;
            this.f11658c = so1.m10122f(typedArray, xmlPullParser, "rotation", 5, this.f11658c);
            this.f11659d = typedArray.getFloat(1, this.f11659d);
            this.f11660e = typedArray.getFloat(2, this.f11660e);
            this.f11661f = so1.m10122f(typedArray, xmlPullParser, "scaleX", 3, this.f11661f);
            this.f11662g = so1.m10122f(typedArray, xmlPullParser, "scaleY", 4, this.f11662g);
            this.f11663h = so1.m10122f(typedArray, xmlPullParser, "translateX", 6, this.f11663h);
            this.f11664i = so1.m10122f(typedArray, xmlPullParser, "translateY", 7, this.f11664i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f11668m = string;
            }
            m21277d();
        }

        public String getGroupName() {
            return this.f11668m;
        }

        public Matrix getLocalMatrix() {
            return this.f11665j;
        }

        public float getPivotX() {
            return this.f11659d;
        }

        public float getPivotY() {
            return this.f11660e;
        }

        public float getRotation() {
            return this.f11658c;
        }

        public float getScaleX() {
            return this.f11661f;
        }

        public float getScaleY() {
            return this.f11662g;
        }

        public float getTranslateX() {
            return this.f11663h;
        }

        public float getTranslateY() {
            return this.f11664i;
        }

        public void setPivotX(float f) {
            if (f != this.f11659d) {
                this.f11659d = f;
                m21277d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f11660e) {
                this.f11660e = f;
                m21277d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f11658c) {
                this.f11658c = f;
                m21277d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f11661f) {
                this.f11661f = f;
                m21277d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f11662g) {
                this.f11662g = f;
                m21277d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f11663h) {
                this.f11663h = f;
                m21277d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f11664i) {
                this.f11664i = f;
                m21277d();
            }
        }
    }

    /* renamed from: com.daaw.gs1$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1464e {
        public AbstractC1464e() {
        }

        /* renamed from: a */
        public boolean mo21275a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo21274b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: com.daaw.gs1$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1465f extends AbstractC1464e {

        /* renamed from: a */
        public bw0.C0891b[] f11669a;

        /* renamed from: b */
        public String f11670b;

        /* renamed from: c */
        public int f11671c;

        /* renamed from: d */
        public int f11672d;

        public AbstractC1465f() {
            super();
            this.f11669a = null;
            this.f11671c = 0;
        }

        public AbstractC1465f(AbstractC1465f abstractC1465f) {
            super();
            this.f11669a = null;
            this.f11671c = 0;
            this.f11670b = abstractC1465f.f11670b;
            this.f11672d = abstractC1465f.f11672d;
            this.f11669a = bw0.m25795f(abstractC1465f.f11669a);
        }

        /* renamed from: c */
        public boolean mo21273c() {
            return false;
        }

        /* renamed from: d */
        public void m21272d(Path path) {
            path.reset();
            bw0.C0891b[] c0891bArr = this.f11669a;
            if (c0891bArr != null) {
                bw0.C0891b.m25786e(c0891bArr, path);
            }
        }

        public bw0.C0891b[] getPathData() {
            return this.f11669a;
        }

        public String getPathName() {
            return this.f11670b;
        }

        public void setPathData(bw0.C0891b[] c0891bArr) {
            if (bw0.m25799b(this.f11669a, c0891bArr)) {
                bw0.m25791j(this.f11669a, c0891bArr);
            } else {
                this.f11669a = bw0.m25795f(c0891bArr);
            }
        }
    }

    /* renamed from: com.daaw.gs1$g */
    /* loaded from: classes.dex */
    public static class C1466g {

        /* renamed from: q */
        public static final Matrix f11673q = new Matrix();

        /* renamed from: a */
        public final Path f11674a;

        /* renamed from: b */
        public final Path f11675b;

        /* renamed from: c */
        public final Matrix f11676c;

        /* renamed from: d */
        public Paint f11677d;

        /* renamed from: e */
        public Paint f11678e;

        /* renamed from: f */
        public PathMeasure f11679f;

        /* renamed from: g */
        public int f11680g;

        /* renamed from: h */
        public final C1463d f11681h;

        /* renamed from: i */
        public float f11682i;

        /* renamed from: j */
        public float f11683j;

        /* renamed from: k */
        public float f11684k;

        /* renamed from: l */
        public float f11685l;

        /* renamed from: m */
        public int f11686m;

        /* renamed from: n */
        public String f11687n;

        /* renamed from: o */
        public Boolean f11688o;

        /* renamed from: p */
        public final C1370g6<String, Object> f11689p;

        public C1466g() {
            this.f11676c = new Matrix();
            this.f11682i = 0.0f;
            this.f11683j = 0.0f;
            this.f11684k = 0.0f;
            this.f11685l = 0.0f;
            this.f11686m = 255;
            this.f11687n = null;
            this.f11688o = null;
            this.f11689p = new C1370g6<>();
            this.f11681h = new C1463d();
            this.f11674a = new Path();
            this.f11675b = new Path();
        }

        public C1466g(C1466g c1466g) {
            this.f11676c = new Matrix();
            this.f11682i = 0.0f;
            this.f11683j = 0.0f;
            this.f11684k = 0.0f;
            this.f11685l = 0.0f;
            this.f11686m = 255;
            this.f11687n = null;
            this.f11688o = null;
            C1370g6<String, Object> c1370g6 = new C1370g6<>();
            this.f11689p = c1370g6;
            this.f11681h = new C1463d(c1466g.f11681h, c1370g6);
            this.f11674a = new Path(c1466g.f11674a);
            this.f11675b = new Path(c1466g.f11675b);
            this.f11682i = c1466g.f11682i;
            this.f11683j = c1466g.f11683j;
            this.f11684k = c1466g.f11684k;
            this.f11685l = c1466g.f11685l;
            this.f11680g = c1466g.f11680g;
            this.f11686m = c1466g.f11686m;
            this.f11687n = c1466g.f11687n;
            String str = c1466g.f11687n;
            if (str != null) {
                c1370g6.put(str, this);
            }
            this.f11688o = c1466g.f11688o;
        }

        /* renamed from: a */
        public static float m21271a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: b */
        public void m21270b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m21269c(this.f11681h, f11673q, canvas, i, i2, colorFilter);
        }

        /* renamed from: c */
        public final void m21269c(C1463d c1463d, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            c1463d.f11656a.set(matrix);
            c1463d.f11656a.preConcat(c1463d.f11665j);
            canvas.save();
            for (int i3 = 0; i3 < c1463d.f11657b.size(); i3++) {
                AbstractC1464e abstractC1464e = c1463d.f11657b.get(i3);
                if (abstractC1464e instanceof C1463d) {
                    m21269c((C1463d) abstractC1464e, c1463d.f11656a, canvas, i, i2, colorFilter);
                } else if (abstractC1464e instanceof AbstractC1465f) {
                    m21268d(c1463d, (AbstractC1465f) abstractC1464e, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        public final void m21268d(C1463d c1463d, AbstractC1465f abstractC1465f, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.f11684k;
            float f2 = i2 / this.f11685l;
            float min = Math.min(f, f2);
            Matrix matrix = c1463d.f11656a;
            this.f11676c.set(matrix);
            this.f11676c.postScale(f, f2);
            float m21267e = m21267e(matrix);
            if (m21267e == 0.0f) {
                return;
            }
            abstractC1465f.m21272d(this.f11674a);
            Path path = this.f11674a;
            this.f11675b.reset();
            if (abstractC1465f.mo21273c()) {
                this.f11675b.setFillType(abstractC1465f.f11671c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f11675b.addPath(path, this.f11676c);
                canvas.clipPath(this.f11675b);
                return;
            }
            C1462c c1462c = (C1462c) abstractC1465f;
            float f3 = c1462c.f11650k;
            if (f3 != 0.0f || c1462c.f11651l != 1.0f) {
                float f4 = c1462c.f11652m;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (c1462c.f11651l + f4) % 1.0f;
                if (this.f11679f == null) {
                    this.f11679f = new PathMeasure();
                }
                this.f11679f.setPath(this.f11674a, false);
                float length = this.f11679f.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                if (f7 > f8) {
                    this.f11679f.getSegment(f7, length, path, true);
                    this.f11679f.getSegment(0.0f, f8, path, true);
                } else {
                    this.f11679f.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f11675b.addPath(path, this.f11676c);
            if (c1462c.f11647h.m10344l()) {
                C2939sh c2939sh = c1462c.f11647h;
                if (this.f11678e == null) {
                    Paint paint = new Paint(1);
                    this.f11678e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f11678e;
                if (c2939sh.m10348h()) {
                    Shader m10350f = c2939sh.m10350f();
                    m10350f.setLocalMatrix(this.f11676c);
                    paint2.setShader(m10350f);
                    paint2.setAlpha(Math.round(c1462c.f11649j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(gs1.m21294a(c2939sh.m10351e(), c1462c.f11649j));
                }
                paint2.setColorFilter(colorFilter);
                this.f11675b.setFillType(c1462c.f11671c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f11675b, paint2);
            }
            if (c1462c.f11645f.m10344l()) {
                C2939sh c2939sh2 = c1462c.f11645f;
                if (this.f11677d == null) {
                    Paint paint3 = new Paint(1);
                    this.f11677d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f11677d;
                Paint.Join join = c1462c.f11654o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = c1462c.f11653n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(c1462c.f11655p);
                if (c2939sh2.m10348h()) {
                    Shader m10350f2 = c2939sh2.m10350f();
                    m10350f2.setLocalMatrix(this.f11676c);
                    paint4.setShader(m10350f2);
                    paint4.setAlpha(Math.round(c1462c.f11648i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(gs1.m21294a(c2939sh2.m10351e(), c1462c.f11648i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(c1462c.f11646g * min * m21267e);
                canvas.drawPath(this.f11675b, paint4);
            }
        }

        /* renamed from: e */
        public final float m21267e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float m21271a = m21271a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max > 0.0f) {
                return Math.abs(m21271a) / max;
            }
            return 0.0f;
        }

        /* renamed from: f */
        public boolean m21266f() {
            if (this.f11688o == null) {
                this.f11688o = Boolean.valueOf(this.f11681h.mo21275a());
            }
            return this.f11688o.booleanValue();
        }

        /* renamed from: g */
        public boolean m21265g(int[] iArr) {
            return this.f11681h.mo21274b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f11686m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f11686m = i;
        }
    }

    /* renamed from: com.daaw.gs1$h */
    /* loaded from: classes.dex */
    public static class C1467h extends Drawable.ConstantState {

        /* renamed from: a */
        public int f11690a;

        /* renamed from: b */
        public C1466g f11691b;

        /* renamed from: c */
        public ColorStateList f11692c;

        /* renamed from: d */
        public PorterDuff.Mode f11693d;

        /* renamed from: e */
        public boolean f11694e;

        /* renamed from: f */
        public Bitmap f11695f;

        /* renamed from: g */
        public ColorStateList f11696g;

        /* renamed from: h */
        public PorterDuff.Mode f11697h;

        /* renamed from: i */
        public int f11698i;

        /* renamed from: j */
        public boolean f11699j;

        /* renamed from: k */
        public boolean f11700k;

        /* renamed from: l */
        public Paint f11701l;

        public C1467h() {
            this.f11692c = null;
            this.f11693d = gs1.f11634z;
            this.f11691b = new C1466g();
        }

        public C1467h(C1467h c1467h) {
            this.f11692c = null;
            this.f11693d = gs1.f11634z;
            if (c1467h != null) {
                this.f11690a = c1467h.f11690a;
                C1466g c1466g = new C1466g(c1467h.f11691b);
                this.f11691b = c1466g;
                if (c1467h.f11691b.f11678e != null) {
                    c1466g.f11678e = new Paint(c1467h.f11691b.f11678e);
                }
                if (c1467h.f11691b.f11677d != null) {
                    this.f11691b.f11677d = new Paint(c1467h.f11691b.f11677d);
                }
                this.f11692c = c1467h.f11692c;
                this.f11693d = c1467h.f11693d;
                this.f11694e = c1467h.f11694e;
            }
        }

        /* renamed from: a */
        public boolean m21264a(int i, int i2) {
            return i == this.f11695f.getWidth() && i2 == this.f11695f.getHeight();
        }

        /* renamed from: b */
        public boolean m21263b() {
            return !this.f11700k && this.f11696g == this.f11692c && this.f11697h == this.f11693d && this.f11699j == this.f11694e && this.f11698i == this.f11691b.getRootAlpha();
        }

        /* renamed from: c */
        public void m21262c(int i, int i2) {
            if (this.f11695f == null || !m21264a(i, i2)) {
                this.f11695f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f11700k = true;
            }
        }

        /* renamed from: d */
        public void m21261d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f11695f, (Rect) null, rect, m21260e(colorFilter));
        }

        /* renamed from: e */
        public Paint m21260e(ColorFilter colorFilter) {
            if (m21259f() || colorFilter != null) {
                if (this.f11701l == null) {
                    Paint paint = new Paint();
                    this.f11701l = paint;
                    paint.setFilterBitmap(true);
                }
                this.f11701l.setAlpha(this.f11691b.getRootAlpha());
                this.f11701l.setColorFilter(colorFilter);
                return this.f11701l;
            }
            return null;
        }

        /* renamed from: f */
        public boolean m21259f() {
            return this.f11691b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean m21258g() {
            return this.f11691b.m21266f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11690a;
        }

        /* renamed from: h */
        public boolean m21257h(int[] iArr) {
            boolean m21265g = this.f11691b.m21265g(iArr);
            this.f11700k |= m21265g;
            return m21265g;
        }

        /* renamed from: i */
        public void m21256i() {
            this.f11696g = this.f11692c;
            this.f11697h = this.f11693d;
            this.f11698i = this.f11691b.getRootAlpha();
            this.f11699j = this.f11694e;
            this.f11700k = false;
        }

        /* renamed from: j */
        public void m21255j(int i, int i2) {
            this.f11695f.eraseColor(0);
            this.f11691b.m21270b(new Canvas(this.f11695f), i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new gs1(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new gs1(this);
        }
    }

    /* renamed from: com.daaw.gs1$i */
    /* loaded from: classes.dex */
    public static class C1468i extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f11702a;

        public C1468i(Drawable.ConstantState constantState) {
            this.f11702a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f11702a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11702a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            gs1 gs1Var = new gs1();
            gs1Var.f9848p = (VectorDrawable) this.f11702a.newDrawable();
            return gs1Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            gs1 gs1Var = new gs1();
            gs1Var.f9848p = (VectorDrawable) this.f11702a.newDrawable(resources);
            return gs1Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            gs1 gs1Var = new gs1();
            gs1Var.f9848p = (VectorDrawable) this.f11702a.newDrawable(resources, theme);
            return gs1Var;
        }
    }

    public gs1() {
        this.f11639u = true;
        this.f11641w = new float[9];
        this.f11642x = new Matrix();
        this.f11643y = new Rect();
        this.f11635q = new C1467h();
    }

    public gs1(C1467h c1467h) {
        this.f11639u = true;
        this.f11641w = new float[9];
        this.f11642x = new Matrix();
        this.f11643y = new Rect();
        this.f11635q = c1467h;
        this.f11636r = m21285j(this.f11636r, c1467h.f11692c, c1467h.f11693d);
    }

    /* renamed from: a */
    public static int m21294a(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    /* renamed from: b */
    public static gs1 m21293b(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            gs1 gs1Var = new gs1();
            gs1Var.f9848p = j51.m18896d(resources, i, theme);
            gs1Var.f11640v = new C1468i(gs1Var.f9848p.getConstantState());
            return gs1Var;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                return m21292c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static gs1 m21292c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        gs1 gs1Var = new gs1();
        gs1Var.inflate(resources, xmlPullParser, attributeSet, theme);
        return gs1Var;
    }

    /* renamed from: g */
    public static PorterDuff.Mode m21288g(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            C2366nu.m14825b(drawable);
            return false;
        }
        return false;
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* renamed from: d */
    public Object m21291d(String str) {
        return this.f11635q.f11691b.f11689p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f11643y);
        if (this.f11643y.width() <= 0 || this.f11643y.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f11637s;
        if (colorFilter == null) {
            colorFilter = this.f11636r;
        }
        canvas.getMatrix(this.f11642x);
        this.f11642x.getValues(this.f11641w);
        float abs = Math.abs(this.f11641w[0]);
        float abs2 = Math.abs(this.f11641w[4]);
        float abs3 = Math.abs(this.f11641w[1]);
        float abs4 = Math.abs(this.f11641w[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f11643y.width() * abs));
        int min2 = Math.min(2048, (int) (this.f11643y.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f11643y;
        canvas.translate(rect.left, rect.top);
        if (m21289f()) {
            canvas.translate(this.f11643y.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f11643y.offsetTo(0, 0);
        this.f11635q.m21262c(min, min2);
        if (!this.f11639u) {
            this.f11635q.m21255j(min, min2);
        } else if (!this.f11635q.m21263b()) {
            this.f11635q.m21255j(min, min2);
            this.f11635q.m21256i();
        }
        this.f11635q.m21261d(canvas, colorFilter, this.f11643y);
        canvas.restoreToCount(save);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public final void m21290e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        C1461b c1461b;
        C1467h c1467h = this.f11635q;
        C1466g c1466g = c1467h.f11691b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c1466g.f11681h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C1463d c1463d = (C1463d) arrayDeque.peek();
                if ("path".equals(name)) {
                    C1462c c1462c = new C1462c();
                    c1462c.m21280g(resources, attributeSet, theme, xmlPullParser);
                    c1463d.f11657b.add(c1462c);
                    if (c1462c.getPathName() != null) {
                        c1466g.f11689p.put(c1462c.getPathName(), c1462c);
                    }
                    z = false;
                    c1461b = c1462c;
                } else if ("clip-path".equals(name)) {
                    C1461b c1461b2 = new C1461b();
                    c1461b2.m21284e(resources, attributeSet, theme, xmlPullParser);
                    c1463d.f11657b.add(c1461b2);
                    String pathName = c1461b2.getPathName();
                    c1461b = c1461b2;
                    if (pathName != null) {
                        c1466g.f11689p.put(c1461b2.getPathName(), c1461b2);
                        c1461b = c1461b2;
                    }
                } else if ("group".equals(name)) {
                    C1463d c1463d2 = new C1463d();
                    c1463d2.m21278c(resources, attributeSet, theme, xmlPullParser);
                    c1463d.f11657b.add(c1463d2);
                    arrayDeque.push(c1463d2);
                    if (c1463d2.getGroupName() != null) {
                        c1466g.f11689p.put(c1463d2.getGroupName(), c1463d2);
                    }
                    i = c1467h.f11690a;
                    i2 = c1463d2.f11666k;
                    c1467h.f11690a = i2 | i;
                }
                i = c1467h.f11690a;
                i2 = c1461b.f11672d;
                c1467h.f11690a = i2 | i;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: f */
    public final boolean m21289f() {
        return isAutoMirrored() && C2366nu.m14821f(this) == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f9848p;
        return drawable != null ? C2366nu.m14823d(drawable) : this.f11635q.f11691b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f9848p;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f11635q.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f9848p;
        return drawable != null ? C2366nu.m14822e(drawable) : this.f11637s;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f9848p == null || Build.VERSION.SDK_INT < 24) {
            this.f11635q.f11690a = getChangingConfigurations();
            return this.f11635q;
        }
        return new C1468i(this.f9848p.getConstantState());
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f9848p;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f11635q.f11691b.f11683j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f9848p;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f11635q.f11691b.f11682i;
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* renamed from: h */
    public void m21287h(boolean z) {
        this.f11639u = z;
    }

    /* renamed from: i */
    public final void m21286i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        C1467h c1467h = this.f11635q;
        C1466g c1466g = c1467h.f11691b;
        c1467h.f11693d = m21288g(so1.m10121g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList m10125c = so1.m10125c(typedArray, xmlPullParser, theme, "tint", 1);
        if (m10125c != null) {
            c1467h.f11692c = m10125c;
        }
        c1467h.f11694e = so1.m10127a(typedArray, xmlPullParser, "autoMirrored", 5, c1467h.f11694e);
        c1466g.f11684k = so1.m10122f(typedArray, xmlPullParser, "viewportWidth", 7, c1466g.f11684k);
        float m10122f = so1.m10122f(typedArray, xmlPullParser, "viewportHeight", 8, c1466g.f11685l);
        c1466g.f11685l = m10122f;
        if (c1466g.f11684k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (m10122f <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            c1466g.f11682i = typedArray.getDimension(3, c1466g.f11682i);
            float dimension = typedArray.getDimension(2, c1466g.f11683j);
            c1466g.f11683j = dimension;
            if (c1466g.f11682i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            } else {
                c1466g.setAlpha(so1.m10122f(typedArray, xmlPullParser, "alpha", 4, c1466g.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    c1466g.f11687n = string;
                    c1466g.f11689p.put(string, c1466g);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            C2366nu.m14820g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C1467h c1467h = this.f11635q;
        c1467h.f11691b = new C1466g();
        TypedArray m10117k = so1.m10117k(resources, theme, attributeSet, C0567a3.f2724a);
        m21286i(m10117k, xmlPullParser, theme);
        m10117k.recycle();
        c1467h.f11690a = getChangingConfigurations();
        c1467h.f11700k = true;
        m21290e(resources, xmlPullParser, attributeSet, theme);
        this.f11636r = m21285j(this.f11636r, c1467h.f11692c, c1467h.f11693d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f9848p;
        return drawable != null ? C2366nu.m14819h(drawable) : this.f11635q.f11694e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C1467h c1467h;
        ColorStateList colorStateList;
        Drawable drawable = this.f9848p;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((c1467h = this.f11635q) != null && (c1467h.m21258g() || ((colorStateList = this.f11635q.f11692c) != null && colorStateList.isStateful())));
    }

    /* renamed from: j */
    public PorterDuffColorFilter m21285j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f11638t && super.mutate() == this) {
            this.f11635q = new C1467h(this.f11635q);
            this.f11638t = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C1467h c1467h = this.f11635q;
        ColorStateList colorStateList = c1467h.f11692c;
        if (colorStateList != null && (mode = c1467h.f11693d) != null) {
            this.f11636r = m21285j(this.f11636r, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (c1467h.m21258g() && c1467h.m21257h(iArr)) {
            invalidateSelf();
            return true;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f11635q.f11691b.getRootAlpha() != i) {
            this.f11635q.f11691b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            C2366nu.m14817j(drawable, z);
        } else {
            this.f11635q.f11694e = z;
        }
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f11637s = colorFilter;
        invalidateSelf();
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // com.daaw.fs1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTint(int i) {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            C2366nu.m14813n(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            C2366nu.m14812o(drawable, colorStateList);
            return;
        }
        C1467h c1467h = this.f11635q;
        if (c1467h.f11692c != colorStateList) {
            c1467h.f11692c = colorStateList;
            this.f11636r = m21285j(this.f11636r, colorStateList, c1467h.f11693d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            C2366nu.m14811p(drawable, mode);
            return;
        }
        C1467h c1467h = this.f11635q;
        if (c1467h.f11693d != mode) {
            c1467h.f11693d = mode;
            this.f11636r = m21285j(this.f11636r, c1467h.f11692c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f9848p;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f9848p;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
