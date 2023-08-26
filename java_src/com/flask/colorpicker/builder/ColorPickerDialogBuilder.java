package com.flask.colorpicker.builder;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AlertDialog;
import com.flask.colorpicker.ColorPickerView;
import com.flask.colorpicker.OnColorChangedListener;
import com.flask.colorpicker.OnColorSelectedListener;
import com.flask.colorpicker.R;
import com.flask.colorpicker.Utils;
import com.flask.colorpicker.slider.AlphaSlider;
import com.flask.colorpicker.slider.LightnessSlider;
/* loaded from: classes.dex */
public class ColorPickerDialogBuilder {
    private AlphaSlider alphaSlider;
    private AlertDialog.Builder builder;
    private EditText colorEdit;
    private ColorPickerView colorPickerView;
    private LinearLayout colorPreview;
    private int defaultMargin;
    private int defaultMarginTop;
    private Integer[] initialColor;
    private boolean isAlphaSliderEnabled;
    private boolean isBorderEnabled;
    private boolean isColorEditEnabled;
    private boolean isLightnessSliderEnabled;
    private boolean isPreviewEnabled;
    private LightnessSlider lightnessSlider;
    private LinearLayout pickerContainer;
    private int pickerCount;

    private ColorPickerDialogBuilder(Context context) {
        this(context, 0);
    }

    private ColorPickerDialogBuilder(Context context, int i) {
        this.isLightnessSliderEnabled = true;
        this.isAlphaSliderEnabled = true;
        this.isBorderEnabled = true;
        this.isColorEditEnabled = false;
        this.isPreviewEnabled = false;
        this.pickerCount = 1;
        this.defaultMargin = 0;
        this.defaultMarginTop = 0;
        this.initialColor = new Integer[]{null, null, null, null, null};
        this.defaultMargin = getDimensionAsPx(context, R.dimen.default_slider_margin);
        this.defaultMarginTop = getDimensionAsPx(context, R.dimen.default_margin_top);
        this.builder = new AlertDialog.Builder(context, i);
        LinearLayout linearLayout = new LinearLayout(context);
        this.pickerContainer = linearLayout;
        linearLayout.setOrientation(1);
        this.pickerContainer.setGravity(1);
        LinearLayout linearLayout2 = this.pickerContainer;
        int i2 = this.defaultMargin;
        linearLayout2.setPadding(i2, this.defaultMarginTop, i2, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        ColorPickerView colorPickerView = new ColorPickerView(context);
        this.colorPickerView = colorPickerView;
        this.pickerContainer.addView(colorPickerView, layoutParams);
        this.builder.setView(this.pickerContainer);
    }

    public static ColorPickerDialogBuilder with(Context context) {
        return new ColorPickerDialogBuilder(context);
    }

    public static ColorPickerDialogBuilder with(Context context, int i) {
        return new ColorPickerDialogBuilder(context, i);
    }

    public ColorPickerDialogBuilder setTitle(String str) {
        this.builder.setTitle(str);
        return this;
    }

    public ColorPickerDialogBuilder setTitle(int i) {
        this.builder.setTitle(i);
        return this;
    }

    public ColorPickerDialogBuilder initialColor(int i) {
        this.initialColor[0] = Integer.valueOf(i);
        return this;
    }

    public ColorPickerDialogBuilder initialColors(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            Integer[] numArr = this.initialColor;
            if (i >= numArr.length) {
                break;
            }
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return this;
    }

    public ColorPickerDialogBuilder wheelType(ColorPickerView.WHEEL_TYPE wheel_type) {
        this.colorPickerView.setRenderer(ColorWheelRendererBuilder.getRenderer(wheel_type));
        return this;
    }

    public ColorPickerDialogBuilder density(int i) {
        this.colorPickerView.setDensity(i);
        return this;
    }

    public ColorPickerDialogBuilder setOnColorChangedListener(OnColorChangedListener onColorChangedListener) {
        this.colorPickerView.addOnColorChangedListener(onColorChangedListener);
        return this;
    }

    public ColorPickerDialogBuilder setOnColorSelectedListener(OnColorSelectedListener onColorSelectedListener) {
        this.colorPickerView.addOnColorSelectedListener(onColorSelectedListener);
        return this;
    }

    public ColorPickerDialogBuilder setPositiveButton(CharSequence charSequence, final ColorPickerClickListener colorPickerClickListener) {
        this.builder.setPositiveButton(charSequence, new DialogInterface.OnClickListener() { // from class: com.flask.colorpicker.builder.ColorPickerDialogBuilder.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                ColorPickerDialogBuilder.this.positiveButtonOnClick(dialogInterface, colorPickerClickListener);
            }
        });
        return this;
    }

