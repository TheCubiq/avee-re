.class public Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;
.super Ljava/lang/Object;
.source "_VBOVertexBuffer.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Graphic/IBindableDrawable;


# instance fields
.field private final BYTES_PER_FLOAT:I

.field private buffer:Ljava/nio/ByteBuffer;

.field private buffer2:[B

.field private buffer2Pos:I

.field protected id:I

.field private totalNumComponents:I

.field private totalNumComponentsInBytes:I

.field private vertCount:I


# direct methods
.method public constructor <init>(II)V
    .locals 3

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 30
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer2Pos:I

    const/4 v1, 0x4

    .line 36
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->BYTES_PER_FLOAT:I

    int-to-float v1, p2

    const/high16 v2, 0x40800000    # 4.0f

    div-float/2addr v1, v2

    float-to-double v1, v1

    .line 42
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->totalNumComponents:I

    .line 43
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->totalNumComponentsInBytes:I

    .line 46
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->vertCount:I

    mul-int p1, p1, p2

    .line 53
    new-array p1, p1, [B

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer2:[B

    .line 54
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer:Ljava/nio/ByteBuffer;

    const/4 p1, 0x1

    new-array p2, p1, [I

    .line 62
    invoke-static {p1, p2, v0}, Landroid/opengl/GLES20;->glGenBuffers(I[II)V

    .line 63
    aget p1, p2, v0

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->id:I

    const p2, 0x8892

    .line 64
    invoke-static {p2, p1}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->checkError()V

    .line 65
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 66
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer:Ljava/nio/ByteBuffer;

    .line 67
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->capacity()I

    move-result p1

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer:Ljava/nio/ByteBuffer;

    const v2, 0x88e8

    .line 66
    invoke-static {p2, p1, v1, v2}, Landroid/opengl/GLES20;->glBufferData(IILjava/nio/Buffer;I)V

    .line 69
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->checkError()V

    .line 71
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

    .line 207
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer:Ljava/nio/ByteBuffer;

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer2Pos:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 209
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->id:I

    const v1, 0x8892

    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->checkError()V

    .line 210
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer:Ljava/nio/ByteBuffer;

    .line 212
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer:Ljava/nio/ByteBuffer;

    const/4 v3, 0x0

    .line 210
    invoke-static {v1, v3, v0, v2}, Landroid/opengl/GLES20;->glBufferSubData(IIILjava/nio/Buffer;)V

    .line 213
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->checkError()V

    return-void
.end method

.method public clear()V
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    const/4 v0, 0x0

    .line 113
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer2Pos:I

    return-void
.end method

.method public dispose()V
    .locals 4

    const/4 v0, 0x1

    new-array v1, v0, [I

    .line 86
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->id:I

    const/4 v3, 0x0

    aput v2, v1, v3

    .line 87
    invoke-static {v0, v1, v3}, Landroid/opengl/GLES20;->glDeleteBuffers(I[II)V

    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->checkError()V

    return-void
.end method

.method public draw(III)V
    .locals 0

    .line 244
    invoke-static {p1, p2, p3}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    return-void
.end method

.method public flip()V
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    return-void
.end method

.method public getTotalNumComponentsPerVertex()I
    .locals 1

    .line 92
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->totalNumComponents:I

    return v0
.end method

.method public getVertexCount()I
    .locals 1

    .line 193
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->vertCount:I

    return v0
.end method

.method public put(F)V
    .locals 3

    .line 125
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    .line 126
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer2:[B

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer2Pos:I

    int-to-byte v2, p1

    aput-byte v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer2Pos:I

    shr-int/lit8 v2, p1, 0x8

    int-to-byte v2, v2

    .line 127
    aput-byte v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer2Pos:I

    shr-int/lit8 v2, p1, 0x10

    int-to-byte v2, v2

    .line 128
    aput-byte v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer2Pos:I

    shr-int/lit8 p1, p1, 0x18

    int-to-byte p1, p1

    .line 129
    aput-byte p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer2Pos:I

    return-void
.end method

.method public put(I)V
    .locals 3

    .line 163
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer2:[B

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer2Pos:I

    invoke-static {p1}, Lcom/daaw/avee/Common/Utils;->int0(I)B

    move-result v2

    aput-byte v2, v0, v1

    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer2Pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer2Pos:I

    .line 164
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer2:[B

    invoke-static {p1}, Lcom/daaw/avee/Common/Utils;->int1(I)B

    move-result v2

    aput-byte v2, v1, v0

    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer2Pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer2Pos:I

    .line 165
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer2:[B

    invoke-static {p1}, Lcom/daaw/avee/Common/Utils;->int2(I)B

    move-result v2

    aput-byte v2, v1, v0

    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer2Pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer2Pos:I

    .line 166
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer2:[B

    invoke-static {p1}, Lcom/daaw/avee/Common/Utils;->int3(I)B

    move-result p1

    aput-byte p1, v1, v0

    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer2Pos:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer2Pos:I

    return-void
.end method

.method public remaining()I
    .locals 2

    .line 100
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer2:[B

    array-length v0, v0

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/_VBOVertexBuffer;->buffer2Pos:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public unbind()V
    .locals 2

    const v0, 0x8892

    const/4 v1, 0x0

    .line 250
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    return-void
.end method
