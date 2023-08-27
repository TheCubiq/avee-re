.class public Lcom/flask/colorpicker/ColorCircle;
.super Ljava/lang/Object;
.source "ColorCircle.java"


# instance fields
.field private color:I

.field private hsv:[F

.field private hsvClone:[F

.field private x:F

.field private y:F


# direct methods
.method public constructor <init>(FF[F)V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    new-array v0, v0, [F

    .line 7
    iput-object v0, p0, Lcom/flask/colorpicker/ColorCircle;->hsv:[F

    .line 12
    invoke-virtual {p0, p1, p2, p3}, Lcom/flask/colorpicker/ColorCircle;->set(FF[F)V

    return-void
.end method


# virtual methods
.method public getColor()I
    .locals 1

    .line 52
    iget v0, p0, Lcom/flask/colorpicker/ColorCircle;->color:I

    return v0
.end method

.method public getHsv()[F
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/flask/colorpicker/ColorCircle;->hsv:[F

    return-object v0
.end method

.method public getHsvWithLightness(F)[F
    .locals 4

    .line 34
    iget-object v0, p0, Lcom/flask/colorpicker/ColorCircle;->hsvClone:[F

    if-nez v0, :cond_0

    .line 35
    iget-object v0, p0, Lcom/flask/colorpicker/ColorCircle;->hsv:[F

    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    iput-object v0, p0, Lcom/flask/colorpicker/ColorCircle;->hsvClone:[F

    .line 36
    :cond_0
    iget-object v0, p0, Lcom/flask/colorpicker/ColorCircle;->hsvClone:[F

    iget-object v1, p0, Lcom/flask/colorpicker/ColorCircle;->hsv:[F

    const/4 v2, 0x0

    aget v3, v1, v2

    aput v3, v0, v2

    const/4 v2, 0x1

    .line 37
    aget v1, v1, v2

    aput v1, v0, v2

    const/4 v1, 0x2

    .line 38
    aput p1, v0, v1

    return-object v0
.end method

.method public getX()F
    .locals 1

    .line 22
    iget v0, p0, Lcom/flask/colorpicker/ColorCircle;->x:F

    return v0
.end method

.method public getY()F
    .locals 1

    .line 26
    iget v0, p0, Lcom/flask/colorpicker/ColorCircle;->y:F

    return v0
.end method

.method public set(FF[F)V
    .locals 1

    .line 43
    iput p1, p0, Lcom/flask/colorpicker/ColorCircle;->x:F

    .line 44
    iput p2, p0, Lcom/flask/colorpicker/ColorCircle;->y:F

    .line 45
    iget-object p1, p0, Lcom/flask/colorpicker/ColorCircle;->hsv:[F

    const/4 p2, 0x0

    aget v0, p3, p2

    aput v0, p1, p2

    const/4 p2, 0x1

    .line 46
    aget v0, p3, p2

    aput v0, p1, p2

    const/4 p2, 0x2

    .line 47
    aget p3, p3, p2

    aput p3, p1, p2

    .line 48
    invoke-static {p1}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result p1

    iput p1, p0, Lcom/flask/colorpicker/ColorCircle;->color:I

    return-void
.end method

.method public sqDist(FF)D
    .locals 2

    .line 16
    iget v0, p0, Lcom/flask/colorpicker/ColorCircle;->x:F

    sub-float/2addr v0, p1

    float-to-double v0, v0

    .line 17
    iget p1, p0, Lcom/flask/colorpicker/ColorCircle;->y:F

    sub-float/2addr p1, p2

    float-to-double p1, p1

    .line 18
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v0

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p1, p1, p1

    add-double/2addr v0, p1

    return-wide v0
.end method