    public ColorPickerDialogBuilder setPositiveButton(int i, final ColorPickerClickListener colorPickerClickListener) {
        this.builder.setPositiveButton(i, new DialogInterface.OnClickListener() { // from class: com.flask.colorpicker.builder.ColorPickerDialogBuilder.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                ColorPickerDialogBuilder.this.positiveButtonOnClick(dialogInterface, colorPickerClickListener);
            }
        });
        return this;
    }

    public ColorPickerDialogBuilder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.builder.setNegativeButton(charSequence, onClickListener);
        return this;
    }

    public ColorPickerDialogBuilder setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        this.builder.setNegativeButton(i, onClickListener);
        return this;
    }

    public ColorPickerDialogBuilder noSliders() {
        this.isLightnessSliderEnabled = false;
        this.isAlphaSliderEnabled = false;
        return this;
    }

    public ColorPickerDialogBuilder alphaSliderOnly() {
        this.isLightnessSliderEnabled = false;
        this.isAlphaSliderEnabled = true;
        return this;
    }

    public ColorPickerDialogBuilder lightnessSliderOnly() {
        this.isLightnessSliderEnabled = true;
        this.isAlphaSliderEnabled = false;
        return this;
    }

    public ColorPickerDialogBuilder showAlphaSlider(boolean z) {
        this.isAlphaSliderEnabled = z;
        return this;
    }

    public ColorPickerDialogBuilder showLightnessSlider(boolean z) {
        this.isLightnessSliderEnabled = z;
        return this;
    }

    public ColorPickerDialogBuilder showBorder(boolean z) {
        this.isBorderEnabled = z;
        return this;
    }

    public ColorPickerDialogBuilder showColorEdit(boolean z) {
        this.isColorEditEnabled = z;
        return this;
    }

    public ColorPickerDialogBuilder setColorEditTextColor(int i) {
        this.colorPickerView.setColorEditTextColor(i);
        return this;
    }

    public ColorPickerDialogBuilder showColorPreview(boolean z) {
        this.isPreviewEnabled = z;
        if (!z) {
            this.pickerCount = 1;
        }
        return this;
    }

    public ColorPickerDialogBuilder setPickerCount(int i) throws IndexOutOfBoundsException {
        if (i < 1 || i > 5) {
            throw new IndexOutOfBoundsException("Picker Can Only Support 1-5 Colors");
        }
        this.pickerCount = i;
        if (i > 1) {
            this.isPreviewEnabled = true;
        }
        return this;
    }

    public AlertDialog build() {
        Context context = this.builder.getContext();
        ColorPickerView colorPickerView = this.colorPickerView;
        Integer[] numArr = this.initialColor;
        colorPickerView.setInitialColors(numArr, getStartOffset(numArr).intValue());
        this.colorPickerView.setShowBorder(this.isBorderEnabled);
        if (this.isLightnessSliderEnabled) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, getDimensionAsPx(context, R.dimen.default_slider_height));
            LightnessSlider lightnessSlider = new LightnessSlider(context);
            this.lightnessSlider = lightnessSlider;
            lightnessSlider.setLayoutParams(layoutParams);
            this.pickerContainer.addView(this.lightnessSlider);
            this.colorPickerView.setLightnessSlider(this.lightnessSlider);
            this.lightnessSlider.setColor(getStartColor(this.initialColor));
            this.lightnessSlider.setShowBorder(this.isBorderEnabled);
        }
        if (this.isAlphaSliderEnabled) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, getDimensionAsPx(context, R.dimen.default_slider_height));
            AlphaSlider alphaSlider = new AlphaSlider(context);
            this.alphaSlider = alphaSlider;
            alphaSlider.setLayoutParams(layoutParams2);
            this.pickerContainer.addView(this.alphaSlider);
            this.colorPickerView.setAlphaSlider(this.alphaSlider);
            this.alphaSlider.setColor(getStartColor(this.initialColor));
            this.alphaSlider.setShowBorder(this.isBorderEnabled);
        }
        if (this.isColorEditEnabled) {
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            EditText editText = (EditText) View.inflate(context, R.layout.color_edit, null);
            this.colorEdit = editText;
            editText.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
            this.colorEdit.setSingleLine();
            this.colorEdit.setVisibility(8);
            this.colorEdit.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.isAlphaSliderEnabled ? 9 : 7)});
            this.pickerContainer.addView(this.colorEdit, layoutParams3);
            this.colorEdit.setText(Utils.getHexString(getStartColor(this.initialColor), this.isAlphaSliderEnabled));
            this.colorPickerView.setColorEdit(this.colorEdit);
        }
        if (this.isPreviewEnabled) {
            LinearLayout linearLayout = (LinearLayout) View.inflate(context, R.layout.color_preview, null);
            this.colorPreview = linearLayout;
            linearLayout.setVisibility(8);
            this.pickerContainer.addView(this.colorPreview);
            if (this.initialColor.length != 0) {
                int i = 0;
                while (true) {
                    Integer[] numArr2 = this.initialColor;
                    if (i >= numArr2.length || i >= this.pickerCount || numArr2[i] == null) {
                        break;
                    }
                    LinearLayout linearLayout2 = (LinearLayout) View.inflate(context, R.layout.color_selector, null);
                    ((ImageView) linearLayout2.findViewById(R.id.image_preview)).setImageDrawable(new ColorDrawable(this.initialColor[i].intValue()));
                    this.colorPreview.addView(linearLayout2);
                    i++;
                }
            } else {
                ((ImageView) View.inflate(context, R.layout.color_selector, null)).setImageDrawable(new ColorDrawable(-1));
            }
            this.colorPreview.setVisibility(0);
            this.colorPickerView.setColorPreview(this.colorPreview, getStartOffset(this.initialColor));
        }
        return this.builder.create();
    }

    private Integer getStartOffset(Integer[] numArr) {
        int i = 0;
        int i2 = 0;
        while (i < numArr.length && numArr[i] != null) {
            i++;
            i2 = Integer.valueOf(i / 2);
        }
        return i2;
    }

    private int getStartColor(Integer[] numArr) {
        Integer startOffset = getStartOffset(numArr);
        if (startOffset == null) {
            return -1;
        }
        return numArr[startOffset.intValue()].intValue();
    }

    private static int getDimensionAsPx(Context context, int i) {
        return (int) (context.getResources().getDimension(i) + 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void positiveButtonOnClick(DialogInterface dialogInterface, ColorPickerClickListener colorPickerClickListener) {
        colorPickerClickListener.onClick(dialogInterface, this.colorPickerView.getSelectedColor(), this.colorPickerView.getAllColors());
    }
}
