.class public Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;
.super Ljava/lang/Object;
.source "AtlasTexture.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture$ErrorTexture;
    }
.end annotation


# static fields
.field public static final errorTexture:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

.field public static final factory:Lcom/daaw/avee/Common/Func/Func6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Func/Func6<",
            "Lmdesl/graphics/ITexture;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private atlasX:I

.field private atlasY:I

.field private framesCount:I

.field private height:I

.field protected ownTexture:Z

.field private texture:Lmdesl/graphics/ITexture;

.field private width:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 71
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture$1;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture$1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->factory:Lcom/daaw/avee/Common/Func/Func6;

    .line 78
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture$ErrorTexture;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture$ErrorTexture;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->errorTexture:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    return-void
.end method

.method public constructor <init>(Lmdesl/graphics/ITexture;IIIIZ)V
    .locals 1

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 85
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->framesCount:I

    .line 101
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->texture:Lmdesl/graphics/ITexture;

    .line 102
    iput-boolean p6, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->ownTexture:Z

    .line 103
    invoke-interface {p1}, Lmdesl/graphics/ITexture;->getHeight()I

    move-result p6

    if-lt p6, v0, :cond_0

    invoke-interface {p1}, Lmdesl/graphics/ITexture;->getWidth()I

    move-result p1

    if-ge p1, v0, :cond_1

    :cond_0
    const-string p1, "texture invalid dimensions"

    .line 104
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 105
    :cond_1
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->atlasX:I

    .line 106
    iput p3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->atlasY:I

    .line 107
    iput p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->width:I

    .line 108
    iput p5, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->height:I

    return-void
.end method

.method public constructor <init>(Lmdesl/graphics/ITexture;Z)V
    .locals 1

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 85
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->framesCount:I

    .line 89
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->texture:Lmdesl/graphics/ITexture;

    .line 90
    iput-boolean p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->ownTexture:Z

    const/4 p2, 0x0

    .line 91
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->atlasX:I

    .line 92
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->atlasY:I

    .line 93
    invoke-interface {p1}, Lmdesl/graphics/ITexture;->getWidth()I

    move-result p2

    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->width:I

    .line 94
    invoke-interface {p1}, Lmdesl/graphics/ITexture;->getHeight()I

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->height:I

    .line 96
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->texture:Lmdesl/graphics/ITexture;

    invoke-interface {p1}, Lmdesl/graphics/ITexture;->getHeight()I

    move-result p1

    if-lt p1, v0, :cond_0

    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->texture:Lmdesl/graphics/ITexture;

    invoke-interface {p1}, Lmdesl/graphics/ITexture;->getWidth()I

    move-result p1

    if-ge p1, v0, :cond_1

    :cond_0
    const-string p1, "texture invalid dimensions"

    .line 97
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public createSubTexture(Lmdesl/graphics/ITexture;IIIIZ)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;
    .locals 8

    .line 123
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    move-object v0, v7

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;IIIIZ)V

    return-object v7
.end method

.method public dispose()V
    .locals 1

    .line 112
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->ownTexture:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->texture:Lmdesl/graphics/ITexture;

    if-eqz v0, :cond_0

    .line 113
    invoke-interface {v0}, Lmdesl/graphics/ITexture;->dispose()V

    :cond_0
    return-void
.end method

.method public getFramesCount()I
    .locals 1

    .line 194
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->framesCount:I

    return v0
.end method

.method public getHeight()I
    .locals 1

    .line 131
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->height:I

    return v0
.end method

