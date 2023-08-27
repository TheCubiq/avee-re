.class public Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasFlippedTexture;
.super Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;
.source "AtlasFlippedTexture.java"


# direct methods
.method public constructor <init>(Lmdesl/graphics/ITexture;IIIIZ)V
    .locals 0

    .line 18
    invoke-direct/range {p0 .. p6}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;IIIIZ)V

    return-void
.end method

.method public constructor <init>(Lmdesl/graphics/ITexture;Z)V
    .locals 0

    .line 14
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    return-void
.end method


# virtual methods
.method public createSubTexture(Lmdesl/graphics/ITexture;IIIIZ)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;
    .locals 8

    .line 24
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasFlippedTexture;

    move-object v0, v7

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasFlippedTexture;-><init>(Lmdesl/graphics/ITexture;IIIIZ)V

    return-object v7
.end method

.method public isFlipped()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public translateU(F)F
    .locals 0

    .line 29
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->translateU(F)F

    move-result p1

    return p1
.end method

.method public translateV(F)F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p1

    .line 34
    invoke-super {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->translateV(F)F

    move-result p1

    return p1
.end method
