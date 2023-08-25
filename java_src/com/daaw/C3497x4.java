package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: com.daaw.x4 */
/* loaded from: classes.dex */
public class C3497x4 {

    /* renamed from: l */
    public static final RectF f32077l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m */
    public static ConcurrentHashMap<String, Method> f32078m = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: n */
    public static ConcurrentHashMap<String, Field> f32079n = new ConcurrentHashMap<>();

    /* renamed from: a */
    public int f32080a = 0;

    /* renamed from: b */
    public boolean f32081b = false;

    /* renamed from: c */
    public float f32082c = -1.0f;

    /* renamed from: d */
    public float f32083d = -1.0f;

    /* renamed from: e */
    public float f32084e = -1.0f;

    /* renamed from: f */
    public int[] f32085f = new int[0];

    /* renamed from: g */
    public boolean f32086g = false;

    /* renamed from: h */
    public TextPaint f32087h;

    /* renamed from: i */
    public final TextView f32088i;

    /* renamed from: j */
    public final Context f32089j;

    /* renamed from: k */
    public final C3503f f32090k;

    /* renamed from: com.daaw.x4$a */
    /* loaded from: classes.dex */
    public static final class C3498a {
        /* renamed from: a */
        public static StaticLayout m5547a(CharSequence charSequence, Layout.Alignment alignment, int i, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        /* renamed from: b */
        public static int m5546b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* renamed from: com.daaw.x4$b */
    /* loaded from: classes.dex */
    public static final class C3499b {
        /* renamed from: a */
        public static boolean m5545a(View view) {
            return view.isInLayout();
        }
    }

    /* renamed from: com.daaw.x4$c */
    /* loaded from: classes.dex */
    public static final class C3500c {
        /* renamed from: a */
        public static StaticLayout m5544a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, C3503f c3503f) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                c3503f.mo5543a(obtain, textView);
            } catch (ClassCastException unused) {
            }
            return obtain.build();
        }
    }

    /* renamed from: com.daaw.x4$d */
    /* loaded from: classes.dex */
    public static class C3501d extends C3503f {
        @Override // com.daaw.C3497x4.C3503f
        /* renamed from: a */
        public void mo5543a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C3497x4.m5561m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: com.daaw.x4$e */
    /* loaded from: classes.dex */
    public static class C3502e extends C3501d {
        @Override // com.daaw.C3497x4.C3501d, com.daaw.C3497x4.C3503f
        /* renamed from: a */
        public void mo5543a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // com.daaw.C3497x4.C3503f
        /* renamed from: b */
        public boolean mo5542b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* renamed from: com.daaw.x4$f */
    /* loaded from: classes.dex */
    public static class C3503f {
        /* renamed from: a */
        public void mo5543a(StaticLayout.Builder builder, TextView textView) {
        }

        /* renamed from: b */
        public boolean mo5542b(TextView textView) {
            return ((Boolean) C3497x4.m5561m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public C3497x4(TextView textView) {
        this.f32088i = textView;
        this.f32089j = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        this.f32090k = i >= 29 ? new C3502e() : i >= 23 ? new C3501d() : new C3503f();
    }

    /* renamed from: k */
    public static Method m5563k(String str) {
        try {
            Method method = f32078m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f32078m.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to retrieve TextView#");
            sb.append(str);
            sb.append("() method");
            return null;
        }
    }

    /* renamed from: m */
    public static <T> T m5561m(Object obj, String str, T t) {
        try {
            return (T) m5563k(str).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to invoke TextView#");
            sb.append(str);
            sb.append("() method");
            return t;
        }
    }

    /* renamed from: a */
    public void m5573a() {
        if (m5560n()) {
            if (this.f32081b) {
                if (this.f32088i.getMeasuredHeight() <= 0 || this.f32088i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f32090k.mo5542b(this.f32088i) ? 1048576 : (this.f32088i.getMeasuredWidth() - this.f32088i.getTotalPaddingLeft()) - this.f32088i.getTotalPaddingRight();
                int height = (this.f32088i.getHeight() - this.f32088i.getCompoundPaddingBottom()) - this.f32088i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f32077l;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float m5569e = m5569e(rectF);
                    if (m5569e != this.f32088i.getTextSize()) {
                        m5554t(0, m5569e);
                    }
                }
            }
            this.f32081b = true;
        }
    }

    /* renamed from: b */
    public final int[] m5572b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: c */
    public final void m5571c() {
        this.f32080a = 0;
        this.f32083d = -1.0f;
        this.f32084e = -1.0f;
        this.f32082c = -1.0f;
        this.f32085f = new int[0];
        this.f32081b = false;
    }

    /* renamed from: d */
    public StaticLayout m5570d(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        return Build.VERSION.SDK_INT >= 23 ? C3500c.m5544a(charSequence, alignment, i, i2, this.f32088i, this.f32087h, this.f32090k) : C3498a.m5547a(charSequence, alignment, i, this.f32088i, this.f32087h);
    }

    /* renamed from: e */
    public final int m5569e(RectF rectF) {
        int length = this.f32085f.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m5550x(this.f32085f[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f32085f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: f */
    public int m5568f() {
        return Math.round(this.f32084e);
    }

    /* renamed from: g */
    public int m5567g() {
        return Math.round(this.f32083d);
    }

    /* renamed from: h */
    public int m5566h() {
        return Math.round(this.f32082c);
    }

    /* renamed from: i */
    public int[] m5565i() {
        return this.f32085f;
    }

    /* renamed from: j */
    public int m5564j() {
        return this.f32080a;
    }

    /* renamed from: l */
    public void m5562l(int i) {
        TextPaint textPaint = this.f32087h;
        if (textPaint == null) {
            this.f32087h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f32087h.set(this.f32088i.getPaint());
        this.f32087h.setTextSize(i);
    }

    /* renamed from: n */
    public boolean m5560n() {
        return m5549y() && this.f32080a != 0;
    }

    /* renamed from: o */
    public void m5559o(AttributeSet attributeSet, int i) {
        int resourceId;
        Context context = this.f32089j;
        int[] iArr = x21.f31913g0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView = this.f32088i;
        xs1.m4706p0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = x21.f31938l0;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f32080a = obtainStyledAttributes.getInt(i2, 0);
        }
        int i3 = x21.f31933k0;
        float dimension = obtainStyledAttributes.hasValue(i3) ? obtainStyledAttributes.getDimension(i3, -1.0f) : -1.0f;
        int i4 = x21.f31923i0;
        float dimension2 = obtainStyledAttributes.hasValue(i4) ? obtainStyledAttributes.getDimension(i4, -1.0f) : -1.0f;
        int i5 = x21.f31918h0;
        float dimension3 = obtainStyledAttributes.hasValue(i5) ? obtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i6 = x21.f31928j0;
        if (obtainStyledAttributes.hasValue(i6) && (resourceId = obtainStyledAttributes.getResourceId(i6, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m5552v(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m5549y()) {
            this.f32080a = 0;
        } else if (this.f32080a == 1) {
            if (!this.f32086g) {
                DisplayMetrics displayMetrics = this.f32089j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m5548z(dimension2, dimension3, dimension);
            }
            m5553u();
        }
    }

    /* renamed from: p */
    public void m5558p(int i, int i2, int i3, int i4) {
        if (m5549y()) {
            DisplayMetrics displayMetrics = this.f32089j.getResources().getDisplayMetrics();
            m5548z(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (m5553u()) {
                m5573a();
            }
        }
    }

    /* renamed from: q */
    public void m5557q(int[] iArr, int i) {
        if (m5549y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f32089j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f32085f = m5572b(iArr2);
                if (!m5551w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f32086g = false;
            }
            if (m5553u()) {
                m5573a();
            }
        }
    }

    /* renamed from: r */
    public void m5556r(int i) {
        if (m5549y()) {
            if (i == 0) {
                m5571c();
            } else if (i != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            } else {
                DisplayMetrics displayMetrics = this.f32089j.getResources().getDisplayMetrics();
                m5548z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (m5553u()) {
                    m5573a();
                }
            }
        }
    }

    /* renamed from: s */
    public final void m5555s(float f) {
        if (f != this.f32088i.getPaint().getTextSize()) {
            this.f32088i.getPaint().setTextSize(f);
            boolean m5545a = C3499b.m5545a(this.f32088i);
            if (this.f32088i.getLayout() != null) {
                this.f32081b = false;
                try {
                    Method m5563k = m5563k("nullLayouts");
                    if (m5563k != null) {
                        m5563k.invoke(this.f32088i, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (m5545a) {
                    this.f32088i.forceLayout();
                } else {
                    this.f32088i.requestLayout();
                }
                this.f32088i.invalidate();
            }
        }
    }

    /* renamed from: t */
    public void m5554t(int i, float f) {
        Context context = this.f32089j;
        m5555s(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    /* renamed from: u */
    public final boolean m5553u() {
        if (m5549y() && this.f32080a == 1) {
            if (!this.f32086g || this.f32085f.length == 0) {
                int floor = ((int) Math.floor((this.f32084e - this.f32083d) / this.f32082c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f32083d + (i * this.f32082c));
                }
                this.f32085f = m5572b(iArr);
            }
            this.f32081b = true;
        } else {
            this.f32081b = false;
        }
        return this.f32081b;
    }

    /* renamed from: v */
    public final void m5552v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f32085f = m5572b(iArr);
            m5551w();
        }
    }

    /* renamed from: w */
    public final boolean m5551w() {
        int[] iArr = this.f32085f;
        int length = iArr.length;
        boolean z = length > 0;
        this.f32086g = z;
        if (z) {
            this.f32080a = 1;
            this.f32083d = iArr[0];
            this.f32084e = iArr[length - 1];
            this.f32082c = -1.0f;
        }
        return z;
    }

    /* renamed from: x */
    public final boolean m5550x(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f32088i.getText();
        TransformationMethod transformationMethod = this.f32088i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f32088i)) != null) {
            text = transformation;
        }
        int m5546b = C3498a.m5546b(this.f32088i);
        m5562l(i);
        StaticLayout m5570d = m5570d(text, (Layout.Alignment) m5561m(this.f32088i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), m5546b);
        return (m5546b == -1 || (m5570d.getLineCount() <= m5546b && m5570d.getLineEnd(m5570d.getLineCount() - 1) == text.length())) && ((float) m5570d.getHeight()) <= rectF.bottom;
    }

    /* renamed from: y */
    public final boolean m5549y() {
        return !(this.f32088i instanceof AppCompatEditText);
    }

    /* renamed from: z */
    public final void m5548z(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        } else {
            this.f32080a = 1;
            this.f32083d = f;
            this.f32084e = f2;
            this.f32082c = f3;
            this.f32086g = false;
        }
    }
}
