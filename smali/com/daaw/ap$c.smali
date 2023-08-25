.class public final Lcom/daaw/ap$c;
.super Lcom/daaw/nl1;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final b:J

.field public final c:J

.field public final d:I

.field public final e:J

.field public final f:J

.field public final g:J

.field public final h:Lcom/daaw/wo;

.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JJIJJJLcom/daaw/wo;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/nl1;-><init>()V

    iput-wide p1, p0, Lcom/daaw/ap$c;->b:J

    iput-wide p3, p0, Lcom/daaw/ap$c;->c:J

    iput p5, p0, Lcom/daaw/ap$c;->d:I

    iput-wide p6, p0, Lcom/daaw/ap$c;->e:J

    iput-wide p8, p0, Lcom/daaw/ap$c;->f:J

    iput-wide p10, p0, Lcom/daaw/ap$c;->g:J

    iput-object p12, p0, Lcom/daaw/ap$c;->h:Lcom/daaw/wo;

    iput-object p13, p0, Lcom/daaw/ap$c;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;)I
    .locals 3

    instance-of v0, p1, Ljava/lang/Integer;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget v0, p0, Lcom/daaw/ap$c;->d:I

    if-lt p1, v0, :cond_2

    invoke-virtual {p0}, Lcom/daaw/ap$c;->h()I

    move-result v2

    add-int/2addr v0, v2

    if-lt p1, v0, :cond_1

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/daaw/ap$c;->d:I

    sub-int v1, p1, v0

    :cond_2
    :goto_0
    return v1
.end method

.method public g(ILcom/daaw/nl1$b;Z)Lcom/daaw/nl1$b;
    .locals 11

    iget-object v0, p0, Lcom/daaw/ap$c;->h:Lcom/daaw/wo;

    invoke-virtual {v0}, Lcom/daaw/wo;->e()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Lcom/daaw/s6;->c(III)I

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    iget-object v2, p0, Lcom/daaw/ap$c;->h:Lcom/daaw/wo;

    invoke-virtual {v2, p1}, Lcom/daaw/wo;->d(I)Lcom/daaw/gw0;

    move-result-object v2

    iget-object v2, v2, Lcom/daaw/gw0;->a:Ljava/lang/String;

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object v4, v0

    :goto_0
    if-eqz p3, :cond_1

    iget p3, p0, Lcom/daaw/ap$c;->d:I

    iget-object v0, p0, Lcom/daaw/ap$c;->h:Lcom/daaw/wo;

    invoke-virtual {v0}, Lcom/daaw/wo;->e()I

    move-result v0

    invoke-static {p1, v1, v0}, Lcom/daaw/s6;->c(III)I

    move-result v0

    add-int/2addr p3, v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_1
    move-object v5, v0

    const/4 v6, 0x0

    iget-object p3, p0, Lcom/daaw/ap$c;->h:Lcom/daaw/wo;

    invoke-virtual {p3, p1}, Lcom/daaw/wo;->g(I)J

    move-result-wide v7

    iget-object p3, p0, Lcom/daaw/ap$c;->h:Lcom/daaw/wo;

    invoke-virtual {p3, p1}, Lcom/daaw/wo;->d(I)Lcom/daaw/gw0;

    move-result-object p1

    iget-wide v2, p1, Lcom/daaw/gw0;->b:J

    iget-object p1, p0, Lcom/daaw/ap$c;->h:Lcom/daaw/wo;

    invoke-virtual {p1, v1}, Lcom/daaw/wo;->d(I)Lcom/daaw/gw0;

    move-result-object p1

    iget-wide v0, p1, Lcom/daaw/gw0;->b:J

    sub-long/2addr v2, v0

    invoke-static {v2, v3}, Lcom/daaw/dd;->a(J)J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/ap$c;->e:J

    sub-long v9, v0, v2

    move-object v3, p2

    invoke-virtual/range {v3 .. v10}, Lcom/daaw/nl1$b;->o(Ljava/lang/Object;Ljava/lang/Object;IJJ)Lcom/daaw/nl1$b;

    move-result-object p1

    return-object p1
.end method

.method public h()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ap$c;->h:Lcom/daaw/wo;

    invoke-virtual {v0}, Lcom/daaw/wo;->e()I

    move-result v0

    return v0
.end method

