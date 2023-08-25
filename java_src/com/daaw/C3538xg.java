package com.daaw;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.daaw.xg */
/* loaded from: classes.dex */
public class C3538xg extends View {

    /* renamed from: A */
    public Integer f32663A;

    /* renamed from: B */
    public Integer f32664B;

    /* renamed from: C */
    public Paint f32665C;

    /* renamed from: D */
    public Paint f32666D;

    /* renamed from: E */
    public Paint f32667E;

    /* renamed from: F */
    public C3073tg f32668F;

    /* renamed from: G */
    public ArrayList<au0> f32669G;

    /* renamed from: H */
    public ArrayList<bu0> f32670H;

    /* renamed from: I */
    public vj0 f32671I;

    /* renamed from: J */
    public C2146m2 f32672J;

    /* renamed from: K */
    public EditText f32673K;

    /* renamed from: L */
    public TextWatcher f32674L;

    /* renamed from: M */
    public LinearLayout f32675M;

    /* renamed from: N */
    public InterfaceC0841bh f32676N;

    /* renamed from: O */
    public int f32677O;

    /* renamed from: P */
    public int f32678P;

    /* renamed from: p */
    public Bitmap f32679p;

    /* renamed from: q */
    public Canvas f32680q;

    /* renamed from: r */
    public Bitmap f32681r;

    /* renamed from: s */
    public Canvas f32682s;

    /* renamed from: t */
    public boolean f32683t;

    /* renamed from: u */
    public int f32684u;

    /* renamed from: v */
    public float f32685v;

    /* renamed from: w */
    public float f32686w;

    /* renamed from: x */
    public int f32687x;

    /* renamed from: y */
    public Integer[] f32688y;

    /* renamed from: z */
    public int f32689z;

    /* renamed from: com.daaw.xg$a */
    /* loaded from: classes.dex */
    public class C3539a implements TextWatcher {
        public C3539a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                C3538xg.this.m5144h(Color.parseColor(charSequence.toString()), false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.daaw.xg$b */
    /* loaded from: classes.dex */
    public enum EnumC3540b {
        FLOWER,
        CIRCLE;

        /* renamed from: a */
        public static EnumC3540b m5141a(int i) {
            if (i != 0 && i == 1) {
                return CIRCLE;
            }
            return FLOWER;
        }
    }

    public C3538xg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32684u = 8;
        this.f32685v = 1.0f;
        this.f32686w = 1.0f;
        this.f32687x = 0;
        this.f32688y = new Integer[]{null, null, null, null, null};
        this.f32689z = 0;
        this.f32665C = lv0.m16490c().m16488b(0).m16489a();
        this.f32666D = lv0.m16490c().m16488b(0).m16489a();
        this.f32667E = lv0.m16490c().m16489a();
        this.f32669G = new ArrayList<>();
        this.f32670H = new ArrayList<>();
        this.f32674L = new C3539a();
        m5145g(context, attributeSet);
    }

    private void setColorPreviewColor(int i) {
        Integer[] numArr;
        int i2;
        LinearLayout linearLayout = this.f32675M;
        if (linearLayout == null || (numArr = this.f32688y) == null || (i2 = this.f32689z) > numArr.length || numArr[i2] == null || linearLayout.getChildCount() == 0 || this.f32675M.getVisibility() != 0) {
            return;
        }
        View childAt = this.f32675M.getChildAt(this.f32689z);
        if (childAt instanceof LinearLayout) {
            ((ImageView) ((LinearLayout) childAt).findViewById(w11.image_preview)).setImageDrawable(new C3206ug(i));
        }
    }

    private void setColorText(int i) {
        EditText editText = this.f32673K;
        if (editText == null) {
            return;
        }
        editText.setText(zq1.m1983e(i, this.f32672J != null));
    }

    private void setColorToSliders(int i) {
        vj0 vj0Var = this.f32671I;
        if (vj0Var != null) {
            vj0Var.setColor(i);
        }
        C2146m2 c2146m2 = this.f32672J;
        if (c2146m2 != null) {
            c2146m2.setColor(i);
        }
    }

