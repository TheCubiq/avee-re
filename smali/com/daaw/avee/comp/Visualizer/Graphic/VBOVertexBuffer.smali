.class public Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;
.super Ljava/lang/Object;
.source "VBOVertexBuffer.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Graphic/IBindableDrawable;


# instance fields
.field private final BYTES_PER_FLOAT:I

.field private buffer:Ljava/nio/FloatBuffer;

.field private buffer2:[F

.field private buffer2Pos:I

.field private dbgVar:Lcom/daaw/avee/Common/DbgVar;

.field protected id:I

.field private totalNumComponentsInBytes:I

.field private vertCount:I


# direct methods
.method public constructor <init>(II)V
    .locals 4

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Lcom/daaw/avee/Common/DbgVar;

    invoke-direct {v0}, Lcom/daaw/avee/Common/DbgVar;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->dbgVar:Lcom/daaw/avee/Common/DbgVar;

    const/4 v0, 0x0

    .line 21
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->buffer2Pos:I

    .line 25
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->id:I

    const/4 v1, 0x4

    .line 27
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->BYTES_PER_FLOAT:I

    .line 33
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->totalNumComponentsInBytes:I

    .line 34
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->vertCount:I

    int-to-float p2, p2

    const/high16 v2, 0x40800000    # 4.0f

    div-float/2addr p2, v2

    float-to-double v2, p2

    .line 35
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int p2, v2

    mul-int p1, p1, p2

    .line 41
    new-array p1, p1, [F

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->buffer2:[F

    .line 42
    invoke-static {p1}, Ljava/nio/FloatBuffer;->wrap([F)Ljava/nio/FloatBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->buffer:Ljava/nio/FloatBuffer;

    const/4 p1, 0x1

    new-array p2, p1, [I

    .line 45
    invoke-static {p1, p2, v0}, Landroid/opengl/GLES20;->glGenBuffers(I[II)V

    .line 46
    aget p1, p2, v0

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->id:I

    const p2, 0x8892

    .line 47
    invoke-static {p2, p1}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->checkError()V

    .line 48
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->buffer:Ljava/nio/FloatBuffer;

    invoke-virtual {p1}, Ljava/nio/FloatBuffer;->clear()Ljava/nio/Buffer;

    .line 49
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->buffer:Ljava/nio/FloatBuffer;

    .line 50
    invoke-virtual {p1}, Ljava/nio/FloatBuffer;->capacity()I

    move-result p1

    mul-int/lit8 p1, p1, 0x4

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->buffer:Ljava/nio/FloatBuffer;

    const v2, 0x88e8

    .line 49
    invoke-static {p2, p1, v1, v2}, Landroid/opengl/GLES20;->glBufferData(IILjava/nio/Buffer;I)V

    .line 52
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->checkError()V

    .line 54
    invoke-static {p2, v0}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    return-void
.end method

.method private checkError()V
    .locals 0

    return-void
.end method


# virtual methods
.method public bind()V
    .locals 4

    .line 134
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->buffer:Ljava/nio/FloatBuffer;

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->buffer2Pos:I

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->limit(I)Ljava/nio/Buffer;

    .line 136
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->id:I

    const v1, 0x8892

    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->checkError()V

    .line 137
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->buffer:Ljava/nio/FloatBuffer;

    .line 139
    invoke-virtual {v0}, Ljava/nio/FloatBuffer;->limit()I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->buffer:Ljava/nio/FloatBuffer;

    const/4 v3, 0x0

    .line 137
    invoke-static {v1, v3, v0, v2}, Landroid/opengl/GLES20;->glBufferSubData(IIILjava/nio/Buffer;)V

    .line 140
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->checkError()V

    return-void
.end method

.method public clear()V
    .locals 1

    const/4 v0, 0x0

    .line 97
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->buffer2Pos:I

    return-void
.end method

.method public dispose()V
    .locals 4

    .line 73
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->id:I

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    new-array v2, v1, [I

    const/4 v3, 0x0

    aput v0, v2, v3

    .line 75
    invoke-static {v1, v2, v3}, Landroid/opengl/GLES20;->glDeleteBuffers(I[II)V

    .line 76
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->checkError()V

    .line 77
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->id:I

    :cond_0
    return-void
.end method

.method public draw(III)V
    .locals 0

    .line 162
    invoke-static {p1, p2, p3}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    return-void
.end method

.method protected finalize()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 63
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 64
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->dbgVar:Lcom/daaw/avee/Common/DbgVar;

    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Graphic/-$$Lambda$VBOVertexBuffer$eBqyIuUECoTGRcc25hFRDl9toX0;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/-$$Lambda$VBOVertexBuffer$eBqyIuUECoTGRcc25hFRDl9toX0;-><init>(Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;)V

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/DbgVar;->assertDisposed(Lcom/daaw/avee/Common/Func/Func;)V

    return-void
.end method

.method public flip()V
    .locals 0

    return-void
.end method

.method public getTotalNumComponentsPerVertexInBytes()I
    .locals 1

    .line 83
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->totalNumComponentsInBytes:I

    return v0
.end method

.method public getVertexCount()I
    .locals 1

    .line 120
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->vertCount:I

    return v0
.end method

.method public synthetic lambda$finalize$0$VBOVertexBuffer()Ljava/lang/Boolean;
    .locals 1

    .line 64
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->id:I

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

.method public put(F)V
    .locals 2

    .line 102
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->buffer2:[F

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->buffer2Pos:I

    aput p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    .line 103
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->buffer2Pos:I

    return-void
.end method

.method public put(I)V
    .locals 2

    .line 109
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->buffer2:[F

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->buffer2Pos:I

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    aput p1, v0, v1

    .line 110
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->buffer2Pos:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->buffer2Pos:I

    return-void
.end method

.method public remainingInBytes()I
    .locals 2

    .line 88
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->buffer2:[F

    array-length v0, v0

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->buffer2Pos:I

    sub-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x4

    return v0
.end method

.method public unbind()V
    .locals 2

    const v0, 0x8892

    const/4 v1, 0x0

    .line 168
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    return-void
.end method
