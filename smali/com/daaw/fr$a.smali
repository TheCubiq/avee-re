.class public final Lcom/daaw/fr$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jk0$a;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/fr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/jk0$a<",
        "Lcom/daaw/vv0<",
        "Lcom/daaw/nb0;",
        ">;>;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public final p:Lcom/daaw/ib0$a;

.field public final q:Lcom/daaw/jk0;

.field public final r:Lcom/daaw/vv0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vv0<",
            "Lcom/daaw/nb0;",
            ">;"
        }
    .end annotation
.end field

.field public s:Lcom/daaw/lb0;

.field public t:J

.field public u:J

.field public v:J

.field public w:J

.field public x:Z

.field public y:Ljava/io/IOException;

.field public final synthetic z:Lcom/daaw/fr;


# direct methods
.method public constructor <init>(Lcom/daaw/fr;Lcom/daaw/ib0$a;)V
    .locals 4

    iput-object p1, p0, Lcom/daaw/fr$a;->z:Lcom/daaw/fr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/fr$a;->p:Lcom/daaw/ib0$a;

    new-instance v0, Lcom/daaw/jk0;

    const-string v1, "DefaultHlsPlaylistTracker:MediaPlaylist"

    invoke-direct {v0, v1}, Lcom/daaw/jk0;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/daaw/fr$a;->q:Lcom/daaw/jk0;

    new-instance v0, Lcom/daaw/vv0;

    invoke-static {p1}, Lcom/daaw/fr;->t(Lcom/daaw/fr;)Lcom/daaw/fb0;

    move-result-object v1

    const/4 v2, 0x4

    invoke-interface {v1, v2}, Lcom/daaw/fb0;->a(I)Lcom/daaw/mp;

    move-result-object v1

    invoke-static {p1}, Lcom/daaw/fr;->u(Lcom/daaw/fr;)Lcom/daaw/ib0;

    move-result-object v3

    iget-object v3, v3, Lcom/daaw/nb0;->a:Ljava/lang/String;

    iget-object p2, p2, Lcom/daaw/ib0$a;->a:Ljava/lang/String;

    invoke-static {v3, p2}, Lcom/daaw/iq1;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-static {p1}, Lcom/daaw/fr;->v(Lcom/daaw/fr;)Lcom/daaw/vv0$a;

    move-result-object p1

    invoke-direct {v0, v1, p2, v2, p1}, Lcom/daaw/vv0;-><init>(Lcom/daaw/mp;Landroid/net/Uri;ILcom/daaw/vv0$a;)V

    iput-object v0, p0, Lcom/daaw/fr$a;->r:Lcom/daaw/vv0;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/fr$a;Lcom/daaw/lb0;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/fr$a;->n(Lcom/daaw/lb0;)V

    return-void
.end method

