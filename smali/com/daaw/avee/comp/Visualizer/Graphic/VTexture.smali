.class public Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;
.super Lmdesl/graphics/Texture;
.source "VTexture.java"


# static fields
.field public static final DEFAULT_FILTER:I = 0x2601

.field public static final DEFAULT_WRAP:I = 0x2901


# instance fields
.field dbgVar:Lcom/daaw/avee/Common/DbgVar;


# direct methods
.method public constructor <init>(IIIIIIZ)V
    .locals 12

    mul-int v0, p2, p3

    move v1, p1

    .line 97
    invoke-static {p1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->createSolidArray(II)[I

    move-result-object v0

    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/4 v1, 0x0

    move v2, p2

    move v3, p2

    move v4, p3

    invoke-static/range {v0 .. v5}, Landroid/graphics/Bitmap;->createBitmap([IIIIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v7

    move-object v6, p0

    move/from16 v8, p4

    move/from16 v9, p5

    move/from16 v10, p6

    move/from16 v11, p7

    invoke-direct/range {v6 .. v11}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;-><init>(Landroid/graphics/Bitmap;IIIZ)V

    return-void
.end method

.method public constructor <init>(IIIIZ)V
    .locals 3

    .line 32
    invoke-direct {p0}, Lmdesl/graphics/Texture;-><init>()V

    .line 30
    new-instance v0, Lcom/daaw/avee/Common/DbgVar;

    invoke-direct {v0}, Lcom/daaw/avee/Common/DbgVar;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->dbgVar:Lcom/daaw/avee/Common/DbgVar;

    const/4 v0, 0x1

    new-array v1, v0, [I

    const/4 v2, 0x0

    .line 34
    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 35
    aget v0, v1, v2

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->id:I

    const/16 v0, 0x1000

    .line 37
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->width:I

    .line 38
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->height:I

    .line 40
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->bind()V

    .line 42
    invoke-virtual {p0, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->setFilter(I)V

    .line 43
    invoke-virtual {p0, p4}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->setWrap(I)V

    const/4 p3, 0x0

    .line 52
    check-cast p3, Ljava/nio/ByteBuffer;

    const/16 p4, 0x1908

    invoke-virtual {p0, p4, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->upload(ILjava/nio/ByteBuffer;)V

    if-eqz p5, :cond_0

    int-to-long p3, p1

    .line 54
    invoke-static {p3, p4}, Lcom/daaw/avee/Common/Utils;->IsPowerOfTwo(J)Z

    move-result p1

    if-eqz p1, :cond_0

    int-to-long p1, p2

    invoke-static {p1, p2}, Lcom/daaw/avee/Common/Utils;->IsPowerOfTwo(J)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 55
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->getTarget()I

    move-result p1

    invoke-static {p1}, Landroid/opengl/GLES20;->glGenerateMipmap(I)V

    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;IIIZ)V
    .locals 10

    .line 108
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    .line 107
    invoke-direct/range {v0 .. v9}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;-><init>(Landroid/graphics/Bitmap;IIIZIIII)V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;IIIZIIII)V
    .locals 6

    .line 112
    invoke-direct {p0}, Lmdesl/graphics/Texture;-><init>()V

    .line 30
    new-instance p6, Lcom/daaw/avee/Common/DbgVar;

    invoke-direct {p6}, Lcom/daaw/avee/Common/DbgVar;-><init>()V

    iput-object p6, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->dbgVar:Lcom/daaw/avee/Common/DbgVar;

    .line 121
    iput p8, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->width:I

    .line 122
    iput p9, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->height:I

    .line 124
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->getTarget()I

    move-result p6

    invoke-static {p6}, Landroid/opengl/GLES20;->glEnable(I)V

    const/4 p6, 0x1

    new-array p7, p6, [I

    const/4 p8, 0x0

    .line 126
    invoke-static {p6, p7, p8}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 127
    aget p6, p7, p8

    iput p6, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->id:I

    .line 129
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->bind()V

    .line 131
    invoke-virtual {p0, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->setFilter(II)V

    .line 132
    invoke-virtual {p0, p4}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->setWrap(I)V

    if-eqz p1, :cond_2

    .line 135
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object p2

    .line 136
    sget-object p3, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    const/16 p4, 0x1908

    if-eq p2, p3, :cond_1

    sget-object p3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    if-eq p2, p3, :cond_1

    sget-object p3, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    if-ne p2, p3, :cond_0

    goto :goto_0

    :cond_0
    const/16 p1, -0x8000

    .line 140
    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->width:I

    iget p3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->height:I

    mul-int p2, p2, p3

    invoke-static {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->createSolidArray(II)[I

    move-result-object v0

    const/4 v1, 0x0

    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->width:I

    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->width:I

    iget v4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->height:I

    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static/range {v0 .. v5}, Landroid/graphics/Bitmap;->createBitmap([IIIIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 141
    invoke-virtual {p0, p4, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->upload(ILandroid/graphics/Bitmap;)V

    .line 142
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_1

    .line 137
    :cond_1
    :goto_0
    invoke-virtual {p0, p4, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->upload(ILandroid/graphics/Bitmap;)V

    :cond_2
    :goto_1
    if-eqz p5, :cond_3

    .line 147
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->width:I

    int-to-long p1, p1

    invoke-static {p1, p2}, Lcom/daaw/avee/Common/Utils;->IsPowerOfTwo(J)Z

    move-result p1

    if-eqz p1, :cond_3

    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->height:I

    int-to-long p1, p1

    invoke-static {p1, p2}, Lcom/daaw/avee/Common/Utils;->IsPowerOfTwo(J)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 148
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->getTarget()I

    move-result p1

    invoke-static {p1}, Landroid/opengl/GLES20;->glGenerateMipmap(I)V

    :cond_3
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIIZ)V
    .locals 3

    .line 60
    invoke-direct {p0}, Lmdesl/graphics/Texture;-><init>()V

    .line 30
    new-instance v0, Lcom/daaw/avee/Common/DbgVar;

    invoke-direct {v0}, Lcom/daaw/avee/Common/DbgVar;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->dbgVar:Lcom/daaw/avee/Common/DbgVar;

    .line 61
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 63
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    .line 64
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 65
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->width:I

    .line 66
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->height:I

    .line 68
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->width:I

    if-lt v0, v1, :cond_0

    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->height:I

    if-ge v0, v1, :cond_2

    :cond_0
    const-string v0, "texture invalid dimensions"

    .line 69
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    goto :goto_0

    .line 74
    :cond_1
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->width:I

    .line 75
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->height:I

    const/4 p1, 0x0

    .line 78
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->getTarget()I

    move-result v0

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnable(I)V

    new-array v0, v1, [I

    const/4 v2, 0x0

    .line 80
    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 81
    aget v0, v0, v2

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->id:I

    .line 83
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->bind()V

    .line 85
    invoke-virtual {p0, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->setFilter(II)V

    .line 86
    invoke-virtual {p0, p4}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->setWrap(I)V

    if-eqz p1, :cond_3

    const/16 p2, 0x1908

    .line 88
    invoke-virtual {p0, p2, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->upload(ILandroid/graphics/Bitmap;)V

    :cond_3
    if-eqz p5, :cond_4

    .line 90
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->width:I

    int-to-long p1, p1

    invoke-static {p1, p2}, Lcom/daaw/avee/Common/Utils;->IsPowerOfTwo(J)Z

    move-result p1

    if-eqz p1, :cond_4

    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->height:I

    int-to-long p1, p1

    invoke-static {p1, p2}, Lcom/daaw/avee/Common/Utils;->IsPowerOfTwo(J)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 91
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->getTarget()I

    move-result p1

    invoke-static {p1}, Landroid/opengl/GLES20;->glGenerateMipmap(I)V

    :cond_4
    return-void
.end method

.method private static createSolidArray(II)[I
    .locals 0

    .line 160
    new-array p1, p1, [I

    .line 161
    invoke-static {p1, p0}, Ljava/util/Arrays;->fill([II)V

    return-object p1
.end method


# virtual methods
.method public checkIfValid()Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;
    .locals 1

    .line 173
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->valid()Z

    move-result v0

    if-nez v0, :cond_0

    .line 174
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->dispose()V

    const-string v0, "Texture is not valid"

    .line 175
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    return-object p0
.end method

.method protected finalize()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 155
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 156
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->dbgVar:Lcom/daaw/avee/Common/DbgVar;

    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Graphic/-$$Lambda$VTexture$iHw0n_48c1znmIQ5lshPz95ShZ4;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/-$$Lambda$VTexture$iHw0n_48c1znmIQ5lshPz95ShZ4;-><init>(Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;)V

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/DbgVar;->assertDisposed(Lcom/daaw/avee/Common/Func/Func;)V

    return-void
.end method

.method public synthetic lambda$finalize$0$VTexture()Ljava/lang/Boolean;
    .locals 1

    .line 156
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->valid()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected upload(ILandroid/graphics/Bitmap;)V
    .locals 1

    .line 166
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->bind()V

    .line 167
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->setUnpackAlignment()V

    .line 168
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->getTarget()I

    move-result p1

    const/4 v0, 0x0

    invoke-static {p1, v0, p2, v0}, Landroid/opengl/GLUtils;->texImage2D(IILandroid/graphics/Bitmap;I)V

    return-void
.end method
