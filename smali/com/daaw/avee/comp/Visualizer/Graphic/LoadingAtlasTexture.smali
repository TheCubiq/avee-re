.class public Lcom/daaw/avee/comp/Visualizer/Graphic/LoadingAtlasTexture;
.super Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;
.source "LoadingAtlasTexture.java"


# instance fields
.field private uOffset:F


# direct methods
.method public constructor <init>(Lmdesl/graphics/ITexture;IIIIZ)V
    .locals 0

    .line 20
    invoke-direct/range {p0 .. p6}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;IIIIZ)V

    const/4 p1, 0x0

    .line 13
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/LoadingAtlasTexture;->uOffset:F

    return-void
.end method

.method public constructor <init>(Lmdesl/graphics/ITexture;Z)V
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    const/4 p1, 0x0

    .line 13
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/LoadingAtlasTexture;->uOffset:F

    return-void
.end method


# virtual methods
.method public getFramesCount()I
    .locals 1

    const/16 v0, 0x64

    return v0
.end method

.method public getSubZ(F)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;
    .locals 0

    return-object p0
.end method

.method public getSubZ(I)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;
    .locals 0

    return-object p0
.end method

.method public onFrameStart(F)V
    .locals 2

    .line 57
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/LoadingAtlasTexture;->uOffset:F

    const v1, 0x3f666666    # 0.9f

    mul-float p1, p1, v1

    add-float/2addr v0, p1

    const/high16 p1, 0x3f800000    # 1.0f

    rem-float/2addr v0, p1

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/LoadingAtlasTexture;->uOffset:F

    return-void
.end method

.method public translateU(F)F
    .locals 0

    .line 36
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->translateU(F)F

    move-result p1

    return p1
.end method

.method public translateV(F)F
    .locals 3

    .line 42
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/LoadingAtlasTexture;->uOffset:F

    const/high16 v1, 0x3f000000    # 0.5f

    cmpl-float v2, v0, v1

    if-lez v2, :cond_0

    sub-float/2addr v0, v1

    sub-float v0, v1, v0

    :cond_0
    const v1, 0x3f4ccccd    # 0.8f

    mul-float v0, v0, v1

    const v1, 0x3e4ccccd    # 0.2f

    mul-float p1, p1, v1

    add-float/2addr p1, v0

    add-float/2addr p1, v0

    .line 53
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->translateV(F)F

    move-result p1

    return p1
.end method