.method public m(ILcom/daaw/nl1$c;ZJ)Lcom/daaw/nl1$c;
    .locals 19

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    move/from16 v3, p1

    invoke-static {v3, v1, v2}, Lcom/daaw/s6;->c(III)I

    move-wide/from16 v3, p4

    invoke-virtual {v0, v3, v4}, Lcom/daaw/ap$c;->q(J)J

    move-result-wide v11

    if-eqz p3, :cond_0

    iget-object v1, v0, Lcom/daaw/ap$c;->i:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move-object v4, v1

    iget-wide v5, v0, Lcom/daaw/ap$c;->b:J

    iget-wide v7, v0, Lcom/daaw/ap$c;->c:J

    const/4 v9, 0x1

    iget-object v1, v0, Lcom/daaw/ap$c;->h:Lcom/daaw/wo;

    iget-boolean v10, v1, Lcom/daaw/wo;->d:Z

    iget-wide v13, v0, Lcom/daaw/ap$c;->f:J

    const/4 v15, 0x0

    invoke-virtual {v1}, Lcom/daaw/wo;->e()I

    move-result v1

    add-int/lit8 v16, v1, -0x1

    iget-wide v1, v0, Lcom/daaw/ap$c;->e:J

    move-object/from16 v3, p2

    move-wide/from16 v17, v1

    invoke-virtual/range {v3 .. v18}, Lcom/daaw/nl1$c;->e(Ljava/lang/Object;JJZZJJIIJ)Lcom/daaw/nl1$c;

    move-result-object v1

    return-object v1
.end method

.method public n()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final q(J)J
    .locals 8

    iget-wide v0, p0, Lcom/daaw/ap$c;->g:J

    iget-object v2, p0, Lcom/daaw/ap$c;->h:Lcom/daaw/wo;

    iget-boolean v3, v2, Lcom/daaw/wo;->d:Z

    if-nez v3, :cond_0

    return-wide v0

    :cond_0
    const-wide/16 v3, 0x0

    cmp-long v5, p1, v3

    if-lez v5, :cond_1

    add-long/2addr v0, p1

    iget-wide p1, p0, Lcom/daaw/ap$c;->f:J

    cmp-long v3, v0, p1

    if-lez v3, :cond_1

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    return-wide p1

    :cond_1
    iget-wide p1, p0, Lcom/daaw/ap$c;->e:J

    add-long/2addr p1, v0

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/daaw/wo;->g(I)J

    move-result-wide v4

    const/4 v2, 0x0

    :goto_0
    iget-object v6, p0, Lcom/daaw/ap$c;->h:Lcom/daaw/wo;

    invoke-virtual {v6}, Lcom/daaw/wo;->e()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    if-ge v2, v6, :cond_2

    cmp-long v6, p1, v4

    if-ltz v6, :cond_2

    sub-long/2addr p1, v4

    add-int/lit8 v2, v2, 0x1

    iget-object v4, p0, Lcom/daaw/ap$c;->h:Lcom/daaw/wo;

    invoke-virtual {v4, v2}, Lcom/daaw/wo;->g(I)J

    move-result-wide v4

    goto :goto_0

    :cond_2
    iget-object v6, p0, Lcom/daaw/ap$c;->h:Lcom/daaw/wo;

    invoke-virtual {v6, v2}, Lcom/daaw/wo;->d(I)Lcom/daaw/gw0;

    move-result-object v2

    const/4 v6, 0x2

    invoke-virtual {v2, v6}, Lcom/daaw/gw0;->a(I)I

    move-result v6

    const/4 v7, -0x1

    if-ne v6, v7, :cond_3

    return-wide v0

    :cond_3
    iget-object v2, v2, Lcom/daaw/gw0;->c:Ljava/util/List;

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/e1;

    iget-object v2, v2, Lcom/daaw/e1;->c:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/j41;

    invoke-virtual {v2}, Lcom/daaw/j41;->i()Lcom/daaw/bp;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-interface {v2, v4, v5}, Lcom/daaw/bp;->h(J)I

    move-result v3

    if-nez v3, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {v2, p1, p2, v4, v5}, Lcom/daaw/bp;->e(JJ)J

    move-result-wide v3

    invoke-interface {v2, v3, v4}, Lcom/daaw/bp;->b(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    sub-long/2addr v0, p1

    :cond_5
    :goto_1
    return-wide v0
.end method
