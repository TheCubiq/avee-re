.class public Lcom/daaw/s7;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x11
.end annotation


# instance fields
.field public a:Lcom/daaw/ug1;

.field public b:Ljava/io/File;

.field public c:Lcom/daaw/l7;

.field public d:Lcom/daaw/wk1;

.field public e:Landroid/graphics/Rect;

.field public f:Lcom/daaw/po0;

.field public g:Lcom/daaw/k7;

.field public h:Lcom/daaw/os1;

.field public i:Lcom/daaw/q40;

.field public j:I

.field public k:I

.field public l:I

.field public m:Lcom/daaw/eg0;

.field public n:Lcom/daaw/nc1;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/s7;->a:Lcom/daaw/ug1;

    const/16 v0, 0x1e

    iput v0, p0, Lcom/daaw/s7;->l:I

    new-instance v0, Lcom/daaw/nc1;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lcom/daaw/nc1;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/s7;->n:Lcom/daaw/nc1;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/daaw/s7;->e:Landroid/graphics/Rect;

    return-void
.end method

.method public static c(JI)J
    .locals 2

    const-wide/32 v0, 0xf4240

    mul-long p0, p0, v0

    int-to-long v0, p2

    div-long/2addr p0, v0

    return-wide p0
.end method

.method public static d(JJ)I
    .locals 0

    mul-long p0, p0, p2

    const-wide/32 p2, 0xf4240

    div-long/2addr p0, p2

    long-to-int p1, p0

    return p1
.end method

.method public static h(I)I
    .locals 0

    invoke-static {p0}, Lcom/daaw/s7;->n(I)I

    move-result p0

    return p0
.end method

.method public static i(I)I
    .locals 0

    invoke-static {p0}, Lcom/daaw/s7;->n(I)I

    move-result p0

    return p0
.end method

.method public static j()Ljava/lang/String;
    .locals 1

    const-string v0, ".mp4"

    return-object v0
.end method

.method public static k()Ljava/lang/String;
    .locals 1

    const-string v0, "video/mp4"

    return-object v0
.end method

.method public static n(I)I
    .locals 1

    rem-int/lit8 v0, p0, 0x10

    if-nez v0, :cond_0

    return p0

    :cond_0
    rsub-int/lit8 v0, v0, 0x10

    add-int/2addr v0, p0

    return v0
.end method