    private void setHighlightedColor(int i) {
        int childCount = this.f32675M.getChildCount();
        if (childCount == 0 || this.f32675M.getVisibility() != 0) {
            return;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f32675M.getChildAt(i2);
            if (childAt instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) childAt;
                if (i2 == i) {
                    linearLayout.setBackgroundColor(-1);
                } else {
                    linearLayout.setBackgroundColor(0);
                }
            }
        }
    }

    /* renamed from: a */
    public void m5151a(au0 au0Var) {
        this.f32669G.add(au0Var);
    }

    /* renamed from: b */
    public void m5150b(bu0 bu0Var) {
        this.f32670H.add(bu0Var);
    }

    /* renamed from: c */
    public void m5149c(int i, int i2) {
        ArrayList<au0> arrayList = this.f32669G;
        if (arrayList == null || i == i2) {
            return;
        }
        Iterator<au0> it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo16705a(i2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public final void m5148d() {
        this.f32680q.drawColor(0, PorterDuff.Mode.CLEAR);
        this.f32682s.drawColor(0, PorterDuff.Mode.CLEAR);
        if (this.f32676N == null) {
            return;
        }
        float width = this.f32680q.getWidth() / 2.0f;
        int i = this.f32684u;
        float f = (width - 1.5374999f) - (width / i);
        C0627ah mo25714b = this.f32676N.mo25714b();
        mo25714b.f3185a = this.f32684u;
        mo25714b.f3186b = f;
        mo25714b.f3187c = (f / (i - 1)) / 2.0f;
        mo25714b.f3188d = 1.5374999f;
        mo25714b.f3189e = this.f32686w;
        mo25714b.f3190f = this.f32685v;
        mo25714b.f3191g = this.f32680q;
        this.f32676N.mo25713c(mo25714b);
        this.f32676N.mo10753a();
    }

    /* renamed from: e */
    public final C3073tg m5147e(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        char c = 1;
        double d = fArr[1];
        char c2 = 0;
        double d2 = fArr[0];
        Double.isNaN(d2);
        double cos = Math.cos((d2 * 3.141592653589793d) / 180.0d);
        Double.isNaN(d);
        double d3 = d * cos;
        double d4 = fArr[1];
        double d5 = fArr[0];
        Double.isNaN(d5);
        double sin = Math.sin((d5 * 3.141592653589793d) / 180.0d);
        Double.isNaN(d4);
        double d6 = d4 * sin;
        C3073tg c3073tg = null;
        double d7 = Double.MAX_VALUE;
        for (C3073tg c3073tg2 : this.f32676N.mo25712d()) {
            float[] m9191b = c3073tg2.m9191b();
            double d8 = m9191b[c];
            double d9 = d6;
            double d10 = m9191b[c2];
            Double.isNaN(d10);
            double cos2 = Math.cos((d10 * 3.141592653589793d) / 180.0d);
            Double.isNaN(d8);
            double d11 = d8 * cos2;
            double d12 = m9191b[1];
            double d13 = m9191b[0];
            Double.isNaN(d13);
            double sin2 = Math.sin((d13 * 3.141592653589793d) / 180.0d);
            Double.isNaN(d12);
            double d14 = d12 * sin2;
            double d15 = d3 - d11;
            double d16 = d9 - d14;
            double d17 = (d15 * d15) + (d16 * d16);
            if (d17 < d7) {
                d7 = d17;
                c3073tg = c3073tg2;
            }
            d6 = d9;
            c = 1;
            c2 = 0;
        }
        return c3073tg;
    }

    /* renamed from: f */
    public final C3073tg m5146f(float f, float f2) {
        C3073tg c3073tg = null;
        double d = Double.MAX_VALUE;
        for (C3073tg c3073tg2 : this.f32676N.mo25712d()) {
            double m9186g = c3073tg2.m9186g(f, f2);
            if (d > m9186g) {
                c3073tg = c3073tg2;
                d = m9186g;
            }
        }
        return c3073tg;
    }

    /* renamed from: g */
    public final void m5145g(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v21.f29768s);
        this.f32684u = obtainStyledAttributes.getInt(v21.f29770u, 10);
        this.f32663A = Integer.valueOf(obtainStyledAttributes.getInt(v21.f29771v, -1));
        this.f32664B = Integer.valueOf(obtainStyledAttributes.getInt(v21.f29773x, -1));
        InterfaceC0841bh m25386a = C0952ch.m25386a(EnumC3540b.m5141a(obtainStyledAttributes.getInt(v21.f29774y, 0)));
        this.f32677O = obtainStyledAttributes.getResourceId(v21.f29769t, 0);
        this.f32678P = obtainStyledAttributes.getResourceId(v21.f29772w, 0);
        setRenderer(m25386a);
        setDensity(this.f32684u);
        m5143i(this.f32663A.intValue(), true);
        obtainStyledAttributes.recycle();
    }

    public Integer[] getAllColors() {
        return this.f32688y;
    }

    public int getSelectedColor() {
        C3073tg c3073tg = this.f32668F;
        return zq1.m1987a(this.f32686w, c3073tg != null ? zq1.m1985c(c3073tg.m9192a(), this.f32685v) : 0);
    }

    /* renamed from: h */
    public void m5144h(int i, boolean z) {
        m5143i(i, z);
        m5142j();
        invalidate();
    }

    /* renamed from: i */
    public void m5143i(int i, boolean z) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        this.f32686w = zq1.m1984d(i);
        this.f32685v = fArr[2];
        this.f32688y[this.f32689z] = Integer.valueOf(i);
        this.f32663A = Integer.valueOf(i);
        setColorPreviewColor(i);
        setColorToSliders(i);
        if (this.f32673K != null && z) {
            setColorText(i);
        }
        this.f32668F = m5147e(i);
    }

