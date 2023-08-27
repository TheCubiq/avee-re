package com.flask.colorpicker.builder;

import com.flask.colorpicker.ColorPickerView;
import com.flask.colorpicker.renderer.ColorWheelRenderer;
import com.flask.colorpicker.renderer.FlowerColorWheelRenderer;
import com.flask.colorpicker.renderer.SimpleColorWheelRenderer;
/* loaded from: classes.dex */
public class ColorWheelRendererBuilder {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.flask.colorpicker.builder.ColorWheelRendererBuilder$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$flask$colorpicker$ColorPickerView$WHEEL_TYPE;

        static {
            int[] iArr = new int[ColorPickerView.WHEEL_TYPE.values().length];
            $SwitchMap$com$flask$colorpicker$ColorPickerView$WHEEL_TYPE = iArr;
            try {
                iArr[ColorPickerView.WHEEL_TYPE.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$flask$colorpicker$ColorPickerView$WHEEL_TYPE[ColorPickerView.WHEEL_TYPE.FLOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static ColorWheelRenderer getRenderer(ColorPickerView.WHEEL_TYPE wheel_type) {
        int i = AnonymousClass1.$SwitchMap$com$flask$colorpicker$ColorPickerView$WHEEL_TYPE[wheel_type.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new FlowerColorWheelRenderer();
            }
            throw new IllegalArgumentException("wrong WHEEL_TYPE");
        }
        return new SimpleColorWheelRenderer();
    }
}
