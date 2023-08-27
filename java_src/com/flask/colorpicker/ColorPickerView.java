package com.flask.colorpicker;

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
import com.flask.colorpicker.builder.ColorWheelRendererBuilder;
import com.flask.colorpicker.builder.PaintBuilder;
import com.flask.colorpicker.renderer.ColorWheelRenderOption;
import com.flask.colorpicker.renderer.ColorWheelRenderer;
import com.flask.colorpicker.slider.AlphaSlider;
import com.flask.colorpicker.slider.LightnessSlider;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class ColorPickerView extends View {
    private static final float STROKE_RATIO = 1.5f;
    private float alpha;
    private Paint alphaPatternPaint;
    private AlphaSlider alphaSlider;
    private int alphaSliderViewId;
    private int backgroundColor;
    private ArrayList<OnColorChangedListener> colorChangedListeners;
    private EditText colorEdit;
    private LinearLayout colorPreview;
    private int colorSelection;
    private TextWatcher colorTextChange;
    private Bitmap colorWheel;
    private Canvas colorWheelCanvas;
    private Paint colorWheelFill;
    private Bitmap currentColor;
    private Canvas currentColorCanvas;
    private ColorCircle currentColorCircle;
    private int density;
    private Integer initialColor;
    private Integer[] initialColors;
    private float lightness;
    private LightnessSlider lightnessSlider;
    private int lightnessSliderViewId;
    private ArrayList<OnColorSelectedListener> listeners;
    private Integer pickerColorEditTextColor;
    private ColorWheelRenderer renderer;
    private Paint selectorStroke;
    private boolean showBorder;

    public ColorPickerView(Context context) {
        super(context);
        this.density = 8;
        this.lightness = 1.0f;
        this.alpha = 1.0f;
        this.backgroundColor = 0;
        this.initialColors = new Integer[]{null, null, null, null, null};
        this.colorSelection = 0;
        this.colorWheelFill = PaintBuilder.newPaint().color(0).build();
        this.selectorStroke = PaintBuilder.newPaint().color(0).build();
        this.alphaPatternPaint = PaintBuilder.newPaint().build();
        this.colorChangedListeners = new ArrayList<>();
        this.listeners = new ArrayList<>();
        this.colorTextChange = new TextWatcher() { // from class: com.flask.colorpicker.ColorPickerView.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                try {
                    ColorPickerView.this.setColor(Color.parseColor(charSequence.toString()), false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        initWith(context, null);
    }

    public ColorPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.density = 8;
        this.lightness = 1.0f;
        this.alpha = 1.0f;
        this.backgroundColor = 0;
        this.initialColors = new Integer[]{null, null, null, null, null};
        this.colorSelection = 0;
        this.colorWheelFill = PaintBuilder.newPaint().color(0).build();
        this.selectorStroke = PaintBuilder.newPaint().color(0).build();
        this.alphaPatternPaint = PaintBuilder.newPaint().build();
        this.colorChangedListeners = new ArrayList<>();
        this.listeners = new ArrayList<>();
        this.colorTextChange = new TextWatcher() { // from class: com.flask.colorpicker.ColorPickerView.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                try {
                    ColorPickerView.this.setColor(Color.parseColor(charSequence.toString()), false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        initWith(context, attributeSet);
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.density = 8;
        this.lightness = 1.0f;
        this.alpha = 1.0f;
        this.backgroundColor = 0;
        this.initialColors = new Integer[]{null, null, null, null, null};
        this.colorSelection = 0;
        this.colorWheelFill = PaintBuilder.newPaint().color(0).build();
        this.selectorStroke = PaintBuilder.newPaint().color(0).build();
        this.alphaPatternPaint = PaintBuilder.newPaint().build();
        this.colorChangedListeners = new ArrayList<>();
        this.listeners = new ArrayList<>();
        this.colorTextChange = new TextWatcher() { // from class: com.flask.colorpicker.ColorPickerView.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i22, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i22, int i3) {
                try {
                    ColorPickerView.this.setColor(Color.parseColor(charSequence.toString()), false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        initWith(context, attributeSet);
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.density = 8;
        this.lightness = 1.0f;
        this.alpha = 1.0f;
        this.backgroundColor = 0;
        this.initialColors = new Integer[]{null, null, null, null, null};
        this.colorSelection = 0;
        this.colorWheelFill = PaintBuilder.newPaint().color(0).build();
        this.selectorStroke = PaintBuilder.newPaint().color(0).build();
        this.alphaPatternPaint = PaintBuilder.newPaint().build();
        this.colorChangedListeners = new ArrayList<>();
        this.listeners = new ArrayList<>();
        this.colorTextChange = new TextWatcher() { // from class: com.flask.colorpicker.ColorPickerView.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i22, int i222, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i22, int i222, int i3) {
                try {
                    ColorPickerView.this.setColor(Color.parseColor(charSequence.toString()), false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        initWith(context, attributeSet);
    }

    private void initWith(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ColorPickerPreference);
        this.density = obtainStyledAttributes.getInt(R.styleable.ColorPickerPreference_density, 10);
        this.initialColor = Integer.valueOf(obtainStyledAttributes.getInt(R.styleable.ColorPickerPreference_initialColor, -1));
        this.pickerColorEditTextColor = Integer.valueOf(obtainStyledAttributes.getInt(R.styleable.ColorPickerPreference_pickerColorEditTextColor, -1));
        ColorWheelRenderer renderer = ColorWheelRendererBuilder.getRenderer(WHEEL_TYPE.indexOf(obtainStyledAttributes.getInt(R.styleable.ColorPickerPreference_wheelType, 0)));
        this.alphaSliderViewId = obtainStyledAttributes.getResourceId(R.styleable.ColorPickerPreference_alphaSliderView, 0);
        this.lightnessSliderViewId = obtainStyledAttributes.getResourceId(R.styleable.ColorPickerPreference_lightnessSliderView, 0);
        setRenderer(renderer);
        setDensity(this.density);
        setInitialColor(this.initialColor.intValue(), true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        updateColorWheel();
        this.currentColorCircle = findNearestByColor(this.initialColor.intValue());
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.alphaSliderViewId != 0) {
            setAlphaSlider((AlphaSlider) getRootView().findViewById(this.alphaSliderViewId));
        }
        if (this.lightnessSliderViewId != 0) {
            setLightnessSlider((LightnessSlider) getRootView().findViewById(this.lightnessSliderViewId));
        }
        updateColorWheel();
        this.currentColorCircle = findNearestByColor(this.initialColor.intValue());
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        updateColorWheel();
    }

    private void updateColorWheel() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight < measuredWidth) {
            measuredWidth = measuredHeight;
        }
        if (measuredWidth <= 0) {
            return;
        }
        Bitmap bitmap = this.colorWheel;
        if (bitmap == null || bitmap.getWidth() != measuredWidth) {
            this.colorWheel = Bitmap.createBitmap(measuredWidth, measuredWidth, Bitmap.Config.ARGB_8888);
            this.colorWheelCanvas = new Canvas(this.colorWheel);
            this.alphaPatternPaint.setShader(PaintBuilder.createAlphaPatternShader(26));
        }
        Bitmap bitmap2 = this.currentColor;
        if (bitmap2 == null || bitmap2.getWidth() != measuredWidth) {
            this.currentColor = Bitmap.createBitmap(measuredWidth, measuredWidth, Bitmap.Config.ARGB_8888);
            this.currentColorCanvas = new Canvas(this.currentColor);
        }
        drawColorWheel();
        invalidate();
    }

    private void drawColorWheel() {
        this.colorWheelCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        this.currentColorCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        if (this.renderer == null) {
            return;
        }
        float width = this.colorWheelCanvas.getWidth() / 2.0f;
        int i = this.density;
        float f = (width - 1.5374999f) - (width / i);
        ColorWheelRenderOption renderOption = this.renderer.getRenderOption();
        renderOption.density = this.density;
        renderOption.maxRadius = f;
        renderOption.cSize = (f / (i - 1)) / 2.0f;
        renderOption.strokeWidth = 1.5374999f;
        renderOption.alpha = this.alpha;
        renderOption.lightness = this.lightness;
        renderOption.targetCanvas = this.colorWheelCanvas;
        this.renderer.initWith(renderOption);
        this.renderer.draw();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        if (mode != 0) {
            if (mode == Integer.MIN_VALUE) {
                i = View.MeasureSpec.getSize(i);
            } else {
                i = mode == 1073741824 ? View.MeasureSpec.getSize(i) : 0;
            }
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 != 0) {
            if (mode2 == Integer.MIN_VALUE) {
                i2 = View.MeasureSpec.getSize(i2);
            } else {
                i2 = mode2 == 1073741824 ? View.MeasureSpec.getSize(i2) : 0;
            }
        }
        if (i2 < i) {
            i = i2;
        }
        setMeasuredDimension(i, i);
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
                ArrayList<OnColorSelectedListener> arrayList = this.listeners;
                if (arrayList != null) {
                    Iterator<OnColorSelectedListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        try {
                            it.next().onColorSelected(selectedColor);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                setColorToSliders(selectedColor);
                setColorText(selectedColor);
                setColorPreviewColor(selectedColor);
                invalidate();
            }
            return true;
        }
        int selectedColor2 = getSelectedColor();
        this.currentColorCircle = findNearestByPosition(motionEvent.getX(), motionEvent.getY());
        int selectedColor3 = getSelectedColor();
        callOnColorChangedListeners(selectedColor2, selectedColor3);
        this.initialColor = Integer.valueOf(selectedColor3);
        setColorToSliders(selectedColor3);
        updateColorWheel();
        invalidate();
        return true;
    }

    protected void callOnColorChangedListeners(int i, int i2) {
        ArrayList<OnColorChangedListener> arrayList = this.colorChangedListeners;
        if (arrayList == null || i == i2) {
            return;
        }
        Iterator<OnColorChangedListener> it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                it.next().onColorChanged(i2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        ColorCircle colorCircle;
        super.onDraw(canvas);
        canvas.drawColor(this.backgroundColor);
        float width = ((canvas.getWidth() / 1.025f) / this.density) / 2.0f;
        if (this.colorWheel == null || (colorCircle = this.currentColorCircle) == null) {
            return;
        }
        this.colorWheelFill.setColor(Color.HSVToColor(colorCircle.getHsvWithLightness(this.lightness)));
        this.colorWheelFill.setAlpha((int) (this.alpha * 255.0f));
        float f = 4.0f + width;
        this.currentColorCanvas.drawCircle(this.currentColorCircle.getX(), this.currentColorCircle.getY(), f, this.alphaPatternPaint);
        this.currentColorCanvas.drawCircle(this.currentColorCircle.getX(), this.currentColorCircle.getY(), f, this.colorWheelFill);
        this.selectorStroke = PaintBuilder.newPaint().color(-1).style(Paint.Style.STROKE).stroke(0.5f * width).xPerMode(PorterDuff.Mode.CLEAR).build();
        if (this.showBorder) {
            this.colorWheelCanvas.drawCircle(this.currentColorCircle.getX(), this.currentColorCircle.getY(), (this.selectorStroke.getStrokeWidth() / 2.0f) + width, this.selectorStroke);
        }
        canvas.drawBitmap(this.colorWheel, 0.0f, 0.0f, (Paint) null);
        this.currentColorCanvas.drawCircle(this.currentColorCircle.getX(), this.currentColorCircle.getY(), width + (this.selectorStroke.getStrokeWidth() / 2.0f), this.selectorStroke);
        canvas.drawBitmap(this.currentColor, 0.0f, 0.0f, (Paint) null);
    }

    private ColorCircle findNearestByPosition(float f, float f2) {
        ColorCircle colorCircle = null;
        double d = Double.MAX_VALUE;
        for (ColorCircle colorCircle2 : this.renderer.getColorCircleList()) {
            double sqDist = colorCircle2.sqDist(f, f2);
            if (d > sqDist) {
                colorCircle = colorCircle2;
                d = sqDist;
            }
        }
        return colorCircle;
    }

    private ColorCircle findNearestByColor(int i) {
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
        ColorCircle colorCircle = null;
        double d7 = Double.MAX_VALUE;
        for (ColorCircle colorCircle2 : this.renderer.getColorCircleList()) {
            float[] hsv = colorCircle2.getHsv();
            double d8 = hsv[c];
            double d9 = d6;
            double d10 = hsv[c2];
            Double.isNaN(d10);
            double cos2 = Math.cos((d10 * 3.141592653589793d) / 180.0d);
            Double.isNaN(d8);
            double d11 = d8 * cos2;
            double d12 = hsv[1];
            double d13 = hsv[0];
            Double.isNaN(d13);
            double sin2 = Math.sin((d13 * 3.141592653589793d) / 180.0d);
            Double.isNaN(d12);
            double d14 = d12 * sin2;
            double d15 = d3 - d11;
            double d16 = d9 - d14;
            double d17 = (d15 * d15) + (d16 * d16);
            if (d17 < d7) {
                d7 = d17;
                colorCircle = colorCircle2;
            }
            c = 1;
            c2 = 0;
            d6 = d9;
        }
        return colorCircle;
    }

    public int getSelectedColor() {
        ColorCircle colorCircle = this.currentColorCircle;
        return Utils.adjustAlpha(this.alpha, colorCircle != null ? Utils.colorAtLightness(colorCircle.getColor(), this.lightness) : 0);
    }

    public Integer[] getAllColors() {
        return this.initialColors;
    }

    public void setInitialColors(Integer[] numArr, int i) {
        this.initialColors = numArr;
        this.colorSelection = i;
        Integer num = numArr[i];
        if (num == null) {
            num = -1;
        }
        setInitialColor(num.intValue(), true);
    }

    public void setInitialColor(int i, boolean z) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        this.alpha = Utils.getAlphaPercent(i);
        this.lightness = fArr[2];
        this.initialColors[this.colorSelection] = Integer.valueOf(i);
        this.initialColor = Integer.valueOf(i);
        setColorPreviewColor(i);
        setColorToSliders(i);
        if (this.colorEdit != null && z) {
            setColorText(i);
        }
        this.currentColorCircle = findNearestByColor(i);
    }

    public void setLightness(float f) {
        Integer num;
        int selectedColor = getSelectedColor();
        this.lightness = f;
        if (this.currentColorCircle != null) {
            Integer valueOf = Integer.valueOf(Color.HSVToColor(Utils.alphaValueAsInt(this.alpha), this.currentColorCircle.getHsvWithLightness(f)));
            this.initialColor = valueOf;
            EditText editText = this.colorEdit;
            if (editText != null) {
                editText.setText(Utils.getHexString(valueOf.intValue(), this.alphaSlider != null));
            }
            AlphaSlider alphaSlider = this.alphaSlider;
            if (alphaSlider != null && (num = this.initialColor) != null) {
                alphaSlider.setColor(num.intValue());
            }
            callOnColorChangedListeners(selectedColor, this.initialColor.intValue());
            updateColorWheel();
            invalidate();
        }
    }

    public void setColor(int i, boolean z) {
        setInitialColor(i, z);
        updateColorWheel();
        invalidate();
    }

    public void setAlphaValue(float f) {
        Integer num;
        int selectedColor = getSelectedColor();
        this.alpha = f;
        Integer valueOf = Integer.valueOf(Color.HSVToColor(Utils.alphaValueAsInt(f), this.currentColorCircle.getHsvWithLightness(this.lightness)));
        this.initialColor = valueOf;
        EditText editText = this.colorEdit;
        if (editText != null) {
            editText.setText(Utils.getHexString(valueOf.intValue(), this.alphaSlider != null));
        }
        LightnessSlider lightnessSlider = this.lightnessSlider;
        if (lightnessSlider != null && (num = this.initialColor) != null) {
            lightnessSlider.setColor(num.intValue());
        }
        callOnColorChangedListeners(selectedColor, this.initialColor.intValue());
        updateColorWheel();
        invalidate();
    }

    public void addOnColorChangedListener(OnColorChangedListener onColorChangedListener) {
        this.colorChangedListeners.add(onColorChangedListener);
    }

    public void addOnColorSelectedListener(OnColorSelectedListener onColorSelectedListener) {
        this.listeners.add(onColorSelectedListener);
    }

    public void setLightnessSlider(LightnessSlider lightnessSlider) {
        this.lightnessSlider = lightnessSlider;
        if (lightnessSlider != null) {
            lightnessSlider.setColorPicker(this);
            this.lightnessSlider.setColor(getSelectedColor());
        }
    }

    public void setAlphaSlider(AlphaSlider alphaSlider) {
        this.alphaSlider = alphaSlider;
        if (alphaSlider != null) {
            alphaSlider.setColorPicker(this);
            this.alphaSlider.setColor(getSelectedColor());
        }
    }

    public void setColorEdit(EditText editText) {
        this.colorEdit = editText;
        if (editText != null) {
            editText.setVisibility(0);
            this.colorEdit.addTextChangedListener(this.colorTextChange);
            setColorEditTextColor(this.pickerColorEditTextColor.intValue());
        }
    }

    public void setColorEditTextColor(int i) {
        this.pickerColorEditTextColor = Integer.valueOf(i);
        EditText editText = this.colorEdit;
        if (editText != null) {
            editText.setTextColor(i);
        }
    }

    public void setDensity(int i) {
        this.density = Math.max(2, i);
        invalidate();
    }

    public void setRenderer(ColorWheelRenderer colorWheelRenderer) {
        this.renderer = colorWheelRenderer;
        invalidate();
    }

    public void setColorPreview(LinearLayout linearLayout, Integer num) {
        if (linearLayout == null) {
            return;
        }
        this.colorPreview = linearLayout;
        if (num == null) {
            num = 0;
        }
        int childCount = linearLayout.getChildCount();
        if (childCount == 0 || linearLayout.getVisibility() != 0) {
            return;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof LinearLayout) {
                LinearLayout linearLayout2 = (LinearLayout) childAt;
                if (i == num.intValue()) {
                    linearLayout2.setBackgroundColor(-1);
                }
                ImageView imageView = (ImageView) linearLayout2.findViewById(R.id.image_preview);
                imageView.setClickable(true);
                imageView.setTag(Integer.valueOf(i));
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.flask.colorpicker.ColorPickerView.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        Object tag;
                        if (view == null || (tag = view.getTag()) == null || !(tag instanceof Integer)) {
                            return;
                        }
                        ColorPickerView.this.setSelectedColor(((Integer) tag).intValue());
                    }
                });
            }
        }
    }

    public void setSelectedColor(int i) {
        Integer[] numArr = this.initialColors;
        if (numArr == null || numArr.length < i) {
            return;
        }
        this.colorSelection = i;
        setHighlightedColor(i);
        Integer num = this.initialColors[i];
        if (num == null) {
            return;
        }
        setColor(num.intValue(), true);
    }

    public void setShowBorder(boolean z) {
        this.showBorder = z;
    }

    private void setHighlightedColor(int i) {
        int childCount = this.colorPreview.getChildCount();
        if (childCount == 0 || this.colorPreview.getVisibility() != 0) {
            return;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.colorPreview.getChildAt(i2);
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

    private void setColorPreviewColor(int i) {
        Integer[] numArr;
        int i2;
        LinearLayout linearLayout = this.colorPreview;
        if (linearLayout == null || (numArr = this.initialColors) == null || (i2 = this.colorSelection) > numArr.length || numArr[i2] == null || linearLayout.getChildCount() == 0 || this.colorPreview.getVisibility() != 0) {
            return;
        }
        View childAt = this.colorPreview.getChildAt(this.colorSelection);
        if (childAt instanceof LinearLayout) {
            ((ImageView) ((LinearLayout) childAt).findViewById(R.id.image_preview)).setImageDrawable(new ColorCircleDrawable(i));
        }
    }

    private void setColorText(int i) {
        EditText editText = this.colorEdit;
        if (editText == null) {
            return;
        }
        editText.setText(Utils.getHexString(i, this.alphaSlider != null));
    }

    private void setColorToSliders(int i) {
        LightnessSlider lightnessSlider = this.lightnessSlider;
        if (lightnessSlider != null) {
            lightnessSlider.setColor(i);
        }
        AlphaSlider alphaSlider = this.alphaSlider;
        if (alphaSlider != null) {
            alphaSlider.setColor(i);
        }
    }

    /* loaded from: classes.dex */
    public enum WHEEL_TYPE {
        FLOWER,
        CIRCLE;

        public static WHEEL_TYPE indexOf(int i) {
            if (i != 0) {
                if (i == 1) {
                    return CIRCLE;
                }
                return FLOWER;
            }
            return FLOWER;
        }
    }
}
