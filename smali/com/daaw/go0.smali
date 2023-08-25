.class public Lcom/daaw/go0;
.super Lcom/daaw/do0;
.source ""


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x10
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/go0$c;,
        Lcom/daaw/go0$b;
    }
.end annotation


# static fields
.field public static final X0:[I


# instance fields
.field public A0:J

.field public B0:J

.field public C0:J

.field public D0:I

.field public E0:I

.field public F0:I

.field public G0:J

.field public H0:I

.field public I0:F

.field public J0:I

.field public K0:I

.field public L0:I

.field public M0:F

.field public N0:I

.field public O0:I

.field public P0:I

.field public Q0:F

.field public R0:Z

.field public S0:I

.field public T0:Lcom/daaw/go0$c;

.field public U0:J

.field public V0:J

.field public W0:I

.field public final m0:Landroid/content/Context;

.field public final n0:Lcom/daaw/ps1;

.field public final o0:Lcom/daaw/rs1$a;

.field public final p0:J

.field public final q0:I

.field public final r0:Z

.field public final s0:[J

.field public final t0:[J

.field public u0:Lcom/daaw/go0$b;

.field public v0:Z

.field public w0:Landroid/view/Surface;

.field public x0:Landroid/view/Surface;

.field public y0:I

.field public z0:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x9

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/daaw/go0;->X0:[I

    return-void

    :array_0
    .array-data 4
        0x780
        0x640
        0x5a0
        0x500
        0x3c0
        0x356
        0x280
        0x21c
        0x1e0
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/eo0;JLcom/daaw/yu;ZLandroid/os/Handler;Lcom/daaw/rs1;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/eo0;",
            "J",
            "Lcom/daaw/yu<",
            "Lcom/daaw/i40;",
            ">;Z",
            "Landroid/os/Handler;",
            "Lcom/daaw/rs1;",
            "I)V"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0, p2, p5, p6}, Lcom/daaw/do0;-><init>(ILcom/daaw/eo0;Lcom/daaw/yu;Z)V

    iput-wide p3, p0, Lcom/daaw/go0;->p0:J

    iput p9, p0, Lcom/daaw/go0;->q0:I

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/go0;->m0:Landroid/content/Context;

    new-instance p2, Lcom/daaw/ps1;

    invoke-direct {p2, p1}, Lcom/daaw/ps1;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/daaw/go0;->n0:Lcom/daaw/ps1;

    new-instance p1, Lcom/daaw/rs1$a;

    invoke-direct {p1, p7, p8}, Lcom/daaw/rs1$a;-><init>(Landroid/os/Handler;Lcom/daaw/rs1;)V

    iput-object p1, p0, Lcom/daaw/go0;->o0:Lcom/daaw/rs1$a;

    invoke-static {}, Lcom/daaw/go0;->D0()Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/go0;->r0:Z

    const/16 p1, 0xa

    new-array p2, p1, [J

    iput-object p2, p0, Lcom/daaw/go0;->s0:[J

    new-array p1, p1, [J

    iput-object p1, p0, Lcom/daaw/go0;->t0:[J

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/daaw/go0;->V0:J

    iput-wide p1, p0, Lcom/daaw/go0;->U0:J

    iput-wide p1, p0, Lcom/daaw/go0;->B0:J

    const/4 p1, -0x1

    iput p1, p0, Lcom/daaw/go0;->J0:I

    iput p1, p0, Lcom/daaw/go0;->K0:I

    const/high16 p1, -0x40800000    # -1.0f

    iput p1, p0, Lcom/daaw/go0;->M0:F

    iput p1, p0, Lcom/daaw/go0;->I0:F

    const/4 p1, 0x1

    iput p1, p0, Lcom/daaw/go0;->y0:I

    invoke-virtual {p0}, Lcom/daaw/go0;->A0()V

    return-void
.end method

.method public static B0(Ljava/lang/String;)Z
    .locals 3

    sget-object v0, Lcom/daaw/sq1;->b:Ljava/lang/String;

    const-string v1, "deb"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "flo"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "mido"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "santoni"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const-string v1, "OMX.qcom.video.decoder.avc"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    :cond_1
    const-string v1, "tcl_eu"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "SVP-DTV15"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "BRAVIA_ATV2"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "panell_"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "F3311"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "M5c"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "QM16XE_U"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "A7010a48"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Lcom/daaw/sq1;->d:Ljava/lang/String;

    const-string v2, "woods_f"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "watson"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const-string v0, "OMX.MTK.VIDEO.DECODER.AVC"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    :cond_3
    sget-object v0, Lcom/daaw/sq1;->d:Ljava/lang/String;

    const-string v1, "ALE-L21"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "CAM-L21"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    :cond_4
    const-string v1, "OMX.k3.video.decoder.avc"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    :cond_5
    const-string v1, "HUAWEI VNS-L21"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "OMX.IMG.MSVDX.Decoder.AVC"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_6

    goto :goto_0

    :cond_6
    const/4 p0, 0x0

    goto :goto_1

    :cond_7
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static C0(Landroid/media/MediaFormat;I)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    const-string v0, "tunneled-playback"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Landroid/media/MediaFormat;->setFeatureEnabled(Ljava/lang/String;Z)V

    const-string v0, "audio-session-id"

    invoke-virtual {p0, v0, p1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    return-void
.end method

.method public static D0()Z
    .locals 2

    sget v0, Lcom/daaw/sq1;->a:I

    const/16 v1, 0x16

    if-gt v0, v1, :cond_0

    sget-object v0, Lcom/daaw/sq1;->b:Ljava/lang/String;

    const-string v1, "foster"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/daaw/sq1;->c:Ljava/lang/String;

    const-string v1, "NVIDIA"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static F0(Lcom/daaw/co0;Lcom/google/android/exoplayer2/Format;)Landroid/graphics/Point;
    .locals 13

    iget v0, p1, Lcom/google/android/exoplayer2/Format;->z:I

    iget v1, p1, Lcom/google/android/exoplayer2/Format;->y:I

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_1

    move v4, v0

    goto :goto_1

    :cond_1
    move v4, v1

    :goto_1
    if-eqz v3, :cond_2

    move v0, v1

    :cond_2
    int-to-float v1, v0

    int-to-float v5, v4

    div-float/2addr v1, v5

    sget-object v5, Lcom/daaw/go0;->X0:[I

    array-length v6, v5

    :goto_2
    const/4 v7, 0x0

    if-ge v2, v6, :cond_a

    aget v8, v5, v2

    int-to-float v9, v8

    mul-float v9, v9, v1

    float-to-int v9, v9

    if-le v8, v4, :cond_a

    if-gt v9, v0, :cond_3

    goto :goto_7

    :cond_3
    sget v7, Lcom/daaw/sq1;->a:I

    const/16 v10, 0x15

    if-lt v7, v10, :cond_6

    if-eqz v3, :cond_4

    move v7, v9

    goto :goto_3

    :cond_4
    move v7, v8

    :goto_3
    if-eqz v3, :cond_5

    goto :goto_4

    :cond_5
    move v8, v9

    :goto_4
    invoke-virtual {p0, v7, v8}, Lcom/daaw/co0;->b(II)Landroid/graphics/Point;

    move-result-object v7

    iget v8, p1, Lcom/google/android/exoplayer2/Format;->A:F

    iget v9, v7, Landroid/graphics/Point;->x:I

    iget v10, v7, Landroid/graphics/Point;->y:I

    float-to-double v11, v8

    invoke-virtual {p0, v9, v10, v11, v12}, Lcom/daaw/co0;->n(IID)Z

    move-result v8

    if-eqz v8, :cond_9

    return-object v7

    :cond_6
    const/16 v7, 0x10

    invoke-static {v8, v7}, Lcom/daaw/sq1;->f(II)I

    move-result v8

    mul-int/lit8 v8, v8, 0x10

    invoke-static {v9, v7}, Lcom/daaw/sq1;->f(II)I

    move-result v9

    mul-int/lit8 v9, v9, 0x10

    mul-int v7, v8, v9

    invoke-static {}, Lcom/daaw/fo0;->l()I

    move-result v10

    if-gt v7, v10, :cond_9

    new-instance p0, Landroid/graphics/Point;

    if-eqz v3, :cond_7

    move p1, v9

    goto :goto_5

    :cond_7
    move p1, v8

    :goto_5
    if-eqz v3, :cond_8

    goto :goto_6

    :cond_8
    move v8, v9

    :goto_6
    invoke-direct {p0, p1, v8}, Landroid/graphics/Point;-><init>(II)V

    return-object p0

    :cond_9
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_a
    :goto_7
    return-object v7
.end method

.method public static H0(Lcom/google/android/exoplayer2/Format;)I
    .locals 4

    iget v0, p0, Lcom/google/android/exoplayer2/Format;->v:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/exoplayer2/Format;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v3, p0, Lcom/google/android/exoplayer2/Format;->w:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    array-length v3, v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget p0, p0, Lcom/google/android/exoplayer2/Format;->v:I

    add-int/2addr p0, v2

    return p0

    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    iget v1, p0, Lcom/google/android/exoplayer2/Format;->y:I

    iget p0, p0, Lcom/google/android/exoplayer2/Format;->z:I

    invoke-static {v0, v1, p0}, Lcom/daaw/go0;->I0(Ljava/lang/String;II)I

    move-result p0

    return p0
.end method

.method public static I0(Ljava/lang/String;II)I
    .locals 5

    const/4 v0, -0x1

    if-eq p1, v0, :cond_8

    if-ne p2, v0, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    sparse-switch v1, :sswitch_data_0

    :goto_0
    const/4 p0, -0x1

    goto :goto_1

    :sswitch_0
    const-string v1, "video/x-vnd.on2.vp9"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x5

    goto :goto_1

    :sswitch_1
    const-string v1, "video/x-vnd.on2.vp8"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 p0, 0x4

    goto :goto_1

    :sswitch_2
    const-string v1, "video/avc"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const/4 p0, 0x3

    goto :goto_1

    :sswitch_3
    const-string v1, "video/mp4v-es"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    const/4 p0, 0x2

    goto :goto_1

    :sswitch_4
    const-string v1, "video/hevc"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    const/4 p0, 0x1

    goto :goto_1

    :sswitch_5
    const-string v1, "video/3gpp"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_0

    :cond_6
    const/4 p0, 0x0

    :goto_1
    packed-switch p0, :pswitch_data_0

    return v0

    :pswitch_0
    sget-object p0, Lcom/daaw/sq1;->d:Ljava/lang/String;

    const-string v1, "BRAVIA 4K 2015"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_7

    return v0

    :cond_7
    const/16 p0, 0x10

    invoke-static {p1, p0}, Lcom/daaw/sq1;->f(II)I

    move-result p1

    invoke-static {p2, p0}, Lcom/daaw/sq1;->f(II)I

    move-result p2

    mul-int p1, p1, p2

    mul-int/lit8 p1, p1, 0x10

    mul-int/lit8 p1, p1, 0x10

    goto :goto_2

    :pswitch_1
    mul-int p1, p1, p2

    goto :goto_3

    :pswitch_2
    mul-int p1, p1, p2

    :goto_2
    const/4 v2, 0x2

    :goto_3
    mul-int/lit8 p1, p1, 0x3

    mul-int/lit8 v2, v2, 0x2

    div-int/2addr p1, v2

    return p1

    :cond_8
    :goto_4
    return v0

    :sswitch_data_0
    .sparse-switch
        -0x63306f58 -> :sswitch_5
        -0x63185e82 -> :sswitch_4
        0x46cdc642 -> :sswitch_3
        0x4f62373a -> :sswitch_2
        0x5f50bed8 -> :sswitch_1
        0x5f50bed9 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static K0(J)Z
    .locals 3

    const-wide/16 v0, -0x7530

    cmp-long v2, p0, v0

    if-gez v2, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static L0(J)Z
    .locals 3

    const-wide/32 v0, -0x7a120

    cmp-long v2, p0, v0

    if-gez v2, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static V0(Landroid/media/MediaCodec;Landroid/view/Surface;)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    invoke-virtual {p0, p1}, Landroid/media/MediaCodec;->setOutputSurface(Landroid/view/Surface;)V

    return-void
.end method

.method public static y0(ZLcom/google/android/exoplayer2/Format;Lcom/google/android/exoplayer2/Format;)Z
    .locals 2

    iget-object v0, p1, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    iget-object v1, p2, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p1, Lcom/google/android/exoplayer2/Format;->B:I

    iget v1, p2, Lcom/google/android/exoplayer2/Format;->B:I

    if-ne v0, v1, :cond_1

    if-nez p0, :cond_0

    iget p0, p1, Lcom/google/android/exoplayer2/Format;->y:I

    iget v0, p2, Lcom/google/android/exoplayer2/Format;->y:I

    if-ne p0, v0, :cond_1

    iget p0, p1, Lcom/google/android/exoplayer2/Format;->z:I

    iget v0, p2, Lcom/google/android/exoplayer2/Format;->z:I

    if-ne p0, v0, :cond_1

    :cond_0
    iget-object p0, p1, Lcom/google/android/exoplayer2/Format;->F:Lcom/google/android/exoplayer2/video/ColorInfo;

    iget-object p1, p2, Lcom/google/android/exoplayer2/Format;->F:Lcom/google/android/exoplayer2/video/ColorInfo;

    invoke-static {p0, p1}, Lcom/daaw/sq1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public A()V
    .locals 3

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/go0;->J0:I

    iput v0, p0, Lcom/daaw/go0;->K0:I

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/daaw/go0;->M0:F

    iput v0, p0, Lcom/daaw/go0;->I0:F

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/go0;->V0:J

    iput-wide v0, p0, Lcom/daaw/go0;->U0:J

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/go0;->W0:I

    invoke-virtual {p0}, Lcom/daaw/go0;->A0()V

    invoke-virtual {p0}, Lcom/daaw/go0;->z0()V

    iget-object v1, p0, Lcom/daaw/go0;->n0:Lcom/daaw/ps1;

    invoke-virtual {v1}, Lcom/daaw/ps1;->d()V

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/daaw/go0;->T0:Lcom/daaw/go0$c;

    iput-boolean v0, p0, Lcom/daaw/go0;->R0:Z

    :try_start_0
    invoke-super {p0}, Lcom/daaw/do0;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    invoke-virtual {v0}, Lcom/daaw/fq;->a()V

    iget-object v0, p0, Lcom/daaw/go0;->o0:Lcom/daaw/rs1$a;

    iget-object v1, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    invoke-virtual {v0, v1}, Lcom/daaw/rs1$a;->c(Lcom/daaw/fq;)V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    invoke-virtual {v1}, Lcom/daaw/fq;->a()V

    iget-object v1, p0, Lcom/daaw/go0;->o0:Lcom/daaw/rs1$a;

    iget-object v2, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    invoke-virtual {v1, v2}, Lcom/daaw/rs1$a;->c(Lcom/daaw/fq;)V

    throw v0
.end method

.method public final A0()V
    .locals 2

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/go0;->N0:I

    iput v0, p0, Lcom/daaw/go0;->O0:I

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lcom/daaw/go0;->Q0:F

    iput v0, p0, Lcom/daaw/go0;->P0:I

    return-void
.end method

.method public B(Z)V
    .locals 1

    invoke-super {p0, p1}, Lcom/daaw/do0;->B(Z)V

    invoke-virtual {p0}, Lcom/daaw/xa;->w()Lcom/daaw/c41;

    move-result-object p1

    iget p1, p1, Lcom/daaw/c41;->a:I

    iput p1, p0, Lcom/daaw/go0;->S0:I

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/daaw/go0;->R0:Z

    iget-object p1, p0, Lcom/daaw/go0;->o0:Lcom/daaw/rs1$a;

    iget-object v0, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    invoke-virtual {p1, v0}, Lcom/daaw/rs1$a;->e(Lcom/daaw/fq;)V

    iget-object p1, p0, Lcom/daaw/go0;->n0:Lcom/daaw/ps1;

    invoke-virtual {p1}, Lcom/daaw/ps1;->e()V

    return-void
.end method

.method public C(JZ)V
    .locals 3

    invoke-super {p0, p1, p2, p3}, Lcom/daaw/do0;->C(JZ)V

    invoke-virtual {p0}, Lcom/daaw/go0;->z0()V

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/daaw/go0;->A0:J

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/go0;->E0:I

    iput-wide p1, p0, Lcom/daaw/go0;->U0:J

    iget v1, p0, Lcom/daaw/go0;->W0:I

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/daaw/go0;->s0:[J

    add-int/lit8 v1, v1, -0x1

    aget-wide v1, v2, v1

    iput-wide v1, p0, Lcom/daaw/go0;->V0:J

    iput v0, p0, Lcom/daaw/go0;->W0:I

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {p0}, Lcom/daaw/go0;->U0()V

    goto :goto_0

    :cond_1
    iput-wide p1, p0, Lcom/daaw/go0;->B0:J

    :goto_0
    return-void
.end method

.method public D()V
    .locals 4

    invoke-super {p0}, Lcom/daaw/do0;->D()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/go0;->D0:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/go0;->C0:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v0, v0, v2

    iput-wide v0, p0, Lcom/daaw/go0;->G0:J

    return-void
.end method

.method public E()V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/go0;->B0:J

    invoke-virtual {p0}, Lcom/daaw/go0;->N0()V

    invoke-super {p0}, Lcom/daaw/do0;->E()V

    return-void
.end method

.method public E0(Landroid/media/MediaCodec;IJ)V
    .locals 0

    const-string p3, "dropVideoBuffer"

    invoke-static {p3}, Lcom/daaw/mm1;->a(Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    invoke-static {}, Lcom/daaw/mm1;->c()V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/daaw/go0;->c1(I)V

    return-void
.end method

.method public F([Lcom/google/android/exoplayer2/Format;J)V
    .locals 5

    iget-wide v0, p0, Lcom/daaw/go0;->V0:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iput-wide p2, p0, Lcom/daaw/go0;->V0:J

    goto :goto_1

    :cond_0
    iget v0, p0, Lcom/daaw/go0;->W0:I

    iget-object v1, p0, Lcom/daaw/go0;->s0:[J

    array-length v1, v1

    if-ne v0, v1, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Too many stream changes, so dropping offset: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/go0;->s0:[J

    iget v2, p0, Lcom/daaw/go0;->W0:I

    add-int/lit8 v2, v2, -0x1

    aget-wide v2, v1, v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/go0;->W0:I

    :goto_0
    iget-object v0, p0, Lcom/daaw/go0;->s0:[J

    iget v1, p0, Lcom/daaw/go0;->W0:I

    add-int/lit8 v2, v1, -0x1

    aput-wide p2, v0, v2

    iget-object v0, p0, Lcom/daaw/go0;->t0:[J

    add-int/lit8 v1, v1, -0x1

    iget-wide v2, p0, Lcom/daaw/go0;->U0:J

    aput-wide v2, v0, v1

    :goto_1
    invoke-super {p0, p1, p2, p3}, Lcom/daaw/xa;->F([Lcom/google/android/exoplayer2/Format;J)V

    return-void
.end method

.method public G0(Lcom/daaw/co0;Lcom/google/android/exoplayer2/Format;[Lcom/google/android/exoplayer2/Format;)Lcom/daaw/go0$b;
    .locals 12

    iget v0, p2, Lcom/google/android/exoplayer2/Format;->y:I

    iget v1, p2, Lcom/google/android/exoplayer2/Format;->z:I

    invoke-static {p2}, Lcom/daaw/go0;->H0(Lcom/google/android/exoplayer2/Format;)I

    move-result v2

    array-length v3, p3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    new-instance p1, Lcom/daaw/go0$b;

    invoke-direct {p1, v0, v1, v2}, Lcom/daaw/go0$b;-><init>(III)V

    return-object p1

    :cond_0
    array-length v3, p3

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v6, v3, :cond_4

    aget-object v8, p3, v6

    iget-boolean v9, p1, Lcom/daaw/co0;->d:Z

    invoke-static {v9, p2, v8}, Lcom/daaw/go0;->y0(ZLcom/google/android/exoplayer2/Format;Lcom/google/android/exoplayer2/Format;)Z

    move-result v9

    if-eqz v9, :cond_3

    iget v9, v8, Lcom/google/android/exoplayer2/Format;->y:I

    const/4 v10, -0x1

    if-eq v9, v10, :cond_2

    iget v11, v8, Lcom/google/android/exoplayer2/Format;->z:I

    if-ne v11, v10, :cond_1

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v10, 0x1

    :goto_2
    or-int/2addr v7, v10

    invoke-static {v0, v9}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v9, v8, Lcom/google/android/exoplayer2/Format;->z:I

    invoke-static {v1, v9}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v8}, Lcom/daaw/go0;->H0(Lcom/google/android/exoplayer2/Format;)I

    move-result v8

    invoke-static {v2, v8}, Ljava/lang/Math;->max(II)I

    move-result v2

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_4
    if-eqz v7, :cond_5

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Resolutions unknown. Codec max resolution: "

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "x"

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-static {p1, p2}, Lcom/daaw/go0;->F0(Lcom/daaw/co0;Lcom/google/android/exoplayer2/Format;)Landroid/graphics/Point;

    move-result-object p1

    if-eqz p1, :cond_5

    iget p3, p1, Landroid/graphics/Point;->x:I

    invoke-static {v0, p3}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget p1, p1, Landroid/graphics/Point;->y:I

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget-object p1, p2, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lcom/daaw/go0;->I0(Ljava/lang/String;II)I

    move-result p1

    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    move-result v2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Codec max resolution adjusted to: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_5
    new-instance p1, Lcom/daaw/go0$b;

    invoke-direct {p1, v0, v1, v2}, Lcom/daaw/go0$b;-><init>(III)V

    return-object p1
.end method

.method public J(Landroid/media/MediaCodec;Lcom/daaw/co0;Lcom/google/android/exoplayer2/Format;Lcom/google/android/exoplayer2/Format;)I
    .locals 1

    iget-boolean p1, p2, Lcom/daaw/co0;->d:Z

    invoke-static {p1, p3, p4}, Lcom/daaw/go0;->y0(ZLcom/google/android/exoplayer2/Format;Lcom/google/android/exoplayer2/Format;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget p1, p4, Lcom/google/android/exoplayer2/Format;->y:I

    iget-object p2, p0, Lcom/daaw/go0;->u0:Lcom/daaw/go0$b;

    iget v0, p2, Lcom/daaw/go0$b;->a:I

    if-gt p1, v0, :cond_1

    iget p1, p4, Lcom/google/android/exoplayer2/Format;->z:I

    iget p2, p2, Lcom/daaw/go0$b;->b:I

    if-gt p1, p2, :cond_1

    invoke-static {p4}, Lcom/daaw/go0;->H0(Lcom/google/android/exoplayer2/Format;)I

    move-result p1

    iget-object p2, p0, Lcom/daaw/go0;->u0:Lcom/daaw/go0$b;

    iget p2, p2, Lcom/daaw/go0$b;->c:I

    if-gt p1, p2, :cond_1

    invoke-virtual {p3, p4}, Lcom/google/android/exoplayer2/Format;->L(Lcom/google/android/exoplayer2/Format;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    :goto_0
    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public J0(Lcom/google/android/exoplayer2/Format;Lcom/daaw/go0$b;ZI)Landroid/media/MediaFormat;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    new-instance v0, Landroid/media/MediaFormat;

    invoke-direct {v0}, Landroid/media/MediaFormat;-><init>()V

    iget-object v1, p1, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    const-string v2, "mime"

    invoke-virtual {v0, v2, v1}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    iget v1, p1, Lcom/google/android/exoplayer2/Format;->y:I

    const-string v2, "width"

    invoke-virtual {v0, v2, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget v1, p1, Lcom/google/android/exoplayer2/Format;->z:I

    const-string v2, "height"

    invoke-virtual {v0, v2, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget-object v1, p1, Lcom/google/android/exoplayer2/Format;->w:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/daaw/no0;->e(Landroid/media/MediaFormat;Ljava/util/List;)V

    iget v1, p1, Lcom/google/android/exoplayer2/Format;->A:F

    const-string v2, "frame-rate"

    invoke-static {v0, v2, v1}, Lcom/daaw/no0;->c(Landroid/media/MediaFormat;Ljava/lang/String;F)V

    iget v1, p1, Lcom/google/android/exoplayer2/Format;->B:I

    const-string v2, "rotation-degrees"

    invoke-static {v0, v2, v1}, Lcom/daaw/no0;->d(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    iget-object p1, p1, Lcom/google/android/exoplayer2/Format;->F:Lcom/google/android/exoplayer2/video/ColorInfo;

    invoke-static {v0, p1}, Lcom/daaw/no0;->b(Landroid/media/MediaFormat;Lcom/google/android/exoplayer2/video/ColorInfo;)V

    iget p1, p2, Lcom/daaw/go0$b;->a:I

    const-string v1, "max-width"

    invoke-virtual {v0, v1, p1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget p1, p2, Lcom/daaw/go0$b;->b:I

    const-string v1, "max-height"

    invoke-virtual {v0, v1, p1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget p1, p2, Lcom/daaw/go0$b;->c:I

    const-string p2, "max-input-size"

    invoke-static {v0, p2, p1}, Lcom/daaw/no0;->d(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    sget p1, Lcom/daaw/sq1;->a:I

    const/4 p2, 0x0

    const/16 v1, 0x17

    if-lt p1, v1, :cond_0

    const-string p1, "priority"

    invoke-virtual {v0, p1, p2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_0
    if-eqz p3, :cond_1

    const-string p1, "auto-frc"

    invoke-virtual {v0, p1, p2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_1
    if-eqz p4, :cond_2

    invoke-static {v0, p4}, Lcom/daaw/go0;->C0(Landroid/media/MediaFormat;I)V

    :cond_2
    return-object v0
.end method

.method public M0(Landroid/media/MediaCodec;IJJ)Z
    .locals 0

    invoke-virtual {p0, p5, p6}, Lcom/daaw/xa;->H(J)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object p2, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    iget p3, p2, Lcom/daaw/fq;->i:I

    const/4 p4, 0x1

    add-int/2addr p3, p4

    iput p3, p2, Lcom/daaw/fq;->i:I

    iget p2, p0, Lcom/daaw/go0;->F0:I

    add-int/2addr p2, p1

    invoke-virtual {p0, p2}, Lcom/daaw/go0;->c1(I)V

    invoke-virtual {p0}, Lcom/daaw/go0;->U()V

    return p4
.end method

.method public final N0()V
    .locals 6

    iget v0, p0, Lcom/daaw/go0;->D0:I

    if-lez v0, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/go0;->C0:J

    sub-long v2, v0, v2

    iget-object v4, p0, Lcom/daaw/go0;->o0:Lcom/daaw/rs1$a;

    iget v5, p0, Lcom/daaw/go0;->D0:I

    invoke-virtual {v4, v5, v2, v3}, Lcom/daaw/rs1$a;->d(IJ)V

    const/4 v2, 0x0

    iput v2, p0, Lcom/daaw/go0;->D0:I

    iput-wide v0, p0, Lcom/daaw/go0;->C0:J

    :cond_0
    return-void
.end method

.method public O0()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/go0;->z0:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/go0;->z0:Z

    iget-object v0, p0, Lcom/daaw/go0;->o0:Lcom/daaw/rs1$a;

    iget-object v1, p0, Lcom/daaw/go0;->w0:Landroid/view/Surface;

    invoke-virtual {v0, v1}, Lcom/daaw/rs1$a;->g(Landroid/view/Surface;)V

    :cond_0
    return-void
.end method

.method public final P0()V
    .locals 5

    iget v0, p0, Lcom/daaw/go0;->J0:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v2, p0, Lcom/daaw/go0;->K0:I

    if-eq v2, v1, :cond_2

    :cond_0
    iget v1, p0, Lcom/daaw/go0;->N0:I

    if-ne v1, v0, :cond_1

    iget v1, p0, Lcom/daaw/go0;->O0:I

    iget v2, p0, Lcom/daaw/go0;->K0:I

    if-ne v1, v2, :cond_1

    iget v1, p0, Lcom/daaw/go0;->P0:I

    iget v2, p0, Lcom/daaw/go0;->L0:I

    if-ne v1, v2, :cond_1

    iget v1, p0, Lcom/daaw/go0;->Q0:F

    iget v2, p0, Lcom/daaw/go0;->M0:F

    cmpl-float v1, v1, v2

    if-eqz v1, :cond_2

    :cond_1
    iget-object v1, p0, Lcom/daaw/go0;->o0:Lcom/daaw/rs1$a;

    iget v2, p0, Lcom/daaw/go0;->K0:I

    iget v3, p0, Lcom/daaw/go0;->L0:I

    iget v4, p0, Lcom/daaw/go0;->M0:F

    invoke-virtual {v1, v0, v2, v3, v4}, Lcom/daaw/rs1$a;->h(IIIF)V

    iget v0, p0, Lcom/daaw/go0;->J0:I

    iput v0, p0, Lcom/daaw/go0;->N0:I

    iget v0, p0, Lcom/daaw/go0;->K0:I

    iput v0, p0, Lcom/daaw/go0;->O0:I

    iget v0, p0, Lcom/daaw/go0;->L0:I

    iput v0, p0, Lcom/daaw/go0;->P0:I

    iget v0, p0, Lcom/daaw/go0;->M0:F

    iput v0, p0, Lcom/daaw/go0;->Q0:F

    :cond_2
    return-void
.end method

.method public final Q0()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/go0;->z0:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/go0;->o0:Lcom/daaw/rs1$a;

    iget-object v1, p0, Lcom/daaw/go0;->w0:Landroid/view/Surface;

    invoke-virtual {v0, v1}, Lcom/daaw/rs1$a;->g(Landroid/view/Surface;)V

    :cond_0
    return-void
.end method

.method public R(Lcom/daaw/co0;Landroid/media/MediaCodec;Lcom/google/android/exoplayer2/Format;Landroid/media/MediaCrypto;)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/xa;->y()[Lcom/google/android/exoplayer2/Format;

    move-result-object v0

    invoke-virtual {p0, p1, p3, v0}, Lcom/daaw/go0;->G0(Lcom/daaw/co0;Lcom/google/android/exoplayer2/Format;[Lcom/google/android/exoplayer2/Format;)Lcom/daaw/go0$b;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/go0;->u0:Lcom/daaw/go0$b;

    iget-boolean v1, p0, Lcom/daaw/go0;->r0:Z

    iget v2, p0, Lcom/daaw/go0;->S0:I

    invoke-virtual {p0, p3, v0, v1, v2}, Lcom/daaw/go0;->J0(Lcom/google/android/exoplayer2/Format;Lcom/daaw/go0$b;ZI)Landroid/media/MediaFormat;

    move-result-object p3

    iget-object v0, p0, Lcom/daaw/go0;->w0:Landroid/view/Surface;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/daaw/go0;->a1(Lcom/daaw/co0;)Z

    move-result v0

    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iget-object v0, p0, Lcom/daaw/go0;->x0:Landroid/view/Surface;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/go0;->m0:Landroid/content/Context;

    iget-boolean p1, p1, Lcom/daaw/co0;->f:Z

    invoke-static {v0, p1}, Lcom/google/android/exoplayer2/video/DummySurface;->g(Landroid/content/Context;Z)Lcom/google/android/exoplayer2/video/DummySurface;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/go0;->x0:Landroid/view/Surface;

    :cond_0
    iget-object p1, p0, Lcom/daaw/go0;->x0:Landroid/view/Surface;

    iput-object p1, p0, Lcom/daaw/go0;->w0:Landroid/view/Surface;

    :cond_1
    iget-object p1, p0, Lcom/daaw/go0;->w0:Landroid/view/Surface;

    const/4 v0, 0x0

    invoke-virtual {p2, p3, p1, p4, v0}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    sget p1, Lcom/daaw/sq1;->a:I

    const/16 p3, 0x17

    if-lt p1, p3, :cond_2

    iget-boolean p1, p0, Lcom/daaw/go0;->R0:Z

    if-eqz p1, :cond_2

    new-instance p1, Lcom/daaw/go0$c;

    const/4 p3, 0x0

    invoke-direct {p1, p0, p2, p3}, Lcom/daaw/go0$c;-><init>(Lcom/daaw/go0;Landroid/media/MediaCodec;Lcom/daaw/go0$a;)V

    iput-object p1, p0, Lcom/daaw/go0;->T0:Lcom/daaw/go0$c;

    :cond_2
    return-void
.end method

.method public final R0()V
    .locals 5

    iget v0, p0, Lcom/daaw/go0;->N0:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v2, p0, Lcom/daaw/go0;->O0:I

    if-eq v2, v1, :cond_1

    :cond_0
    iget-object v1, p0, Lcom/daaw/go0;->o0:Lcom/daaw/rs1$a;

    iget v2, p0, Lcom/daaw/go0;->O0:I

    iget v3, p0, Lcom/daaw/go0;->P0:I

    iget v4, p0, Lcom/daaw/go0;->Q0:F

    invoke-virtual {v1, v0, v2, v3, v4}, Lcom/daaw/rs1$a;->h(IIIF)V

    :cond_1
    return-void
.end method

.method public S0(Landroid/media/MediaCodec;IJ)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/go0;->P0()V

    const-string p3, "releaseOutputBuffer"

    invoke-static {p3}, Lcom/daaw/mm1;->a(Ljava/lang/String;)V

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    invoke-static {}, Lcom/daaw/mm1;->c()V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    const-wide/16 v0, 0x3e8

    mul-long p1, p1, v0

    iput-wide p1, p0, Lcom/daaw/go0;->G0:J

    iget-object p1, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    iget p2, p1, Lcom/daaw/fq;->e:I

    add-int/2addr p2, p3

    iput p2, p1, Lcom/daaw/fq;->e:I

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/go0;->E0:I

    invoke-virtual {p0}, Lcom/daaw/go0;->O0()V

    return-void
.end method

.method public T0(Landroid/media/MediaCodec;IJJ)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/go0;->P0()V

    const-string p3, "releaseOutputBuffer"

    invoke-static {p3}, Lcom/daaw/mm1;->a(Ljava/lang/String;)V

    invoke-virtual {p1, p2, p5, p6}, Landroid/media/MediaCodec;->releaseOutputBuffer(IJ)V

    invoke-static {}, Lcom/daaw/mm1;->c()V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    const-wide/16 p3, 0x3e8

    mul-long p1, p1, p3

    iput-wide p1, p0, Lcom/daaw/go0;->G0:J

    iget-object p1, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    iget p2, p1, Lcom/daaw/fq;->e:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p1, Lcom/daaw/fq;->e:I

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/go0;->E0:I

    invoke-virtual {p0}, Lcom/daaw/go0;->O0()V

    return-void
.end method

.method public U()V
    .locals 1

    invoke-super {p0}, Lcom/daaw/do0;->U()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/go0;->F0:I

    return-void
.end method

.method public final U0()V
    .locals 5

    iget-wide v0, p0, Lcom/daaw/go0;->p0:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/go0;->p0:J

    add-long/2addr v0, v2

    goto :goto_0

    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    iput-wide v0, p0, Lcom/daaw/go0;->B0:J

    return-void
.end method

.method public final W0(Landroid/view/Surface;)V
    .locals 5

    if-nez p1, :cond_1

    iget-object v0, p0, Lcom/daaw/go0;->x0:Landroid/view/Surface;

    if-eqz v0, :cond_0

    move-object p1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/do0;->X()Lcom/daaw/co0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lcom/daaw/go0;->a1(Lcom/daaw/co0;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object p1, p0, Lcom/daaw/go0;->m0:Landroid/content/Context;

    iget-boolean v0, v0, Lcom/daaw/co0;->f:Z

    invoke-static {p1, v0}, Lcom/google/android/exoplayer2/video/DummySurface;->g(Landroid/content/Context;Z)Lcom/google/android/exoplayer2/video/DummySurface;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/go0;->x0:Landroid/view/Surface;

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/daaw/go0;->w0:Landroid/view/Surface;

    if-eq v0, p1, :cond_6

    iput-object p1, p0, Lcom/daaw/go0;->w0:Landroid/view/Surface;

    invoke-virtual {p0}, Lcom/daaw/xa;->getState()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq v0, v1, :cond_2

    if-ne v0, v2, :cond_4

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/do0;->V()Landroid/media/MediaCodec;

    move-result-object v1

    sget v3, Lcom/daaw/sq1;->a:I

    const/16 v4, 0x17

    if-lt v3, v4, :cond_3

    if-eqz v1, :cond_3

    if-eqz p1, :cond_3

    iget-boolean v3, p0, Lcom/daaw/go0;->v0:Z

    if-nez v3, :cond_3

    invoke-static {v1, p1}, Lcom/daaw/go0;->V0(Landroid/media/MediaCodec;Landroid/view/Surface;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/daaw/go0;->o0()V

    invoke-virtual {p0}, Lcom/daaw/do0;->e0()V

    :cond_4
    :goto_1
    if-eqz p1, :cond_5

    iget-object v1, p0, Lcom/daaw/go0;->x0:Landroid/view/Surface;

    if-eq p1, v1, :cond_5

    invoke-virtual {p0}, Lcom/daaw/go0;->R0()V

    invoke-virtual {p0}, Lcom/daaw/go0;->z0()V

    if-ne v0, v2, :cond_7

    invoke-virtual {p0}, Lcom/daaw/go0;->U0()V

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Lcom/daaw/go0;->A0()V

    invoke-virtual {p0}, Lcom/daaw/go0;->z0()V

    goto :goto_2

    :cond_6
    if-eqz p1, :cond_7

    iget-object v0, p0, Lcom/daaw/go0;->x0:Landroid/view/Surface;

    if-eq p1, v0, :cond_7

    invoke-virtual {p0}, Lcom/daaw/go0;->R0()V

    invoke-virtual {p0}, Lcom/daaw/go0;->Q0()V

    :cond_7
    :goto_2
    return-void
.end method

.method public X0(JJ)Z
    .locals 0

    invoke-static {p1, p2}, Lcom/daaw/go0;->L0(J)Z

    move-result p1

    return p1
.end method

.method public Y0(JJ)Z
    .locals 0

    invoke-static {p1, p2}, Lcom/daaw/go0;->K0(J)Z

    move-result p1

    return p1
.end method

.method public Z0(JJ)Z
    .locals 1

    invoke-static {p1, p2}, Lcom/daaw/go0;->K0(J)Z

    move-result p1

    if-eqz p1, :cond_0

    const-wide/32 p1, 0x186a0

    cmp-long v0, p3, p1

    if-lez v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final a1(Lcom/daaw/co0;)Z
    .locals 2

    sget v0, Lcom/daaw/sq1;->a:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    iget-boolean v0, p0, Lcom/daaw/go0;->R0:Z

    if-nez v0, :cond_1

    iget-object v0, p1, Lcom/daaw/co0;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/go0;->B0(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean p1, p1, Lcom/daaw/co0;->f:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/go0;->m0:Landroid/content/Context;

    invoke-static {p1}, Lcom/google/android/exoplayer2/video/DummySurface;->c(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b1(Landroid/media/MediaCodec;IJ)V
    .locals 0

    const-string p3, "skipVideoBuffer"

    invoke-static {p3}, Lcom/daaw/mm1;->a(Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    invoke-static {}, Lcom/daaw/mm1;->c()V

    iget-object p1, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    iget p2, p1, Lcom/daaw/fq;->f:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p1, Lcom/daaw/fq;->f:I

    return-void
.end method

.method public c1(I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    iget v1, v0, Lcom/daaw/fq;->g:I

    add-int/2addr v1, p1

    iput v1, v0, Lcom/daaw/fq;->g:I

    iget v1, p0, Lcom/daaw/go0;->D0:I

    add-int/2addr v1, p1

    iput v1, p0, Lcom/daaw/go0;->D0:I

    iget v1, p0, Lcom/daaw/go0;->E0:I

    add-int/2addr v1, p1

    iput v1, p0, Lcom/daaw/go0;->E0:I

    iget p1, v0, Lcom/daaw/fq;->h:I

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, v0, Lcom/daaw/fq;->h:I

    iget p1, p0, Lcom/daaw/go0;->D0:I

    iget v0, p0, Lcom/daaw/go0;->q0:I

    if-lt p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/go0;->N0()V

    :cond_0
    return-void
.end method

.method public d()Z
    .locals 9

    invoke-super {p0}, Lcom/daaw/do0;->d()Z

    move-result v0

    const/4 v1, 0x1

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/daaw/go0;->z0:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/go0;->x0:Landroid/view/Surface;

    if-eqz v0, :cond_0

    iget-object v4, p0, Lcom/daaw/go0;->w0:Landroid/view/Surface;

    if-eq v4, v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/do0;->V()Landroid/media/MediaCodec;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/daaw/go0;->R0:Z

    if-eqz v0, :cond_2

    :cond_1
    iput-wide v2, p0, Lcom/daaw/go0;->B0:J

    return v1

    :cond_2
    iget-wide v4, p0, Lcom/daaw/go0;->B0:J

    const/4 v0, 0x0

    cmp-long v6, v4, v2

    if-nez v6, :cond_3

    return v0

    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/daaw/go0;->B0:J

    cmp-long v8, v4, v6

    if-gez v8, :cond_4

    return v1

    :cond_4
    iput-wide v2, p0, Lcom/daaw/go0;->B0:J

    return v0
.end method

.method public f0(Ljava/lang/String;JJ)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/go0;->o0:Lcom/daaw/rs1$a;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/rs1$a;->b(Ljava/lang/String;JJ)V

    invoke-static {p1}, Lcom/daaw/go0;->B0(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/go0;->v0:Z

    return-void
.end method

.method public g0(Lcom/google/android/exoplayer2/Format;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/daaw/do0;->g0(Lcom/google/android/exoplayer2/Format;)V

    iget-object v0, p0, Lcom/daaw/go0;->o0:Lcom/daaw/rs1$a;

    invoke-virtual {v0, p1}, Lcom/daaw/rs1$a;->f(Lcom/google/android/exoplayer2/Format;)V

    iget v0, p1, Lcom/google/android/exoplayer2/Format;->C:F

    iput v0, p0, Lcom/daaw/go0;->I0:F

    iget p1, p1, Lcom/google/android/exoplayer2/Format;->B:I

    iput p1, p0, Lcom/daaw/go0;->H0:I

    return-void
.end method

.method public h0(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V
    .locals 6

    const-string v0, "crop-right"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "crop-top"

    const-string v3, "crop-bottom"

    const-string v4, "crop-left"

    const/4 v5, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {p2, v4}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p2, v2}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v4

    sub-int/2addr v0, v4

    add-int/2addr v0, v5

    goto :goto_1

    :cond_1
    const-string v0, "width"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    :goto_1
    iput v0, p0, Lcom/daaw/go0;->J0:I

    if-eqz v1, :cond_2

    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p2

    sub-int/2addr v0, p2

    add-int/2addr v0, v5

    goto :goto_2

    :cond_2
    const-string v0, "height"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    :goto_2
    iput v0, p0, Lcom/daaw/go0;->K0:I

    iget p2, p0, Lcom/daaw/go0;->I0:F

    iput p2, p0, Lcom/daaw/go0;->M0:F

    sget v1, Lcom/daaw/sq1;->a:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_4

    iget v1, p0, Lcom/daaw/go0;->H0:I

    const/16 v2, 0x5a

    if-eq v1, v2, :cond_3

    const/16 v2, 0x10e

    if-ne v1, v2, :cond_5

    :cond_3
    iget v1, p0, Lcom/daaw/go0;->J0:I

    iput v0, p0, Lcom/daaw/go0;->J0:I

    iput v1, p0, Lcom/daaw/go0;->K0:I

    const/high16 v0, 0x3f800000    # 1.0f

    div-float/2addr v0, p2

    iput v0, p0, Lcom/daaw/go0;->M0:F

    goto :goto_3

    :cond_4
    iget p2, p0, Lcom/daaw/go0;->H0:I

    iput p2, p0, Lcom/daaw/go0;->L0:I

    :cond_5
    :goto_3
    iget p2, p0, Lcom/daaw/go0;->y0:I

    invoke-virtual {p1, p2}, Landroid/media/MediaCodec;->setVideoScalingMode(I)V

    return-void
.end method

.method public i0(J)V
    .locals 6

    iget v0, p0, Lcom/daaw/go0;->F0:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/go0;->F0:I

    :goto_0
    iget v0, p0, Lcom/daaw/go0;->W0:I

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/daaw/go0;->t0:[J

    const/4 v3, 0x0

    aget-wide v4, v2, v3

    cmp-long v2, p1, v4

    if-ltz v2, :cond_0

    iget-object v2, p0, Lcom/daaw/go0;->s0:[J

    aget-wide v4, v2, v3

    iput-wide v4, p0, Lcom/daaw/go0;->V0:J

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/daaw/go0;->W0:I

    invoke-static {v2, v1, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lcom/daaw/go0;->t0:[J

    iget v2, p0, Lcom/daaw/go0;->W0:I

    invoke-static {v0, v1, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public j0(Lcom/daaw/gq;)V
    .locals 4

    iget v0, p0, Lcom/daaw/go0;->F0:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/go0;->F0:I

    iget-wide v0, p1, Lcom/daaw/gq;->s:J

    iget-wide v2, p0, Lcom/daaw/go0;->U0:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/go0;->U0:J

    sget p1, Lcom/daaw/sq1;->a:I

    const/16 v0, 0x17

    if-ge p1, v0, :cond_0

    iget-boolean p1, p0, Lcom/daaw/go0;->R0:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/go0;->O0()V

    :cond_0
    return-void
.end method

.method public l0(JJLandroid/media/MediaCodec;Ljava/nio/ByteBuffer;IIJZ)Z
    .locals 21

    move-object/from16 v7, p0

    move-wide/from16 v5, p1

    move-wide/from16 v8, p3

    move-object/from16 v10, p5

    move/from16 v11, p7

    move-wide/from16 v0, p9

    iget-wide v2, v7, Lcom/daaw/go0;->A0:J

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v2, v12

    if-nez v4, :cond_0

    iput-wide v5, v7, Lcom/daaw/go0;->A0:J

    :cond_0
    iget-wide v2, v7, Lcom/daaw/go0;->V0:J

    sub-long v12, v0, v2

    const/4 v14, 0x1

    if-eqz p11, :cond_1

    invoke-virtual {v7, v10, v11, v12, v13}, Lcom/daaw/go0;->b1(Landroid/media/MediaCodec;IJ)V

    return v14

    :cond_1
    sub-long v2, v0, v5

    iget-object v4, v7, Lcom/daaw/go0;->w0:Landroid/view/Surface;

    iget-object v15, v7, Lcom/daaw/go0;->x0:Landroid/view/Surface;

    const/16 v16, 0x0

    if-ne v4, v15, :cond_3

    invoke-static {v2, v3}, Lcom/daaw/go0;->K0(J)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v7, v10, v11, v12, v13}, Lcom/daaw/go0;->b1(Landroid/media/MediaCodec;IJ)V

    return v14

    :cond_2
    return v16

    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v17

    const-wide/16 v19, 0x3e8

    mul-long v17, v17, v19

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/xa;->getState()I

    move-result v4

    const/4 v15, 0x2

    if-ne v4, v15, :cond_4

    const/4 v4, 0x1

    goto :goto_0

    :cond_4
    const/4 v4, 0x0

    :goto_0
    iget-boolean v15, v7, Lcom/daaw/go0;->z0:Z

    if-eqz v15, :cond_c

    if-eqz v4, :cond_5

    iget-wide v14, v7, Lcom/daaw/go0;->G0:J

    sub-long v14, v17, v14

    invoke-virtual {v7, v2, v3, v14, v15}, Lcom/daaw/go0;->Z0(JJ)Z

    move-result v14

    if-eqz v14, :cond_5

    goto/16 :goto_4

    :cond_5
    if-eqz v4, :cond_b

    iget-wide v14, v7, Lcom/daaw/go0;->A0:J

    cmp-long v4, v5, v14

    if-nez v4, :cond_6

    goto/16 :goto_3

    :cond_6
    sub-long v17, v17, v8

    sub-long v2, v2, v17

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v14

    mul-long v2, v2, v19

    add-long/2addr v2, v14

    iget-object v4, v7, Lcom/daaw/go0;->n0:Lcom/daaw/ps1;

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/daaw/ps1;->b(JJ)J

    move-result-wide v17

    sub-long v0, v17, v14

    div-long v14, v0, v19

    invoke-virtual {v7, v14, v15, v8, v9}, Lcom/daaw/go0;->X0(JJ)Z

    move-result v0

    if-eqz v0, :cond_7

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    move/from16 v2, p7

    move-wide v3, v12

    move-wide/from16 v5, p1

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/go0;->M0(Landroid/media/MediaCodec;IJJ)Z

    move-result v0

    if-eqz v0, :cond_7

    return v16

    :cond_7
    invoke-virtual {v7, v14, v15, v8, v9}, Lcom/daaw/go0;->Y0(JJ)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {v7, v10, v11, v12, v13}, Lcom/daaw/go0;->E0(Landroid/media/MediaCodec;IJ)V

    :goto_1
    const/4 v0, 0x1

    return v0

    :cond_8
    sget v0, Lcom/daaw/sq1;->a:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_9

    const-wide/32 v0, 0xc350

    cmp-long v2, v14, v0

    if-gez v2, :cond_b

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    move/from16 v2, p7

    move-wide v3, v12

    move-wide/from16 v5, v17

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/go0;->T0(Landroid/media/MediaCodec;IJJ)V

    goto :goto_1

    :cond_9
    const-wide/16 v0, 0x7530

    cmp-long v2, v14, v0

    if-gez v2, :cond_b

    const-wide/16 v0, 0x2af8

    cmp-long v2, v14, v0

    if-lez v2, :cond_a

    const-wide/16 v0, 0x2710

    sub-long/2addr v14, v0

    :try_start_0
    div-long v14, v14, v19

    invoke-static {v14, v15}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return v16

    :cond_a
    :goto_2
    invoke-virtual {v7, v10, v11, v12, v13}, Lcom/daaw/go0;->S0(Landroid/media/MediaCodec;IJ)V

    goto :goto_1

    :cond_b
    :goto_3
    return v16

    :cond_c
    :goto_4
    sget v0, Lcom/daaw/sq1;->a:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_d

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    move/from16 v2, p7

    move-wide v3, v12

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/go0;->T0(Landroid/media/MediaCodec;IJJ)V

    goto :goto_5

    :cond_d
    invoke-virtual {v7, v10, v11, v12, v13}, Lcom/daaw/go0;->S0(Landroid/media/MediaCodec;IJ)V

    :goto_5
    const/4 v0, 0x1

    return v0
.end method

.method public o0()V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    invoke-super {p0}, Lcom/daaw/do0;->o0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput v0, p0, Lcom/daaw/go0;->F0:I

    iget-object v0, p0, Lcom/daaw/go0;->x0:Landroid/view/Surface;

    if-eqz v0, :cond_1

    iget-object v2, p0, Lcom/daaw/go0;->w0:Landroid/view/Surface;

    if-ne v2, v0, :cond_0

    iput-object v1, p0, Lcom/daaw/go0;->w0:Landroid/view/Surface;

    :cond_0
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    iput-object v1, p0, Lcom/daaw/go0;->x0:Landroid/view/Surface;

    :cond_1
    return-void

    :catchall_0
    move-exception v2

    iput v0, p0, Lcom/daaw/go0;->F0:I

    iget-object v0, p0, Lcom/daaw/go0;->x0:Landroid/view/Surface;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/daaw/go0;->w0:Landroid/view/Surface;

    iget-object v3, p0, Lcom/daaw/go0;->x0:Landroid/view/Surface;

    if-ne v0, v3, :cond_2

    iput-object v1, p0, Lcom/daaw/go0;->w0:Landroid/view/Surface;

    :cond_2
    invoke-virtual {v3}, Landroid/view/Surface;->release()V

    iput-object v1, p0, Lcom/daaw/go0;->x0:Landroid/view/Surface;

    :cond_3
    throw v2
.end method

.method public r(ILjava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    check-cast p2, Landroid/view/Surface;

    invoke-virtual {p0, p2}, Lcom/daaw/go0;->W0(Landroid/view/Surface;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/daaw/go0;->y0:I

    invoke-virtual {p0}, Lcom/daaw/do0;->V()Landroid/media/MediaCodec;

    move-result-object p1

    if-eqz p1, :cond_2

    iget p2, p0, Lcom/daaw/go0;->y0:I

    invoke-virtual {p1, p2}, Landroid/media/MediaCodec;->setVideoScalingMode(I)V

    goto :goto_0

    :cond_1
    invoke-super {p0, p1, p2}, Lcom/daaw/xa;->r(ILjava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public t0(Lcom/daaw/co0;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/go0;->w0:Landroid/view/Surface;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/daaw/go0;->a1(Lcom/daaw/co0;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public w0(Lcom/daaw/eo0;Lcom/daaw/yu;Lcom/google/android/exoplayer2/Format;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/eo0;",
            "Lcom/daaw/yu<",
            "Lcom/daaw/i40;",
            ">;",
            "Lcom/google/android/exoplayer2/Format;",
            ")I"
        }
    .end annotation

    iget-object v0, p3, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/hq0;->m(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    iget-object v1, p3, Lcom/google/android/exoplayer2/Format;->x:Lcom/google/android/exoplayer2/drm/DrmInitData;

    if-eqz v1, :cond_1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    iget v5, v1, Lcom/google/android/exoplayer2/drm/DrmInitData;->s:I

    if-ge v3, v5, :cond_2

    invoke-virtual {v1, v3}, Lcom/google/android/exoplayer2/drm/DrmInitData;->h(I)Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;

    move-result-object v5

    iget-boolean v5, v5, Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;->t:Z

    or-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :cond_2
    invoke-interface {p1, v0, v4}, Lcom/daaw/eo0;->b(Ljava/lang/String;Z)Lcom/daaw/co0;

    move-result-object v3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-nez v3, :cond_4

    if-eqz v4, :cond_3

    invoke-interface {p1, v0, v2}, Lcom/daaw/eo0;->b(Ljava/lang/String;Z)Lcom/daaw/co0;

    move-result-object p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v5, 0x1

    :goto_1
    return v5

    :cond_4
    invoke-static {p2, v1}, Lcom/daaw/xa;->I(Lcom/daaw/yu;Lcom/google/android/exoplayer2/drm/DrmInitData;)Z

    move-result p1

    if-nez p1, :cond_5

    return v5

    :cond_5
    iget-object p1, p3, Lcom/google/android/exoplayer2/Format;->r:Ljava/lang/String;

    invoke-virtual {v3, p1}, Lcom/daaw/co0;->i(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_9

    iget p2, p3, Lcom/google/android/exoplayer2/Format;->y:I

    if-lez p2, :cond_9

    iget v0, p3, Lcom/google/android/exoplayer2/Format;->z:I

    if-lez v0, :cond_9

    sget p1, Lcom/daaw/sq1;->a:I

    const/16 v1, 0x15

    if-lt p1, v1, :cond_6

    iget p1, p3, Lcom/google/android/exoplayer2/Format;->A:F

    float-to-double v4, p1

    invoke-virtual {v3, p2, v0, v4, v5}, Lcom/daaw/co0;->n(IID)Z

    move-result p1

    goto :goto_3

    :cond_6
    mul-int p2, p2, v0

    invoke-static {}, Lcom/daaw/fo0;->l()I

    move-result p1

    if-gt p2, p1, :cond_7

    goto :goto_2

    :cond_7
    const/4 v6, 0x0

    :goto_2
    if-nez v6, :cond_8

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "FalseCheck [legacyFrameSize, "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p3, Lcom/google/android/exoplayer2/Format;->y:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "x"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p3, Lcom/google/android/exoplayer2/Format;->z:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "] ["

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p2, Lcom/daaw/sq1;->e:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "]"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    move p1, v6

    :cond_9
    :goto_3
    iget-boolean p2, v3, Lcom/daaw/co0;->d:Z

    if-eqz p2, :cond_a

    const/16 p2, 0x10

    goto :goto_4

    :cond_a
    const/16 p2, 0x8

    :goto_4
    iget-boolean p3, v3, Lcom/daaw/co0;->e:Z

    if-eqz p3, :cond_b

    const/16 v2, 0x20

    :cond_b
    if-eqz p1, :cond_c

    const/4 p1, 0x4

    goto :goto_5

    :cond_c
    const/4 p1, 0x3

    :goto_5
    or-int/2addr p2, v2

    or-int/2addr p1, p2

    return p1
.end method

.method public final z0()V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/go0;->z0:Z

    sget v0, Lcom/daaw/sq1;->a:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/daaw/go0;->R0:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/do0;->V()Landroid/media/MediaCodec;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/daaw/go0$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v0, v2}, Lcom/daaw/go0$c;-><init>(Lcom/daaw/go0;Landroid/media/MediaCodec;Lcom/daaw/go0$a;)V

    iput-object v1, p0, Lcom/daaw/go0;->T0:Lcom/daaw/go0$c;

    :cond_0
    return-void
.end method
