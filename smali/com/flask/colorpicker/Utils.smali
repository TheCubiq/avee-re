.class public Lcom/flask/colorpicker/Utils;
.super Ljava/lang/Object;
.source "Utils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static adjustAlpha(FI)I
    .locals 1

    .line 18
    invoke-static {p0}, Lcom/flask/colorpicker/Utils;->alphaValueAsInt(F)I

    move-result p0

    shl-int/lit8 p0, p0, 0x18

    const v0, 0xffffff

    and-int/2addr p1, v0

    or-int/2addr p0, p1

    return p0
.end method

.method public static alphaValueAsInt(F)I
    .locals 1

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float p0, p0, v0

    .line 14
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    return p0
.end method

.method public static colorAtLightness(IF)I
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [F

    .line 23
    invoke-static {p0, v0}, Landroid/graphics/Color;->colorToHSV(I[F)V

    const/4 p0, 0x2

    aput p1, v0, p0

    .line 25
    invoke-static {v0}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result p0

    return p0
.end method

.method public static getAlphaPercent(I)F
    .locals 1

    .line 10
    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    move-result p0

    int-to-float p0, p0

    const/high16 v0, 0x437f0000    # 255.0f

    div-float/2addr p0, v0

    return p0
.end method

.method public static getHexString(IZ)Ljava/lang/String;
    .locals 3

    if-eqz p1, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    const v0, 0xffffff

    :goto_0
    if-eqz p1, :cond_1

    const-string p1, "#%08X"

    goto :goto_1

    :cond_1
    const-string p1, "#%06X"

    :goto_1
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    and-int/2addr p0, v0

    .line 37
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v1, v2

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static lightnessOfColor(I)F
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [F

    .line 30
    invoke-static {p0, v0}, Landroid/graphics/Color;->colorToHSV(I[F)V

    const/4 p0, 0x2

    .line 31
    aget p0, v0, p0

    return p0
.end method