# virtual methods
.method public a(Lcom/daaw/vk1;JI)Z
    .locals 6

    iget-object p4, p0, Lcom/daaw/s7;->h:Lcom/daaw/os1;

    const/4 v0, 0x0

    if-eqz p4, :cond_6

    iget-object p4, p0, Lcom/daaw/s7;->d:Lcom/daaw/wk1;

    if-nez p4, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-static {}, Landroid/opengl/EGL14;->eglGetCurrentDisplay()Landroid/opengl/EGLDisplay;

    move-result-object p4

    const/16 v1, 0x305a

    invoke-static {v1}, Landroid/opengl/EGL14;->eglGetCurrentSurface(I)Landroid/opengl/EGLSurface;

    move-result-object v1

    const/16 v2, 0x3059

    invoke-static {v2}, Landroid/opengl/EGL14;->eglGetCurrentSurface(I)Landroid/opengl/EGLSurface;

    move-result-object v2

    invoke-static {}, Landroid/opengl/EGL14;->eglGetCurrentContext()Landroid/opengl/EGLContext;

    move-result-object v3

    if-nez v3, :cond_1

    const-string p1, "oldEGLContext is null"

    :goto_0
    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    return v0

    :cond_1
    iget-object v4, p0, Lcom/daaw/s7;->m:Lcom/daaw/eg0;

    if-nez v4, :cond_2

    :try_start_0
    new-instance v4, Lcom/daaw/eg0;

    iget-object v5, p0, Lcom/daaw/s7;->h:Lcom/daaw/os1;

    invoke-virtual {v5}, Lcom/daaw/os1;->b()Landroid/view/Surface;

    move-result-object v5

    invoke-direct {v4, v5, v3}, Lcom/daaw/eg0;-><init>(Landroid/view/Surface;Landroid/opengl/EGLContext;)V

    iput-object v4, p0, Lcom/daaw/s7;->m:Lcom/daaw/eg0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    return v0

    :cond_2
    :goto_1
    invoke-virtual {p1}, Lcom/daaw/vk1;->k()Z

    move-result v4

    if-nez v4, :cond_3

    return v0

    :cond_3
    :try_start_1
    iget-object v4, p0, Lcom/daaw/s7;->m:Lcom/daaw/eg0;

    invoke-virtual {v4}, Lcom/daaw/eg0;->c()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    const-wide/16 v4, 0x3e8

    mul-long p2, p2, v4

    iget-object v4, p0, Lcom/daaw/s7;->m:Lcom/daaw/eg0;

    invoke-virtual {v4, p2, p3}, Lcom/daaw/eg0;->e(J)V

    iget-object p2, p0, Lcom/daaw/s7;->i:Lcom/daaw/q40;

    if-nez p2, :cond_4

    new-instance p2, Lcom/daaw/q40;

    invoke-direct {p2}, Lcom/daaw/q40;-><init>()V

    iput-object p2, p0, Lcom/daaw/s7;->i:Lcom/daaw/q40;

    :cond_4
    const/4 p2, 0x0

    const/high16 p3, 0x3f800000    # 1.0f

    invoke-static {p3, p3, p2, p3}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    const/16 p2, 0x4100

    invoke-static {p2}, Landroid/opengl/GLES20;->glClear(I)V

    iget-object p2, p0, Lcom/daaw/s7;->e:Landroid/graphics/Rect;

    invoke-virtual {p1}, Lcom/daaw/vk1;->getWidth()I

    move-result p3

    invoke-virtual {p1}, Lcom/daaw/vk1;->getHeight()I

    move-result v4

    invoke-virtual {p2, v0, v0, p3, v4}, Landroid/graphics/Rect;->set(IIII)V

    iget-object p2, p0, Lcom/daaw/s7;->e:Landroid/graphics/Rect;

    iget p3, p2, Landroid/graphics/Rect;->left:I

    iget v4, p2, Landroid/graphics/Rect;->top:I

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result p2

    iget-object v5, p0, Lcom/daaw/s7;->e:Landroid/graphics/Rect;

    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    move-result v5

    invoke-static {p3, v4, p2, v5}, Landroid/opengl/GLES20;->glViewport(IIII)V

    invoke-virtual {p1}, Lcom/daaw/vk1;->c()V

    iget-object p1, p0, Lcom/daaw/s7;->i:Lcom/daaw/q40;

    invoke-virtual {p1}, Lcom/daaw/q40;->d()V

    iget-object p1, p0, Lcom/daaw/s7;->m:Lcom/daaw/eg0;

    invoke-virtual {p1}, Lcom/daaw/eg0;->f()Z

    invoke-static {p4, v2, v1, v3}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, "EGL14.eglMakeCurrent failed"

    goto :goto_0

    :cond_5
    const/4 p1, 0x1

    return p1

    :catch_1
    :cond_6
    :goto_2
    return v0
.end method

