.class public Lmdesl/graphics/glutils/FrameBuffer;
.super Ljava/lang/Object;
.source "FrameBuffer.java"

# interfaces
.implements Lmdesl/graphics/ITexture;


# instance fields
.field protected id:I

.field protected ownsTexture:Z

.field protected texture:Lmdesl/graphics/Texture;


# direct methods
.method public constructor <init>(II)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/lwjgl/LWJGLException;
        }
    .end annotation

    const/16 v0, 0x2600

    const/16 v1, 0x2901

    .line 125
    invoke-direct {p0, p1, p2, v0, v1}, Lmdesl/graphics/glutils/FrameBuffer;-><init>(IIII)V

    return-void
.end method

.method public constructor <init>(III)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/lwjgl/LWJGLException;
        }
    .end annotation

    const/16 v0, 0x2901

    .line 121
    invoke-direct {p0, p1, p2, p3, v0}, Lmdesl/graphics/glutils/FrameBuffer;-><init>(IIII)V

    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/lwjgl/LWJGLException;
        }
    .end annotation

    .line 117
    new-instance v0, Lmdesl/graphics/Texture;

    invoke-direct {v0, p1, p2, p3, p4}, Lmdesl/graphics/Texture;-><init>(IIII)V

    const/4 p1, 0x1

    invoke-direct {p0, v0, p1}, Lmdesl/graphics/glutils/FrameBuffer;-><init>(Lmdesl/graphics/Texture;Z)V

    return-void
.end method

.method public constructor <init>(Lmdesl/graphics/Texture;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/lwjgl/LWJGLException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 105
    invoke-direct {p0, p1, v0}, Lmdesl/graphics/glutils/FrameBuffer;-><init>(Lmdesl/graphics/Texture;Z)V

    return-void
.end method

.method protected constructor <init>(Lmdesl/graphics/Texture;Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/lwjgl/LWJGLException;
        }
    .end annotation

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput-object p1, p0, Lmdesl/graphics/glutils/FrameBuffer;->texture:Lmdesl/graphics/Texture;

    .line 76
    iput-boolean p2, p0, Lmdesl/graphics/glutils/FrameBuffer;->ownsTexture:Z

    .line 77
    invoke-static {}, Lmdesl/graphics/glutils/FrameBuffer;->isSupported()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 80
    invoke-virtual {p1}, Lmdesl/graphics/Texture;->bind()V

    const/4 p2, 0x1

    new-array v0, p2, [I

    const/4 v1, 0x0

    .line 82
    invoke-static {p2, v0, v1}, Landroid/opengl/GLES20;->glGenFramebuffers(I[II)V

    .line 83
    aget v0, v0, v1

    iput v0, p0, Lmdesl/graphics/glutils/FrameBuffer;->id:I

    const v2, 0x8d40

    .line 84
    invoke-static {v2, v0}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    const v0, 0x8ce0

    .line 86
    invoke-virtual {p1}, Lmdesl/graphics/Texture;->getTarget()I

    move-result v3

    invoke-virtual {p1}, Lmdesl/graphics/Texture;->getID()I

    move-result p1

    .line 85
    invoke-static {v2, v0, v3, p1, v1}, Landroid/opengl/GLES20;->glFramebufferTexture2D(IIIII)V

    .line 87
    invoke-static {v2}, Landroid/opengl/GLES20;->glCheckFramebufferStatus(I)I

    move-result p1

    const v0, 0x8cd5

    if-ne p1, v0, :cond_0

    .line 93
    invoke-static {v2, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    return-void

    .line 89
    :cond_0
    invoke-static {v2, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    new-array v0, p2, [I

    .line 90
    iget v2, p0, Lmdesl/graphics/glutils/FrameBuffer;->id:I

    aput v2, v0, v1

    invoke-static {p2, v0, v1}, Landroid/opengl/GLES20;->glDeleteFramebuffers(I[II)V

    .line 91
    new-instance p2, Lorg/lwjgl/LWJGLException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "exception "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " when checking FBO status"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lorg/lwjgl/LWJGLException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 78
    :cond_1
    new-instance p1, Lorg/lwjgl/LWJGLException;

    const-string p2, "FBO extension not supported in hardware"

    invoke-direct {p1, p2}, Lorg/lwjgl/LWJGLException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static isSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public begin()V
    .locals 3

    .line 148
    iget v0, p0, Lmdesl/graphics/glutils/FrameBuffer;->id:I

    if-eqz v0, :cond_0

    .line 150
    invoke-virtual {p0}, Lmdesl/graphics/glutils/FrameBuffer;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lmdesl/graphics/glutils/FrameBuffer;->getHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v1}, Landroid/opengl/GLES20;->glViewport(IIII)V

    const v0, 0x8d40

    .line 151
    iget v1, p0, Lmdesl/graphics/glutils/FrameBuffer;->id:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    return-void

    .line 149
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "can\'t use FBO as it has been destroyed.."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public dispose()V
    .locals 4

    .line 169
    iget v0, p0, Lmdesl/graphics/glutils/FrameBuffer;->id:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    const v0, 0x8d40

    const/4 v1, 0x0

    .line 171
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    const/4 v0, 0x1

    new-array v2, v0, [I

    .line 172
    iget v3, p0, Lmdesl/graphics/glutils/FrameBuffer;->id:I

    aput v3, v2, v1

    invoke-static {v0, v2, v1}, Landroid/opengl/GLES20;->glDeleteFramebuffers(I[II)V

    .line 173
    iget-boolean v0, p0, Lmdesl/graphics/glutils/FrameBuffer;->ownsTexture:Z

    if-eqz v0, :cond_1

    .line 174
    iget-object v0, p0, Lmdesl/graphics/glutils/FrameBuffer;->texture:Lmdesl/graphics/Texture;

    invoke-virtual {v0}, Lmdesl/graphics/Texture;->dispose()V

    .line 175
    :cond_1
    iput v1, p0, Lmdesl/graphics/glutils/FrameBuffer;->id:I

    return-void
.end method

.method public end()V
    .locals 3

    .line 159
    iget v0, p0, Lmdesl/graphics/glutils/FrameBuffer;->id:I

    if-nez v0, :cond_0

    return-void

    .line 161
    :cond_0
    invoke-virtual {p0}, Lmdesl/graphics/glutils/FrameBuffer;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lmdesl/graphics/glutils/FrameBuffer;->getHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v1}, Landroid/opengl/GLES20;->glViewport(IIII)V

    const v0, 0x8d40

    .line 162
    invoke-static {v0, v2}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    return-void
.end method

.method public getHeight()I
    .locals 1

    .line 137
    iget-object v0, p0, Lmdesl/graphics/glutils/FrameBuffer;->texture:Lmdesl/graphics/Texture;

    invoke-virtual {v0}, Lmdesl/graphics/Texture;->getHeight()I

    move-result v0

    return v0
.end method

.method public getID()I
    .locals 1

    .line 129
    iget v0, p0, Lmdesl/graphics/glutils/FrameBuffer;->id:I

    return v0
.end method

.method public getTexture()Lmdesl/graphics/Texture;
    .locals 1

    .line 141
    iget-object v0, p0, Lmdesl/graphics/glutils/FrameBuffer;->texture:Lmdesl/graphics/Texture;

    return-object v0
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

    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public getV2()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getWidth()I
    .locals 1

    .line 133
    iget-object v0, p0, Lmdesl/graphics/glutils/FrameBuffer;->texture:Lmdesl/graphics/Texture;

    invoke-virtual {v0}, Lmdesl/graphics/Texture;->getWidth()I

    move-result v0

    return v0
.end method