.method public static synthetic b(Lcom/daaw/fr$a;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/fr$a;->w:J

    return-wide v0
.end method

.method public static synthetic c(Lcom/daaw/fr$a;)Lcom/daaw/ib0$a;
    .locals 0

    iget-object p0, p0, Lcom/daaw/fr$a;->p:Lcom/daaw/ib0$a;

    return-object p0
.end method


# virtual methods
.method public final d()Z
    .locals 4

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/daaw/fr$a;->w:J

    iget-object v0, p0, Lcom/daaw/fr$a;->z:Lcom/daaw/fr;

    invoke-static {v0}, Lcom/daaw/fr;->q(Lcom/daaw/fr;)Lcom/daaw/ib0$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/fr$a;->p:Lcom/daaw/ib0$a;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/fr$a;->z:Lcom/daaw/fr;

    invoke-static {v0}, Lcom/daaw/fr;->s(Lcom/daaw/fr;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e()Lcom/daaw/lb0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/fr$a;->s:Lcom/daaw/lb0;

    return-object v0
.end method

.method public f()Z
    .locals 10

    iget-object v0, p0, Lcom/daaw/fr$a;->s:Lcom/daaw/lb0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    const-wide/16 v4, 0x7530

    iget-object v0, p0, Lcom/daaw/fr$a;->s:Lcom/daaw/lb0;

    iget-wide v6, v0, Lcom/daaw/lb0;->p:J

    invoke-static {v6, v7}, Lcom/daaw/dd;->b(J)J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iget-object v0, p0, Lcom/daaw/fr$a;->s:Lcom/daaw/lb0;

    iget-boolean v6, v0, Lcom/daaw/lb0;->l:Z

    const/4 v7, 0x1

    if-nez v6, :cond_1

    iget v0, v0, Lcom/daaw/lb0;->c:I

    const/4 v6, 0x2

    if-eq v0, v6, :cond_1

    if-eq v0, v7, :cond_1

    iget-wide v8, p0, Lcom/daaw/fr$a;->t:J

    add-long/2addr v8, v4

    cmp-long v0, v8, v2

    if-lez v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public g()V
    .locals 5

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/fr$a;->w:J

    iget-boolean v0, p0, Lcom/daaw/fr$a;->x:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/fr$a;->q:Lcom/daaw/jk0;

    invoke-virtual {v0}, Lcom/daaw/jk0;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/fr$a;->v:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_1

    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/daaw/fr$a;->x:Z

    iget-object v2, p0, Lcom/daaw/fr$a;->z:Lcom/daaw/fr;

    invoke-static {v2}, Lcom/daaw/fr;->w(Lcom/daaw/fr;)Landroid/os/Handler;

    move-result-object v2

    iget-wide v3, p0, Lcom/daaw/fr$a;->v:J

    sub-long/2addr v3, v0

    invoke-virtual {v2, p0, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/fr$a;->h()V

    :cond_2
    :goto_0
    return-void
.end method

.method public final h()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/fr$a;->q:Lcom/daaw/jk0;

    iget-object v1, p0, Lcom/daaw/fr$a;->r:Lcom/daaw/vv0;

    iget-object v2, p0, Lcom/daaw/fr$a;->z:Lcom/daaw/fr;

    invoke-static {v2}, Lcom/daaw/fr;->z(Lcom/daaw/fr;)I

    move-result v2

    invoke-virtual {v0, v1, p0, v2}, Lcom/daaw/jk0;->k(Lcom/daaw/jk0$c;Lcom/daaw/jk0$a;I)J

    move-result-wide v0

    iget-object v2, p0, Lcom/daaw/fr$a;->z:Lcom/daaw/fr;

    invoke-static {v2}, Lcom/daaw/fr;->x(Lcom/daaw/fr;)Lcom/daaw/cp0$a;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/fr$a;->r:Lcom/daaw/vv0;

    iget-object v4, v3, Lcom/daaw/vv0;->a:Lcom/daaw/pp;

    iget v3, v3, Lcom/daaw/vv0;->b:I

    invoke-virtual {v2, v4, v3, v0, v1}, Lcom/daaw/cp0$a;->o(Lcom/daaw/pp;IJ)V

    return-void
.end method

.method public i()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/fr$a;->q:Lcom/daaw/jk0;

    invoke-virtual {v0}, Lcom/daaw/jk0;->a()V

    iget-object v0, p0, Lcom/daaw/fr$a;->y:Ljava/io/IOException;

    if-nez v0, :cond_0

    return-void

    :cond_0
    throw v0
.end method

.method public j(Lcom/daaw/vv0;JJZ)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vv0<",
            "Lcom/daaw/nb0;",
            ">;JJZ)V"
        }
    .end annotation

    iget-object p6, p0, Lcom/daaw/fr$a;->z:Lcom/daaw/fr;

    invoke-static {p6}, Lcom/daaw/fr;->x(Lcom/daaw/fr;)Lcom/daaw/cp0$a;

    move-result-object v0

    iget-object v1, p1, Lcom/daaw/vv0;->a:Lcom/daaw/pp;

    invoke-virtual {p1}, Lcom/daaw/vv0;->c()J

    move-result-wide v7

    const/4 v2, 0x4

    move-wide v3, p2

    move-wide v5, p4

    invoke-virtual/range {v0 .. v8}, Lcom/daaw/cp0$a;->f(Lcom/daaw/pp;IJJJ)V

    return-void
.end method

.method public bridge synthetic k(Lcom/daaw/jk0$c;JJZ)V
    .locals 0

    check-cast p1, Lcom/daaw/vv0;

    invoke-virtual/range {p0 .. p6}, Lcom/daaw/fr$a;->j(Lcom/daaw/vv0;JJZ)V

    return-void
.end method

.method public l(Lcom/daaw/vv0;JJ)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vv0<",
            "Lcom/daaw/nb0;",
            ">;JJ)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/daaw/vv0;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/nb0;

    instance-of v1, v0, Lcom/daaw/lb0;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/daaw/lb0;

    invoke-virtual {p0, v0}, Lcom/daaw/fr$a;->n(Lcom/daaw/lb0;)V

    iget-object v0, p0, Lcom/daaw/fr$a;->z:Lcom/daaw/fr;

    invoke-static {v0}, Lcom/daaw/fr;->x(Lcom/daaw/fr;)Lcom/daaw/cp0$a;

    move-result-object v1

    iget-object v2, p1, Lcom/daaw/vv0;->a:Lcom/daaw/pp;

    const/4 v3, 0x4

    invoke-virtual {p1}, Lcom/daaw/vv0;->c()J

    move-result-wide v8

    move-wide v4, p2

    move-wide v6, p4

    invoke-virtual/range {v1 .. v9}, Lcom/daaw/cp0$a;->i(Lcom/daaw/pp;IJJJ)V

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/daaw/tv0;

    const-string p2, "Loaded playlist has unexpected type."

    invoke-direct {p1, p2}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/daaw/fr$a;->y:Ljava/io/IOException;

    :goto_0
    return-void
.end method

.method public m(Lcom/daaw/vv0;JJLjava/io/IOException;)I
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vv0<",
            "Lcom/daaw/nb0;",
            ">;JJ",
            "Ljava/io/IOException;",
            ")I"
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v12, p6

    instance-of v13, v12, Lcom/daaw/tv0;

    iget-object v1, v0, Lcom/daaw/fr$a;->z:Lcom/daaw/fr;

    invoke-static {v1}, Lcom/daaw/fr;->x(Lcom/daaw/fr;)Lcom/daaw/cp0$a;

    move-result-object v1

    move-object v2, p1

    iget-object v3, v2, Lcom/daaw/vv0;->a:Lcom/daaw/pp;

    invoke-virtual {p1}, Lcom/daaw/vv0;->c()J

    move-result-wide v8

    const/4 v4, 0x4

    move-object v2, v3

    move v3, v4

    move-wide/from16 v4, p2

    move-wide/from16 v6, p4

    move-object/from16 v10, p6

    move v11, v13

    invoke-virtual/range {v1 .. v11}, Lcom/daaw/cp0$a;->l(Lcom/daaw/pp;IJJJLjava/io/IOException;Z)V

    invoke-static/range {p6 .. p6}, Lcom/daaw/kf;->c(Ljava/lang/Exception;)Z

    move-result v1

    iget-object v2, v0, Lcom/daaw/fr$a;->z:Lcom/daaw/fr;

    iget-object v3, v0, Lcom/daaw/fr$a;->p:Lcom/daaw/ib0$a;

    invoke-static {v2, v3, v1}, Lcom/daaw/fr;->y(Lcom/daaw/fr;Lcom/daaw/ib0$a;Z)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    :goto_1
    if-eqz v13, :cond_2

    const/4 v1, 0x3

    return v1

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lcom/daaw/fr$a;->d()Z

    move-result v1

    or-int/2addr v2, v1

    :cond_3
    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    const/4 v3, 0x2

    :goto_2
    return v3
.end method

.method public final n(Lcom/daaw/lb0;)V
    .locals 9

    iget-object v0, p0, Lcom/daaw/fr$a;->s:Lcom/daaw/lb0;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/daaw/fr$a;->t:J

    iget-object v3, p0, Lcom/daaw/fr$a;->z:Lcom/daaw/fr;

    invoke-static {v3, v0, p1}, Lcom/daaw/fr;->n(Lcom/daaw/fr;Lcom/daaw/lb0;Lcom/daaw/lb0;)Lcom/daaw/lb0;

    move-result-object v3

    iput-object v3, p0, Lcom/daaw/fr$a;->s:Lcom/daaw/lb0;

    if-eq v3, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/fr$a;->y:Ljava/io/IOException;

    iput-wide v1, p0, Lcom/daaw/fr$a;->u:J

    iget-object p1, p0, Lcom/daaw/fr$a;->z:Lcom/daaw/fr;

    iget-object v4, p0, Lcom/daaw/fr$a;->p:Lcom/daaw/ib0$a;

    invoke-static {p1, v4, v3}, Lcom/daaw/fr;->p(Lcom/daaw/fr;Lcom/daaw/ib0$a;Lcom/daaw/lb0;)V

    goto :goto_0

    :cond_0
    iget-boolean v3, v3, Lcom/daaw/lb0;->l:Z

    if-nez v3, :cond_2

    iget-wide v3, p1, Lcom/daaw/lb0;->h:J

    iget-object p1, p1, Lcom/daaw/lb0;->o:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    int-to-long v5, p1

    add-long/2addr v3, v5

    iget-object p1, p0, Lcom/daaw/fr$a;->s:Lcom/daaw/lb0;

    iget-wide v5, p1, Lcom/daaw/lb0;->h:J

    cmp-long v7, v3, v5

    if-gez v7, :cond_1

    new-instance p1, Lcom/daaw/pb0$b;

    iget-object v3, p0, Lcom/daaw/fr$a;->p:Lcom/daaw/ib0$a;

    iget-object v3, v3, Lcom/daaw/ib0$a;->a:Ljava/lang/String;

    invoke-direct {p1, v3}, Lcom/daaw/pb0$b;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/daaw/fr$a;->y:Ljava/io/IOException;

    iget-object p1, p0, Lcom/daaw/fr$a;->z:Lcom/daaw/fr;

    iget-object v3, p0, Lcom/daaw/fr$a;->p:Lcom/daaw/ib0$a;

    const/4 v4, 0x0

    invoke-static {p1, v3, v4}, Lcom/daaw/fr;->y(Lcom/daaw/fr;Lcom/daaw/ib0$a;Z)Z

    goto :goto_0

    :cond_1
    iget-wide v3, p0, Lcom/daaw/fr$a;->u:J

    sub-long v3, v1, v3

    long-to-double v3, v3

    iget-wide v5, p1, Lcom/daaw/lb0;->j:J

    invoke-static {v5, v6}, Lcom/daaw/dd;->b(J)J

    move-result-wide v5

    long-to-double v5, v5

    const-wide/high16 v7, 0x400c000000000000L    # 3.5

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v5, v5, v7

    cmpl-double p1, v3, v5

    if-lez p1, :cond_2

    new-instance p1, Lcom/daaw/pb0$c;

    iget-object v3, p0, Lcom/daaw/fr$a;->p:Lcom/daaw/ib0$a;

    iget-object v3, v3, Lcom/daaw/ib0$a;->a:Ljava/lang/String;

    invoke-direct {p1, v3}, Lcom/daaw/pb0$c;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/daaw/fr$a;->y:Ljava/io/IOException;

    iget-object p1, p0, Lcom/daaw/fr$a;->z:Lcom/daaw/fr;

    iget-object v3, p0, Lcom/daaw/fr$a;->p:Lcom/daaw/ib0$a;

    const/4 v4, 0x1

    invoke-static {p1, v3, v4}, Lcom/daaw/fr;->y(Lcom/daaw/fr;Lcom/daaw/ib0$a;Z)Z

    invoke-virtual {p0}, Lcom/daaw/fr$a;->d()Z

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/daaw/fr$a;->s:Lcom/daaw/lb0;

    iget-wide v3, p1, Lcom/daaw/lb0;->j:J

    if-eq p1, v0, :cond_3

    goto :goto_1

    :cond_3
    const-wide/16 v5, 0x2

    div-long/2addr v3, v5

    :goto_1
    invoke-static {v3, v4}, Lcom/daaw/dd;->b(J)J

    move-result-wide v3

    add-long/2addr v1, v3

    iput-wide v1, p0, Lcom/daaw/fr$a;->v:J

    iget-object p1, p0, Lcom/daaw/fr$a;->p:Lcom/daaw/ib0$a;

    iget-object v0, p0, Lcom/daaw/fr$a;->z:Lcom/daaw/fr;

    invoke-static {v0}, Lcom/daaw/fr;->q(Lcom/daaw/fr;)Lcom/daaw/ib0$a;

    move-result-object v0

    if-ne p1, v0, :cond_4

    iget-object p1, p0, Lcom/daaw/fr$a;->s:Lcom/daaw/lb0;

    iget-boolean p1, p1, Lcom/daaw/lb0;->l:Z

    if-nez p1, :cond_4

    invoke-virtual {p0}, Lcom/daaw/fr$a;->g()V

    :cond_4
    return-void
.end method

.method public bridge synthetic o(Lcom/daaw/jk0$c;JJ)V
    .locals 0

    check-cast p1, Lcom/daaw/vv0;

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/fr$a;->l(Lcom/daaw/vv0;JJ)V

    return-void
.end method

.method public p()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/fr$a;->q:Lcom/daaw/jk0;

    invoke-virtual {v0}, Lcom/daaw/jk0;->i()V

    return-void
.end method

.method public bridge synthetic r(Lcom/daaw/jk0$c;JJLjava/io/IOException;)I
    .locals 0

    check-cast p1, Lcom/daaw/vv0;

    invoke-virtual/range {p0 .. p6}, Lcom/daaw/fr$a;->m(Lcom/daaw/vv0;JJLjava/io/IOException;)I

    move-result p1

    return p1
.end method

.method public run()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/fr$a;->x:Z

    invoke-virtual {p0}, Lcom/daaw/fr$a;->h()V

    return-void
.end method
