.class public final Lcom/daaw/un0$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/un0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public A:F

.field public B:F

.field public C:F

.field public D:F

.field public E:F

.field public F:F

.field public G:I

.field public H:I

.field public I:I

.field public J:J

.field public K:J

.field public L:Lcom/daaw/un0$d;

.field public M:Z

.field public N:Z

.field public O:Ljava/lang/String;

.field public P:Lcom/daaw/sm1;

.field public Q:I

.field public a:Ljava/lang/String;

.field public b:I

.field public c:I

.field public d:I

.field public e:Z

.field public f:[B

.field public g:Lcom/daaw/sm1$a;

.field public h:[B

.field public i:Lcom/google/android/exoplayer2/drm/DrmInitData;

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:[B

.field public p:I

.field public q:Z

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:I

.field public w:F

.field public x:F

.field public y:F

.field public z:F


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/un0$c;->j:I

    iput v0, p0, Lcom/daaw/un0$c;->k:I

    iput v0, p0, Lcom/daaw/un0$c;->l:I

    iput v0, p0, Lcom/daaw/un0$c;->m:I

    const/4 v1, 0x0

    iput v1, p0, Lcom/daaw/un0$c;->n:I

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/daaw/un0$c;->o:[B

    iput v0, p0, Lcom/daaw/un0$c;->p:I

    iput-boolean v1, p0, Lcom/daaw/un0$c;->q:Z

    iput v0, p0, Lcom/daaw/un0$c;->r:I

    iput v0, p0, Lcom/daaw/un0$c;->s:I

    iput v0, p0, Lcom/daaw/un0$c;->t:I

    const/16 v1, 0x3e8

    iput v1, p0, Lcom/daaw/un0$c;->u:I

    const/16 v1, 0xc8

    iput v1, p0, Lcom/daaw/un0$c;->v:I

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lcom/daaw/un0$c;->w:F

    iput v1, p0, Lcom/daaw/un0$c;->x:F

    iput v1, p0, Lcom/daaw/un0$c;->y:F

    iput v1, p0, Lcom/daaw/un0$c;->z:F

    iput v1, p0, Lcom/daaw/un0$c;->A:F

    iput v1, p0, Lcom/daaw/un0$c;->B:F

    iput v1, p0, Lcom/daaw/un0$c;->C:F

    iput v1, p0, Lcom/daaw/un0$c;->D:F

    iput v1, p0, Lcom/daaw/un0$c;->E:F

    iput v1, p0, Lcom/daaw/un0$c;->F:F

    const/4 v1, 0x1

    iput v1, p0, Lcom/daaw/un0$c;->G:I

    iput v0, p0, Lcom/daaw/un0$c;->H:I

    const/16 v0, 0x1f40

    iput v0, p0, Lcom/daaw/un0$c;->I:I

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/daaw/un0$c;->J:J

    iput-wide v2, p0, Lcom/daaw/un0$c;->K:J

    iput-boolean v1, p0, Lcom/daaw/un0$c;->N:Z

    const-string v0, "eng"

    iput-object v0, p0, Lcom/daaw/un0$c;->O:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/un0$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/un0$c;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/un0$c;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/daaw/un0$c;->O:Ljava/lang/String;

    return-object p1
.end method

.method public static e(Lcom/daaw/rv0;)Landroid/util/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/rv0;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "[B>;>;"
        }
    .end annotation

    const/16 v0, 0x10

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->K(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->n()J

    move-result-wide v0

    const-wide/32 v2, 0x58564944

    const/4 v4, 0x0

    cmp-long v5, v0, v2

    if-nez v5, :cond_0

    new-instance p0, Landroid/util/Pair;

    const-string v0, "video/3gpp"

    invoke-direct {p0, v0, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_0
    const-wide/32 v2, 0x31435657

    cmp-long v5, v0, v2

    if-nez v5, :cond_3

    invoke-virtual {p0}, Lcom/daaw/rv0;->c()I

    move-result v0

    add-int/lit8 v0, v0, 0x14

    iget-object p0, p0, Lcom/daaw/rv0;->a:[B

    :goto_0
    array-length v1, p0

    add-int/lit8 v1, v1, -0x4

    if-ge v0, v1, :cond_2

    aget-byte v1, p0, v0

    if-nez v1, :cond_1

    add-int/lit8 v1, v0, 0x1

    aget-byte v1, p0, v1

    if-nez v1, :cond_1

    add-int/lit8 v1, v0, 0x2

    aget-byte v1, p0, v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    add-int/lit8 v1, v0, 0x3

    aget-byte v1, p0, v1

    const/16 v2, 0xf

    if-ne v1, v2, :cond_1

    array-length v1, p0

    invoke-static {p0, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p0

    new-instance v0, Landroid/util/Pair;

    const-string v1, "video/wvc1"

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    new-instance p0, Lcom/daaw/tv0;

    const-string v0, "Failed to find FourCC VC1 initialization data"

    invoke-direct {p0, v0}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    new-instance p0, Landroid/util/Pair;

    const-string v0, "video/x-unknown"

    invoke-direct {p0, v0, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :catch_0
    new-instance p0, Lcom/daaw/tv0;

    const-string v0, "Error parsing FourCC private data"

    invoke-direct {p0, v0}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw p0

    :goto_2
    goto :goto_1
.end method

.method public static f(Lcom/daaw/rv0;)Z
    .locals 8

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/rv0;->p()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const v2, 0xfffe

    const/4 v3, 0x0

    if-ne v0, v2, :cond_2

    const/16 v0, 0x18

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->q()J

    move-result-wide v4

    invoke-static {}, Lcom/daaw/un0;->e()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v6

    cmp-long v0, v4, v6

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/rv0;->q()J

    move-result-wide v4

    invoke-static {}, Lcom/daaw/un0;->e()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v6
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    cmp-long p0, v4, v6

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1

    :cond_2
    return v3

    :catch_0
    new-instance p0, Lcom/daaw/tv0;

    const-string v0, "Error parsing MS/ACM codec private"

    invoke-direct {p0, v0}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static g([B)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation

    const-string v0, "Error parsing vorbis codec private"

    const/4 v1, 0x0

    :try_start_0
    aget-byte v2, p0, v1

    const/4 v3, 0x2

    if-ne v2, v3, :cond_5

    const/4 v2, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    :goto_0
    aget-byte v6, p0, v4

    const/4 v7, -0x1

    if-ne v6, v7, :cond_0

    add-int/lit16 v5, v5, 0xff

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v6, v4, 0x1

    aget-byte v4, p0, v4

    add-int/2addr v5, v4

    const/4 v4, 0x0

    :goto_1
    aget-byte v8, p0, v6

    if-ne v8, v7, :cond_1

    add-int/lit16 v4, v4, 0xff

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v7, v6, 0x1

    aget-byte v6, p0, v6

    add-int/2addr v4, v6

    aget-byte v6, p0, v7

    if-ne v6, v2, :cond_4

    new-array v2, v5, [B

    invoke-static {p0, v7, v2, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v7, v5

    aget-byte v5, p0, v7

    const/4 v6, 0x3

    if-ne v5, v6, :cond_3

    add-int/2addr v7, v4

    aget-byte v4, p0, v7

    const/4 v5, 0x5

    if-ne v4, v5, :cond_2

    array-length v4, p0

    sub-int/2addr v4, v7

    new-array v4, v4, [B

    array-length v5, p0

    sub-int/2addr v5, v7

    invoke-static {p0, v7, v4, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0

    :cond_2
    new-instance p0, Lcom/daaw/tv0;

    invoke-direct {p0, v0}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Lcom/daaw/tv0;

    invoke-direct {p0, v0}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    new-instance p0, Lcom/daaw/tv0;

    invoke-direct {p0, v0}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    new-instance p0, Lcom/daaw/tv0;

    invoke-direct {p0, v0}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p0, Lcom/daaw/tv0;

    invoke-direct {p0, v0}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :goto_2
    throw p0

    :goto_3
    goto :goto_2
.end method


# virtual methods
.method public final b()[B
    .locals 5

    iget v0, p0, Lcom/daaw/un0$c;->w:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/daaw/un0$c;->x:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/daaw/un0$c;->y:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/daaw/un0$c;->z:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/daaw/un0$c;->A:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/daaw/un0$c;->B:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/daaw/un0$c;->C:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/daaw/un0$c;->D:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/daaw/un0$c;->E:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/daaw/un0$c;->F:F

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v0, 0x19

    new-array v0, v0, [B

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/daaw/un0$c;->w:F

    const v3, 0x47435000    # 50000.0f

    mul-float v2, v2, v3

    const/high16 v4, 0x3f000000    # 0.5f

    add-float/2addr v2, v4

    float-to-int v2, v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/daaw/un0$c;->x:F

    mul-float v2, v2, v3

    add-float/2addr v2, v4

    float-to-int v2, v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/daaw/un0$c;->y:F

    mul-float v2, v2, v3

    add-float/2addr v2, v4

    float-to-int v2, v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/daaw/un0$c;->z:F

    mul-float v2, v2, v3

    add-float/2addr v2, v4

    float-to-int v2, v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/daaw/un0$c;->A:F

    mul-float v2, v2, v3

    add-float/2addr v2, v4

    float-to-int v2, v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/daaw/un0$c;->B:F

    mul-float v2, v2, v3

    add-float/2addr v2, v4

    float-to-int v2, v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/daaw/un0$c;->C:F

    mul-float v2, v2, v3

    add-float/2addr v2, v4

    float-to-int v2, v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/daaw/un0$c;->D:F

    mul-float v2, v2, v3

    add-float/2addr v2, v4

    float-to-int v2, v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/daaw/un0$c;->E:F

    add-float/2addr v2, v4

    float-to-int v2, v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/daaw/un0$c;->F:F

    add-float/2addr v2, v4

    float-to-int v2, v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/daaw/un0$c;->u:I

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/daaw/un0$c;->v:I

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public c(Lcom/daaw/d00;I)V
    .locals 42

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/daaw/un0$c;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v3, 0x4

    const/16 v4, 0x8

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x3

    sparse-switch v2, :sswitch_data_0

    :goto_0
    const/4 v1, -0x1

    goto/16 :goto_1

    :sswitch_0
    const-string v2, "A_OPUS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0x1c

    goto/16 :goto_1

    :sswitch_1
    const-string v2, "A_FLAC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/16 v1, 0x1b

    goto/16 :goto_1

    :sswitch_2
    const-string v2, "A_EAC3"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/16 v1, 0x1a

    goto/16 :goto_1

    :sswitch_3
    const-string v2, "V_MPEG2"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/16 v1, 0x19

    goto/16 :goto_1

    :sswitch_4
    const-string v2, "S_TEXT/UTF8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    const/16 v1, 0x18

    goto/16 :goto_1

    :sswitch_5
    const-string v2, "V_MPEGH/ISO/HEVC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    const/16 v1, 0x17

    goto/16 :goto_1

    :sswitch_6
    const-string v2, "S_TEXT/ASS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_0

    :cond_6
    const/16 v1, 0x16

    goto/16 :goto_1

    :sswitch_7
    const-string v2, "A_PCM/INT/LIT"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_0

    :cond_7
    const/16 v1, 0x15

    goto/16 :goto_1

    :sswitch_8
    const-string v2, "A_DTS/EXPRESS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_0

    :cond_8
    const/16 v1, 0x14

    goto/16 :goto_1

    :sswitch_9
    const-string v2, "V_THEORA"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v1, 0x13

    goto/16 :goto_1

    :sswitch_a
    const-string v2, "S_HDMV/PGS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v1, 0x12

    goto/16 :goto_1

    :sswitch_b
    const-string v2, "V_VP9"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v1, 0x11

    goto/16 :goto_1

    :sswitch_c
    const-string v2, "V_VP8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v1, 0x10

    goto/16 :goto_1

    :sswitch_d
    const-string v2, "A_DTS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v1, 0xf

    goto/16 :goto_1

    :sswitch_e
    const-string v2, "A_AC3"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v1, 0xe

    goto/16 :goto_1

    :sswitch_f
    const-string v2, "A_AAC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v1, 0xd

    goto/16 :goto_1

    :sswitch_10
    const-string v2, "A_DTS/LOSSLESS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v1, 0xc

    goto/16 :goto_1

    :sswitch_11
    const-string v2, "S_VOBSUB"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v1, 0xb

    goto/16 :goto_1

    :sswitch_12
    const-string v2, "V_MPEG4/ISO/AVC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v1, 0xa

    goto/16 :goto_1

    :sswitch_13
    const-string v2, "V_MPEG4/ISO/ASP"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v1, 0x9

    goto/16 :goto_1

    :sswitch_14
    const-string v2, "S_DVBSUB"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v1, 0x8

    goto/16 :goto_1

    :sswitch_15
    const-string v2, "V_MS/VFW/FOURCC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    goto/16 :goto_0

    :cond_15
    const/4 v1, 0x7

    goto :goto_1

    :sswitch_16
    const-string v2, "A_MPEG/L3"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    goto/16 :goto_0

    :cond_16
    const/4 v1, 0x6

    goto :goto_1

    :sswitch_17
    const-string v2, "A_MPEG/L2"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    goto/16 :goto_0

    :cond_17
    const/4 v1, 0x5

    goto :goto_1

    :sswitch_18
    const-string v2, "A_VORBIS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    goto/16 :goto_0

    :cond_18
    const/4 v1, 0x4

    goto :goto_1

    :sswitch_19
    const-string v2, "A_TRUEHD"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    goto/16 :goto_0

    :cond_19
    const/4 v1, 0x3

    goto :goto_1

    :sswitch_1a
    const-string v2, "A_MS/ACM"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    goto/16 :goto_0

    :cond_1a
    const/4 v1, 0x2

    goto :goto_1

    :sswitch_1b
    const-string v2, "V_MPEG4/ISO/SP"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    goto/16 :goto_0

    :cond_1b
    const/4 v1, 0x1

    goto :goto_1

    :sswitch_1c
    const-string v2, "V_MPEG4/ISO/AP"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    goto/16 :goto_0

    :cond_1c
    const/4 v1, 0x0

    :goto_1
    const-string v2, ". Setting mimeType to "

    const-string v10, "Unsupported PCM bit depth: "

    const-string v11, "application/dvbsubs"

    const-string v12, "application/pgs"

    const-string v13, "application/vobsub"

    const-string v14, "text/x-ssa"

    const-string v15, "application/x-subrip"

    const-string v16, "audio/raw"

    const/16 v17, 0x1000

    const-string v9, "audio/x-unknown"

    const/16 v18, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance v1, Lcom/daaw/tv0;

    const-string v2, "Unrecognized codec identifier."

    invoke-direct {v1, v2}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    const/16 v17, 0x1680

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v8}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v2, v0, Lcom/daaw/un0$c;->h:[B

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    iget-wide v9, v0, Lcom/daaw/un0$c;->J:J

    invoke-virtual {v2, v9, v10}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    iget-wide v3, v0, Lcom/daaw/un0$c;->K:J

    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v16, "audio/opus"

    move-object/from16 v9, v16

    const/16 v26, -0x1

    const/16 v31, 0x1680

    goto/16 :goto_c

    :pswitch_1
    iget-object v1, v0, Lcom/daaw/un0$c;->h:[B

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v16, "audio/flac"

    goto/16 :goto_8

    :pswitch_2
    const-string v16, "audio/eac3"

    goto :goto_3

    :pswitch_3
    const-string v16, "video/mpeg2"

    goto :goto_3

    :pswitch_4
    move-object v9, v15

    goto :goto_4

    :pswitch_5
    new-instance v1, Lcom/daaw/rv0;

    iget-object v2, v0, Lcom/daaw/un0$c;->h:[B

    invoke-direct {v1, v2}, Lcom/daaw/rv0;-><init>([B)V

    invoke-static {v1}, Lcom/daaw/cb0;->a(Lcom/daaw/rv0;)Lcom/daaw/cb0;

    move-result-object v1

    iget-object v2, v1, Lcom/daaw/cb0;->a:Ljava/util/List;

    iget v1, v1, Lcom/daaw/cb0;->b:I

    iput v1, v0, Lcom/daaw/un0$c;->Q:I

    const-string v16, "video/hevc"

    goto/16 :goto_7

    :pswitch_6
    move-object v9, v14

    goto :goto_4

    :pswitch_7
    iget v1, v0, Lcom/daaw/un0$c;->H:I

    invoke-static {v1}, Lcom/daaw/sq1;->x(I)I

    move-result v1

    if-nez v1, :cond_1d

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    :goto_2
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v0, Lcom/daaw/un0$c;->H:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto/16 :goto_a

    :cond_1d
    move/from16 v26, v1

    move-object/from16 v9, v16

    move-object/from16 v1, v18

    goto :goto_6

    :pswitch_8
    const-string v16, "video/x-unknown"

    goto :goto_3

    :pswitch_9
    move-object v9, v12

    goto :goto_4

    :pswitch_a
    const-string v16, "video/x-vnd.on2.vp9"

    goto :goto_3

    :pswitch_b
    const-string v16, "video/x-vnd.on2.vp8"

    :goto_3
    move-object/from16 v9, v16

    :goto_4
    move-object/from16 v1, v18

    :goto_5
    const/16 v26, -0x1

    :goto_6
    const/16 v31, -0x1

    goto/16 :goto_c

    :pswitch_c
    const-string v16, "audio/vnd.dts"

    goto :goto_3

    :pswitch_d
    const-string v16, "audio/ac3"

    goto :goto_3

    :pswitch_e
    iget-object v1, v0, Lcom/daaw/un0$c;->h:[B

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v16, "audio/mp4a-latm"

    goto :goto_8

    :pswitch_f
    const-string v16, "audio/vnd.dts.hd"

    goto :goto_3

    :pswitch_10
    iget-object v1, v0, Lcom/daaw/un0$c;->h:[B

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    move-object v9, v13

    goto :goto_5

    :pswitch_11
    new-instance v1, Lcom/daaw/rv0;

    iget-object v2, v0, Lcom/daaw/un0$c;->h:[B

    invoke-direct {v1, v2}, Lcom/daaw/rv0;-><init>([B)V

    invoke-static {v1}, Lcom/daaw/y9;->b(Lcom/daaw/rv0;)Lcom/daaw/y9;

    move-result-object v1

    iget-object v2, v1, Lcom/daaw/y9;->a:Ljava/util/List;

    iget v1, v1, Lcom/daaw/y9;->b:I

    iput v1, v0, Lcom/daaw/un0$c;->Q:I

    const-string v16, "video/avc"

    :goto_7
    move-object v1, v2

    :goto_8
    move-object/from16 v9, v16

    goto :goto_5

    :pswitch_12
    new-array v1, v3, [B

    iget-object v2, v0, Lcom/daaw/un0$c;->h:[B

    aget-byte v3, v2, v6

    aput-byte v3, v1, v6

    aget-byte v3, v2, v5

    aput-byte v3, v1, v5

    aget-byte v3, v2, v7

    aput-byte v3, v1, v7

    aget-byte v2, v2, v8

    aput-byte v2, v1, v8

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    move-object v9, v11

    goto :goto_5

    :pswitch_13
    new-instance v1, Lcom/daaw/rv0;

    iget-object v2, v0, Lcom/daaw/un0$c;->h:[B

    invoke-direct {v1, v2}, Lcom/daaw/rv0;-><init>([B)V

    invoke-static {v1}, Lcom/daaw/un0$c;->e(Lcom/daaw/rv0;)Landroid/util/Pair;

    move-result-object v1

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    move-object/from16 v16, v2

    check-cast v16, Ljava/lang/String;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    goto :goto_8

    :pswitch_14
    const-string v16, "audio/mpeg"

    goto :goto_9

    :pswitch_15
    const-string v16, "audio/mpeg-L2"

    :goto_9
    move-object/from16 v9, v16

    move-object/from16 v1, v18

    const/16 v26, -0x1

    const/16 v31, 0x1000

    goto :goto_c

    :pswitch_16
    const/16 v17, 0x2000

    iget-object v1, v0, Lcom/daaw/un0$c;->h:[B

    invoke-static {v1}, Lcom/daaw/un0$c;->g([B)Ljava/util/List;

    move-result-object v1

    const-string v16, "audio/vorbis"

    move-object/from16 v9, v16

    const/16 v26, -0x1

    const/16 v31, 0x2000

    goto :goto_c

    :pswitch_17
    new-instance v1, Lcom/daaw/un0$d;

    invoke-direct {v1}, Lcom/daaw/un0$d;-><init>()V

    iput-object v1, v0, Lcom/daaw/un0$c;->L:Lcom/daaw/un0$d;

    const-string v16, "audio/true-hd"

    goto/16 :goto_3

    :pswitch_18
    new-instance v1, Lcom/daaw/rv0;

    iget-object v3, v0, Lcom/daaw/un0$c;->h:[B

    invoke-direct {v1, v3}, Lcom/daaw/rv0;-><init>([B)V

    invoke-static {v1}, Lcom/daaw/un0$c;->f(Lcom/daaw/rv0;)Z

    move-result v1

    if-eqz v1, :cond_1e

    iget v1, v0, Lcom/daaw/un0$c;->H:I

    invoke-static {v1}, Lcom/daaw/sq1;->x(I)I

    move-result v1

    if-nez v1, :cond_1d

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    goto/16 :goto_2

    :cond_1e
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Non-PCM MS/ACM is unsupported. Setting mimeType to "

    :goto_a
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_4

    :pswitch_19
    iget-object v1, v0, Lcom/daaw/un0$c;->h:[B

    if-nez v1, :cond_1f

    move-object/from16 v1, v18

    goto :goto_b

    :cond_1f
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    :goto_b
    const-string v16, "video/mp4v-es"

    goto/16 :goto_8

    :goto_c
    iget-boolean v2, v0, Lcom/daaw/un0$c;->N:Z

    or-int/2addr v2, v6

    iget-boolean v3, v0, Lcom/daaw/un0$c;->M:Z

    if-eqz v3, :cond_20

    const/4 v6, 0x2

    :cond_20
    or-int/2addr v2, v6

    invoke-static {v9}, Lcom/daaw/hq0;->k(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_21

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v19

    const/16 v21, 0x0

    const/16 v22, -0x1

    iget v3, v0, Lcom/daaw/un0$c;->G:I

    iget v4, v0, Lcom/daaw/un0$c;->I:I

    iget-object v6, v0, Lcom/daaw/un0$c;->i:Lcom/google/android/exoplayer2/drm/DrmInitData;

    iget-object v7, v0, Lcom/daaw/un0$c;->O:Ljava/lang/String;

    move-object/from16 v20, v9

    move/from16 v23, v31

    move/from16 v24, v3

    move/from16 v25, v4

    move-object/from16 v27, v1

    move-object/from16 v28, v6

    move/from16 v29, v2

    move-object/from16 v30, v7

    invoke-static/range {v19 .. v30}, Lcom/google/android/exoplayer2/Format;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILjava/util/List;Lcom/google/android/exoplayer2/drm/DrmInitData;ILjava/lang/String;)Lcom/google/android/exoplayer2/Format;

    move-result-object v1

    goto/16 :goto_12

    :cond_21
    invoke-static {v9}, Lcom/daaw/hq0;->m(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_27

    iget v2, v0, Lcom/daaw/un0$c;->n:I

    if-nez v2, :cond_24

    iget v2, v0, Lcom/daaw/un0$c;->l:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_22

    iget v2, v0, Lcom/daaw/un0$c;->j:I

    :cond_22
    iput v2, v0, Lcom/daaw/un0$c;->l:I

    iget v2, v0, Lcom/daaw/un0$c;->m:I

    if-ne v2, v3, :cond_23

    iget v2, v0, Lcom/daaw/un0$c;->k:I

    :cond_23
    iput v2, v0, Lcom/daaw/un0$c;->m:I

    goto :goto_d

    :cond_24
    const/4 v3, -0x1

    :goto_d
    const/high16 v2, -0x40800000    # -1.0f

    iget v4, v0, Lcom/daaw/un0$c;->l:I

    if-eq v4, v3, :cond_25

    iget v5, v0, Lcom/daaw/un0$c;->m:I

    if-eq v5, v3, :cond_25

    iget v2, v0, Lcom/daaw/un0$c;->k:I

    mul-int v2, v2, v4

    int-to-float v2, v2

    iget v3, v0, Lcom/daaw/un0$c;->j:I

    mul-int v3, v3, v5

    int-to-float v3, v3

    div-float/2addr v2, v3

    move/from16 v37, v2

    goto :goto_e

    :cond_25
    const/high16 v37, -0x40800000    # -1.0f

    :goto_e
    iget-boolean v2, v0, Lcom/daaw/un0$c;->q:Z

    if-eqz v2, :cond_26

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/un0$c;->b()[B

    move-result-object v2

    new-instance v3, Lcom/google/android/exoplayer2/video/ColorInfo;

    iget v4, v0, Lcom/daaw/un0$c;->r:I

    iget v5, v0, Lcom/daaw/un0$c;->t:I

    iget v6, v0, Lcom/daaw/un0$c;->s:I

    invoke-direct {v3, v4, v5, v6, v2}, Lcom/google/android/exoplayer2/video/ColorInfo;-><init>(III[B)V

    move-object/from16 v40, v3

    goto :goto_f

    :cond_26
    move-object/from16 v40, v18

    :goto_f
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v27

    const/16 v29, 0x0

    const/16 v30, -0x1

    iget v2, v0, Lcom/daaw/un0$c;->j:I

    iget v3, v0, Lcom/daaw/un0$c;->k:I

    const/high16 v34, -0x40800000    # -1.0f

    const/16 v36, -0x1

    iget-object v4, v0, Lcom/daaw/un0$c;->o:[B

    iget v5, v0, Lcom/daaw/un0$c;->p:I

    iget-object v6, v0, Lcom/daaw/un0$c;->i:Lcom/google/android/exoplayer2/drm/DrmInitData;

    move-object/from16 v28, v9

    move/from16 v32, v2

    move/from16 v33, v3

    move-object/from16 v35, v1

    move-object/from16 v38, v4

    move/from16 v39, v5

    move-object/from16 v41, v6

    invoke-static/range {v27 .. v41}, Lcom/google/android/exoplayer2/Format;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIFLjava/util/List;IF[BILcom/google/android/exoplayer2/video/ColorInfo;Lcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/Format;

    move-result-object v1

    const/4 v5, 0x2

    goto/16 :goto_12

    :cond_27
    invoke-virtual {v15, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_28

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v3, v0, Lcom/daaw/un0$c;->O:Ljava/lang/String;

    iget-object v4, v0, Lcom/daaw/un0$c;->i:Lcom/google/android/exoplayer2/drm/DrmInitData;

    invoke-static {v1, v9, v2, v3, v4}, Lcom/google/android/exoplayer2/Format;->C(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/Format;

    move-result-object v1

    :goto_10
    const/4 v5, 0x3

    goto/16 :goto_12

    :cond_28
    invoke-virtual {v14, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_29

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {}, Lcom/daaw/un0;->b()[B

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v3, v0, Lcom/daaw/un0$c;->h:[B

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v27

    const/16 v29, 0x0

    const/16 v30, -0x1

    iget-object v3, v0, Lcom/daaw/un0$c;->O:Ljava/lang/String;

    const/16 v33, -0x1

    iget-object v4, v0, Lcom/daaw/un0$c;->i:Lcom/google/android/exoplayer2/drm/DrmInitData;

    const-wide v35, 0x7fffffffffffffffL

    move-object/from16 v28, v9

    move/from16 v31, v2

    move-object/from16 v32, v3

    move-object/from16 v34, v4

    move-object/from16 v37, v1

    invoke-static/range {v27 .. v37}, Lcom/google/android/exoplayer2/Format;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILcom/google/android/exoplayer2/drm/DrmInitData;JLjava/util/List;)Lcom/google/android/exoplayer2/Format;

    move-result-object v1

    goto :goto_10

    :cond_29
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2b

    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2b

    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2a

    goto :goto_11

    :cond_2a
    new-instance v1, Lcom/daaw/tv0;

    const-string v2, "Unexpected MIME type."

    invoke-direct {v1, v2}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2b
    :goto_11
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v27

    const/16 v29, 0x0

    const/16 v30, -0x1

    iget-object v3, v0, Lcom/daaw/un0$c;->O:Ljava/lang/String;

    iget-object v4, v0, Lcom/daaw/un0$c;->i:Lcom/google/android/exoplayer2/drm/DrmInitData;

    move-object/from16 v28, v9

    move/from16 v31, v2

    move-object/from16 v32, v1

    move-object/from16 v33, v3

    move-object/from16 v34, v4

    invoke-static/range {v27 .. v34}, Lcom/google/android/exoplayer2/Format;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Lcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/Format;

    move-result-object v1

    goto :goto_10

    :goto_12
    iget v2, v0, Lcom/daaw/un0$c;->b:I

    move-object/from16 v3, p1

    invoke-interface {v3, v2, v5}, Lcom/daaw/d00;->a(II)Lcom/daaw/sm1;

    move-result-object v2

    iput-object v2, v0, Lcom/daaw/un0$c;->P:Lcom/daaw/sm1;

    invoke-interface {v2, v1}, Lcom/daaw/sm1;->d(Lcom/google/android/exoplayer2/Format;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7ce7f5de -> :sswitch_1c
        -0x7ce7f3b0 -> :sswitch_1b
        -0x76567dc0 -> :sswitch_1a
        -0x6a615338 -> :sswitch_19
        -0x672350af -> :sswitch_18
        -0x585f4fce -> :sswitch_17
        -0x585f4fcd -> :sswitch_16
        -0x51dc40b2 -> :sswitch_15
        -0x37a9c464 -> :sswitch_14
        -0x2016c535 -> :sswitch_13
        -0x2016c4e5 -> :sswitch_12
        -0x19552dbd -> :sswitch_11
        -0x1538b2ba -> :sswitch_10
        0x3c02325 -> :sswitch_f
        0x3c02353 -> :sswitch_e
        0x3c030c5 -> :sswitch_d
        0x4e86155 -> :sswitch_c
        0x4e86156 -> :sswitch_b
        0x5e8da3e -> :sswitch_a
        0x1a8350d6 -> :sswitch_9
        0x2056f406 -> :sswitch_8
        0x2b453ce4 -> :sswitch_7
        0x2c0618eb -> :sswitch_6
        0x32fdf009 -> :sswitch_5
        0x54c61e47 -> :sswitch_4
        0x6bd6c624 -> :sswitch_3
        0x7446132a -> :sswitch_2
        0x7446b0a6 -> :sswitch_1
        0x744ad97d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_19
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_c
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

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/un0$c;->L:Lcom/daaw/un0$d;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Lcom/daaw/un0$d;->a(Lcom/daaw/un0$c;)V

    :cond_0
    return-void
.end method

.method public h()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/un0$c;->L:Lcom/daaw/un0$d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/un0$d;->b()V

    :cond_0
    return-void
.end method
