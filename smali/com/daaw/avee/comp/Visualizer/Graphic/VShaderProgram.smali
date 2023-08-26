.class public Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;
.super Lmdesl/graphics/glutils/ShaderProgram;
.source "VShaderProgram.java"


# instance fields
.field private dbgVar:Lcom/daaw/avee/Common/DbgVar;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/lwjgl/LWJGLException;
        }
    .end annotation

    .line 20
    invoke-direct {p0, p1, p2}, Lmdesl/graphics/glutils/ShaderProgram;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    new-instance p1, Lcom/daaw/avee/Common/DbgVar;

    invoke-direct {p1}, Lcom/daaw/avee/Common/DbgVar;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->dbgVar:Lcom/daaw/avee/Common/DbgVar;

    return-void
.end method


# virtual methods
.method protected finalize()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 41
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 42
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->dbgVar:Lcom/daaw/avee/Common/DbgVar;

    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Graphic/-$$Lambda$VShaderProgram$HFi9CB3qwQ5KvGvlgxPXDuw6--s;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/-$$Lambda$VShaderProgram$HFi9CB3qwQ5KvGvlgxPXDuw6--s;-><init>(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)V

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/DbgVar;->assertDisposed(Lcom/daaw/avee/Common/Func/Func;)V

    return-void
.end method

.method public synthetic lambda$finalize$0$VShaderProgram()Ljava/lang/Boolean;
    .locals 1

    .line 42
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->program:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public setUniformMatrix(IZ[F)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 28
    invoke-static {p1, v0, p2, p3, v1}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    return-void
.end method

.method public setUniformMatrix(Ljava/lang/String;Z[F)V
    .locals 0

    .line 24
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->getUniformLocation(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformMatrix(IZ[F)V

    return-void
.end method

.method public setUniformMatrix3(IZ[F)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 36
    invoke-static {p1, v0, p2, p3, v1}, Landroid/opengl/GLES20;->glUniformMatrix3fv(IIZ[FI)V

    return-void
.end method

.method public setUniformMatrix3(Ljava/lang/String;Z[F)V
    .locals 0

    .line 32
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->getUniformLocation(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformMatrix3(IZ[F)V

    return-void
.end method
