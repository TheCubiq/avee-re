.class public Lcom/daaw/or1;
.super Lcom/daaw/e40;
.source ""


# instance fields
.field public d:Lcom/daaw/vp;


# direct methods
.method public constructor <init>(Lcom/daaw/vr1;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/e40;-><init>(Lcom/daaw/vk1;Z)V

    new-instance p1, Lcom/daaw/vp;

    invoke-direct {p1}, Lcom/daaw/vp;-><init>()V

    iput-object p1, p0, Lcom/daaw/or1;->d:Lcom/daaw/vp;

    return-void
.end method

.method public static synthetic e(Lcom/daaw/or1;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0}, Lcom/daaw/or1;->i()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static g(IIIIZ)Lcom/daaw/or1;
    .locals 7

    new-instance v6, Lcom/daaw/vr1;

    move-object v0, v6

    move v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/daaw/vr1;-><init>(IIIIZ)V

    invoke-virtual {v6}, Lcom/daaw/vr1;->m()Lcom/daaw/vr1;

    move-result-object p0

    const/4 p1, 0x0

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    :try_start_0
    new-instance p2, Lcom/daaw/or1;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p3}, Lcom/daaw/or1;-><init>(Lcom/daaw/vr1;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "exception "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    return-object p1
.end method

.method private synthetic i()Ljava/lang/Boolean;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/or1;->h()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public c()V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/or1;->h()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/e40;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/daaw/e40;->getHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v1}, Landroid/opengl/GLES20;->glViewport(IIII)V

    const v0, 0x8d40

    iget v1, p0, Lcom/daaw/e40;->a:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    return-void
.end method

.method public f()Lcom/daaw/or1;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/or1;->h()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/e40;->a()V

    const-string v0, "FrameBuffer is not valid"

    invoke-static {v0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    return-object p0
.end method

.method public finalize()V
    .locals 2

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    iget-object v0, p0, Lcom/daaw/or1;->d:Lcom/daaw/vp;

    new-instance v1, Lcom/daaw/nr1;

    invoke-direct {v1, p0}, Lcom/daaw/nr1;-><init>(Lcom/daaw/or1;)V

    invoke-virtual {v0, v1}, Lcom/daaw/vp;->a(Lcom/daaw/w40;)V

    return-void
.end method

.method public h()Z
    .locals 1

    iget v0, p0, Lcom/daaw/e40;->a:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
