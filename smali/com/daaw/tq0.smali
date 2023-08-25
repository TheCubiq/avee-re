.class public final Lcom/daaw/tq0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zz;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/tq0$b;
    }
.end annotation


# static fields
.field public static final o:Lcom/daaw/e00;

.field public static final p:I

.field public static final q:I

.field public static final r:I


# instance fields
.field public final a:I

.field public final b:J

.field public final c:Lcom/daaw/rv0;

.field public final d:Lcom/daaw/yq0;

.field public final e:Lcom/daaw/y50;

.field public final f:Lcom/daaw/re0;

.field public g:Lcom/daaw/d00;

.field public h:Lcom/daaw/sm1;

.field public i:I

.field public j:Lcom/google/android/exoplayer2/metadata/Metadata;

.field public k:Lcom/daaw/tq0$b;

.field public l:J

.field public m:J

.field public n:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/tq0$a;

    invoke-direct {v0}, Lcom/daaw/tq0$a;-><init>()V

    sput-object v0, Lcom/daaw/tq0;->o:Lcom/daaw/e00;

    const-string v0, "Xing"

    invoke-static {v0}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/tq0;->p:I

    const-string v0, "Info"

    invoke-static {v0}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/tq0;->q:I

    const-string v0, "VBRI"

    invoke-static {v0}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/tq0;->r:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/daaw/tq0;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {p0, p1, v0, v1}, Lcom/daaw/tq0;-><init>(IJ)V

    return-void
.end method

