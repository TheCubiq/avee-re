.class public Lcom/daaw/vr1;
.super Lcom/daaw/vk1;
.source ""


# instance fields
.field public d:Lcom/daaw/vp;


# direct methods
.method public constructor <init>(IIIIIIZ)V
    .locals 12

    mul-int v0, p2, p3

    move v1, p1

    invoke-static {p1, v0}, Lcom/daaw/vr1;->n(II)[I

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

    invoke-direct/range {v6 .. v11}, Lcom/daaw/vr1;-><init>(Landroid/graphics/Bitmap;IIIZ)V

    return-void
.end method

.method public constructor <init>(IIIIZ)V
    .locals 3

    invoke-direct {p0}, Lcom/daaw/vk1;-><init>()V

    new-instance v0, Lcom/daaw/vp;

    invoke-direct {v0}, Lcom/daaw/vp;-><init>()V

    iput-object v0, p0, Lcom/daaw/vr1;->d:Lcom/daaw/vp;

    const/4 v0, 0x1

    new-array v1, v0, [I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    aget v0, v1, v2

    iput v0, p0, Lcom/daaw/vk1;->a:I

    const/16 v0, 0x1000

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, p0, Lcom/daaw/vk1;->b:I

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/daaw/vk1;->c:I

    invoke-virtual {p0}, Lcom/daaw/vk1;->c()V

    invoke-virtual {p0, p3}, Lcom/daaw/vk1;->f(I)V

    invoke-virtual {p0, p4}, Lcom/daaw/vk1;->i(I)V

    const/16 p3, 0x1908

    const/4 p4, 0x0

    invoke-virtual {p0, p3, p4}, Lcom/daaw/vk1;->j(ILjava/nio/ByteBuffer;)V

    if-eqz p5, :cond_0

    int-to-long p3, p1

    invoke-static {p3, p4}, Lcom/daaw/br1;->c(J)Z

    move-result p1

    if-eqz p1, :cond_0

    int-to-long p1, p2

    invoke-static {p1, p2}, Lcom/daaw/br1;->c(J)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/vk1;->e()I

    move-result p1

    invoke-static {p1}, Landroid/opengl/GLES20;->glGenerateMipmap(I)V

    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;IIIZ)V
    .locals 10

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

    invoke-direct/range {v0 .. v9}, Lcom/daaw/vr1;-><init>(Landroid/graphics/Bitmap;IIIZIIII)V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;IIIZIIII)V
    .locals 6

    invoke-direct {p0}, Lcom/daaw/vk1;-><init>()V

    new-instance p6, Lcom/daaw/vp;

    invoke-direct {p6}, Lcom/daaw/vp;-><init>()V

    iput-object p6, p0, Lcom/daaw/vr1;->d:Lcom/daaw/vp;

    iput p8, p0, Lcom/daaw/vk1;->b:I

    iput p9, p0, Lcom/daaw/vk1;->c:I

    invoke-virtual {p0}, Lcom/daaw/vk1;->e()I

    move-result p6

    invoke-static {p6}, Landroid/opengl/GLES20;->glEnable(I)V

    const/4 p6, 0x1

    new-array p7, p6, [I

    const/4 p8, 0x0

    invoke-static {p6, p7, p8}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    aget p6, p7, p8

    iput p6, p0, Lcom/daaw/vk1;->a:I

    invoke-virtual {p0}, Lcom/daaw/vk1;->c()V

    invoke-virtual {p0, p2, p3}, Lcom/daaw/vk1;->g(II)V

    invoke-virtual {p0, p4}, Lcom/daaw/vk1;->i(I)V

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object p2

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

    iget p2, p0, Lcom/daaw/vk1;->b:I

    iget p3, p0, Lcom/daaw/vk1;->c:I

    mul-int p2, p2, p3

    invoke-static {p1, p2}, Lcom/daaw/vr1;->n(II)[I

    move-result-object v0

    const/4 v1, 0x0

    iget v3, p0, Lcom/daaw/vk1;->b:I

    iget v4, p0, Lcom/daaw/vk1;->c:I

    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    move v2, v3

    invoke-static/range {v0 .. v5}, Landroid/graphics/Bitmap;->createBitmap([IIIIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {p0, p4, p1}, Lcom/daaw/vr1;->p(ILandroid/graphics/Bitmap;)V

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p0, p4, p1}, Lcom/daaw/vr1;->p(ILandroid/graphics/Bitmap;)V

    :cond_2
    :goto_1
    if-eqz p5, :cond_3

    iget p1, p0, Lcom/daaw/vk1;->b:I

    int-to-long p1, p1

    invoke-static {p1, p2}, Lcom/daaw/br1;->c(J)Z

    move-result p1

    if-eqz p1, :cond_3

    iget p1, p0, Lcom/daaw/vk1;->c:I

    int-to-long p1, p1

    invoke-static {p1, p2}, Lcom/daaw/br1;->c(J)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lcom/daaw/vk1;->e()I

    move-result p1

    invoke-static {p1}, Landroid/opengl/GLES20;->glGenerateMipmap(I)V

    :cond_3
    return-void
.end method

.method public static synthetic l(Lcom/daaw/vr1;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0}, Lcom/daaw/vr1;->o()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static n(II)[I
    .locals 0

    new-array p1, p1, [I

    invoke-static {p1, p0}, Ljava/util/Arrays;->fill([II)V

    return-object p1
.end method

.method private synthetic o()Ljava/lang/Boolean;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/vk1;->k()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public finalize()V
    .locals 2

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    iget-object v0, p0, Lcom/daaw/vr1;->d:Lcom/daaw/vp;

    new-instance v1, Lcom/daaw/ur1;

    invoke-direct {v1, p0}, Lcom/daaw/ur1;-><init>(Lcom/daaw/vr1;)V

    invoke-virtual {v0, v1}, Lcom/daaw/vp;->a(Lcom/daaw/w40;)V

    return-void
.end method

.method public m()Lcom/daaw/vr1;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/vk1;->k()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/vk1;->a()V

    const-string v0, "Texture is not valid"

    invoke-static {v0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    return-object p0
.end method

.method public p(ILandroid/graphics/Bitmap;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/vk1;->c()V

    invoke-virtual {p0}, Lcom/daaw/vk1;->h()V

    invoke-virtual {p0}, Lcom/daaw/vk1;->e()I

    move-result p1

    const/4 v0, 0x0

    invoke-static {p1, v0, p2, v0}, Landroid/opengl/GLUtils;->texImage2D(IILandroid/graphics/Bitmap;I)V

    return-void
.end method
