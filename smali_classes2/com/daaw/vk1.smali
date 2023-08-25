.class public Lcom/daaw/vk1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/le0;


# instance fields
.field public a:I

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/vk1;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    new-array v1, v0, [I

    iget v2, p0, Lcom/daaw/vk1;->a:I

    const/4 v3, 0x0

    aput v2, v1, v3

    invoke-static {v0, v1, v3}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    iput v3, p0, Lcom/daaw/vk1;->a:I

    :cond_0
    return-void
.end method

.method public b()Lcom/daaw/vk1;
    .locals 0

    return-object p0
.end method

.method public c()V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/vk1;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/vk1;->e()I

    move-result v0

    iget v1, p0, Lcom/daaw/vk1;->a:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "trying to bind a texture that was disposed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/daaw/vk1;->a:I

    return v0
.end method

.method public e()I
    .locals 1

    const/16 v0, 0xde1

    return v0
.end method

.method public f(I)V
    .locals 0

    invoke-virtual {p0, p1, p1}, Lcom/daaw/vk1;->g(II)V

    return-void
.end method

.method public g(II)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/vk1;->c()V

    invoke-virtual {p0}, Lcom/daaw/vk1;->e()I

    move-result v0

    const/16 v1, 0x2801

    invoke-static {v0, v1, p1}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    invoke-virtual {p0}, Lcom/daaw/vk1;->e()I

    move-result p1

    const/16 v0, 0x2800

    invoke-static {p1, v0, p2}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    return-void
.end method

.method public getHeight()I
    .locals 1

    iget v0, p0, Lcom/daaw/vk1;->c:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, Lcom/daaw/vk1;->b:I

    return v0
.end method

.method public h()V
    .locals 2

    const/16 v0, 0xcf5

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glPixelStorei(II)V

    const/16 v0, 0xd05

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glPixelStorei(II)V

    return-void
.end method

.method public i(I)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/vk1;->c()V

    invoke-virtual {p0}, Lcom/daaw/vk1;->e()I

    move-result v0

    const/16 v1, 0x2802

    invoke-static {v0, v1, p1}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    invoke-virtual {p0}, Lcom/daaw/vk1;->e()I

    move-result v0

    const/16 v1, 0x2803

    invoke-static {v0, v1, p1}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    return-void
.end method

.method public j(ILjava/nio/ByteBuffer;)V
    .locals 9

    invoke-virtual {p0}, Lcom/daaw/vk1;->c()V

    invoke-virtual {p0}, Lcom/daaw/vk1;->h()V

    invoke-virtual {p0}, Lcom/daaw/vk1;->e()I

    move-result v0

    iget v3, p0, Lcom/daaw/vk1;->b:I

    iget v4, p0, Lcom/daaw/vk1;->c:I

    const/4 v1, 0x0

    const/16 v2, 0x1908

    const/4 v5, 0x0

    const/16 v7, 0x1401

    move v6, p1

    move-object v8, p2

    invoke-static/range {v0 .. v8}, Landroid/opengl/GLES20;->glTexImage2D(IIIIIIIILjava/nio/Buffer;)V

    return-void
.end method

.method public k()Z
    .locals 1

    iget v0, p0, Lcom/daaw/vk1;->a:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
