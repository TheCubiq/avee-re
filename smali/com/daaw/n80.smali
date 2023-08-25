.class public final Lcom/daaw/n80;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wv;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/n80$b;
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/cb1;

.field public final b:Z

.field public final c:Z

.field public final d:Lcom/daaw/rr0;

.field public final e:Lcom/daaw/rr0;

.field public final f:Lcom/daaw/rr0;

.field public g:J

.field public final h:[Z

.field public i:Ljava/lang/String;

.field public j:Lcom/daaw/sm1;

.field public k:Lcom/daaw/n80$b;

.field public l:Z

.field public m:J

.field public final n:Lcom/daaw/rv0;


# direct methods
.method public constructor <init>(Lcom/daaw/cb1;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/n80;->a:Lcom/daaw/cb1;

    iput-boolean p2, p0, Lcom/daaw/n80;->b:Z

    iput-boolean p3, p0, Lcom/daaw/n80;->c:Z

    const/4 p1, 0x3

    new-array p1, p1, [Z

    iput-object p1, p0, Lcom/daaw/n80;->h:[Z

    new-instance p1, Lcom/daaw/rr0;

    const/4 p2, 0x7

    const/16 p3, 0x80

    invoke-direct {p1, p2, p3}, Lcom/daaw/rr0;-><init>(II)V

    iput-object p1, p0, Lcom/daaw/n80;->d:Lcom/daaw/rr0;

    new-instance p1, Lcom/daaw/rr0;

    const/16 p2, 0x8

    invoke-direct {p1, p2, p3}, Lcom/daaw/rr0;-><init>(II)V

    iput-object p1, p0, Lcom/daaw/n80;->e:Lcom/daaw/rr0;

    new-instance p1, Lcom/daaw/rr0;

    const/4 p2, 0x6

    invoke-direct {p1, p2, p3}, Lcom/daaw/rr0;-><init>(II)V

    iput-object p1, p0, Lcom/daaw/n80;->f:Lcom/daaw/rr0;

    new-instance p1, Lcom/daaw/rv0;

    invoke-direct {p1}, Lcom/daaw/rv0;-><init>()V

    iput-object p1, p0, Lcom/daaw/n80;->n:Lcom/daaw/rv0;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/rv0;)V
    .locals 14

    invoke-virtual {p1}, Lcom/daaw/rv0;->c()I

    move-result v0

    invoke-virtual {p1}, Lcom/daaw/rv0;->d()I

    move-result v1

    iget-object v2, p1, Lcom/daaw/rv0;->a:[B

    iget-wide v3, p0, Lcom/daaw/n80;->g:J

    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result v5

    int-to-long v5, v5

    add-long/2addr v3, v5

    iput-wide v3, p0, Lcom/daaw/n80;->g:J

    iget-object v3, p0, Lcom/daaw/n80;->j:Lcom/daaw/sm1;

    invoke-virtual {p1}, Lcom/daaw/rv0;->a()I

    move-result v4

    invoke-interface {v3, p1, v4}, Lcom/daaw/sm1;->c(Lcom/daaw/rv0;I)V

    :goto_0
    iget-object p1, p0, Lcom/daaw/n80;->h:[Z

    invoke-static {v2, v0, v1, p1}, Lcom/daaw/sr0;->c([BII[Z)I

    move-result p1

    if-ne p1, v1, :cond_0

    invoke-virtual {p0, v2, v0, v1}, Lcom/daaw/n80;->g([BII)V

    return-void

    :cond_0
    invoke-static {v2, p1}, Lcom/daaw/sr0;->f([BI)I

    move-result v6

    sub-int v3, p1, v0

    if-lez v3, :cond_1

    invoke-virtual {p0, v2, v0, p1}, Lcom/daaw/n80;->g([BII)V

    :cond_1
    sub-int v10, v1, p1

    iget-wide v4, p0, Lcom/daaw/n80;->g:J

    int-to-long v7, v10

    sub-long/2addr v4, v7

    if-gez v3, :cond_2

    neg-int v0, v3

    move v11, v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    const/4 v11, 0x0

    :goto_1
    iget-wide v12, p0, Lcom/daaw/n80;->m:J

    move-object v7, p0

    move-wide v8, v4

    invoke-virtual/range {v7 .. v13}, Lcom/daaw/n80;->f(JIIJ)V

    iget-wide v7, p0, Lcom/daaw/n80;->m:J

    move-object v3, p0

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/n80;->h(JIJ)V

    add-int/lit8 v0, p1, 0x3

    goto :goto_0
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/n80;->h:[Z

    invoke-static {v0}, Lcom/daaw/sr0;->a([Z)V

    iget-object v0, p0, Lcom/daaw/n80;->d:Lcom/daaw/rr0;

    invoke-virtual {v0}, Lcom/daaw/rr0;->d()V

    iget-object v0, p0, Lcom/daaw/n80;->e:Lcom/daaw/rr0;

    invoke-virtual {v0}, Lcom/daaw/rr0;->d()V

    iget-object v0, p0, Lcom/daaw/n80;->f:Lcom/daaw/rr0;

    invoke-virtual {v0}, Lcom/daaw/rr0;->d()V

    iget-object v0, p0, Lcom/daaw/n80;->k:Lcom/daaw/n80$b;

    invoke-virtual {v0}, Lcom/daaw/n80$b;->g()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/n80;->g:J

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public d(Lcom/daaw/d00;Lcom/daaw/eo1$d;)V
    .locals 4

    invoke-virtual {p2}, Lcom/daaw/eo1$d;->a()V

    invoke-virtual {p2}, Lcom/daaw/eo1$d;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/n80;->i:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/daaw/eo1$d;->c()I

    move-result v0

    const/4 v1, 0x2

    invoke-interface {p1, v0, v1}, Lcom/daaw/d00;->a(II)Lcom/daaw/sm1;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/n80;->j:Lcom/daaw/sm1;

    new-instance v1, Lcom/daaw/n80$b;

    iget-boolean v2, p0, Lcom/daaw/n80;->b:Z

    iget-boolean v3, p0, Lcom/daaw/n80;->c:Z

    invoke-direct {v1, v0, v2, v3}, Lcom/daaw/n80$b;-><init>(Lcom/daaw/sm1;ZZ)V

    iput-object v1, p0, Lcom/daaw/n80;->k:Lcom/daaw/n80$b;

    iget-object v0, p0, Lcom/daaw/n80;->a:Lcom/daaw/cb1;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/cb1;->b(Lcom/daaw/d00;Lcom/daaw/eo1$d;)V

    return-void
.end method

.method public e(JZ)V
    .locals 0

    iput-wide p1, p0, Lcom/daaw/n80;->m:J

    return-void
.end method

.method public final f(JIIJ)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p4

    iget-boolean v2, v0, Lcom/daaw/n80;->l:Z

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/daaw/n80;->k:Lcom/daaw/n80$b;

    invoke-virtual {v2}, Lcom/daaw/n80$b;->c()Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_0
    iget-object v2, v0, Lcom/daaw/n80;->d:Lcom/daaw/rr0;

    invoke-virtual {v2, v1}, Lcom/daaw/rr0;->b(I)Z

    iget-object v2, v0, Lcom/daaw/n80;->e:Lcom/daaw/rr0;

    invoke-virtual {v2, v1}, Lcom/daaw/rr0;->b(I)Z

    iget-boolean v2, v0, Lcom/daaw/n80;->l:Z

    const/4 v3, 0x3

    if-nez v2, :cond_1

    iget-object v2, v0, Lcom/daaw/n80;->d:Lcom/daaw/rr0;

    invoke-virtual {v2}, Lcom/daaw/rr0;->c()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, v0, Lcom/daaw/n80;->e:Lcom/daaw/rr0;

    invoke-virtual {v2}, Lcom/daaw/rr0;->c()Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, v0, Lcom/daaw/n80;->d:Lcom/daaw/rr0;

    iget-object v4, v2, Lcom/daaw/rr0;->d:[B

    iget v2, v2, Lcom/daaw/rr0;->e:I

    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v2

    invoke-interface {v12, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, v0, Lcom/daaw/n80;->e:Lcom/daaw/rr0;

    iget-object v4, v2, Lcom/daaw/rr0;->d:[B

    iget v2, v2, Lcom/daaw/rr0;->e:I

    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v2

    invoke-interface {v12, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, v0, Lcom/daaw/n80;->d:Lcom/daaw/rr0;

    iget-object v4, v2, Lcom/daaw/rr0;->d:[B

    iget v2, v2, Lcom/daaw/rr0;->e:I

    invoke-static {v4, v3, v2}, Lcom/daaw/sr0;->i([BII)Lcom/daaw/sr0$b;

    move-result-object v2

    iget-object v4, v0, Lcom/daaw/n80;->e:Lcom/daaw/rr0;

    iget-object v5, v4, Lcom/daaw/rr0;->d:[B

    iget v4, v4, Lcom/daaw/rr0;->e:I

    invoke-static {v5, v3, v4}, Lcom/daaw/sr0;->h([BII)Lcom/daaw/sr0$a;

    move-result-object v3

    iget-object v15, v0, Lcom/daaw/n80;->j:Lcom/daaw/sm1;

    iget-object v4, v0, Lcom/daaw/n80;->i:Ljava/lang/String;

    const/4 v6, 0x0

    const/4 v7, -0x1

    const/4 v8, -0x1

    iget v9, v2, Lcom/daaw/sr0$b;->b:I

    iget v10, v2, Lcom/daaw/sr0$b;->c:I

    const/high16 v11, -0x40800000    # -1.0f

    const/4 v13, -0x1

    iget v14, v2, Lcom/daaw/sr0$b;->d:F

    const/16 v16, 0x0

    const-string v5, "video/avc"

    move-object v1, v15

    move-object/from16 v15, v16

    invoke-static/range {v4 .. v15}, Lcom/google/android/exoplayer2/Format;->H(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIFLjava/util/List;IFLcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/Format;

    move-result-object v4

    invoke-interface {v1, v4}, Lcom/daaw/sm1;->d(Lcom/google/android/exoplayer2/Format;)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/daaw/n80;->l:Z

    iget-object v1, v0, Lcom/daaw/n80;->k:Lcom/daaw/n80$b;

    invoke-virtual {v1, v2}, Lcom/daaw/n80$b;->f(Lcom/daaw/sr0$b;)V

    iget-object v1, v0, Lcom/daaw/n80;->k:Lcom/daaw/n80$b;

    invoke-virtual {v1, v3}, Lcom/daaw/n80$b;->e(Lcom/daaw/sr0$a;)V

    iget-object v1, v0, Lcom/daaw/n80;->d:Lcom/daaw/rr0;

    invoke-virtual {v1}, Lcom/daaw/rr0;->d()V

    goto :goto_1

    :cond_1
    iget-object v1, v0, Lcom/daaw/n80;->d:Lcom/daaw/rr0;

    invoke-virtual {v1}, Lcom/daaw/rr0;->c()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v0, Lcom/daaw/n80;->d:Lcom/daaw/rr0;

    iget-object v2, v1, Lcom/daaw/rr0;->d:[B

    iget v1, v1, Lcom/daaw/rr0;->e:I

    invoke-static {v2, v3, v1}, Lcom/daaw/sr0;->i([BII)Lcom/daaw/sr0$b;

    move-result-object v1

    iget-object v2, v0, Lcom/daaw/n80;->k:Lcom/daaw/n80$b;

    invoke-virtual {v2, v1}, Lcom/daaw/n80$b;->f(Lcom/daaw/sr0$b;)V

    iget-object v1, v0, Lcom/daaw/n80;->d:Lcom/daaw/rr0;

    :goto_0
    invoke-virtual {v1}, Lcom/daaw/rr0;->d()V

    goto :goto_2

    :cond_2
    iget-object v1, v0, Lcom/daaw/n80;->e:Lcom/daaw/rr0;

    invoke-virtual {v1}, Lcom/daaw/rr0;->c()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v0, Lcom/daaw/n80;->e:Lcom/daaw/rr0;

    iget-object v2, v1, Lcom/daaw/rr0;->d:[B

    iget v1, v1, Lcom/daaw/rr0;->e:I

    invoke-static {v2, v3, v1}, Lcom/daaw/sr0;->h([BII)Lcom/daaw/sr0$a;

    move-result-object v1

    iget-object v2, v0, Lcom/daaw/n80;->k:Lcom/daaw/n80$b;

    invoke-virtual {v2, v1}, Lcom/daaw/n80$b;->e(Lcom/daaw/sr0$a;)V

    :goto_1
    iget-object v1, v0, Lcom/daaw/n80;->e:Lcom/daaw/rr0;

    goto :goto_0

    :cond_3
    :goto_2
    iget-object v1, v0, Lcom/daaw/n80;->f:Lcom/daaw/rr0;

    move/from16 v2, p4

    invoke-virtual {v1, v2}, Lcom/daaw/rr0;->b(I)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, v0, Lcom/daaw/n80;->f:Lcom/daaw/rr0;

    iget-object v2, v1, Lcom/daaw/rr0;->d:[B

    iget v1, v1, Lcom/daaw/rr0;->e:I

    invoke-static {v2, v1}, Lcom/daaw/sr0;->k([BI)I

    move-result v1

    iget-object v2, v0, Lcom/daaw/n80;->n:Lcom/daaw/rv0;

    iget-object v3, v0, Lcom/daaw/n80;->f:Lcom/daaw/rr0;

    iget-object v3, v3, Lcom/daaw/rr0;->d:[B

    invoke-virtual {v2, v3, v1}, Lcom/daaw/rv0;->H([BI)V

    iget-object v1, v0, Lcom/daaw/n80;->n:Lcom/daaw/rv0;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/daaw/rv0;->J(I)V

    iget-object v1, v0, Lcom/daaw/n80;->a:Lcom/daaw/cb1;

    iget-object v2, v0, Lcom/daaw/n80;->n:Lcom/daaw/rv0;

    move-wide/from16 v3, p5

    invoke-virtual {v1, v3, v4, v2}, Lcom/daaw/cb1;->a(JLcom/daaw/rv0;)V

    :cond_4
    iget-object v1, v0, Lcom/daaw/n80;->k:Lcom/daaw/n80$b;

    move-wide/from16 v2, p1

    move/from16 v4, p3

    invoke-virtual {v1, v2, v3, v4}, Lcom/daaw/n80$b;->b(JI)V

    return-void
.end method

.method public final g([BII)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/n80;->l:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/n80;->k:Lcom/daaw/n80$b;

    invoke-virtual {v0}, Lcom/daaw/n80$b;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/n80;->d:Lcom/daaw/rr0;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/rr0;->a([BII)V

    iget-object v0, p0, Lcom/daaw/n80;->e:Lcom/daaw/rr0;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/rr0;->a([BII)V

    :cond_1
    iget-object v0, p0, Lcom/daaw/n80;->f:Lcom/daaw/rr0;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/rr0;->a([BII)V

    iget-object v0, p0, Lcom/daaw/n80;->k:Lcom/daaw/n80$b;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/n80$b;->a([BII)V

    return-void
.end method

.method public final h(JIJ)V
    .locals 7

    iget-boolean v0, p0, Lcom/daaw/n80;->l:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/n80;->k:Lcom/daaw/n80$b;

    invoke-virtual {v0}, Lcom/daaw/n80$b;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/n80;->d:Lcom/daaw/rr0;

    invoke-virtual {v0, p3}, Lcom/daaw/rr0;->e(I)V

    iget-object v0, p0, Lcom/daaw/n80;->e:Lcom/daaw/rr0;

    invoke-virtual {v0, p3}, Lcom/daaw/rr0;->e(I)V

    :cond_1
    iget-object v0, p0, Lcom/daaw/n80;->f:Lcom/daaw/rr0;

    invoke-virtual {v0, p3}, Lcom/daaw/rr0;->e(I)V

    iget-object v1, p0, Lcom/daaw/n80;->k:Lcom/daaw/n80$b;

    move-wide v2, p1

    move v4, p3

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/n80$b;->h(JIJ)V

    return-void
.end method
