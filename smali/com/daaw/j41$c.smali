.class public Lcom/daaw/j41$c;
.super Lcom/daaw/j41;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/j41;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final h:Landroid/net/Uri;

.field public final i:J

.field public final j:Ljava/lang/String;

.field public final k:Lcom/daaw/d31;

.field public final l:Lcom/daaw/qd1;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLcom/google/android/exoplayer2/Format;Ljava/lang/String;Lcom/daaw/ka1$e;Ljava/util/List;Ljava/lang/String;J)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Lcom/google/android/exoplayer2/Format;",
            "Ljava/lang/String;",
            "Lcom/daaw/ka1$e;",
            "Ljava/util/List<",
            "Lcom/daaw/jt;",
            ">;",
            "Ljava/lang/String;",
            "J)V"
        }
    .end annotation

    move-object v9, p0

    move-object v10, p1

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lcom/daaw/j41;-><init>(Ljava/lang/String;JLcom/google/android/exoplayer2/Format;Ljava/lang/String;Lcom/daaw/ka1;Ljava/util/List;Lcom/daaw/j41$a;)V

    invoke-static/range {p5 .. p5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, v9, Lcom/daaw/j41$c;->h:Landroid/net/Uri;

    invoke-virtual/range {p6 .. p6}, Lcom/daaw/ka1$e;->c()Lcom/daaw/d31;

    move-result-object v0

    iput-object v0, v9, Lcom/daaw/j41$c;->k:Lcom/daaw/d31;

    const/4 v1, 0x0

    if-eqz p8, :cond_0

    move-object/from16 v2, p8

    goto :goto_0

    :cond_0
    if-eqz v10, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v4, p4

    iget-object v4, v4, Lcom/google/android/exoplayer2/Format;->p:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide v3, p2

    invoke-virtual {v2, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    iput-object v2, v9, Lcom/daaw/j41$c;->j:Ljava/lang/String;

    move-wide/from16 v2, p9

    iput-wide v2, v9, Lcom/daaw/j41$c;->i:J

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, Lcom/daaw/qd1;

    new-instance v0, Lcom/daaw/d31;

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move-object p1, v0

    move-object p2, v4

    move-wide p3, v5

    move-wide/from16 p5, p9

    invoke-direct/range {p1 .. p6}, Lcom/daaw/d31;-><init>(Ljava/lang/String;JJ)V

    invoke-direct {v1, v0}, Lcom/daaw/qd1;-><init>(Lcom/daaw/d31;)V

    :goto_1
    iput-object v1, v9, Lcom/daaw/j41$c;->l:Lcom/daaw/qd1;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/j41$c;->j:Ljava/lang/String;

    return-object v0
.end method

.method public i()Lcom/daaw/bp;
    .locals 1

    iget-object v0, p0, Lcom/daaw/j41$c;->l:Lcom/daaw/qd1;

    return-object v0
.end method

.method public j()Lcom/daaw/d31;
    .locals 1

    iget-object v0, p0, Lcom/daaw/j41$c;->k:Lcom/daaw/d31;

    return-object v0
.end method
