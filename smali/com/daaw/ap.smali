.class public final Lcom/daaw/ap;
.super Lcom/daaw/ua;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/ap$h;,
        Lcom/daaw/ap$f;,
        Lcom/daaw/ap$k;,
        Lcom/daaw/ap$j;,
        Lcom/daaw/ap$g;,
        Lcom/daaw/ap$d;,
        Lcom/daaw/ap$c;,
        Lcom/daaw/ap$i;,
        Lcom/daaw/ap$e;
    }
.end annotation


# instance fields
.field public final A:Lcom/daaw/cp0$a;

.field public final B:Lcom/daaw/vv0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vv0$a<",
            "+",
            "Lcom/daaw/wo;",
            ">;"
        }
    .end annotation
.end field

.field public final C:Lcom/daaw/ap$g;

.field public final D:Ljava/lang/Object;

.field public final E:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/daaw/zo;",
            ">;"
        }
    .end annotation
.end field

.field public final F:Ljava/lang/Runnable;

.field public final G:Ljava/lang/Runnable;

.field public final H:Lcom/daaw/ex0$b;

.field public final I:Lcom/daaw/lk0;

.field public final J:Ljava/lang/Object;

.field public K:Lcom/daaw/mp;

.field public L:Lcom/daaw/jk0;

.field public M:Ljava/io/IOException;

.field public N:Landroid/os/Handler;

.field public O:Landroid/net/Uri;

.field public P:Landroid/net/Uri;

.field public Q:Lcom/daaw/wo;

.field public R:Z

.field public S:J

.field public T:J

.field public U:J

.field public V:I

.field public W:J

.field public X:Z

.field public Y:I

.field public final u:Z

.field public final v:Lcom/daaw/mp$a;

.field public final w:Lcom/daaw/vo$a;

.field public final x:Lcom/daaw/wi;

.field public final y:I

.field public final z:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "goog.exo.dash"

    invoke-static {v0}, Lcom/daaw/vz;->a(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/wo;Landroid/net/Uri;Lcom/daaw/mp$a;Lcom/daaw/vv0$a;Lcom/daaw/vo$a;Lcom/daaw/wi;IJLjava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/wo;",
            "Landroid/net/Uri;",
            "Lcom/daaw/mp$a;",
            "Lcom/daaw/vv0$a<",
            "+",
            "Lcom/daaw/wo;",
            ">;",
            "Lcom/daaw/vo$a;",
            "Lcom/daaw/wi;",
            "IJ",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/daaw/ua;-><init>()V

    iput-object p2, p0, Lcom/daaw/ap;->O:Landroid/net/Uri;

    iput-object p1, p0, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    iput-object p2, p0, Lcom/daaw/ap;->P:Landroid/net/Uri;

    iput-object p3, p0, Lcom/daaw/ap;->v:Lcom/daaw/mp$a;

    iput-object p4, p0, Lcom/daaw/ap;->B:Lcom/daaw/vv0$a;

    iput-object p5, p0, Lcom/daaw/ap;->w:Lcom/daaw/vo$a;

    iput p7, p0, Lcom/daaw/ap;->y:I

    iput-wide p8, p0, Lcom/daaw/ap;->z:J

    iput-object p6, p0, Lcom/daaw/ap;->x:Lcom/daaw/wi;

    iput-object p10, p0, Lcom/daaw/ap;->J:Ljava/lang/Object;

    const/4 p2, 0x1

    if-eqz p1, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    iput-boolean p3, p0, Lcom/daaw/ap;->u:Z

    const/4 p4, 0x0

    invoke-virtual {p0, p4}, Lcom/daaw/ua;->j(Lcom/daaw/bp0$a;)Lcom/daaw/cp0$a;

    move-result-object p5

    iput-object p5, p0, Lcom/daaw/ap;->A:Lcom/daaw/cp0$a;

    new-instance p5, Ljava/lang/Object;

    invoke-direct {p5}, Ljava/lang/Object;-><init>()V

    iput-object p5, p0, Lcom/daaw/ap;->D:Ljava/lang/Object;

    new-instance p5, Landroid/util/SparseArray;

    invoke-direct {p5}, Landroid/util/SparseArray;-><init>()V

    iput-object p5, p0, Lcom/daaw/ap;->E:Landroid/util/SparseArray;

    new-instance p5, Lcom/daaw/ap$d;

    invoke-direct {p5, p0, p4}, Lcom/daaw/ap$d;-><init>(Lcom/daaw/ap;Lcom/daaw/ap$a;)V

    iput-object p5, p0, Lcom/daaw/ap;->H:Lcom/daaw/ex0$b;

    const-wide p5, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p5, p0, Lcom/daaw/ap;->W:J

    if-eqz p3, :cond_1

    iget-boolean p1, p1, Lcom/daaw/wo;->d:Z

    xor-int/2addr p1, p2

    invoke-static {p1}, Lcom/daaw/s6;->f(Z)V

    iput-object p4, p0, Lcom/daaw/ap;->C:Lcom/daaw/ap$g;

    iput-object p4, p0, Lcom/daaw/ap;->F:Ljava/lang/Runnable;

    iput-object p4, p0, Lcom/daaw/ap;->G:Ljava/lang/Runnable;

    new-instance p1, Lcom/daaw/lk0$a;

    invoke-direct {p1}, Lcom/daaw/lk0$a;-><init>()V

    iput-object p1, p0, Lcom/daaw/ap;->I:Lcom/daaw/lk0;

    goto :goto_1

    :cond_1
    new-instance p1, Lcom/daaw/ap$g;

    invoke-direct {p1, p0, p4}, Lcom/daaw/ap$g;-><init>(Lcom/daaw/ap;Lcom/daaw/ap$a;)V

    iput-object p1, p0, Lcom/daaw/ap;->C:Lcom/daaw/ap$g;

    new-instance p1, Lcom/daaw/ap$h;

    invoke-direct {p1, p0}, Lcom/daaw/ap$h;-><init>(Lcom/daaw/ap;)V

    iput-object p1, p0, Lcom/daaw/ap;->I:Lcom/daaw/lk0;

    new-instance p1, Lcom/daaw/ap$a;

    invoke-direct {p1, p0}, Lcom/daaw/ap$a;-><init>(Lcom/daaw/ap;)V

    iput-object p1, p0, Lcom/daaw/ap;->F:Ljava/lang/Runnable;

    new-instance p1, Lcom/daaw/ap$b;

    invoke-direct {p1, p0}, Lcom/daaw/ap$b;-><init>(Lcom/daaw/ap;)V

    iput-object p1, p0, Lcom/daaw/ap;->G:Ljava/lang/Runnable;

    :goto_1
    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/wo;Landroid/net/Uri;Lcom/daaw/mp$a;Lcom/daaw/vv0$a;Lcom/daaw/vo$a;Lcom/daaw/wi;IJLjava/lang/Object;Lcom/daaw/ap$a;)V
    .locals 0

    invoke-direct/range {p0 .. p10}, Lcom/daaw/ap;-><init>(Lcom/daaw/wo;Landroid/net/Uri;Lcom/daaw/mp$a;Lcom/daaw/vv0$a;Lcom/daaw/vo$a;Lcom/daaw/wi;IJLjava/lang/Object;)V

    return-void
