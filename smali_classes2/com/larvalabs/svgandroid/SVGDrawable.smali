.class public Lcom/larvalabs/svgandroid/SVGDrawable;
.super Landroid/graphics/drawable/PictureDrawable;
.source "SVGDrawable.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/larvalabs/svgandroid/SVGDrawable$SVGState;
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;

.field private mSvgState:Lcom/larvalabs/svgandroid/SVGDrawable$SVGState;


# direct methods
.method public constructor <init>(Lcom/larvalabs/svgandroid/SVG;)V
    .locals 2

    .line 26
    invoke-virtual {p1}, Lcom/larvalabs/svgandroid/SVG;->getPicture()Landroid/graphics/Picture;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/graphics/drawable/PictureDrawable;-><init>(Landroid/graphics/Picture;)V

    const-string v0, "SVGDrawable"

    .line 18
    iput-object v0, p0, Lcom/larvalabs/svgandroid/SVGDrawable;->TAG:Ljava/lang/String;

    .line 27
    new-instance v0, Lcom/larvalabs/svgandroid/SVGDrawable$SVGState;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/larvalabs/svgandroid/SVGDrawable$SVGState;-><init>(Lcom/larvalabs/svgandroid/SVG;Lcom/larvalabs/svgandroid/SVGDrawable$1;)V

    iput-object v0, p0, Lcom/larvalabs/svgandroid/SVGDrawable;->mSvgState:Lcom/larvalabs/svgandroid/SVGDrawable$SVGState;

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 47
    invoke-virtual {p0}, Lcom/larvalabs/svgandroid/SVGDrawable;->getPicture()Landroid/graphics/Picture;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 48
    invoke-virtual {p0}, Lcom/larvalabs/svgandroid/SVGDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 49
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 51
    invoke-virtual {p0}, Lcom/larvalabs/svgandroid/SVGDrawable;->getPicture()Landroid/graphics/Picture;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->drawPicture(Landroid/graphics/Picture;Landroid/graphics/Rect;)V

    .line 52
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :cond_0
    return-void
.end method

.method public getChangingConfigurations()I
    .locals 3

    .line 84
    invoke-super {p0}, Landroid/graphics/drawable/PictureDrawable;->getChangingConfigurations()I

    move-result v0

    iget-object v1, p0, Lcom/larvalabs/svgandroid/SVGDrawable;->mSvgState:Lcom/larvalabs/svgandroid/SVGDrawable$SVGState;

    iget v1, v1, Lcom/larvalabs/svgandroid/SVGDrawable$SVGState;->mChangingConfigurations:I

    or-int/2addr v0, v1

    .line 85
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CC = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "SVGDrawable"

    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v0
.end method

.method public getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 2

    .line 91
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGDrawable;->mSvgState:Lcom/larvalabs/svgandroid/SVGDrawable$SVGState;

    invoke-super {p0}, Landroid/graphics/drawable/PictureDrawable;->getChangingConfigurations()I

    move-result v1

    iput v1, v0, Lcom/larvalabs/svgandroid/SVGDrawable$SVGState;->mChangingConfigurations:I

    .line 92
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGDrawable;->mSvgState:Lcom/larvalabs/svgandroid/SVGDrawable$SVGState;

    return-object v0
.end method

.method protected onBoundsChange(Landroid/graphics/Rect;)V
    .locals 0

    .line 32
    invoke-super {p0, p1}, Landroid/graphics/drawable/PictureDrawable;->onBoundsChange(Landroid/graphics/Rect;)V

    return-void
.end method
