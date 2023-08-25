.class public final Lcom/daaw/cp0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/cp0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/cp0$a$j;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Lcom/daaw/bp0$a;

.field public final c:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/daaw/cp0$a$j;",
            ">;"
        }
    .end annotation
.end field

.field public final d:J


# direct methods
.method public constructor <init>()V
    .locals 6

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/daaw/cp0$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILcom/daaw/bp0$a;J)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILcom/daaw/bp0$a;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/daaw/cp0$a$j;",
            ">;I",
            "Lcom/daaw/bp0$a;",
            "J)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/cp0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    iput p2, p0, Lcom/daaw/cp0$a;->a:I

    iput-object p3, p0, Lcom/daaw/cp0$a;->b:Lcom/daaw/bp0$a;

    iput-wide p4, p0, Lcom/daaw/cp0$a;->d:J

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Handler;Lcom/daaw/cp0;)V
    .locals 2

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->a(Z)V

    iget-object v0, p0, Lcom/daaw/cp0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Lcom/daaw/cp0$a$j;

    invoke-direct {v1, p1, p2}, Lcom/daaw/cp0$a$j;-><init>(Landroid/os/Handler;Lcom/daaw/cp0;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(J)J
    .locals 3

    invoke-static {p1, p2}, Lcom/daaw/dd;->b(J)J

    move-result-wide p1

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lcom/daaw/cp0$a;->d:J

    add-long/2addr v0, p1

    :goto_0
    return-wide v0
.end method

.method public c(ILcom/google/android/exoplayer2/Format;ILjava/lang/Object;J)V
    .locals 12

    move-object v0, p0

    new-instance v11, Lcom/daaw/cp0$c;

    move-wide/from16 v1, p5

    invoke-virtual {p0, v1, v2}, Lcom/daaw/cp0$a;->b(J)J

    move-result-wide v7

    const/4 v2, 0x1

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v1, v11

    move v3, p1

    move-object v4, p2

    move v5, p3

    move-object/from16 v6, p4

    invoke-direct/range {v1 .. v10}, Lcom/daaw/cp0$c;-><init>(IILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJ)V

    invoke-virtual {p0, v11}, Lcom/daaw/cp0$a;->d(Lcom/daaw/cp0$c;)V

    return-void
.end method

.method public d(Lcom/daaw/cp0$c;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/cp0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/cp0$a$j;

    iget-object v2, v1, Lcom/daaw/cp0$a$j;->b:Lcom/daaw/cp0;

    iget-object v1, v1, Lcom/daaw/cp0$a$j;->a:Landroid/os/Handler;

    new-instance v3, Lcom/daaw/cp0$a$i;

    invoke-direct {v3, p0, v2, p1}, Lcom/daaw/cp0$a$i;-><init>(Lcom/daaw/cp0$a;Lcom/daaw/cp0;Lcom/daaw/cp0$c;)V

    invoke-virtual {p0, v1, v3}, Lcom/daaw/cp0$a;->s(Landroid/os/Handler;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public e(Lcom/daaw/pp;IILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJJJ)V
    .locals 10

    move-object v0, p0

    new-instance v9, Lcom/daaw/cp0$b;

    move-object v1, v9

    move-object v2, p1

    move-wide/from16 v3, p11

    move-wide/from16 v5, p13

    move-wide/from16 v7, p15

    invoke-direct/range {v1 .. v8}, Lcom/daaw/cp0$b;-><init>(Lcom/daaw/pp;JJJ)V

    new-instance v1, Lcom/daaw/cp0$c;

    move-wide/from16 v2, p7

    invoke-virtual {p0, v2, v3}, Lcom/daaw/cp0$a;->b(J)J

    move-result-wide v2

    move-wide/from16 v4, p9

    invoke-virtual {p0, v4, v5}, Lcom/daaw/cp0$a;->b(J)J

    move-result-wide v4

    move-object/from16 p7, v1

    move/from16 p8, p2

    move/from16 p9, p3

    move-object/from16 p10, p4

    move/from16 p11, p5

    move-object/from16 p12, p6

    move-wide/from16 p13, v2

    move-wide/from16 p15, v4

    invoke-direct/range {p7 .. p16}, Lcom/daaw/cp0$c;-><init>(IILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJ)V

    invoke-virtual {p0, v9, v1}, Lcom/daaw/cp0$a;->g(Lcom/daaw/cp0$b;Lcom/daaw/cp0$c;)V

    return-void
.end method

.method public f(Lcom/daaw/pp;IJJJ)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-wide/from16 v11, p3

    move-wide/from16 v13, p5

    move-wide/from16 v15, p7

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    invoke-virtual/range {v0 .. v16}, Lcom/daaw/cp0$a;->e(Lcom/daaw/pp;IILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJJJ)V

    return-void
.end method

.method public g(Lcom/daaw/cp0$b;Lcom/daaw/cp0$c;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/cp0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/cp0$a$j;

    iget-object v2, v1, Lcom/daaw/cp0$a$j;->b:Lcom/daaw/cp0;

    iget-object v1, v1, Lcom/daaw/cp0$a$j;->a:Landroid/os/Handler;

    new-instance v3, Lcom/daaw/cp0$a$e;

    invoke-direct {v3, p0, v2, p1, p2}, Lcom/daaw/cp0$a$e;-><init>(Lcom/daaw/cp0$a;Lcom/daaw/cp0;Lcom/daaw/cp0$b;Lcom/daaw/cp0$c;)V

    invoke-virtual {p0, v1, v3}, Lcom/daaw/cp0$a;->s(Landroid/os/Handler;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public h(Lcom/daaw/pp;IILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJJJ)V
    .locals 10

    move-object v0, p0

    new-instance v9, Lcom/daaw/cp0$b;

    move-object v1, v9

    move-object v2, p1

    move-wide/from16 v3, p11

    move-wide/from16 v5, p13

    move-wide/from16 v7, p15

    invoke-direct/range {v1 .. v8}, Lcom/daaw/cp0$b;-><init>(Lcom/daaw/pp;JJJ)V

    new-instance v1, Lcom/daaw/cp0$c;

    move-wide/from16 v2, p7

    invoke-virtual {p0, v2, v3}, Lcom/daaw/cp0$a;->b(J)J

    move-result-wide v2

    move-wide/from16 v4, p9

    invoke-virtual {p0, v4, v5}, Lcom/daaw/cp0$a;->b(J)J

    move-result-wide v4

    move-object/from16 p7, v1

    move/from16 p8, p2

    move/from16 p9, p3

    move-object/from16 p10, p4

    move/from16 p11, p5

    move-object/from16 p12, p6

    move-wide/from16 p13, v2

    move-wide/from16 p15, v4

    invoke-direct/range {p7 .. p16}, Lcom/daaw/cp0$c;-><init>(IILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJ)V

    invoke-virtual {p0, v9, v1}, Lcom/daaw/cp0$a;->j(Lcom/daaw/cp0$b;Lcom/daaw/cp0$c;)V

    return-void
.end method

.method public i(Lcom/daaw/pp;IJJJ)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-wide/from16 v11, p3

    move-wide/from16 v13, p5

    move-wide/from16 v15, p7

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    invoke-virtual/range {v0 .. v16}, Lcom/daaw/cp0$a;->h(Lcom/daaw/pp;IILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJJJ)V

    return-void
.end method

.method public j(Lcom/daaw/cp0$b;Lcom/daaw/cp0$c;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/cp0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/cp0$a$j;

    iget-object v2, v1, Lcom/daaw/cp0$a$j;->b:Lcom/daaw/cp0;

    iget-object v1, v1, Lcom/daaw/cp0$a$j;->a:Landroid/os/Handler;

    new-instance v3, Lcom/daaw/cp0$a$d;

    invoke-direct {v3, p0, v2, p1, p2}, Lcom/daaw/cp0$a$d;-><init>(Lcom/daaw/cp0$a;Lcom/daaw/cp0;Lcom/daaw/cp0$b;Lcom/daaw/cp0$c;)V

    invoke-virtual {p0, v1, v3}, Lcom/daaw/cp0$a;->s(Landroid/os/Handler;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public k(Lcom/daaw/pp;IILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJJJLjava/io/IOException;Z)V
    .locals 10

    move-object v0, p0

    new-instance v9, Lcom/daaw/cp0$b;

    move-object v1, v9

    move-object v2, p1

    move-wide/from16 v3, p11

    move-wide/from16 v5, p13

    move-wide/from16 v7, p15

    invoke-direct/range {v1 .. v8}, Lcom/daaw/cp0$b;-><init>(Lcom/daaw/pp;JJJ)V

    new-instance v1, Lcom/daaw/cp0$c;

    move-wide/from16 v2, p7

    invoke-virtual {p0, v2, v3}, Lcom/daaw/cp0$a;->b(J)J

    move-result-wide v2

    move-wide/from16 v4, p9

    invoke-virtual {p0, v4, v5}, Lcom/daaw/cp0$a;->b(J)J

    move-result-wide v4

    move-object/from16 p7, v1

    move/from16 p8, p2

    move/from16 p9, p3

    move-object/from16 p10, p4

    move/from16 p11, p5

    move-object/from16 p12, p6

    move-wide/from16 p13, v2

    move-wide/from16 p15, v4

    invoke-direct/range {p7 .. p16}, Lcom/daaw/cp0$c;-><init>(IILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJ)V

    move-object/from16 v2, p17

    move/from16 v3, p18

    invoke-virtual {p0, v9, v1, v2, v3}, Lcom/daaw/cp0$a;->m(Lcom/daaw/cp0$b;Lcom/daaw/cp0$c;Ljava/io/IOException;Z)V

    return-void
.end method

.method public l(Lcom/daaw/pp;IJJJLjava/io/IOException;Z)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-wide/from16 v11, p3

    move-wide/from16 v13, p5

    move-wide/from16 v15, p7

    move-object/from16 v17, p9

    move/from16 v18, p10

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    invoke-virtual/range {v0 .. v18}, Lcom/daaw/cp0$a;->k(Lcom/daaw/pp;IILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJJJLjava/io/IOException;Z)V

    return-void
.end method

.method public m(Lcom/daaw/cp0$b;Lcom/daaw/cp0$c;Ljava/io/IOException;Z)V
    .locals 10

    iget-object v0, p0, Lcom/daaw/cp0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/cp0$a$j;

    iget-object v4, v1, Lcom/daaw/cp0$a$j;->b:Lcom/daaw/cp0;

    iget-object v1, v1, Lcom/daaw/cp0$a$j;->a:Landroid/os/Handler;

    new-instance v9, Lcom/daaw/cp0$a$f;

    move-object v2, v9

    move-object v3, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move v8, p4

    invoke-direct/range {v2 .. v8}, Lcom/daaw/cp0$a$f;-><init>(Lcom/daaw/cp0$a;Lcom/daaw/cp0;Lcom/daaw/cp0$b;Lcom/daaw/cp0$c;Ljava/io/IOException;Z)V

    invoke-virtual {p0, v1, v9}, Lcom/daaw/cp0$a;->s(Landroid/os/Handler;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public n(Lcom/daaw/pp;IILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJ)V
    .locals 20

    move-object/from16 v0, p0

    new-instance v9, Lcom/daaw/cp0$b;

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    move-object v1, v9

    move-object/from16 v2, p1

    move-wide/from16 v3, p11

    invoke-direct/range {v1 .. v8}, Lcom/daaw/cp0$b;-><init>(Lcom/daaw/pp;JJJ)V

    new-instance v1, Lcom/daaw/cp0$c;

    move-wide/from16 v2, p7

    invoke-virtual {v0, v2, v3}, Lcom/daaw/cp0$a;->b(J)J

    move-result-wide v16

    move-wide/from16 v2, p9

    invoke-virtual {v0, v2, v3}, Lcom/daaw/cp0$a;->b(J)J

    move-result-wide v18

    move-object v10, v1

    move/from16 v11, p2

    move/from16 v12, p3

    move-object/from16 v13, p4

    move/from16 v14, p5

    move-object/from16 v15, p6

    invoke-direct/range {v10 .. v19}, Lcom/daaw/cp0$c;-><init>(IILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJ)V

    invoke-virtual {v0, v9, v1}, Lcom/daaw/cp0$a;->p(Lcom/daaw/cp0$b;Lcom/daaw/cp0$c;)V

    return-void
.end method

.method public o(Lcom/daaw/pp;IJ)V
    .locals 13

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-wide/from16 v11, p3

    invoke-virtual/range {v0 .. v12}, Lcom/daaw/cp0$a;->n(Lcom/daaw/pp;IILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJ)V

    return-void
.end method

.method public p(Lcom/daaw/cp0$b;Lcom/daaw/cp0$c;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/cp0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/cp0$a$j;

    iget-object v2, v1, Lcom/daaw/cp0$a$j;->b:Lcom/daaw/cp0;

    iget-object v1, v1, Lcom/daaw/cp0$a$j;->a:Landroid/os/Handler;

    new-instance v3, Lcom/daaw/cp0$a$c;

    invoke-direct {v3, p0, v2, p1, p2}, Lcom/daaw/cp0$a$c;-><init>(Lcom/daaw/cp0$a;Lcom/daaw/cp0;Lcom/daaw/cp0$b;Lcom/daaw/cp0$c;)V

    invoke-virtual {p0, v1, v3}, Lcom/daaw/cp0$a;->s(Landroid/os/Handler;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public q()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/cp0$a;->b:Lcom/daaw/bp0$a;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iget-object v0, p0, Lcom/daaw/cp0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/cp0$a$j;

    iget-object v2, v1, Lcom/daaw/cp0$a$j;->b:Lcom/daaw/cp0;

    iget-object v1, v1, Lcom/daaw/cp0$a$j;->a:Landroid/os/Handler;

    new-instance v3, Lcom/daaw/cp0$a$a;

    invoke-direct {v3, p0, v2}, Lcom/daaw/cp0$a$a;-><init>(Lcom/daaw/cp0$a;Lcom/daaw/cp0;)V

    invoke-virtual {p0, v1, v3}, Lcom/daaw/cp0$a;->s(Landroid/os/Handler;Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public r()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/cp0$a;->b:Lcom/daaw/bp0$a;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iget-object v0, p0, Lcom/daaw/cp0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/cp0$a$j;

    iget-object v2, v1, Lcom/daaw/cp0$a$j;->b:Lcom/daaw/cp0;

    iget-object v1, v1, Lcom/daaw/cp0$a$j;->a:Landroid/os/Handler;

    new-instance v3, Lcom/daaw/cp0$a$b;

    invoke-direct {v3, p0, v2}, Lcom/daaw/cp0$a$b;-><init>(Lcom/daaw/cp0$a;Lcom/daaw/cp0;)V

    invoke-virtual {p0, v1, v3}, Lcom/daaw/cp0$a;->s(Landroid/os/Handler;Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final s(Landroid/os/Handler;Ljava/lang/Runnable;)V
    .locals 2

    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method

.method public t()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/cp0$a;->b:Lcom/daaw/bp0$a;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iget-object v0, p0, Lcom/daaw/cp0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/cp0$a$j;

    iget-object v2, v1, Lcom/daaw/cp0$a$j;->b:Lcom/daaw/cp0;

    iget-object v1, v1, Lcom/daaw/cp0$a$j;->a:Landroid/os/Handler;

    new-instance v3, Lcom/daaw/cp0$a$g;

    invoke-direct {v3, p0, v2}, Lcom/daaw/cp0$a$g;-><init>(Lcom/daaw/cp0$a;Lcom/daaw/cp0;)V

    invoke-virtual {p0, v1, v3}, Lcom/daaw/cp0$a;->s(Landroid/os/Handler;Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public u(Lcom/daaw/cp0;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/cp0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/cp0$a$j;

    iget-object v2, v1, Lcom/daaw/cp0$a$j;->b:Lcom/daaw/cp0;

    if-ne v2, p1, :cond_0

    iget-object v2, p0, Lcom/daaw/cp0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public v(IJJ)V
    .locals 12

    move-object v0, p0

    new-instance v11, Lcom/daaw/cp0$c;

    move-wide v1, p2

    invoke-virtual {p0, p2, p3}, Lcom/daaw/cp0$a;->b(J)J

    move-result-wide v7

    move-wide/from16 v1, p4

    invoke-virtual {p0, v1, v2}, Lcom/daaw/cp0$a;->b(J)J

    move-result-wide v9

    const/4 v2, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v1, v11

    move v3, p1

    invoke-direct/range {v1 .. v10}, Lcom/daaw/cp0$c;-><init>(IILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJ)V

    invoke-virtual {p0, v11}, Lcom/daaw/cp0$a;->w(Lcom/daaw/cp0$c;)V

    return-void
.end method

.method public w(Lcom/daaw/cp0$c;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/cp0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/cp0$a$j;

    iget-object v2, v1, Lcom/daaw/cp0$a$j;->b:Lcom/daaw/cp0;

    iget-object v1, v1, Lcom/daaw/cp0$a$j;->a:Landroid/os/Handler;

    new-instance v3, Lcom/daaw/cp0$a$h;

    invoke-direct {v3, p0, v2, p1}, Lcom/daaw/cp0$a$h;-><init>(Lcom/daaw/cp0$a;Lcom/daaw/cp0;Lcom/daaw/cp0$c;)V

    invoke-virtual {p0, v1, v3}, Lcom/daaw/cp0$a;->s(Landroid/os/Handler;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public x(ILcom/daaw/bp0$a;J)Lcom/daaw/cp0$a;
    .locals 7

    new-instance v6, Lcom/daaw/cp0$a;

    iget-object v1, p0, Lcom/daaw/cp0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    move-object v0, v6

    move v2, p1

    move-object v3, p2

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/daaw/cp0$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILcom/daaw/bp0$a;J)V

    return-object v6
.end method
