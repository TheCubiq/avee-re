.class public final Lcom/daaw/ap$i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation


# instance fields
.field public final a:Z

.field public final b:J

.field public final c:J


# direct methods
.method public constructor <init>(ZJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/daaw/ap$i;->a:Z

    iput-wide p2, p0, Lcom/daaw/ap$i;->b:J

    iput-wide p4, p0, Lcom/daaw/ap$i;->c:J

    return-void
.end method

.method public static a(Lcom/daaw/gw0;J)Lcom/daaw/ap$i;
    .locals 17

    move-object/from16 v0, p0

    move-wide/from16 v4, p1

    iget-object v1, v0, Lcom/daaw/gw0;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v6, 0x0

    const-wide v7, 0x7fffffffffffffffL

    move-wide v13, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    :goto_0
    if-ge v7, v1, :cond_4

    iget-object v9, v0, Lcom/daaw/gw0;->c:Ljava/util/List;

    invoke-interface {v9, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/daaw/e1;

    iget-object v9, v9, Lcom/daaw/e1;->c:Ljava/util/List;

    invoke-interface {v9, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/daaw/j41;

    invoke-virtual {v9}, Lcom/daaw/j41;->i()Lcom/daaw/bp;

    move-result-object v9

    if-nez v9, :cond_0

    new-instance v6, Lcom/daaw/ap$i;

    const/4 v1, 0x1

    const-wide/16 v2, 0x0

    move-object v0, v6

    move-wide/from16 v4, p1

    invoke-direct/range {v0 .. v5}, Lcom/daaw/ap$i;-><init>(ZJJ)V

    return-object v6

    :cond_0
    invoke-interface {v9}, Lcom/daaw/bp;->f()Z

    move-result v15

    or-int/2addr v10, v15

    invoke-interface {v9, v4, v5}, Lcom/daaw/bp;->h(J)I

    move-result v15

    if-nez v15, :cond_1

    const/4 v8, 0x1

    move/from16 v16, v7

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    goto :goto_1

    :cond_1
    if-nez v8, :cond_2

    invoke-interface {v9}, Lcom/daaw/bp;->g()J

    move-result-wide v2

    move/from16 v16, v7

    invoke-interface {v9, v2, v3}, Lcom/daaw/bp;->b(J)J

    move-result-wide v6

    invoke-static {v11, v12, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    const/4 v6, -0x1

    if-eq v15, v6, :cond_3

    int-to-long v6, v15

    add-long/2addr v2, v6

    const-wide/16 v6, 0x1

    sub-long/2addr v2, v6

    invoke-interface {v9, v2, v3}, Lcom/daaw/bp;->b(J)J

    move-result-wide v6

    invoke-interface {v9, v2, v3, v4, v5}, Lcom/daaw/bp;->c(JJ)J

    move-result-wide v2

    add-long/2addr v6, v2

    invoke-static {v13, v14, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    move-wide v13, v2

    goto :goto_1

    :cond_2
    move/from16 v16, v7

    :cond_3
    :goto_1
    add-int/lit8 v7, v16, 0x1

    const/4 v6, 0x0

    goto :goto_0

    :cond_4
    new-instance v0, Lcom/daaw/ap$i;

    move-object v9, v0

    invoke-direct/range {v9 .. v14}, Lcom/daaw/ap$i;-><init>(ZJJ)V

    return-object v0
.end method
