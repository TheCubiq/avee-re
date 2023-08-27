.class public Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;
.super Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;
.source "AtlasTextureArray.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray$AtlasTextureFrame;
    }
.end annotation


# instance fields
.field private atlasTextureFrames:[Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

.field private maxFrame:I

.field private textureFrames:[Lmdesl/graphics/ITexture;


# direct methods
.method public constructor <init>([Lmdesl/graphics/ITexture;IIIIZ)V
    .locals 8

    .line 99
    array-length v0, p1

    if-lez v0, :cond_0

    const/4 v0, 0x0

    aget-object v0, p1, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v2, v0

    move-object v1, p0

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;IIIIZ)V

    .line 100
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->init([Lmdesl/graphics/ITexture;)V

    return-void
.end method

.method public constructor <init>([Lmdesl/graphics/ITexture;Z)V
    .locals 1

    .line 94
    array-length v0, p1

    if-lez v0, :cond_0

    const/4 v0, 0x0

    aget-object v0, p1, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    .line 95
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->init([Lmdesl/graphics/ITexture;)V

    return-void
.end method

.method private init([Lmdesl/graphics/ITexture;)V
    .locals 3

    const/4 v0, -0x1

    .line 105
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->maxFrame:I

    .line 107
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->textureFrames:[Lmdesl/graphics/ITexture;

    .line 108
    array-length v0, p1

    new-array v0, v0, [Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->atlasTextureFrames:[Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    const/4 v0, 0x0

    .line 109
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_1

    .line 110
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->textureFrames:[Lmdesl/graphics/ITexture;

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->maxFrame:I

    .line 111
    :cond_0
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->atlasTextureFrames:[Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray$AtlasTextureFrame;

    invoke-direct {v2, p0, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray$AtlasTextureFrame;-><init>(Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;I)V

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 5

    .line 120
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->ownTexture:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 121
    :goto_0
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->textureFrames:[Lmdesl/graphics/ITexture;

    array-length v4, v3

    if-ge v0, v4, :cond_1

    .line 122
    aget-object v4, v3, v0

    if-eqz v4, :cond_0

    .line 123
    aget-object v3, v3, v0

    invoke-interface {v3}, Lmdesl/graphics/ITexture;->dispose()V

    .line 125
    :cond_0
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->textureFrames:[Lmdesl/graphics/ITexture;

    aput-object v1, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 129
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->atlasTextureFrames:[Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    array-length v3, v0

    if-ge v2, v3, :cond_3

    .line 130
    aget-object v3, v0, v2

    if-eqz v3, :cond_2

    .line 131
    aget-object v0, v0, v2

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->dispose()V

    .line 133
    :cond_2
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->atlasTextureFrames:[Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public getFramesCount()I
    .locals 1

    .line 173
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->textureFrames:[Lmdesl/graphics/ITexture;

    array-length v0, v0

    return v0
.end method

.method public getSubZ(F)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;
    .locals 2

    .line 165
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->textureFrames:[Lmdesl/graphics/ITexture;

    array-length v1, v0

    int-to-float v1, v1

    mul-float v1, v1, p1

    float-to-int p1, v1

    array-length v0, v0

    rem-int/2addr p1, v0

    .line 166
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->maxFrame:I

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 168
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->atlasTextureFrames:[Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public getSubZ(I)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->textureFrames:[Lmdesl/graphics/ITexture;

    array-length v0, v0

    rem-int/2addr p1, v0

    .line 159
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->maxFrame:I

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 161
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->atlasTextureFrames:[Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public getTexture2D(I)Lmdesl/graphics/ITexture;
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->textureFrames:[Lmdesl/graphics/ITexture;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public gradualLoadTexture(ILmdesl/graphics/ITexture;)V
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->textureFrames:[Lmdesl/graphics/ITexture;

    aput-object p2, v0, p1

    .line 154
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->setMaxLimitFrame(I)V

    return-void
.end method

.method public isFlipped()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public nonDisposableClone()Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;
    .locals 3

    .line 139
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->textureFrames:[Lmdesl/graphics/ITexture;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;-><init>([Lmdesl/graphics/ITexture;Z)V

    return-object v0
.end method

.method public setMaxLimitFrame(I)V
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->textureFrames:[Lmdesl/graphics/ITexture;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->maxFrame:I

    return-void
.end method
