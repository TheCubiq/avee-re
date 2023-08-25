.class public final Lcom/daaw/m82;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public D:F

.field public E:F

.field public F:F

.field public G:F

.field public H:F

.field public I:F

.field public J:F

.field public K:F

.field public L:F

.field public M:F

.field public N:[B

.field public O:I

.field public P:I

.field public Q:I

.field public R:J

.field public S:J

.field public T:Lcom/daaw/n42;

.field public U:Z

.field public V:Z

.field public W:Ljava/lang/String;

.field public X:Lcom/daaw/m42;

.field public Y:I

.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Z

.field public i:[B

.field public j:Lcom/daaw/l42;

.field public k:[B

.field public l:Lcom/google/android/gms/internal/ads/zzx;

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:F

.field public t:F

.field public u:F

.field public v:[B

.field public w:I

.field public x:Z

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/m82;->m:I

    iput v0, p0, Lcom/daaw/m82;->n:I

    iput v0, p0, Lcom/daaw/m82;->o:I

    iput v0, p0, Lcom/daaw/m82;->p:I

    const/4 v1, 0x0

    iput v1, p0, Lcom/daaw/m82;->q:I

    iput v0, p0, Lcom/daaw/m82;->r:I

    const/4 v2, 0x0

    iput v2, p0, Lcom/daaw/m82;->s:F

    iput v2, p0, Lcom/daaw/m82;->t:F

    iput v2, p0, Lcom/daaw/m82;->u:F

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/daaw/m82;->v:[B

    iput v0, p0, Lcom/daaw/m82;->w:I

    iput-boolean v1, p0, Lcom/daaw/m82;->x:Z

    iput v0, p0, Lcom/daaw/m82;->y:I

    iput v0, p0, Lcom/daaw/m82;->z:I

    iput v0, p0, Lcom/daaw/m82;->A:I

    const/16 v1, 0x3e8

    iput v1, p0, Lcom/daaw/m82;->B:I

    const/16 v1, 0xc8

    iput v1, p0, Lcom/daaw/m82;->C:I

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lcom/daaw/m82;->D:F

    iput v1, p0, Lcom/daaw/m82;->E:F

    iput v1, p0, Lcom/daaw/m82;->F:F

    iput v1, p0, Lcom/daaw/m82;->G:F

    iput v1, p0, Lcom/daaw/m82;->H:F

    iput v1, p0, Lcom/daaw/m82;->I:F

    iput v1, p0, Lcom/daaw/m82;->J:F

    iput v1, p0, Lcom/daaw/m82;->K:F

    iput v1, p0, Lcom/daaw/m82;->L:F

    iput v1, p0, Lcom/daaw/m82;->M:F

    const/4 v1, 0x1

    iput v1, p0, Lcom/daaw/m82;->O:I

    iput v0, p0, Lcom/daaw/m82;->P:I

    const/16 v0, 0x1f40

    iput v0, p0, Lcom/daaw/m82;->Q:I

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/daaw/m82;->R:J

    iput-wide v2, p0, Lcom/daaw/m82;->S:J

    iput-boolean v1, p0, Lcom/daaw/m82;->V:Z

    const-string v0, "eng"

    iput-object v0, p0, Lcom/daaw/m82;->W:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/m82;)I
    .locals 0

    iget p0, p0, Lcom/daaw/m82;->g:I

    return p0
.end method

.method public static bridge synthetic b(Lcom/daaw/m82;I)V
    .locals 0

    iput p1, p0, Lcom/daaw/m82;->g:I

    return-void
.end method

.method public static bridge synthetic c(Lcom/daaw/m82;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/m82;->W:Ljava/lang/String;

    return-void
.end method

.method public static synthetic d(Lcom/daaw/m82;)V
    .locals 0

    iget-object p0, p0, Lcom/daaw/m82;->X:Lcom/daaw/m42;

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static f(Lcom/daaw/ik5;)Landroid/util/Pair;
    .locals 6

    const/16 v0, 0x10

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/daaw/ik5;->g(I)V

    invoke-virtual {p0}, Lcom/daaw/ik5;->y()J

    move-result-wide v2

    const-wide/32 v4, 0x58564944

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    new-instance p0, Landroid/util/Pair;

    const-string v0, "video/divx"

    invoke-direct {p0, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_0
    const-wide/32 v4, 0x33363248

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    new-instance p0, Landroid/util/Pair;

    const-string v0, "video/3gpp"

    invoke-direct {p0, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_1
    const-wide/32 v4, 0x31435657

    cmp-long v0, v2, v4

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lcom/daaw/ik5;->k()I

    move-result v0

    add-int/lit8 v0, v0, 0x14

    invoke-virtual {p0}, Lcom/daaw/ik5;->h()[B

    move-result-object p0

    :goto_0
    array-length v2, p0

    add-int/lit8 v3, v2, -0x4

    if-ge v0, v3, :cond_3

    aget-byte v3, p0, v0

    if-nez v3, :cond_2

    add-int/lit8 v3, v0, 0x1

    aget-byte v3, p0, v3

    if-nez v3, :cond_2

    add-int/lit8 v3, v0, 0x2

    aget-byte v3, p0, v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_2

    add-int/lit8 v3, v0, 0x3

    aget-byte v3, p0, v3

    const/16 v4, 0xf

    if-ne v3, v4, :cond_2

    invoke-static {p0, v0, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p0

    new-instance v0, Landroid/util/Pair;

    const-string v2, "video/wvc1"

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, v2, p0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const-string p0, "Failed to find FourCC VC1 initialization data"

    invoke-static {p0, v1}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object p0

    throw p0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    const-string p0, "MatroskaExtractor"

    const-string v0, "Unknown FourCC. Setting mimeType to video/x-unknown"

    invoke-static {p0, v0}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p0, Landroid/util/Pair;

    const-string v0, "video/x-unknown"

    invoke-direct {p0, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :catch_0
    const-string p0, "Error parsing FourCC private data"

    invoke-static {p0, v1}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object p0

    goto :goto_2

    :goto_1
    throw p0

    :goto_2
    goto :goto_1
.end method

.method public static g([B)Ljava/util/List;
    .locals 10

    const-string v0, "Error parsing vorbis codec private"

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_0
    aget-byte v3, p0, v2

    const/4 v4, 0x2

    if-ne v3, v4, :cond_5

    const/4 v3, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    :goto_0
    aget-byte v7, p0, v5

    const/16 v8, 0xff

    and-int/2addr v7, v8

    if-ne v7, v8, :cond_0

    add-int/lit16 v6, v6, 0xff

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    add-int/2addr v5, v3

    add-int/2addr v6, v7

    const/4 v7, 0x0

    :goto_1
    aget-byte v9, p0, v5

    and-int/2addr v9, v8

    if-ne v9, v8, :cond_1

    add-int/lit16 v7, v7, 0xff

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    add-int/2addr v5, v3

    add-int/2addr v7, v9

    aget-byte v8, p0, v5

    if-ne v8, v3, :cond_4

    new-array v3, v6, [B

    invoke-static {p0, v5, v3, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v5, v6

    aget-byte v6, p0, v5

    const/4 v8, 0x3

    if-ne v6, v8, :cond_3

    add-int/2addr v5, v7

    aget-byte v6, p0, v5

    const/4 v7, 0x5

    if-ne v6, v7, :cond_2

    array-length v6, p0

    sub-int/2addr v6, v5

    new-array v7, v6, [B

    invoke-static {p0, v5, v7, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0

    :cond_2
    invoke-static {v0, v1}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object p0

    throw p0

    :cond_3
    invoke-static {v0, v1}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object p0

    throw p0

    :cond_4
    invoke-static {v0, v1}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object p0

    throw p0

    :cond_5
    invoke-static {v0, v1}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object p0

    throw p0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-static {v0, v1}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object p0

    goto :goto_3

    :goto_2
    throw p0

    :goto_3
    goto :goto_2
.end method

.method public static h(Lcom/daaw/ik5;)Z
    .locals 8

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/ik5;->q()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const v2, 0xfffe

    const/4 v3, 0x0

    if-ne v0, v2, :cond_1

    const/16 v0, 0x18

    invoke-virtual {p0, v0}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {p0}, Lcom/daaw/ik5;->z()J

    move-result-wide v4

    invoke-static {}, Lcom/daaw/n82;->e()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v6

    cmp-long v0, v4, v6

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/ik5;->z()J

    move-result-wide v4

    invoke-static {}, Lcom/daaw/n82;->e()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v6
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    cmp-long p0, v4, v6

    if-nez p0, :cond_1

    return v1

    :cond_1
    return v3

    :catch_0
    const/4 p0, 0x0

    const-string v0, "Error parsing MS/ACM codec private"

    invoke-static {v0, p0}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public final e(Lcom/daaw/m09;I)V
    .locals 20
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "this.output"
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "codecId"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/daaw/m82;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/16 v4, 0x10

    const/16 v5, 0x20

    const/4 v6, 0x1

    const/16 v8, 0x8

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v11, 0x3

    sparse-switch v2, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v2, "A_OPUS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0xc

    goto/16 :goto_1

    :sswitch_1
    const-string v2, "A_FLAC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x16

    goto/16 :goto_1

    :sswitch_2
    const-string v2, "A_EAC3"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x11

    goto/16 :goto_1

    :sswitch_3
    const-string v2, "V_MPEG2"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x3

    goto/16 :goto_1

    :sswitch_4
    const-string v2, "S_TEXT/UTF8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x1b

    goto/16 :goto_1

    :sswitch_5
    const-string v2, "S_TEXT/WEBVTT"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x1d

    goto/16 :goto_1

    :sswitch_6
    const-string v2, "V_MPEGH/ISO/HEVC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x8

    goto/16 :goto_1

    :sswitch_7
    const-string v2, "S_TEXT/ASS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x1c

    goto/16 :goto_1

    :sswitch_8
    const-string v2, "A_PCM/INT/LIT"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x18

    goto/16 :goto_1

    :sswitch_9
    const-string v2, "A_PCM/INT/BIG"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x19

    goto/16 :goto_1

    :sswitch_a
    const-string v2, "A_PCM/FLOAT/IEEE"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x1a

    goto/16 :goto_1

    :sswitch_b
    const-string v2, "A_DTS/EXPRESS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x14

    goto/16 :goto_1

    :sswitch_c
    const-string v2, "V_THEORA"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0xa

    goto/16 :goto_1

    :sswitch_d
    const-string v2, "S_HDMV/PGS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x1f

    goto/16 :goto_1

    :sswitch_e
    const-string v2, "V_VP9"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto/16 :goto_1

    :sswitch_f
    const-string v2, "V_VP8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto/16 :goto_1

    :sswitch_10
    const-string v2, "V_AV1"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x2

    goto/16 :goto_1

    :sswitch_11
    const-string v2, "A_DTS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x13

    goto/16 :goto_1

    :sswitch_12
    const-string v2, "A_AC3"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x10

    goto/16 :goto_1

    :sswitch_13
    const-string v2, "A_AAC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0xd

    goto/16 :goto_1

    :sswitch_14
    const-string v2, "A_DTS/LOSSLESS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x15

    goto/16 :goto_1

    :sswitch_15
    const-string v2, "S_VOBSUB"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x1e

    goto/16 :goto_1

    :sswitch_16
    const-string v2, "V_MPEG4/ISO/AVC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x7

    goto/16 :goto_1

    :sswitch_17
    const-string v2, "V_MPEG4/ISO/ASP"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x5

    goto/16 :goto_1

    :sswitch_18
    const-string v2, "S_DVBSUB"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x20

    goto :goto_1

    :sswitch_19
    const-string v2, "V_MS/VFW/FOURCC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x9

    goto :goto_1

    :sswitch_1a
    const-string v2, "A_MPEG/L3"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0xf

    goto :goto_1

    :sswitch_1b
    const-string v2, "A_MPEG/L2"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0xe

    goto :goto_1

    :sswitch_1c
    const-string v2, "A_VORBIS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0xb

    goto :goto_1

    :sswitch_1d
    const-string v2, "A_TRUEHD"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x12

    goto :goto_1

    :sswitch_1e
    const-string v2, "A_MS/ACM"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x17

    goto :goto_1

    :sswitch_1f
    const-string v2, "V_MPEG4/ISO/SP"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_1

    :sswitch_20
    const-string v2, "V_MPEG4/ISO/AP"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x6

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v2, -0x1

    :goto_1
    const-string v13, ". Setting mimeType to audio/x-unknown"

    const-string v14, "text/vtt"

    const-string v15, "text/x-ssa"

    const-string v7, "application/x-subrip"

    const/16 v16, 0x1000

    const-string v17, "audio/raw"

    const-string v18, "audio/x-unknown"

    const-string v3, "MatroskaExtractor"

    const/4 v12, 0x0

    packed-switch v2, :pswitch_data_0

    const-string v1, "Unrecognized codec identifier."

    invoke-static {v1, v12}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object v1

    throw v1

    :pswitch_0
    new-array v2, v9, [B

    invoke-virtual {v0, v1}, Lcom/daaw/m82;->i(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v1, v10, v2, v10, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v2}, Lcom/daaw/y17;->v(Ljava/lang/Object;)Lcom/daaw/y17;

    move-result-object v1

    const-string v17, "application/dvbsubs"

    goto/16 :goto_6

    :pswitch_1
    const-string v17, "application/pgs"

    goto/16 :goto_9

    :pswitch_2
    invoke-virtual {v0, v1}, Lcom/daaw/m82;->i(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/y17;->v(Ljava/lang/Object;)Lcom/daaw/y17;

    move-result-object v1

    const-string v17, "application/vobsub"

    goto/16 :goto_6

    :pswitch_3
    move-object v1, v12

    move-object v2, v1

    move-object/from16 v17, v14

    goto/16 :goto_a

    :pswitch_4
    invoke-static {}, Lcom/daaw/n82;->m()[B

    move-result-object v1

    iget-object v2, v0, Lcom/daaw/m82;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/daaw/m82;->i(Ljava/lang/String;)[B

    move-result-object v2

    invoke-static {v1, v2}, Lcom/daaw/y17;->w(Ljava/lang/Object;Ljava/lang/Object;)Lcom/daaw/y17;

    move-result-object v1

    move-object v2, v12

    move-object/from16 v17, v15

    goto/16 :goto_a

    :pswitch_5
    move-object/from16 v17, v7

    goto/16 :goto_9

    :pswitch_6
    iget v1, v0, Lcom/daaw/m82;->P:I

    if-ne v1, v5, :cond_1

    goto :goto_3

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unsupported floating point PCM bit depth: "

    goto :goto_2

    :pswitch_7
    iget v1, v0, Lcom/daaw/m82;->P:I

    if-ne v1, v8, :cond_2

    move-object v1, v12

    move-object v2, v1

    const/4 v3, -0x1

    const/4 v9, 0x3

    goto/16 :goto_c

    :cond_2
    if-ne v1, v4, :cond_3

    const/high16 v9, 0x10000000

    goto :goto_3

    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unsupported big endian PCM bit depth: "

    goto :goto_2

    :pswitch_8
    iget v1, v0, Lcom/daaw/m82;->P:I

    invoke-static {v1}, Lcom/daaw/it5;->X(I)I

    move-result v9

    if-nez v9, :cond_4

    iget v1, v0, Lcom/daaw/m82;->P:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unsupported little endian PCM bit depth: "

    :goto_2
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_4
    :goto_3
    move-object v1, v12

    move-object v2, v1

    const/4 v3, -0x1

    goto/16 :goto_c

    :pswitch_9
    new-instance v2, Lcom/daaw/ik5;

    invoke-virtual {v0, v1}, Lcom/daaw/m82;->i(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v2, v1}, Lcom/daaw/ik5;-><init>([B)V

    invoke-static {v2}, Lcom/daaw/m82;->h(Lcom/daaw/ik5;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget v1, v0, Lcom/daaw/m82;->P:I

    invoke-static {v1}, Lcom/daaw/it5;->X(I)I

    move-result v9

    if-nez v9, :cond_4

    iget v1, v0, Lcom/daaw/m82;->P:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unsupported PCM bit depth: "

    goto :goto_2

    :cond_5
    const-string v1, "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown"

    :goto_4
    invoke-static {v3, v1}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    move-object v1, v12

    move-object v2, v1

    move-object/from16 v17, v18

    goto/16 :goto_a

    :pswitch_a
    invoke-virtual {v0, v1}, Lcom/daaw/m82;->i(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v17, "audio/flac"

    goto/16 :goto_6

    :pswitch_b
    const-string v17, "audio/vnd.dts.hd"

    goto/16 :goto_9

    :pswitch_c
    const-string v17, "audio/vnd.dts"

    goto/16 :goto_9

    :pswitch_d
    new-instance v1, Lcom/daaw/n42;

    invoke-direct {v1}, Lcom/daaw/n42;-><init>()V

    iput-object v1, v0, Lcom/daaw/m82;->T:Lcom/daaw/n42;

    const-string v17, "audio/true-hd"

    goto/16 :goto_9

    :pswitch_e
    const-string v17, "audio/eac3"

    goto/16 :goto_9

    :pswitch_f
    const-string v17, "audio/ac3"

    goto/16 :goto_9

    :pswitch_10
    const-string v17, "audio/mpeg"

    goto :goto_5

    :pswitch_11
    const-string v17, "audio/mpeg-L2"

    :goto_5
    move-object v1, v12

    move-object v2, v1

    const/16 v3, 0x1000

    goto/16 :goto_b

    :pswitch_12
    invoke-virtual {v0, v1}, Lcom/daaw/m82;->i(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iget-object v2, v0, Lcom/daaw/m82;->k:[B

    invoke-static {v2}, Lcom/daaw/zy8;->a([B)Lcom/daaw/yy8;

    move-result-object v2

    iget v3, v2, Lcom/daaw/yy8;->a:I

    iput v3, v0, Lcom/daaw/m82;->Q:I

    iget v3, v2, Lcom/daaw/yy8;->b:I

    iput v3, v0, Lcom/daaw/m82;->O:I

    iget-object v2, v2, Lcom/daaw/yy8;->c:Ljava/lang/String;

    const-string v17, "audio/mp4a-latm"

    goto/16 :goto_a

    :pswitch_13
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v11}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v2, v0, Lcom/daaw/m82;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/daaw/m82;->i(Ljava/lang/String;)[B

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v8}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    iget-wide v4, v0, Lcom/daaw/m82;->R:J

    invoke-virtual {v2, v4, v5}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v8}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    iget-wide v3, v0, Lcom/daaw/m82;->S:J

    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/16 v16, 0x1680

    const-string v17, "audio/opus"

    move-object v2, v12

    const/16 v3, 0x1680

    goto/16 :goto_b

    :pswitch_14
    invoke-virtual {v0, v1}, Lcom/daaw/m82;->i(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/m82;->g([B)Ljava/util/List;

    move-result-object v1

    const/16 v16, 0x2000

    const-string v17, "audio/vorbis"

    move-object v2, v12

    const/16 v3, 0x2000

    goto/16 :goto_b

    :pswitch_15
    const-string v17, "video/x-unknown"

    goto/16 :goto_9

    :pswitch_16
    new-instance v2, Lcom/daaw/ik5;

    invoke-virtual {v0, v1}, Lcom/daaw/m82;->i(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v2, v1}, Lcom/daaw/ik5;-><init>([B)V

    invoke-static {v2}, Lcom/daaw/m82;->f(Lcom/daaw/ik5;)Landroid/util/Pair;

    move-result-object v1

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    move-object/from16 v17, v2

    check-cast v17, Ljava/lang/String;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    :goto_6
    move-object v2, v12

    goto :goto_a

    :pswitch_17
    new-instance v2, Lcom/daaw/ik5;

    invoke-virtual {v0, v1}, Lcom/daaw/m82;->i(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v2, v1}, Lcom/daaw/ik5;-><init>([B)V

    invoke-static {v2}, Lcom/daaw/z09;->a(Lcom/daaw/ik5;)Lcom/daaw/z09;

    move-result-object v1

    iget-object v2, v1, Lcom/daaw/z09;->a:Ljava/util/List;

    iget v3, v1, Lcom/daaw/z09;->b:I

    iput v3, v0, Lcom/daaw/m82;->Y:I

    iget-object v1, v1, Lcom/daaw/z09;->d:Ljava/lang/String;

    const-string v17, "video/hevc"

    goto :goto_7

    :pswitch_18
    new-instance v2, Lcom/daaw/ik5;

    invoke-virtual {v0, v1}, Lcom/daaw/m82;->i(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v2, v1}, Lcom/daaw/ik5;-><init>([B)V

    invoke-static {v2}, Lcom/daaw/gz8;->a(Lcom/daaw/ik5;)Lcom/daaw/gz8;

    move-result-object v1

    iget-object v2, v1, Lcom/daaw/gz8;->a:Ljava/util/List;

    iget v3, v1, Lcom/daaw/gz8;->b:I

    iput v3, v0, Lcom/daaw/m82;->Y:I

    iget-object v1, v1, Lcom/daaw/gz8;->f:Ljava/lang/String;

    const-string v17, "video/avc"

    :goto_7
    const/4 v3, -0x1

    const/4 v9, -0x1

    move-object/from16 v19, v2

    move-object v2, v1

    move-object/from16 v1, v19

    goto :goto_c

    :pswitch_19
    iget-object v1, v0, Lcom/daaw/m82;->k:[B

    if-nez v1, :cond_6

    move-object v1, v12

    goto :goto_8

    :cond_6
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    :goto_8
    const-string v17, "video/mp4v-es"

    goto :goto_6

    :pswitch_1a
    const-string v17, "video/mpeg2"

    goto :goto_9

    :pswitch_1b
    const-string v17, "video/av01"

    goto :goto_9

    :pswitch_1c
    const-string v17, "video/x-vnd.on2.vp9"

    goto :goto_9

    :pswitch_1d
    const-string v17, "video/x-vnd.on2.vp8"

    :goto_9
    move-object v1, v12

    move-object v2, v1

    :goto_a
    const/4 v3, -0x1

    :goto_b
    const/4 v9, -0x1

    :goto_c
    iget-object v4, v0, Lcom/daaw/m82;->N:[B

    if-eqz v4, :cond_7

    new-instance v5, Lcom/daaw/ik5;

    invoke-direct {v5, v4}, Lcom/daaw/ik5;-><init>([B)V

    invoke-static {v5}, Lcom/daaw/f09;->a(Lcom/daaw/ik5;)Lcom/daaw/f09;

    move-result-object v4

    if-eqz v4, :cond_7

    iget-object v2, v4, Lcom/daaw/f09;->a:Ljava/lang/String;

    const-string v17, "video/dolby-vision"

    :cond_7
    move-object/from16 v4, v17

    iget-boolean v5, v0, Lcom/daaw/m82;->V:Z

    iget-boolean v8, v0, Lcom/daaw/m82;->U:Z

    if-eq v6, v8, :cond_8

    const/4 v8, 0x0

    goto :goto_d

    :cond_8
    const/4 v8, 0x2

    :goto_d
    or-int/2addr v5, v8

    new-instance v8, Lcom/daaw/b72;

    invoke-direct {v8}, Lcom/daaw/b72;-><init>()V

    invoke-static {v4}, Lcom/daaw/ak3;->g(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_9

    iget v7, v0, Lcom/daaw/m82;->O:I

    invoke-virtual {v8, v7}, Lcom/daaw/b72;->e0(I)Lcom/daaw/b72;

    iget v7, v0, Lcom/daaw/m82;->Q:I

    invoke-virtual {v8, v7}, Lcom/daaw/b72;->t(I)Lcom/daaw/b72;

    invoke-virtual {v8, v9}, Lcom/daaw/b72;->n(I)Lcom/daaw/b72;

    goto/16 :goto_14

    :cond_9
    invoke-static {v4}, Lcom/daaw/ak3;->h(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_17

    iget v6, v0, Lcom/daaw/m82;->q:I

    if-nez v6, :cond_c

    iget v6, v0, Lcom/daaw/m82;->o:I

    const/4 v7, -0x1

    if-ne v6, v7, :cond_a

    iget v6, v0, Lcom/daaw/m82;->m:I

    :cond_a
    iput v6, v0, Lcom/daaw/m82;->o:I

    iget v6, v0, Lcom/daaw/m82;->p:I

    if-ne v6, v7, :cond_b

    iget v6, v0, Lcom/daaw/m82;->n:I

    :cond_b
    iput v6, v0, Lcom/daaw/m82;->p:I

    goto :goto_e

    :cond_c
    const/4 v7, -0x1

    :goto_e
    iget v6, v0, Lcom/daaw/m82;->o:I

    const/high16 v9, -0x40800000    # -1.0f

    if-eq v6, v7, :cond_d

    iget v11, v0, Lcom/daaw/m82;->p:I

    if-eq v11, v7, :cond_d

    iget v13, v0, Lcom/daaw/m82;->n:I

    mul-int v13, v13, v6

    int-to-float v6, v13

    iget v13, v0, Lcom/daaw/m82;->m:I

    mul-int v13, v13, v11

    int-to-float v11, v13

    div-float/2addr v6, v11

    goto :goto_f

    :cond_d
    const/high16 v6, -0x40800000    # -1.0f

    :goto_f
    iget-boolean v11, v0, Lcom/daaw/m82;->x:Z

    if-eqz v11, :cond_10

    iget v11, v0, Lcom/daaw/m82;->D:F

    cmpl-float v11, v11, v9

    if-eqz v11, :cond_f

    iget v11, v0, Lcom/daaw/m82;->E:F

    cmpl-float v11, v11, v9

    if-eqz v11, :cond_f

    iget v11, v0, Lcom/daaw/m82;->F:F

    cmpl-float v11, v11, v9

    if-eqz v11, :cond_f

    iget v11, v0, Lcom/daaw/m82;->G:F

    cmpl-float v11, v11, v9

    if-eqz v11, :cond_f

    iget v11, v0, Lcom/daaw/m82;->H:F

    cmpl-float v11, v11, v9

    if-eqz v11, :cond_f

    iget v11, v0, Lcom/daaw/m82;->I:F

    cmpl-float v11, v11, v9

    if-eqz v11, :cond_f

    iget v11, v0, Lcom/daaw/m82;->J:F

    cmpl-float v11, v11, v9

    if-eqz v11, :cond_f

    iget v11, v0, Lcom/daaw/m82;->K:F

    cmpl-float v11, v11, v9

    if-eqz v11, :cond_f

    iget v11, v0, Lcom/daaw/m82;->L:F

    cmpl-float v11, v11, v9

    if-eqz v11, :cond_f

    iget v11, v0, Lcom/daaw/m82;->M:F

    cmpl-float v9, v11, v9

    if-nez v9, :cond_e

    goto/16 :goto_10

    :cond_e
    const/16 v9, 0x19

    new-array v12, v9, [B

    invoke-static {v12}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v9

    sget-object v11, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v9

    invoke-virtual {v9, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    iget v11, v0, Lcom/daaw/m82;->D:F

    const v13, 0x47435000    # 50000.0f

    mul-float v11, v11, v13

    const/high16 v14, 0x3f000000    # 0.5f

    add-float/2addr v11, v14

    float-to-int v11, v11

    int-to-short v11, v11

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v11, v0, Lcom/daaw/m82;->E:F

    mul-float v11, v11, v13

    add-float/2addr v11, v14

    float-to-int v11, v11

    int-to-short v11, v11

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v11, v0, Lcom/daaw/m82;->F:F

    mul-float v11, v11, v13

    add-float/2addr v11, v14

    float-to-int v11, v11

    int-to-short v11, v11

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v11, v0, Lcom/daaw/m82;->G:F

    mul-float v11, v11, v13

    add-float/2addr v11, v14

    float-to-int v11, v11

    int-to-short v11, v11

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v11, v0, Lcom/daaw/m82;->H:F

    mul-float v11, v11, v13

    add-float/2addr v11, v14

    float-to-int v11, v11

    int-to-short v11, v11

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v11, v0, Lcom/daaw/m82;->I:F

    mul-float v11, v11, v13

    add-float/2addr v11, v14

    float-to-int v11, v11

    int-to-short v11, v11

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v11, v0, Lcom/daaw/m82;->J:F

    mul-float v11, v11, v13

    add-float/2addr v11, v14

    float-to-int v11, v11

    int-to-short v11, v11

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v11, v0, Lcom/daaw/m82;->K:F

    mul-float v11, v11, v13

    add-float/2addr v11, v14

    float-to-int v11, v11

    int-to-short v11, v11

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v11, v0, Lcom/daaw/m82;->L:F

    add-float/2addr v11, v14

    float-to-int v11, v11

    int-to-short v11, v11

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v11, v0, Lcom/daaw/m82;->M:F

    add-float/2addr v11, v14

    float-to-int v11, v11

    int-to-short v11, v11

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v11, v0, Lcom/daaw/m82;->B:I

    int-to-short v11, v11

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v11, v0, Lcom/daaw/m82;->C:I

    int-to-short v11, v11

    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    :cond_f
    :goto_10
    new-instance v9, Lcom/daaw/mo8;

    iget v11, v0, Lcom/daaw/m82;->y:I

    iget v13, v0, Lcom/daaw/m82;->A:I

    iget v14, v0, Lcom/daaw/m82;->z:I

    invoke-direct {v9, v11, v13, v14, v12}, Lcom/daaw/mo8;-><init>(III[B)V

    move-object v12, v9

    :cond_10
    iget-object v9, v0, Lcom/daaw/m82;->a:Ljava/lang/String;

    if-eqz v9, :cond_11

    invoke-static {}, Lcom/daaw/n82;->b()Ljava/util/Map;

    move-result-object v9

    iget-object v11, v0, Lcom/daaw/m82;->a:Ljava/lang/String;

    invoke-interface {v9, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_11

    invoke-static {}, Lcom/daaw/n82;->b()Ljava/util/Map;

    move-result-object v7

    iget-object v9, v0, Lcom/daaw/m82;->a:Ljava/lang/String;

    invoke-interface {v7, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    :cond_11
    iget v9, v0, Lcom/daaw/m82;->r:I

    if-nez v9, :cond_16

    iget v9, v0, Lcom/daaw/m82;->s:F

    const/4 v11, 0x0

    invoke-static {v9, v11}, Ljava/lang/Float;->compare(FF)I

    move-result v9

    if-nez v9, :cond_16

    iget v9, v0, Lcom/daaw/m82;->t:F

    invoke-static {v9, v11}, Ljava/lang/Float;->compare(FF)I

    move-result v9

    if-nez v9, :cond_16

    iget v9, v0, Lcom/daaw/m82;->u:F

    invoke-static {v9, v11}, Ljava/lang/Float;->compare(FF)I

    move-result v9

    if-nez v9, :cond_12

    goto :goto_12

    :cond_12
    iget v9, v0, Lcom/daaw/m82;->t:F

    const/high16 v10, 0x42b40000    # 90.0f

    invoke-static {v9, v10}, Ljava/lang/Float;->compare(FF)I

    move-result v9

    if-nez v9, :cond_13

    const/16 v10, 0x5a

    goto :goto_12

    :cond_13
    iget v9, v0, Lcom/daaw/m82;->t:F

    const/high16 v10, -0x3ccc0000    # -180.0f

    invoke-static {v9, v10}, Ljava/lang/Float;->compare(FF)I

    move-result v9

    if-eqz v9, :cond_15

    iget v9, v0, Lcom/daaw/m82;->t:F

    const/high16 v10, 0x43340000    # 180.0f

    invoke-static {v9, v10}, Ljava/lang/Float;->compare(FF)I

    move-result v9

    if-nez v9, :cond_14

    goto :goto_11

    :cond_14
    iget v9, v0, Lcom/daaw/m82;->t:F

    const/high16 v10, -0x3d4c0000    # -90.0f

    invoke-static {v9, v10}, Ljava/lang/Float;->compare(FF)I

    move-result v9

    if-nez v9, :cond_16

    const/16 v10, 0x10e

    goto :goto_12

    :cond_15
    :goto_11
    const/16 v10, 0xb4

    goto :goto_12

    :cond_16
    move v10, v7

    :goto_12
    iget v7, v0, Lcom/daaw/m82;->m:I

    invoke-virtual {v8, v7}, Lcom/daaw/b72;->x(I)Lcom/daaw/b72;

    iget v7, v0, Lcom/daaw/m82;->n:I

    invoke-virtual {v8, v7}, Lcom/daaw/b72;->f(I)Lcom/daaw/b72;

    invoke-virtual {v8, v6}, Lcom/daaw/b72;->p(F)Lcom/daaw/b72;

    invoke-virtual {v8, v10}, Lcom/daaw/b72;->r(I)Lcom/daaw/b72;

    iget-object v6, v0, Lcom/daaw/m82;->v:[B

    invoke-virtual {v8, v6}, Lcom/daaw/b72;->q([B)Lcom/daaw/b72;

    iget v6, v0, Lcom/daaw/m82;->w:I

    invoke-virtual {v8, v6}, Lcom/daaw/b72;->v(I)Lcom/daaw/b72;

    invoke-virtual {v8, v12}, Lcom/daaw/b72;->g0(Lcom/daaw/mo8;)Lcom/daaw/b72;

    const/4 v6, 0x2

    goto :goto_14

    :cond_17
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_19

    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_19

    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_19

    const-string v6, "application/vobsub"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_19

    const-string v6, "application/pgs"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_19

    const-string v6, "application/dvbsubs"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_18

    goto :goto_13

    :cond_18
    const-string v1, "Unexpected MIME type."

    invoke-static {v1, v12}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object v1

    throw v1

    :cond_19
    :goto_13
    const/4 v6, 0x3

    :goto_14
    iget-object v7, v0, Lcom/daaw/m82;->a:Ljava/lang/String;

    if-eqz v7, :cond_1a

    invoke-static {}, Lcom/daaw/n82;->b()Ljava/util/Map;

    move-result-object v7

    iget-object v9, v0, Lcom/daaw/m82;->a:Ljava/lang/String;

    invoke-interface {v7, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1a

    iget-object v7, v0, Lcom/daaw/m82;->a:Ljava/lang/String;

    invoke-virtual {v8, v7}, Lcom/daaw/b72;->j(Ljava/lang/String;)Lcom/daaw/b72;

    :cond_1a
    move/from16 v7, p2

    invoke-virtual {v8, v7}, Lcom/daaw/b72;->g(I)Lcom/daaw/b72;

    invoke-virtual {v8, v4}, Lcom/daaw/b72;->s(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v8, v3}, Lcom/daaw/b72;->l(I)Lcom/daaw/b72;

    iget-object v3, v0, Lcom/daaw/m82;->W:Ljava/lang/String;

    invoke-virtual {v8, v3}, Lcom/daaw/b72;->k(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v8, v5}, Lcom/daaw/b72;->u(I)Lcom/daaw/b72;

    invoke-virtual {v8, v1}, Lcom/daaw/b72;->i(Ljava/util/List;)Lcom/daaw/b72;

    invoke-virtual {v8, v2}, Lcom/daaw/b72;->f0(Ljava/lang/String;)Lcom/daaw/b72;

    iget-object v1, v0, Lcom/daaw/m82;->l:Lcom/google/android/gms/internal/ads/zzx;

    invoke-virtual {v8, v1}, Lcom/daaw/b72;->b(Lcom/google/android/gms/internal/ads/zzx;)Lcom/daaw/b72;

    invoke-virtual {v8}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object v1

    iget v2, v0, Lcom/daaw/m82;->c:I

    move-object/from16 v3, p1

    invoke-interface {v3, v2, v6}, Lcom/daaw/m09;->n(II)Lcom/daaw/m42;

    move-result-object v2

    iput-object v2, v0, Lcom/daaw/m82;->X:Lcom/daaw/m42;

    invoke-interface {v2, v1}, Lcom/daaw/m42;->f(Lcom/daaw/f92;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7ce7f5de -> :sswitch_20
        -0x7ce7f3b0 -> :sswitch_1f
        -0x76567dc0 -> :sswitch_1e
        -0x6a615338 -> :sswitch_1d
        -0x672350af -> :sswitch_1c
        -0x585f4fce -> :sswitch_1b
        -0x585f4fcd -> :sswitch_1a
        -0x51dc40b2 -> :sswitch_19
        -0x37a9c464 -> :sswitch_18
        -0x2016c535 -> :sswitch_17
        -0x2016c4e5 -> :sswitch_16
        -0x19552dbd -> :sswitch_15
        -0x1538b2ba -> :sswitch_14
        0x3c02325 -> :sswitch_13
        0x3c02353 -> :sswitch_12
        0x3c030c5 -> :sswitch_11
        0x4e81333 -> :sswitch_10
        0x4e86155 -> :sswitch_f
        0x4e86156 -> :sswitch_e
        0x5e8da3e -> :sswitch_d
        0x1a8350d6 -> :sswitch_c
        0x2056f406 -> :sswitch_b
        0x25e26ee2 -> :sswitch_a
        0x2b45174d -> :sswitch_9
        0x2b453ce4 -> :sswitch_8
        0x2c0618eb -> :sswitch_7
        0x32fdf009 -> :sswitch_6
        0x3e4ca2d8 -> :sswitch_5
        0x54c61e47 -> :sswitch_4
        0x6bd6c624 -> :sswitch_3
        0x7446132a -> :sswitch_2
        0x7446b0a6 -> :sswitch_1
        0x744ad97d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ljava/lang/String;)[B
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "codecPrivate"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/m82;->k:[B

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Missing CodecPrivate for codec "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object p1

    throw p1
.end method
