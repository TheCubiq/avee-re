.class public Lcom/daaw/zr0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Z

.field public b:[B

.field public c:Landroid/media/audiofx/Visualizer;

.field public d:I

.field public e:Landroid/media/audiofx/Virtualizer;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/daaw/zr0;->b:[B

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/zr0;->d:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/zr0;->e:Landroid/media/audiofx/Virtualizer;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/zr0;->a:Z

    return-void
.end method

.method public static b(I)I
    .locals 1

    if-gez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    add-int/lit8 p0, p0, -0x1

    shr-int/lit8 v0, p0, 0x1

    or-int/2addr p0, v0

    shr-int/lit8 v0, p0, 0x2

    or-int/2addr p0, v0

    shr-int/lit8 v0, p0, 0x4

    or-int/2addr p0, v0

    shr-int/lit8 v0, p0, 0x8

    or-int/2addr p0, v0

    shr-int/lit8 v0, p0, 0x10

    or-int/2addr p0, v0

    add-int/lit8 p0, p0, 0x1

    return p0
.end method


# virtual methods
.method public a(JLcom/daaw/avee/comp/playback/a$h;Lcom/daaw/avee/comp/playback/a;IZ)Lcom/daaw/avee/comp/playback/a;
    .locals 8

    iget-boolean p1, p0, Lcom/daaw/zr0;->a:Z

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    return-object p2

    :cond_0
    const/4 p1, 0x0

    if-eqz p6, :cond_1

    const/4 p5, 0x0

    :cond_1
    iget-object p6, p0, Lcom/daaw/zr0;->c:Landroid/media/audiofx/Visualizer;

    const/4 v0, 0x1

    if-eqz p6, :cond_2

    iget p6, p0, Lcom/daaw/zr0;->d:I

    if-eq p6, p5, :cond_3

    :cond_2
    :try_start_0
    new-instance p6, Ljava/lang/StringBuilder;

    invoke-direct {p6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "### audioSessionId: "

    invoke-virtual {p6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p6

    invoke-static {p6}, Lcom/daaw/lz1;->a(Ljava/lang/String;)V

    new-instance p6, Landroid/media/audiofx/Visualizer;

    invoke-direct {p6, p5}, Landroid/media/audiofx/Visualizer;-><init>(I)V

    iput-object p6, p0, Lcom/daaw/zr0;->c:Landroid/media/audiofx/Visualizer;

    iput p5, p0, Lcom/daaw/zr0;->d:I

    invoke-virtual {p6, p1}, Landroid/media/audiofx/Visualizer;->setScalingMode(I)I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p5

    new-instance p6, Ljava/lang/StringBuilder;

    invoke-direct {p6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "### visualizer exception: "

    invoke-virtual {p6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p6, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-static {p5}, Lcom/daaw/lz1;->a(Ljava/lang/String;)V

    iput-boolean v0, p0, Lcom/daaw/zr0;->a:Z

    const/4 p5, -0x1

    iput p5, p0, Lcom/daaw/zr0;->d:I

    :cond_3
    :goto_0
    iget-object p5, p0, Lcom/daaw/zr0;->c:Landroid/media/audiofx/Visualizer;

    if-nez p5, :cond_4

    return-object p2

    :cond_4
    invoke-virtual {p5}, Landroid/media/audiofx/Visualizer;->getCaptureSize()I

    move-result p2

    iget p5, p3, Lcom/daaw/avee/comp/playback/a$h;->d:I

    invoke-static {p5}, Lcom/daaw/zr0;->b(I)I

    move-result p5

    invoke-static {}, Landroid/media/audiofx/Visualizer;->getCaptureSizeRange()[I

    move-result-object p6

    aget v1, p6, p1

    aget p6, p6, v0

    invoke-static {p6, p5}, Ljava/lang/Math;->min(II)I

    move-result p5

    invoke-static {v1, p5}, Ljava/lang/Math;->max(II)I

    move-result p5

    const v3, 0xac44

    iget v4, p3, Lcom/daaw/avee/comp/playback/a$h;->a:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p4

    move v5, p5

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/avee/comp/playback/a;->e(IIIIZ)V

    if-eq p5, p2, :cond_5

    iget-object p3, p0, Lcom/daaw/zr0;->c:Landroid/media/audiofx/Visualizer;

    invoke-virtual {p3, p1}, Landroid/media/audiofx/Visualizer;->setEnabled(Z)I

    :try_start_1
    iget-object p3, p0, Lcom/daaw/zr0;->c:Landroid/media/audiofx/Visualizer;

    invoke-virtual {p3, p5}, Landroid/media/audiofx/Visualizer;->setCaptureSize(I)I
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    move p2, p5

    goto :goto_1

    :catch_1
    nop

    :cond_5
    :goto_1
    iget-object p3, p0, Lcom/daaw/zr0;->b:[B

    array-length p3, p3

    if-eq p3, p2, :cond_6

    new-array p2, p2, [B

    iput-object p2, p0, Lcom/daaw/zr0;->b:[B

    :cond_6
    iget-object p2, p0, Lcom/daaw/zr0;->c:Landroid/media/audiofx/Visualizer;

    invoke-virtual {p2}, Landroid/media/audiofx/Visualizer;->getEnabled()Z

    move-result p2

    if-nez p2, :cond_7

    iget-object p2, p0, Lcom/daaw/zr0;->c:Landroid/media/audiofx/Visualizer;

    invoke-virtual {p2, v0}, Landroid/media/audiofx/Visualizer;->setEnabled(Z)I

    :cond_7
    :try_start_2
    iget-object p2, p0, Lcom/daaw/zr0;->c:Landroid/media/audiofx/Visualizer;

    iget-object p3, p0, Lcom/daaw/zr0;->b:[B

    invoke-virtual {p2, p3}, Landroid/media/audiofx/Visualizer;->getWaveForm([B)I
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    nop

    :goto_2
    const/4 p2, 0x0

    iget-object p3, p0, Lcom/daaw/zr0;->b:[B

    array-length p3, p3

    invoke-virtual {p4}, Lcom/daaw/avee/comp/playback/a;->b()I

    move-result p5

    invoke-static {p3, p5}, Ljava/lang/Math;->min(II)I

    move-result p3

    iget p5, p4, Lcom/daaw/avee/comp/playback/a;->b:I

    const/high16 p6, 0x437f0000    # 255.0f

    const/4 v1, 0x2

    if-ne p5, v0, :cond_a

    :goto_3
    if-ge p1, p3, :cond_d

    iget-object p5, p0, Lcom/daaw/zr0;->b:[B

    aget-byte p5, p5, p1

    and-int/lit16 p5, p5, 0xff

    add-int/lit8 p5, p5, -0x80

    int-to-short p5, p5

    mul-int/lit8 p5, p5, 0x2

    mul-int/lit16 p5, p5, 0x96

    int-to-short p5, p5

    iget-object v2, p4, Lcom/daaw/avee/comp/playback/a;->c:[S

    iget v3, p4, Lcom/daaw/avee/comp/playback/a;->b:I

    mul-int v4, p1, v3

    aput-short p5, v2, v4

    iget-short v4, p4, Lcom/daaw/avee/comp/playback/a;->d:S

    if-le v4, p5, :cond_8

    iput-short p5, p4, Lcom/daaw/avee/comp/playback/a;->d:S

    :cond_8
    iget-short v4, p4, Lcom/daaw/avee/comp/playback/a;->e:S

    if-ge v4, p5, :cond_9

    iput-short p5, p4, Lcom/daaw/avee/comp/playback/a;->e:S

    :cond_9
    mul-int v3, v3, p1

    aget-short p5, v2, v3

    int-to-float p5, p5

    div-float/2addr p5, p6

    add-float/2addr p2, p5

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_a
    if-ne p5, v1, :cond_d

    :goto_4
    if-ge p1, p3, :cond_d

    iget-object p5, p0, Lcom/daaw/zr0;->b:[B

    aget-byte p5, p5, p1

    and-int/lit16 p5, p5, 0xff

    add-int/lit8 p5, p5, -0x80

    int-to-short p5, p5

    mul-int/lit8 p5, p5, 0x2

    mul-int/lit16 p5, p5, 0x96

    int-to-short p5, p5

    iget-object v2, p4, Lcom/daaw/avee/comp/playback/a;->c:[S

    iget v3, p4, Lcom/daaw/avee/comp/playback/a;->b:I

    mul-int v4, p1, v3

    aput-short p5, v2, v4

    mul-int v4, p1, v3

    add-int/2addr v4, v0

    aput-short p5, v2, v4

    iget-short v4, p4, Lcom/daaw/avee/comp/playback/a;->d:S

    if-le v4, p5, :cond_b

    iput-short p5, p4, Lcom/daaw/avee/comp/playback/a;->d:S

    :cond_b
    iget-short v4, p4, Lcom/daaw/avee/comp/playback/a;->e:S

    if-ge v4, p5, :cond_c

    iput-short p5, p4, Lcom/daaw/avee/comp/playback/a;->e:S

    :cond_c
    mul-int v3, v3, p1

    aget-short p5, v2, v3

    int-to-float p5, p5

    div-float/2addr p5, p6

    add-float/2addr p2, p5

    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    :cond_d
    invoke-virtual {p4}, Lcom/daaw/avee/comp/playback/a;->b()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p2, p1

    iput p2, p4, Lcom/daaw/avee/comp/playback/a;->g:F

    iput-boolean v0, p4, Lcom/daaw/avee/comp/playback/a;->a:Z

    return-object p4
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/zr0;->c:Landroid/media/audiofx/Visualizer;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Landroid/media/audiofx/Visualizer;->setEnabled(Z)I

    iget-object v0, p0, Lcom/daaw/zr0;->c:Landroid/media/audiofx/Visualizer;

    invoke-virtual {v0}, Landroid/media/audiofx/Visualizer;->release()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/zr0;->e:Landroid/media/audiofx/Virtualizer;

    if-eqz v0, :cond_1

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/media/audiofx/Virtualizer;->setEnabled(Z)I

    iget-object v0, p0, Lcom/daaw/zr0;->e:Landroid/media/audiofx/Virtualizer;

    invoke-virtual {v0, v1}, Landroid/media/audiofx/Virtualizer;->setEnabled(Z)I

    iget-object v0, p0, Lcom/daaw/zr0;->e:Landroid/media/audiofx/Virtualizer;

    invoke-virtual {v0}, Landroid/media/audiofx/Virtualizer;->release()V

    :cond_1
    return-void
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/zr0;->a:Z

    return-void
.end method
