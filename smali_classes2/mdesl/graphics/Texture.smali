.class public Lmdesl/graphics/Texture;
.super Ljava/lang/Object;
.source "Texture.java"

# interfaces
.implements Lmdesl/graphics/ITexture;


# static fields
.field public static final CLAMP_TO_EDGE:I = 0x812f

.field public static final DEFAULT_FILTER:I = 0x2600

.field public static final DEFAULT_WRAP:I = 0x2901

.field public static final LINEAR:I = 0x2601

.field public static final LINEAR_MIPMAP_LINEAR:I = 0x2703

.field public static final LINEAR_MIPMAP_NEAREST:I = 0x2701

.field public static final NEAREST:I = 0x2600

.field public static final NEAREST_MIPMAP_LINEAR:I = 0x2702

.field public static final NEAREST_MIPMAP_NEAREST:I = 0x2700

.field public static final REPEAT:I = 0x2901


# instance fields
.field protected height:I

.field protected id:I

.field protected width:I


# direct methods
.method protected constructor <init>()V
    .locals 0

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    const/16 v0, 0x2600

    .line 124
    invoke-direct {p0, p1, p2, v0}, Lmdesl/graphics/Texture;-><init>(III)V

    return-void
.end method

.method public constructor <init>(III)V
    .locals 1

    const/16 v0, 0x2901

    .line 135
    invoke-direct {p0, p1, p2, p3, v0}, Lmdesl/graphics/Texture;-><init>(IIII)V

    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 3

    .line 148
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 149
    invoke-virtual {p0}, Lmdesl/graphics/Texture;->getTarget()I

    move-result v0

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnable(I)V

    const/4 v0, 0x1

    new-array v1, v0, [I

    const/4 v2, 0x0

    .line 151
    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 152
    aget v0, v1, v2

    iput v0, p0, Lmdesl/graphics/Texture;->id:I

    .line 153
    iput p1, p0, Lmdesl/graphics/Texture;->width:I

    .line 154
    iput p2, p0, Lmdesl/graphics/Texture;->height:I

    .line 155
    invoke-virtual {p0}, Lmdesl/graphics/Texture;->bind()V

    .line 157
    invoke-virtual {p0, p3}, Lmdesl/graphics/Texture;->setFilter(I)V

    .line 158
    invoke-virtual {p0, p4}, Lmdesl/graphics/Texture;->setWrap(I)V

    mul-int p1, p1, p2

    mul-int/lit8 p1, p1, 0x4

    .line 160
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p1

    const/16 p2, 0x1908

    .line 161
    invoke-virtual {p0, p2, p1}, Lmdesl/graphics/Texture;->upload(ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public static isPowerOfTwo(I)Z
    .locals 1

    neg-int v0, p0

    and-int/2addr v0, p0

    if-ne v0, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static toPowerOfTwo(I)I
    .locals 1

    const/4 v0, 0x1

    sub-int/2addr p0, v0

    .line 86
    invoke-static {p0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result p0

    rsub-int/lit8 p0, p0, 0x20

    shl-int p0, v0, p0

    return p0
.end method


# virtual methods
.method public bind()V
    .locals 2

    .line 270
    invoke-virtual {p0}, Lmdesl/graphics/Texture;->valid()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 272
    invoke-virtual {p0}, Lmdesl/graphics/Texture;->getTarget()I

    move-result v0

    iget v1, p0, Lmdesl/graphics/Texture;->id:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    return-void

    .line 271
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "trying to bind a texture that was disposed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public dispose()V
    .locals 4

    .line 276
    invoke-virtual {p0}, Lmdesl/graphics/Texture;->valid()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    new-array v1, v0, [I

    .line 277
    iget v2, p0, Lmdesl/graphics/Texture;->id:I

    const/4 v3, 0x0

    aput v2, v1, v3

    invoke-static {v0, v1, v3}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 278
    iput v3, p0, Lmdesl/graphics/Texture;->id:I

    :cond_0
    return-void
.end method

.method public getHeight()I
    .locals 1

    .line 295
    iget v0, p0, Lmdesl/graphics/Texture;->height:I

    return v0
.end method

.method public getID()I
    .locals 1

    .line 221
    iget v0, p0, Lmdesl/graphics/Texture;->id:I

    return v0
.end method

.method public getTarget()I
    .locals 1

    const/16 v0, 0xde1

    return v0
.end method

.method public getTexture()Lmdesl/graphics/Texture;
    .locals 0

    return-object p0
.end method

.method public getU()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getU2()F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public getV()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getV2()F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public getWidth()I
    .locals 1

    .line 291
    iget v0, p0, Lmdesl/graphics/Texture;->width:I

    return v0
.end method

.method public setFilter(I)V
    .locals 0

    .line 254
    invoke-virtual {p0, p1, p1}, Lmdesl/graphics/Texture;->setFilter(II)V

    return-void
.end method

.method public setFilter(II)V
    .locals 2

    .line 258
    invoke-virtual {p0}, Lmdesl/graphics/Texture;->bind()V

    .line 259
    invoke-virtual {p0}, Lmdesl/graphics/Texture;->getTarget()I

    move-result v0

    const/16 v1, 0x2801

    invoke-static {v0, v1, p1}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 260
    invoke-virtual {p0}, Lmdesl/graphics/Texture;->getTarget()I

    move-result p1

    const/16 v0, 0x2800

    invoke-static {p1, v0, p2}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    return-void
.end method

.method protected setUnpackAlignment()V
    .locals 2

    const/4 v0, 0x1

    const/16 v1, 0xcf5

    .line 225
    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glPixelStorei(II)V

    const/16 v1, 0xd05

    .line 226
    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glPixelStorei(II)V

    return-void
.end method

.method public setWrap(I)V
    .locals 2

    .line 264
    invoke-virtual {p0}, Lmdesl/graphics/Texture;->bind()V

    .line 265
    invoke-virtual {p0}, Lmdesl/graphics/Texture;->getTarget()I

    move-result v0

    const/16 v1, 0x2802

    invoke-static {v0, v1, p1}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 266
    invoke-virtual {p0}, Lmdesl/graphics/Texture;->getTarget()I

    move-result v0

    const/16 v1, 0x2803

    invoke-static {v0, v1, p1}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    return-void
.end method

.method public upload(IIIIILjava/nio/ByteBuffer;)V
    .locals 9

    .line 248
    invoke-virtual {p0}, Lmdesl/graphics/Texture;->bind()V

    .line 249
    invoke-virtual {p0}, Lmdesl/graphics/Texture;->setUnpackAlignment()V

    .line 250
    invoke-virtual {p0}, Lmdesl/graphics/Texture;->getTarget()I

    move-result v0

    const/4 v1, 0x0

    const/16 v7, 0x1401

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v8, p6

    invoke-static/range {v0 .. v8}, Landroid/opengl/GLES20;->glTexSubImage2D(IIIIIIIILjava/nio/Buffer;)V

    return-void
.end method

.method public upload(ILjava/nio/ByteBuffer;)V
    .locals 9

    .line 234
    invoke-virtual {p0}, Lmdesl/graphics/Texture;->bind()V

    .line 235
    invoke-virtual {p0}, Lmdesl/graphics/Texture;->setUnpackAlignment()V

    .line 236
    invoke-virtual {p0}, Lmdesl/graphics/Texture;->getTarget()I

    move-result v0

    iget v3, p0, Lmdesl/graphics/Texture;->width:I

    iget v4, p0, Lmdesl/graphics/Texture;->height:I

    const/4 v1, 0x0

    const/16 v2, 0x1908

    const/4 v5, 0x0

    const/16 v7, 0x1401

    move v6, p1

    move-object v8, p2

    invoke-static/range {v0 .. v8}, Landroid/opengl/GLES20;->glTexImage2D(IIIIIIIILjava/nio/Buffer;)V

    return-void
.end method

.method public valid()Z
    .locals 1

    .line 287
    iget v0, p0, Lmdesl/graphics/Texture;->id:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