    /* renamed from: j */
    public final void m5142j() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight < measuredWidth) {
            measuredWidth = measuredHeight;
        }
        if (measuredWidth <= 0) {
            return;
        }
        Bitmap bitmap = this.f32679p;
        if (bitmap == null || bitmap.getWidth() != measuredWidth) {
            this.f32679p = Bitmap.createBitmap(measuredWidth, measuredWidth, Bitmap.Config.ARGB_8888);
            this.f32680q = new Canvas(this.f32679p);
            this.f32667E.setShader(lv0.m16491b(26));
        }
        Bitmap bitmap2 = this.f32681r;
        if (bitmap2 == null || bitmap2.getWidth() != measuredWidth) {
            this.f32681r = Bitmap.createBitmap(measuredWidth, measuredWidth, Bitmap.Config.ARGB_8888);
            this.f32682s = new Canvas(this.f32681r);
        }
        m5148d();
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        C3073tg c3073tg;
        super.onDraw(canvas);
        canvas.drawColor(this.f32687x);
        float width = ((canvas.getWidth() / 1.025f) / this.f32684u) / 2.0f;
        if (this.f32679p == null || (c3073tg = this.f32668F) == null) {
            return;
        }
        this.f32665C.setColor(Color.HSVToColor(c3073tg.m9190c(this.f32685v)));
        this.f32665C.setAlpha((int) (this.f32686w * 255.0f));
        float f = 4.0f + width;
        this.f32682s.drawCircle(this.f32668F.m9189d(), this.f32668F.m9188e(), f, this.f32667E);
        this.f32682s.drawCircle(this.f32668F.m9189d(), this.f32668F.m9188e(), f, this.f32665C);
        this.f32666D = lv0.m16490c().m16488b(-1).m16485e(Paint.Style.STROKE).m16486d(0.5f * width).m16484f(PorterDuff.Mode.CLEAR).m16489a();
        if (this.f32683t) {
            this.f32680q.drawCircle(this.f32668F.m9189d(), this.f32668F.m9188e(), (this.f32666D.getStrokeWidth() / 2.0f) + width, this.f32666D);
        }
        canvas.drawBitmap(this.f32679p, 0.0f, 0.0f, (Paint) null);
        this.f32682s.drawCircle(this.f32668F.m9189d(), this.f32668F.m9188e(), width + (this.f32666D.getStrokeWidth() / 2.0f), this.f32666D);
        canvas.drawBitmap(this.f32681r, 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f32677O != 0) {
            setAlphaSlider((C2146m2) getRootView().findViewById(this.f32677O));
        }
        if (this.f32678P != 0) {
            setLightnessSlider((vj0) getRootView().findViewById(this.f32678P));
        }
        m5142j();
        this.f32668F = m5147e(this.f32663A.intValue());
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        if (mode != 0) {
            i = (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.getSize(i) : 0;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 != 0) {
            i2 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? View.MeasureSpec.getSize(i2) : 0;
        }
        if (i2 < i) {
            i = i2;
        }
        setMeasuredDimension(i, i);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m5142j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r0 != 2) goto L6;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                int selectedColor = getSelectedColor();
                ArrayList<bu0> arrayList = this.f32670H;
                if (arrayList != null) {
                    Iterator<bu0> it = arrayList.iterator();
                    while (it.hasNext()) {
                        try {
                            it.next().mo15889a(selectedColor);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                setColorToSliders(selectedColor);
                setColorText(selectedColor);
                setColorPreviewColor(selectedColor);
                invalidate();
                return true;
            }
        }
        int selectedColor2 = getSelectedColor();
        this.f32668F = m5146f(motionEvent.getX(), motionEvent.getY());
        int selectedColor3 = getSelectedColor();
        m5149c(selectedColor2, selectedColor3);
        this.f32663A = Integer.valueOf(selectedColor3);
        setColorToSliders(selectedColor3);
        m5142j();
        invalidate();
        return true;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m5142j();
        this.f32668F = m5147e(this.f32663A.intValue());
    }

    public void setAlphaSlider(C2146m2 c2146m2) {
        this.f32672J = c2146m2;
        if (c2146m2 != null) {
            c2146m2.setColorPicker(this);
            this.f32672J.setColor(getSelectedColor());
        }
    }

    public void setAlphaValue(float f) {
        Integer num;
        int selectedColor = getSelectedColor();
        this.f32686w = f;
        Integer valueOf = Integer.valueOf(Color.HSVToColor(zq1.m1986b(f), this.f32668F.m9190c(this.f32685v)));
        this.f32663A = valueOf;
        EditText editText = this.f32673K;
        if (editText != null) {
            editText.setText(zq1.m1983e(valueOf.intValue(), this.f32672J != null));
        }
        vj0 vj0Var = this.f32671I;
        if (vj0Var != null && (num = this.f32663A) != null) {
            vj0Var.setColor(num.intValue());
        }
        m5149c(selectedColor, this.f32663A.intValue());
        m5142j();
        invalidate();
    }

    public void setColorEdit(EditText editText) {
        this.f32673K = editText;
        if (editText != null) {
            editText.setVisibility(0);
            this.f32673K.addTextChangedListener(this.f32674L);
            setColorEditTextColor(this.f32664B.intValue());
        }
    }

    public void setColorEditTextColor(int i) {
        this.f32664B = Integer.valueOf(i);
        EditText editText = this.f32673K;
        if (editText != null) {
            editText.setTextColor(i);
        }
    }

    public void setDensity(int i) {
        this.f32684u = Math.max(2, i);
        invalidate();
    }

    public void setLightness(float f) {
        Integer num;
        int selectedColor = getSelectedColor();
        this.f32685v = f;
        if (this.f32668F != null) {
            Integer valueOf = Integer.valueOf(Color.HSVToColor(zq1.m1986b(this.f32686w), this.f32668F.m9190c(f)));
            this.f32663A = valueOf;
            EditText editText = this.f32673K;
            if (editText != null) {
                editText.setText(zq1.m1983e(valueOf.intValue(), this.f32672J != null));
            }
            C2146m2 c2146m2 = this.f32672J;
            if (c2146m2 != null && (num = this.f32663A) != null) {
                c2146m2.setColor(num.intValue());
            }
            m5149c(selectedColor, this.f32663A.intValue());
            m5142j();
            invalidate();
        }
    }

    public void setLightnessSlider(vj0 vj0Var) {
        this.f32671I = vj0Var;
        if (vj0Var != null) {
            vj0Var.setColorPicker(this);
            this.f32671I.setColor(getSelectedColor());
        }
    }

    public void setRenderer(InterfaceC0841bh interfaceC0841bh) {
        this.f32676N = interfaceC0841bh;
        invalidate();
    }

    public void setSelectedColor(int i) {
        Integer[] numArr = this.f32688y;
        if (numArr == null || numArr.length < i) {
            return;
        }
        this.f32689z = i;
        setHighlightedColor(i);
        Integer num = this.f32688y[i];
        if (num == null) {
            return;
        }
        m5144h(num.intValue(), true);
    }

    public void setShowBorder(boolean z) {
        this.f32683t = z;
    }
}