.method public getSub(FFFF)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;
    .locals 7

    .line 175
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->texture:Lmdesl/graphics/ITexture;

    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->atlasX:I

    int-to-float v0, v0

    .line 176
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->getWidth()I

    move-result v2

    int-to-float v2, v2

    mul-float v2, v2, p1

    add-float/2addr v0, v2

    float-to-int v2, v0

    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->atlasY:I

    int-to-float p1, p1

    .line 177
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->getHeight()I

    move-result v0

    int-to-float v0, v0

    mul-float v0, v0, p2

    add-float/2addr p1, v0

    float-to-int v3, p1

    .line 178
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->getWidth()I

    move-result p1

    int-to-float p1, p1

    mul-float p1, p1, p3

    float-to-int v4, p1

    .line 179
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->getHeight()I

    move-result p1

    int-to-float p1, p1

    mul-float p1, p1, p4

    float-to-int v5, p1

    const/4 v6, 0x0

    move-object v0, p0

    .line 175
    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->createSubTexture(Lmdesl/graphics/ITexture;IIIIZ)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object p1

    return-object p1
.end method

.method public getSub(IIII)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;
    .locals 7

    .line 166
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->getWidth()I

    move-result p1

    invoke-static {p1, p3}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 167
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->getHeight()I

    move-result p1

    invoke-static {p1, p4}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 168
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->getWidth()I

    move-result p1

    sub-int/2addr p1, v4

    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->atlasX:I

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 169
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->getHeight()I

    move-result p2

    sub-int/2addr p2, v5

    iget p3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->atlasY:I

    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 171
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->texture:Lmdesl/graphics/ITexture;

    iget p3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->atlasX:I

    add-int v2, p3, p1

    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->atlasY:I

    add-int v3, p1, p2

    const/4 v6, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->createSubTexture(Lmdesl/graphics/ITexture;IIIIZ)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object p1

    return-object p1
.end method

.method public getSubZ(F)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;
    .locals 7

    .line 190
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->texture:Lmdesl/graphics/ITexture;

    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->atlasX:I

    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->atlasY:I

    iget v4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->width:I

    iget v5, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->height:I

    const/4 v6, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->createSubTexture(Lmdesl/graphics/ITexture;IIIIZ)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object p1

    return-object p1
.end method

.method public getSubZ(I)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;
    .locals 7

    .line 186
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->texture:Lmdesl/graphics/ITexture;

    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->atlasX:I

    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->atlasY:I

    iget v4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->width:I

    iget v5, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->height:I

    const/4 v6, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->createSubTexture(Lmdesl/graphics/ITexture;IIIIZ)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object p1

    return-object p1
.end method

.method public getTexture2D()Lmdesl/graphics/ITexture;
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->texture:Lmdesl/graphics/ITexture;

    return-object v0
.end method

.method public getWidth()I
    .locals 1

    .line 127
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->width:I

    return v0
.end method

.method public isFlipped()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public nonDisposableClone()Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;
    .locals 7

    .line 118
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->texture:Lmdesl/graphics/ITexture;

    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->atlasX:I

    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->atlasY:I

    iget v4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->width:I

    iget v5, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->height:I

    const/4 v6, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->createSubTexture(Lmdesl/graphics/ITexture;IIIIZ)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object v0

    return-object v0
.end method

.method public translateU(F)F
    .locals 3

    .line 135
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->atlasX:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->texture:Lmdesl/graphics/ITexture;

    invoke-interface {v1}, Lmdesl/graphics/ITexture;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 136
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->width:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->texture:Lmdesl/graphics/ITexture;

    invoke-interface {v2}, Lmdesl/graphics/ITexture;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    mul-float v1, v1, p1

    add-float/2addr v0, v1

    return v0
.end method

.method public translateV(F)F
    .locals 3

    .line 142
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->atlasY:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->texture:Lmdesl/graphics/ITexture;

    invoke-interface {v1}, Lmdesl/graphics/ITexture;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 143
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->height:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->texture:Lmdesl/graphics/ITexture;

    invoke-interface {v2}, Lmdesl/graphics/ITexture;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    mul-float v1, v1, p1

    add-float/2addr v0, v1

    return v0
.end method

.method public translateW()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public translateW(F)F
    .locals 0

    .line 149
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->translateW()F

    move-result p1

    return p1
.end method