.method public constructor <init>(IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/tq0;->a:I

    iput-wide p2, p0, Lcom/daaw/tq0;->b:J

    new-instance p1, Lcom/daaw/rv0;

    const/16 p2, 0xa

    invoke-direct {p1, p2}, Lcom/daaw/rv0;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/tq0;->c:Lcom/daaw/rv0;

    new-instance p1, Lcom/daaw/yq0;

    invoke-direct {p1}, Lcom/daaw/yq0;-><init>()V

    iput-object p1, p0, Lcom/daaw/tq0;->d:Lcom/daaw/yq0;

    new-instance p1, Lcom/daaw/y50;

    invoke-direct {p1}, Lcom/daaw/y50;-><init>()V

    iput-object p1, p0, Lcom/daaw/tq0;->e:Lcom/daaw/y50;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/daaw/tq0;->l:J

    new-instance p1, Lcom/daaw/re0;

    invoke-direct {p1}, Lcom/daaw/re0;-><init>()V

    iput-object p1, p0, Lcom/daaw/tq0;->f:Lcom/daaw/re0;

    return-void
.end method

.method public static e(Lcom/daaw/rv0;I)I
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/rv0;->d()I

    move-result v0

    add-int/lit8 v1, p1, 0x4

    if-lt v0, v1, :cond_1

    invoke-virtual {p0, p1}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result p1

    sget v0, Lcom/daaw/tq0;->p:I

    if-eq p1, v0, :cond_0

    sget v0, Lcom/daaw/tq0;->q:I

    if-ne p1, v0, :cond_1

    :cond_0
    return p1

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/rv0;->d()I

    move-result p1

    const/16 v0, 0x28

    if-lt p1, v0, :cond_2

    const/16 p1, 0x24

    invoke-virtual {p0, p1}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result p0

    sget p1, Lcom/daaw/tq0;->r:I

    if-ne p0, p1, :cond_2

    return p1

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static g(IJ)Z
    .locals 4

    const v0, -0x1f400

    and-int/2addr p0, v0

    int-to-long v0, p0

    const-wide/32 v2, -0x1f400

    and-long/2addr p1, v2

    cmp-long p0, v0, p1

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public final b(Lcom/daaw/a00;)Lcom/daaw/tq0$b;
    .locals 8

    iget-object v0, p0, Lcom/daaw/tq0;->c:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/a00;->k([BII)V

    iget-object v0, p0, Lcom/daaw/tq0;->c:Lcom/daaw/rv0;

    invoke-virtual {v0, v1}, Lcom/daaw/rv0;->J(I)V

    iget-object v0, p0, Lcom/daaw/tq0;->c:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->i()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/tq0;->d:Lcom/daaw/yq0;

    invoke-static {v0, v1}, Lcom/daaw/yq0;->b(ILcom/daaw/yq0;)Z

    new-instance v0, Lcom/daaw/jj;

    invoke-interface {p1}, Lcom/daaw/a00;->h()J

    move-result-wide v3

    invoke-interface {p1}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v5

    iget-object v7, p0, Lcom/daaw/tq0;->d:Lcom/daaw/yq0;

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lcom/daaw/jj;-><init>(JJLcom/daaw/yq0;)V

    return-object v0
.end method

.method public c(Lcom/daaw/a00;)Z
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/daaw/tq0;->k(Lcom/daaw/a00;Z)Z

    move-result p1

    return p1
.end method

.method public d(Lcom/daaw/a00;Lcom/daaw/iy0;)I
    .locals 19

    move-object/from16 v0, p0

    iget v1, v0, Lcom/daaw/tq0;->i:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    move-object/from16 v2, p1

    :try_start_0
    invoke-virtual {v0, v2, v1}, Lcom/daaw/tq0;->k(Lcom/daaw/a00;Z)Z
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v1, -0x1

    return v1

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    iget-object v1, v0, Lcom/daaw/tq0;->k:Lcom/daaw/tq0$b;

    if-nez v1, :cond_4

    invoke-virtual/range {p0 .. p1}, Lcom/daaw/tq0;->h(Lcom/daaw/a00;)Lcom/daaw/tq0$b;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/tq0;->k:Lcom/daaw/tq0$b;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lcom/daaw/da1;->e()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, v0, Lcom/daaw/tq0;->a:I

    and-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_2

    :cond_1
    invoke-virtual/range {p0 .. p1}, Lcom/daaw/tq0;->b(Lcom/daaw/a00;)Lcom/daaw/tq0$b;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/tq0;->k:Lcom/daaw/tq0$b;

    :cond_2
    iget-object v1, v0, Lcom/daaw/tq0;->g:Lcom/daaw/d00;

    iget-object v3, v0, Lcom/daaw/tq0;->k:Lcom/daaw/tq0$b;

    invoke-interface {v1, v3}, Lcom/daaw/d00;->d(Lcom/daaw/da1;)V

    iget-object v1, v0, Lcom/daaw/tq0;->h:Lcom/daaw/sm1;

    const/4 v3, 0x0

    iget-object v4, v0, Lcom/daaw/tq0;->d:Lcom/daaw/yq0;

    iget-object v5, v4, Lcom/daaw/yq0;->b:Ljava/lang/String;

    const/4 v6, 0x0

    const/4 v7, -0x1

    const/16 v8, 0x1000

    iget v9, v4, Lcom/daaw/yq0;->e:I

    iget v10, v4, Lcom/daaw/yq0;->d:I

    const/4 v11, -0x1

    iget-object v4, v0, Lcom/daaw/tq0;->e:Lcom/daaw/y50;

    iget v12, v4, Lcom/daaw/y50;->a:I

    iget v13, v4, Lcom/daaw/y50;->b:I

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    iget v4, v0, Lcom/daaw/tq0;->a:I

    and-int/lit8 v4, v4, 0x2

    if-eqz v4, :cond_3

    const/4 v4, 0x0

    goto :goto_1

    :cond_3
    iget-object v4, v0, Lcom/daaw/tq0;->j:Lcom/google/android/exoplayer2/metadata/Metadata;

    :goto_1
    move-object/from16 v18, v4

    move-object v4, v5

    move-object v5, v6

    move v6, v7

    move v7, v8

    move v8, v9

    move v9, v10

    move v10, v11

    move v11, v12

    move v12, v13

    move-object v13, v14

    move-object v14, v15

    move/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    invoke-static/range {v3 .. v17}, Lcom/google/android/exoplayer2/Format;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIILjava/util/List;Lcom/google/android/exoplayer2/drm/DrmInitData;ILjava/lang/String;Lcom/google/android/exoplayer2/metadata/Metadata;)Lcom/google/android/exoplayer2/Format;

    move-result-object v3

    invoke-interface {v1, v3}, Lcom/daaw/sm1;->d(Lcom/google/android/exoplayer2/Format;)V

    :cond_4
    invoke-virtual/range {p0 .. p1}, Lcom/daaw/tq0;->j(Lcom/daaw/a00;)I

    move-result v1

    return v1
.end method

.method public f(JJ)V
    .locals 0

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/tq0;->i:I

    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p2, p0, Lcom/daaw/tq0;->l:J

    const-wide/16 p2, 0x0

    iput-wide p2, p0, Lcom/daaw/tq0;->m:J

    iput p1, p0, Lcom/daaw/tq0;->n:I

    return-void
.end method

.method public final h(Lcom/daaw/a00;)Lcom/daaw/tq0$b;
    .locals 9

    new-instance v5, Lcom/daaw/rv0;

    iget-object v0, p0, Lcom/daaw/tq0;->d:Lcom/daaw/yq0;

    iget v0, v0, Lcom/daaw/yq0;->c:I

    invoke-direct {v5, v0}, Lcom/daaw/rv0;-><init>(I)V

    iget-object v0, v5, Lcom/daaw/rv0;->a:[B

    iget-object v1, p0, Lcom/daaw/tq0;->d:Lcom/daaw/yq0;

    iget v1, v1, Lcom/daaw/yq0;->c:I

    const/4 v6, 0x0

    invoke-interface {p1, v0, v6, v1}, Lcom/daaw/a00;->k([BII)V

    iget-object v0, p0, Lcom/daaw/tq0;->d:Lcom/daaw/yq0;

    iget v1, v0, Lcom/daaw/yq0;->a:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    const/16 v3, 0x15

    iget v0, v0, Lcom/daaw/yq0;->e:I

    if-eqz v1, :cond_0

    if-eq v0, v2, :cond_1

    const/16 v3, 0x24

    const/16 v7, 0x24

    goto :goto_0

    :cond_0
    if-eq v0, v2, :cond_2

    :cond_1
    const/16 v7, 0x15

    goto :goto_0

    :cond_2
    const/16 v3, 0xd

    const/16 v7, 0xd

    :goto_0
    invoke-static {v5, v7}, Lcom/daaw/tq0;->e(Lcom/daaw/rv0;I)I

    move-result v8

    sget v0, Lcom/daaw/tq0;->p:I

    if-eq v8, v0, :cond_5

    sget v0, Lcom/daaw/tq0;->q:I

    if-ne v8, v0, :cond_3

    goto :goto_1

    :cond_3
    sget v0, Lcom/daaw/tq0;->r:I

    if-ne v8, v0, :cond_4

    invoke-interface {p1}, Lcom/daaw/a00;->h()J

    move-result-wide v0

    invoke-interface {p1}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v2

    iget-object v4, p0, Lcom/daaw/tq0;->d:Lcom/daaw/yq0;

    invoke-static/range {v0 .. v5}, Lcom/daaw/as1;->a(JJLcom/daaw/yq0;Lcom/daaw/rv0;)Lcom/daaw/as1;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/tq0;->d:Lcom/daaw/yq0;

    iget v1, v1, Lcom/daaw/yq0;->c:I

    invoke-interface {p1, v1}, Lcom/daaw/a00;->j(I)V

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    invoke-interface {p1}, Lcom/daaw/a00;->i()V

    goto :goto_2

    :cond_5
    :goto_1
    invoke-interface {p1}, Lcom/daaw/a00;->h()J

    move-result-wide v0

    invoke-interface {p1}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v2

    iget-object v4, p0, Lcom/daaw/tq0;->d:Lcom/daaw/yq0;

    invoke-static/range {v0 .. v5}, Lcom/daaw/fz1;->a(JJLcom/daaw/yq0;Lcom/daaw/rv0;)Lcom/daaw/fz1;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v1, p0, Lcom/daaw/tq0;->e:Lcom/daaw/y50;

    invoke-virtual {v1}, Lcom/daaw/y50;->a()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-interface {p1}, Lcom/daaw/a00;->i()V

    add-int/lit16 v7, v7, 0x8d

    invoke-interface {p1, v7}, Lcom/daaw/a00;->g(I)V

    iget-object v1, p0, Lcom/daaw/tq0;->c:Lcom/daaw/rv0;

    iget-object v1, v1, Lcom/daaw/rv0;->a:[B

    const/4 v2, 0x3

    invoke-interface {p1, v1, v6, v2}, Lcom/daaw/a00;->k([BII)V

    iget-object v1, p0, Lcom/daaw/tq0;->c:Lcom/daaw/rv0;

    invoke-virtual {v1, v6}, Lcom/daaw/rv0;->J(I)V

    iget-object v1, p0, Lcom/daaw/tq0;->e:Lcom/daaw/y50;

    iget-object v2, p0, Lcom/daaw/tq0;->c:Lcom/daaw/rv0;

    invoke-virtual {v2}, Lcom/daaw/rv0;->A()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/daaw/y50;->d(I)Z

    :cond_6
    iget-object v1, p0, Lcom/daaw/tq0;->d:Lcom/daaw/yq0;

    iget v1, v1, Lcom/daaw/yq0;->c:I

    invoke-interface {p1, v1}, Lcom/daaw/a00;->j(I)V

    if-eqz v0, :cond_7

    invoke-interface {v0}, Lcom/daaw/da1;->e()Z

    move-result v1

    if-nez v1, :cond_7

    sget v1, Lcom/daaw/tq0;->q:I

    if-ne v8, v1, :cond_7

    invoke-virtual {p0, p1}, Lcom/daaw/tq0;->b(Lcom/daaw/a00;)Lcom/daaw/tq0$b;

    move-result-object p1

    return-object p1

    :cond_7
    :goto_2
    return-object v0
.end method

.method public i(Lcom/daaw/d00;)V
    .locals 2

    iput-object p1, p0, Lcom/daaw/tq0;->g:Lcom/daaw/d00;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lcom/daaw/d00;->a(II)Lcom/daaw/sm1;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/tq0;->h:Lcom/daaw/sm1;

    iget-object p1, p0, Lcom/daaw/tq0;->g:Lcom/daaw/d00;

    invoke-interface {p1}, Lcom/daaw/d00;->n()V

    return-void
.end method

.method public final j(Lcom/daaw/a00;)I
    .locals 13

    iget v0, p0, Lcom/daaw/tq0;->n:I

    const/4 v1, 0x1

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-nez v0, :cond_4

    invoke-interface {p1}, Lcom/daaw/a00;->i()V

    iget-object v0, p0, Lcom/daaw/tq0;->c:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    const/4 v4, 0x4

    invoke-interface {p1, v0, v3, v4, v1}, Lcom/daaw/a00;->d([BIIZ)Z

    move-result v0

    if-nez v0, :cond_0

    return v2

    :cond_0
    iget-object v0, p0, Lcom/daaw/tq0;->c:Lcom/daaw/rv0;

    invoke-virtual {v0, v3}, Lcom/daaw/rv0;->J(I)V

    iget-object v0, p0, Lcom/daaw/tq0;->c:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->i()I

    move-result v0

    iget v4, p0, Lcom/daaw/tq0;->i:I

    int-to-long v4, v4

    invoke-static {v0, v4, v5}, Lcom/daaw/tq0;->g(IJ)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {v0}, Lcom/daaw/yq0;->a(I)I

    move-result v4

    if-ne v4, v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v4, p0, Lcom/daaw/tq0;->d:Lcom/daaw/yq0;

    invoke-static {v0, v4}, Lcom/daaw/yq0;->b(ILcom/daaw/yq0;)Z

    iget-wide v4, p0, Lcom/daaw/tq0;->l:J

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v4, v6

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/tq0;->k:Lcom/daaw/tq0$b;

    invoke-interface {p1}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v4

    invoke-interface {v0, v4, v5}, Lcom/daaw/tq0$b;->b(J)J

    move-result-wide v4

    iput-wide v4, p0, Lcom/daaw/tq0;->l:J

    iget-wide v4, p0, Lcom/daaw/tq0;->b:J

    cmp-long v0, v4, v6

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/tq0;->k:Lcom/daaw/tq0$b;

    const-wide/16 v4, 0x0

    invoke-interface {v0, v4, v5}, Lcom/daaw/tq0$b;->b(J)J

    move-result-wide v4

    iget-wide v6, p0, Lcom/daaw/tq0;->l:J

    iget-wide v8, p0, Lcom/daaw/tq0;->b:J

    sub-long/2addr v8, v4

    add-long/2addr v6, v8

    iput-wide v6, p0, Lcom/daaw/tq0;->l:J

    :cond_2
    iget-object v0, p0, Lcom/daaw/tq0;->d:Lcom/daaw/yq0;

    iget v0, v0, Lcom/daaw/yq0;->c:I

    iput v0, p0, Lcom/daaw/tq0;->n:I

    goto :goto_1

    :cond_3
    :goto_0
    invoke-interface {p1, v1}, Lcom/daaw/a00;->j(I)V

    iput v3, p0, Lcom/daaw/tq0;->i:I

    return v3

    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/daaw/tq0;->h:Lcom/daaw/sm1;

    iget v4, p0, Lcom/daaw/tq0;->n:I

    invoke-interface {v0, p1, v4, v1}, Lcom/daaw/sm1;->b(Lcom/daaw/a00;IZ)I

    move-result p1

    if-ne p1, v2, :cond_5

    return v2

    :cond_5
    iget v0, p0, Lcom/daaw/tq0;->n:I

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/daaw/tq0;->n:I

    if-lez v0, :cond_6

    return v3

    :cond_6
    iget-wide v0, p0, Lcom/daaw/tq0;->l:J

    iget-wide v4, p0, Lcom/daaw/tq0;->m:J

    const-wide/32 v6, 0xf4240

    mul-long v4, v4, v6

    iget-object p1, p0, Lcom/daaw/tq0;->d:Lcom/daaw/yq0;

    iget v2, p1, Lcom/daaw/yq0;->d:I

    int-to-long v6, v2

    div-long/2addr v4, v6

    add-long v7, v0, v4

    iget-object v6, p0, Lcom/daaw/tq0;->h:Lcom/daaw/sm1;

    const/4 v9, 0x1

    iget v10, p1, Lcom/daaw/yq0;->c:I

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-interface/range {v6 .. v12}, Lcom/daaw/sm1;->a(JIIILcom/daaw/sm1$a;)V

    iget-wide v0, p0, Lcom/daaw/tq0;->m:J

    iget-object p1, p0, Lcom/daaw/tq0;->d:Lcom/daaw/yq0;

    iget p1, p1, Lcom/daaw/yq0;->g:I

    int-to-long v4, p1

    add-long/2addr v0, v4

    iput-wide v0, p0, Lcom/daaw/tq0;->m:J

    iput v3, p0, Lcom/daaw/tq0;->n:I

    return v3
.end method

.method public final k(Lcom/daaw/a00;Z)Z
    .locals 12

    if-eqz p2, :cond_0

    const/16 v0, 0x4000

    goto :goto_0

    :cond_0
    const/high16 v0, 0x20000

    :goto_0
    invoke-interface {p1}, Lcom/daaw/a00;->i()V

    invoke-interface {p1}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    cmp-long v7, v1, v3

    if-nez v7, :cond_5

    iget v1, p0, Lcom/daaw/tq0;->a:I

    and-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_2

    sget-object v1, Lcom/daaw/y50;->c:Lcom/daaw/qe0$b;

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    iget-object v2, p0, Lcom/daaw/tq0;->f:Lcom/daaw/re0;

    invoke-virtual {v2, p1, v1}, Lcom/daaw/re0;->a(Lcom/daaw/a00;Lcom/daaw/qe0$b;)Lcom/google/android/exoplayer2/metadata/Metadata;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/tq0;->j:Lcom/google/android/exoplayer2/metadata/Metadata;

    if-eqz v1, :cond_3

    iget-object v2, p0, Lcom/daaw/tq0;->e:Lcom/daaw/y50;

    invoke-virtual {v2, v1}, Lcom/daaw/y50;->c(Lcom/google/android/exoplayer2/metadata/Metadata;)Z

    :cond_3
    invoke-interface {p1}, Lcom/daaw/a00;->e()J

    move-result-wide v1

    long-to-int v2, v1

    if-nez p2, :cond_4

    invoke-interface {p1, v2}, Lcom/daaw/a00;->j(I)V

    :cond_4
    const/4 v1, 0x0

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_3
    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_4
    iget-object v7, p0, Lcom/daaw/tq0;->c:Lcom/daaw/rv0;

    iget-object v7, v7, Lcom/daaw/rv0;->a:[B

    if-lez v1, :cond_6

    const/4 v8, 0x1

    goto :goto_5

    :cond_6
    const/4 v8, 0x0

    :goto_5
    const/4 v9, 0x4

    invoke-interface {p1, v7, v6, v9, v8}, Lcom/daaw/a00;->d([BIIZ)Z

    move-result v7

    if-nez v7, :cond_7

    goto :goto_7

    :cond_7
    iget-object v7, p0, Lcom/daaw/tq0;->c:Lcom/daaw/rv0;

    invoke-virtual {v7, v6}, Lcom/daaw/rv0;->J(I)V

    iget-object v7, p0, Lcom/daaw/tq0;->c:Lcom/daaw/rv0;

    invoke-virtual {v7}, Lcom/daaw/rv0;->i()I

    move-result v7

    if-eqz v3, :cond_8

    int-to-long v10, v3

    invoke-static {v7, v10, v11}, Lcom/daaw/tq0;->g(IJ)Z

    move-result v8

    if-eqz v8, :cond_9

    :cond_8
    invoke-static {v7}, Lcom/daaw/yq0;->a(I)I

    move-result v8

    const/4 v10, -0x1

    if-ne v8, v10, :cond_d

    :cond_9
    add-int/lit8 v1, v4, 0x1

    if-ne v4, v0, :cond_b

    if-eqz p2, :cond_a

    return v6

    :cond_a
    new-instance p1, Lcom/daaw/tv0;

    const-string p2, "Searched too many bytes."

    invoke-direct {p1, p2}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    if-eqz p2, :cond_c

    invoke-interface {p1}, Lcom/daaw/a00;->i()V

    add-int v3, v2, v1

    invoke-interface {p1, v3}, Lcom/daaw/a00;->g(I)V

    goto :goto_6

    :cond_c
    invoke-interface {p1, v5}, Lcom/daaw/a00;->j(I)V

    :goto_6
    move v4, v1

    const/4 v1, 0x0

    const/4 v3, 0x0

    goto :goto_4

    :cond_d
    add-int/lit8 v1, v1, 0x1

    if-ne v1, v5, :cond_e

    iget-object v3, p0, Lcom/daaw/tq0;->d:Lcom/daaw/yq0;

    invoke-static {v7, v3}, Lcom/daaw/yq0;->b(ILcom/daaw/yq0;)Z

    move v3, v7

    goto :goto_9

    :cond_e
    if-ne v1, v9, :cond_10

    :goto_7
    if-eqz p2, :cond_f

    add-int/2addr v2, v4

    invoke-interface {p1, v2}, Lcom/daaw/a00;->j(I)V

    goto :goto_8

    :cond_f
    invoke-interface {p1}, Lcom/daaw/a00;->i()V

    :goto_8
    iput v3, p0, Lcom/daaw/tq0;->i:I

    return v5

    :cond_10
    :goto_9
    add-int/lit8 v8, v8, -0x4

    invoke-interface {p1, v8}, Lcom/daaw/a00;->g(I)V

    goto :goto_4
.end method
