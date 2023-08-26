.class public Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;
.super Lmdesl/graphics/glutils/FrameBuffer;
.source "VFrameBuffer.java"


# instance fields
.field private dbgVar:Lcom/daaw/avee/Common/DbgVar;


# direct methods
.method private constructor <init>(Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/lwjgl/LWJGLException;
        }
    .end annotation

    .line 33
    invoke-direct {p0, p1, p2}, Lmdesl/graphics/glutils/FrameBuffer;-><init>(Lmdesl/graphics/Texture;Z)V

    .line 18
    new-instance p1, Lcom/daaw/avee/Common/DbgVar;

    invoke-direct {p1}, Lcom/daaw/avee/Common/DbgVar;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->dbgVar:Lcom/daaw/avee/Common/DbgVar;

    return-void
.end method

.method public static createSafe(IIIIZ)Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;
    .locals 7

    .line 21
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;

    move-object v0, v6

    move v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;-><init>(IIIIZ)V

    invoke-virtual {v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->checkIfValid()Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;

    move-result-object p0

    const/4 p1, 0x0

    if-nez p0, :cond_0

    return-object p1

    .line 25
    :cond_0
    :try_start_0
    new-instance p2, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;-><init>(Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p0

    .line 27
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "exception "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public begin()V
    .locals 3

    .line 57
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->isValid()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 59
    :cond_0
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v1}, Landroid/opengl/GLES20;->glViewport(IIII)V

    const v0, 0x8d40

    .line 60
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->id:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    return-void
.end method

.method public checkIfValid()Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;
    .locals 1

    .line 47
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->isValid()Z

    move-result v0

    if-nez v0, :cond_0

    .line 48
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->dispose()V

    const-string v0, "FrameBuffer is not valid"

    .line 49
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    return-object p0
.end method

.method public end()V
    .locals 2

    .line 64
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->isValid()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const v0, 0x8d40

    const/4 v1, 0x0

    .line 66
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    return-void
.end method

.method protected finalize()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 38
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 39
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->dbgVar:Lcom/daaw/avee/Common/DbgVar;

    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Graphic/-$$Lambda$VFrameBuffer$6_WHNd5Ftg2ZVa_dVeW1f_u5N8M;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/-$$Lambda$VFrameBuffer$6_WHNd5Ftg2ZVa_dVeW1f_u5N8M;-><init>(Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;)V

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/DbgVar;->assertDisposed(Lcom/daaw/avee/Common/Func/Func;)V

    return-void
.end method

.method public isValid()Z
    .locals 1

    .line 43
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->id:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public synthetic lambda$finalize$0$VFrameBuffer()Ljava/lang/Boolean;
    .locals 1

    .line 39
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->isValid()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
