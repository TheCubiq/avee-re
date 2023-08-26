.class public abstract Lcom/flask/colorpicker/renderer/AbsColorWheelRenderer;
.super Ljava/lang/Object;
.source "AbsColorWheelRenderer.java"

# interfaces
.implements Lcom/flask/colorpicker/renderer/ColorWheelRenderer;


# instance fields
.field protected colorCircleList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/flask/colorpicker/ColorCircle;",
            ">;"
        }
    .end annotation
.end field

.field protected colorWheelRenderOption:Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/flask/colorpicker/renderer/AbsColorWheelRenderer;->colorCircleList:Ljava/util/List;

    return-void
.end method


# virtual methods
.method protected calcTotalCount(FF)I
    .locals 2

    div-float/2addr p2, p1

    float-to-double p1, p2

    .line 32
    invoke-static {p1, p2}, Ljava/lang/Math;->asin(D)D

    move-result-wide p1

    const-wide v0, 0x40088121e29cdd4cL    # 3.063052912151454

    div-double/2addr v0, p1

    const-wide/high16 p1, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, p1

    double-to-int p1, v0

    const/4 p2, 0x1

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1
.end method

.method protected getAlphaValueAsInt()I
    .locals 2

    .line 28
    iget-object v0, p0, Lcom/flask/colorpicker/renderer/AbsColorWheelRenderer;->colorWheelRenderOption:Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;

    iget v0, v0, Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;->alpha:F

    const/high16 v1, 0x437f0000    # 255.0f

    mul-float v0, v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method

.method public getColorCircleList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/flask/colorpicker/ColorCircle;",
            ">;"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/flask/colorpicker/renderer/AbsColorWheelRenderer;->colorCircleList:Ljava/util/List;

    return-object v0
.end method

.method public getRenderOption()Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/flask/colorpicker/renderer/AbsColorWheelRenderer;->colorWheelRenderOption:Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;

    if-nez v0, :cond_0

    new-instance v0, Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;

    invoke-direct {v0}, Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;-><init>()V

    iput-object v0, p0, Lcom/flask/colorpicker/renderer/AbsColorWheelRenderer;->colorWheelRenderOption:Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/flask/colorpicker/renderer/AbsColorWheelRenderer;->colorWheelRenderOption:Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;

    return-object v0
.end method

.method public initWith(Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;)V
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/flask/colorpicker/renderer/AbsColorWheelRenderer;->colorWheelRenderOption:Lcom/flask/colorpicker/renderer/ColorWheelRenderOption;

    .line 14
    iget-object p1, p0, Lcom/flask/colorpicker/renderer/AbsColorWheelRenderer;->colorCircleList:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method
