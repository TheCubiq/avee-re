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
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class xg extends View {
    public Integer A;
    public Integer B;
    public Paint C;
    public Paint D;
    public Paint E;
    public tg F;
    public ArrayList<au0> G;
    public ArrayList<bu0> H;
    public vj0 I;
    public m2 J;
    public EditText K;
    public TextWatcher L;
    public LinearLayout M;
    public bh N;
    public int O;
    public int P;
    public Bitmap p;
    public Canvas q;
    public Bitmap r;
    public Canvas s;
    public boolean t;
    public int u;
    public float v;
    public float w;
    public int x;
    public Integer[] y;
    public int z;

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
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
                xg.this.h(Color.parseColor(charSequence.toString()), false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        FLOWER,
        CIRCLE;

        public static b a(int i) {
            if (i != 0 && i == 1) {
                return CIRCLE;
            }
            return FLOWER;
        }
    }

    public xg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.u = 8;
        this.v = 1.0f;
        this.w = 1.0f;
        this.x = 0;
        this.y = new Integer[]{null, null, null, null, null};
        this.z = 0;
        this.C = lv0.c().b(0).a();
        this.D = lv0.c().b(0).a();
        this.E = lv0.c().a();
        this.G = new ArrayList<>();
        this.H = new ArrayList<>();
        this.L = new a();
        g(context, attributeSet);
    }

    private void setColorPreviewColor(int i) {
        Integer[] numArr;
        int i2;
        LinearLayout linearLayout = this.M;
        if (linearLayout == null || (numArr = this.y) == null || (i2 = this.z) > numArr.length || numArr[i2] == null || linearLayout.getChildCount() == 0 || this.M.getVisibility() != 0) {
            return;
        }
        View childAt = this.M.getChildAt(this.z);
        if (childAt instanceof LinearLayout) {
            ((ImageView) ((LinearLayout) childAt).findViewById(w11.image_preview)).setImageDrawable(new ug(i));
        }
    }

    private void setColorText(int i) {
        EditText editText = this.K;
        if (editText == null) {
            return;
        }
        editText.setText(zq1.e(i, this.J != null));
    }

    private void setColorToSliders(int i) {
        vj0 vj0Var = this.I;
        if (vj0Var != null) {
            vj0Var.setColor(i);
        }
        m2 m2Var = this.J;
        if (m2Var != null) {
            m2Var.setColor(i);
        }
    }

    private void setHighlightedColor(int i) {
        int childCount = this.M.getChildCount();
        if (childCount == 0 || this.M.getVisibility() != 0) {
            return;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.M.getChildAt(i2);
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

    public void a(au0 au0Var) {
        this.G.add(au0Var);
    }

    public void b(bu0 bu0Var) {
        this.H.add(bu0Var);
    }

    public void c(int i, int i2) {
        ArrayList<au0> arrayList = this.G;
        if (arrayList == null || i == i2) {
            return;
        }
        Iterator<au0> it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                it.next().a(i2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void d() {
        this.q.drawColor(0, PorterDuff.Mode.CLEAR);
        this.s.drawColor(0, PorterDuff.Mode.CLEAR);
        if (this.N == null) {
            return;
        }
        float width = this.q.getWidth() / 2.0f;
        int i = this.u;
        float f = (width - 1.5374999f) - (width / i);
        ah b2 = this.N.b();
        b2.a = this.u;
        b2.b = f;
        b2.c = (f / (i - 1)) / 2.0f;
        b2.d = 1.5374999f;
        b2.e = this.w;
        b2.f = this.v;
        b2.g = this.q;
        this.N.c(b2);
        this.N.a();
    }

    public final tg e(int i) {
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
        tg tgVar = null;
        double d7 = Double.MAX_VALUE;
        for (tg tgVar2 : this.N.d()) {
            float[] b2 = tgVar2.b();
            double d8 = b2[c];
            double d9 = d6;
            double d10 = b2[c2];
            Double.isNaN(d10);
            double cos2 = Math.cos((d10 * 3.141592653589793d) / 180.0d);
            Double.isNaN(d8);
            double d11 = d8 * cos2;
            double d12 = b2[1];
            double d13 = b2[0];
            Double.isNaN(d13);
            double sin2 = Math.sin((d13 * 3.141592653589793d) / 180.0d);
            Double.isNaN(d12);
            double d14 = d12 * sin2;
            double d15 = d3 - d11;
            double d16 = d9 - d14;
            double d17 = (d15 * d15) + (d16 * d16);
            if (d17 < d7) {
                d7 = d17;
                tgVar = tgVar2;
            }
            d6 = d9;
            c = 1;
            c2 = 0;
        }
        return tgVar;
    }

    public final tg f(float f, float f2) {
        tg tgVar = null;
        double d = Double.MAX_VALUE;
        for (tg tgVar2 : this.N.d()) {
            double g = tgVar2.g(f, f2);
            if (d > g) {
                tgVar = tgVar2;
                d = g;
            }
        }
        return tgVar;
    }

    public final void g(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v21.s);
        this.u = obtainStyledAttributes.getInt(v21.u, 10);
        this.A = Integer.valueOf(obtainStyledAttributes.getInt(v21.v, -1));
        this.B = Integer.valueOf(obtainStyledAttributes.getInt(v21.x, -1));
        bh a2 = ch.a(b.a(obtainStyledAttributes.getInt(v21.y, 0)));
        this.O = obtainStyledAttributes.getResourceId(v21.t, 0);
        this.P = obtainStyledAttributes.getResourceId(v21.w, 0);
        setRenderer(a2);
        setDensity(this.u);
        i(this.A.intValue(), true);
        obtainStyledAttributes.recycle();
    }

    public Integer[] getAllColors() {
        return this.y;
    }

    public int getSelectedColor() {
        tg tgVar = this.F;
        return zq1.a(this.w, tgVar != null ? zq1.c(tgVar.a(), this.v) : 0);
    }

    public void h(int i, boolean z) {
        i(i, z);
        j();
        invalidate();
    }

    public void i(int i, boolean z) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        this.w = zq1.d(i);
        this.v = fArr[2];
        this.y[this.z] = Integer.valueOf(i);
        this.A = Integer.valueOf(i);
        setColorPreviewColor(i);
        setColorToSliders(i);
        if (this.K != null && z) {
            setColorText(i);
        }
        this.F = e(i);
    }

    public final void j() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight < measuredWidth) {
            measuredWidth = measuredHeight;
        }
        if (measuredWidth <= 0) {
            return;
        }
        Bitmap bitmap = this.p;
        if (bitmap == null || bitmap.getWidth() != measuredWidth) {
            this.p = Bitmap.createBitmap(measuredWidth, measuredWidth, Bitmap.Config.ARGB_8888);
            this.q = new Canvas(this.p);
            this.E.setShader(lv0.b(26));
        }
        Bitmap bitmap2 = this.r;
        if (bitmap2 == null || bitmap2.getWidth() != measuredWidth) {
            this.r = Bitmap.createBitmap(measuredWidth, measuredWidth, Bitmap.Config.ARGB_8888);
            this.s = new Canvas(this.r);
        }
        d();
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        tg tgVar;
        super.onDraw(canvas);
        canvas.drawColor(this.x);
        float width = ((canvas.getWidth() / 1.025f) / this.u) / 2.0f;
        if (this.p == null || (tgVar = this.F) == null) {
            return;
        }
        this.C.setColor(Color.HSVToColor(tgVar.c(this.v)));
        this.C.setAlpha((int) (this.w * 255.0f));
        float f = 4.0f + width;
        this.s.drawCircle(this.F.d(), this.F.e(), f, this.E);
        this.s.drawCircle(this.F.d(), this.F.e(), f, this.C);
        this.D = lv0.c().b(-1).e(Paint.Style.STROKE).d(0.5f * width).f(PorterDuff.Mode.CLEAR).a();
        if (this.t) {
            this.q.drawCircle(this.F.d(), this.F.e(), (this.D.getStrokeWidth() / 2.0f) + width, this.D);
        }
        canvas.drawBitmap(this.p, 0.0f, 0.0f, (Paint) null);
        this.s.drawCircle(this.F.d(), this.F.e(), width + (this.D.getStrokeWidth() / 2.0f), this.D);
        canvas.drawBitmap(this.r, 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.O != 0) {
            setAlphaSlider((m2) getRootView().findViewById(this.O));
        }
        if (this.P != 0) {
            setLightnessSlider((vj0) getRootView().findViewById(this.P));
        }
        j();
        this.F = e(this.A.intValue());
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
        j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r0 != 2) goto L6;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == 0) goto L38
            if (r0 == r1) goto Ld
            r2 = 2
            if (r0 == r2) goto L38
            goto L60
        Ld:
            int r4 = r3.getSelectedColor()
            java.util.ArrayList<com.daaw.bu0> r0 = r3.H
            if (r0 == 0) goto L2e
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r0.next()
            com.daaw.bu0 r2 = (com.daaw.bu0) r2
            r2.a(r4)     // Catch: java.lang.Exception -> L29
            goto L19
        L29:
            r2 = move-exception
            r2.printStackTrace()
            goto L19
        L2e:
            r3.setColorToSliders(r4)
            r3.setColorText(r4)
            r3.setColorPreviewColor(r4)
            goto L5d
        L38:
            int r0 = r3.getSelectedColor()
            float r2 = r4.getX()
            float r4 = r4.getY()
            com.daaw.tg r4 = r3.f(r2, r4)
            r3.F = r4
            int r4 = r3.getSelectedColor()
            r3.c(r0, r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r3.A = r0
            r3.setColorToSliders(r4)
            r3.j()
        L5d:
            r3.invalidate()
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.xg.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        j();
        this.F = e(this.A.intValue());
    }

    public void setAlphaSlider(m2 m2Var) {
        this.J = m2Var;
        if (m2Var != null) {
            m2Var.setColorPicker(this);
            this.J.setColor(getSelectedColor());
        }
    }

    public void setAlphaValue(float f) {
        Integer num;
        int selectedColor = getSelectedColor();
        this.w = f;
        Integer valueOf = Integer.valueOf(Color.HSVToColor(zq1.b(f), this.F.c(this.v)));
        this.A = valueOf;
        EditText editText = this.K;
        if (editText != null) {
            editText.setText(zq1.e(valueOf.intValue(), this.J != null));
        }
        vj0 vj0Var = this.I;
        if (vj0Var != null && (num = this.A) != null) {
            vj0Var.setColor(num.intValue());
        }
        c(selectedColor, this.A.intValue());
        j();
        invalidate();
    }

    public void setColorEdit(EditText editText) {
        this.K = editText;
        if (editText != null) {
            editText.setVisibility(0);
            this.K.addTextChangedListener(this.L);
            setColorEditTextColor(this.B.intValue());
        }
    }

    public void setColorEditTextColor(int i) {
        this.B = Integer.valueOf(i);
        EditText editText = this.K;
        if (editText != null) {
            editText.setTextColor(i);
        }
    }

    public void setDensity(int i) {
        this.u = Math.max(2, i);
        invalidate();
    }

    public void setLightness(float f) {
        Integer num;
        int selectedColor = getSelectedColor();
        this.v = f;
        if (this.F != null) {
            Integer valueOf = Integer.valueOf(Color.HSVToColor(zq1.b(this.w), this.F.c(f)));
            this.A = valueOf;
            EditText editText = this.K;
            if (editText != null) {
                editText.setText(zq1.e(valueOf.intValue(), this.J != null));
            }
            m2 m2Var = this.J;
            if (m2Var != null && (num = this.A) != null) {
                m2Var.setColor(num.intValue());
            }
            c(selectedColor, this.A.intValue());
            j();
            invalidate();
        }
    }

    public void setLightnessSlider(vj0 vj0Var) {
        this.I = vj0Var;
        if (vj0Var != null) {
            vj0Var.setColorPicker(this);
            this.I.setColor(getSelectedColor());
        }
    }

    public void setRenderer(bh bhVar) {
        this.N = bhVar;
        invalidate();
    }

    public void setSelectedColor(int i) {
        Integer[] numArr = this.y;
        if (numArr == null || numArr.length < i) {
            return;
        }
        this.z = i;
        setHighlightedColor(i);
        Integer num = this.y[i];
        if (num == null) {
            return;
        }
        h(num.intValue(), true);
    }

    public void setShowBorder(boolean z) {
        this.t = z;
    }
}
