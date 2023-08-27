.class public Lcom/larvalabs/svgandroid/SVG;
.super Ljava/lang/Object;
.source "SVG.java"


# instance fields
.field private final bounds:Landroid/graphics/RectF;

.field private drawable:Landroid/graphics/drawable/PictureDrawable;

.field private limits:Landroid/graphics/RectF;

.field private final picture:Landroid/graphics/Picture;


# direct methods
.method constructor <init>(Landroid/graphics/Picture;Landroid/graphics/RectF;)V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Lcom/larvalabs/svgandroid/SVG;->limits:Landroid/graphics/RectF;

    .line 40
    iput-object v0, p0, Lcom/larvalabs/svgandroid/SVG;->drawable:Landroid/graphics/drawable/PictureDrawable;

    .line 49
    iput-object p1, p0, Lcom/larvalabs/svgandroid/SVG;->picture:Landroid/graphics/Picture;

    .line 50
    iput-object p2, p0, Lcom/larvalabs/svgandroid/SVG;->bounds:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public getBounds()Landroid/graphics/RectF;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVG;->bounds:Landroid/graphics/RectF;

    return-object v0
.end method

.method public getDrawable()Landroid/graphics/drawable/PictureDrawable;
    .locals 2

    .line 68
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVG;->drawable:Landroid/graphics/drawable/PictureDrawable;

    if-nez v0, :cond_0

    .line 69
    new-instance v0, Landroid/graphics/drawable/PictureDrawable;

    iget-object v1, p0, Lcom/larvalabs/svgandroid/SVG;->picture:Landroid/graphics/Picture;

    invoke-direct {v0, v1}, Landroid/graphics/drawable/PictureDrawable;-><init>(Landroid/graphics/Picture;)V

    iput-object v0, p0, Lcom/larvalabs/svgandroid/SVG;->drawable:Landroid/graphics/drawable/PictureDrawable;

    .line 71
    :cond_0
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVG;->drawable:Landroid/graphics/drawable/PictureDrawable;

    return-object v0
.end method

.method public getLimits()Landroid/graphics/RectF;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVG;->limits:Landroid/graphics/RectF;

    return-object v0
.end method

.method public getPicture()Landroid/graphics/Picture;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVG;->picture:Landroid/graphics/Picture;

    return-object v0
.end method

.method setLimits(Landroid/graphics/RectF;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/larvalabs/svgandroid/SVG;->limits:Landroid/graphics/RectF;

    return-void
.end method
