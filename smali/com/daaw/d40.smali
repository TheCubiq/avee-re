.class public final Lcom/daaw/d40;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zz;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/d40$c;,
        Lcom/daaw/d40$b;
    }
.end annotation


# static fields
.field public static final H:Lcom/daaw/e00;

.field public static final I:I

.field public static final J:[B

.field public static final K:Lcom/google/android/exoplayer2/Format;


# instance fields
.field public A:I

.field public B:I

.field public C:Z

.field public D:Lcom/daaw/d00;

.field public E:[Lcom/daaw/sm1;

.field public F:[Lcom/daaw/sm1;

.field public G:Z

.field public final a:I

.field public final b:Lcom/daaw/nm1;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/Format;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lcom/google/android/exoplayer2/drm/DrmInitData;

.field public final e:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/daaw/d40$c;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lcom/daaw/rv0;

.field public final g:Lcom/daaw/rv0;

.field public final h:Lcom/daaw/rv0;

.field public final i:Lcom/daaw/ol1;

.field public final j:Lcom/daaw/rv0;

.field public final k:[B

.field public final l:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lcom/daaw/b7$a;",
            ">;"
        }
    .end annotation
.end field

.field public final m:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lcom/daaw/d40$b;",
            ">;"
        }
    .end annotation
.end field

.field public final n:Lcom/daaw/sm1;

.field public o:I

.field public p:I

.field public q:J

.field public r:I

.field public s:Lcom/daaw/rv0;

.field public t:J

.field public u:I

.field public v:J

.field public w:J

.field public x:J

.field public y:Lcom/daaw/d40$c;

.field public z:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/daaw/d40$a;

    invoke-direct {v0}, Lcom/daaw/d40$a;-><init>()V

    sput-object v0, Lcom/daaw/d40;->H:Lcom/daaw/e00;

    const-string v0, "seig"

    invoke-static {v0}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/d40;->I:I

    const/16 v0, 0x10

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/daaw/d40;->J:[B

    const/4 v0, 0x0

    const-string v1, "application/x-emsg"

    const-wide v2, 0x7fffffffffffffffL

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/exoplayer2/Format;->x(Ljava/lang/String;Ljava/lang/String;J)Lcom/google/android/exoplayer2/Format;

    move-result-object v0

    sput-object v0, Lcom/daaw/d40;->K:Lcom/google/android/exoplayer2/Format;

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

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/daaw/d40;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/daaw/d40;-><init>(ILcom/daaw/ol1;)V

    return-void
.end method

.method public constructor <init>(ILcom/daaw/ol1;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, v0}, Lcom/daaw/d40;-><init>(ILcom/daaw/ol1;Lcom/daaw/nm1;Lcom/google/android/exoplayer2/drm/DrmInitData;)V

    return-void
.end method

.method public constructor <init>(ILcom/daaw/ol1;Lcom/daaw/nm1;Lcom/google/android/exoplayer2/drm/DrmInitData;)V
    .locals 6

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/daaw/d40;-><init>(ILcom/daaw/ol1;Lcom/daaw/nm1;Lcom/google/android/exoplayer2/drm/DrmInitData;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(ILcom/daaw/ol1;Lcom/daaw/nm1;Lcom/google/android/exoplayer2/drm/DrmInitData;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/daaw/ol1;",
            "Lcom/daaw/nm1;",
            "Lcom/google/android/exoplayer2/drm/DrmInitData;",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/Format;",
            ">;)V"
        }
    .end annotation

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/daaw/d40;-><init>(ILcom/daaw/ol1;Lcom/daaw/nm1;Lcom/google/android/exoplayer2/drm/DrmInitData;Ljava/util/List;Lcom/daaw/sm1;)V

    return-void
.end method

.method public constructor <init>(ILcom/daaw/ol1;Lcom/daaw/nm1;Lcom/google/android/exoplayer2/drm/DrmInitData;Ljava/util/List;Lcom/daaw/sm1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/daaw/ol1;",
            "Lcom/daaw/nm1;",
            "Lcom/google/android/exoplayer2/drm/DrmInitData;",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/Format;",
            ">;",
            "Lcom/daaw/sm1;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p3, :cond_0

    const/16 v0, 0x8

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    or-int/2addr p1, v0

    iput p1, p0, Lcom/daaw/d40;->a:I

    iput-object p2, p0, Lcom/daaw/d40;->i:Lcom/daaw/ol1;

    iput-object p3, p0, Lcom/daaw/d40;->b:Lcom/daaw/nm1;

    iput-object p4, p0, Lcom/daaw/d40;->d:Lcom/google/android/exoplayer2/drm/DrmInitData;

    invoke-static {p5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/d40;->c:Ljava/util/List;

    iput-object p6, p0, Lcom/daaw/d40;->n:Lcom/daaw/sm1;

    new-instance p1, Lcom/daaw/rv0;

    const/16 p2, 0x10

    invoke-direct {p1, p2}, Lcom/daaw/rv0;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/d40;->j:Lcom/daaw/rv0;

    new-instance p1, Lcom/daaw/rv0;

    sget-object p3, Lcom/daaw/sr0;->a:[B

    invoke-direct {p1, p3}, Lcom/daaw/rv0;-><init>([B)V

    iput-object p1, p0, Lcom/daaw/d40;->f:Lcom/daaw/rv0;

    new-instance p1, Lcom/daaw/rv0;

    const/4 p3, 0x5

    invoke-direct {p1, p3}, Lcom/daaw/rv0;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/d40;->g:Lcom/daaw/rv0;

    new-instance p1, Lcom/daaw/rv0;

    invoke-direct {p1}, Lcom/daaw/rv0;-><init>()V

    iput-object p1, p0, Lcom/daaw/d40;->h:Lcom/daaw/rv0;

    new-array p1, p2, [B

    iput-object p1, p0, Lcom/daaw/d40;->k:[B

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lcom/daaw/d40;->l:Ljava/util/ArrayDeque;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lcom/daaw/d40;->m:Ljava/util/ArrayDeque;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/daaw/d40;->e:Landroid/util/SparseArray;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/daaw/d40;->w:J

    iput-wide p1, p0, Lcom/daaw/d40;->v:J

    iput-wide p1, p0, Lcom/daaw/d40;->x:J

    invoke-virtual {p0}, Lcom/daaw/d40;->b()V

    return-void
.end method

.method public static A(Lcom/daaw/rv0;)Landroid/util/Pair;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/rv0;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Lcom/daaw/qr;",
            ">;"
        }
    .end annotation

    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v0

    invoke-virtual {p0}, Lcom/daaw/rv0;->B()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0}, Lcom/daaw/rv0;->B()I

    move-result v2

    invoke-virtual {p0}, Lcom/daaw/rv0;->B()I

    move-result v3

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result p0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v4, Lcom/daaw/qr;

    invoke-direct {v4, v1, v2, v3, p0}, Lcom/daaw/qr;-><init>(IIII)V

    invoke-static {v0, v4}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static B(Lcom/daaw/d40$c;IJILcom/daaw/rv0;I)I
    .locals 31

    move-object/from16 v0, p0

    const/16 v1, 0x8

    move-object/from16 v2, p5

    invoke-virtual {v2, v1}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual/range {p5 .. p5}, Lcom/daaw/rv0;->i()I

    move-result v1

    invoke-static {v1}, Lcom/daaw/b7;->b(I)I

    move-result v1

    iget-object v3, v0, Lcom/daaw/d40$c;->c:Lcom/daaw/nm1;

    iget-object v0, v0, Lcom/daaw/d40$c;->b:Lcom/daaw/qm1;

    iget-object v4, v0, Lcom/daaw/qm1;->a:Lcom/daaw/qr;

    iget-object v5, v0, Lcom/daaw/qm1;->h:[I

    invoke-virtual/range {p5 .. p5}, Lcom/daaw/rv0;->B()I

    move-result v6

    aput v6, v5, p1

    iget-object v5, v0, Lcom/daaw/qm1;->g:[J

    iget-wide v6, v0, Lcom/daaw/qm1;->c:J

    aput-wide v6, v5, p1

    and-int/lit8 v6, v1, 0x1

    if-eqz v6, :cond_0

    aget-wide v6, v5, p1

    invoke-virtual/range {p5 .. p5}, Lcom/daaw/rv0;->i()I

    move-result v8

    int-to-long v8, v8

    add-long/2addr v6, v8

    aput-wide v6, v5, p1

    :cond_0
    and-int/lit8 v5, v1, 0x4

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v5, :cond_1

    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_0
    iget v8, v4, Lcom/daaw/qr;->d:I

    if-eqz v5, :cond_2

    invoke-virtual/range {p5 .. p5}, Lcom/daaw/rv0;->B()I

    move-result v8

    :cond_2
    and-int/lit16 v9, v1, 0x100

    if-eqz v9, :cond_3

    const/4 v9, 0x1

    goto :goto_1

    :cond_3
    const/4 v9, 0x0

    :goto_1
    and-int/lit16 v10, v1, 0x200

    if-eqz v10, :cond_4

    const/4 v10, 0x1

    goto :goto_2

    :cond_4
    const/4 v10, 0x0

    :goto_2
    and-int/lit16 v11, v1, 0x400

    if-eqz v11, :cond_5

    const/4 v11, 0x1

    goto :goto_3

    :cond_5
    const/4 v11, 0x0

    :goto_3
    and-int/lit16 v1, v1, 0x800

    if-eqz v1, :cond_6

    const/4 v1, 0x1

    goto :goto_4

    :cond_6
    const/4 v1, 0x0

    :goto_4
    iget-object v12, v3, Lcom/daaw/nm1;->h:[J

    const-wide/16 v13, 0x0

    if-eqz v12, :cond_7

    array-length v15, v12

    if-ne v15, v7, :cond_7

    aget-wide v15, v12, v6

    cmp-long v12, v15, v13

    if-nez v12, :cond_7

    iget-object v12, v3, Lcom/daaw/nm1;->i:[J

    aget-wide v13, v12, v6

    const-wide/16 v15, 0x3e8

    iget-wide v6, v3, Lcom/daaw/nm1;->c:J

    move-wide/from16 v17, v6

    invoke-static/range {v13 .. v18}, Lcom/daaw/sq1;->T(JJJ)J

    move-result-wide v13

    :cond_7
    iget-object v6, v0, Lcom/daaw/qm1;->i:[I

    iget-object v7, v0, Lcom/daaw/qm1;->j:[I

    iget-object v15, v0, Lcom/daaw/qm1;->k:[J

    iget-object v12, v0, Lcom/daaw/qm1;->l:[Z

    iget v2, v3, Lcom/daaw/nm1;->b:I

    move/from16 v17, v8

    const/4 v8, 0x2

    if-ne v2, v8, :cond_8

    const/4 v2, 0x1

    and-int/lit8 v8, p4, 0x1

    if-eqz v8, :cond_8

    const/16 v16, 0x1

    goto :goto_5

    :cond_8
    const/16 v16, 0x0

    :goto_5
    iget-object v8, v0, Lcom/daaw/qm1;->h:[I

    aget v8, v8, p1

    add-int v8, p6, v8

    iget-wide v2, v3, Lcom/daaw/nm1;->c:J

    move-wide/from16 v24, v13

    move-object v14, v12

    if-lez p1, :cond_9

    iget-wide v12, v0, Lcom/daaw/qm1;->s:J

    goto :goto_6

    :cond_9
    move-wide/from16 v12, p2

    :goto_6
    move-wide/from16 p1, v12

    move/from16 v12, p6

    :goto_7
    if-ge v12, v8, :cond_11

    if-eqz v9, :cond_a

    invoke-virtual/range {p5 .. p5}, Lcom/daaw/rv0;->B()I

    move-result v13

    goto :goto_8

    :cond_a
    iget v13, v4, Lcom/daaw/qr;->b:I

    :goto_8
    if-eqz v10, :cond_b

    invoke-virtual/range {p5 .. p5}, Lcom/daaw/rv0;->B()I

    move-result v18

    move/from16 v26, v9

    move/from16 v9, v18

    goto :goto_9

    :cond_b
    move/from16 v26, v9

    iget v9, v4, Lcom/daaw/qr;->c:I

    :goto_9
    if-nez v12, :cond_c

    if-eqz v5, :cond_c

    move/from16 v27, v5

    move/from16 v5, v17

    goto :goto_a

    :cond_c
    if-eqz v11, :cond_d

    invoke-virtual/range {p5 .. p5}, Lcom/daaw/rv0;->i()I

    move-result v18

    move/from16 v27, v5

    move/from16 v5, v18

    goto :goto_a

    :cond_d
    move/from16 v27, v5

    iget v5, v4, Lcom/daaw/qr;->d:I

    :goto_a
    move/from16 v28, v1

    if-eqz v1, :cond_e

    invoke-virtual/range {p5 .. p5}, Lcom/daaw/rv0;->i()I

    move-result v1

    move/from16 v29, v10

    move/from16 v30, v11

    int-to-long v10, v1

    const-wide/16 v18, 0x3e8

    mul-long v10, v10, v18

    div-long/2addr v10, v2

    long-to-int v1, v10

    aput v1, v7, v12

    const/4 v1, 0x0

    goto :goto_b

    :cond_e
    move/from16 v29, v10

    move/from16 v30, v11

    const/4 v1, 0x0

    aput v1, v7, v12

    :goto_b
    const-wide/16 v20, 0x3e8

    move-wide/from16 v18, p1

    move-wide/from16 v22, v2

    invoke-static/range {v18 .. v23}, Lcom/daaw/sq1;->T(JJJ)J

    move-result-wide v10

    sub-long v10, v10, v24

    aput-wide v10, v15, v12

    aput v9, v6, v12

    shr-int/lit8 v5, v5, 0x10

    const/4 v9, 0x1

    and-int/2addr v5, v9

    if-nez v5, :cond_10

    if-eqz v16, :cond_f

    if-nez v12, :cond_10

    :cond_f
    const/4 v5, 0x1

    goto :goto_c

    :cond_10
    const/4 v5, 0x0

    :goto_c
    aput-boolean v5, v14, v12

    int-to-long v10, v13

    move-wide/from16 v18, v2

    move-wide/from16 v1, p1

    add-long/2addr v1, v10

    add-int/lit8 v12, v12, 0x1

    move-wide/from16 p1, v1

    move-wide/from16 v2, v18

    move/from16 v9, v26

    move/from16 v5, v27

    move/from16 v1, v28

    move/from16 v10, v29

    move/from16 v11, v30

    goto/16 :goto_7

    :cond_11
    move-wide/from16 v1, p1

    iput-wide v1, v0, Lcom/daaw/qm1;->s:J

    return v8
.end method

.method public static C(Lcom/daaw/b7$a;Lcom/daaw/d40$c;JI)V
    .locals 10

    iget-object p0, p0, Lcom/daaw/b7$a;->R0:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/b7$b;

    iget v6, v5, Lcom/daaw/b7;->a:I

    sget v7, Lcom/daaw/b7;->A:I

    if-ne v6, v7, :cond_0

    iget-object v5, v5, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    const/16 v6, 0xc

    invoke-virtual {v5, v6}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {v5}, Lcom/daaw/rv0;->B()I

    move-result v5

    if-lez v5, :cond_0

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iput v1, p1, Lcom/daaw/d40$c;->g:I

    iput v1, p1, Lcom/daaw/d40$c;->f:I

    iput v1, p1, Lcom/daaw/d40$c;->e:I

    iget-object v2, p1, Lcom/daaw/d40$c;->b:Lcom/daaw/qm1;

    invoke-virtual {v2, v3, v4}, Lcom/daaw/qm1;->e(II)V

    const/4 v3, 0x0

    const/4 v8, 0x0

    :goto_1
    if-ge v1, v0, :cond_3

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/b7$b;

    iget v4, v2, Lcom/daaw/b7;->a:I

    sget v5, Lcom/daaw/b7;->A:I

    if-ne v4, v5, :cond_2

    add-int/lit8 v9, v3, 0x1

    iget-object v7, v2, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    move-object v2, p1

    move-wide v4, p2

    move v6, p4

    invoke-static/range {v2 .. v8}, Lcom/daaw/d40;->B(Lcom/daaw/d40$c;IJILcom/daaw/rv0;I)I

    move-result v2

    move v8, v2

    move v3, v9

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public static D(Lcom/daaw/rv0;Lcom/daaw/qm1;[B)V
    .locals 2

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->J(I)V

    const/4 v0, 0x0

    const/16 v1, 0x10

    invoke-virtual {p0, p2, v0, v1}, Lcom/daaw/rv0;->g([BII)V

    sget-object v0, Lcom/daaw/d40;->J:[B

    invoke-static {p2, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-static {p0, v1, p1}, Lcom/daaw/d40;->t(Lcom/daaw/rv0;ILcom/daaw/qm1;)V

    return-void
.end method

.method public static J(I)Z
    .locals 1

    sget v0, Lcom/daaw/b7;->C:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->E:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->F:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->G:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->H:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->L:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->M:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->N:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->Q:I

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static K(I)Z
    .locals 1

    sget v0, Lcom/daaw/b7;->T:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->S:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->D:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->B:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->U:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->x:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->y:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->P:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->z:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->A:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->V:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->d0:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->e0:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->i0:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->h0:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->f0:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->g0:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->R:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->O:I

    if-eq p0, v0, :cond_1

    sget v0, Lcom/daaw/b7;->H0:I

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static e(Ljava/util/List;)Lcom/google/android/exoplayer2/drm/DrmInitData;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/b7$b;",
            ">;)",
            "Lcom/google/android/exoplayer2/drm/DrmInitData;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, v1

    :goto_0
    if-ge v2, v0, :cond_3

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/b7$b;

    iget v5, v4, Lcom/daaw/b7;->a:I

    sget v6, Lcom/daaw/b7;->V:I

    if-ne v5, v6, :cond_2

    if-nez v3, :cond_0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    iget-object v4, v4, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    iget-object v4, v4, Lcom/daaw/rv0;->a:[B

    invoke-static {v4}, Lcom/daaw/d01;->e([B)Ljava/util/UUID;

    move-result-object v5

    if-nez v5, :cond_1

    goto :goto_1

    :cond_1
    new-instance v6, Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;

    const-string v7, "video/mp4"

    invoke-direct {v6, v5, v7, v4}, Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;-><init>(Ljava/util/UUID;Ljava/lang/String;[B)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    new-instance v1, Lcom/google/android/exoplayer2/drm/DrmInitData;

    invoke-direct {v1, v3}, Lcom/google/android/exoplayer2/drm/DrmInitData;-><init>(Ljava/util/List;)V

    :goto_2
    return-object v1
.end method

.method public static g(Landroid/util/SparseArray;)Lcom/daaw/d40$c;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Lcom/daaw/d40$c;",
            ">;)",
            "Lcom/daaw/d40$c;"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x0

    const-wide v2, 0x7fffffffffffffffL

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_2

    invoke-virtual {p0, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/d40$c;

    iget v6, v5, Lcom/daaw/d40$c;->g:I

    iget-object v7, v5, Lcom/daaw/d40$c;->b:Lcom/daaw/qm1;

    iget v8, v7, Lcom/daaw/qm1;->e:I

    if-ne v6, v8, :cond_0

    goto :goto_1

    :cond_0
    iget-object v7, v7, Lcom/daaw/qm1;->g:[J

    aget-wide v6, v7, v6

    cmp-long v8, v6, v2

    if-gez v8, :cond_1

    move-object v1, v5

    move-wide v2, v6

    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public static p(Lcom/daaw/rv0;)J
    .locals 2

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v0

    invoke-static {v0}, Lcom/daaw/b7;->c(I)I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/rv0;->z()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/rv0;->C()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public static q(Lcom/daaw/b7$a;Landroid/util/SparseArray;I[B)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/b7$a;",
            "Landroid/util/SparseArray<",
            "Lcom/daaw/d40$c;",
            ">;I[B)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/b7$a;->S0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lcom/daaw/b7$a;->S0:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/b7$a;

    iget v3, v2, Lcom/daaw/b7;->a:I

    sget v4, Lcom/daaw/b7;->M:I

    if-ne v3, v4, :cond_0

    invoke-static {v2, p1, p2, p3}, Lcom/daaw/d40;->z(Lcom/daaw/b7$a;Landroid/util/SparseArray;I[B)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static r(Lcom/daaw/rv0;Lcom/daaw/qm1;)V
    .locals 5

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v1

    invoke-static {v1}, Lcom/daaw/b7;->b(I)I

    move-result v2

    const/4 v3, 0x1

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_0

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->K(I)V

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/rv0;->B()I

    move-result v0

    if-ne v0, v3, :cond_2

    invoke-static {v1}, Lcom/daaw/b7;->c(I)I

    move-result v0

    iget-wide v1, p1, Lcom/daaw/qm1;->d:J

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/rv0;->z()J

    move-result-wide v3

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/rv0;->C()J

    move-result-wide v3

    :goto_0
    add-long/2addr v1, v3

    iput-wide v1, p1, Lcom/daaw/qm1;->d:J

    return-void

    :cond_2
    new-instance p0, Lcom/daaw/tv0;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected saio entry count: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static s(Lcom/daaw/pm1;Lcom/daaw/rv0;Lcom/daaw/qm1;)V
    .locals 7

    iget p0, p0, Lcom/daaw/pm1;->d:I

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p1}, Lcom/daaw/rv0;->i()I

    move-result v1

    invoke-static {v1}, Lcom/daaw/b7;->b(I)I

    move-result v1

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    invoke-virtual {p1, v0}, Lcom/daaw/rv0;->K(I)V

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/rv0;->x()I

    move-result v0

    invoke-virtual {p1}, Lcom/daaw/rv0;->B()I

    move-result v1

    iget v3, p2, Lcom/daaw/qm1;->f:I

    if-ne v1, v3, :cond_5

    const/4 v3, 0x0

    if-nez v0, :cond_2

    iget-object v0, p2, Lcom/daaw/qm1;->n:[Z

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v4, v1, :cond_4

    invoke-virtual {p1}, Lcom/daaw/rv0;->x()I

    move-result v6

    add-int/2addr v5, v6

    if-le v6, p0, :cond_1

    const/4 v6, 0x1

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_1
    aput-boolean v6, v0, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    if-le v0, p0, :cond_3

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    mul-int v0, v0, v1

    add-int/lit8 v5, v0, 0x0

    iget-object p0, p2, Lcom/daaw/qm1;->n:[Z

    invoke-static {p0, v3, v1, v2}, Ljava/util/Arrays;->fill([ZIIZ)V

    :cond_4
    invoke-virtual {p2, v5}, Lcom/daaw/qm1;->d(I)V

    return-void

    :cond_5
    new-instance p0, Lcom/daaw/tv0;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Length mismatch: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p2, Lcom/daaw/qm1;->f:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :goto_3
    throw p0

    :goto_4
    goto :goto_3
.end method

.method public static t(Lcom/daaw/rv0;ILcom/daaw/qm1;)V
    .locals 3

    add-int/lit8 p1, p1, 0x8

    invoke-virtual {p0, p1}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result p1

    invoke-static {p1}, Lcom/daaw/b7;->b(I)I

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
    invoke-virtual {p0}, Lcom/daaw/rv0;->B()I

    move-result v1

    iget v2, p2, Lcom/daaw/qm1;->f:I

    if-ne v1, v2, :cond_1

    iget-object v2, p2, Lcom/daaw/qm1;->n:[Z

    invoke-static {v2, v0, v1, p1}, Ljava/util/Arrays;->fill([ZIIZ)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->a()I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/daaw/qm1;->d(I)V

    invoke-virtual {p2, p0}, Lcom/daaw/qm1;->b(Lcom/daaw/rv0;)V

    return-void

    :cond_1
    new-instance p0, Lcom/daaw/tv0;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Length mismatch: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p2, Lcom/daaw/qm1;->f:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Lcom/daaw/tv0;

    const-string p1, "Overriding TrackEncryptionBox parameters is unsupported."

    invoke-direct {p0, p1}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static u(Lcom/daaw/rv0;Lcom/daaw/qm1;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0, p1}, Lcom/daaw/d40;->t(Lcom/daaw/rv0;ILcom/daaw/qm1;)V

    return-void
.end method

.method public static v(Lcom/daaw/rv0;Lcom/daaw/rv0;Ljava/lang/String;Lcom/daaw/qm1;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->i()I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->i()I

    move-result v5

    sget v6, Lcom/daaw/d40;->I:I

    if-eq v5, v6, :cond_0

    return-void

    :cond_0
    invoke-static {v4}, Lcom/daaw/b7;->c(I)I

    move-result v4

    const/4 v5, 0x4

    const/4 v7, 0x1

    if-ne v4, v7, :cond_1

    invoke-virtual {v0, v5}, Lcom/daaw/rv0;->K(I)V

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->i()I

    move-result v0

    if-ne v0, v7, :cond_a

    invoke-virtual {v1, v3}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/rv0;->i()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/rv0;->i()I

    move-result v3

    if-eq v3, v6, :cond_2

    return-void

    :cond_2
    invoke-static {v0}, Lcom/daaw/b7;->c(I)I

    move-result v0

    if-ne v0, v7, :cond_4

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/rv0;->z()J

    move-result-wide v3

    const-wide/16 v8, 0x0

    cmp-long v0, v3, v8

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, Lcom/daaw/tv0;

    const-string v1, "Variable length description in sgpd found (unsupported)"

    invoke-direct {v0, v1}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    const/4 v3, 0x2

    if-lt v0, v3, :cond_5

    invoke-virtual {v1, v5}, Lcom/daaw/rv0;->K(I)V

    :cond_5
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/rv0;->z()J

    move-result-wide v3

    const-wide/16 v8, 0x1

    cmp-long v0, v3, v8

    if-nez v0, :cond_9

    invoke-virtual {v1, v7}, Lcom/daaw/rv0;->K(I)V

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/rv0;->x()I

    move-result v0

    and-int/lit16 v3, v0, 0xf0

    shr-int/lit8 v13, v3, 0x4

    and-int/lit8 v14, v0, 0xf

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/rv0;->x()I

    move-result v0

    const/4 v3, 0x0

    if-ne v0, v7, :cond_6

    const/4 v9, 0x1

    goto :goto_1

    :cond_6
    const/4 v9, 0x0

    :goto_1
    if-nez v9, :cond_7

    return-void

    :cond_7
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/rv0;->x()I

    move-result v11

    const/16 v0, 0x10

    new-array v12, v0, [B

    invoke-virtual {v1, v12, v3, v0}, Lcom/daaw/rv0;->g([BII)V

    const/4 v0, 0x0

    if-eqz v9, :cond_8

    if-nez v11, :cond_8

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/rv0;->x()I

    move-result v0

    new-array v4, v0, [B

    invoke-virtual {v1, v4, v3, v0}, Lcom/daaw/rv0;->g([BII)V

    move-object v15, v4

    goto :goto_2

    :cond_8
    move-object v15, v0

    :goto_2
    iput-boolean v7, v2, Lcom/daaw/qm1;->m:Z

    new-instance v0, Lcom/daaw/pm1;

    move-object v8, v0

    move-object/from16 v10, p2

    invoke-direct/range {v8 .. v15}, Lcom/daaw/pm1;-><init>(ZLjava/lang/String;I[BII[B)V

    iput-object v0, v2, Lcom/daaw/qm1;->o:Lcom/daaw/pm1;

    return-void

    :cond_9
    new-instance v0, Lcom/daaw/tv0;

    const-string v1, "Entry count in sgpd != 1 (unsupported)."

    invoke-direct {v0, v1}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Lcom/daaw/tv0;

    const-string v1, "Entry count in sbgp != 1 (unsupported)."

    invoke-direct {v0, v1}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static w(Lcom/daaw/rv0;J)Landroid/util/Pair;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/rv0;",
            "J)",
            "Landroid/util/Pair<",
            "Ljava/lang/Long;",
            "Lcom/daaw/hf;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->i()I

    move-result v1

    invoke-static {v1}, Lcom/daaw/b7;->c(I)I

    move-result v1

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Lcom/daaw/rv0;->K(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->z()J

    move-result-wide v9

    if-nez v1, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->z()J

    move-result-wide v3

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->z()J

    move-result-wide v5

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->C()J

    move-result-wide v3

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->C()J

    move-result-wide v5

    :goto_0
    add-long v5, p1, v5

    move-wide v11, v3

    move-wide v13, v5

    const-wide/32 v5, 0xf4240

    move-wide v3, v11

    move-wide v7, v9

    invoke-static/range {v3 .. v8}, Lcom/daaw/sq1;->T(JJJ)J

    move-result-wide v15

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/daaw/rv0;->K(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->D()I

    move-result v1

    new-array v7, v1, [I

    new-array v8, v1, [J

    new-array v5, v1, [J

    new-array v6, v1, [J

    const/4 v3, 0x0

    move-wide v3, v11

    move-wide/from16 v17, v15

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v1, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->i()I

    move-result v12

    const/high16 v19, -0x80000000

    and-int v19, v12, v19

    if-nez v19, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->z()J

    move-result-wide v19

    const v21, 0x7fffffff

    and-int v12, v12, v21

    aput v12, v7, v11

    aput-wide v13, v8, v11

    aput-wide v17, v6, v11

    add-long v17, v3, v19

    const-wide/32 v19, 0xf4240

    move-wide/from16 v3, v17

    move-object v12, v5

    move-object v2, v6

    move-wide/from16 v5, v19

    move/from16 p1, v1

    move-object v1, v7

    move-object/from16 v22, v8

    move-wide v7, v9

    invoke-static/range {v3 .. v8}, Lcom/daaw/sq1;->T(JJJ)J

    move-result-wide v3

    aget-wide v5, v2, v11

    sub-long v5, v3, v5

    aput-wide v5, v12, v11

    const/4 v5, 0x4

    invoke-virtual {v0, v5}, Lcom/daaw/rv0;->K(I)V

    aget v6, v1, v11

    int-to-long v6, v6

    add-long/2addr v13, v6

    add-int/lit8 v11, v11, 0x1

    move-object v7, v1

    move-object v6, v2

    move-object v5, v12

    move-object/from16 v8, v22

    const/4 v2, 0x4

    move/from16 v1, p1

    move-wide/from16 v23, v3

    move-wide/from16 v3, v17

    move-wide/from16 v17, v23

    goto :goto_1

    :cond_1
    new-instance v0, Lcom/daaw/tv0;

    const-string v1, "Unhandled indirect reference"

    invoke-direct {v0, v1}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    move-object v12, v5

    move-object v2, v6

    move-object v1, v7

    move-object/from16 v22, v8

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v3, Lcom/daaw/hf;

    move-object/from16 v4, v22

    invoke-direct {v3, v1, v4, v12, v2}, Lcom/daaw/hf;-><init>([I[J[J[J)V

    invoke-static {v0, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    return-object v0
.end method

.method public static x(Lcom/daaw/rv0;)J
    .locals 2

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v0

    invoke-static {v0}, Lcom/daaw/b7;->c(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/rv0;->C()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/rv0;->z()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public static y(Lcom/daaw/rv0;Landroid/util/SparseArray;I)Lcom/daaw/d40$c;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/rv0;",
            "Landroid/util/SparseArray<",
            "Lcom/daaw/d40$c;",
            ">;I)",
            "Lcom/daaw/d40$c;"
        }
    .end annotation

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v1

    invoke-static {v1}, Lcom/daaw/b7;->b(I)I

    move-result v1

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v2

    and-int/2addr p2, v0

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/d40$c;

    if-nez p1, :cond_1

    const/4 p0, 0x0

    return-object p0

    :cond_1
    and-int/lit8 p2, v1, 0x1

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Lcom/daaw/rv0;->C()J

    move-result-wide v2

    iget-object p2, p1, Lcom/daaw/d40$c;->b:Lcom/daaw/qm1;

    iput-wide v2, p2, Lcom/daaw/qm1;->c:J

    iput-wide v2, p2, Lcom/daaw/qm1;->d:J

    :cond_2
    iget-object p2, p1, Lcom/daaw/d40$c;->d:Lcom/daaw/qr;

    and-int/lit8 v0, v1, 0x2

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/daaw/rv0;->B()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_3
    iget v0, p2, Lcom/daaw/qr;->a:I

    :goto_1
    and-int/lit8 v2, v1, 0x8

    if-eqz v2, :cond_4

    invoke-virtual {p0}, Lcom/daaw/rv0;->B()I

    move-result v2

    goto :goto_2

    :cond_4
    iget v2, p2, Lcom/daaw/qr;->b:I

    :goto_2
    and-int/lit8 v3, v1, 0x10

    if-eqz v3, :cond_5

    invoke-virtual {p0}, Lcom/daaw/rv0;->B()I

    move-result v3

    goto :goto_3

    :cond_5
    iget v3, p2, Lcom/daaw/qr;->c:I

    :goto_3
    and-int/lit8 v1, v1, 0x20

    if-eqz v1, :cond_6

    invoke-virtual {p0}, Lcom/daaw/rv0;->B()I

    move-result p0

    goto :goto_4

    :cond_6
    iget p0, p2, Lcom/daaw/qr;->d:I

    :goto_4
    iget-object p2, p1, Lcom/daaw/d40$c;->b:Lcom/daaw/qm1;

    new-instance v1, Lcom/daaw/qr;

    invoke-direct {v1, v0, v2, v3, p0}, Lcom/daaw/qr;-><init>(IIII)V

    iput-object v1, p2, Lcom/daaw/qm1;->a:Lcom/daaw/qr;

    return-object p1
.end method

.method public static z(Lcom/daaw/b7$a;Landroid/util/SparseArray;I[B)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/b7$a;",
            "Landroid/util/SparseArray<",
            "Lcom/daaw/d40$c;",
            ">;I[B)V"
        }
    .end annotation

    sget v0, Lcom/daaw/b7;->y:I

    invoke-virtual {p0, v0}, Lcom/daaw/b7$a;->g(I)Lcom/daaw/b7$b;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    invoke-static {v0, p1, p2}, Lcom/daaw/d40;->y(Lcom/daaw/rv0;Landroid/util/SparseArray;I)Lcom/daaw/d40$c;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p1, Lcom/daaw/d40$c;->b:Lcom/daaw/qm1;

    iget-wide v1, v0, Lcom/daaw/qm1;->s:J

    invoke-virtual {p1}, Lcom/daaw/d40$c;->f()V

    sget v3, Lcom/daaw/b7;->x:I

    invoke-virtual {p0, v3}, Lcom/daaw/b7$a;->g(I)Lcom/daaw/b7$b;

    move-result-object v4

    if-eqz v4, :cond_1

    and-int/lit8 v4, p2, 0x2

    if-nez v4, :cond_1

    invoke-virtual {p0, v3}, Lcom/daaw/b7$a;->g(I)Lcom/daaw/b7$b;

    move-result-object v1

    iget-object v1, v1, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    invoke-static {v1}, Lcom/daaw/d40;->x(Lcom/daaw/rv0;)J

    move-result-wide v1

    :cond_1
    invoke-static {p0, p1, v1, v2, p2}, Lcom/daaw/d40;->C(Lcom/daaw/b7$a;Lcom/daaw/d40$c;JI)V

    iget-object p1, p1, Lcom/daaw/d40$c;->c:Lcom/daaw/nm1;

    iget-object p2, v0, Lcom/daaw/qm1;->a:Lcom/daaw/qr;

    iget p2, p2, Lcom/daaw/qr;->a:I

    invoke-virtual {p1, p2}, Lcom/daaw/nm1;->a(I)Lcom/daaw/pm1;

    move-result-object p1

    sget p2, Lcom/daaw/b7;->d0:I

    invoke-virtual {p0, p2}, Lcom/daaw/b7$a;->g(I)Lcom/daaw/b7$b;

    move-result-object p2

    if-eqz p2, :cond_2

    iget-object p2, p2, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    invoke-static {p1, p2, v0}, Lcom/daaw/d40;->s(Lcom/daaw/pm1;Lcom/daaw/rv0;Lcom/daaw/qm1;)V

    :cond_2
    sget p2, Lcom/daaw/b7;->e0:I

    invoke-virtual {p0, p2}, Lcom/daaw/b7$a;->g(I)Lcom/daaw/b7$b;

    move-result-object p2

    if-eqz p2, :cond_3

    iget-object p2, p2, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    invoke-static {p2, v0}, Lcom/daaw/d40;->r(Lcom/daaw/rv0;Lcom/daaw/qm1;)V

    :cond_3
    sget p2, Lcom/daaw/b7;->i0:I

    invoke-virtual {p0, p2}, Lcom/daaw/b7$a;->g(I)Lcom/daaw/b7$b;

    move-result-object p2

    if-eqz p2, :cond_4

    iget-object p2, p2, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    invoke-static {p2, v0}, Lcom/daaw/d40;->u(Lcom/daaw/rv0;Lcom/daaw/qm1;)V

    :cond_4
    sget p2, Lcom/daaw/b7;->f0:I

    invoke-virtual {p0, p2}, Lcom/daaw/b7$a;->g(I)Lcom/daaw/b7$b;

    move-result-object p2

    sget v1, Lcom/daaw/b7;->g0:I

    invoke-virtual {p0, v1}, Lcom/daaw/b7$a;->g(I)Lcom/daaw/b7$b;

    move-result-object v1

    if-eqz p2, :cond_6

    if-eqz v1, :cond_6

    iget-object p2, p2, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    iget-object v1, v1, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    if-eqz p1, :cond_5

    iget-object p1, p1, Lcom/daaw/pm1;->b:Ljava/lang/String;

    goto :goto_0

    :cond_5
    const/4 p1, 0x0

    :goto_0
    invoke-static {p2, v1, p1, v0}, Lcom/daaw/d40;->v(Lcom/daaw/rv0;Lcom/daaw/rv0;Ljava/lang/String;Lcom/daaw/qm1;)V

    :cond_6
    iget-object p1, p0, Lcom/daaw/b7$a;->R0:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 p2, 0x0

    :goto_1
    if-ge p2, p1, :cond_8

    iget-object v1, p0, Lcom/daaw/b7$a;->R0:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/b7$b;

    iget v2, v1, Lcom/daaw/b7;->a:I

    sget v3, Lcom/daaw/b7;->h0:I

    if-ne v2, v3, :cond_7

    iget-object v1, v1, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    invoke-static {v1, v0, p3}, Lcom/daaw/d40;->D(Lcom/daaw/rv0;Lcom/daaw/qm1;[B)V

    :cond_7
    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_8
    return-void
.end method


# virtual methods
.method public final E(J)V
    .locals 3

    :goto_0
    iget-object v0, p0, Lcom/daaw/d40;->l:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/d40;->l:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/b7$a;

    iget-wide v0, v0, Lcom/daaw/b7$a;->Q0:J

    cmp-long v2, v0, p1

    if-nez v2, :cond_0

    iget-object v0, p0, Lcom/daaw/d40;->l:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/b7$a;

    invoke-virtual {p0, v0}, Lcom/daaw/d40;->j(Lcom/daaw/b7$a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/d40;->b()V

    return-void
.end method

.method public final F(Lcom/daaw/a00;)Z
    .locals 8

    iget v0, p0, Lcom/daaw/d40;->r:I

    const/16 v1, 0x8

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/d40;->j:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    invoke-interface {p1, v0, v2, v1, v3}, Lcom/daaw/a00;->c([BIIZ)Z

    move-result v0

    if-nez v0, :cond_0

    return v2

    :cond_0
    iput v1, p0, Lcom/daaw/d40;->r:I

    iget-object v0, p0, Lcom/daaw/d40;->j:Lcom/daaw/rv0;

    invoke-virtual {v0, v2}, Lcom/daaw/rv0;->J(I)V

    iget-object v0, p0, Lcom/daaw/d40;->j:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->z()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/daaw/d40;->q:J

    iget-object v0, p0, Lcom/daaw/d40;->j:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->i()I

    move-result v0

    iput v0, p0, Lcom/daaw/d40;->p:I

    :cond_1
    iget-wide v4, p0, Lcom/daaw/d40;->q:J

    const-wide/16 v6, 0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/d40;->j:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    invoke-interface {p1, v0, v1, v1}, Lcom/daaw/a00;->f([BII)V

    iget v0, p0, Lcom/daaw/d40;->r:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/d40;->r:I

    iget-object v0, p0, Lcom/daaw/d40;->j:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->C()J

    move-result-wide v4

    :goto_0
    iput-wide v4, p0, Lcom/daaw/d40;->q:J

    goto :goto_1

    :cond_2
    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-nez v0, :cond_4

    invoke-interface {p1}, Lcom/daaw/a00;->h()J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/daaw/d40;->l:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/daaw/d40;->l:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/b7$a;

    iget-wide v4, v0, Lcom/daaw/b7$a;->Q0:J

    :cond_3
    cmp-long v0, v4, v6

    if-eqz v0, :cond_4

    invoke-interface {p1}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v6

    sub-long/2addr v4, v6

    iget v0, p0, Lcom/daaw/d40;->r:I

    int-to-long v6, v0

    add-long/2addr v4, v6

    goto :goto_0

    :cond_4
    :goto_1
    iget-wide v4, p0, Lcom/daaw/d40;->q:J

    iget v0, p0, Lcom/daaw/d40;->r:I

    int-to-long v6, v0

    cmp-long v0, v4, v6

    if-ltz v0, :cond_e

    invoke-interface {p1}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v4

    iget v0, p0, Lcom/daaw/d40;->r:I

    int-to-long v6, v0

    sub-long/2addr v4, v6

    iget v0, p0, Lcom/daaw/d40;->p:I

    sget v6, Lcom/daaw/b7;->L:I

    if-ne v0, v6, :cond_5

    iget-object v0, p0, Lcom/daaw/d40;->e:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v0, :cond_5

    iget-object v7, p0, Lcom/daaw/d40;->e:Landroid/util/SparseArray;

    invoke-virtual {v7, v6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/daaw/d40$c;

    iget-object v7, v7, Lcom/daaw/d40$c;->b:Lcom/daaw/qm1;

    iput-wide v4, v7, Lcom/daaw/qm1;->b:J

    iput-wide v4, v7, Lcom/daaw/qm1;->d:J

    iput-wide v4, v7, Lcom/daaw/qm1;->c:J

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_5
    iget v0, p0, Lcom/daaw/d40;->p:I

    sget v6, Lcom/daaw/b7;->i:I

    const/4 v7, 0x0

    if-ne v0, v6, :cond_7

    iput-object v7, p0, Lcom/daaw/d40;->y:Lcom/daaw/d40$c;

    iget-wide v0, p0, Lcom/daaw/d40;->q:J

    add-long/2addr v0, v4

    iput-wide v0, p0, Lcom/daaw/d40;->t:J

    iget-boolean p1, p0, Lcom/daaw/d40;->G:Z

    if-nez p1, :cond_6

    iget-object p1, p0, Lcom/daaw/d40;->D:Lcom/daaw/d00;

    new-instance v0, Lcom/daaw/da1$b;

    iget-wide v1, p0, Lcom/daaw/d40;->w:J

    invoke-direct {v0, v1, v2, v4, v5}, Lcom/daaw/da1$b;-><init>(JJ)V

    invoke-interface {p1, v0}, Lcom/daaw/d00;->d(Lcom/daaw/da1;)V

    iput-boolean v3, p0, Lcom/daaw/d40;->G:Z

    :cond_6
    const/4 p1, 0x2

    iput p1, p0, Lcom/daaw/d40;->o:I

    return v3

    :cond_7
    invoke-static {v0}, Lcom/daaw/d40;->J(I)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p1}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v0

    iget-wide v4, p0, Lcom/daaw/d40;->q:J

    add-long/2addr v0, v4

    const-wide/16 v4, 0x8

    sub-long/2addr v0, v4

    iget-object p1, p0, Lcom/daaw/d40;->l:Ljava/util/ArrayDeque;

    new-instance v2, Lcom/daaw/b7$a;

    iget v4, p0, Lcom/daaw/d40;->p:I

    invoke-direct {v2, v4, v0, v1}, Lcom/daaw/b7$a;-><init>(IJ)V

    invoke-virtual {p1, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    iget-wide v4, p0, Lcom/daaw/d40;->q:J

    iget p1, p0, Lcom/daaw/d40;->r:I

    int-to-long v6, p1

    cmp-long p1, v4, v6

    if-nez p1, :cond_8

    invoke-virtual {p0, v0, v1}, Lcom/daaw/d40;->E(J)V

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Lcom/daaw/d40;->b()V

    goto :goto_4

    :cond_9
    iget p1, p0, Lcom/daaw/d40;->p:I

    invoke-static {p1}, Lcom/daaw/d40;->K(I)Z

    move-result p1

    const-wide/32 v4, 0x7fffffff

    if-eqz p1, :cond_c

    iget p1, p0, Lcom/daaw/d40;->r:I

    if-ne p1, v1, :cond_b

    iget-wide v6, p0, Lcom/daaw/d40;->q:J

    cmp-long p1, v6, v4

    if-gtz p1, :cond_a

    new-instance p1, Lcom/daaw/rv0;

    long-to-int v0, v6

    invoke-direct {p1, v0}, Lcom/daaw/rv0;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/d40;->s:Lcom/daaw/rv0;

    iget-object v0, p0, Lcom/daaw/d40;->j:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    iget-object p1, p1, Lcom/daaw/rv0;->a:[B

    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_3

    :cond_a
    new-instance p1, Lcom/daaw/tv0;

    const-string v0, "Leaf atom with length > 2147483647 (unsupported)."

    invoke-direct {p1, v0}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    new-instance p1, Lcom/daaw/tv0;

    const-string v0, "Leaf atom defines extended atom size (unsupported)."

    invoke-direct {p1, v0}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    iget-wide v0, p0, Lcom/daaw/d40;->q:J

    cmp-long p1, v0, v4

    if-gtz p1, :cond_d

    iput-object v7, p0, Lcom/daaw/d40;->s:Lcom/daaw/rv0;

    :goto_3
    iput v3, p0, Lcom/daaw/d40;->o:I

    :goto_4
    return v3

    :cond_d
    new-instance p1, Lcom/daaw/tv0;

    const-string v0, "Skipping atom with length > 2147483647 (unsupported)."

    invoke-direct {p1, v0}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    new-instance p1, Lcom/daaw/tv0;

    const-string v0, "Atom size less than header length (unsupported)."

    invoke-direct {p1, v0}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    goto :goto_6

    :goto_5
    throw p1

    :goto_6
    goto :goto_5
.end method

.method public final G(Lcom/daaw/a00;)V
    .locals 3

    iget-wide v0, p0, Lcom/daaw/d40;->q:J

    long-to-int v1, v0

    iget v0, p0, Lcom/daaw/d40;->r:I

    sub-int/2addr v1, v0

    iget-object v0, p0, Lcom/daaw/d40;->s:Lcom/daaw/rv0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    const/16 v2, 0x8

    invoke-interface {p1, v0, v2, v1}, Lcom/daaw/a00;->f([BII)V

    new-instance v0, Lcom/daaw/b7$b;

    iget v1, p0, Lcom/daaw/d40;->p:I

    iget-object v2, p0, Lcom/daaw/d40;->s:Lcom/daaw/rv0;

    invoke-direct {v0, v1, v2}, Lcom/daaw/b7$b;-><init>(ILcom/daaw/rv0;)V

    invoke-interface {p1}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v1

    invoke-virtual {p0, v0, v1, v2}, Lcom/daaw/d40;->l(Lcom/daaw/b7$b;J)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1}, Lcom/daaw/a00;->j(I)V

    :goto_0
    invoke-interface {p1}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/daaw/d40;->E(J)V

    return-void
.end method

.method public final H(Lcom/daaw/a00;)V
    .locals 8

    iget-object v0, p0, Lcom/daaw/d40;->e:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x0

    const-wide v2, 0x7fffffffffffffffL

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_1

    iget-object v5, p0, Lcom/daaw/d40;->e:Landroid/util/SparseArray;

    invoke-virtual {v5, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/d40$c;

    iget-object v5, v5, Lcom/daaw/d40$c;->b:Lcom/daaw/qm1;

    iget-boolean v6, v5, Lcom/daaw/qm1;->r:Z

    if-eqz v6, :cond_0

    iget-wide v5, v5, Lcom/daaw/qm1;->d:J

    cmp-long v7, v5, v2

    if-gez v7, :cond_0

    iget-object v1, p0, Lcom/daaw/d40;->e:Landroid/util/SparseArray;

    invoke-virtual {v1, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/d40$c;

    move-wide v2, v5

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    if-nez v1, :cond_2

    const/4 p1, 0x3

    iput p1, p0, Lcom/daaw/d40;->o:I

    return-void

    :cond_2
    invoke-interface {p1}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v4

    sub-long/2addr v2, v4

    long-to-int v0, v2

    if-ltz v0, :cond_3

    invoke-interface {p1, v0}, Lcom/daaw/a00;->j(I)V

    iget-object v0, v1, Lcom/daaw/d40$c;->b:Lcom/daaw/qm1;

    invoke-virtual {v0, p1}, Lcom/daaw/qm1;->a(Lcom/daaw/a00;)V

    return-void

    :cond_3
    new-instance p1, Lcom/daaw/tv0;

    const-string v0, "Offset to encryption data was negative."

    invoke-direct {p1, v0}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public final I(Lcom/daaw/a00;)Z
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lcom/daaw/d40;->o:I

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x4

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-ne v2, v4, :cond_7

    iget-object v2, v0, Lcom/daaw/d40;->y:Lcom/daaw/d40$c;

    if-nez v2, :cond_3

    iget-object v2, v0, Lcom/daaw/d40;->e:Landroid/util/SparseArray;

    invoke-static {v2}, Lcom/daaw/d40;->g(Landroid/util/SparseArray;)Lcom/daaw/d40$c;

    move-result-object v2

    if-nez v2, :cond_1

    iget-wide v2, v0, Lcom/daaw/d40;->t:J

    invoke-interface/range {p1 .. p1}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v4

    sub-long/2addr v2, v4

    long-to-int v3, v2

    if-ltz v3, :cond_0

    invoke-interface {v1, v3}, Lcom/daaw/a00;->j(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/d40;->b()V

    return v7

    :cond_0
    new-instance v1, Lcom/daaw/tv0;

    const-string v2, "Offset to end of mdat was negative."

    invoke-direct {v1, v2}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v8, v2, Lcom/daaw/d40$c;->b:Lcom/daaw/qm1;

    iget-object v8, v8, Lcom/daaw/qm1;->g:[J

    iget v9, v2, Lcom/daaw/d40$c;->g:I

    aget-wide v9, v8, v9

    invoke-interface/range {p1 .. p1}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v11

    sub-long/2addr v9, v11

    long-to-int v8, v9

    if-gez v8, :cond_2

    const/4 v8, 0x0

    :cond_2
    invoke-interface {v1, v8}, Lcom/daaw/a00;->j(I)V

    iput-object v2, v0, Lcom/daaw/d40;->y:Lcom/daaw/d40$c;

    :cond_3
    iget-object v2, v0, Lcom/daaw/d40;->y:Lcom/daaw/d40$c;

    iget-object v8, v2, Lcom/daaw/d40$c;->b:Lcom/daaw/qm1;

    iget-object v8, v8, Lcom/daaw/qm1;->i:[I

    iget v9, v2, Lcom/daaw/d40$c;->e:I

    aget v8, v8, v9

    iput v8, v0, Lcom/daaw/d40;->z:I

    iget v10, v2, Lcom/daaw/d40$c;->h:I

    if-ge v9, v10, :cond_5

    invoke-interface {v1, v8}, Lcom/daaw/a00;->j(I)V

    iget-object v1, v0, Lcom/daaw/d40;->y:Lcom/daaw/d40$c;

    invoke-static {v1}, Lcom/daaw/d40$c;->a(Lcom/daaw/d40$c;)V

    iget-object v1, v0, Lcom/daaw/d40;->y:Lcom/daaw/d40$c;

    invoke-virtual {v1}, Lcom/daaw/d40$c;->d()Z

    move-result v1

    if-nez v1, :cond_4

    iput-object v3, v0, Lcom/daaw/d40;->y:Lcom/daaw/d40$c;

    :cond_4
    iput v4, v0, Lcom/daaw/d40;->o:I

    return v6

    :cond_5
    iget-object v2, v2, Lcom/daaw/d40$c;->c:Lcom/daaw/nm1;

    iget v2, v2, Lcom/daaw/nm1;->g:I

    if-ne v2, v6, :cond_6

    const/16 v2, 0x8

    sub-int/2addr v8, v2

    iput v8, v0, Lcom/daaw/d40;->z:I

    invoke-interface {v1, v2}, Lcom/daaw/a00;->j(I)V

    :cond_6
    iget-object v2, v0, Lcom/daaw/d40;->y:Lcom/daaw/d40$c;

    invoke-virtual {v2}, Lcom/daaw/d40$c;->e()I

    move-result v2

    iput v2, v0, Lcom/daaw/d40;->A:I

    iget v8, v0, Lcom/daaw/d40;->z:I

    add-int/2addr v8, v2

    iput v8, v0, Lcom/daaw/d40;->z:I

    iput v5, v0, Lcom/daaw/d40;->o:I

    iput v7, v0, Lcom/daaw/d40;->B:I

    :cond_7
    iget-object v2, v0, Lcom/daaw/d40;->y:Lcom/daaw/d40$c;

    iget-object v8, v2, Lcom/daaw/d40$c;->b:Lcom/daaw/qm1;

    iget-object v9, v2, Lcom/daaw/d40$c;->c:Lcom/daaw/nm1;

    iget-object v10, v2, Lcom/daaw/d40$c;->a:Lcom/daaw/sm1;

    iget v2, v2, Lcom/daaw/d40$c;->e:I

    iget v11, v9, Lcom/daaw/nm1;->j:I

    const-wide/16 v12, 0x3e8

    if-eqz v11, :cond_b

    iget-object v14, v0, Lcom/daaw/d40;->g:Lcom/daaw/rv0;

    iget-object v14, v14, Lcom/daaw/rv0;->a:[B

    aput-byte v7, v14, v7

    aput-byte v7, v14, v6

    const/4 v15, 0x2

    aput-byte v7, v14, v15

    add-int/lit8 v15, v11, 0x1

    rsub-int/lit8 v11, v11, 0x4

    :goto_0
    iget v4, v0, Lcom/daaw/d40;->A:I

    iget v3, v0, Lcom/daaw/d40;->z:I

    if-ge v4, v3, :cond_c

    iget v3, v0, Lcom/daaw/d40;->B:I

    if-nez v3, :cond_9

    invoke-interface {v1, v14, v11, v15}, Lcom/daaw/a00;->f([BII)V

    iget-object v3, v0, Lcom/daaw/d40;->g:Lcom/daaw/rv0;

    invoke-virtual {v3, v7}, Lcom/daaw/rv0;->J(I)V

    iget-object v3, v0, Lcom/daaw/d40;->g:Lcom/daaw/rv0;

    invoke-virtual {v3}, Lcom/daaw/rv0;->B()I

    move-result v3

    sub-int/2addr v3, v6

    iput v3, v0, Lcom/daaw/d40;->B:I

    iget-object v3, v0, Lcom/daaw/d40;->f:Lcom/daaw/rv0;

    invoke-virtual {v3, v7}, Lcom/daaw/rv0;->J(I)V

    iget-object v3, v0, Lcom/daaw/d40;->f:Lcom/daaw/rv0;

    invoke-interface {v10, v3, v5}, Lcom/daaw/sm1;->c(Lcom/daaw/rv0;I)V

    iget-object v3, v0, Lcom/daaw/d40;->g:Lcom/daaw/rv0;

    invoke-interface {v10, v3, v6}, Lcom/daaw/sm1;->c(Lcom/daaw/rv0;I)V

    iget-object v3, v0, Lcom/daaw/d40;->F:[Lcom/daaw/sm1;

    array-length v3, v3

    if-lez v3, :cond_8

    iget-object v3, v9, Lcom/daaw/nm1;->f:Lcom/google/android/exoplayer2/Format;

    iget-object v3, v3, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    aget-byte v4, v14, v5

    invoke-static {v3, v4}, Lcom/daaw/sr0;->g(Ljava/lang/String;B)Z

    move-result v3

    if-eqz v3, :cond_8

    const/4 v3, 0x1

    goto :goto_1

    :cond_8
    const/4 v3, 0x0

    :goto_1
    iput-boolean v3, v0, Lcom/daaw/d40;->C:Z

    iget v3, v0, Lcom/daaw/d40;->A:I

    add-int/lit8 v3, v3, 0x5

    iput v3, v0, Lcom/daaw/d40;->A:I

    iget v3, v0, Lcom/daaw/d40;->z:I

    add-int/2addr v3, v11

    iput v3, v0, Lcom/daaw/d40;->z:I

    const/4 v3, 0x0

    goto :goto_0

    :cond_9
    iget-boolean v4, v0, Lcom/daaw/d40;->C:Z

    if-eqz v4, :cond_a

    iget-object v4, v0, Lcom/daaw/d40;->h:Lcom/daaw/rv0;

    invoke-virtual {v4, v3}, Lcom/daaw/rv0;->G(I)V

    iget-object v3, v0, Lcom/daaw/d40;->h:Lcom/daaw/rv0;

    iget-object v3, v3, Lcom/daaw/rv0;->a:[B

    iget v4, v0, Lcom/daaw/d40;->B:I

    invoke-interface {v1, v3, v7, v4}, Lcom/daaw/a00;->f([BII)V

    iget-object v3, v0, Lcom/daaw/d40;->h:Lcom/daaw/rv0;

    iget v4, v0, Lcom/daaw/d40;->B:I

    invoke-interface {v10, v3, v4}, Lcom/daaw/sm1;->c(Lcom/daaw/rv0;I)V

    iget v3, v0, Lcom/daaw/d40;->B:I

    iget-object v4, v0, Lcom/daaw/d40;->h:Lcom/daaw/rv0;

    iget-object v5, v4, Lcom/daaw/rv0;->a:[B

    invoke-virtual {v4}, Lcom/daaw/rv0;->d()I

    move-result v4

    invoke-static {v5, v4}, Lcom/daaw/sr0;->k([BI)I

    move-result v4

    iget-object v5, v0, Lcom/daaw/d40;->h:Lcom/daaw/rv0;

    iget-object v6, v9, Lcom/daaw/nm1;->f:Lcom/google/android/exoplayer2/Format;

    iget-object v6, v6, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    const-string v7, "video/hevc"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v5, v6}, Lcom/daaw/rv0;->J(I)V

    iget-object v5, v0, Lcom/daaw/d40;->h:Lcom/daaw/rv0;

    invoke-virtual {v5, v4}, Lcom/daaw/rv0;->I(I)V

    invoke-virtual {v8, v2}, Lcom/daaw/qm1;->c(I)J

    move-result-wide v4

    mul-long v4, v4, v12

    iget-object v6, v0, Lcom/daaw/d40;->h:Lcom/daaw/rv0;

    iget-object v7, v0, Lcom/daaw/d40;->F:[Lcom/daaw/sm1;

    invoke-static {v4, v5, v6, v7}, Lcom/daaw/oe;->a(JLcom/daaw/rv0;[Lcom/daaw/sm1;)V

    goto :goto_2

    :cond_a
    const/4 v4, 0x0

    invoke-interface {v10, v1, v3, v4}, Lcom/daaw/sm1;->b(Lcom/daaw/a00;IZ)I

    move-result v3

    :goto_2
    iget v4, v0, Lcom/daaw/d40;->A:I

    add-int/2addr v4, v3

    iput v4, v0, Lcom/daaw/d40;->A:I

    iget v4, v0, Lcom/daaw/d40;->B:I

    sub-int/2addr v4, v3

    iput v4, v0, Lcom/daaw/d40;->B:I

    const/4 v3, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x1

    const/4 v7, 0x0

    goto/16 :goto_0

    :cond_b
    :goto_3
    iget v3, v0, Lcom/daaw/d40;->A:I

    iget v4, v0, Lcom/daaw/d40;->z:I

    if-ge v3, v4, :cond_c

    sub-int/2addr v4, v3

    const/4 v3, 0x0

    invoke-interface {v10, v1, v4, v3}, Lcom/daaw/sm1;->b(Lcom/daaw/a00;IZ)I

    move-result v4

    iget v5, v0, Lcom/daaw/d40;->A:I

    add-int/2addr v5, v4

    iput v5, v0, Lcom/daaw/d40;->A:I

    goto :goto_3

    :cond_c
    invoke-virtual {v8, v2}, Lcom/daaw/qm1;->c(I)J

    move-result-wide v3

    mul-long v3, v3, v12

    iget-object v1, v0, Lcom/daaw/d40;->i:Lcom/daaw/ol1;

    if-eqz v1, :cond_d

    invoke-virtual {v1, v3, v4}, Lcom/daaw/ol1;->a(J)J

    move-result-wide v3

    :cond_d
    iget-object v1, v8, Lcom/daaw/qm1;->l:[Z

    aget-boolean v1, v1, v2

    iget-boolean v2, v8, Lcom/daaw/qm1;->m:Z

    if-eqz v2, :cond_f

    const/high16 v2, 0x40000000    # 2.0f

    or-int/2addr v1, v2

    iget-object v2, v8, Lcom/daaw/qm1;->o:Lcom/daaw/pm1;

    if-eqz v2, :cond_e

    goto :goto_4

    :cond_e
    iget-object v2, v8, Lcom/daaw/qm1;->a:Lcom/daaw/qr;

    iget v2, v2, Lcom/daaw/qr;->a:I

    invoke-virtual {v9, v2}, Lcom/daaw/nm1;->a(I)Lcom/daaw/pm1;

    move-result-object v2

    :goto_4
    iget-object v2, v2, Lcom/daaw/pm1;->c:Lcom/daaw/sm1$a;

    move v13, v1

    move-object/from16 v16, v2

    goto :goto_5

    :cond_f
    move v13, v1

    const/16 v16, 0x0

    :goto_5
    iget v14, v0, Lcom/daaw/d40;->z:I

    const/4 v15, 0x0

    move-wide v11, v3

    invoke-interface/range {v10 .. v16}, Lcom/daaw/sm1;->a(JIIILcom/daaw/sm1$a;)V

    invoke-virtual {v0, v3, v4}, Lcom/daaw/d40;->o(J)V

    iget-object v1, v0, Lcom/daaw/d40;->y:Lcom/daaw/d40$c;

    invoke-virtual {v1}, Lcom/daaw/d40$c;->d()Z

    move-result v1

    if-nez v1, :cond_10

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/daaw/d40;->y:Lcom/daaw/d40$c;

    :cond_10
    const/4 v1, 0x3

    iput v1, v0, Lcom/daaw/d40;->o:I

    const/4 v1, 0x1

    return v1
.end method

.method public a()V
    .locals 0

    return-void
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/d40;->o:I

    iput v0, p0, Lcom/daaw/d40;->r:I

    return-void
.end method

.method public c(Lcom/daaw/a00;)Z
    .locals 0

    invoke-static {p1}, Lcom/daaw/be1;->b(Lcom/daaw/a00;)Z

    move-result p1

    return p1
.end method

.method public d(Lcom/daaw/a00;Lcom/daaw/iy0;)I
    .locals 1

    :cond_0
    :goto_0
    iget p2, p0, Lcom/daaw/d40;->o:I

    if-eqz p2, :cond_3

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/daaw/d40;->I(Lcom/daaw/a00;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-virtual {p0, p1}, Lcom/daaw/d40;->H(Lcom/daaw/a00;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1}, Lcom/daaw/d40;->G(Lcom/daaw/a00;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0, p1}, Lcom/daaw/d40;->F(Lcom/daaw/a00;)Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p1, -0x1

    return p1
.end method

.method public f(JJ)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/d40;->e:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p1

    const/4 p2, 0x0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    iget-object v1, p0, Lcom/daaw/d40;->e:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/d40$c;

    invoke-virtual {v1}, Lcom/daaw/d40$c;->f()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/d40;->m:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    iput p2, p0, Lcom/daaw/d40;->u:I

    iput-wide p3, p0, Lcom/daaw/d40;->v:J

    iget-object p1, p0, Lcom/daaw/d40;->l:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    invoke-virtual {p0}, Lcom/daaw/d40;->b()V

    return-void
.end method

.method public final h()V
    .locals 8

    iget-object v0, p0, Lcom/daaw/d40;->E:[Lcom/daaw/sm1;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_2

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/daaw/sm1;

    iput-object v0, p0, Lcom/daaw/d40;->E:[Lcom/daaw/sm1;

    iget-object v3, p0, Lcom/daaw/d40;->n:Lcom/daaw/sm1;

    if-eqz v3, :cond_0

    aput-object v3, v0, v1

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v4, p0, Lcom/daaw/d40;->a:I

    const/4 v5, 0x4

    and-int/2addr v4, v5

    if-eqz v4, :cond_1

    add-int/lit8 v4, v3, 0x1

    iget-object v6, p0, Lcom/daaw/d40;->D:Lcom/daaw/d00;

    iget-object v7, p0, Lcom/daaw/d40;->e:Landroid/util/SparseArray;

    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    move-result v7

    invoke-interface {v6, v7, v5}, Lcom/daaw/d00;->a(II)Lcom/daaw/sm1;

    move-result-object v5

    aput-object v5, v0, v3

    move v3, v4

    :cond_1
    iget-object v0, p0, Lcom/daaw/d40;->E:[Lcom/daaw/sm1;

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/sm1;

    iput-object v0, p0, Lcom/daaw/d40;->E:[Lcom/daaw/sm1;

    array-length v3, v0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_2

    aget-object v5, v0, v4

    sget-object v6, Lcom/daaw/d40;->K:Lcom/google/android/exoplayer2/Format;

    invoke-interface {v5, v6}, Lcom/daaw/sm1;->d(Lcom/google/android/exoplayer2/Format;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/daaw/d40;->F:[Lcom/daaw/sm1;

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/daaw/d40;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lcom/daaw/sm1;

    iput-object v0, p0, Lcom/daaw/d40;->F:[Lcom/daaw/sm1;

    :goto_2
    iget-object v0, p0, Lcom/daaw/d40;->F:[Lcom/daaw/sm1;

    array-length v0, v0

    if-ge v1, v0, :cond_3

    iget-object v0, p0, Lcom/daaw/d40;->D:Lcom/daaw/d00;

    iget-object v3, p0, Lcom/daaw/d40;->e:Landroid/util/SparseArray;

    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v3

    add-int/2addr v3, v2

    add-int/2addr v3, v1

    const/4 v4, 0x3

    invoke-interface {v0, v3, v4}, Lcom/daaw/d00;->a(II)Lcom/daaw/sm1;

    move-result-object v0

    iget-object v3, p0, Lcom/daaw/d40;->c:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/exoplayer2/Format;

    invoke-interface {v0, v3}, Lcom/daaw/sm1;->d(Lcom/google/android/exoplayer2/Format;)V

    iget-object v3, p0, Lcom/daaw/d40;->F:[Lcom/daaw/sm1;

    aput-object v0, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_3
    return-void
.end method

.method public i(Lcom/daaw/d00;)V
    .locals 3

    iput-object p1, p0, Lcom/daaw/d40;->D:Lcom/daaw/d00;

    iget-object v0, p0, Lcom/daaw/d40;->b:Lcom/daaw/nm1;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/daaw/d40$c;

    iget v0, v0, Lcom/daaw/nm1;->b:I

    const/4 v2, 0x0

    invoke-interface {p1, v2, v0}, Lcom/daaw/d00;->a(II)Lcom/daaw/sm1;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/daaw/d40$c;-><init>(Lcom/daaw/sm1;)V

    iget-object p1, p0, Lcom/daaw/d40;->b:Lcom/daaw/nm1;

    new-instance v0, Lcom/daaw/qr;

    invoke-direct {v0, v2, v2, v2, v2}, Lcom/daaw/qr;-><init>(IIII)V

    invoke-virtual {v1, p1, v0}, Lcom/daaw/d40$c;->c(Lcom/daaw/nm1;Lcom/daaw/qr;)V

    iget-object p1, p0, Lcom/daaw/d40;->e:Landroid/util/SparseArray;

    invoke-virtual {p1, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/daaw/d40;->h()V

    iget-object p1, p0, Lcom/daaw/d40;->D:Lcom/daaw/d00;

    invoke-interface {p1}, Lcom/daaw/d00;->n()V

    :cond_0
    return-void
.end method

.method public final j(Lcom/daaw/b7$a;)V
    .locals 2

    iget v0, p1, Lcom/daaw/b7;->a:I

    sget v1, Lcom/daaw/b7;->C:I

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/d40;->n(Lcom/daaw/b7$a;)V

    goto :goto_0

    :cond_0
    sget v1, Lcom/daaw/b7;->L:I

    if-ne v0, v1, :cond_1

    invoke-virtual {p0, p1}, Lcom/daaw/d40;->m(Lcom/daaw/b7$a;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/d40;->l:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/d40;->l:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/b7$a;

    invoke-virtual {v0, p1}, Lcom/daaw/b7$a;->d(Lcom/daaw/b7$a;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final k(Lcom/daaw/rv0;)V
    .locals 12

    iget-object v0, p0, Lcom/daaw/d40;->E:[Lcom/daaw/sm1;

    if-eqz v0, :cond_3

    array-length v0, v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    const/16 v0, 0xc

    invoke-virtual {p1, v0}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result v8

    invoke-virtual {p1}, Lcom/daaw/rv0;->r()Ljava/lang/String;

    invoke-virtual {p1}, Lcom/daaw/rv0;->r()Ljava/lang/String;

    invoke-virtual {p1}, Lcom/daaw/rv0;->z()J

    move-result-wide v5

    invoke-virtual {p1}, Lcom/daaw/rv0;->z()J

    move-result-wide v1

    const-wide/32 v3, 0xf4240

    invoke-static/range {v1 .. v6}, Lcom/daaw/sq1;->T(JJJ)J

    move-result-wide v9

    iget-object v1, p0, Lcom/daaw/d40;->E:[Lcom/daaw/sm1;

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_1

    aget-object v5, v1, v4

    invoke-virtual {p1, v0}, Lcom/daaw/rv0;->J(I)V

    invoke-interface {v5, p1, v8}, Lcom/daaw/sm1;->c(Lcom/daaw/rv0;I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iget-wide v0, p0, Lcom/daaw/d40;->x:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v0, v4

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/daaw/d40;->E:[Lcom/daaw/sm1;

    array-length v0, p1

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v0, :cond_3

    aget-object v1, p1, v11

    iget-wide v2, p0, Lcom/daaw/d40;->x:J

    add-long/2addr v2, v9

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v5, v8

    invoke-interface/range {v1 .. v7}, Lcom/daaw/sm1;->a(JIIILcom/daaw/sm1$a;)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/daaw/d40;->m:Ljava/util/ArrayDeque;

    new-instance v0, Lcom/daaw/d40$b;

    invoke-direct {v0, v9, v10, v8}, Lcom/daaw/d40$b;-><init>(JI)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    iget p1, p0, Lcom/daaw/d40;->u:I

    add-int/2addr p1, v8

    iput p1, p0, Lcom/daaw/d40;->u:I

    :cond_3
    :goto_2
    return-void
.end method

.method public final l(Lcom/daaw/b7$b;J)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/d40;->l:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p2, p0, Lcom/daaw/d40;->l:Ljava/util/ArrayDeque;

    invoke-virtual {p2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/b7$a;

    invoke-virtual {p2, p1}, Lcom/daaw/b7$a;->e(Lcom/daaw/b7$b;)V

    goto :goto_0

    :cond_0
    iget v0, p1, Lcom/daaw/b7;->a:I

    sget v1, Lcom/daaw/b7;->B:I

    if-ne v0, v1, :cond_1

    iget-object p1, p1, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    invoke-static {p1, p2, p3}, Lcom/daaw/d40;->w(Lcom/daaw/rv0;J)Landroid/util/Pair;

    move-result-object p1

    iget-object p2, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p2

    iput-wide p2, p0, Lcom/daaw/d40;->x:J

    iget-object p2, p0, Lcom/daaw/d40;->D:Lcom/daaw/d00;

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/da1;

    invoke-interface {p2, p1}, Lcom/daaw/d00;->d(Lcom/daaw/da1;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/d40;->G:Z

    goto :goto_0

    :cond_1
    sget p2, Lcom/daaw/b7;->H0:I

    if-ne v0, p2, :cond_2

    iget-object p1, p1, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    invoke-virtual {p0, p1}, Lcom/daaw/d40;->k(Lcom/daaw/rv0;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final m(Lcom/daaw/b7$a;)V
    .locals 7

    iget-object v0, p0, Lcom/daaw/d40;->e:Landroid/util/SparseArray;

    iget v1, p0, Lcom/daaw/d40;->a:I

    iget-object v2, p0, Lcom/daaw/d40;->k:[B

    invoke-static {p1, v0, v1, v2}, Lcom/daaw/d40;->q(Lcom/daaw/b7$a;Landroid/util/SparseArray;I[B)V

    iget-object v0, p0, Lcom/daaw/d40;->d:Lcom/google/android/exoplayer2/drm/DrmInitData;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lcom/daaw/b7$a;->R0:Ljava/util/List;

    invoke-static {p1}, Lcom/daaw/d40;->e(Ljava/util/List;)Lcom/google/android/exoplayer2/drm/DrmInitData;

    move-result-object p1

    :goto_0
    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object v1, p0, Lcom/daaw/d40;->e:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_1

    iget-object v3, p0, Lcom/daaw/d40;->e:Landroid/util/SparseArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/d40$c;

    invoke-virtual {v3, p1}, Lcom/daaw/d40$c;->i(Lcom/google/android/exoplayer2/drm/DrmInitData;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    iget-wide v1, p0, Lcom/daaw/d40;->v:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v1, v3

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/daaw/d40;->e:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p1

    :goto_2
    if-ge v0, p1, :cond_2

    iget-object v1, p0, Lcom/daaw/d40;->e:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/d40$c;

    iget-wide v5, p0, Lcom/daaw/d40;->v:J

    invoke-virtual {v1, v5, v6}, Lcom/daaw/d40$c;->g(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    iput-wide v3, p0, Lcom/daaw/d40;->v:J

    :cond_3
    return-void
.end method

.method public final n(Lcom/daaw/b7$a;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lcom/daaw/d40;->b:Lcom/daaw/nm1;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v5, "Unexpected moov box."

    invoke-static {v2, v5}, Lcom/daaw/s6;->g(ZLjava/lang/Object;)V

    iget-object v2, v0, Lcom/daaw/d40;->d:Lcom/google/android/exoplayer2/drm/DrmInitData;

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v2, v1, Lcom/daaw/b7$a;->R0:Ljava/util/List;

    invoke-static {v2}, Lcom/daaw/d40;->e(Ljava/util/List;)Lcom/google/android/exoplayer2/drm/DrmInitData;

    move-result-object v2

    :goto_1
    sget v5, Lcom/daaw/b7;->N:I

    invoke-virtual {v1, v5}, Lcom/daaw/b7$a;->f(I)Lcom/daaw/b7$a;

    move-result-object v5

    new-instance v12, Landroid/util/SparseArray;

    invoke-direct {v12}, Landroid/util/SparseArray;-><init>()V

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    iget-object v8, v5, Lcom/daaw/b7$a;->R0:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    move-wide v13, v6

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v8, :cond_4

    iget-object v7, v5, Lcom/daaw/b7$a;->R0:Ljava/util/List;

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/daaw/b7$b;

    iget v9, v7, Lcom/daaw/b7;->a:I

    sget v10, Lcom/daaw/b7;->z:I

    if-ne v9, v10, :cond_2

    iget-object v7, v7, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    invoke-static {v7}, Lcom/daaw/d40;->A(Lcom/daaw/rv0;)Landroid/util/Pair;

    move-result-object v7

    iget-object v9, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v7, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-virtual {v12, v9, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_3

    :cond_2
    sget v10, Lcom/daaw/b7;->O:I

    if-ne v9, v10, :cond_3

    iget-object v7, v7, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    invoke-static {v7}, Lcom/daaw/d40;->p(Lcom/daaw/rv0;)J

    move-result-wide v9

    move-wide v13, v9

    :cond_3
    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_4
    new-instance v15, Landroid/util/SparseArray;

    invoke-direct {v15}, Landroid/util/SparseArray;-><init>()V

    iget-object v5, v1, Lcom/daaw/b7$a;->S0:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v11

    const/4 v10, 0x0

    :goto_4
    if-ge v10, v11, :cond_8

    iget-object v5, v1, Lcom/daaw/b7$a;->S0:Ljava/util/List;

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/b7$a;

    iget v6, v5, Lcom/daaw/b7;->a:I

    sget v7, Lcom/daaw/b7;->E:I

    if-ne v6, v7, :cond_6

    sget v6, Lcom/daaw/b7;->D:I

    invoke-virtual {v1, v6}, Lcom/daaw/b7$a;->g(I)Lcom/daaw/b7$b;

    move-result-object v6

    iget v7, v0, Lcom/daaw/d40;->a:I

    and-int/lit8 v7, v7, 0x10

    if-eqz v7, :cond_5

    const/16 v16, 0x1

    goto :goto_5

    :cond_5
    const/16 v16, 0x0

    :goto_5
    const/16 v17, 0x0

    move-wide v7, v13

    move-object v9, v2

    move/from16 v18, v10

    move/from16 v10, v16

    move/from16 v16, v11

    move/from16 v11, v17

    invoke-static/range {v5 .. v11}, Lcom/daaw/c7;->u(Lcom/daaw/b7$a;Lcom/daaw/b7$b;JLcom/google/android/exoplayer2/drm/DrmInitData;ZZ)Lcom/daaw/nm1;

    move-result-object v5

    if-eqz v5, :cond_7

    iget v6, v5, Lcom/daaw/nm1;->a:I

    invoke-virtual {v15, v6, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_6

    :cond_6
    move/from16 v18, v10

    move/from16 v16, v11

    :cond_7
    :goto_6
    add-int/lit8 v10, v18, 0x1

    move/from16 v11, v16

    goto :goto_4

    :cond_8
    invoke-virtual {v15}, Landroid/util/SparseArray;->size()I

    move-result v1

    iget-object v2, v0, Lcom/daaw/d40;->e:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-nez v2, :cond_a

    :goto_7
    if-ge v4, v1, :cond_9

    invoke-virtual {v15, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/nm1;

    new-instance v3, Lcom/daaw/d40$c;

    iget-object v5, v0, Lcom/daaw/d40;->D:Lcom/daaw/d00;

    iget v6, v2, Lcom/daaw/nm1;->b:I

    invoke-interface {v5, v4, v6}, Lcom/daaw/d00;->a(II)Lcom/daaw/sm1;

    move-result-object v5

    invoke-direct {v3, v5}, Lcom/daaw/d40$c;-><init>(Lcom/daaw/sm1;)V

    iget v5, v2, Lcom/daaw/nm1;->a:I

    invoke-virtual {v12, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/qr;

    invoke-virtual {v3, v2, v5}, Lcom/daaw/d40$c;->c(Lcom/daaw/nm1;Lcom/daaw/qr;)V

    iget-object v5, v0, Lcom/daaw/d40;->e:Landroid/util/SparseArray;

    iget v6, v2, Lcom/daaw/nm1;->a:I

    invoke-virtual {v5, v6, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-wide v5, v0, Lcom/daaw/d40;->w:J

    iget-wide v2, v2, Lcom/daaw/nm1;->e:J

    invoke-static {v5, v6, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/daaw/d40;->w:J

    add-int/lit8 v4, v4, 0x1

    goto :goto_7

    :cond_9
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/d40;->h()V

    iget-object v1, v0, Lcom/daaw/d40;->D:Lcom/daaw/d00;

    invoke-interface {v1}, Lcom/daaw/d00;->n()V

    goto :goto_a

    :cond_a
    iget-object v2, v0, Lcom/daaw/d40;->e:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ne v2, v1, :cond_b

    goto :goto_8

    :cond_b
    const/4 v3, 0x0

    :goto_8
    invoke-static {v3}, Lcom/daaw/s6;->f(Z)V

    :goto_9
    if-ge v4, v1, :cond_c

    invoke-virtual {v15, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/nm1;

    iget-object v3, v0, Lcom/daaw/d40;->e:Landroid/util/SparseArray;

    iget v5, v2, Lcom/daaw/nm1;->a:I

    invoke-virtual {v3, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/d40$c;

    iget v5, v2, Lcom/daaw/nm1;->a:I

    invoke-virtual {v12, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/qr;

    invoke-virtual {v3, v2, v5}, Lcom/daaw/d40$c;->c(Lcom/daaw/nm1;Lcom/daaw/qr;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_9

    :cond_c
    :goto_a
    return-void
.end method

.method public final o(J)V
    .locals 11

    :cond_0
    iget-object v0, p0, Lcom/daaw/d40;->m:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/d40;->m:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/d40$b;

    iget v1, p0, Lcom/daaw/d40;->u:I

    iget v2, v0, Lcom/daaw/d40$b;->b:I

    sub-int/2addr v1, v2

    iput v1, p0, Lcom/daaw/d40;->u:I

    iget-object v1, p0, Lcom/daaw/d40;->E:[Lcom/daaw/sm1;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    iget-wide v5, v0, Lcom/daaw/d40$b;->a:J

    add-long/2addr v5, p1

    const/4 v7, 0x1

    iget v8, v0, Lcom/daaw/d40$b;->b:I

    iget v9, p0, Lcom/daaw/d40;->u:I

    const/4 v10, 0x0

    invoke-interface/range {v4 .. v10}, Lcom/daaw/sm1;->a(JIIILcom/daaw/sm1$a;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
