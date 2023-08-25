.class public final Lcom/daaw/m80;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wv;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/m80$a;
    }
.end annotation


# static fields
.field public static final n:[D


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lcom/daaw/sm1;

.field public c:Z

.field public d:J

.field public final e:[Z

.field public final f:Lcom/daaw/m80$a;

.field public g:J

.field public h:Z

.field public i:J

.field public j:J

.field public k:J

.field public l:Z

.field public m:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    new-array v0, v0, [D

    fill-array-data v0, :array_0

    sput-object v0, Lcom/daaw/m80;->n:[D

    return-void

    :array_0
    .array-data 8
        0x4037f9dcb5112287L    # 23.976023976023978
        0x4038000000000000L    # 24.0
        0x4039000000000000L    # 25.0
        0x403df853e2556b28L    # 29.97002997002997
        0x403e000000000000L    # 30.0
        0x4049000000000000L    # 50.0
        0x404df853e2556b28L    # 59.94005994005994
        0x404e000000000000L    # 60.0
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [Z

    iput-object v0, p0, Lcom/daaw/m80;->e:[Z

    new-instance v0, Lcom/daaw/m80$a;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Lcom/daaw/m80$a;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/m80;->f:Lcom/daaw/m80$a;

    return-void
.end method

.method public static f(Lcom/daaw/m80$a;Ljava/lang/String;)Landroid/util/Pair;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/m80$a;",
            "Ljava/lang/String;",
            ")",
            "Landroid/util/Pair<",
            "Lcom/google/android/exoplayer2/Format;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/daaw/m80$a;->d:[B

    iget v2, v0, Lcom/daaw/m80$a;->b:I

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    const/4 v2, 0x4

    aget-byte v3, v1, v2

    and-int/lit16 v3, v3, 0xff

    const/4 v4, 0x5

    aget-byte v5, v1, v4

    and-int/lit16 v5, v5, 0xff

    const/4 v6, 0x6

    aget-byte v6, v1, v6

    and-int/lit16 v6, v6, 0xff

    shl-int/2addr v3, v2

    shr-int/lit8 v7, v5, 0x4

    or-int v13, v3, v7

    and-int/lit8 v3, v5, 0xf

    shl-int/lit8 v3, v3, 0x8

    or-int v14, v3, v6

    const/4 v3, 0x7

    aget-byte v5, v1, v3

    and-int/lit16 v5, v5, 0xf0

    shr-int/2addr v5, v2

    const/4 v6, 0x2

    if-eq v5, v6, :cond_2

    const/4 v6, 0x3

    if-eq v5, v6, :cond_1

    if-eq v5, v2, :cond_0

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v18, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_0
    mul-int/lit8 v2, v14, 0x79

    int-to-float v2, v2

    mul-int/lit8 v5, v13, 0x64

    goto :goto_0

    :cond_1
    mul-int/lit8 v2, v14, 0x10

    int-to-float v2, v2

    mul-int/lit8 v5, v13, 0x9

    goto :goto_0

    :cond_2
    mul-int/lit8 v2, v14, 0x4

    int-to-float v2, v2

    mul-int/lit8 v5, v13, 0x3

    :goto_0
    int-to-float v5, v5

    div-float/2addr v2, v5

    move/from16 v18, v2

    :goto_1
    const/4 v10, 0x0

    const/4 v11, -0x1

    const/4 v12, -0x1

    const/high16 v15, -0x40800000    # -1.0f

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v16

    const/16 v17, -0x1

    const/16 v19, 0x0

    const-string v9, "video/mpeg2"

    move-object/from16 v8, p1

    invoke-static/range {v8 .. v19}, Lcom/google/android/exoplayer2/Format;->H(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIFLjava/util/List;IFLcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/Format;

    move-result-object v2

    const-wide/16 v5, 0x0

    aget-byte v3, v1, v3

    and-int/lit8 v3, v3, 0xf

    add-int/lit8 v3, v3, -0x1

    if-ltz v3, :cond_4

    sget-object v7, Lcom/daaw/m80;->n:[D

    array-length v8, v7

    if-ge v3, v8, :cond_4

    aget-wide v5, v7, v3

    iget v0, v0, Lcom/daaw/m80$a;->c:I

    add-int/lit8 v0, v0, 0x9

    aget-byte v3, v1, v0

    and-int/lit8 v3, v3, 0x60

    shr-int/2addr v3, v4

    aget-byte v0, v1, v0

    and-int/lit8 v0, v0, 0x1f

    if-eq v3, v0, :cond_3

    int-to-double v3, v3

    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v3, v7

    add-int/lit8 v0, v0, 0x1

    int-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v3, v0

    mul-double v5, v5, v3

    :cond_3
    const-wide v0, 0x412e848000000000L    # 1000000.0

    div-double/2addr v0, v5

    double-to-long v5, v0

    :cond_4
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/daaw/rv0;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/rv0;->c()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/rv0;->d()I

    move-result v3

    iget-object v4, v1, Lcom/daaw/rv0;->a:[B

    iget-wide v5, v0, Lcom/daaw/m80;->g:J

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/rv0;->a()I

    move-result v7

    int-to-long v7, v7

    add-long/2addr v5, v7

    iput-wide v5, v0, Lcom/daaw/m80;->g:J

    iget-object v5, v0, Lcom/daaw/m80;->b:Lcom/daaw/sm1;

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/rv0;->a()I

    move-result v6

    invoke-interface {v5, v1, v6}, Lcom/daaw/sm1;->c(Lcom/daaw/rv0;I)V

    :goto_0
    iget-object v5, v0, Lcom/daaw/m80;->e:[Z

    invoke-static {v4, v2, v3, v5}, Lcom/daaw/sr0;->c([BII[Z)I

    move-result v5

    if-ne v5, v3, :cond_1

    iget-boolean v1, v0, Lcom/daaw/m80;->c:Z

    if-nez v1, :cond_0

    iget-object v1, v0, Lcom/daaw/m80;->f:Lcom/daaw/m80$a;

    invoke-virtual {v1, v4, v2, v3}, Lcom/daaw/m80$a;->a([BII)V

    :cond_0
    return-void

    :cond_1
    iget-object v6, v1, Lcom/daaw/rv0;->a:[B

    add-int/lit8 v7, v5, 0x3

    aget-byte v6, v6, v7

    and-int/lit16 v6, v6, 0xff

    iget-boolean v8, v0, Lcom/daaw/m80;->c:Z

    const/4 v10, 0x1

    if-nez v8, :cond_4

    sub-int v8, v5, v2

    if-lez v8, :cond_2

    iget-object v11, v0, Lcom/daaw/m80;->f:Lcom/daaw/m80$a;

    invoke-virtual {v11, v4, v2, v5}, Lcom/daaw/m80$a;->a([BII)V

    :cond_2
    if-gez v8, :cond_3

    neg-int v2, v8

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    iget-object v8, v0, Lcom/daaw/m80;->f:Lcom/daaw/m80$a;

    invoke-virtual {v8, v6, v2}, Lcom/daaw/m80$a;->b(II)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, v0, Lcom/daaw/m80;->f:Lcom/daaw/m80$a;

    iget-object v8, v0, Lcom/daaw/m80;->a:Ljava/lang/String;

    invoke-static {v2, v8}, Lcom/daaw/m80;->f(Lcom/daaw/m80$a;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v2

    iget-object v8, v0, Lcom/daaw/m80;->b:Lcom/daaw/sm1;

    iget-object v11, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v11, Lcom/google/android/exoplayer2/Format;

    invoke-interface {v8, v11}, Lcom/daaw/sm1;->d(Lcom/google/android/exoplayer2/Format;)V

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    iput-wide v11, v0, Lcom/daaw/m80;->d:J

    iput-boolean v10, v0, Lcom/daaw/m80;->c:Z

    :cond_4
    if-eqz v6, :cond_6

    const/16 v2, 0xb3

    if-ne v6, v2, :cond_5

    goto :goto_2

    :cond_5
    const/16 v2, 0xb8

    if-ne v6, v2, :cond_d

    iput-boolean v10, v0, Lcom/daaw/m80;->l:Z

    goto :goto_7

    :cond_6
    :goto_2
    sub-int v2, v3, v5

    iget-boolean v5, v0, Lcom/daaw/m80;->h:Z

    if-eqz v5, :cond_7

    iget-boolean v5, v0, Lcom/daaw/m80;->m:Z

    if-eqz v5, :cond_7

    iget-boolean v5, v0, Lcom/daaw/m80;->c:Z

    if-eqz v5, :cond_7

    iget-boolean v14, v0, Lcom/daaw/m80;->l:Z

    iget-wide v11, v0, Lcom/daaw/m80;->g:J

    iget-wide v9, v0, Lcom/daaw/m80;->j:J

    sub-long/2addr v11, v9

    long-to-int v9, v11

    sub-int v15, v9, v2

    iget-object v11, v0, Lcom/daaw/m80;->b:Lcom/daaw/sm1;

    iget-wide v12, v0, Lcom/daaw/m80;->k:J

    const/16 v17, 0x0

    move/from16 v16, v2

    invoke-interface/range {v11 .. v17}, Lcom/daaw/sm1;->a(JIIILcom/daaw/sm1$a;)V

    :cond_7
    iget-boolean v9, v0, Lcom/daaw/m80;->h:Z

    if-eqz v9, :cond_9

    iget-boolean v10, v0, Lcom/daaw/m80;->m:Z

    if-eqz v10, :cond_8

    goto :goto_3

    :cond_8
    const/4 v2, 0x0

    const/4 v5, 0x1

    goto :goto_5

    :cond_9
    :goto_3
    iget-wide v10, v0, Lcom/daaw/m80;->g:J

    int-to-long v12, v2

    sub-long/2addr v10, v12

    iput-wide v10, v0, Lcom/daaw/m80;->j:J

    iget-wide v10, v0, Lcom/daaw/m80;->i:J

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v10, v12

    if-eqz v2, :cond_a

    goto :goto_4

    :cond_a
    if-eqz v9, :cond_b

    iget-wide v9, v0, Lcom/daaw/m80;->k:J

    iget-wide v14, v0, Lcom/daaw/m80;->d:J

    add-long/2addr v9, v14

    move-wide v10, v9

    goto :goto_4

    :cond_b
    const-wide/16 v10, 0x0

    :goto_4
    iput-wide v10, v0, Lcom/daaw/m80;->k:J

    const/4 v2, 0x0

    iput-boolean v2, v0, Lcom/daaw/m80;->l:Z

    iput-wide v12, v0, Lcom/daaw/m80;->i:J

    const/4 v5, 0x1

    iput-boolean v5, v0, Lcom/daaw/m80;->h:Z

    :goto_5
    if-nez v6, :cond_c

    const/4 v9, 0x1

    goto :goto_6

    :cond_c
    const/4 v9, 0x0

    :goto_6
    iput-boolean v9, v0, Lcom/daaw/m80;->m:Z

    :cond_d
    :goto_7
    move v2, v7

    goto/16 :goto_0
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/m80;->e:[Z

    invoke-static {v0}, Lcom/daaw/sr0;->a([Z)V

    iget-object v0, p0, Lcom/daaw/m80;->f:Lcom/daaw/m80$a;

    invoke-virtual {v0}, Lcom/daaw/m80$a;->c()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/m80;->g:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/m80;->h:Z

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public d(Lcom/daaw/d00;Lcom/daaw/eo1$d;)V
    .locals 1

    invoke-virtual {p2}, Lcom/daaw/eo1$d;->a()V

    invoke-virtual {p2}, Lcom/daaw/eo1$d;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/m80;->a:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/daaw/eo1$d;->c()I

    move-result p2

    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lcom/daaw/d00;->a(II)Lcom/daaw/sm1;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/m80;->b:Lcom/daaw/sm1;

    return-void
.end method

.method public e(JZ)V
    .locals 0

    iput-wide p1, p0, Lcom/daaw/m80;->i:J

    return-void
.end method
