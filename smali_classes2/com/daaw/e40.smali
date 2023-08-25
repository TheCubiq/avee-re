.class public Lcom/daaw/e40;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/le0;


# instance fields
.field public a:I

.field public b:Lcom/daaw/vk1;

.field public c:Z


# direct methods
.method public constructor <init>(Lcom/daaw/vk1;Z)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/e40;->b:Lcom/daaw/vk1;

    iput-boolean p2, p0, Lcom/daaw/e40;->c:Z

    invoke-static {}, Lcom/daaw/e40;->d()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lcom/daaw/vk1;->c()V

    const/4 p2, 0x1

    new-array v0, p2, [I

    const/4 v1, 0x0

    invoke-static {p2, v0, v1}, Landroid/opengl/GLES20;->glGenFramebuffers(I[II)V

    aget v0, v0, v1

    iput v0, p0, Lcom/daaw/e40;->a:I

    const v2, 0x8d40

    invoke-static {v2, v0}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    const v0, 0x8ce0

    invoke-virtual {p1}, Lcom/daaw/vk1;->e()I

    move-result v3

    invoke-virtual {p1}, Lcom/daaw/vk1;->d()I

    move-result p1

    invoke-static {v2, v0, v3, p1, v1}, Landroid/opengl/GLES20;->glFramebufferTexture2D(IIIII)V

    invoke-static {v2}, Landroid/opengl/GLES20;->glCheckFramebufferStatus(I)I

    move-result p1

    const v0, 0x8cd5

    invoke-static {v2, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    new-array v0, p2, [I

    iget v2, p0, Lcom/daaw/e40;->a:I

    aput v2, v0, v1

    invoke-static {p2, v0, v1}, Landroid/opengl/GLES20;->glDeleteFramebuffers(I[II)V

    new-instance p2, Lcom/daaw/qi0;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "exception "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " when checking FBO status"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/daaw/qi0;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p1, Lcom/daaw/qi0;

    const-string p2, "FBO extension not supported in hardware"

    invoke-direct {p1, p2}, Lcom/daaw/qi0;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public a()V
    .locals 4

    iget v0, p0, Lcom/daaw/e40;->a:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    const v0, 0x8d40

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    const/4 v0, 0x1

    new-array v2, v0, [I

    iget v3, p0, Lcom/daaw/e40;->a:I

    aput v3, v2, v1

    invoke-static {v0, v2, v1}, Landroid/opengl/GLES20;->glDeleteFramebuffers(I[II)V

    iget-boolean v0, p0, Lcom/daaw/e40;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/e40;->b:Lcom/daaw/vk1;

    invoke-virtual {v0}, Lcom/daaw/vk1;->a()V

    :cond_1
    iput v1, p0, Lcom/daaw/e40;->a:I

    return-void
.end method

.method public b()Lcom/daaw/vk1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/e40;->b:Lcom/daaw/vk1;

    return-object v0
.end method

.method public c()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public getHeight()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/e40;->b:Lcom/daaw/vk1;

    invoke-virtual {v0}, Lcom/daaw/vk1;->getHeight()I

    move-result v0

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/e40;->b:Lcom/daaw/vk1;

    invoke-virtual {v0}, Lcom/daaw/vk1;->getWidth()I

    move-result v0

    return v0
.end method
