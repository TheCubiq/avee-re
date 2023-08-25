.class public Lcom/daaw/nr0;
.super Lcom/daaw/bo0;
.source ""


# instance fields
.field public A0:I

.field public B0:I

.field public C0:Ljava/lang/String;

.field public D0:I

.field public E0:Lcom/daaw/ne0;

.field public F0:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public G0:I


# direct methods
.method public varargs constructor <init>(Lcom/daaw/ne0;ILjava/lang/ref/WeakReference;Landroid/content/Context;Lcom/daaw/eo0;Lcom/daaw/yu;ZLandroid/os/Handler;Lcom/daaw/n7;Lcom/daaw/g7;[Lcom/daaw/m7;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/ne0;",
            "I",
            "Ljava/lang/ref/WeakReference<",
            "Ljava/lang/Object;",
            ">;",
            "Landroid/content/Context;",
            "Lcom/daaw/eo0;",
            "Lcom/daaw/yu<",
            "Lcom/daaw/i40;",
            ">;Z",
            "Landroid/os/Handler;",
            "Lcom/daaw/n7;",
            "Lcom/daaw/g7;",
            "[",
            "Lcom/daaw/m7;",
            ")V"
        }
    .end annotation

    move-object v9, p0

    move-object v10, p1

    move v11, p2

    move-object v0, p0

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    move/from16 v4, p7

    move-object/from16 v5, p8

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v8, p11

    invoke-direct/range {v0 .. v8}, Lcom/daaw/bo0;-><init>(Landroid/content/Context;Lcom/daaw/eo0;Lcom/daaw/yu;ZLandroid/os/Handler;Lcom/daaw/n7;Lcom/daaw/g7;[Lcom/daaw/m7;)V

    const v0, 0xac44

    iput v0, v9, Lcom/daaw/nr0;->A0:I

    const/4 v0, 0x2

    iput v0, v9, Lcom/daaw/nr0;->B0:I

    const-string v0, "audio/raw"

    iput-object v0, v9, Lcom/daaw/nr0;->C0:Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, v9, Lcom/daaw/nr0;->G0:I

    move-object v0, p3

    iput-object v0, v9, Lcom/daaw/nr0;->F0:Ljava/lang/ref/WeakReference;

    iput v11, v9, Lcom/daaw/nr0;->D0:I

    iput-object v10, v9, Lcom/daaw/nr0;->E0:Lcom/daaw/ne0;

    invoke-static {p0, p2, p1}, Lcom/daaw/kv1;->a(Ljava/lang/Object;ILcom/daaw/ne0;)V

    return-void
.end method


# virtual methods
.method public A()V
    .locals 2

    iget v0, p0, Lcom/daaw/nr0;->D0:I

    iget-object v1, p0, Lcom/daaw/nr0;->E0:Lcom/daaw/ne0;

    invoke-static {p0, v0, v1}, Lcom/daaw/kv1;->b(Ljava/lang/Object;ILcom/daaw/ne0;)Lcom/daaw/ne0;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/daaw/ne0;->e(Z)V

    :cond_0
    invoke-super {p0}, Lcom/daaw/bo0;->A()V

    return-void
.end method

.method public B(Z)V
    .locals 2

    iget v0, p0, Lcom/daaw/nr0;->D0:I

    iget-object v1, p0, Lcom/daaw/nr0;->E0:Lcom/daaw/ne0;

    invoke-static {p0, v0, v1}, Lcom/daaw/kv1;->b(Ljava/lang/Object;ILcom/daaw/ne0;)Lcom/daaw/ne0;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/daaw/ne0;->e(Z)V

    :cond_0
    invoke-super {p0, p1}, Lcom/daaw/bo0;->B(Z)V

    return-void
.end method

.method public C(JZ)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lcom/daaw/bo0;->C(JZ)V

    return-void
.end method

.method public F0(I)V
    .locals 2

    invoke-super {p0, p1}, Lcom/daaw/bo0;->F0(I)V

    iget v0, p0, Lcom/daaw/nr0;->D0:I

    iget-object v1, p0, Lcom/daaw/nr0;->E0:Lcom/daaw/ne0;

    invoke-static {p0, v0, v1}, Lcom/daaw/kv1;->b(Ljava/lang/Object;ILcom/daaw/ne0;)Lcom/daaw/ne0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/daaw/ne0;->a(I)V

    :cond_0
    return-void
.end method

.method public g0(Lcom/google/android/exoplayer2/Format;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/daaw/bo0;->g0(Lcom/google/android/exoplayer2/Format;)V

    iget v0, p1, Lcom/google/android/exoplayer2/Format;->q:I

    if-gez v0, :cond_0

    const/16 p1, 0x10

    iput p1, p0, Lcom/daaw/nr0;->G0:I

    goto :goto_0

    :cond_0
    iget v1, p1, Lcom/google/android/exoplayer2/Format;->H:I

    div-int/2addr v0, v1

    iget p1, p1, Lcom/google/android/exoplayer2/Format;->G:I

    div-int/2addr v0, p1

    iput v0, p0, Lcom/daaw/nr0;->G0:I

    :goto_0
    return-void
.end method

.method public h0(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V
    .locals 2

    const v0, 0xac44

    iput v0, p0, Lcom/daaw/nr0;->A0:I

    const/4 v0, 0x2

    iput v0, p0, Lcom/daaw/nr0;->B0:I

    const-string v0, "audio/raw"

    iput-object v0, p0, Lcom/daaw/nr0;->C0:Ljava/lang/String;

    const-string v0, "sample-rate"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/daaw/nr0;->A0:I

    :cond_0
    const-string v0, "channel-count"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/daaw/nr0;->B0:I

    :cond_1
    const-string v0, "mime"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/nr0;->C0:Ljava/lang/String;

    :cond_2
    invoke-super {p0, p1, p2}, Lcom/daaw/bo0;->h0(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V

    return-void
.end method

.method public l0(JJLandroid/media/MediaCodec;Ljava/nio/ByteBuffer;IIJZ)Z
    .locals 12

    move-object v0, p0

    move/from16 v11, p7

    iget v1, v0, Lcom/daaw/nr0;->D0:I

    iget-object v2, v0, Lcom/daaw/nr0;->E0:Lcom/daaw/ne0;

    invoke-static {p0, v1, v2}, Lcom/daaw/kv1;->b(Ljava/lang/Object;ILcom/daaw/ne0;)Lcom/daaw/ne0;

    move-result-object v1

    if-nez p11, :cond_1

    and-int/lit8 v2, p8, 0x2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    if-ltz v11, :cond_1

    const/16 v2, 0x2000

    if-ge v11, v2, :cond_1

    if-eqz p6, :cond_1

    const-wide/16 v2, 0x0

    sub-long v4, p9, v2

    iget v6, v0, Lcom/daaw/nr0;->A0:I

    iget v7, v0, Lcom/daaw/nr0;->B0:I

    iget v8, v0, Lcom/daaw/nr0;->G0:I

    sub-long v9, p1, v2

    move-object/from16 v2, p6

    move-wide v3, v4

    move/from16 v5, p7

    invoke-interface/range {v1 .. v10}, Lcom/daaw/ne0;->c(Ljava/nio/ByteBuffer;JIIIIJ)V

    :cond_1
    :goto_0
    invoke-super/range {p0 .. p11}, Lcom/daaw/bo0;->l0(JJLandroid/media/MediaCodec;Ljava/nio/ByteBuffer;IIJZ)Z

    move-result v1

    return v1
.end method
