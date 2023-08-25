.class public final Lcom/daaw/zt2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ns2;


# static fields
.field public static final w:Lcom/daaw/ps2;

.field public static final x:I

.field public static final y:[B


# instance fields
.field public final a:Landroid/util/SparseArray;

.field public final b:Lcom/daaw/iz2;

.field public final c:Lcom/daaw/iz2;

.field public final d:Lcom/daaw/iz2;

.field public final e:Lcom/daaw/iz2;

.field public final f:Lcom/daaw/iz2;

.field public final g:[B

.field public final h:Ljava/util/Stack;

.field public final i:Ljava/util/LinkedList;

.field public j:I

.field public k:I

.field public l:J

.field public m:I

.field public n:Lcom/daaw/iz2;

.field public o:J

.field public p:J

.field public q:Lcom/daaw/yt2;

.field public r:I

.field public s:I

.field public t:I

.field public u:Lcom/daaw/os2;

.field public v:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/wt2;

    invoke-direct {v0}, Lcom/daaw/wt2;-><init>()V

    sput-object v0, Lcom/daaw/zt2;->w:Lcom/daaw/ps2;

    const-string v0, "seig"

    invoke-static {v0}, Lcom/daaw/pz2;->g(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/zt2;->x:I

    const/16 v0, 0x10

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/daaw/zt2;->y:[B

    return-void

    nop

    :array_0
    .array-data 1
        -0x5et
        0x39t
        0x4ft
        0x52t
        0x5at
        -0x65t
        0x4ft
        0x14t
        -0x5et
        0x44t
        0x6ct
        0x42t
        0x7ct
        0x64t
        -0x73t
        -0xct
    .end array-data
.end method

.method public constructor <init>(ILcom/daaw/mz2;Lcom/daaw/fu2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lcom/daaw/iz2;

    const/16 p2, 0x10

    invoke-direct {p1, p2}, Lcom/daaw/iz2;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/zt2;->f:Lcom/daaw/iz2;

    new-instance p1, Lcom/daaw/iz2;

    sget-object p3, Lcom/daaw/gz2;->a:[B

    invoke-direct {p1, p3}, Lcom/daaw/iz2;-><init>([B)V

    iput-object p1, p0, Lcom/daaw/zt2;->b:Lcom/daaw/iz2;

    new-instance p1, Lcom/daaw/iz2;

    const/4 p3, 0x5

    invoke-direct {p1, p3}, Lcom/daaw/iz2;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/zt2;->c:Lcom/daaw/iz2;

    new-instance p1, Lcom/daaw/iz2;

    invoke-direct {p1}, Lcom/daaw/iz2;-><init>()V

    iput-object p1, p0, Lcom/daaw/zt2;->d:Lcom/daaw/iz2;

    new-instance p1, Lcom/daaw/iz2;

    const/4 p3, 0x1

    invoke-direct {p1, p3}, Lcom/daaw/iz2;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/zt2;->e:Lcom/daaw/iz2;

    new-array p1, p2, [B

    iput-object p1, p0, Lcom/daaw/zt2;->g:[B

    new-instance p1, Ljava/util/Stack;

    invoke-direct {p1}, Ljava/util/Stack;-><init>()V

    iput-object p1, p0, Lcom/daaw/zt2;->h:Ljava/util/Stack;

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/daaw/zt2;->i:Ljava/util/LinkedList;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/daaw/zt2;->a:Landroid/util/SparseArray;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/daaw/zt2;->p:J

    invoke-virtual {p0}, Lcom/daaw/zt2;->f()V

    return-void
.end method

.method public static a(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzavc;
    .locals 14

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v4, v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_a

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/mt2;

    iget v6, v5, Lcom/daaw/nt2;->a:I

    sget v7, Lcom/daaw/nt2;->V:I

    if-ne v6, v7, :cond_9

    if-nez v4, :cond_0

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    iget-object v5, v5, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    iget-object v5, v5, Lcom/daaw/iz2;->a:[B

    new-instance v6, Lcom/daaw/iz2;

    invoke-direct {v6, v5}, Lcom/daaw/iz2;-><init>([B)V

    invoke-virtual {v6}, Lcom/daaw/iz2;->d()I

    move-result v8

    const/16 v9, 0x20

    if-ge v8, v9, :cond_1

    :goto_1
    move-object v6, v2

    goto :goto_2

    :cond_1
    invoke-virtual {v6, v1}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {v6}, Lcom/daaw/iz2;->e()I

    move-result v8

    invoke-virtual {v6}, Lcom/daaw/iz2;->a()I

    move-result v9

    add-int/lit8 v9, v9, 0x4

    if-eq v8, v9, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v6}, Lcom/daaw/iz2;->e()I

    move-result v8

    if-eq v8, v7, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v6}, Lcom/daaw/iz2;->e()I

    move-result v7

    invoke-static {v7}, Lcom/daaw/nt2;->b(I)I

    move-result v7

    const/4 v8, 0x1

    if-le v7, v8, :cond_4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Unsupported pssh version: "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_4
    new-instance v9, Ljava/util/UUID;

    invoke-virtual {v6}, Lcom/daaw/iz2;->l()J

    move-result-wide v10

    invoke-virtual {v6}, Lcom/daaw/iz2;->l()J

    move-result-wide v12

    invoke-direct {v9, v10, v11, v12, v13}, Ljava/util/UUID;-><init>(JJ)V

    if-ne v7, v8, :cond_5

    invoke-virtual {v6}, Lcom/daaw/iz2;->i()I

    move-result v7

    mul-int/lit8 v7, v7, 0x10

    invoke-virtual {v6, v7}, Lcom/daaw/iz2;->w(I)V

    :cond_5
    invoke-virtual {v6}, Lcom/daaw/iz2;->i()I

    move-result v7

    invoke-virtual {v6}, Lcom/daaw/iz2;->a()I

    move-result v8

    if-eq v7, v8, :cond_6

    goto :goto_1

    :cond_6
    new-array v8, v7, [B

    invoke-virtual {v6, v8, v1, v7}, Lcom/daaw/iz2;->q([BII)V

    invoke-static {v9, v8}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v6

    :goto_2
    if-nez v6, :cond_7

    move-object v6, v2

    goto :goto_3

    :cond_7
    iget-object v6, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v6, Ljava/util/UUID;

    :goto_3
    if-nez v6, :cond_8

    goto :goto_4

    :cond_8
    new-instance v7, Lcom/google/android/gms/internal/ads/zzavb;

    const-string v8, "video/mp4"

    invoke-direct {v7, v6, v8, v5, v1}, Lcom/google/android/gms/internal/ads/zzavb;-><init>(Ljava/util/UUID;Ljava/lang/String;[BZ)V

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_9
    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_a
    if-nez v4, :cond_b

    return-object v2

    :cond_b
    new-instance p0, Lcom/google/android/gms/internal/ads/zzavc;

    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/ads/zzavc;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method public static g(Lcom/daaw/iz2;ILcom/daaw/hu2;)V
    .locals 3

    add-int/lit8 p1, p1, 0x8

    invoke-virtual {p0, p1}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {p0}, Lcom/daaw/iz2;->e()I

    move-result p1

    invoke-static {p1}, Lcom/daaw/nt2;->a(I)I

    move-result p1

    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_2

    and-int/lit8 p1, p1, 0x2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/daaw/iz2;->i()I

    move-result v1

    iget v2, p2, Lcom/daaw/hu2;->e:I

    if-ne v1, v2, :cond_1

    iget-object v2, p2, Lcom/daaw/hu2;->m:[Z

    invoke-static {v2, v0, v1, p1}, Ljava/util/Arrays;->fill([ZIIZ)V

    invoke-virtual {p0}, Lcom/daaw/iz2;->a()I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/daaw/hu2;->a(I)V

    iget-object p1, p2, Lcom/daaw/hu2;->p:Lcom/daaw/iz2;

    iget-object p1, p1, Lcom/daaw/iz2;->a:[B

    iget v1, p2, Lcom/daaw/hu2;->o:I

    invoke-virtual {p0, p1, v0, v1}, Lcom/daaw/iz2;->q([BII)V

    iget-object p0, p2, Lcom/daaw/hu2;->p:Lcom/daaw/iz2;

    invoke-virtual {p0, v0}, Lcom/daaw/iz2;->v(I)V

    iput-boolean v0, p2, Lcom/daaw/hu2;->q:Z

    return-void

    :cond_1
    new-instance p0, Lcom/daaw/eq2;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Length mismatch: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/eq2;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Lcom/daaw/eq2;

    const-string p1, "Overriding TrackEncryptionBox parameters is unsupported."

    invoke-direct {p0, p1}, Lcom/daaw/eq2;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final b(Lcom/daaw/ms2;)Z
    .locals 0

    invoke-static {p1}, Lcom/daaw/eu2;->a(Lcom/daaw/ms2;)Z

    move-result p1

    return p1
.end method

.method public final c(Lcom/daaw/os2;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/zt2;->u:Lcom/daaw/os2;

    return-void
.end method

.method public final d(JJ)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/zt2;->a:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p1

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p1, :cond_0

    iget-object p3, p0, Lcom/daaw/zt2;->a:Landroid/util/SparseArray;

    invoke-virtual {p3, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/daaw/yt2;

    invoke-virtual {p3}, Lcom/daaw/yt2;->b()V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/zt2;->i:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->clear()V

    iget-object p1, p0, Lcom/daaw/zt2;->h:Ljava/util/Stack;

    invoke-virtual {p1}, Ljava/util/Stack;->clear()V

    invoke-virtual {p0}, Lcom/daaw/zt2;->f()V

    return-void
.end method

.method public final e(Lcom/daaw/ms2;Lcom/daaw/ss2;)I
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    :goto_0
    iget v2, v0, Lcom/daaw/zt2;->j:I

    const/4 v4, 0x2

    const/16 v6, 0x8

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v2, :cond_23

    if-eq v2, v7, :cond_1c

    const-wide v10, 0x7fffffffffffffffL

    const/4 v12, 0x3

    if-eq v2, v4, :cond_17

    if-ne v2, v12, :cond_d

    iget-object v2, v0, Lcom/daaw/zt2;->q:Lcom/daaw/yt2;

    if-nez v2, :cond_7

    iget-object v2, v0, Lcom/daaw/zt2;->a:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v13

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_1
    if-ge v14, v13, :cond_2

    invoke-virtual {v2, v14}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v12, v16

    check-cast v12, Lcom/daaw/yt2;

    iget v5, v12, Lcom/daaw/yt2;->g:I

    iget-object v3, v12, Lcom/daaw/yt2;->a:Lcom/daaw/hu2;

    iget v9, v3, Lcom/daaw/hu2;->d:I

    if-ne v5, v9, :cond_0

    goto :goto_2

    :cond_0
    iget-object v3, v3, Lcom/daaw/hu2;->f:[J

    aget-wide v18, v3, v5

    cmp-long v3, v18, v10

    if-gez v3, :cond_1

    move-object v15, v12

    move-wide/from16 v10, v18

    :cond_1
    :goto_2
    add-int/lit8 v14, v14, 0x1

    const/4 v12, 0x3

    goto :goto_1

    :cond_2
    if-nez v15, :cond_5

    iget-wide v2, v0, Lcom/daaw/zt2;->o:J

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ms2;->d()J

    move-result-wide v4

    sub-long/2addr v2, v4

    long-to-int v3, v2

    if-ltz v3, :cond_4

    invoke-virtual {v1, v3, v8}, Lcom/daaw/ms2;->i(IZ)Z

    :cond_3
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/zt2;->f()V

    goto :goto_0

    :cond_4
    new-instance v1, Lcom/daaw/eq2;

    const-string v2, "Offset to end of mdat was negative."

    invoke-direct {v1, v2}, Lcom/daaw/eq2;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    iget-object v2, v15, Lcom/daaw/yt2;->a:Lcom/daaw/hu2;

    iget-object v2, v2, Lcom/daaw/hu2;->f:[J

    iget v3, v15, Lcom/daaw/yt2;->g:I

    aget-wide v9, v2, v3

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ms2;->d()J

    move-result-wide v2

    sub-long/2addr v9, v2

    long-to-int v2, v9

    if-gez v2, :cond_6

    const/4 v2, 0x0

    :cond_6
    invoke-virtual {v1, v2, v8}, Lcom/daaw/ms2;->i(IZ)Z

    iput-object v15, v0, Lcom/daaw/zt2;->q:Lcom/daaw/yt2;

    :cond_7
    iget-object v2, v0, Lcom/daaw/zt2;->q:Lcom/daaw/yt2;

    iget-object v3, v2, Lcom/daaw/yt2;->a:Lcom/daaw/hu2;

    iget-object v5, v3, Lcom/daaw/hu2;->h:[I

    iget v9, v2, Lcom/daaw/yt2;->e:I

    aget v5, v5, v9

    iput v5, v0, Lcom/daaw/zt2;->r:I

    iget-boolean v10, v3, Lcom/daaw/hu2;->l:Z

    if-eqz v10, :cond_b

    iget-object v5, v3, Lcom/daaw/hu2;->p:Lcom/daaw/iz2;

    iget-object v10, v3, Lcom/daaw/hu2;->a:Lcom/daaw/vt2;

    iget v10, v10, Lcom/daaw/vt2;->a:I

    iget-object v11, v3, Lcom/daaw/hu2;->n:Lcom/daaw/gu2;

    if-eqz v11, :cond_8

    goto :goto_3

    :cond_8
    iget-object v11, v2, Lcom/daaw/yt2;->c:Lcom/daaw/fu2;

    iget-object v11, v11, Lcom/daaw/fu2;->h:[Lcom/daaw/gu2;

    aget-object v11, v11, v10

    :goto_3
    iget v10, v11, Lcom/daaw/gu2;->a:I

    iget-object v3, v3, Lcom/daaw/hu2;->m:[Z

    aget-boolean v3, v3, v9

    iget-object v9, v0, Lcom/daaw/zt2;->e:Lcom/daaw/iz2;

    iget-object v11, v9, Lcom/daaw/iz2;->a:[B

    if-eq v7, v3, :cond_9

    const/4 v12, 0x0

    goto :goto_4

    :cond_9
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v12, v10

    int-to-byte v12, v12

    aput-byte v12, v11, v8

    invoke-virtual {v9, v8}, Lcom/daaw/iz2;->v(I)V

    iget-object v2, v2, Lcom/daaw/yt2;->b:Lcom/daaw/ws2;

    iget-object v9, v0, Lcom/daaw/zt2;->e:Lcom/daaw/iz2;

    invoke-interface {v2, v9, v7}, Lcom/daaw/ws2;->c(Lcom/daaw/iz2;I)V

    invoke-interface {v2, v5, v10}, Lcom/daaw/ws2;->c(Lcom/daaw/iz2;I)V

    if-nez v3, :cond_a

    add-int/2addr v10, v7

    goto :goto_5

    :cond_a
    invoke-virtual {v5}, Lcom/daaw/iz2;->j()I

    move-result v3

    const/4 v9, -0x2

    invoke-virtual {v5, v9}, Lcom/daaw/iz2;->w(I)V

    mul-int/lit8 v3, v3, 0x6

    add-int/2addr v3, v4

    invoke-interface {v2, v5, v3}, Lcom/daaw/ws2;->c(Lcom/daaw/iz2;I)V

    add-int/2addr v10, v7

    add-int/2addr v10, v3

    :goto_5
    iput v10, v0, Lcom/daaw/zt2;->s:I

    iget v2, v0, Lcom/daaw/zt2;->r:I

    add-int v5, v2, v10

    iput v5, v0, Lcom/daaw/zt2;->r:I

    goto :goto_6

    :cond_b
    iput v8, v0, Lcom/daaw/zt2;->s:I

    :goto_6
    iget-object v2, v0, Lcom/daaw/zt2;->q:Lcom/daaw/yt2;

    iget-object v2, v2, Lcom/daaw/yt2;->c:Lcom/daaw/fu2;

    iget v2, v2, Lcom/daaw/fu2;->g:I

    if-ne v2, v7, :cond_c

    add-int/lit8 v5, v5, -0x8

    iput v5, v0, Lcom/daaw/zt2;->r:I

    invoke-virtual {v1, v6, v8}, Lcom/daaw/ms2;->i(IZ)Z

    :cond_c
    const/4 v2, 0x4

    iput v2, v0, Lcom/daaw/zt2;->j:I

    iput v8, v0, Lcom/daaw/zt2;->t:I

    :cond_d
    iget-object v2, v0, Lcom/daaw/zt2;->q:Lcom/daaw/yt2;

    iget-object v3, v2, Lcom/daaw/yt2;->a:Lcom/daaw/hu2;

    iget-object v5, v2, Lcom/daaw/yt2;->c:Lcom/daaw/fu2;

    iget-object v9, v2, Lcom/daaw/yt2;->b:Lcom/daaw/ws2;

    iget v2, v2, Lcom/daaw/yt2;->e:I

    iget v6, v5, Lcom/daaw/fu2;->k:I

    if-nez v6, :cond_e

    :goto_7
    iget v4, v0, Lcom/daaw/zt2;->s:I

    iget v6, v0, Lcom/daaw/zt2;->r:I

    if-ge v4, v6, :cond_10

    sub-int/2addr v6, v4

    invoke-interface {v9, v1, v6, v8}, Lcom/daaw/ws2;->b(Lcom/daaw/ms2;IZ)I

    move-result v4

    iget v6, v0, Lcom/daaw/zt2;->s:I

    add-int/2addr v6, v4

    iput v6, v0, Lcom/daaw/zt2;->s:I

    goto :goto_7

    :cond_e
    iget-object v10, v0, Lcom/daaw/zt2;->c:Lcom/daaw/iz2;

    iget-object v10, v10, Lcom/daaw/iz2;->a:[B

    aput-byte v8, v10, v8

    aput-byte v8, v10, v7

    aput-byte v8, v10, v4

    add-int/lit8 v4, v6, 0x1

    const/4 v11, 0x4

    rsub-int/lit8 v6, v6, 0x4

    :goto_8
    iget v11, v0, Lcom/daaw/zt2;->s:I

    iget v12, v0, Lcom/daaw/zt2;->r:I

    if-ge v11, v12, :cond_10

    iget v11, v0, Lcom/daaw/zt2;->t:I

    if-nez v11, :cond_f

    invoke-virtual {v1, v10, v6, v4, v8}, Lcom/daaw/ms2;->h([BIIZ)Z

    iget-object v11, v0, Lcom/daaw/zt2;->c:Lcom/daaw/iz2;

    invoke-virtual {v11, v8}, Lcom/daaw/iz2;->v(I)V

    iget-object v11, v0, Lcom/daaw/zt2;->c:Lcom/daaw/iz2;

    invoke-virtual {v11}, Lcom/daaw/iz2;->i()I

    move-result v11

    const/4 v12, -0x1

    add-int/2addr v11, v12

    iput v11, v0, Lcom/daaw/zt2;->t:I

    iget-object v11, v0, Lcom/daaw/zt2;->b:Lcom/daaw/iz2;

    invoke-virtual {v11, v8}, Lcom/daaw/iz2;->v(I)V

    iget-object v11, v0, Lcom/daaw/zt2;->b:Lcom/daaw/iz2;

    const/4 v12, 0x4

    invoke-interface {v9, v11, v12}, Lcom/daaw/ws2;->c(Lcom/daaw/iz2;I)V

    iget-object v11, v0, Lcom/daaw/zt2;->c:Lcom/daaw/iz2;

    invoke-interface {v9, v11, v7}, Lcom/daaw/ws2;->c(Lcom/daaw/iz2;I)V

    iget v11, v0, Lcom/daaw/zt2;->s:I

    add-int/lit8 v11, v11, 0x5

    iput v11, v0, Lcom/daaw/zt2;->s:I

    iget v11, v0, Lcom/daaw/zt2;->r:I

    add-int/2addr v11, v6

    iput v11, v0, Lcom/daaw/zt2;->r:I

    goto :goto_8

    :cond_f
    invoke-interface {v9, v1, v11, v8}, Lcom/daaw/ws2;->b(Lcom/daaw/ms2;IZ)I

    move-result v11

    iget v12, v0, Lcom/daaw/zt2;->s:I

    add-int/2addr v12, v11

    iput v12, v0, Lcom/daaw/zt2;->s:I

    iget v12, v0, Lcom/daaw/zt2;->t:I

    sub-int/2addr v12, v11

    iput v12, v0, Lcom/daaw/zt2;->t:I

    goto :goto_8

    :cond_10
    iget-object v1, v3, Lcom/daaw/hu2;->j:[J

    aget-wide v10, v1, v2

    iget-object v1, v3, Lcom/daaw/hu2;->i:[I

    aget v1, v1, v2

    int-to-long v12, v1

    add-long/2addr v10, v12

    const-wide/16 v12, 0x3e8

    mul-long v10, v10, v12

    iget-boolean v1, v3, Lcom/daaw/hu2;->l:Z

    if-eq v7, v1, :cond_11

    const/4 v4, 0x0

    goto :goto_9

    :cond_11
    const/high16 v4, 0x40000000    # 2.0f

    :goto_9
    iget-object v6, v3, Lcom/daaw/hu2;->k:[Z

    aget-boolean v2, v6, v2

    or-int v12, v4, v2

    if-eqz v1, :cond_14

    iget-object v1, v3, Lcom/daaw/hu2;->n:Lcom/daaw/gu2;

    if-nez v1, :cond_12

    iget-object v1, v5, Lcom/daaw/fu2;->h:[Lcom/daaw/gu2;

    iget-object v2, v3, Lcom/daaw/hu2;->a:Lcom/daaw/vt2;

    iget v2, v2, Lcom/daaw/vt2;->a:I

    aget-object v1, v1, v2

    :cond_12
    iget-object v2, v0, Lcom/daaw/zt2;->q:Lcom/daaw/yt2;

    iget-object v4, v2, Lcom/daaw/yt2;->i:Lcom/daaw/gu2;

    if-eq v1, v4, :cond_13

    new-instance v2, Lcom/daaw/vs2;

    iget-object v4, v1, Lcom/daaw/gu2;->b:[B

    invoke-direct {v2, v7, v4}, Lcom/daaw/vs2;-><init>(I[B)V

    goto :goto_a

    :cond_13
    iget-object v2, v2, Lcom/daaw/yt2;->h:Lcom/daaw/vs2;

    :goto_a
    move-object v15, v2

    goto :goto_b

    :cond_14
    const/4 v1, 0x0

    const/4 v15, 0x0

    :goto_b
    iget-object v2, v0, Lcom/daaw/zt2;->q:Lcom/daaw/yt2;

    iput-object v15, v2, Lcom/daaw/yt2;->h:Lcom/daaw/vs2;

    iput-object v1, v2, Lcom/daaw/yt2;->i:Lcom/daaw/gu2;

    iget v13, v0, Lcom/daaw/zt2;->r:I

    const/4 v14, 0x0

    invoke-interface/range {v9 .. v15}, Lcom/daaw/ws2;->d(JIIILcom/daaw/vs2;)V

    iget-object v1, v0, Lcom/daaw/zt2;->i:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_16

    iget-object v1, v0, Lcom/daaw/zt2;->q:Lcom/daaw/yt2;

    iget v2, v1, Lcom/daaw/yt2;->e:I

    add-int/2addr v2, v7

    iput v2, v1, Lcom/daaw/yt2;->e:I

    iget v2, v1, Lcom/daaw/yt2;->f:I

    add-int/2addr v2, v7

    iput v2, v1, Lcom/daaw/yt2;->f:I

    iget-object v3, v3, Lcom/daaw/hu2;->g:[I

    iget v4, v1, Lcom/daaw/yt2;->g:I

    aget v3, v3, v4

    if-ne v2, v3, :cond_15

    add-int/2addr v4, v7

    iput v4, v1, Lcom/daaw/yt2;->g:I

    iput v8, v1, Lcom/daaw/yt2;->f:I

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/daaw/zt2;->q:Lcom/daaw/yt2;

    :cond_15
    const/4 v1, 0x3

    iput v1, v0, Lcom/daaw/zt2;->j:I

    return v8

    :cond_16
    const/4 v1, 0x0

    iget-object v2, v0, Lcom/daaw/zt2;->i:Ljava/util/LinkedList;

    invoke-virtual {v2}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/xt2;

    iget v2, v2, Lcom/daaw/xt2;->a:I

    throw v1

    :cond_17
    iget-object v2, v0, Lcom/daaw/zt2;->a:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    const/4 v3, 0x0

    const/4 v5, 0x0

    :goto_c
    if-ge v3, v2, :cond_19

    iget-object v4, v0, Lcom/daaw/zt2;->a:Landroid/util/SparseArray;

    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/yt2;

    iget-object v4, v4, Lcom/daaw/yt2;->a:Lcom/daaw/hu2;

    iget-boolean v6, v4, Lcom/daaw/hu2;->q:Z

    if-eqz v6, :cond_18

    iget-wide v6, v4, Lcom/daaw/hu2;->c:J

    cmp-long v4, v6, v10

    if-gez v4, :cond_18

    iget-object v4, v0, Lcom/daaw/zt2;->a:Landroid/util/SparseArray;

    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/yt2;

    move-object v5, v4

    move-wide v10, v6

    :cond_18
    add-int/lit8 v3, v3, 0x1

    goto :goto_c

    :cond_19
    if-nez v5, :cond_1a

    const/4 v2, 0x3

    :goto_d
    iput v2, v0, Lcom/daaw/zt2;->j:I

    goto/16 :goto_0

    :cond_1a
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ms2;->d()J

    move-result-wide v2

    sub-long/2addr v10, v2

    long-to-int v2, v10

    if-ltz v2, :cond_1b

    invoke-virtual {v1, v2, v8}, Lcom/daaw/ms2;->i(IZ)Z

    iget-object v2, v5, Lcom/daaw/yt2;->a:Lcom/daaw/hu2;

    iget-object v3, v2, Lcom/daaw/hu2;->p:Lcom/daaw/iz2;

    iget-object v3, v3, Lcom/daaw/iz2;->a:[B

    iget v4, v2, Lcom/daaw/hu2;->o:I

    invoke-virtual {v1, v3, v8, v4, v8}, Lcom/daaw/ms2;->h([BIIZ)Z

    iget-object v3, v2, Lcom/daaw/hu2;->p:Lcom/daaw/iz2;

    invoke-virtual {v3, v8}, Lcom/daaw/iz2;->v(I)V

    iput-boolean v8, v2, Lcom/daaw/hu2;->q:Z

    goto/16 :goto_0

    :cond_1b
    new-instance v1, Lcom/daaw/eq2;

    const-string v2, "Offset to encryption data was negative."

    invoke-direct {v1, v2}, Lcom/daaw/eq2;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1c
    iget-wide v2, v0, Lcom/daaw/zt2;->l:J

    long-to-int v3, v2

    iget v2, v0, Lcom/daaw/zt2;->m:I

    sub-int/2addr v3, v2

    iget-object v2, v0, Lcom/daaw/zt2;->n:Lcom/daaw/iz2;

    if-eqz v2, :cond_22

    iget-object v2, v2, Lcom/daaw/iz2;->a:[B

    invoke-virtual {v1, v2, v6, v3, v8}, Lcom/daaw/ms2;->h([BIIZ)Z

    new-instance v2, Lcom/daaw/mt2;

    iget v3, v0, Lcom/daaw/zt2;->k:I

    iget-object v5, v0, Lcom/daaw/zt2;->n:Lcom/daaw/iz2;

    invoke-direct {v2, v3, v5}, Lcom/daaw/mt2;-><init>(ILcom/daaw/iz2;)V

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ms2;->d()J

    move-result-wide v9

    iget-object v3, v0, Lcom/daaw/zt2;->h:Ljava/util/Stack;

    invoke-virtual {v3}, Ljava/util/Stack;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1d

    iget-object v3, v0, Lcom/daaw/zt2;->h:Ljava/util/Stack;

    invoke-virtual {v3}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/lt2;

    invoke-virtual {v3, v2}, Lcom/daaw/lt2;->g(Lcom/daaw/mt2;)V

    goto/16 :goto_10

    :cond_1d
    iget v3, v2, Lcom/daaw/nt2;->a:I

    sget v5, Lcom/daaw/nt2;->B:I

    if-ne v3, v5, :cond_21

    iget-object v2, v2, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    invoke-virtual {v2, v6}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {v2}, Lcom/daaw/iz2;->e()I

    move-result v3

    const/4 v5, 0x4

    invoke-virtual {v2, v5}, Lcom/daaw/iz2;->w(I)V

    invoke-virtual {v2}, Lcom/daaw/iz2;->m()J

    move-result-wide v5

    invoke-static {v3}, Lcom/daaw/nt2;->b(I)I

    move-result v3

    if-nez v3, :cond_1e

    invoke-virtual {v2}, Lcom/daaw/iz2;->m()J

    move-result-wide v11

    invoke-virtual {v2}, Lcom/daaw/iz2;->m()J

    move-result-wide v13

    goto :goto_e

    :cond_1e
    invoke-virtual {v2}, Lcom/daaw/iz2;->n()J

    move-result-wide v11

    invoke-virtual {v2}, Lcom/daaw/iz2;->n()J

    move-result-wide v13

    :goto_e
    add-long/2addr v9, v13

    move-wide/from16 v18, v11

    const-wide/32 v13, 0xf4240

    move-wide/from16 v11, v18

    move-wide v15, v5

    invoke-static/range {v11 .. v16}, Lcom/daaw/pz2;->j(JJJ)J

    move-result-wide v20

    invoke-virtual {v2, v4}, Lcom/daaw/iz2;->w(I)V

    invoke-virtual {v2}, Lcom/daaw/iz2;->j()I

    move-result v3

    new-array v4, v3, [I

    new-array v15, v3, [J

    new-array v13, v3, [J

    new-array v14, v3, [J

    move-wide/from16 v11, v20

    :goto_f
    if-ge v8, v3, :cond_20

    invoke-virtual {v2}, Lcom/daaw/iz2;->e()I

    move-result v16

    const/high16 v17, -0x80000000

    and-int v17, v16, v17

    if-nez v17, :cond_1f

    invoke-virtual {v2}, Lcom/daaw/iz2;->m()J

    move-result-wide v22

    const v17, 0x7fffffff

    and-int v16, v16, v17

    aput v16, v4, v8

    aput-wide v9, v15, v8

    aput-wide v11, v14, v8

    add-long v18, v18, v22

    const-wide/32 v16, 0xf4240

    move-wide/from16 v11, v18

    move/from16 v22, v3

    move-object v7, v13

    move-object v3, v14

    move-wide/from16 v13, v16

    move-object v1, v15

    move-wide v15, v5

    invoke-static/range {v11 .. v16}, Lcom/daaw/pz2;->j(JJJ)J

    move-result-wide v11

    aget-wide v13, v3, v8

    sub-long v13, v11, v13

    aput-wide v13, v7, v8

    const/4 v13, 0x4

    invoke-virtual {v2, v13}, Lcom/daaw/iz2;->w(I)V

    aget v14, v4, v8

    int-to-long v14, v14

    add-long/2addr v9, v14

    add-int/lit8 v8, v8, 0x1

    move-object v15, v1

    move-object v14, v3

    move-object v13, v7

    move/from16 v3, v22

    const/4 v7, 0x1

    move-object/from16 v1, p1

    goto :goto_f

    :cond_1f
    new-instance v1, Lcom/daaw/eq2;

    const-string v2, "Unhandled indirect reference"

    invoke-direct {v1, v2}, Lcom/daaw/eq2;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_20
    move-object v7, v13

    move-object v3, v14

    move-object v1, v15

    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    new-instance v5, Lcom/daaw/ls2;

    invoke-direct {v5, v4, v1, v7, v3}, Lcom/daaw/ls2;-><init>([I[J[J[J)V

    invoke-static {v2, v5}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v1

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    iget-object v2, v0, Lcom/daaw/zt2;->u:Lcom/daaw/os2;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/us2;

    invoke-interface {v2, v1}, Lcom/daaw/os2;->b(Lcom/daaw/us2;)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/daaw/zt2;->v:Z

    :cond_21
    move-object/from16 v1, p1

    goto :goto_10

    :cond_22
    invoke-virtual {v1, v3, v8}, Lcom/daaw/ms2;->i(IZ)Z

    :goto_10
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ms2;->d()J

    move-result-wide v2

    :goto_11
    invoke-virtual {v0, v2, v3}, Lcom/daaw/zt2;->h(J)V

    goto/16 :goto_0

    :cond_23
    iget v2, v0, Lcom/daaw/zt2;->m:I

    if-nez v2, :cond_25

    iget-object v2, v0, Lcom/daaw/zt2;->f:Lcom/daaw/iz2;

    iget-object v2, v2, Lcom/daaw/iz2;->a:[B

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v8, v6, v3}, Lcom/daaw/ms2;->h([BIIZ)Z

    move-result v2

    if-nez v2, :cond_24

    const/4 v2, -0x1

    return v2

    :cond_24
    iput v6, v0, Lcom/daaw/zt2;->m:I

    iget-object v2, v0, Lcom/daaw/zt2;->f:Lcom/daaw/iz2;

    invoke-virtual {v2, v8}, Lcom/daaw/iz2;->v(I)V

    iget-object v2, v0, Lcom/daaw/zt2;->f:Lcom/daaw/iz2;

    invoke-virtual {v2}, Lcom/daaw/iz2;->m()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/daaw/zt2;->l:J

    iget-object v2, v0, Lcom/daaw/zt2;->f:Lcom/daaw/iz2;

    invoke-virtual {v2}, Lcom/daaw/iz2;->e()I

    move-result v2

    iput v2, v0, Lcom/daaw/zt2;->k:I

    :cond_25
    iget-wide v2, v0, Lcom/daaw/zt2;->l:J

    const-wide/16 v9, 0x1

    cmp-long v5, v2, v9

    if-nez v5, :cond_26

    iget-object v2, v0, Lcom/daaw/zt2;->f:Lcom/daaw/iz2;

    iget-object v2, v2, Lcom/daaw/iz2;->a:[B

    invoke-virtual {v1, v2, v6, v6, v8}, Lcom/daaw/ms2;->h([BIIZ)Z

    iget v2, v0, Lcom/daaw/zt2;->m:I

    add-int/2addr v2, v6

    iput v2, v0, Lcom/daaw/zt2;->m:I

    iget-object v2, v0, Lcom/daaw/zt2;->f:Lcom/daaw/iz2;

    invoke-virtual {v2}, Lcom/daaw/iz2;->n()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/daaw/zt2;->l:J

    :cond_26
    iget v5, v0, Lcom/daaw/zt2;->m:I

    int-to-long v9, v5

    cmp-long v5, v2, v9

    if-ltz v5, :cond_31

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ms2;->d()J

    move-result-wide v2

    sub-long/2addr v2, v9

    iget v5, v0, Lcom/daaw/zt2;->k:I

    sget v7, Lcom/daaw/nt2;->L:I

    if-ne v5, v7, :cond_27

    iget-object v5, v0, Lcom/daaw/zt2;->a:Landroid/util/SparseArray;

    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v5

    const/4 v7, 0x0

    :goto_12
    if-ge v7, v5, :cond_27

    iget-object v9, v0, Lcom/daaw/zt2;->a:Landroid/util/SparseArray;

    invoke-virtual {v9, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/daaw/yt2;

    iget-object v9, v9, Lcom/daaw/yt2;->a:Lcom/daaw/hu2;

    iput-wide v2, v9, Lcom/daaw/hu2;->c:J

    iput-wide v2, v9, Lcom/daaw/hu2;->b:J

    add-int/lit8 v7, v7, 0x1

    goto :goto_12

    :cond_27
    iget v5, v0, Lcom/daaw/zt2;->k:I

    sget v7, Lcom/daaw/nt2;->i:I

    if-ne v5, v7, :cond_29

    const/4 v7, 0x0

    iput-object v7, v0, Lcom/daaw/zt2;->q:Lcom/daaw/yt2;

    iget-wide v5, v0, Lcom/daaw/zt2;->l:J

    add-long/2addr v2, v5

    iput-wide v2, v0, Lcom/daaw/zt2;->o:J

    iget-boolean v2, v0, Lcom/daaw/zt2;->v:Z

    if-nez v2, :cond_28

    iget-object v2, v0, Lcom/daaw/zt2;->u:Lcom/daaw/os2;

    new-instance v3, Lcom/daaw/ts2;

    iget-wide v5, v0, Lcom/daaw/zt2;->p:J

    invoke-direct {v3, v5, v6}, Lcom/daaw/ts2;-><init>(J)V

    invoke-interface {v2, v3}, Lcom/daaw/os2;->b(Lcom/daaw/us2;)V

    const/4 v2, 0x1

    iput-boolean v2, v0, Lcom/daaw/zt2;->v:Z

    :cond_28
    iput v4, v0, Lcom/daaw/zt2;->j:I

    goto/16 :goto_0

    :cond_29
    sget v2, Lcom/daaw/nt2;->C:I

    if-eq v5, v2, :cond_30

    sget v2, Lcom/daaw/nt2;->E:I

    if-eq v5, v2, :cond_30

    sget v2, Lcom/daaw/nt2;->F:I

    if-eq v5, v2, :cond_30

    sget v2, Lcom/daaw/nt2;->G:I

    if-eq v5, v2, :cond_30

    sget v2, Lcom/daaw/nt2;->H:I

    if-eq v5, v2, :cond_30

    sget v2, Lcom/daaw/nt2;->L:I

    if-eq v5, v2, :cond_30

    sget v2, Lcom/daaw/nt2;->M:I

    if-eq v5, v2, :cond_30

    sget v2, Lcom/daaw/nt2;->N:I

    if-eq v5, v2, :cond_30

    sget v2, Lcom/daaw/nt2;->Q:I

    if-ne v5, v2, :cond_2a

    goto/16 :goto_15

    :cond_2a
    sget v2, Lcom/daaw/nt2;->T:I

    const-wide/32 v3, 0x7fffffff

    if-eq v5, v2, :cond_2d

    sget v2, Lcom/daaw/nt2;->S:I

    if-eq v5, v2, :cond_2d

    sget v2, Lcom/daaw/nt2;->D:I

    if-eq v5, v2, :cond_2d

    sget v2, Lcom/daaw/nt2;->B:I

    if-eq v5, v2, :cond_2d

    sget v2, Lcom/daaw/nt2;->U:I

    if-eq v5, v2, :cond_2d

    sget v2, Lcom/daaw/nt2;->x:I

    if-eq v5, v2, :cond_2d

    sget v2, Lcom/daaw/nt2;->y:I

    if-eq v5, v2, :cond_2d

    sget v2, Lcom/daaw/nt2;->P:I

    if-eq v5, v2, :cond_2d

    sget v2, Lcom/daaw/nt2;->z:I

    if-eq v5, v2, :cond_2d

    sget v2, Lcom/daaw/nt2;->A:I

    if-eq v5, v2, :cond_2d

    sget v2, Lcom/daaw/nt2;->V:I

    if-eq v5, v2, :cond_2d

    sget v2, Lcom/daaw/nt2;->d0:I

    if-eq v5, v2, :cond_2d

    sget v2, Lcom/daaw/nt2;->e0:I

    if-eq v5, v2, :cond_2d

    sget v2, Lcom/daaw/nt2;->i0:I

    if-eq v5, v2, :cond_2d

    sget v2, Lcom/daaw/nt2;->h0:I

    if-eq v5, v2, :cond_2d

    sget v2, Lcom/daaw/nt2;->f0:I

    if-eq v5, v2, :cond_2d

    sget v2, Lcom/daaw/nt2;->g0:I

    if-eq v5, v2, :cond_2d

    sget v2, Lcom/daaw/nt2;->R:I

    if-eq v5, v2, :cond_2d

    sget v2, Lcom/daaw/nt2;->O:I

    if-eq v5, v2, :cond_2d

    sget v2, Lcom/daaw/nt2;->G0:I

    if-ne v5, v2, :cond_2b

    goto :goto_13

    :cond_2b
    iget-wide v5, v0, Lcom/daaw/zt2;->l:J

    cmp-long v2, v5, v3

    if-gtz v2, :cond_2c

    const/4 v2, 0x0

    iput-object v2, v0, Lcom/daaw/zt2;->n:Lcom/daaw/iz2;

    goto :goto_14

    :cond_2c
    new-instance v1, Lcom/daaw/eq2;

    const-string v2, "Skipping atom with length > 2147483647 (unsupported)."

    invoke-direct {v1, v2}, Lcom/daaw/eq2;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2d
    :goto_13
    iget v2, v0, Lcom/daaw/zt2;->m:I

    if-ne v2, v6, :cond_2f

    iget-wide v9, v0, Lcom/daaw/zt2;->l:J

    cmp-long v2, v9, v3

    if-gtz v2, :cond_2e

    new-instance v2, Lcom/daaw/iz2;

    long-to-int v3, v9

    invoke-direct {v2, v3}, Lcom/daaw/iz2;-><init>(I)V

    iput-object v2, v0, Lcom/daaw/zt2;->n:Lcom/daaw/iz2;

    iget-object v3, v0, Lcom/daaw/zt2;->f:Lcom/daaw/iz2;

    iget-object v3, v3, Lcom/daaw/iz2;->a:[B

    iget-object v2, v2, Lcom/daaw/iz2;->a:[B

    invoke-static {v3, v8, v2, v8, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_14
    const/4 v2, 0x1

    goto/16 :goto_d

    :cond_2e
    new-instance v1, Lcom/daaw/eq2;

    const-string v2, "Leaf atom with length > 2147483647 (unsupported)."

    invoke-direct {v1, v2}, Lcom/daaw/eq2;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2f
    new-instance v1, Lcom/daaw/eq2;

    const-string v2, "Leaf atom defines extended atom size (unsupported)."

    invoke-direct {v1, v2}, Lcom/daaw/eq2;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_30
    :goto_15
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ms2;->d()J

    move-result-wide v2

    iget-wide v6, v0, Lcom/daaw/zt2;->l:J

    add-long/2addr v2, v6

    const-wide/16 v6, -0x8

    add-long/2addr v2, v6

    iget-object v4, v0, Lcom/daaw/zt2;->h:Ljava/util/Stack;

    new-instance v6, Lcom/daaw/lt2;

    invoke-direct {v6, v5, v2, v3}, Lcom/daaw/lt2;-><init>(IJ)V

    invoke-virtual {v4, v6}, Ljava/util/Stack;->add(Ljava/lang/Object;)Z

    iget-wide v4, v0, Lcom/daaw/zt2;->l:J

    iget v6, v0, Lcom/daaw/zt2;->m:I

    int-to-long v6, v6

    cmp-long v8, v4, v6

    if-nez v8, :cond_3

    goto/16 :goto_11

    :cond_31
    new-instance v1, Lcom/daaw/eq2;

    const-string v2, "Atom size less than header length (unsupported)."

    invoke-direct {v1, v2}, Lcom/daaw/eq2;-><init>(Ljava/lang/String;)V

    goto :goto_17

    :goto_16
    throw v1

    :goto_17
    goto :goto_16
.end method

.method public final f()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/zt2;->j:I

    iput v0, p0, Lcom/daaw/zt2;->m:I

    return-void
.end method

.method public final h(J)V
    .locals 49

    :cond_0
    move-object/from16 v0, p0

    :cond_1
    :goto_0
    iget-object v1, v0, Lcom/daaw/zt2;->h:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/Stack;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_48

    iget-object v1, v0, Lcom/daaw/zt2;->h:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/lt2;

    iget-wide v1, v1, Lcom/daaw/lt2;->P0:J

    cmp-long v3, v1, p1

    if-nez v3, :cond_48

    iget-object v1, v0, Lcom/daaw/zt2;->h:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/lt2;

    iget v2, v1, Lcom/daaw/nt2;->a:I

    sget v3, Lcom/daaw/nt2;->C:I

    const/16 v4, 0xc

    const/16 v5, 0x8

    const/4 v7, 0x1

    if-ne v2, v3, :cond_b

    iget-object v2, v1, Lcom/daaw/lt2;->Q0:Ljava/util/List;

    invoke-static {v2}, Lcom/daaw/zt2;->a(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzavc;

    move-result-object v2

    sget v3, Lcom/daaw/nt2;->N:I

    invoke-virtual {v1, v3}, Lcom/daaw/lt2;->d(I)Lcom/daaw/lt2;

    move-result-object v3

    new-instance v14, Landroid/util/SparseArray;

    invoke-direct {v14}, Landroid/util/SparseArray;-><init>()V

    iget-object v8, v3, Lcom/daaw/lt2;->Q0:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-wide v15, v9

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_5

    iget-object v10, v3, Lcom/daaw/lt2;->Q0:Ljava/util/List;

    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/daaw/mt2;

    iget v11, v10, Lcom/daaw/nt2;->a:I

    sget v12, Lcom/daaw/nt2;->z:I

    if-ne v11, v12, :cond_2

    iget-object v10, v10, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    invoke-virtual {v10, v4}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {v10}, Lcom/daaw/iz2;->e()I

    move-result v11

    invoke-virtual {v10}, Lcom/daaw/iz2;->i()I

    move-result v12

    invoke-virtual {v10}, Lcom/daaw/iz2;->i()I

    move-result v13

    invoke-virtual {v10}, Lcom/daaw/iz2;->i()I

    move-result v6

    invoke-virtual {v10}, Lcom/daaw/iz2;->e()I

    move-result v10

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    new-instance v4, Lcom/daaw/vt2;

    add-int/lit8 v12, v12, -0x1

    invoke-direct {v4, v12, v13, v6, v10}, Lcom/daaw/vt2;-><init>(IIII)V

    invoke-static {v11, v4}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v4

    iget-object v6, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, Lcom/daaw/vt2;

    invoke-virtual {v14, v6, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_3

    :cond_2
    sget v4, Lcom/daaw/nt2;->O:I

    if-ne v11, v4, :cond_4

    iget-object v4, v10, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    invoke-virtual {v4, v5}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {v4}, Lcom/daaw/iz2;->e()I

    move-result v6

    invoke-static {v6}, Lcom/daaw/nt2;->b(I)I

    move-result v6

    if-nez v6, :cond_3

    invoke-virtual {v4}, Lcom/daaw/iz2;->m()J

    move-result-wide v10

    goto :goto_2

    :cond_3
    invoke-virtual {v4}, Lcom/daaw/iz2;->n()J

    move-result-wide v10

    :goto_2
    move-wide v15, v10

    :cond_4
    :goto_3
    add-int/lit8 v9, v9, 0x1

    const/16 v4, 0xc

    goto :goto_1

    :cond_5
    new-instance v3, Landroid/util/SparseArray;

    invoke-direct {v3}, Landroid/util/SparseArray;-><init>()V

    iget-object v4, v1, Lcom/daaw/lt2;->R0:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_4
    if-ge v5, v4, :cond_7

    iget-object v6, v1, Lcom/daaw/lt2;->R0:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Lcom/daaw/lt2;

    iget v6, v8, Lcom/daaw/nt2;->a:I

    sget v9, Lcom/daaw/nt2;->E:I

    if-ne v6, v9, :cond_6

    sget v6, Lcom/daaw/nt2;->D:I

    invoke-virtual {v1, v6}, Lcom/daaw/lt2;->e(I)Lcom/daaw/mt2;

    move-result-object v9

    const/4 v13, 0x0

    move-wide v10, v15

    move-object v12, v2

    invoke-static/range {v8 .. v13}, Lcom/daaw/ut2;->a(Lcom/daaw/lt2;Lcom/daaw/mt2;JLcom/google/android/gms/internal/ads/zzavc;Z)Lcom/daaw/fu2;

    move-result-object v6

    if-eqz v6, :cond_6

    iget v8, v6, Lcom/daaw/fu2;->a:I

    invoke-virtual {v3, v8, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_6
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_7
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v1

    iget-object v2, v0, Lcom/daaw/zt2;->a:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-nez v2, :cond_9

    const/4 v6, 0x0

    :goto_5
    if-ge v6, v1, :cond_8

    invoke-virtual {v3, v6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/fu2;

    new-instance v4, Lcom/daaw/yt2;

    iget-object v5, v0, Lcom/daaw/zt2;->u:Lcom/daaw/os2;

    iget v7, v2, Lcom/daaw/fu2;->b:I

    invoke-interface {v5, v6, v7}, Lcom/daaw/os2;->h(II)Lcom/daaw/ws2;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/daaw/yt2;-><init>(Lcom/daaw/ws2;)V

    iget v5, v2, Lcom/daaw/fu2;->a:I

    invoke-virtual {v14, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/vt2;

    invoke-virtual {v4, v2, v5}, Lcom/daaw/yt2;->a(Lcom/daaw/fu2;Lcom/daaw/vt2;)V

    iget-object v5, v0, Lcom/daaw/zt2;->a:Landroid/util/SparseArray;

    iget v7, v2, Lcom/daaw/fu2;->a:I

    invoke-virtual {v5, v7, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-wide v4, v0, Lcom/daaw/zt2;->p:J

    iget-wide v7, v2, Lcom/daaw/fu2;->e:J

    invoke-static {v4, v5, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iput-wide v4, v0, Lcom/daaw/zt2;->p:J

    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    :cond_8
    iget-object v1, v0, Lcom/daaw/zt2;->u:Lcom/daaw/os2;

    invoke-interface {v1}, Lcom/daaw/os2;->zzb()V

    goto/16 :goto_0

    :cond_9
    iget-object v2, v0, Lcom/daaw/zt2;->a:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ne v2, v1, :cond_a

    goto :goto_6

    :cond_a
    const/4 v7, 0x0

    :goto_6
    invoke-static {v7}, Lcom/daaw/az2;->e(Z)V

    const/4 v6, 0x0

    :goto_7
    if-ge v6, v1, :cond_1

    invoke-virtual {v3, v6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/fu2;

    iget-object v4, v0, Lcom/daaw/zt2;->a:Landroid/util/SparseArray;

    iget v5, v2, Lcom/daaw/fu2;->a:I

    invoke-virtual {v4, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/yt2;

    iget v5, v2, Lcom/daaw/fu2;->a:I

    invoke-virtual {v14, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/vt2;

    invoke-virtual {v4, v2, v5}, Lcom/daaw/yt2;->a(Lcom/daaw/fu2;Lcom/daaw/vt2;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    :cond_b
    sget v3, Lcom/daaw/nt2;->L:I

    if-ne v2, v3, :cond_46

    iget-object v2, v0, Lcom/daaw/zt2;->a:Landroid/util/SparseArray;

    iget-object v3, v0, Lcom/daaw/zt2;->g:[B

    iget-object v4, v1, Lcom/daaw/lt2;->R0:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    const/4 v6, 0x0

    :goto_8
    if-ge v6, v4, :cond_45

    iget-object v8, v1, Lcom/daaw/lt2;->R0:Ljava/util/List;

    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/daaw/lt2;

    iget v9, v8, Lcom/daaw/nt2;->a:I

    sget v10, Lcom/daaw/nt2;->M:I

    if-ne v9, v10, :cond_44

    sget v9, Lcom/daaw/nt2;->y:I

    invoke-virtual {v8, v9}, Lcom/daaw/lt2;->e(I)Lcom/daaw/mt2;

    move-result-object v9

    iget-object v9, v9, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    invoke-virtual {v9, v5}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {v9}, Lcom/daaw/iz2;->e()I

    move-result v10

    invoke-static {v10}, Lcom/daaw/nt2;->a(I)I

    move-result v10

    invoke-virtual {v9}, Lcom/daaw/iz2;->e()I

    move-result v11

    invoke-virtual {v2, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/daaw/yt2;

    if-nez v11, :cond_c

    const/4 v11, 0x0

    goto :goto_d

    :cond_c
    and-int/lit8 v12, v10, 0x1

    if-eqz v12, :cond_d

    invoke-virtual {v9}, Lcom/daaw/iz2;->n()J

    move-result-wide v12

    iget-object v14, v11, Lcom/daaw/yt2;->a:Lcom/daaw/hu2;

    iput-wide v12, v14, Lcom/daaw/hu2;->b:J

    iput-wide v12, v14, Lcom/daaw/hu2;->c:J

    :cond_d
    iget-object v12, v11, Lcom/daaw/yt2;->d:Lcom/daaw/vt2;

    and-int/lit8 v13, v10, 0x2

    if-eqz v13, :cond_e

    invoke-virtual {v9}, Lcom/daaw/iz2;->i()I

    move-result v13

    add-int/lit8 v13, v13, -0x1

    goto :goto_9

    :cond_e
    iget v13, v12, Lcom/daaw/vt2;->a:I

    :goto_9
    and-int/lit8 v14, v10, 0x8

    if-eqz v14, :cond_f

    invoke-virtual {v9}, Lcom/daaw/iz2;->i()I

    move-result v14

    goto :goto_a

    :cond_f
    iget v14, v12, Lcom/daaw/vt2;->b:I

    :goto_a
    and-int/lit8 v15, v10, 0x10

    if-eqz v15, :cond_10

    invoke-virtual {v9}, Lcom/daaw/iz2;->i()I

    move-result v15

    goto :goto_b

    :cond_10
    iget v15, v12, Lcom/daaw/vt2;->c:I

    :goto_b
    and-int/lit8 v10, v10, 0x20

    if-eqz v10, :cond_11

    invoke-virtual {v9}, Lcom/daaw/iz2;->i()I

    move-result v9

    goto :goto_c

    :cond_11
    iget v9, v12, Lcom/daaw/vt2;->d:I

    :goto_c
    iget-object v10, v11, Lcom/daaw/yt2;->a:Lcom/daaw/hu2;

    new-instance v12, Lcom/daaw/vt2;

    invoke-direct {v12, v13, v14, v15, v9}, Lcom/daaw/vt2;-><init>(IIII)V

    iput-object v12, v10, Lcom/daaw/hu2;->a:Lcom/daaw/vt2;

    :goto_d
    if-nez v11, :cond_12

    goto/16 :goto_27

    :cond_12
    iget-object v9, v11, Lcom/daaw/yt2;->a:Lcom/daaw/hu2;

    iget-wide v12, v9, Lcom/daaw/hu2;->r:J

    invoke-virtual {v11}, Lcom/daaw/yt2;->b()V

    sget v10, Lcom/daaw/nt2;->x:I

    invoke-virtual {v8, v10}, Lcom/daaw/lt2;->e(I)Lcom/daaw/mt2;

    move-result-object v14

    if-eqz v14, :cond_14

    invoke-virtual {v8, v10}, Lcom/daaw/lt2;->e(I)Lcom/daaw/mt2;

    move-result-object v10

    iget-object v10, v10, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    invoke-virtual {v10, v5}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {v10}, Lcom/daaw/iz2;->e()I

    move-result v12

    invoke-static {v12}, Lcom/daaw/nt2;->b(I)I

    move-result v12

    if-ne v12, v7, :cond_13

    invoke-virtual {v10}, Lcom/daaw/iz2;->n()J

    move-result-wide v12

    goto :goto_e

    :cond_13
    invoke-virtual {v10}, Lcom/daaw/iz2;->m()J

    move-result-wide v12

    :cond_14
    :goto_e
    iget-object v10, v8, Lcom/daaw/lt2;->Q0:Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v14

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v15, 0x0

    :goto_f
    if-ge v15, v14, :cond_17

    invoke-interface {v10, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v19, v2

    move-object/from16 v2, v18

    check-cast v2, Lcom/daaw/mt2;

    move/from16 v18, v4

    iget v4, v2, Lcom/daaw/nt2;->a:I

    move-wide/from16 v20, v12

    sget v12, Lcom/daaw/nt2;->A:I

    if-ne v4, v12, :cond_15

    iget-object v2, v2, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    const/16 v4, 0xc

    invoke-virtual {v2, v4}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {v2}, Lcom/daaw/iz2;->i()I

    move-result v2

    if-lez v2, :cond_16

    add-int/2addr v5, v2

    add-int/lit8 v7, v7, 0x1

    goto :goto_10

    :cond_15
    const/16 v4, 0xc

    :cond_16
    :goto_10
    add-int/lit8 v15, v15, 0x1

    move/from16 v4, v18

    move-object/from16 v2, v19

    move-wide/from16 v12, v20

    goto :goto_f

    :cond_17
    move-object/from16 v19, v2

    move/from16 v18, v4

    move-wide/from16 v20, v12

    const/4 v2, 0x0

    const/16 v4, 0xc

    iput v2, v11, Lcom/daaw/yt2;->g:I

    iput v2, v11, Lcom/daaw/yt2;->f:I

    iput v2, v11, Lcom/daaw/yt2;->e:I

    iget-object v2, v11, Lcom/daaw/yt2;->a:Lcom/daaw/hu2;

    iput v7, v2, Lcom/daaw/hu2;->d:I

    iput v5, v2, Lcom/daaw/hu2;->e:I

    iget-object v12, v2, Lcom/daaw/hu2;->g:[I

    if-eqz v12, :cond_18

    array-length v12, v12

    if-ge v12, v7, :cond_19

    :cond_18
    new-array v12, v7, [J

    iput-object v12, v2, Lcom/daaw/hu2;->f:[J

    new-array v7, v7, [I

    iput-object v7, v2, Lcom/daaw/hu2;->g:[I

    :cond_19
    iget-object v7, v2, Lcom/daaw/hu2;->h:[I

    if-eqz v7, :cond_1a

    array-length v7, v7

    if-ge v7, v5, :cond_1b

    :cond_1a
    mul-int/lit8 v5, v5, 0x7d

    div-int/lit8 v5, v5, 0x64

    new-array v7, v5, [I

    iput-object v7, v2, Lcom/daaw/hu2;->h:[I

    new-array v7, v5, [I

    iput-object v7, v2, Lcom/daaw/hu2;->i:[I

    new-array v7, v5, [J

    iput-object v7, v2, Lcom/daaw/hu2;->j:[J

    new-array v7, v5, [Z

    iput-object v7, v2, Lcom/daaw/hu2;->k:[Z

    new-array v5, v5, [Z

    iput-object v5, v2, Lcom/daaw/hu2;->m:[Z

    :cond_1b
    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    :goto_11
    if-ge v2, v14, :cond_2b

    invoke-interface {v10, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v4, v17

    check-cast v4, Lcom/daaw/mt2;

    iget v15, v4, Lcom/daaw/nt2;->a:I

    sget v12, Lcom/daaw/nt2;->A:I

    if-ne v15, v12, :cond_2a

    add-int/lit8 v12, v7, 0x1

    iget-object v4, v4, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    const/16 v13, 0x8

    invoke-virtual {v4, v13}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {v4}, Lcom/daaw/iz2;->e()I

    move-result v13

    invoke-static {v13}, Lcom/daaw/nt2;->a(I)I

    move-result v13

    iget-object v15, v11, Lcom/daaw/yt2;->c:Lcom/daaw/fu2;

    move-object/from16 v24, v10

    iget-object v10, v11, Lcom/daaw/yt2;->a:Lcom/daaw/hu2;

    move/from16 v25, v12

    iget-object v12, v10, Lcom/daaw/hu2;->a:Lcom/daaw/vt2;

    move/from16 v26, v14

    iget-object v14, v10, Lcom/daaw/hu2;->g:[I

    invoke-virtual {v4}, Lcom/daaw/iz2;->i()I

    move-result v27

    aput v27, v14, v7

    iget-object v14, v10, Lcom/daaw/hu2;->f:[J

    move-object/from16 v27, v1

    iget-wide v0, v10, Lcom/daaw/hu2;->b:J

    aput-wide v0, v14, v7

    and-int/lit8 v28, v13, 0x1

    if-eqz v28, :cond_1c

    move/from16 v28, v6

    invoke-virtual {v4}, Lcom/daaw/iz2;->e()I

    move-result v6

    move-object/from16 v29, v8

    move-object/from16 v30, v9

    int-to-long v8, v6

    add-long/2addr v0, v8

    aput-wide v0, v14, v7

    goto :goto_12

    :cond_1c
    move/from16 v28, v6

    move-object/from16 v29, v8

    move-object/from16 v30, v9

    :goto_12
    and-int/lit8 v0, v13, 0x4

    if-eqz v0, :cond_1d

    const/4 v0, 0x1

    goto :goto_13

    :cond_1d
    const/4 v0, 0x0

    :goto_13
    iget v1, v12, Lcom/daaw/vt2;->d:I

    if-eqz v0, :cond_1e

    invoke-virtual {v4}, Lcom/daaw/iz2;->i()I

    move-result v1

    :cond_1e
    and-int/lit16 v6, v13, 0x100

    and-int/lit16 v8, v13, 0x200

    and-int/lit16 v9, v13, 0x400

    and-int/lit16 v13, v13, 0x800

    iget-object v14, v15, Lcom/daaw/fu2;->i:[J

    move/from16 v31, v1

    if-eqz v14, :cond_1f

    array-length v1, v14

    move-object/from16 v32, v3

    const/4 v3, 0x1

    if-ne v1, v3, :cond_20

    const/4 v1, 0x0

    aget-wide v33, v14, v1

    const-wide/16 v22, 0x0

    cmp-long v3, v33, v22

    if-nez v3, :cond_20

    iget-object v3, v15, Lcom/daaw/fu2;->j:[J

    aget-wide v33, v3, v1

    const-wide/16 v35, 0x3e8

    move v3, v2

    iget-wide v1, v15, Lcom/daaw/fu2;->c:J

    move-wide/from16 v37, v1

    invoke-static/range {v33 .. v38}, Lcom/daaw/pz2;->j(JJJ)J

    move-result-wide v1

    move-wide/from16 v22, v1

    goto :goto_14

    :cond_1f
    move-object/from16 v32, v3

    :cond_20
    move v3, v2

    const-wide/16 v22, 0x0

    :goto_14
    iget-object v1, v10, Lcom/daaw/hu2;->h:[I

    iget-object v2, v10, Lcom/daaw/hu2;->i:[I

    iget-object v14, v10, Lcom/daaw/hu2;->j:[J

    move-object/from16 v33, v11

    iget-object v11, v10, Lcom/daaw/hu2;->k:[Z

    move/from16 v34, v3

    iget-object v3, v10, Lcom/daaw/hu2;->g:[I

    aget v3, v3, v7

    add-int/2addr v3, v5

    move-object/from16 v41, v14

    iget-wide v14, v15, Lcom/daaw/fu2;->c:J

    move-object/from16 v42, v1

    move-object/from16 v43, v2

    if-lez v7, :cond_21

    iget-wide v1, v10, Lcom/daaw/hu2;->r:J

    goto :goto_15

    :cond_21
    move-wide/from16 v1, v20

    :goto_15
    if-ge v5, v3, :cond_29

    if-eqz v6, :cond_22

    invoke-virtual {v4}, Lcom/daaw/iz2;->i()I

    move-result v7

    goto :goto_16

    :cond_22
    iget v7, v12, Lcom/daaw/vt2;->b:I

    :goto_16
    if-eqz v8, :cond_23

    invoke-virtual {v4}, Lcom/daaw/iz2;->i()I

    move-result v35

    move/from16 v44, v3

    move/from16 v3, v35

    goto :goto_17

    :cond_23
    move/from16 v44, v3

    iget v3, v12, Lcom/daaw/vt2;->c:I

    :goto_17
    if-nez v5, :cond_25

    if-eqz v0, :cond_24

    move/from16 v45, v0

    move/from16 v0, v31

    const/4 v5, 0x0

    goto :goto_18

    :cond_24
    const/4 v5, 0x0

    :cond_25
    if-eqz v9, :cond_26

    invoke-virtual {v4}, Lcom/daaw/iz2;->e()I

    move-result v35

    move/from16 v45, v0

    move/from16 v0, v35

    goto :goto_18

    :cond_26
    move/from16 v45, v0

    iget v0, v12, Lcom/daaw/vt2;->d:I

    :goto_18
    move/from16 v46, v6

    if-eqz v13, :cond_27

    invoke-virtual {v4}, Lcom/daaw/iz2;->e()I

    move-result v6

    mul-int/lit16 v6, v6, 0x3e8

    move/from16 v47, v8

    move/from16 v48, v9

    int-to-long v8, v6

    div-long/2addr v8, v14

    long-to-int v6, v8

    aput v6, v43, v5

    goto :goto_19

    :cond_27
    move/from16 v47, v8

    move/from16 v48, v9

    const/4 v6, 0x0

    aput v6, v43, v5

    :goto_19
    const-wide/16 v37, 0x3e8

    move-wide/from16 v35, v1

    move-wide/from16 v39, v14

    invoke-static/range {v35 .. v40}, Lcom/daaw/pz2;->j(JJJ)J

    move-result-wide v8

    sub-long v8, v8, v22

    aput-wide v8, v41, v5

    aput v3, v42, v5

    const/16 v3, 0x10

    shr-int/2addr v0, v3

    const/4 v3, 0x1

    and-int/2addr v0, v3

    xor-int/2addr v0, v3

    if-eq v3, v0, :cond_28

    const/4 v0, 0x0

    goto :goto_1a

    :cond_28
    const/4 v0, 0x1

    :goto_1a
    aput-boolean v0, v11, v5

    int-to-long v6, v7

    add-long/2addr v1, v6

    add-int/lit8 v5, v5, 0x1

    move/from16 v3, v44

    move/from16 v0, v45

    move/from16 v6, v46

    move/from16 v8, v47

    move/from16 v9, v48

    goto :goto_15

    :cond_29
    move/from16 v44, v3

    iput-wide v1, v10, Lcom/daaw/hu2;->r:J

    move/from16 v7, v25

    move/from16 v5, v44

    goto :goto_1b

    :cond_2a
    move-object/from16 v27, v1

    move/from16 v34, v2

    move-object/from16 v32, v3

    move/from16 v28, v6

    move-object/from16 v29, v8

    move-object/from16 v30, v9

    move-object/from16 v24, v10

    move-object/from16 v33, v11

    move/from16 v26, v14

    :goto_1b
    add-int/lit8 v2, v34, 0x1

    move-object/from16 v0, p0

    move-object/from16 v10, v24

    move/from16 v14, v26

    move-object/from16 v1, v27

    move/from16 v6, v28

    move-object/from16 v8, v29

    move-object/from16 v9, v30

    move-object/from16 v3, v32

    move-object/from16 v11, v33

    const/16 v4, 0xc

    goto/16 :goto_11

    :cond_2b
    move-object/from16 v27, v1

    move-object/from16 v32, v3

    move/from16 v28, v6

    move-object/from16 v29, v8

    move-object/from16 v30, v9

    move-object/from16 v33, v11

    sget v0, Lcom/daaw/nt2;->d0:I

    invoke-virtual {v8, v0}, Lcom/daaw/lt2;->e(I)Lcom/daaw/mt2;

    move-result-object v0

    if-eqz v0, :cond_32

    move-object/from16 v11, v33

    iget-object v1, v11, Lcom/daaw/yt2;->c:Lcom/daaw/fu2;

    iget-object v1, v1, Lcom/daaw/fu2;->h:[Lcom/daaw/gu2;

    move-object/from16 v2, v30

    iget-object v3, v2, Lcom/daaw/hu2;->a:Lcom/daaw/vt2;

    iget v3, v3, Lcom/daaw/vt2;->a:I

    aget-object v1, v1, v3

    iget-object v0, v0, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    iget v1, v1, Lcom/daaw/gu2;->a:I

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {v0}, Lcom/daaw/iz2;->e()I

    move-result v4

    invoke-static {v4}, Lcom/daaw/nt2;->a(I)I

    move-result v4

    const/4 v5, 0x1

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_2c

    invoke-virtual {v0, v3}, Lcom/daaw/iz2;->w(I)V

    :cond_2c
    invoke-virtual {v0}, Lcom/daaw/iz2;->g()I

    move-result v3

    invoke-virtual {v0}, Lcom/daaw/iz2;->i()I

    move-result v4

    iget v5, v2, Lcom/daaw/hu2;->e:I

    if-ne v4, v5, :cond_31

    if-nez v3, :cond_2e

    iget-object v3, v2, Lcom/daaw/hu2;->m:[Z

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_1c
    if-ge v5, v4, :cond_30

    invoke-virtual {v0}, Lcom/daaw/iz2;->g()I

    move-result v7

    add-int/2addr v6, v7

    if-le v7, v1, :cond_2d

    const/4 v7, 0x1

    goto :goto_1d

    :cond_2d
    const/4 v7, 0x0

    :goto_1d
    aput-boolean v7, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1c

    :cond_2e
    if-le v3, v1, :cond_2f

    const/4 v0, 0x1

    goto :goto_1e

    :cond_2f
    const/4 v0, 0x0

    :goto_1e
    mul-int v6, v3, v4

    iget-object v1, v2, Lcom/daaw/hu2;->m:[Z

    const/4 v3, 0x0

    invoke-static {v1, v3, v4, v0}, Ljava/util/Arrays;->fill([ZIIZ)V

    :cond_30
    invoke-virtual {v2, v6}, Lcom/daaw/hu2;->a(I)V

    goto :goto_1f

    :cond_31
    new-instance v0, Lcom/daaw/eq2;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Length mismatch: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/daaw/eq2;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_32
    move-object/from16 v2, v30

    :goto_1f
    sget v0, Lcom/daaw/nt2;->e0:I

    invoke-virtual {v8, v0}, Lcom/daaw/lt2;->e(I)Lcom/daaw/mt2;

    move-result-object v0

    if-eqz v0, :cond_36

    iget-object v0, v0, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {v0}, Lcom/daaw/iz2;->e()I

    move-result v3

    invoke-static {v3}, Lcom/daaw/nt2;->a(I)I

    move-result v4

    const/4 v5, 0x1

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_33

    invoke-virtual {v0, v1}, Lcom/daaw/iz2;->w(I)V

    :cond_33
    invoke-virtual {v0}, Lcom/daaw/iz2;->i()I

    move-result v1

    if-ne v1, v5, :cond_35

    iget-wide v4, v2, Lcom/daaw/hu2;->c:J

    invoke-static {v3}, Lcom/daaw/nt2;->b(I)I

    move-result v1

    if-nez v1, :cond_34

    invoke-virtual {v0}, Lcom/daaw/iz2;->m()J

    move-result-wide v0

    goto :goto_20

    :cond_34
    invoke-virtual {v0}, Lcom/daaw/iz2;->n()J

    move-result-wide v0

    :goto_20
    add-long/2addr v4, v0

    iput-wide v4, v2, Lcom/daaw/hu2;->c:J

    goto :goto_21

    :cond_35
    new-instance v0, Lcom/daaw/eq2;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected saio entry count: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/daaw/eq2;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_36
    :goto_21
    sget v0, Lcom/daaw/nt2;->i0:I

    invoke-virtual {v8, v0}, Lcom/daaw/lt2;->e(I)Lcom/daaw/mt2;

    move-result-object v0

    if-eqz v0, :cond_37

    iget-object v0, v0, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    const/4 v1, 0x0

    invoke-static {v0, v1, v2}, Lcom/daaw/zt2;->g(Lcom/daaw/iz2;ILcom/daaw/hu2;)V

    :cond_37
    sget v0, Lcom/daaw/nt2;->f0:I

    invoke-virtual {v8, v0}, Lcom/daaw/lt2;->e(I)Lcom/daaw/mt2;

    move-result-object v0

    sget v1, Lcom/daaw/nt2;->g0:I

    invoke-virtual {v8, v1}, Lcom/daaw/lt2;->e(I)Lcom/daaw/mt2;

    move-result-object v1

    if-eqz v0, :cond_3f

    if-eqz v1, :cond_3f

    iget-object v0, v0, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    iget-object v1, v1, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {v0}, Lcom/daaw/iz2;->e()I

    move-result v3

    invoke-virtual {v0}, Lcom/daaw/iz2;->e()I

    move-result v4

    sget v5, Lcom/daaw/zt2;->x:I

    if-eq v4, v5, :cond_38

    goto/16 :goto_23

    :cond_38
    invoke-static {v3}, Lcom/daaw/nt2;->b(I)I

    move-result v3

    const/4 v4, 0x4

    const/4 v6, 0x1

    if-ne v3, v6, :cond_39

    invoke-virtual {v0, v4}, Lcom/daaw/iz2;->w(I)V

    :cond_39
    invoke-virtual {v0}, Lcom/daaw/iz2;->e()I

    move-result v0

    if-ne v0, v6, :cond_3e

    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {v1}, Lcom/daaw/iz2;->e()I

    move-result v0

    invoke-virtual {v1}, Lcom/daaw/iz2;->e()I

    move-result v3

    if-ne v3, v5, :cond_3f

    invoke-static {v0}, Lcom/daaw/nt2;->b(I)I

    move-result v0

    const/4 v3, 0x2

    if-ne v0, v6, :cond_3b

    invoke-virtual {v1}, Lcom/daaw/iz2;->m()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-eqz v0, :cond_3a

    goto :goto_22

    :cond_3a
    new-instance v0, Lcom/daaw/eq2;

    const-string v1, "Variable length decription in sgpd found (unsupported)"

    invoke-direct {v0, v1}, Lcom/daaw/eq2;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3b
    if-lt v0, v3, :cond_3c

    invoke-virtual {v1, v4}, Lcom/daaw/iz2;->w(I)V

    :cond_3c
    :goto_22
    invoke-virtual {v1}, Lcom/daaw/iz2;->m()J

    move-result-wide v4

    const-wide/16 v6, 0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_3d

    invoke-virtual {v1, v3}, Lcom/daaw/iz2;->w(I)V

    invoke-virtual {v1}, Lcom/daaw/iz2;->g()I

    move-result v0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_40

    invoke-virtual {v1}, Lcom/daaw/iz2;->g()I

    move-result v0

    const/16 v4, 0x10

    new-array v5, v4, [B

    const/4 v6, 0x0

    invoke-virtual {v1, v5, v6, v4}, Lcom/daaw/iz2;->q([BII)V

    iput-boolean v3, v2, Lcom/daaw/hu2;->l:Z

    new-instance v1, Lcom/daaw/gu2;

    invoke-direct {v1, v3, v0, v5}, Lcom/daaw/gu2;-><init>(ZI[B)V

    iput-object v1, v2, Lcom/daaw/hu2;->n:Lcom/daaw/gu2;

    goto :goto_24

    :cond_3d
    new-instance v0, Lcom/daaw/eq2;

    const-string v1, "Entry count in sgpd != 1 (unsupported)."

    invoke-direct {v0, v1}, Lcom/daaw/eq2;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3e
    new-instance v0, Lcom/daaw/eq2;

    const-string v1, "Entry count in sbgp != 1 (unsupported)."

    invoke-direct {v0, v1}, Lcom/daaw/eq2;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3f
    :goto_23
    const/4 v3, 0x1

    :cond_40
    :goto_24
    iget-object v0, v8, Lcom/daaw/lt2;->Q0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_25
    if-ge v1, v0, :cond_43

    iget-object v4, v8, Lcom/daaw/lt2;->Q0:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/mt2;

    iget v5, v4, Lcom/daaw/nt2;->a:I

    sget v6, Lcom/daaw/nt2;->h0:I

    if-ne v5, v6, :cond_41

    iget-object v4, v4, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    const/16 v5, 0x8

    invoke-virtual {v4, v5}, Lcom/daaw/iz2;->v(I)V

    move-object/from16 v6, v32

    const/16 v7, 0x10

    const/4 v9, 0x0

    invoke-virtual {v4, v6, v9, v7}, Lcom/daaw/iz2;->q([BII)V

    sget-object v10, Lcom/daaw/zt2;->y:[B

    invoke-static {v6, v10}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v10

    if-eqz v10, :cond_42

    invoke-static {v4, v7, v2}, Lcom/daaw/zt2;->g(Lcom/daaw/iz2;ILcom/daaw/hu2;)V

    goto :goto_26

    :cond_41
    move-object/from16 v6, v32

    const/16 v5, 0x8

    const/16 v7, 0x10

    const/4 v9, 0x0

    :cond_42
    :goto_26
    add-int/lit8 v1, v1, 0x1

    move-object/from16 v32, v6

    goto :goto_25

    :cond_43
    move-object/from16 v6, v32

    const/16 v5, 0x8

    const/4 v9, 0x0

    goto :goto_28

    :cond_44
    :goto_27
    move-object/from16 v27, v1

    move-object/from16 v19, v2

    move/from16 v18, v4

    move/from16 v28, v6

    const/4 v9, 0x0

    move-object v6, v3

    const/4 v3, 0x1

    :goto_28
    add-int/lit8 v0, v28, 0x1

    move-object v3, v6

    move/from16 v4, v18

    move-object/from16 v2, v19

    move-object/from16 v1, v27

    const/4 v7, 0x1

    move v6, v0

    move-object/from16 v0, p0

    goto/16 :goto_8

    :cond_45
    const/4 v9, 0x0

    iget-object v0, v1, Lcom/daaw/lt2;->Q0:Ljava/util/List;

    invoke-static {v0}, Lcom/daaw/zt2;->a(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzavc;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object/from16 v2, p0

    iget-object v1, v2, Lcom/daaw/zt2;->a:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    const/4 v6, 0x0

    :goto_29
    if-ge v6, v1, :cond_47

    iget-object v3, v2, Lcom/daaw/zt2;->a:Landroid/util/SparseArray;

    invoke-virtual {v3, v6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/yt2;

    iget-object v4, v3, Lcom/daaw/yt2;->b:Lcom/daaw/ws2;

    iget-object v3, v3, Lcom/daaw/yt2;->c:Lcom/daaw/fu2;

    iget-object v3, v3, Lcom/daaw/fu2;->f:Lcom/google/android/gms/internal/ads/zzatd;

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzatd;->c(Lcom/google/android/gms/internal/ads/zzavc;)Lcom/google/android/gms/internal/ads/zzatd;

    move-result-object v3

    invoke-interface {v4, v3}, Lcom/daaw/ws2;->a(Lcom/google/android/gms/internal/ads/zzatd;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_29

    :cond_46
    move-object v2, v0

    iget-object v0, v2, Lcom/daaw/zt2;->h:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_47

    iget-object v0, v2, Lcom/daaw/zt2;->h:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/lt2;

    invoke-virtual {v0, v1}, Lcom/daaw/lt2;->f(Lcom/daaw/lt2;)V

    :cond_47
    move-object v0, v2

    goto/16 :goto_0

    :cond_48
    move-object v2, v0

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/zt2;->f()V

    return-void
.end method
