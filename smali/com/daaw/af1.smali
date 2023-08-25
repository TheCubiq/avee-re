.class public final Lcom/daaw/af1;
.super Lcom/daaw/ua;
.source ""

# interfaces
.implements Lcom/daaw/jk0$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/af1$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/ua;",
        "Lcom/daaw/jk0$a<",
        "Lcom/daaw/vv0<",
        "Lcom/daaw/xe1;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final A:J

.field public final B:Lcom/daaw/cp0$a;

.field public final C:Lcom/daaw/vv0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vv0$a<",
            "+",
            "Lcom/daaw/xe1;",
            ">;"
        }
    .end annotation
.end field

.field public final D:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/daaw/ze1;",
            ">;"
        }
    .end annotation
.end field

.field public final E:Ljava/lang/Object;

.field public F:Lcom/daaw/mp;

.field public G:Lcom/daaw/jk0;

.field public H:Lcom/daaw/lk0;

.field public I:J

.field public J:Lcom/daaw/xe1;

.field public K:Landroid/os/Handler;

.field public final u:Z

.field public final v:Landroid/net/Uri;

.field public final w:Lcom/daaw/mp$a;

.field public final x:Lcom/daaw/we1$a;

.field public final y:Lcom/daaw/wi;

.field public final z:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "goog.exo.smoothstreaming"

    invoke-static {v0}, Lcom/daaw/vz;->a(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/xe1;Landroid/net/Uri;Lcom/daaw/mp$a;Lcom/daaw/vv0$a;Lcom/daaw/we1$a;Lcom/daaw/wi;IJLjava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/xe1;",
            "Landroid/net/Uri;",
            "Lcom/daaw/mp$a;",
            "Lcom/daaw/vv0$a<",
            "+",
            "Lcom/daaw/xe1;",
            ">;",
            "Lcom/daaw/we1$a;",
            "Lcom/daaw/wi;",
            "IJ",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/daaw/ua;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    iget-boolean v2, p1, Lcom/daaw/xe1;->d:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    :goto_1
    invoke-static {v2}, Lcom/daaw/s6;->f(Z)V

    iput-object p1, p0, Lcom/daaw/af1;->J:Lcom/daaw/xe1;

    const/4 v2, 0x0

    if-nez p2, :cond_2

    move-object p2, v2

    goto :goto_2

    :cond_2
    invoke-static {p2}, Lcom/daaw/bf1;->a(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object p2

    :goto_2
    iput-object p2, p0, Lcom/daaw/af1;->v:Landroid/net/Uri;

    iput-object p3, p0, Lcom/daaw/af1;->w:Lcom/daaw/mp$a;

    iput-object p4, p0, Lcom/daaw/af1;->C:Lcom/daaw/vv0$a;

    iput-object p5, p0, Lcom/daaw/af1;->x:Lcom/daaw/we1$a;

    iput-object p6, p0, Lcom/daaw/af1;->y:Lcom/daaw/wi;

    iput p7, p0, Lcom/daaw/af1;->z:I

    iput-wide p8, p0, Lcom/daaw/af1;->A:J

    invoke-virtual {p0, v2}, Lcom/daaw/ua;->j(Lcom/daaw/bp0$a;)Lcom/daaw/cp0$a;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/af1;->B:Lcom/daaw/cp0$a;

    iput-object p10, p0, Lcom/daaw/af1;->E:Ljava/lang/Object;

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    :cond_3
    iput-boolean v0, p0, Lcom/daaw/af1;->u:Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/daaw/af1;->D:Ljava/util/ArrayList;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/xe1;Landroid/net/Uri;Lcom/daaw/mp$a;Lcom/daaw/vv0$a;Lcom/daaw/we1$a;Lcom/daaw/wi;IJLjava/lang/Object;Lcom/daaw/af1$a;)V
    .locals 0

    invoke-direct/range {p0 .. p10}, Lcom/daaw/af1;-><init>(Lcom/daaw/xe1;Landroid/net/Uri;Lcom/daaw/mp$a;Lcom/daaw/vv0$a;Lcom/daaw/we1$a;Lcom/daaw/wi;IJLjava/lang/Object;)V

    return-void
.end method

.method public static synthetic q(Lcom/daaw/af1;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/af1;->x()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/qo0;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Lcom/daaw/ze1;

    invoke-virtual {v0}, Lcom/daaw/ze1;->v()V

    iget-object v0, p0, Lcom/daaw/af1;->D:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/af1;->H:Lcom/daaw/lk0;

    invoke-interface {v0}, Lcom/daaw/lk0;->a()V

    return-void
.end method

.method public g(Lcom/daaw/bp0$a;Lcom/daaw/l2;)Lcom/daaw/qo0;
    .locals 9

    iget v0, p1, Lcom/daaw/bp0$a;->a:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->a(Z)V

    invoke-virtual {p0, p1}, Lcom/daaw/ua;->j(Lcom/daaw/bp0$a;)Lcom/daaw/cp0$a;

    move-result-object v6

    new-instance p1, Lcom/daaw/ze1;

    iget-object v2, p0, Lcom/daaw/af1;->J:Lcom/daaw/xe1;

    iget-object v3, p0, Lcom/daaw/af1;->x:Lcom/daaw/we1$a;

    iget-object v4, p0, Lcom/daaw/af1;->y:Lcom/daaw/wi;

    iget v5, p0, Lcom/daaw/af1;->z:I

    iget-object v7, p0, Lcom/daaw/af1;->H:Lcom/daaw/lk0;

    move-object v1, p1

    move-object v8, p2

    invoke-direct/range {v1 .. v8}, Lcom/daaw/ze1;-><init>(Lcom/daaw/xe1;Lcom/daaw/we1$a;Lcom/daaw/wi;ILcom/daaw/cp0$a;Lcom/daaw/lk0;Lcom/daaw/l2;)V

    iget-object p2, p0, Lcom/daaw/af1;->D:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p1
.end method

.method public bridge synthetic k(Lcom/daaw/jk0$c;JJZ)V
    .locals 0

    check-cast p1, Lcom/daaw/vv0;

    invoke-virtual/range {p0 .. p6}, Lcom/daaw/af1;->s(Lcom/daaw/vv0;JJZ)V

    return-void
.end method

.method public m(Lcom/daaw/rz;Z)V
    .locals 0

    iget-boolean p1, p0, Lcom/daaw/af1;->u:Z

    if-eqz p1, :cond_0

    new-instance p1, Lcom/daaw/lk0$a;

    invoke-direct {p1}, Lcom/daaw/lk0$a;-><init>()V

    iput-object p1, p0, Lcom/daaw/af1;->H:Lcom/daaw/lk0;

    invoke-virtual {p0}, Lcom/daaw/af1;->v()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/af1;->w:Lcom/daaw/mp$a;

    invoke-interface {p1}, Lcom/daaw/mp$a;->a()Lcom/daaw/mp;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/af1;->F:Lcom/daaw/mp;

    new-instance p1, Lcom/daaw/jk0;

    const-string p2, "Loader:Manifest"

    invoke-direct {p1, p2}, Lcom/daaw/jk0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/daaw/af1;->G:Lcom/daaw/jk0;

    iput-object p1, p0, Lcom/daaw/af1;->H:Lcom/daaw/lk0;

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/daaw/af1;->K:Landroid/os/Handler;

    invoke-virtual {p0}, Lcom/daaw/af1;->x()V

    :goto_0
    return-void
.end method

.method public bridge synthetic o(Lcom/daaw/jk0$c;JJ)V
    .locals 0

    check-cast p1, Lcom/daaw/vv0;

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/af1;->t(Lcom/daaw/vv0;JJ)V

    return-void
.end method

.method public p()V
    .locals 4

    iget-boolean v0, p0, Lcom/daaw/af1;->u:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/af1;->J:Lcom/daaw/xe1;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iput-object v0, p0, Lcom/daaw/af1;->J:Lcom/daaw/xe1;

    iput-object v1, p0, Lcom/daaw/af1;->F:Lcom/daaw/mp;

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/daaw/af1;->I:J

    iget-object v0, p0, Lcom/daaw/af1;->G:Lcom/daaw/jk0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/jk0;->i()V

    iput-object v1, p0, Lcom/daaw/af1;->G:Lcom/daaw/jk0;

    :cond_1
    iget-object v0, p0, Lcom/daaw/af1;->K:Landroid/os/Handler;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/daaw/af1;->K:Landroid/os/Handler;

    :cond_2
    return-void
.end method

.method public bridge synthetic r(Lcom/daaw/jk0$c;JJLjava/io/IOException;)I
    .locals 0

    check-cast p1, Lcom/daaw/vv0;

    invoke-virtual/range {p0 .. p6}, Lcom/daaw/af1;->u(Lcom/daaw/vv0;JJLjava/io/IOException;)I

    move-result p1

    return p1
.end method

.method public s(Lcom/daaw/vv0;JJZ)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vv0<",
            "Lcom/daaw/xe1;",
            ">;JJZ)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/af1;->B:Lcom/daaw/cp0$a;

    iget-object v1, p1, Lcom/daaw/vv0;->a:Lcom/daaw/pp;

    iget v2, p1, Lcom/daaw/vv0;->b:I

    invoke-virtual {p1}, Lcom/daaw/vv0;->c()J

    move-result-wide v7

    move-wide v3, p2

    move-wide v5, p4

    invoke-virtual/range {v0 .. v8}, Lcom/daaw/cp0$a;->f(Lcom/daaw/pp;IJJJ)V

    return-void
.end method

.method public t(Lcom/daaw/vv0;JJ)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vv0<",
            "Lcom/daaw/xe1;",
            ">;JJ)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/af1;->B:Lcom/daaw/cp0$a;

    iget-object v1, p1, Lcom/daaw/vv0;->a:Lcom/daaw/pp;

    iget v2, p1, Lcom/daaw/vv0;->b:I

    invoke-virtual {p1}, Lcom/daaw/vv0;->c()J

    move-result-wide v7

    move-wide v3, p2

    move-wide v5, p4

    invoke-virtual/range {v0 .. v8}, Lcom/daaw/cp0$a;->i(Lcom/daaw/pp;IJJJ)V

    invoke-virtual {p1}, Lcom/daaw/vv0;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/xe1;

    iput-object p1, p0, Lcom/daaw/af1;->J:Lcom/daaw/xe1;

    sub-long/2addr p2, p4

    iput-wide p2, p0, Lcom/daaw/af1;->I:J

    invoke-virtual {p0}, Lcom/daaw/af1;->v()V

    invoke-virtual {p0}, Lcom/daaw/af1;->w()V

    return-void
.end method

.method public u(Lcom/daaw/vv0;JJLjava/io/IOException;)I
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vv0<",
            "Lcom/daaw/xe1;",
            ">;JJ",
            "Ljava/io/IOException;",
            ")I"
        }
    .end annotation

    move-object v0, p1

    move-object/from16 v9, p6

    instance-of v11, v9, Lcom/daaw/tv0;

    move-object v12, p0

    iget-object v1, v12, Lcom/daaw/af1;->B:Lcom/daaw/cp0$a;

    iget-object v2, v0, Lcom/daaw/vv0;->a:Lcom/daaw/pp;

    iget v3, v0, Lcom/daaw/vv0;->b:I

    invoke-virtual {p1}, Lcom/daaw/vv0;->c()J

    move-result-wide v7

    move-object v0, v1

    move-object v1, v2

    move v2, v3

    move-wide v3, p2

    move-wide/from16 v5, p4

    move v10, v11

    invoke-virtual/range {v0 .. v10}, Lcom/daaw/cp0$a;->l(Lcom/daaw/pp;IJJJLjava/io/IOException;Z)V

    if-eqz v11, :cond_0

    const/4 v0, 0x3

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final v()V
    .locals 28

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    iget-object v3, v0, Lcom/daaw/af1;->D:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    iget-object v3, v0, Lcom/daaw/af1;->D:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/ze1;

    iget-object v4, v0, Lcom/daaw/af1;->J:Lcom/daaw/xe1;

    invoke-virtual {v3, v4}, Lcom/daaw/ze1;->x(Lcom/daaw/xe1;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const-wide/high16 v2, -0x8000000000000000L

    iget-object v4, v0, Lcom/daaw/af1;->J:Lcom/daaw/xe1;

    iget-object v4, v4, Lcom/daaw/xe1;->f:[Lcom/daaw/xe1$b;

    array-length v5, v4

    const-wide v6, 0x7fffffffffffffffL

    move-wide v14, v6

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v5, :cond_2

    aget-object v9, v4, v8

    iget v10, v9, Lcom/daaw/xe1$b;->k:I

    if-lez v10, :cond_1

    invoke-virtual {v9, v1}, Lcom/daaw/xe1$b;->e(I)J

    move-result-wide v10

    invoke-static {v14, v15, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v14

    iget v10, v9, Lcom/daaw/xe1$b;->k:I

    add-int/lit8 v10, v10, -0x1

    invoke-virtual {v9, v10}, Lcom/daaw/xe1$b;->e(I)J

    move-result-wide v10

    iget v12, v9, Lcom/daaw/xe1$b;->k:I

    add-int/lit8 v12, v12, -0x1

    invoke-virtual {v9, v12}, Lcom/daaw/xe1$b;->c(I)J

    move-result-wide v12

    add-long/2addr v10, v12

    invoke-static {v2, v3, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    const-wide/16 v4, 0x0

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v14, v6

    if-nez v1, :cond_4

    iget-object v1, v0, Lcom/daaw/af1;->J:Lcom/daaw/xe1;

    iget-boolean v1, v1, Lcom/daaw/xe1;->d:Z

    if-eqz v1, :cond_3

    move-wide v11, v8

    goto :goto_2

    :cond_3
    move-wide v11, v4

    :goto_2
    new-instance v1, Lcom/daaw/od1;

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x1

    iget-object v2, v0, Lcom/daaw/af1;->J:Lcom/daaw/xe1;

    iget-boolean v2, v2, Lcom/daaw/xe1;->d:Z

    iget-object v3, v0, Lcom/daaw/af1;->E:Ljava/lang/Object;

    move-object v10, v1

    move/from16 v20, v2

    move-object/from16 v21, v3

    invoke-direct/range {v10 .. v21}, Lcom/daaw/od1;-><init>(JJJJZZLjava/lang/Object;)V

    goto :goto_4

    :cond_4
    iget-object v1, v0, Lcom/daaw/af1;->J:Lcom/daaw/xe1;

    iget-boolean v6, v1, Lcom/daaw/xe1;->d:Z

    if-eqz v6, :cond_7

    iget-wide v6, v1, Lcom/daaw/xe1;->h:J

    cmp-long v1, v6, v8

    if-eqz v1, :cond_5

    cmp-long v1, v6, v4

    if-lez v1, :cond_5

    sub-long v4, v2, v6

    invoke-static {v14, v15, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v14

    :cond_5
    move-wide/from16 v21, v14

    sub-long v19, v2, v21

    iget-wide v1, v0, Lcom/daaw/af1;->A:J

    invoke-static {v1, v2}, Lcom/daaw/dd;->a(J)J

    move-result-wide v1

    sub-long v1, v19, v1

    const-wide/32 v3, 0x4c4b40

    cmp-long v5, v1, v3

    if-gez v5, :cond_6

    const-wide/16 v1, 0x2

    div-long v1, v19, v1

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    :cond_6
    move-wide/from16 v23, v1

    new-instance v1, Lcom/daaw/od1;

    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v25, 0x1

    const/16 v26, 0x1

    iget-object v2, v0, Lcom/daaw/af1;->E:Ljava/lang/Object;

    move-object/from16 v16, v1

    move-object/from16 v27, v2

    invoke-direct/range {v16 .. v27}, Lcom/daaw/od1;-><init>(JJJJZZLjava/lang/Object;)V

    goto :goto_4

    :cond_7
    iget-wide v4, v1, Lcom/daaw/xe1;->g:J

    cmp-long v1, v4, v8

    if-eqz v1, :cond_8

    move-wide v12, v4

    goto :goto_3

    :cond_8
    sub-long/2addr v2, v14

    move-wide v12, v2

    :goto_3
    new-instance v1, Lcom/daaw/od1;

    add-long v10, v14, v12

    const-wide/16 v16, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    iget-object v2, v0, Lcom/daaw/af1;->E:Ljava/lang/Object;

    move-object v9, v1

    move-object/from16 v20, v2

    invoke-direct/range {v9 .. v20}, Lcom/daaw/od1;-><init>(JJJJZZLjava/lang/Object;)V

    :goto_4
    iget-object v2, v0, Lcom/daaw/af1;->J:Lcom/daaw/xe1;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ua;->n(Lcom/daaw/nl1;Ljava/lang/Object;)V

    return-void
.end method

.method public final w()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/af1;->J:Lcom/daaw/xe1;

    iget-boolean v0, v0, Lcom/daaw/xe1;->d:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-wide v0, p0, Lcom/daaw/af1;->I:J

    const-wide/16 v2, 0x1388

    add-long/2addr v0, v2

    const-wide/16 v2, 0x0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    sub-long/2addr v0, v4

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iget-object v2, p0, Lcom/daaw/af1;->K:Landroid/os/Handler;

    new-instance v3, Lcom/daaw/af1$a;

    invoke-direct {v3, p0}, Lcom/daaw/af1$a;-><init>(Lcom/daaw/af1;)V

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final x()V
    .locals 5

    new-instance v0, Lcom/daaw/vv0;

    iget-object v1, p0, Lcom/daaw/af1;->F:Lcom/daaw/mp;

    iget-object v2, p0, Lcom/daaw/af1;->v:Landroid/net/Uri;

    iget-object v3, p0, Lcom/daaw/af1;->C:Lcom/daaw/vv0$a;

    const/4 v4, 0x4

    invoke-direct {v0, v1, v2, v4, v3}, Lcom/daaw/vv0;-><init>(Lcom/daaw/mp;Landroid/net/Uri;ILcom/daaw/vv0$a;)V

    iget-object v1, p0, Lcom/daaw/af1;->G:Lcom/daaw/jk0;

    iget v2, p0, Lcom/daaw/af1;->z:I

    invoke-virtual {v1, v0, p0, v2}, Lcom/daaw/jk0;->k(Lcom/daaw/jk0$c;Lcom/daaw/jk0$a;I)J

    move-result-wide v1

    iget-object v3, p0, Lcom/daaw/af1;->B:Lcom/daaw/cp0$a;

    iget-object v4, v0, Lcom/daaw/vv0;->a:Lcom/daaw/pp;

    iget v0, v0, Lcom/daaw/vv0;->b:I

    invoke-virtual {v3, v4, v0, v1, v2}, Lcom/daaw/cp0$a;->o(Lcom/daaw/pp;IJ)V

    return-void
.end method
