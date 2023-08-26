.class public Lcom/flask/colorpicker/builder/ColorWheelRendererBuilder;
.super Ljava/lang/Object;
.source "ColorWheelRendererBuilder.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getRenderer(Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;)Lcom/flask/colorpicker/renderer/ColorWheelRenderer;
    .locals 1

    .line 10
    sget-object v0, Lcom/flask/colorpicker/builder/ColorWheelRendererBuilder$1;->$SwitchMap$com$flask$colorpicker$ColorPickerView$WHEEL_TYPE:[I

    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView$WHEEL_TYPE;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    .line 14
    new-instance p0, Lcom/flask/colorpicker/renderer/FlowerColorWheelRenderer;

    invoke-direct {p0}, Lcom/flask/colorpicker/renderer/FlowerColorWheelRenderer;-><init>()V

    return-object p0

    .line 16
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "wrong WHEEL_TYPE"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 12
    :cond_1
    new-instance p0, Lcom/flask/colorpicker/renderer/SimpleColorWheelRenderer;

    invoke-direct {p0}, Lcom/flask/colorpicker/renderer/SimpleColorWheelRenderer;-><init>()V

    return-object p0
.end method