.end method

.method public static synthetic q(Lcom/daaw/ap;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/ap;->N()V

    return-void
.end method

.method public static synthetic s(Lcom/daaw/ap;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/ap;->H(Z)V

    return-void
.end method

.method public static synthetic t(Lcom/daaw/ap;)Lcom/daaw/jk0;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ap;->L:Lcom/daaw/jk0;

    return-object p0
.end method

.method public static synthetic u(Lcom/daaw/ap;)Ljava/io/IOException;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ap;->M:Ljava/io/IOException;

    return-object p0
.end method


# virtual methods
.method public A(Lcom/daaw/vv0;JJ)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vv0<",
            "*>;JJ)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/ap;->A:Lcom/daaw/cp0$a;

    iget-object v1, p1, Lcom/daaw/vv0;->a:Lcom/daaw/pp;

    iget v2, p1, Lcom/daaw/vv0;->b:I

    invoke-virtual {p1}, Lcom/daaw/vv0;->c()J

    move-result-wide v7

    move-wide v3, p2

    move-wide v5, p4

    invoke-virtual/range {v0 .. v8}, Lcom/daaw/cp0$a;->f(Lcom/daaw/pp;IJJJ)V

    return-void
.end method

.method public B(Lcom/daaw/vv0;JJ)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vv0<",
            "Lcom/daaw/wo;",
            ">;JJ)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-wide/from16 v11, p2

    iget-object v2, v1, Lcom/daaw/ap;->A:Lcom/daaw/cp0$a;

    iget-object v3, v0, Lcom/daaw/vv0;->a:Lcom/daaw/pp;

    iget v4, v0, Lcom/daaw/vv0;->b:I

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/vv0;->c()J

    move-result-wide v9

    move-wide/from16 v5, p2

    move-wide/from16 v7, p4

    invoke-virtual/range {v2 .. v10}, Lcom/daaw/cp0$a;->i(Lcom/daaw/pp;IJJJ)V

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/vv0;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/wo;

    iget-object v3, v1, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    const/4 v4, 0x0

    if-nez v3, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Lcom/daaw/wo;->e()I

    move-result v3

    :goto_0
    invoke-virtual {v2, v4}, Lcom/daaw/wo;->d(I)Lcom/daaw/gw0;

    move-result-object v5

    iget-wide v5, v5, Lcom/daaw/gw0;->b:J

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v3, :cond_1

    iget-object v8, v1, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    invoke-virtual {v8, v7}, Lcom/daaw/wo;->d(I)Lcom/daaw/gw0;

    move-result-object v8

    iget-wide v8, v8, Lcom/daaw/gw0;->b:J

    cmp-long v10, v8, v5

    if-gez v10, :cond_1

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_1
    iget-boolean v5, v2, Lcom/daaw/wo;->d:Z

    const/4 v6, 0x1

    if-eqz v5, :cond_7

    sub-int v5, v3, v7

    invoke-virtual {v2}, Lcom/daaw/wo;->e()I

    move-result v8

    if-le v5, v8, :cond_2

    :goto_2
    const/4 v5, 0x1

    goto :goto_4

    :cond_2
    iget-boolean v5, v1, Lcom/daaw/ap;->X:Z

    if-nez v5, :cond_4

    iget-wide v8, v1, Lcom/daaw/ap;->W:J

    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v8, v13

    if-eqz v5, :cond_3

    iget-wide v13, v2, Lcom/daaw/wo;->h:J

    const-wide/16 v15, 0x3e8

    mul-long v13, v13, v15

    cmp-long v5, v13, v8

    if-gtz v5, :cond_3

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    goto :goto_4

    :cond_4
    :goto_3
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Loaded stale dynamic manifest: "

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v8, v2, Lcom/daaw/wo;->h:J

    invoke-virtual {v5, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, ", "

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v8, v1, Lcom/daaw/ap;->X:Z

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v8, ", "

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v8, v1, Lcom/daaw/ap;->W:J

    invoke-virtual {v5, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    goto :goto_2

    :goto_4
    if-eqz v5, :cond_6

    iget v0, v1, Lcom/daaw/ap;->V:I

    add-int/lit8 v2, v0, 0x1

    iput v2, v1, Lcom/daaw/ap;->V:I

    iget v2, v1, Lcom/daaw/ap;->y:I

    if-ge v0, v2, :cond_5

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ap;->v()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/daaw/ap;->L(J)V

    goto :goto_5

    :cond_5
    new-instance v0, Lcom/daaw/yo;

    invoke-direct {v0}, Lcom/daaw/yo;-><init>()V

    iput-object v0, v1, Lcom/daaw/ap;->M:Ljava/io/IOException;

    :goto_5
    return-void

    :cond_6
    iput v4, v1, Lcom/daaw/ap;->V:I

    :cond_7
    iput-object v2, v1, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    iget-boolean v4, v1, Lcom/daaw/ap;->R:Z

    iget-boolean v5, v2, Lcom/daaw/wo;->d:Z

    and-int/2addr v4, v5

    iput-boolean v4, v1, Lcom/daaw/ap;->R:Z

    sub-long v4, v11, p4

    iput-wide v4, v1, Lcom/daaw/ap;->S:J

    iput-wide v11, v1, Lcom/daaw/ap;->T:J

    iget-object v2, v2, Lcom/daaw/wo;->j:Landroid/net/Uri;

    if-eqz v2, :cond_9

    iget-object v2, v1, Lcom/daaw/ap;->D:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v0, v0, Lcom/daaw/vv0;->a:Lcom/daaw/pp;

    iget-object v0, v0, Lcom/daaw/pp;->a:Landroid/net/Uri;

    iget-object v4, v1, Lcom/daaw/ap;->P:Landroid/net/Uri;

    if-ne v0, v4, :cond_8

    iget-object v0, v1, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    iget-object v0, v0, Lcom/daaw/wo;->j:Landroid/net/Uri;

    iput-object v0, v1, Lcom/daaw/ap;->P:Landroid/net/Uri;

    :cond_8
    monitor-exit v2

    goto :goto_6

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_9
    :goto_6
    if-nez v3, :cond_a

    iget-object v0, v1, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    iget-object v0, v0, Lcom/daaw/wo;->i:Lcom/daaw/pq1;

    if-eqz v0, :cond_b

    invoke-virtual {v1, v0}, Lcom/daaw/ap;->I(Lcom/daaw/pq1;)V

    goto :goto_7

    :cond_a
    iget v0, v1, Lcom/daaw/ap;->Y:I

    add-int/2addr v0, v7

    iput v0, v1, Lcom/daaw/ap;->Y:I

    :cond_b
    invoke-virtual {v1, v6}, Lcom/daaw/ap;->H(Z)V

    :goto_7
    return-void
.end method

.method public C(Lcom/daaw/vv0;JJLjava/io/IOException;)I
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vv0<",
            "Lcom/daaw/wo;",
            ">;JJ",
            "Ljava/io/IOException;",
            ")I"
        }
    .end annotation

    move-object v0, p1

    move-object/from16 v9, p6

    instance-of v11, v9, Lcom/daaw/tv0;

    move-object v12, p0

    iget-object v1, v12, Lcom/daaw/ap;->A:Lcom/daaw/cp0$a;

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

.method public D(Lcom/daaw/vv0;JJ)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vv0<",
            "Ljava/lang/Long;",
            ">;JJ)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/ap;->A:Lcom/daaw/cp0$a;

    iget-object v1, p1, Lcom/daaw/vv0;->a:Lcom/daaw/pp;

    iget v2, p1, Lcom/daaw/vv0;->b:I

    invoke-virtual {p1}, Lcom/daaw/vv0;->c()J

    move-result-wide v7

    move-wide v3, p2

    move-wide v5, p4

    invoke-virtual/range {v0 .. v8}, Lcom/daaw/cp0$a;->i(Lcom/daaw/pp;IJJJ)V

    invoke-virtual {p1}, Lcom/daaw/vv0;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p4

    sub-long/2addr p4, p2

    invoke-virtual {p0, p4, p5}, Lcom/daaw/ap;->G(J)V

    return-void
.end method

.method public E(Lcom/daaw/vv0;JJLjava/io/IOException;)I
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vv0<",
            "Ljava/lang/Long;",
            ">;JJ",
            "Ljava/io/IOException;",
            ")I"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    iget-object v2, v0, Lcom/daaw/ap;->A:Lcom/daaw/cp0$a;

    iget-object v3, v1, Lcom/daaw/vv0;->a:Lcom/daaw/pp;

    iget v4, v1, Lcom/daaw/vv0;->b:I

    invoke-virtual {p1}, Lcom/daaw/vv0;->c()J

    move-result-wide v8

    const/4 v11, 0x1

    move-object v1, v2

    move-object v2, v3

    move v3, v4

    move-wide v4, p2

    move-wide/from16 v6, p4

    move-object/from16 v10, p6

    invoke-virtual/range {v1 .. v11}, Lcom/daaw/cp0$a;->l(Lcom/daaw/pp;IJJJLjava/io/IOException;Z)V

    move-object/from16 v1, p6

    invoke-virtual {p0, v1}, Lcom/daaw/ap;->F(Ljava/io/IOException;)V

    const/4 v1, 0x2

    return v1
.end method

.method public final F(Ljava/io/IOException;)V
    .locals 0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/daaw/ap;->H(Z)V

    return-void
.end method

.method public final G(J)V
    .locals 0

    iput-wide p1, p0, Lcom/daaw/ap;->U:J

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/daaw/ap;->H(Z)V

    return-void
.end method

.method public final H(Z)V
    .locals 28

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    iget-object v3, v0, Lcom/daaw/ap;->E:Landroid/util/SparseArray;

    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    iget-object v3, v0, Lcom/daaw/ap;->E:Landroid/util/SparseArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v3

    iget v4, v0, Lcom/daaw/ap;->Y:I

    if-lt v3, v4, :cond_0

    iget-object v4, v0, Lcom/daaw/ap;->E:Landroid/util/SparseArray;

    invoke-virtual {v4, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/zo;

    iget-object v5, v0, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    iget v6, v0, Lcom/daaw/ap;->Y:I

    sub-int/2addr v3, v6

    invoke-virtual {v4, v5, v3}, Lcom/daaw/zo;->H(Lcom/daaw/wo;I)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v2, v0, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    invoke-virtual {v2}, Lcom/daaw/wo;->e()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    iget-object v4, v0, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    invoke-virtual {v4, v1}, Lcom/daaw/wo;->d(I)Lcom/daaw/gw0;

    move-result-object v4

    iget-object v5, v0, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    invoke-virtual {v5, v1}, Lcom/daaw/wo;->g(I)J

    move-result-wide v5

    invoke-static {v4, v5, v6}, Lcom/daaw/ap$i;->a(Lcom/daaw/gw0;J)Lcom/daaw/ap$i;

    move-result-object v4

    iget-object v5, v0, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    invoke-virtual {v5, v2}, Lcom/daaw/wo;->d(I)Lcom/daaw/gw0;

    move-result-object v5

    iget-object v6, v0, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    invoke-virtual {v6, v2}, Lcom/daaw/wo;->g(I)J

    move-result-wide v6

    invoke-static {v5, v6, v7}, Lcom/daaw/ap$i;->a(Lcom/daaw/gw0;J)Lcom/daaw/ap$i;

    move-result-object v5

    iget-wide v6, v4, Lcom/daaw/ap$i;->b:J

    iget-wide v8, v5, Lcom/daaw/ap$i;->c:J

    iget-object v4, v0, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    iget-boolean v4, v4, Lcom/daaw/wo;->d:Z

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v12, 0x0

    if-eqz v4, :cond_5

    iget-boolean v4, v5, Lcom/daaw/ap$i;->a:Z

    if-nez v4, :cond_5

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ap;->w()J

    move-result-wide v4

    iget-object v14, v0, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    iget-wide v14, v14, Lcom/daaw/wo;->a:J

    invoke-static {v14, v15}, Lcom/daaw/dd;->a(J)J

    move-result-wide v14

    sub-long/2addr v4, v14

    iget-object v14, v0, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    invoke-virtual {v14, v2}, Lcom/daaw/wo;->d(I)Lcom/daaw/gw0;

    move-result-object v14

    iget-wide v14, v14, Lcom/daaw/gw0;->b:J

    invoke-static {v14, v15}, Lcom/daaw/dd;->a(J)J

    move-result-wide v14

    sub-long/2addr v4, v14

    invoke-static {v4, v5, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    iget-object v4, v0, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    iget-wide v4, v4, Lcom/daaw/wo;->f:J

    cmp-long v14, v4, v10

    if-eqz v14, :cond_4

    invoke-static {v4, v5}, Lcom/daaw/dd;->a(J)J

    move-result-wide v4

    sub-long v4, v8, v4

    :goto_1
    cmp-long v14, v4, v12

    if-gez v14, :cond_2

    if-lez v2, :cond_2

    iget-object v14, v0, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v14, v2}, Lcom/daaw/wo;->g(I)J

    move-result-wide v14

    add-long/2addr v4, v14

    goto :goto_1

    :cond_2
    if-nez v2, :cond_3

    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    goto :goto_2

    :cond_3
    iget-object v2, v0, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    invoke-virtual {v2, v1}, Lcom/daaw/wo;->g(I)J

    move-result-wide v4

    :goto_2
    move-wide v6, v4

    :cond_4
    move-wide/from16 v20, v6

    const/4 v2, 0x1

    goto :goto_3

    :cond_5
    move-wide/from16 v20, v6

    const/4 v2, 0x0

    :goto_3
    sub-long v8, v8, v20

    move-wide/from16 v22, v8

    const/4 v4, 0x0

    :goto_4
    iget-object v5, v0, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    invoke-virtual {v5}, Lcom/daaw/wo;->e()I

    move-result v5

    sub-int/2addr v5, v3

    if-ge v4, v5, :cond_6

    iget-object v5, v0, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    invoke-virtual {v5, v4}, Lcom/daaw/wo;->g(I)J

    move-result-wide v5

    add-long v22, v22, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_6
    iget-object v3, v0, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    iget-boolean v4, v3, Lcom/daaw/wo;->d:Z

    if-eqz v4, :cond_a

    iget-wide v4, v0, Lcom/daaw/ap;->z:J

    const-wide/16 v6, -0x1

    cmp-long v8, v4, v6

    if-nez v8, :cond_8

    iget-wide v3, v3, Lcom/daaw/wo;->g:J

    cmp-long v5, v3, v10

    if-eqz v5, :cond_7

    goto :goto_5

    :cond_7
    const-wide/16 v3, 0x7530

    :goto_5
    move-wide v4, v3

    :cond_8
    invoke-static {v4, v5}, Lcom/daaw/dd;->a(J)J

    move-result-wide v3

    sub-long v3, v22, v3

    const-wide/32 v5, 0x4c4b40

    cmp-long v7, v3, v5

    if-gez v7, :cond_9

    const-wide/16 v3, 0x2

    div-long v3, v22, v3

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    :cond_9
    move-wide/from16 v24, v3

    goto :goto_6

    :cond_a
    move-wide/from16 v24, v12

    :goto_6
    iget-object v3, v0, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    iget-wide v4, v3, Lcom/daaw/wo;->a:J

    invoke-virtual {v3, v1}, Lcom/daaw/wo;->d(I)Lcom/daaw/gw0;

    move-result-object v1

    iget-wide v6, v1, Lcom/daaw/gw0;->b:J

    add-long/2addr v4, v6

    invoke-static/range {v20 .. v21}, Lcom/daaw/dd;->b(J)J

    move-result-wide v6

    add-long v17, v4, v6

    new-instance v1, Lcom/daaw/ap$c;

    iget-object v3, v0, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    iget-wide v4, v3, Lcom/daaw/wo;->a:J

    iget v6, v0, Lcom/daaw/ap;->Y:I

    iget-object v7, v0, Lcom/daaw/ap;->J:Ljava/lang/Object;

    move-object v14, v1

    move-wide v15, v4

    move/from16 v19, v6

    move-object/from16 v26, v3

    move-object/from16 v27, v7

    invoke-direct/range {v14 .. v27}, Lcom/daaw/ap$c;-><init>(JJIJJJLcom/daaw/wo;Ljava/lang/Object;)V

    iget-object v3, v0, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    invoke-virtual {v0, v1, v3}, Lcom/daaw/ua;->n(Lcom/daaw/nl1;Ljava/lang/Object;)V

    iget-boolean v1, v0, Lcom/daaw/ap;->u:Z

    if-nez v1, :cond_e

    iget-object v1, v0, Lcom/daaw/ap;->N:Landroid/os/Handler;

    iget-object v3, v0, Lcom/daaw/ap;->G:Ljava/lang/Runnable;

    invoke-virtual {v1, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const-wide/16 v3, 0x1388

    if-eqz v2, :cond_b

    iget-object v1, v0, Lcom/daaw/ap;->N:Landroid/os/Handler;

    iget-object v2, v0, Lcom/daaw/ap;->G:Ljava/lang/Runnable;

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_b
    iget-boolean v1, v0, Lcom/daaw/ap;->R:Z

    if-eqz v1, :cond_c

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ap;->N()V

    goto :goto_8

    :cond_c
    if-eqz p1, :cond_e

    iget-object v1, v0, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    iget-boolean v2, v1, Lcom/daaw/wo;->d:Z

    if-eqz v2, :cond_e

    iget-wide v1, v1, Lcom/daaw/wo;->e:J

    cmp-long v5, v1, v10

    if-eqz v5, :cond_e

    cmp-long v5, v1, v12

    if-nez v5, :cond_d

    goto :goto_7

    :cond_d
    move-wide v3, v1

    :goto_7
    iget-wide v1, v0, Lcom/daaw/ap;->S:J

    add-long/2addr v1, v3

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-static {v12, v13, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ap;->L(J)V

    :cond_e
    :goto_8
    return-void
.end method

.method public final I(Lcom/daaw/pq1;)V
    .locals 2

    iget-object v0, p1, Lcom/daaw/pq1;->a:Ljava/lang/String;

    const-string v1, "urn:mpeg:dash:utc:direct:2014"

    invoke-static {v0, v1}, Lcom/daaw/sq1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    const-string v1, "urn:mpeg:dash:utc:direct:2012"

    invoke-static {v0, v1}, Lcom/daaw/sq1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_3

    :cond_0
    const-string v1, "urn:mpeg:dash:utc:http-iso:2014"

    invoke-static {v0, v1}, Lcom/daaw/sq1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "urn:mpeg:dash:utc:http-iso:2012"

    invoke-static {v0, v1}, Lcom/daaw/sq1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const-string v1, "urn:mpeg:dash:utc:http-xsdate:2014"

    invoke-static {v0, v1}, Lcom/daaw/sq1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "urn:mpeg:dash:utc:http-xsdate:2012"

    invoke-static {v0, v1}, Lcom/daaw/sq1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Unsupported UTC timing scheme"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/daaw/ap;->F(Ljava/io/IOException;)V

    goto :goto_4

    :cond_3
    :goto_0
    new-instance v0, Lcom/daaw/ap$k;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/ap$k;-><init>(Lcom/daaw/ap$a;)V

    goto :goto_2

    :cond_4
    :goto_1
    new-instance v0, Lcom/daaw/ap$f;

    invoke-direct {v0}, Lcom/daaw/ap$f;-><init>()V

    :goto_2
    invoke-virtual {p0, p1, v0}, Lcom/daaw/ap;->K(Lcom/daaw/pq1;Lcom/daaw/vv0$a;)V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-virtual {p0, p1}, Lcom/daaw/ap;->J(Lcom/daaw/pq1;)V

    :goto_4
    return-void
.end method

.method public final J(Lcom/daaw/pq1;)V
    .locals 4

    :try_start_0
    iget-object p1, p1, Lcom/daaw/pq1;->b:Ljava/lang/String;

    invoke-static {p1}, Lcom/daaw/sq1;->O(Ljava/lang/String;)J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/ap;->T:J

    sub-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lcom/daaw/ap;->G(J)V
    :try_end_0
    .catch Lcom/daaw/tv0; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, Lcom/daaw/ap;->F(Ljava/io/IOException;)V

    :goto_0
    return-void
.end method

.method public final K(Lcom/daaw/pq1;Lcom/daaw/vv0$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/pq1;",
            "Lcom/daaw/vv0$a<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/daaw/vv0;

    iget-object v1, p0, Lcom/daaw/ap;->K:Lcom/daaw/mp;

    iget-object p1, p1, Lcom/daaw/pq1;->b:Ljava/lang/String;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const/4 v2, 0x5

    invoke-direct {v0, v1, p1, v2, p2}, Lcom/daaw/vv0;-><init>(Lcom/daaw/mp;Landroid/net/Uri;ILcom/daaw/vv0$a;)V

    new-instance p1, Lcom/daaw/ap$j;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcom/daaw/ap$j;-><init>(Lcom/daaw/ap;Lcom/daaw/ap$a;)V

    const/4 p2, 0x1

    invoke-virtual {p0, v0, p1, p2}, Lcom/daaw/ap;->M(Lcom/daaw/vv0;Lcom/daaw/jk0$a;I)V

    return-void
.end method

.method public final L(J)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ap;->N:Landroid/os/Handler;

    iget-object v1, p0, Lcom/daaw/ap;->F:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final M(Lcom/daaw/vv0;Lcom/daaw/jk0$a;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/vv0<",
            "TT;>;",
            "Lcom/daaw/jk0$a<",
            "Lcom/daaw/vv0<",
            "TT;>;>;I)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/ap;->L:Lcom/daaw/jk0;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/jk0;->k(Lcom/daaw/jk0$c;Lcom/daaw/jk0$a;I)J

    move-result-wide p2

    iget-object v0, p0, Lcom/daaw/ap;->A:Lcom/daaw/cp0$a;

    iget-object v1, p1, Lcom/daaw/vv0;->a:Lcom/daaw/pp;

    iget p1, p1, Lcom/daaw/vv0;->b:I

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/daaw/cp0$a;->o(Lcom/daaw/pp;IJ)V

    return-void
.end method

.method public final N()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/ap;->N:Landroid/os/Handler;

    iget-object v1, p0, Lcom/daaw/ap;->F:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/daaw/ap;->L:Lcom/daaw/jk0;

    invoke-virtual {v0}, Lcom/daaw/jk0;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/ap;->R:Z

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/ap;->D:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/ap;->P:Landroid/net/Uri;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/ap;->R:Z

    new-instance v0, Lcom/daaw/vv0;

    iget-object v2, p0, Lcom/daaw/ap;->K:Lcom/daaw/mp;

    const/4 v3, 0x4

    iget-object v4, p0, Lcom/daaw/ap;->B:Lcom/daaw/vv0$a;

    invoke-direct {v0, v2, v1, v3, v4}, Lcom/daaw/vv0;-><init>(Lcom/daaw/mp;Landroid/net/Uri;ILcom/daaw/vv0$a;)V

    iget-object v1, p0, Lcom/daaw/ap;->C:Lcom/daaw/ap$g;

    iget v2, p0, Lcom/daaw/ap;->y:I

    invoke-virtual {p0, v0, v1, v2}, Lcom/daaw/ap;->M(Lcom/daaw/vv0;Lcom/daaw/jk0$a;I)V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public a(Lcom/daaw/qo0;)V
    .locals 1

    check-cast p1, Lcom/daaw/zo;

    invoke-virtual {p1}, Lcom/daaw/zo;->C()V

    iget-object v0, p0, Lcom/daaw/ap;->E:Landroid/util/SparseArray;

    iget p1, p1, Lcom/daaw/zo;->p:I

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ap;->I:Lcom/daaw/lk0;

    invoke-interface {v0}, Lcom/daaw/lk0;->a()V

    return-void
.end method

.method public g(Lcom/daaw/bp0$a;Lcom/daaw/l2;)Lcom/daaw/qo0;
    .locals 13

    iget v3, p1, Lcom/daaw/bp0$a;->a:I

    iget-object v0, p0, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    invoke-virtual {v0, v3}, Lcom/daaw/wo;->d(I)Lcom/daaw/gw0;

    move-result-object v0

    iget-wide v0, v0, Lcom/daaw/gw0;->b:J

    invoke-virtual {p0, p1, v0, v1}, Lcom/daaw/ua;->l(Lcom/daaw/bp0$a;J)Lcom/daaw/cp0$a;

    move-result-object v6

    new-instance p1, Lcom/daaw/zo;

    iget v0, p0, Lcom/daaw/ap;->Y:I

    add-int v1, v0, v3

    iget-object v2, p0, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    iget-object v4, p0, Lcom/daaw/ap;->w:Lcom/daaw/vo$a;

    iget v5, p0, Lcom/daaw/ap;->y:I

    iget-wide v7, p0, Lcom/daaw/ap;->U:J

    iget-object v9, p0, Lcom/daaw/ap;->I:Lcom/daaw/lk0;

    iget-object v11, p0, Lcom/daaw/ap;->x:Lcom/daaw/wi;

    iget-object v12, p0, Lcom/daaw/ap;->H:Lcom/daaw/ex0$b;

    move-object v0, p1

    move-object v10, p2

    invoke-direct/range {v0 .. v12}, Lcom/daaw/zo;-><init>(ILcom/daaw/wo;ILcom/daaw/vo$a;ILcom/daaw/cp0$a;JLcom/daaw/lk0;Lcom/daaw/l2;Lcom/daaw/wi;Lcom/daaw/ex0$b;)V

    iget-object p2, p0, Lcom/daaw/ap;->E:Landroid/util/SparseArray;

    iget v0, p1, Lcom/daaw/zo;->p:I

    invoke-virtual {p2, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object p1
.end method

.method public m(Lcom/daaw/rz;Z)V
    .locals 0

    iget-boolean p1, p0, Lcom/daaw/ap;->u:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/daaw/ap;->H(Z)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/ap;->v:Lcom/daaw/mp$a;

    invoke-interface {p1}, Lcom/daaw/mp$a;->a()Lcom/daaw/mp;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ap;->K:Lcom/daaw/mp;

    new-instance p1, Lcom/daaw/jk0;

    const-string p2, "Loader:DashMediaSource"

    invoke-direct {p1, p2}, Lcom/daaw/jk0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/daaw/ap;->L:Lcom/daaw/jk0;

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/daaw/ap;->N:Landroid/os/Handler;

    invoke-virtual {p0}, Lcom/daaw/ap;->N()V

    :goto_0
    return-void
.end method

.method public p()V
    .locals 5

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/ap;->R:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/daaw/ap;->K:Lcom/daaw/mp;

    iget-object v2, p0, Lcom/daaw/ap;->L:Lcom/daaw/jk0;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/daaw/jk0;->i()V

    iput-object v1, p0, Lcom/daaw/ap;->L:Lcom/daaw/jk0;

    :cond_0
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/daaw/ap;->S:J

    iput-wide v2, p0, Lcom/daaw/ap;->T:J

    iget-boolean v4, p0, Lcom/daaw/ap;->u:Z

    if-eqz v4, :cond_1

    iget-object v4, p0, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    goto :goto_0

    :cond_1
    move-object v4, v1

    :goto_0
    iput-object v4, p0, Lcom/daaw/ap;->Q:Lcom/daaw/wo;

    iget-object v4, p0, Lcom/daaw/ap;->O:Landroid/net/Uri;

    iput-object v4, p0, Lcom/daaw/ap;->P:Landroid/net/Uri;

    iput-object v1, p0, Lcom/daaw/ap;->M:Ljava/io/IOException;

    iget-object v4, p0, Lcom/daaw/ap;->N:Landroid/os/Handler;

    if-eqz v4, :cond_2

    invoke-virtual {v4, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/daaw/ap;->N:Landroid/os/Handler;

    :cond_2
    iput-wide v2, p0, Lcom/daaw/ap;->U:J

    iput v0, p0, Lcom/daaw/ap;->V:I

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, p0, Lcom/daaw/ap;->W:J

    iput-boolean v0, p0, Lcom/daaw/ap;->X:Z

    iput v0, p0, Lcom/daaw/ap;->Y:I

    iget-object v0, p0, Lcom/daaw/ap;->E:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    return-void
.end method

.method public final v()J
    .locals 2

    iget v0, p0, Lcom/daaw/ap;->V:I

    add-int/lit8 v0, v0, -0x1

    mul-int/lit16 v0, v0, 0x3e8

    const/16 v1, 0x1388

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public final w()J
    .locals 5

    iget-wide v0, p0, Lcom/daaw/ap;->U:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/ap;->U:J

    add-long/2addr v0, v2

    :goto_0
    invoke-static {v0, v1}, Lcom/daaw/dd;->a(J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    goto :goto_0
.end method

.method public x()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/ap;->X:Z

    return-void
.end method

.method public y(J)V
    .locals 5

    iget-wide v0, p0, Lcom/daaw/ap;->W:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    cmp-long v2, v0, p1

    if-gez v2, :cond_1

    :cond_0
    iput-wide p1, p0, Lcom/daaw/ap;->W:J

    :cond_1
    return-void
.end method

.method public z()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ap;->N:Landroid/os/Handler;

    iget-object v1, p0, Lcom/daaw/ap;->G:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-virtual {p0}, Lcom/daaw/ap;->N()V

    return-void
.end method