.method public b(Lcom/daaw/ke0;J)V
    .locals 5

    invoke-interface {p1}, Lcom/daaw/ke0;->size()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/s7;->c:Lcom/daaw/l7;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/s7;->g:Lcom/daaw/k7;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/daaw/k7$a;

    invoke-direct {v0}, Lcom/daaw/k7$a;-><init>()V

    iget-object v1, p0, Lcom/daaw/s7;->n:Lcom/daaw/nc1;

    invoke-interface {p1}, Lcom/daaw/ke0;->size()I

    move-result v2

    const-wide/16 v3, 0xa

    invoke-virtual {v1, v2, v3, v4}, Lcom/daaw/nc1;->a(IJ)Lcom/daaw/nc1$a;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/k7$a;->a:Lcom/daaw/nc1$a;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, v0, Lcom/daaw/k7$a;->a:Lcom/daaw/nc1$a;

    iget-object v2, v2, Lcom/daaw/nc1$a;->a:[S

    array-length v3, v2

    if-ge v1, v3, :cond_1

    invoke-interface {p1, v1}, Lcom/daaw/ke0;->get(I)S

    move-result v3

    aput-short v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    array-length p1, v2

    iput p1, v0, Lcom/daaw/k7$a;->b:I

    iput-wide p2, v0, Lcom/daaw/k7$a;->c:J

    iget-object p1, p0, Lcom/daaw/s7;->c:Lcom/daaw/l7;

    invoke-virtual {p1, v0}, Lcom/daaw/l7;->d(Lcom/daaw/k7$a;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public e(Lcom/daaw/wf1;)Z
    .locals 2

    const-string v0, "### finish"

    invoke-static {v0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/s7;->d:Lcom/daaw/wk1;

    iget-object v1, p0, Lcom/daaw/s7;->m:Lcom/daaw/eg0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/daaw/eg0;->d()V

    iput-object v0, p0, Lcom/daaw/s7;->m:Lcom/daaw/eg0;

    :cond_0
    iget-object v1, p0, Lcom/daaw/s7;->a:Lcom/daaw/ug1;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1}, Lcom/daaw/ug1;->a(Lcom/daaw/wf1;)Z

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    :goto_0
    iput-object v0, p0, Lcom/daaw/s7;->a:Lcom/daaw/ug1;

    return p1
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/s7;->d:Lcom/daaw/wk1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/wk1;->c()V

    :cond_0
    return-void
.end method

.method public g()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/s7;->g:Lcom/daaw/k7;

    if-nez v0, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/k7;->c()I

    move-result v0

    :goto_0
    return v0
.end method

.method public l(Ljava/io/File;Ljava/io/OutputStream;IIIFZFIILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 14

    move-object v13, p0

    move-object v0, p1

    move-object/from16 v1, p2

    if-eqz v1, :cond_0

    new-instance v2, Lcom/daaw/ug1;

    invoke-direct {v2, p1, v1}, Lcom/daaw/ug1;-><init>(Ljava/io/File;Ljava/io/OutputStream;)V

    iput-object v2, v13, Lcom/daaw/s7;->a:Lcom/daaw/ug1;

    :cond_0
    iput-object v0, v13, Lcom/daaw/s7;->b:Ljava/io/File;

    const/high16 v0, 0x42b40000    # 90.0f

    const v1, 0x3dcccccd    # 0.1f

    move/from16 v2, p6

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v4

    const/4 v6, 0x5

    move-object v0, p0

    move/from16 v1, p7

    move/from16 v2, p4

    move/from16 v3, p5

    move/from16 v5, p3

    move/from16 v7, p8

    move/from16 v8, p9

    move/from16 v9, p10

    move-object/from16 v10, p11

    move-object/from16 v11, p12

    move/from16 v12, p13

    invoke-virtual/range {v0 .. v12}, Lcom/daaw/s7;->o(ZIIFIIFIILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public m()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/s7;->i:Lcom/daaw/q40;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/q40;->b()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/s7;->i:Lcom/daaw/q40;

    return-void
.end method

.method public final o(ZIIFIIFIILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 13

    move-object v1, p0

    const/4 v0, 0x0

    cmpg-float v0, p4, v0

    if-gez v0, :cond_0

    const/high16 v0, 0x40800000    # 4.0f

    goto :goto_0

    :cond_0
    move/from16 v0, p4

    :goto_0
    if-gez p5, :cond_1

    const/16 v2, 0x1e

    const/16 v8, 0x1e

    goto :goto_1

    :cond_1
    move/from16 v8, p5

    :goto_1
    if-gez p6, :cond_2

    const/4 v2, 0x5

    const/4 v9, 0x5

    goto :goto_2

    :cond_2
    move/from16 v9, p6

    :goto_2
    iput v8, v1, Lcom/daaw/s7;->l:I

    move v2, p2

    iput v2, v1, Lcom/daaw/s7;->k:I

    move/from16 v2, p3

    iput v2, v1, Lcom/daaw/s7;->j:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "starting to record "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v1, Lcom/daaw/s7;->k:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v1, Lcom/daaw/s7;->j:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/lz1;->a(Ljava/lang/String;)V

    const v2, 0x49742400    # 1000000.0f

    mul-float v0, v0, v2

    float-to-int v7, v0

    const/high16 v0, 0x447a0000    # 1000.0f

    mul-float v0, v0, p7

    float-to-int v0, v0

    :try_start_0
    new-instance v2, Lcom/daaw/po0;

    iget-object v3, v1, Lcom/daaw/s7;->b:Ljava/io/File;

    if-eqz p1, :cond_3

    const/4 v4, 0x2

    goto :goto_3

    :cond_3
    const/4 v4, 0x1

    :goto_3
    invoke-direct {v2, v3, v4}, Lcom/daaw/po0;-><init>(Ljava/io/File;I)V

    iput-object v2, v1, Lcom/daaw/s7;->f:Lcom/daaw/po0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    const-wide v2, 0x412e848000000000L    # 1000000.0

    int-to-double v4, v8

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-long v2, v2

    if-eqz p1, :cond_4

    :try_start_1
    new-instance v4, Lcom/daaw/k7;

    iget-object v5, v1, Lcom/daaw/s7;->f:Lcom/daaw/po0;

    move/from16 v6, p9

    int-to-long v10, v6

    invoke-static {v2, v3, v10, v11}, Lcom/daaw/s7;->d(JJ)I

    move-result v2

    add-int/lit8 v2, v2, 0x8

    move-object p2, v4

    move-object/from16 p3, v5

    move/from16 p4, p9

    move/from16 p5, p8

    move/from16 p6, v0

    move/from16 p7, v2

    invoke-direct/range {p2 .. p7}, Lcom/daaw/k7;-><init>(Lcom/daaw/po0;IIII)V

    iput-object v4, v1, Lcom/daaw/s7;->g:Lcom/daaw/k7;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_5

    :catch_0
    move-exception v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AudioEncoder: "

    :goto_4
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_4
    :goto_5
    if-eqz p1, :cond_5

    :try_start_2
    new-instance v0, Lcom/daaw/l7;

    iget-object v2, v1, Lcom/daaw/s7;->g:Lcom/daaw/k7;

    invoke-direct {v0, v2}, Lcom/daaw/l7;-><init>(Lcom/daaw/k7;)V

    iput-object v0, v1, Lcom/daaw/s7;->c:Lcom/daaw/l7;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_6

    :catch_1
    move-exception v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AudioEncoderManager: "

    goto :goto_4

    :cond_5
    :goto_6
    :try_start_3
    new-instance v0, Lcom/daaw/os1;

    iget-object v4, v1, Lcom/daaw/s7;->f:Lcom/daaw/po0;

    iget v5, v1, Lcom/daaw/s7;->k:I

    iget v6, v1, Lcom/daaw/s7;->j:I

    move-object v3, v0

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v3 .. v12}, Lcom/daaw/os1;-><init>(Lcom/daaw/po0;IIIIILjava/lang/String;Ljava/lang/String;I)V

    iput-object v0, v1, Lcom/daaw/s7;->h:Lcom/daaw/os1;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    :try_start_4
    new-instance v2, Lcom/daaw/wk1;

    invoke-direct {v2, v0}, Lcom/daaw/wk1;-><init>(Lcom/daaw/os1;)V

    iput-object v2, v1, Lcom/daaw/s7;->d:Lcom/daaw/wk1;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    const/4 v0, 0x0

    return-object v0

    :catch_2
    move-exception v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TextureEncoder: "

    goto :goto_4

    :catch_3
    move-exception v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "VideoEncoder: "

    goto :goto_4

    :catch_4
    move-exception v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MediaMuxer: "

    goto :goto_4
.end method

.method public p(Lcom/daaw/wf1;)Z
    .locals 4

    iget-object v0, p0, Lcom/daaw/s7;->d:Lcom/daaw/wk1;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "stopping video recorder, videoEncoder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/s7;->d:Lcom/daaw/wk1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/lz1;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/s7;->d:Lcom/daaw/wk1;

    invoke-virtual {v0}, Lcom/daaw/wk1;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/s7;->d:Lcom/daaw/wk1;

    invoke-virtual {v0}, Lcom/daaw/wk1;->g()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/s7;->c:Lcom/daaw/l7;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "stopping audio recorder, videoEncoder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/s7;->d:Lcom/daaw/wk1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/lz1;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/s7;->c:Lcom/daaw/l7;

    invoke-virtual {v0}, Lcom/daaw/l7;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/s7;->c:Lcom/daaw/l7;

    invoke-virtual {v0}, Lcom/daaw/l7;->i()V

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/s7;->c:Lcom/daaw/l7;

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/daaw/l7;->g()Z

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    iget-object v1, p0, Lcom/daaw/s7;->d:Lcom/daaw/wk1;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/daaw/wk1;->f()Z

    move-result v1

    if-eqz v1, :cond_5

    :cond_3
    add-int/2addr v0, v2

    rem-int/lit16 v1, v0, 0x3e8

    if-nez v1, :cond_4

    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Waiting on .isRecording for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    div-int/lit8 v3, v0, 0x64

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " seconds already"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    const-string v2, ""

    invoke-static {v1, v2}, Lcom/daaw/lz1;->b(Ljava/lang/Exception;Ljava/lang/String;)V

    :cond_4
    const-wide/16 v1, 0xa

    :try_start_0
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/daaw/lz1;->b(Ljava/lang/Exception;Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/daaw/s7;->f:Lcom/daaw/po0;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/daaw/po0;->c()V

    :cond_6
    iget-object v0, p0, Lcom/daaw/s7;->c:Lcom/daaw/l7;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lcom/daaw/l7;->h(Lcom/daaw/wf1;)V

    :cond_7
    return v2
.end method
