.class public abstract Lcom/daaw/cz7;
.super Lcom/daaw/az7;
.source ""


# instance fields
.field public z:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    const-string p1, "mvhd"

    invoke-direct {p0, p1}, Lcom/daaw/az7;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final e()I
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/az7;->r:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/az7;->c()V

    :cond_0
    iget v0, p0, Lcom/daaw/cz7;->z:I

    return v0
.end method

.method public final f(Ljava/nio/ByteBuffer;)J
    .locals 2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-static {v0}, Lcom/daaw/hh2;->c(B)I

    move-result v0

    iput v0, p0, Lcom/daaw/cz7;->z:I

    invoke-static {p1}, Lcom/daaw/hh2;->d(Ljava/nio/ByteBuffer;)I

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    const-wide/16 v0, 0x4

    return-wide v0
.end method
