.class public abstract Lcom/daaw/do0;
.super Lcom/daaw/xa;
.source ""


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x10
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/do0$a;
    }
.end annotation


# static fields
.field public static final l0:[B


# instance fields
.field public final A:Z

.field public final B:Lcom/daaw/gq;

.field public final C:Lcom/daaw/gq;

.field public final D:Lcom/daaw/k30;

.field public final E:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public final F:Landroid/media/MediaCodec$BufferInfo;

.field public G:Lcom/google/android/exoplayer2/Format;

.field public H:Lcom/google/android/exoplayer2/drm/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/exoplayer2/drm/d<",
            "Lcom/daaw/i40;",
            ">;"
        }
    .end annotation
.end field

.field public I:Lcom/google/android/exoplayer2/drm/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/exoplayer2/drm/d<",
            "Lcom/daaw/i40;",
            ">;"
        }
    .end annotation
.end field

.field public J:Landroid/media/MediaCodec;

.field public K:Lcom/daaw/co0;

.field public L:I

.field public M:Z

.field public N:Z

.field public O:Z

.field public P:Z

.field public Q:Z

.field public R:Z

.field public S:Z

.field public T:Z

.field public U:[Ljava/nio/ByteBuffer;

.field public V:[Ljava/nio/ByteBuffer;

.field public W:J

.field public X:I

.field public Y:I

.field public Z:Ljava/nio/ByteBuffer;

.field public a0:Z

.field public b0:Z

.field public c0:I

.field public d0:I

.field public e0:Z

.field public f0:Z

.field public g0:Z

.field public h0:Z

.field public i0:Z

.field public j0:Z

.field public k0:Lcom/daaw/fq;

.field public final y:Lcom/daaw/eo0;

.field public final z:Lcom/daaw/yu;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/yu<",
            "Lcom/daaw/i40;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78"

    invoke-static {v0}, Lcom/daaw/sq1;->r(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lcom/daaw/do0;->l0:[B

    return-void
.end method

.method public constructor <init>(ILcom/daaw/eo0;Lcom/daaw/yu;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/daaw/eo0;",
            "Lcom/daaw/yu<",
            "Lcom/daaw/i40;",
            ">;Z)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/daaw/xa;-><init>(I)V

    sget p1, Lcom/daaw/sq1;->a:I

    const/4 v0, 0x0

    const/16 v1, 0x10

    if-lt p1, v1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lcom/daaw/s6;->f(Z)V

    invoke-static {p2}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/eo0;

    iput-object p1, p0, Lcom/daaw/do0;->y:Lcom/daaw/eo0;

    iput-object p3, p0, Lcom/daaw/do0;->z:Lcom/daaw/yu;

    iput-boolean p4, p0, Lcom/daaw/do0;->A:Z

    new-instance p1, Lcom/daaw/gq;

    invoke-direct {p1, v0}, Lcom/daaw/gq;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/do0;->B:Lcom/daaw/gq;

    invoke-static {}, Lcom/daaw/gq;->r()Lcom/daaw/gq;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/do0;->C:Lcom/daaw/gq;

    new-instance p1, Lcom/daaw/k30;

    invoke-direct {p1}, Lcom/daaw/k30;-><init>()V

    iput-object p1, p0, Lcom/daaw/do0;->D:Lcom/daaw/k30;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/daaw/do0;->E:Ljava/util/List;

    new-instance p1, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {p1}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    iput-object p1, p0, Lcom/daaw/do0;->F:Landroid/media/MediaCodec$BufferInfo;

    iput v0, p0, Lcom/daaw/do0;->c0:I

    iput v0, p0, Lcom/daaw/do0;->d0:I

    return-void
.end method

.method public static L(Ljava/lang/String;Lcom/google/android/exoplayer2/Format;)Z
    .locals 2

    sget v0, Lcom/daaw/sq1;->a:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    iget-object p1, p1, Lcom/google/android/exoplayer2/Format;->w:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "OMX.MTK.VIDEO.DECODER.AVC"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static M(Ljava/lang/String;)Z
    .locals 2

    sget v0, Lcom/daaw/sq1;->a:I

    const/16 v1, 0x17

    if-gt v0, v1, :cond_0

    const-string v1, "OMX.google.vorbis.decoder"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const/16 v1, 0x13

    if-gt v0, v1, :cond_2

    sget-object v0, Lcom/daaw/sq1;->b:Ljava/lang/String;

    const-string v1, "hb2000"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "OMX.amlogic.avc.decoder.awesome"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "OMX.amlogic.avc.decoder.awesome.secure"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static N(Ljava/lang/String;)Z
    .locals 2

    sget v0, Lcom/daaw/sq1;->a:I

    const/16 v1, 0x15

    if-ne v0, v1, :cond_0

    const-string v0, "OMX.google.aac.decoder"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static O(Ljava/lang/String;)Z
    .locals 2

    sget v0, Lcom/daaw/sq1;->a:I

    const/16 v1, 0x11

    if-gt v0, v1, :cond_1

    const-string v0, "OMX.rk.video_decoder.avc"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "OMX.allwinner.video.decoder.avc"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static P(Ljava/lang/String;)Z
    .locals 2

    sget v0, Lcom/daaw/sq1;->a:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_2

    if-ne v0, v1, :cond_0

    const-string v1, "OMX.SEC.avc.dec"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "OMX.SEC.avc.dec.secure"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    const/16 v1, 0x13

    if-ne v0, v1, :cond_1

    sget-object v0, Lcom/daaw/sq1;->d:Ljava/lang/String;

    const-string v1, "SM-G800"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "OMX.Exynos.avc.dec"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "OMX.Exynos.avc.dec.secure"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static Q(Ljava/lang/String;Lcom/google/android/exoplayer2/Format;)Z
    .locals 3

    sget v0, Lcom/daaw/sq1;->a:I

    const/4 v1, 0x1

    const/16 v2, 0x12

    if-gt v0, v2, :cond_0

    iget p1, p1, Lcom/google/android/exoplayer2/Format;->G:I

    if-ne p1, v1, :cond_0

    const-string p1, "OMX.MTK.AUDIO.DECODER.MP3"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public static a0(Lcom/daaw/gq;I)Landroid/media/MediaCodec$CryptoInfo;
    .locals 3

    iget-object p0, p0, Lcom/daaw/gq;->q:Lcom/daaw/jn;

    invoke-virtual {p0}, Lcom/daaw/jn;->a()Landroid/media/MediaCodec$CryptoInfo;

    move-result-object p0

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    if-nez v0, :cond_1

    const/4 v0, 0x1

    new-array v0, v0, [I

    iput-object v0, p0, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    :cond_1
    iget-object v0, p0, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    const/4 v1, 0x0

    aget v2, v0, v1

    add-int/2addr v2, p1

    aput v2, v0, v1

    return-object p0
.end method


# virtual methods
.method public A()V
    .locals 4

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/do0;->G:Lcom/google/android/exoplayer2/Format;

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/do0;->o0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    iget-object v1, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/daaw/do0;->z:Lcom/daaw/yu;

    invoke-interface {v2, v1}, Lcom/daaw/yu;->f(Lcom/google/android/exoplayer2/drm/d;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_0
    :try_start_2
    iget-object v1, p0, Lcom/daaw/do0;->I:Lcom/google/android/exoplayer2/drm/d;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    if-eq v1, v2, :cond_1

    iget-object v2, p0, Lcom/daaw/do0;->z:Lcom/daaw/yu;

    invoke-interface {v2, v1}, Lcom/daaw/yu;->f(Lcom/google/android/exoplayer2/drm/d;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    iput-object v0, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    iput-object v0, p0, Lcom/daaw/do0;->I:Lcom/google/android/exoplayer2/drm/d;

    return-void

    :catchall_0
    move-exception v1

    iput-object v0, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    iput-object v0, p0, Lcom/daaw/do0;->I:Lcom/google/android/exoplayer2/drm/d;

    throw v1

    :catchall_1
    move-exception v1

    :try_start_3
    iget-object v2, p0, Lcom/daaw/do0;->I:Lcom/google/android/exoplayer2/drm/d;

    if-eqz v2, :cond_2

    iget-object v3, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    if-eq v2, v3, :cond_2

    iget-object v3, p0, Lcom/daaw/do0;->z:Lcom/daaw/yu;

    invoke-interface {v3, v2}, Lcom/daaw/yu;->f(Lcom/google/android/exoplayer2/drm/d;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :cond_2
    iput-object v0, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    iput-object v0, p0, Lcom/daaw/do0;->I:Lcom/google/android/exoplayer2/drm/d;

    throw v1

    :catchall_2
    move-exception v1

    iput-object v0, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    iput-object v0, p0, Lcom/daaw/do0;->I:Lcom/google/android/exoplayer2/drm/d;

    throw v1

    :catchall_3
    move-exception v1

    :try_start_4
    iget-object v2, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/daaw/do0;->z:Lcom/daaw/yu;

    iget-object v3, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    invoke-interface {v2, v3}, Lcom/daaw/yu;->f(Lcom/google/android/exoplayer2/drm/d;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    :cond_3
    :try_start_5
    iget-object v2, p0, Lcom/daaw/do0;->I:Lcom/google/android/exoplayer2/drm/d;

    if-eqz v2, :cond_4

    iget-object v3, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    if-eq v2, v3, :cond_4

    iget-object v3, p0, Lcom/daaw/do0;->z:Lcom/daaw/yu;

    invoke-interface {v3, v2}, Lcom/daaw/yu;->f(Lcom/google/android/exoplayer2/drm/d;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :cond_4
    iput-object v0, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    iput-object v0, p0, Lcom/daaw/do0;->I:Lcom/google/android/exoplayer2/drm/d;

    throw v1

    :catchall_4
    move-exception v1

    iput-object v0, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    iput-object v0, p0, Lcom/daaw/do0;->I:Lcom/google/android/exoplayer2/drm/d;

    throw v1

    :catchall_5
    move-exception v1

    :try_start_6
    iget-object v2, p0, Lcom/daaw/do0;->I:Lcom/google/android/exoplayer2/drm/d;

    if-eqz v2, :cond_5

    iget-object v3, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    if-eq v2, v3, :cond_5

    iget-object v3, p0, Lcom/daaw/do0;->z:Lcom/daaw/yu;

    invoke-interface {v3, v2}, Lcom/daaw/yu;->f(Lcom/google/android/exoplayer2/drm/d;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    :cond_5
    iput-object v0, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    iput-object v0, p0, Lcom/daaw/do0;->I:Lcom/google/android/exoplayer2/drm/d;

    throw v1

    :catchall_6
    move-exception v1

    iput-object v0, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    iput-object v0, p0, Lcom/daaw/do0;->I:Lcom/google/android/exoplayer2/drm/d;

    throw v1
.end method

.method public B(Z)V
    .locals 0

    new-instance p1, Lcom/daaw/fq;

    invoke-direct {p1}, Lcom/daaw/fq;-><init>()V

    iput-object p1, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    return-void
.end method

.method public C(JZ)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/do0;->g0:Z

    iput-boolean p1, p0, Lcom/daaw/do0;->h0:Z

    iget-object p1, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/do0;->U()V

    :cond_0
    return-void
.end method

.method public D()V
    .locals 0

    return-void
.end method

.method public E()V
    .locals 0

    return-void
.end method

.method public abstract J(Landroid/media/MediaCodec;Lcom/daaw/co0;Lcom/google/android/exoplayer2/Format;Lcom/google/android/exoplayer2/Format;)I
.end method

.method public final K(Ljava/lang/String;)I
    .locals 3

    sget v0, Lcom/daaw/sq1;->a:I

    const/16 v1, 0x19

    if-gt v0, v1, :cond_1

    const-string v1, "OMX.Exynos.avc.dec.secure"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lcom/daaw/sq1;->d:Ljava/lang/String;

    const-string v2, "SM-T585"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "SM-A510"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "SM-A520"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "SM-J700"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/4 p1, 0x2

    return p1

    :cond_1
    const/16 v1, 0x18

    if-ge v0, v1, :cond_4

    const-string v0, "OMX.Nvidia.h264.decode"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "OMX.Nvidia.h264.decode.secure"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_2
    sget-object p1, Lcom/daaw/sq1;->b:Ljava/lang/String;

    const-string v0, "flounder"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "flounder_lte"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "grouper"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "tilapia"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method public abstract R(Lcom/daaw/co0;Landroid/media/MediaCodec;Lcom/google/android/exoplayer2/Format;Landroid/media/MediaCrypto;)V
.end method

.method public final S(JJ)Z
    .locals 15

    move-object v12, p0

    invoke-virtual {p0}, Lcom/daaw/do0;->d0()Z

    move-result v0

    const/4 v13, 0x1

    const/4 v14, 0x0

    if-nez v0, :cond_a

    iget-boolean v0, v12, Lcom/daaw/do0;->Q:Z

    if-eqz v0, :cond_1

    iget-boolean v0, v12, Lcom/daaw/do0;->f0:Z

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, v12, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    iget-object v1, v12, Lcom/daaw/do0;->F:Landroid/media/MediaCodec$BufferInfo;

    invoke-virtual {p0}, Lcom/daaw/do0;->Z()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    invoke-virtual {p0}, Lcom/daaw/do0;->k0()V

    iget-boolean v0, v12, Lcom/daaw/do0;->h0:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/do0;->o0()V

    :cond_0
    return v14

    :cond_1
    iget-object v0, v12, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    iget-object v1, v12, Lcom/daaw/do0;->F:Landroid/media/MediaCodec$BufferInfo;

    invoke-virtual {p0}, Lcom/daaw/do0;->Z()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    move-result v0

    :goto_0
    if-ltz v0, :cond_5

    iget-boolean v1, v12, Lcom/daaw/do0;->T:Z

    if-eqz v1, :cond_2

    iput-boolean v14, v12, Lcom/daaw/do0;->T:Z

    iget-object v1, v12, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    invoke-virtual {v1, v0, v14}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    return v13

    :cond_2
    iget-object v1, v12, Lcom/daaw/do0;->F:Landroid/media/MediaCodec$BufferInfo;

    iget v2, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-nez v2, :cond_3

    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lcom/daaw/do0;->k0()V

    return v14

    :cond_3
    iput v0, v12, Lcom/daaw/do0;->Y:I

    invoke-virtual {p0, v0}, Lcom/daaw/do0;->c0(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, v12, Lcom/daaw/do0;->Z:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_4

    iget-object v1, v12, Lcom/daaw/do0;->F:Landroid/media/MediaCodec$BufferInfo;

    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v0, v12, Lcom/daaw/do0;->Z:Ljava/nio/ByteBuffer;

    iget-object v1, v12, Lcom/daaw/do0;->F:Landroid/media/MediaCodec$BufferInfo;

    iget v2, v1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    add-int/2addr v2, v1

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    :cond_4
    iget-object v0, v12, Lcom/daaw/do0;->F:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v0, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {p0, v0, v1}, Lcom/daaw/do0;->u0(J)Z

    move-result v0

    iput-boolean v0, v12, Lcom/daaw/do0;->a0:Z

    goto :goto_1

    :cond_5
    const/4 v1, -0x2

    if-ne v0, v1, :cond_6

    invoke-virtual {p0}, Lcom/daaw/do0;->n0()V

    return v13

    :cond_6
    const/4 v1, -0x3

    if-ne v0, v1, :cond_7

    invoke-virtual {p0}, Lcom/daaw/do0;->m0()V

    return v13

    :cond_7
    iget-boolean v0, v12, Lcom/daaw/do0;->O:Z

    if-eqz v0, :cond_9

    iget-boolean v0, v12, Lcom/daaw/do0;->g0:Z

    if-nez v0, :cond_8

    iget v0, v12, Lcom/daaw/do0;->d0:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_9

    :cond_8
    invoke-virtual {p0}, Lcom/daaw/do0;->k0()V

    :cond_9
    return v14

    :cond_a
    :goto_1
    iget-boolean v0, v12, Lcom/daaw/do0;->Q:Z

    if-eqz v0, :cond_c

    iget-boolean v0, v12, Lcom/daaw/do0;->f0:Z

    if-eqz v0, :cond_c

    :try_start_1
    iget-object v5, v12, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    iget-object v6, v12, Lcom/daaw/do0;->Z:Ljava/nio/ByteBuffer;

    iget v7, v12, Lcom/daaw/do0;->Y:I

    iget-object v0, v12, Lcom/daaw/do0;->F:Landroid/media/MediaCodec$BufferInfo;

    iget v8, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    iget-wide v9, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-boolean v11, v12, Lcom/daaw/do0;->a0:Z

    move-object v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    invoke-virtual/range {v0 .. v11}, Lcom/daaw/do0;->l0(JJLandroid/media/MediaCodec;Ljava/nio/ByteBuffer;IIJZ)Z

    move-result v0
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    nop

    invoke-virtual {p0}, Lcom/daaw/do0;->k0()V

    iget-boolean v0, v12, Lcom/daaw/do0;->h0:Z

    if-eqz v0, :cond_b

    invoke-virtual {p0}, Lcom/daaw/do0;->o0()V

    :cond_b
    return v14

    :cond_c
    iget-object v5, v12, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    iget-object v6, v12, Lcom/daaw/do0;->Z:Ljava/nio/ByteBuffer;

    iget v7, v12, Lcom/daaw/do0;->Y:I

    iget-object v0, v12, Lcom/daaw/do0;->F:Landroid/media/MediaCodec$BufferInfo;

    iget v8, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    iget-wide v9, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-boolean v11, v12, Lcom/daaw/do0;->a0:Z

    move-object v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    invoke-virtual/range {v0 .. v11}, Lcom/daaw/do0;->l0(JJLandroid/media/MediaCodec;Ljava/nio/ByteBuffer;IIJZ)Z

    move-result v0

    :goto_2
    if-eqz v0, :cond_f

    iget-object v0, v12, Lcom/daaw/do0;->F:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v0, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {p0, v0, v1}, Lcom/daaw/do0;->i0(J)V

    iget-object v0, v12, Lcom/daaw/do0;->F:Landroid/media/MediaCodec$BufferInfo;

    iget v0, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_d

    const/4 v0, 0x1

    goto :goto_3

    :cond_d
    const/4 v0, 0x0

    :goto_3
    invoke-virtual {p0}, Lcom/daaw/do0;->s0()V

    if-nez v0, :cond_e

    return v13

    :cond_e
    invoke-virtual {p0}, Lcom/daaw/do0;->k0()V

    :cond_f
    return v14
.end method

.method public final T()Z
    .locals 13

    iget-object v0, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    const/4 v1, 0x0

    if-eqz v0, :cond_17

    iget v2, p0, Lcom/daaw/do0;->d0:I

    const/4 v3, 0x2

    if-eq v2, v3, :cond_17

    iget-boolean v2, p0, Lcom/daaw/do0;->g0:Z

    if-eqz v2, :cond_0

    goto/16 :goto_5

    :cond_0
    iget v2, p0, Lcom/daaw/do0;->X:I

    if-gez v2, :cond_2

    const-wide/16 v4, 0x0

    invoke-virtual {v0, v4, v5}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    move-result v0

    iput v0, p0, Lcom/daaw/do0;->X:I

    if-gez v0, :cond_1

    return v1

    :cond_1
    iget-object v2, p0, Lcom/daaw/do0;->B:Lcom/daaw/gq;

    invoke-virtual {p0, v0}, Lcom/daaw/do0;->b0(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, v2, Lcom/daaw/gq;->r:Ljava/nio/ByteBuffer;

    iget-object v0, p0, Lcom/daaw/do0;->B:Lcom/daaw/gq;

    invoke-virtual {v0}, Lcom/daaw/gq;->f()V

    :cond_2
    iget v0, p0, Lcom/daaw/do0;->d0:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_4

    iget-boolean v0, p0, Lcom/daaw/do0;->O:Z

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    iput-boolean v2, p0, Lcom/daaw/do0;->f0:Z

    iget-object v4, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    iget v5, p0, Lcom/daaw/do0;->X:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x4

    invoke-virtual/range {v4 .. v10}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    invoke-virtual {p0}, Lcom/daaw/do0;->r0()V

    :goto_0
    iput v3, p0, Lcom/daaw/do0;->d0:I

    return v1

    :cond_4
    iget-boolean v0, p0, Lcom/daaw/do0;->S:Z

    if-eqz v0, :cond_5

    iput-boolean v1, p0, Lcom/daaw/do0;->S:Z

    iget-object v0, p0, Lcom/daaw/do0;->B:Lcom/daaw/gq;

    iget-object v0, v0, Lcom/daaw/gq;->r:Ljava/nio/ByteBuffer;

    sget-object v1, Lcom/daaw/do0;->l0:[B

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    iget-object v3, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    iget v4, p0, Lcom/daaw/do0;->X:I

    const/4 v5, 0x0

    array-length v6, v1

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {v3 .. v9}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    invoke-virtual {p0}, Lcom/daaw/do0;->r0()V

    iput-boolean v2, p0, Lcom/daaw/do0;->e0:Z

    return v2

    :cond_5
    iget-boolean v0, p0, Lcom/daaw/do0;->i0:Z

    if-eqz v0, :cond_6

    const/4 v0, -0x4

    const/4 v4, 0x0

    goto :goto_2

    :cond_6
    iget v0, p0, Lcom/daaw/do0;->c0:I

    if-ne v0, v2, :cond_8

    const/4 v0, 0x0

    :goto_1
    iget-object v4, p0, Lcom/daaw/do0;->G:Lcom/google/android/exoplayer2/Format;

    iget-object v4, v4, Lcom/google/android/exoplayer2/Format;->w:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v0, v4, :cond_7

    iget-object v4, p0, Lcom/daaw/do0;->G:Lcom/google/android/exoplayer2/Format;

    iget-object v4, v4, Lcom/google/android/exoplayer2/Format;->w:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [B

    iget-object v5, p0, Lcom/daaw/do0;->B:Lcom/daaw/gq;

    iget-object v5, v5, Lcom/daaw/gq;->r:Ljava/nio/ByteBuffer;

    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_7
    iput v3, p0, Lcom/daaw/do0;->c0:I

    :cond_8
    iget-object v0, p0, Lcom/daaw/do0;->B:Lcom/daaw/gq;

    iget-object v0, v0, Lcom/daaw/gq;->r:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    iget-object v4, p0, Lcom/daaw/do0;->D:Lcom/daaw/k30;

    iget-object v5, p0, Lcom/daaw/do0;->B:Lcom/daaw/gq;

    invoke-virtual {p0, v4, v5, v1}, Lcom/daaw/xa;->G(Lcom/daaw/k30;Lcom/daaw/gq;Z)I

    move-result v4

    move v12, v4

    move v4, v0

    move v0, v12

    :goto_2
    const/4 v5, -0x3

    if-ne v0, v5, :cond_9

    return v1

    :cond_9
    const/4 v5, -0x5

    if-ne v0, v5, :cond_b

    iget v0, p0, Lcom/daaw/do0;->c0:I

    if-ne v0, v3, :cond_a

    iget-object v0, p0, Lcom/daaw/do0;->B:Lcom/daaw/gq;

    invoke-virtual {v0}, Lcom/daaw/gq;->f()V

    iput v2, p0, Lcom/daaw/do0;->c0:I

    :cond_a
    iget-object v0, p0, Lcom/daaw/do0;->D:Lcom/daaw/k30;

    iget-object v0, v0, Lcom/daaw/k30;->a:Lcom/google/android/exoplayer2/Format;

    invoke-virtual {p0, v0}, Lcom/daaw/do0;->g0(Lcom/google/android/exoplayer2/Format;)V

    return v2

    :cond_b
    iget-object v0, p0, Lcom/daaw/do0;->B:Lcom/daaw/gq;

    invoke-virtual {v0}, Lcom/daaw/rc;->j()Z

    move-result v0

    if-eqz v0, :cond_f

    iget v0, p0, Lcom/daaw/do0;->c0:I

    if-ne v0, v3, :cond_c

    iget-object v0, p0, Lcom/daaw/do0;->B:Lcom/daaw/gq;

    invoke-virtual {v0}, Lcom/daaw/gq;->f()V

    iput v2, p0, Lcom/daaw/do0;->c0:I

    :cond_c
    iput-boolean v2, p0, Lcom/daaw/do0;->g0:Z

    iget-boolean v0, p0, Lcom/daaw/do0;->e0:Z

    if-nez v0, :cond_d

    invoke-virtual {p0}, Lcom/daaw/do0;->k0()V

    return v1

    :cond_d
    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/do0;->O:Z

    if-eqz v0, :cond_e

    goto :goto_3

    :cond_e
    iput-boolean v2, p0, Lcom/daaw/do0;->f0:Z

    iget-object v3, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    iget v4, p0, Lcom/daaw/do0;->X:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x4

    invoke-virtual/range {v3 .. v9}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    invoke-virtual {p0}, Lcom/daaw/do0;->r0()V
    :try_end_0
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_3
    return v1

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lcom/daaw/xa;->x()I

    move-result v1

    invoke-static {v0, v1}, Lcom/daaw/qz;->a(Ljava/lang/Exception;I)Lcom/daaw/qz;

    move-result-object v0

    throw v0

    :cond_f
    iget-boolean v0, p0, Lcom/daaw/do0;->j0:Z

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/daaw/do0;->B:Lcom/daaw/gq;

    invoke-virtual {v0}, Lcom/daaw/rc;->k()Z

    move-result v0

    if-nez v0, :cond_11

    iget-object v0, p0, Lcom/daaw/do0;->B:Lcom/daaw/gq;

    invoke-virtual {v0}, Lcom/daaw/gq;->f()V

    iget v0, p0, Lcom/daaw/do0;->c0:I

    if-ne v0, v3, :cond_10

    iput v2, p0, Lcom/daaw/do0;->c0:I

    :cond_10
    return v2

    :cond_11
    iput-boolean v1, p0, Lcom/daaw/do0;->j0:Z

    iget-object v0, p0, Lcom/daaw/do0;->B:Lcom/daaw/gq;

    invoke-virtual {v0}, Lcom/daaw/gq;->p()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/do0;->v0(Z)Z

    move-result v3

    iput-boolean v3, p0, Lcom/daaw/do0;->i0:Z

    if-eqz v3, :cond_12

    return v1

    :cond_12
    iget-boolean v3, p0, Lcom/daaw/do0;->M:Z

    if-eqz v3, :cond_14

    if-nez v0, :cond_14

    iget-object v3, p0, Lcom/daaw/do0;->B:Lcom/daaw/gq;

    iget-object v3, v3, Lcom/daaw/gq;->r:Ljava/nio/ByteBuffer;

    invoke-static {v3}, Lcom/daaw/sr0;->b(Ljava/nio/ByteBuffer;)V

    iget-object v3, p0, Lcom/daaw/do0;->B:Lcom/daaw/gq;

    iget-object v3, v3, Lcom/daaw/gq;->r:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->position()I

    move-result v3

    if-nez v3, :cond_13

    return v2

    :cond_13
    iput-boolean v1, p0, Lcom/daaw/do0;->M:Z

    :cond_14
    :try_start_1
    iget-object v3, p0, Lcom/daaw/do0;->B:Lcom/daaw/gq;

    iget-wide v9, v3, Lcom/daaw/gq;->s:J

    invoke-virtual {v3}, Lcom/daaw/rc;->i()Z

    move-result v3

    if-eqz v3, :cond_15

    iget-object v3, p0, Lcom/daaw/do0;->E:Ljava/util/List;

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_15
    iget-object v3, p0, Lcom/daaw/do0;->B:Lcom/daaw/gq;

    invoke-virtual {v3}, Lcom/daaw/gq;->o()V

    iget-object v3, p0, Lcom/daaw/do0;->B:Lcom/daaw/gq;

    invoke-virtual {p0, v3}, Lcom/daaw/do0;->j0(Lcom/daaw/gq;)V

    if-eqz v0, :cond_16

    iget-object v0, p0, Lcom/daaw/do0;->B:Lcom/daaw/gq;

    invoke-static {v0, v4}, Lcom/daaw/do0;->a0(Lcom/daaw/gq;I)Landroid/media/MediaCodec$CryptoInfo;

    move-result-object v8

    iget-object v5, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    iget v6, p0, Lcom/daaw/do0;->X:I

    const/4 v7, 0x0

    const/4 v11, 0x0

    invoke-virtual/range {v5 .. v11}, Landroid/media/MediaCodec;->queueSecureInputBuffer(IILandroid/media/MediaCodec$CryptoInfo;JI)V

    goto :goto_4

    :cond_16
    iget-object v5, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    iget v6, p0, Lcom/daaw/do0;->X:I

    const/4 v7, 0x0

    iget-object v0, p0, Lcom/daaw/do0;->B:Lcom/daaw/gq;

    iget-object v0, v0, Lcom/daaw/gq;->r:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v8

    const/4 v11, 0x0

    invoke-virtual/range {v5 .. v11}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    :goto_4
    invoke-virtual {p0}, Lcom/daaw/do0;->r0()V

    iput-boolean v2, p0, Lcom/daaw/do0;->e0:Z

    iput v1, p0, Lcom/daaw/do0;->c0:I

    iget-object v0, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    iget v1, v0, Lcom/daaw/fq;->c:I

    add-int/2addr v1, v2

    iput v1, v0, Lcom/daaw/fq;->c:I
    :try_end_1
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_1 .. :try_end_1} :catch_1

    return v2

    :catch_1
    move-exception v0

    invoke-virtual {p0}, Lcom/daaw/xa;->x()I

    move-result v1

    invoke-static {v0, v1}, Lcom/daaw/qz;->a(Ljava/lang/Exception;I)Lcom/daaw/qz;

    move-result-object v0

    throw v0

    :cond_17
    :goto_5
    return v1
.end method

.method public U()V
    .locals 3

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/do0;->W:J

    invoke-virtual {p0}, Lcom/daaw/do0;->r0()V

    invoke-virtual {p0}, Lcom/daaw/do0;->s0()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/do0;->j0:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/daaw/do0;->i0:Z

    iput-boolean v1, p0, Lcom/daaw/do0;->a0:Z

    iget-object v2, p0, Lcom/daaw/do0;->E:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    iput-boolean v1, p0, Lcom/daaw/do0;->S:Z

    iput-boolean v1, p0, Lcom/daaw/do0;->T:Z

    iget-boolean v2, p0, Lcom/daaw/do0;->N:Z

    if-nez v2, :cond_2

    iget-boolean v2, p0, Lcom/daaw/do0;->P:Z

    if-eqz v2, :cond_0

    iget-boolean v2, p0, Lcom/daaw/do0;->f0:Z

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget v2, p0, Lcom/daaw/do0;->d0:I

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    invoke-virtual {v2}, Landroid/media/MediaCodec;->flush()V

    iput-boolean v1, p0, Lcom/daaw/do0;->e0:Z

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/daaw/do0;->o0()V

    invoke-virtual {p0}, Lcom/daaw/do0;->e0()V

    :goto_1
    iget-boolean v1, p0, Lcom/daaw/do0;->b0:Z

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/daaw/do0;->G:Lcom/google/android/exoplayer2/Format;

    if-eqz v1, :cond_3

    iput v0, p0, Lcom/daaw/do0;->c0:I

    :cond_3
    return-void
.end method

.method public final V()Landroid/media/MediaCodec;
    .locals 1

    iget-object v0, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    return-object v0
.end method

.method public final W()V
    .locals 2

    sget v0, Lcom/daaw/sq1;->a:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getInputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/do0;->U:[Ljava/nio/ByteBuffer;

    iget-object v0, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/do0;->V:[Ljava/nio/ByteBuffer;

    :cond_0
    return-void
.end method

.method public final X()Lcom/daaw/co0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/do0;->K:Lcom/daaw/co0;

    return-object v0
.end method

.method public Y(Lcom/daaw/eo0;Lcom/google/android/exoplayer2/Format;Z)Lcom/daaw/co0;
    .locals 0

    iget-object p2, p2, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    invoke-interface {p1, p2, p3}, Lcom/daaw/eo0;->b(Ljava/lang/String;Z)Lcom/daaw/co0;

    move-result-object p1

    return-object p1
.end method

.method public Z()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final a(Lcom/google/android/exoplayer2/Format;)I
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/do0;->y:Lcom/daaw/eo0;

    iget-object v1, p0, Lcom/daaw/do0;->z:Lcom/daaw/yu;

    invoke-virtual {p0, v0, v1, p1}, Lcom/daaw/do0;->w0(Lcom/daaw/eo0;Lcom/daaw/yu;Lcom/google/android/exoplayer2/Format;)I

    move-result p1
    :try_end_0
    .catch Lcom/daaw/fo0$c; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    invoke-virtual {p0}, Lcom/daaw/xa;->x()I

    move-result v0

    invoke-static {p1, v0}, Lcom/daaw/qz;->a(Ljava/lang/Exception;I)Lcom/daaw/qz;

    move-result-object p1

    throw p1
.end method

.method public final b0(I)Ljava/nio/ByteBuffer;
    .locals 2

    sget v0, Lcom/daaw/sq1;->a:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/do0;->U:[Ljava/nio/ByteBuffer;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/do0;->h0:Z

    return v0
.end method

.method public final c0(I)Ljava/nio/ByteBuffer;
    .locals 2

    sget v0, Lcom/daaw/sq1;->a:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/do0;->V:[Ljava/nio/ByteBuffer;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public d()Z
    .locals 5

    iget-object v0, p0, Lcom/daaw/do0;->G:Lcom/google/android/exoplayer2/Format;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/daaw/do0;->i0:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/xa;->z()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/do0;->d0()Z

    move-result v0

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/daaw/do0;->W:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/do0;->W:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final d0()Z
    .locals 1

    iget v0, p0, Lcom/daaw/do0;->Y:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final e0()V
    .locals 11

    iget-object v0, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/daaw/do0;->G:Lcom/google/android/exoplayer2/Format;

    if-nez v0, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v1, p0, Lcom/daaw/do0;->I:Lcom/google/android/exoplayer2/drm/d;

    iput-object v1, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    iget-object v0, v0, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    invoke-interface {v1}, Lcom/google/android/exoplayer2/drm/d;->b()Lcom/daaw/nz;

    move-result-object v1

    check-cast v1, Lcom/daaw/i40;

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    invoke-interface {v1}, Lcom/google/android/exoplayer2/drm/d;->c()Lcom/google/android/exoplayer2/drm/d$a;

    move-result-object v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    invoke-virtual {v1}, Lcom/daaw/i40;->a()Landroid/media/MediaCrypto;

    move-result-object v4

    invoke-virtual {v1, v0}, Lcom/daaw/i40;->b(Ljava/lang/String;)Z

    move-result v1

    goto :goto_1

    :cond_3
    :goto_0
    move-object v4, v3

    const/4 v1, 0x0

    :goto_1
    iget-object v5, p0, Lcom/daaw/do0;->K:Lcom/daaw/co0;

    if-nez v5, :cond_5

    :try_start_0
    iget-object v5, p0, Lcom/daaw/do0;->y:Lcom/daaw/eo0;

    iget-object v6, p0, Lcom/daaw/do0;->G:Lcom/google/android/exoplayer2/Format;

    invoke-virtual {p0, v5, v6, v1}, Lcom/daaw/do0;->Y(Lcom/daaw/eo0;Lcom/google/android/exoplayer2/Format;Z)Lcom/daaw/co0;

    move-result-object v5

    iput-object v5, p0, Lcom/daaw/do0;->K:Lcom/daaw/co0;

    if-nez v5, :cond_4

    if-eqz v1, :cond_4

    iget-object v5, p0, Lcom/daaw/do0;->y:Lcom/daaw/eo0;

    iget-object v6, p0, Lcom/daaw/do0;->G:Lcom/google/android/exoplayer2/Format;

    invoke-virtual {p0, v5, v6, v2}, Lcom/daaw/do0;->Y(Lcom/daaw/eo0;Lcom/google/android/exoplayer2/Format;Z)Lcom/daaw/co0;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/do0;->K:Lcom/daaw/co0;

    if-eqz v2, :cond_4

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Drm session requires secure decoder for "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", but no secure decoder available. Trying to proceed with "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/daaw/do0;->K:Lcom/daaw/co0;

    iget-object v0, v0, Lcom/daaw/co0;->a:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Lcom/daaw/fo0$c; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    new-instance v2, Lcom/daaw/do0$a;

    iget-object v5, p0, Lcom/daaw/do0;->G:Lcom/google/android/exoplayer2/Format;

    const v6, -0xc34e

    invoke-direct {v2, v5, v0, v1, v6}, Lcom/daaw/do0$a;-><init>(Lcom/google/android/exoplayer2/Format;Ljava/lang/Throwable;ZI)V

    invoke-virtual {p0, v2}, Lcom/daaw/do0;->x0(Lcom/daaw/do0$a;)V

    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/daaw/do0;->K:Lcom/daaw/co0;

    if-nez v0, :cond_5

    new-instance v0, Lcom/daaw/do0$a;

    iget-object v2, p0, Lcom/daaw/do0;->G:Lcom/google/android/exoplayer2/Format;

    const v5, -0xc34f

    invoke-direct {v0, v2, v3, v1, v5}, Lcom/daaw/do0$a;-><init>(Lcom/google/android/exoplayer2/Format;Ljava/lang/Throwable;ZI)V

    invoke-virtual {p0, v0}, Lcom/daaw/do0;->x0(Lcom/daaw/do0$a;)V

    :cond_5
    iget-object v0, p0, Lcom/daaw/do0;->K:Lcom/daaw/co0;

    invoke-virtual {p0, v0}, Lcom/daaw/do0;->t0(Lcom/daaw/co0;)Z

    move-result v0

    if-nez v0, :cond_6

    return-void

    :cond_6
    iget-object v0, p0, Lcom/daaw/do0;->K:Lcom/daaw/co0;

    iget-object v0, v0, Lcom/daaw/co0;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/daaw/do0;->K(Ljava/lang/String;)I

    move-result v2

    iput v2, p0, Lcom/daaw/do0;->L:I

    iget-object v2, p0, Lcom/daaw/do0;->G:Lcom/google/android/exoplayer2/Format;

    invoke-static {v0, v2}, Lcom/daaw/do0;->L(Ljava/lang/String;Lcom/google/android/exoplayer2/Format;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/daaw/do0;->M:Z

    invoke-static {v0}, Lcom/daaw/do0;->P(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/daaw/do0;->N:Z

    invoke-static {v0}, Lcom/daaw/do0;->O(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/daaw/do0;->O:Z

    invoke-static {v0}, Lcom/daaw/do0;->M(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/daaw/do0;->P:Z

    invoke-static {v0}, Lcom/daaw/do0;->N(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/daaw/do0;->Q:Z

    iget-object v2, p0, Lcom/daaw/do0;->G:Lcom/google/android/exoplayer2/Format;

    invoke-static {v0, v2}, Lcom/daaw/do0;->Q(Ljava/lang/String;Lcom/google/android/exoplayer2/Format;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/daaw/do0;->R:Z

    :try_start_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "createCodec:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/daaw/mm1;->a(Ljava/lang/String;)V

    invoke-static {v0}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v5

    iput-object v5, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    invoke-static {}, Lcom/daaw/mm1;->c()V

    const-string v5, "configureCodec"

    invoke-static {v5}, Lcom/daaw/mm1;->a(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/daaw/do0;->K:Lcom/daaw/co0;

    iget-object v6, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    iget-object v7, p0, Lcom/daaw/do0;->G:Lcom/google/android/exoplayer2/Format;

    invoke-virtual {p0, v5, v6, v7, v4}, Lcom/daaw/do0;->R(Lcom/daaw/co0;Landroid/media/MediaCodec;Lcom/google/android/exoplayer2/Format;Landroid/media/MediaCrypto;)V

    invoke-static {}, Lcom/daaw/mm1;->c()V

    const-string v4, "startCodec"

    invoke-static {v4}, Lcom/daaw/mm1;->a(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    invoke-virtual {v4}, Landroid/media/MediaCodec;->start()V

    invoke-static {}, Lcom/daaw/mm1;->c()V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v7

    sub-long v9, v7, v2

    move-object v5, p0

    move-object v6, v0

    invoke-virtual/range {v5 .. v10}, Lcom/daaw/do0;->f0(Ljava/lang/String;JJ)V

    invoke-virtual {p0}, Lcom/daaw/do0;->W()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v2

    new-instance v3, Lcom/daaw/do0$a;

    iget-object v4, p0, Lcom/daaw/do0;->G:Lcom/google/android/exoplayer2/Format;

    invoke-direct {v3, v4, v2, v1, v0}, Lcom/daaw/do0$a;-><init>(Lcom/google/android/exoplayer2/Format;Ljava/lang/Throwable;ZLjava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/daaw/do0;->x0(Lcom/daaw/do0$a;)V

    :goto_3
    invoke-virtual {p0}, Lcom/daaw/xa;->getState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_7

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    add-long/2addr v0, v2

    goto :goto_4

    :cond_7
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    :goto_4
    iput-wide v0, p0, Lcom/daaw/do0;->W:J

    invoke-virtual {p0}, Lcom/daaw/do0;->r0()V

    invoke-virtual {p0}, Lcom/daaw/do0;->s0()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/do0;->j0:Z

    iget-object v1, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    iget v2, v1, Lcom/daaw/fq;->a:I

    add-int/2addr v2, v0

    iput v2, v1, Lcom/daaw/fq;->a:I

    :cond_8
    :goto_5
    return-void
.end method

.method public abstract f0(Ljava/lang/String;JJ)V
.end method

.method public g0(Lcom/google/android/exoplayer2/Format;)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/do0;->G:Lcom/google/android/exoplayer2/Format;

    iput-object p1, p0, Lcom/daaw/do0;->G:Lcom/google/android/exoplayer2/Format;

    iget-object p1, p1, Lcom/google/android/exoplayer2/Format;->x:Lcom/google/android/exoplayer2/drm/DrmInitData;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v2, v1

    goto :goto_0

    :cond_0
    iget-object v2, v0, Lcom/google/android/exoplayer2/Format;->x:Lcom/google/android/exoplayer2/drm/DrmInitData;

    :goto_0
    invoke-static {p1, v2}, Lcom/daaw/sq1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v2, 0x1

    xor-int/2addr p1, v2

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/daaw/do0;->G:Lcom/google/android/exoplayer2/Format;

    iget-object p1, p1, Lcom/google/android/exoplayer2/Format;->x:Lcom/google/android/exoplayer2/drm/DrmInitData;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/daaw/do0;->z:Lcom/daaw/yu;

    if-eqz p1, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    iget-object v3, p0, Lcom/daaw/do0;->G:Lcom/google/android/exoplayer2/Format;

    iget-object v3, v3, Lcom/google/android/exoplayer2/Format;->x:Lcom/google/android/exoplayer2/drm/DrmInitData;

    invoke-interface {p1, v1, v3}, Lcom/daaw/yu;->a(Landroid/os/Looper;Lcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/drm/d;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/do0;->I:Lcom/google/android/exoplayer2/drm/d;

    iget-object v1, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    if-ne p1, v1, :cond_3

    iget-object v1, p0, Lcom/daaw/do0;->z:Lcom/daaw/yu;

    invoke-interface {v1, p1}, Lcom/daaw/yu;->f(Lcom/google/android/exoplayer2/drm/d;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Media requires a DrmSessionManager"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/xa;->x()I

    move-result v0

    invoke-static {p1, v0}, Lcom/daaw/qz;->a(Ljava/lang/Exception;I)Lcom/daaw/qz;

    move-result-object p1

    throw p1

    :cond_2
    iput-object v1, p0, Lcom/daaw/do0;->I:Lcom/google/android/exoplayer2/drm/d;

    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/daaw/do0;->I:Lcom/google/android/exoplayer2/drm/d;

    iget-object v1, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    const/4 v3, 0x0

    if-ne p1, v1, :cond_8

    iget-object p1, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    if-eqz p1, :cond_8

    iget-object v1, p0, Lcom/daaw/do0;->K:Lcom/daaw/co0;

    iget-object v4, p0, Lcom/daaw/do0;->G:Lcom/google/android/exoplayer2/Format;

    invoke-virtual {p0, p1, v1, v0, v4}, Lcom/daaw/do0;->J(Landroid/media/MediaCodec;Lcom/daaw/co0;Lcom/google/android/exoplayer2/Format;Lcom/google/android/exoplayer2/Format;)I

    move-result p1

    if-eqz p1, :cond_8

    if-eq p1, v2, :cond_7

    const/4 v1, 0x3

    if-ne p1, v1, :cond_6

    iput-boolean v2, p0, Lcom/daaw/do0;->b0:Z

    iput v2, p0, Lcom/daaw/do0;->c0:I

    iget p1, p0, Lcom/daaw/do0;->L:I

    const/4 v1, 0x2

    if-eq p1, v1, :cond_4

    if-ne p1, v2, :cond_5

    iget-object p1, p0, Lcom/daaw/do0;->G:Lcom/google/android/exoplayer2/Format;

    iget v1, p1, Lcom/google/android/exoplayer2/Format;->y:I

    iget v4, v0, Lcom/google/android/exoplayer2/Format;->y:I

    if-ne v1, v4, :cond_5

    iget p1, p1, Lcom/google/android/exoplayer2/Format;->z:I

    iget v0, v0, Lcom/google/android/exoplayer2/Format;->z:I

    if-ne p1, v0, :cond_5

    :cond_4
    const/4 v3, 0x1

    :cond_5
    iput-boolean v3, p0, Lcom/daaw/do0;->S:Z

    goto :goto_2

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_7
    :goto_2
    const/4 v3, 0x1

    :cond_8
    if-nez v3, :cond_a

    iget-boolean p1, p0, Lcom/daaw/do0;->e0:Z

    if-eqz p1, :cond_9

    iput v2, p0, Lcom/daaw/do0;->d0:I

    goto :goto_3

    :cond_9
    invoke-virtual {p0}, Lcom/daaw/do0;->o0()V

    invoke-virtual {p0}, Lcom/daaw/do0;->e0()V

    :cond_a
    :goto_3
    return-void
.end method

.method public abstract h0(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V
.end method

.method public i0(J)V
    .locals 0

    return-void
.end method

.method public abstract j0(Lcom/daaw/gq;)V
.end method

.method public final k0()V
    .locals 2

    iget v0, p0, Lcom/daaw/do0;->d0:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/do0;->o0()V

    invoke-virtual {p0}, Lcom/daaw/do0;->e0()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/do0;->h0:Z

    invoke-virtual {p0}, Lcom/daaw/do0;->p0()V

    :goto_0
    return-void
.end method

.method public abstract l0(JJLandroid/media/MediaCodec;Ljava/nio/ByteBuffer;IIJZ)Z
.end method

.method public final m0()V
    .locals 2

    sget v0, Lcom/daaw/sq1;->a:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/do0;->V:[Ljava/nio/ByteBuffer;

    :cond_0
    return-void
.end method

.method public final n0()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    move-result-object v0

    iget v1, p0, Lcom/daaw/do0;->L:I

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    const-string v1, "width"

    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    const/16 v3, 0x20

    if-ne v1, v3, :cond_0

    const-string v1, "height"

    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    if-ne v1, v3, :cond_0

    iput-boolean v2, p0, Lcom/daaw/do0;->T:Z

    return-void

    :cond_0
    iget-boolean v1, p0, Lcom/daaw/do0;->R:Z

    if-eqz v1, :cond_1

    const-string v1, "channel-count"

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_1
    iget-object v1, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    invoke-virtual {p0, v1, v0}, Lcom/daaw/do0;->h0(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V

    return-void
.end method

.method public o0()V
    .locals 4

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/do0;->W:J

    invoke-virtual {p0}, Lcom/daaw/do0;->r0()V

    invoke-virtual {p0}, Lcom/daaw/do0;->s0()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/do0;->i0:Z

    iput-boolean v0, p0, Lcom/daaw/do0;->a0:Z

    iget-object v1, p0, Lcom/daaw/do0;->E:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, Lcom/daaw/do0;->q0()V

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/daaw/do0;->K:Lcom/daaw/co0;

    iput-boolean v0, p0, Lcom/daaw/do0;->b0:Z

    iput-boolean v0, p0, Lcom/daaw/do0;->e0:Z

    iput-boolean v0, p0, Lcom/daaw/do0;->M:Z

    iput-boolean v0, p0, Lcom/daaw/do0;->N:Z

    iput v0, p0, Lcom/daaw/do0;->L:I

    iput-boolean v0, p0, Lcom/daaw/do0;->O:Z

    iput-boolean v0, p0, Lcom/daaw/do0;->P:Z

    iput-boolean v0, p0, Lcom/daaw/do0;->R:Z

    iput-boolean v0, p0, Lcom/daaw/do0;->S:Z

    iput-boolean v0, p0, Lcom/daaw/do0;->T:Z

    iput-boolean v0, p0, Lcom/daaw/do0;->f0:Z

    iput v0, p0, Lcom/daaw/do0;->c0:I

    iput v0, p0, Lcom/daaw/do0;->d0:I

    iget-object v0, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    if-eqz v0, :cond_3

    iget-object v2, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    iget v3, v2, Lcom/daaw/fq;->b:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v2, Lcom/daaw/fq;->b:I

    :try_start_0
    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    iget-object v0, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iput-object v1, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    iget-object v0, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    if-eqz v0, :cond_3

    iget-object v2, p0, Lcom/daaw/do0;->I:Lcom/google/android/exoplayer2/drm/d;

    if-eq v2, v0, :cond_3

    :try_start_2
    iget-object v2, p0, Lcom/daaw/do0;->z:Lcom/daaw/yu;

    invoke-interface {v2, v0}, Lcom/daaw/yu;->f(Lcom/google/android/exoplayer2/drm/d;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iput-object v1, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    goto :goto_3

    :catchall_0
    move-exception v0

    iput-object v1, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    throw v0

    :catchall_1
    move-exception v0

    iput-object v1, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    iget-object v2, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    if-eqz v2, :cond_0

    iget-object v3, p0, Lcom/daaw/do0;->I:Lcom/google/android/exoplayer2/drm/d;

    if-eq v3, v2, :cond_0

    :try_start_3
    iget-object v3, p0, Lcom/daaw/do0;->z:Lcom/daaw/yu;

    invoke-interface {v3, v2}, Lcom/daaw/yu;->f(Lcom/google/android/exoplayer2/drm/d;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    iput-object v1, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    goto :goto_0

    :catchall_2
    move-exception v0

    iput-object v1, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    throw v0

    :cond_0
    :goto_0
    throw v0

    :catchall_3
    move-exception v0

    :try_start_4
    iget-object v2, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    invoke-virtual {v2}, Landroid/media/MediaCodec;->release()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    iput-object v1, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    iget-object v2, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    if-eqz v2, :cond_1

    iget-object v3, p0, Lcom/daaw/do0;->I:Lcom/google/android/exoplayer2/drm/d;

    if-eq v3, v2, :cond_1

    :try_start_5
    iget-object v3, p0, Lcom/daaw/do0;->z:Lcom/daaw/yu;

    invoke-interface {v3, v2}, Lcom/daaw/yu;->f(Lcom/google/android/exoplayer2/drm/d;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    iput-object v1, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    goto :goto_1

    :catchall_4
    move-exception v0

    iput-object v1, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    throw v0

    :cond_1
    :goto_1
    throw v0

    :catchall_5
    move-exception v0

    iput-object v1, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    iget-object v2, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    if-eqz v2, :cond_2

    iget-object v3, p0, Lcom/daaw/do0;->I:Lcom/google/android/exoplayer2/drm/d;

    if-eq v3, v2, :cond_2

    :try_start_6
    iget-object v3, p0, Lcom/daaw/do0;->z:Lcom/daaw/yu;

    invoke-interface {v3, v2}, Lcom/daaw/yu;->f(Lcom/google/android/exoplayer2/drm/d;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    iput-object v1, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    goto :goto_2

    :catchall_6
    move-exception v0

    iput-object v1, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    throw v0

    :cond_2
    :goto_2
    throw v0

    :cond_3
    :goto_3
    return-void
.end method

.method public final p()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public p0()V
    .locals 0

    return-void
.end method

.method public q(JJ)V
    .locals 5

    iget-boolean v0, p0, Lcom/daaw/do0;->h0:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/do0;->p0()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/do0;->G:Lcom/google/android/exoplayer2/Format;

    const/4 v1, -0x4

    const/4 v2, -0x5

    const/4 v3, 0x1

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/daaw/do0;->C:Lcom/daaw/gq;

    invoke-virtual {v0}, Lcom/daaw/gq;->f()V

    iget-object v0, p0, Lcom/daaw/do0;->D:Lcom/daaw/k30;

    iget-object v4, p0, Lcom/daaw/do0;->C:Lcom/daaw/gq;

    invoke-virtual {p0, v0, v4, v3}, Lcom/daaw/xa;->G(Lcom/daaw/k30;Lcom/daaw/gq;Z)I

    move-result v0

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lcom/daaw/do0;->D:Lcom/daaw/k30;

    iget-object v0, v0, Lcom/daaw/k30;->a:Lcom/google/android/exoplayer2/Format;

    invoke-virtual {p0, v0}, Lcom/daaw/do0;->g0(Lcom/google/android/exoplayer2/Format;)V

    goto :goto_0

    :cond_1
    if-ne v0, v1, :cond_2

    iget-object p1, p0, Lcom/daaw/do0;->C:Lcom/daaw/gq;

    invoke-virtual {p1}, Lcom/daaw/rc;->j()Z

    move-result p1

    invoke-static {p1}, Lcom/daaw/s6;->f(Z)V

    iput-boolean v3, p0, Lcom/daaw/do0;->g0:Z

    invoke-virtual {p0}, Lcom/daaw/do0;->k0()V

    :cond_2
    return-void

    :cond_3
    :goto_0
    invoke-virtual {p0}, Lcom/daaw/do0;->e0()V

    iget-object v0, p0, Lcom/daaw/do0;->J:Landroid/media/MediaCodec;

    if-eqz v0, :cond_6

    const-string v0, "drainAndFeed"

    invoke-static {v0}, Lcom/daaw/mm1;->a(Ljava/lang/String;)V

    :goto_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/do0;->S(JJ)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    :goto_2
    invoke-virtual {p0}, Lcom/daaw/do0;->T()Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_2

    :cond_5
    invoke-static {}, Lcom/daaw/mm1;->c()V

    goto :goto_3

    :cond_6
    iget-object p3, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    iget p4, p3, Lcom/daaw/fq;->d:I

    invoke-virtual {p0, p1, p2}, Lcom/daaw/xa;->H(J)I

    move-result p1

    add-int/2addr p4, p1

    iput p4, p3, Lcom/daaw/fq;->d:I

    iget-object p1, p0, Lcom/daaw/do0;->C:Lcom/daaw/gq;

    invoke-virtual {p1}, Lcom/daaw/gq;->f()V

    iget-object p1, p0, Lcom/daaw/do0;->D:Lcom/daaw/k30;

    iget-object p2, p0, Lcom/daaw/do0;->C:Lcom/daaw/gq;

    const/4 p3, 0x0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/xa;->G(Lcom/daaw/k30;Lcom/daaw/gq;Z)I

    move-result p1

    if-ne p1, v2, :cond_7

    iget-object p1, p0, Lcom/daaw/do0;->D:Lcom/daaw/k30;

    iget-object p1, p1, Lcom/daaw/k30;->a:Lcom/google/android/exoplayer2/Format;

    invoke-virtual {p0, p1}, Lcom/daaw/do0;->g0(Lcom/google/android/exoplayer2/Format;)V

    goto :goto_3

    :cond_7
    if-ne p1, v1, :cond_8

    iget-object p1, p0, Lcom/daaw/do0;->C:Lcom/daaw/gq;

    invoke-virtual {p1}, Lcom/daaw/rc;->j()Z

    move-result p1

    invoke-static {p1}, Lcom/daaw/s6;->f(Z)V

    iput-boolean v3, p0, Lcom/daaw/do0;->g0:Z

    invoke-virtual {p0}, Lcom/daaw/do0;->k0()V

    :cond_8
    :goto_3
    iget-object p1, p0, Lcom/daaw/do0;->k0:Lcom/daaw/fq;

    invoke-virtual {p1}, Lcom/daaw/fq;->a()V

    return-void
.end method

.method public final q0()V
    .locals 2

    sget v0, Lcom/daaw/sq1;->a:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/do0;->U:[Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/daaw/do0;->V:[Ljava/nio/ByteBuffer;

    :cond_0
    return-void
.end method

.method public final r0()V
    .locals 2

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/do0;->X:I

    iget-object v0, p0, Lcom/daaw/do0;->B:Lcom/daaw/gq;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/daaw/gq;->r:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public final s0()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/do0;->Y:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/do0;->Z:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public t0(Lcom/daaw/co0;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final u0(J)Z
    .locals 6

    iget-object v0, p0, Lcom/daaw/do0;->E:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Lcom/daaw/do0;->E:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    cmp-long v5, v3, p1

    if-nez v5, :cond_0

    iget-object p1, p0, Lcom/daaw/do0;->E:Ljava/util/List;

    invoke-interface {p1, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public final v0(Z)Z
    .locals 3

    iget-object v0, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    if-nez p1, :cond_0

    iget-boolean p1, p0, Lcom/daaw/do0;->A:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lcom/google/android/exoplayer2/drm/d;->getState()I

    move-result p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v2, 0x4

    if-eq p1, v2, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1

    :cond_2
    iget-object p1, p0, Lcom/daaw/do0;->H:Lcom/google/android/exoplayer2/drm/d;

    invoke-interface {p1}, Lcom/google/android/exoplayer2/drm/d;->c()Lcom/google/android/exoplayer2/drm/d$a;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/xa;->x()I

    move-result v0

    invoke-static {p1, v0}, Lcom/daaw/qz;->a(Ljava/lang/Exception;I)Lcom/daaw/qz;

    move-result-object p1

    throw p1

    :cond_3
    :goto_0
    return v1
.end method

.method public abstract w0(Lcom/daaw/eo0;Lcom/daaw/yu;Lcom/google/android/exoplayer2/Format;)I
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
.end method

.method public final x0(Lcom/daaw/do0$a;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/xa;->x()I

    move-result v0

    invoke-static {p1, v0}, Lcom/daaw/qz;->a(Ljava/lang/Exception;I)Lcom/daaw/qz;

    move-result-object p1

    throw p1
.end method
