.class public final Lcom/daaw/uz;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;
.implements Lcom/daaw/qo0$a;
.implements Lcom/daaw/wm1$a;
.implements Lcom/daaw/bp0$b;
.implements Lcom/daaw/mr$a;
.implements Lcom/daaw/fx0$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/uz$d;,
        Lcom/daaw/uz$b;,
        Lcom/daaw/uz$c;,
        Lcom/daaw/uz$e;
    }
.end annotation


# instance fields
.field public final A:J

.field public final B:Z

.field public final C:Lcom/daaw/mr;

.field public final D:Lcom/daaw/uz$d;

.field public final E:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/daaw/uz$c;",
            ">;"
        }
    .end annotation
.end field

.field public final F:Lcom/daaw/zf;

.field public final G:Lcom/daaw/to0;

.field public H:Lcom/daaw/ea1;

.field public I:Lcom/daaw/yw0;

.field public J:Lcom/daaw/bp0;

.field public K:[Lcom/daaw/a41;

.field public L:Z

.field public M:Z

.field public N:Z

.field public O:I

.field public P:Z

.field public Q:I

.field public R:Lcom/daaw/uz$e;

.field public S:J

.field public T:I

.field public final p:[Lcom/daaw/a41;

.field public final q:[Lcom/daaw/b41;

.field public final r:Lcom/daaw/wm1;

.field public final s:Lcom/daaw/xm1;

.field public final t:Lcom/daaw/hk0;

.field public final u:Lcom/daaw/u80;

.field public final v:Landroid/os/HandlerThread;

.field public final w:Landroid/os/Handler;

.field public final x:Lcom/daaw/rz;

.field public final y:Lcom/daaw/nl1$c;

.field public final z:Lcom/daaw/nl1$b;


# direct methods
.method public constructor <init>([Lcom/daaw/a41;Lcom/daaw/wm1;Lcom/daaw/xm1;Lcom/daaw/hk0;ZIZLandroid/os/Handler;Lcom/daaw/rz;Lcom/daaw/zf;)V
    .locals 10

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v3, p10

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lcom/daaw/uz;->p:[Lcom/daaw/a41;

    iput-object v2, v0, Lcom/daaw/uz;->r:Lcom/daaw/wm1;

    move-object v4, p3

    iput-object v4, v0, Lcom/daaw/uz;->s:Lcom/daaw/xm1;

    move-object v5, p4

    iput-object v5, v0, Lcom/daaw/uz;->t:Lcom/daaw/hk0;

    move v6, p5

    iput-boolean v6, v0, Lcom/daaw/uz;->M:Z

    move/from16 v6, p6

    iput v6, v0, Lcom/daaw/uz;->O:I

    move/from16 v6, p7

    iput-boolean v6, v0, Lcom/daaw/uz;->P:Z

    move-object/from16 v6, p8

    iput-object v6, v0, Lcom/daaw/uz;->w:Landroid/os/Handler;

    move-object/from16 v6, p9

    iput-object v6, v0, Lcom/daaw/uz;->x:Lcom/daaw/rz;

    iput-object v3, v0, Lcom/daaw/uz;->F:Lcom/daaw/zf;

    new-instance v6, Lcom/daaw/to0;

    invoke-direct {v6}, Lcom/daaw/to0;-><init>()V

    iput-object v6, v0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-interface {p4}, Lcom/daaw/hk0;->d()J

    move-result-wide v6

    iput-wide v6, v0, Lcom/daaw/uz;->A:J

    invoke-interface {p4}, Lcom/daaw/hk0;->b()Z

    move-result v5

    iput-boolean v5, v0, Lcom/daaw/uz;->B:Z

    sget-object v5, Lcom/daaw/ea1;->g:Lcom/daaw/ea1;

    iput-object v5, v0, Lcom/daaw/uz;->H:Lcom/daaw/ea1;

    new-instance v5, Lcom/daaw/yw0;

    sget-object v6, Lcom/daaw/nl1;->a:Lcom/daaw/nl1;

    sget-object v7, Lcom/google/android/exoplayer2/source/TrackGroupArray;->s:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    move-object p4, v5

    move-object p5, v6

    move-wide/from16 p6, v8

    move-object/from16 p8, v7

    move-object/from16 p9, p3

    invoke-direct/range {p4 .. p9}, Lcom/daaw/yw0;-><init>(Lcom/daaw/nl1;JLcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/daaw/xm1;)V

    iput-object v5, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    new-instance v4, Lcom/daaw/uz$d;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lcom/daaw/uz$d;-><init>(Lcom/daaw/uz$a;)V

    iput-object v4, v0, Lcom/daaw/uz;->D:Lcom/daaw/uz$d;

    array-length v4, v1

    new-array v4, v4, [Lcom/daaw/b41;

    iput-object v4, v0, Lcom/daaw/uz;->q:[Lcom/daaw/b41;

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    array-length v6, v1

    if-ge v5, v6, :cond_0

    aget-object v6, v1, v5

    invoke-interface {v6, v5}, Lcom/daaw/a41;->e(I)V

    iget-object v6, v0, Lcom/daaw/uz;->q:[Lcom/daaw/b41;

    aget-object v7, v1, v5

    invoke-interface {v7}, Lcom/daaw/a41;->n()Lcom/daaw/b41;

    move-result-object v7

    aput-object v7, v6, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/daaw/mr;

    invoke-direct {v1, p0, v3}, Lcom/daaw/mr;-><init>(Lcom/daaw/mr$a;Lcom/daaw/zf;)V

    iput-object v1, v0, Lcom/daaw/uz;->C:Lcom/daaw/mr;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/daaw/uz;->E:Ljava/util/ArrayList;

    new-array v1, v4, [Lcom/daaw/a41;

    iput-object v1, v0, Lcom/daaw/uz;->K:[Lcom/daaw/a41;

    new-instance v1, Lcom/daaw/nl1$c;

    invoke-direct {v1}, Lcom/daaw/nl1$c;-><init>()V

    iput-object v1, v0, Lcom/daaw/uz;->y:Lcom/daaw/nl1$c;

    new-instance v1, Lcom/daaw/nl1$b;

    invoke-direct {v1}, Lcom/daaw/nl1$b;-><init>()V

    iput-object v1, v0, Lcom/daaw/uz;->z:Lcom/daaw/nl1$b;

    invoke-virtual {p2, p0}, Lcom/daaw/wm1;->a(Lcom/daaw/wm1$a;)V

    new-instance v1, Landroid/os/HandlerThread;

    const/16 v2, -0x10

    const-string v4, "ExoPlayerImplInternal:Handler"

    invoke-direct {v1, v4, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object v1, v0, Lcom/daaw/uz;->v:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->start()V

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-interface {v3, v1, p0}, Lcom/daaw/zf;->d(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lcom/daaw/u80;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/uz;->u:Lcom/daaw/u80;

    return-void
.end method

.method public static synthetic e(Lcom/daaw/uz;Lcom/daaw/fx0;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/uz;->f(Lcom/daaw/fx0;)V

    return-void
.end method

.method public static p(Lcom/google/android/exoplayer2/trackselection/c;)[Lcom/google/android/exoplayer2/Format;
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lcom/google/android/exoplayer2/trackselection/c;->length()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-array v2, v1, [Lcom/google/android/exoplayer2/Format;

    :goto_1
    if-ge v0, v1, :cond_1

    invoke-interface {p0, v0}, Lcom/google/android/exoplayer2/trackselection/c;->d(I)Lcom/google/android/exoplayer2/Format;

    move-result-object v3

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-object v2
.end method


# virtual methods
.method public final A(JJ)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/uz;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-object v0, v0, Lcom/daaw/yw0;->c:Lcom/daaw/bp0$a;

    invoke-virtual {v0}, Lcom/daaw/bp0$a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_7

    :cond_0
    iget-object v0, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-wide v1, v0, Lcom/daaw/yw0;->d:J

    cmp-long v3, v1, p1

    if-nez v3, :cond_1

    const-wide/16 v1, 0x1

    sub-long/2addr p1, v1

    :cond_1
    iget-object v0, v0, Lcom/daaw/yw0;->c:Lcom/daaw/bp0$a;

    iget v0, v0, Lcom/daaw/bp0$a;->a:I

    iget v1, p0, Lcom/daaw/uz;->T:I

    const/4 v2, 0x0

    if-lez v1, :cond_2

    iget-object v3, p0, Lcom/daaw/uz;->E:Ljava/util/ArrayList;

    :goto_0
    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/uz$c;

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    if-eqz v1, :cond_4

    iget v3, v1, Lcom/daaw/uz$c;->q:I

    if-gt v3, v0, :cond_3

    if-ne v3, v0, :cond_4

    iget-wide v3, v1, Lcom/daaw/uz$c;->r:J

    cmp-long v1, v3, p1

    if-lez v1, :cond_4

    :cond_3
    iget v1, p0, Lcom/daaw/uz;->T:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/daaw/uz;->T:I

    if-lez v1, :cond_2

    iget-object v3, p0, Lcom/daaw/uz;->E:Ljava/util/ArrayList;

    goto :goto_0

    :cond_4
    iget v1, p0, Lcom/daaw/uz;->T:I

    iget-object v3, p0, Lcom/daaw/uz;->E:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_5

    :goto_2
    iget-object v1, p0, Lcom/daaw/uz;->E:Ljava/util/ArrayList;

    iget v3, p0, Lcom/daaw/uz;->T:I

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/uz$c;

    goto :goto_3

    :cond_5
    move-object v1, v2

    :goto_3
    if-eqz v1, :cond_7

    iget-object v3, v1, Lcom/daaw/uz$c;->s:Ljava/lang/Object;

    if-eqz v3, :cond_7

    iget v3, v1, Lcom/daaw/uz$c;->q:I

    if-lt v3, v0, :cond_6

    if-ne v3, v0, :cond_7

    iget-wide v3, v1, Lcom/daaw/uz$c;->r:J

    cmp-long v5, v3, p1

    if-gtz v5, :cond_7

    :cond_6
    iget v1, p0, Lcom/daaw/uz;->T:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/daaw/uz;->T:I

    iget-object v3, p0, Lcom/daaw/uz;->E:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_5

    goto :goto_2

    :cond_7
    :goto_4
    if-eqz v1, :cond_b

    iget-object v3, v1, Lcom/daaw/uz$c;->s:Ljava/lang/Object;

    if-eqz v3, :cond_b

    iget v3, v1, Lcom/daaw/uz$c;->q:I

    if-ne v3, v0, :cond_b

    iget-wide v3, v1, Lcom/daaw/uz$c;->r:J

    cmp-long v5, v3, p1

    if-lez v5, :cond_b

    cmp-long v5, v3, p3

    if-gtz v5, :cond_b

    iget-object v3, v1, Lcom/daaw/uz$c;->p:Lcom/daaw/fx0;

    invoke-virtual {p0, v3}, Lcom/daaw/uz;->W(Lcom/daaw/fx0;)V

    iget-object v3, v1, Lcom/daaw/uz$c;->p:Lcom/daaw/fx0;

    invoke-virtual {v3}, Lcom/daaw/fx0;->b()Z

    move-result v3

    if-nez v3, :cond_9

    iget-object v1, v1, Lcom/daaw/uz$c;->p:Lcom/daaw/fx0;

    invoke-virtual {v1}, Lcom/daaw/fx0;->j()Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_5

    :cond_8
    iget v1, p0, Lcom/daaw/uz;->T:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/daaw/uz;->T:I

    goto :goto_6

    :cond_9
    :goto_5
    iget-object v1, p0, Lcom/daaw/uz;->E:Ljava/util/ArrayList;

    iget v3, p0, Lcom/daaw/uz;->T:I

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :goto_6
    iget v1, p0, Lcom/daaw/uz;->T:I

    iget-object v3, p0, Lcom/daaw/uz;->E:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_a

    iget-object v1, p0, Lcom/daaw/uz;->E:Ljava/util/ArrayList;

    iget v3, p0, Lcom/daaw/uz;->T:I

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/uz$c;

    goto :goto_4

    :cond_a
    move-object v1, v2

    goto :goto_4

    :cond_b
    :goto_7
    return-void
.end method

.method public final B()V
    .locals 12

    iget-object v0, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    iget-wide v1, p0, Lcom/daaw/uz;->S:J

    invoke-virtual {v0, v1, v2}, Lcom/daaw/to0;->v(J)V

    iget-object v0, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v0}, Lcom/daaw/to0;->B()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    iget-wide v1, p0, Lcom/daaw/uz;->S:J

    iget-object v3, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/to0;->m(JLcom/daaw/yw0;)Lcom/daaw/so0;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/uz;->J:Lcom/daaw/bp0;

    invoke-interface {v0}, Lcom/daaw/bp0;->e()V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-object v1, v1, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    iget-object v2, v0, Lcom/daaw/so0;->a:Lcom/daaw/bp0$a;

    iget v2, v2, Lcom/daaw/bp0$a;->a:I

    iget-object v3, p0, Lcom/daaw/uz;->z:Lcom/daaw/nl1$b;

    const/4 v11, 0x1

    invoke-virtual {v1, v2, v3, v11}, Lcom/daaw/nl1;->g(ILcom/daaw/nl1$b;Z)Lcom/daaw/nl1$b;

    move-result-object v1

    iget-object v9, v1, Lcom/daaw/nl1$b;->b:Ljava/lang/Object;

    iget-object v4, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    iget-object v5, p0, Lcom/daaw/uz;->q:[Lcom/daaw/b41;

    iget-object v6, p0, Lcom/daaw/uz;->r:Lcom/daaw/wm1;

    iget-object v1, p0, Lcom/daaw/uz;->t:Lcom/daaw/hk0;

    invoke-interface {v1}, Lcom/daaw/hk0;->h()Lcom/daaw/l2;

    move-result-object v7

    iget-object v8, p0, Lcom/daaw/uz;->J:Lcom/daaw/bp0;

    move-object v10, v0

    invoke-virtual/range {v4 .. v10}, Lcom/daaw/to0;->e([Lcom/daaw/b41;Lcom/daaw/wm1;Lcom/daaw/l2;Lcom/daaw/bp0;Ljava/lang/Object;Lcom/daaw/so0;)Lcom/daaw/qo0;

    move-result-object v1

    iget-wide v2, v0, Lcom/daaw/so0;->b:J

    invoke-interface {v1, p0, v2, v3}, Lcom/daaw/qo0;->p(Lcom/daaw/qo0$a;J)V

    invoke-virtual {p0, v11}, Lcom/daaw/uz;->Y(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public C(Lcom/daaw/qo0;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/uz;->u:Lcom/daaw/u80;

    const/16 v1, 0xa

    invoke-interface {v0, v1, p1}, Lcom/daaw/u80;->f(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public D(Lcom/daaw/bp0;ZZ)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/uz;->u:Lcom/daaw/u80;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p2, p3, p1}, Lcom/daaw/u80;->c(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public final E(Lcom/daaw/bp0;ZZ)V
    .locals 2

    iget v0, p0, Lcom/daaw/uz;->Q:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/uz;->Q:I

    invoke-virtual {p0, v1, p2, p3}, Lcom/daaw/uz;->J(ZZZ)V

    iget-object p2, p0, Lcom/daaw/uz;->t:Lcom/daaw/hk0;

    invoke-interface {p2}, Lcom/daaw/hk0;->a()V

    iput-object p1, p0, Lcom/daaw/uz;->J:Lcom/daaw/bp0;

    const/4 p2, 0x2

    invoke-virtual {p0, p2}, Lcom/daaw/uz;->f0(I)V

    iget-object p3, p0, Lcom/daaw/uz;->x:Lcom/daaw/rz;

    invoke-interface {p1, p3, v1, p0}, Lcom/daaw/bp0;->f(Lcom/daaw/rz;ZLcom/daaw/bp0$b;)V

    iget-object p1, p0, Lcom/daaw/uz;->u:Lcom/daaw/u80;

    invoke-interface {p1, p2}, Lcom/daaw/u80;->b(I)Z

    return-void
.end method

.method public declared-synchronized F()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/uz;->L:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/daaw/uz;->u:Lcom/daaw/u80;

    const/4 v1, 0x7

    invoke-interface {v0, v1}, Lcom/daaw/u80;->b(I)Z

    const/4 v0, 0x0

    :goto_0
    iget-boolean v1, p0, Lcom/daaw/uz;->L:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_1

    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method public final G()V
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, v0, v0, v0}, Lcom/daaw/uz;->J(ZZZ)V

    iget-object v1, p0, Lcom/daaw/uz;->t:Lcom/daaw/hk0;

    invoke-interface {v1}, Lcom/daaw/hk0;->g()V

    invoke-virtual {p0, v0}, Lcom/daaw/uz;->f0(I)V

    iget-object v1, p0, Lcom/daaw/uz;->v:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->quit()Z

    monitor-enter p0

    :try_start_0
    iput-boolean v0, p0, Lcom/daaw/uz;->L:Z

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final H(Lcom/daaw/a41;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v0}, Lcom/daaw/to0;->o()Lcom/daaw/ro0;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/ro0;->i:Lcom/daaw/ro0;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Lcom/daaw/ro0;->f:Z

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/daaw/a41;->j()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final I()V
    .locals 15

    iget-object v0, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v0}, Lcom/daaw/to0;->r()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/uz;->C:Lcom/daaw/mr;

    invoke-virtual {v0}, Lcom/daaw/mr;->h()Lcom/daaw/zw0;

    move-result-object v0

    iget v0, v0, Lcom/daaw/zw0;->a:F

    iget-object v1, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v1}, Lcom/daaw/to0;->n()Lcom/daaw/ro0;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v2}, Lcom/daaw/to0;->o()Lcom/daaw/ro0;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x1

    :goto_0
    if-eqz v1, :cond_d

    iget-boolean v5, v1, Lcom/daaw/ro0;->f:Z

    if-nez v5, :cond_1

    goto/16 :goto_5

    :cond_1
    invoke-virtual {v1, v0}, Lcom/daaw/ro0;->o(F)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_b

    const/4 v0, 0x4

    if-eqz v4, :cond_8

    iget-object v1, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v1}, Lcom/daaw/to0;->n()Lcom/daaw/ro0;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v2, v1}, Lcom/daaw/to0;->w(Lcom/daaw/ro0;)Z

    move-result v2

    iget-object v4, p0, Lcom/daaw/uz;->p:[Lcom/daaw/a41;

    array-length v4, v4

    new-array v4, v4, [Z

    iget-object v5, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-wide v7, v5, Lcom/daaw/yw0;->j:J

    invoke-virtual {v1, v7, v8, v2, v4}, Lcom/daaw/ro0;->b(JZ[Z)J

    move-result-wide v7

    iget-object v2, v1, Lcom/daaw/ro0;->j:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget-object v5, v1, Lcom/daaw/ro0;->k:Lcom/daaw/xm1;

    invoke-virtual {p0, v2, v5}, Lcom/daaw/uz;->l0(Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/daaw/xm1;)V

    iget-object v2, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget v5, v2, Lcom/daaw/yw0;->f:I

    if-eq v5, v0, :cond_2

    iget-wide v9, v2, Lcom/daaw/yw0;->j:J

    cmp-long v2, v7, v9

    if-eqz v2, :cond_2

    iget-object v9, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-object v10, v9, Lcom/daaw/yw0;->c:Lcom/daaw/bp0$a;

    iget-wide v13, v9, Lcom/daaw/yw0;->e:J

    move-wide v11, v7

    invoke-virtual/range {v9 .. v14}, Lcom/daaw/yw0;->g(Lcom/daaw/bp0$a;JJ)Lcom/daaw/yw0;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-object v2, p0, Lcom/daaw/uz;->D:Lcom/daaw/uz$d;

    invoke-virtual {v2, v0}, Lcom/daaw/uz$d;->g(I)V

    invoke-virtual {p0, v7, v8}, Lcom/daaw/uz;->K(J)V

    :cond_2
    iget-object v2, p0, Lcom/daaw/uz;->p:[Lcom/daaw/a41;

    array-length v2, v2

    new-array v2, v2, [Z

    const/4 v5, 0x0

    const/4 v7, 0x0

    :goto_1
    iget-object v8, p0, Lcom/daaw/uz;->p:[Lcom/daaw/a41;

    array-length v9, v8

    if-ge v5, v9, :cond_7

    aget-object v8, v8, v5

    invoke-interface {v8}, Lcom/daaw/a41;->getState()I

    move-result v9

    if-eqz v9, :cond_3

    const/4 v9, 0x1

    goto :goto_2

    :cond_3
    const/4 v9, 0x0

    :goto_2
    aput-boolean v9, v2, v5

    iget-object v9, v1, Lcom/daaw/ro0;->c:[Lcom/daaw/d81;

    aget-object v9, v9, v5

    if-eqz v9, :cond_4

    add-int/lit8 v7, v7, 0x1

    :cond_4
    aget-boolean v10, v2, v5

    if-eqz v10, :cond_6

    invoke-interface {v8}, Lcom/daaw/a41;->b()Lcom/daaw/d81;

    move-result-object v10

    if-eq v9, v10, :cond_5

    invoke-virtual {p0, v8}, Lcom/daaw/uz;->g(Lcom/daaw/a41;)V

    goto :goto_3

    :cond_5
    aget-boolean v9, v4, v5

    if-eqz v9, :cond_6

    iget-wide v9, p0, Lcom/daaw/uz;->S:J

    invoke-interface {v8, v9, v10}, Lcom/daaw/a41;->t(J)V

    :cond_6
    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_7
    iget-object v3, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-object v4, v1, Lcom/daaw/ro0;->j:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget-object v1, v1, Lcom/daaw/ro0;->k:Lcom/daaw/xm1;

    invoke-virtual {v3, v4, v1}, Lcom/daaw/yw0;->f(Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/daaw/xm1;)Lcom/daaw/yw0;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    invoke-virtual {p0, v2, v7}, Lcom/daaw/uz;->l([ZI)V

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v2, v1}, Lcom/daaw/to0;->w(Lcom/daaw/ro0;)Z

    iget-boolean v2, v1, Lcom/daaw/ro0;->f:Z

    if-eqz v2, :cond_9

    iget-object v2, v1, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-wide v2, v2, Lcom/daaw/so0;->b:J

    iget-wide v4, p0, Lcom/daaw/uz;->S:J

    invoke-virtual {v1, v4, v5}, Lcom/daaw/ro0;->p(J)J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3, v6}, Lcom/daaw/ro0;->a(JZ)J

    iget-object v2, v1, Lcom/daaw/ro0;->j:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget-object v1, v1, Lcom/daaw/ro0;->k:Lcom/daaw/xm1;

    invoke-virtual {p0, v2, v1}, Lcom/daaw/uz;->l0(Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/daaw/xm1;)V

    :cond_9
    :goto_4
    iget-object v1, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget v1, v1, Lcom/daaw/yw0;->f:I

    if-eq v1, v0, :cond_a

    invoke-virtual {p0}, Lcom/daaw/uz;->x()V

    invoke-virtual {p0}, Lcom/daaw/uz;->n0()V

    iget-object v0, p0, Lcom/daaw/uz;->u:Lcom/daaw/u80;

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lcom/daaw/u80;->b(I)Z

    :cond_a
    return-void

    :cond_b
    if-ne v1, v2, :cond_c

    const/4 v4, 0x0

    :cond_c
    iget-object v1, v1, Lcom/daaw/ro0;->i:Lcom/daaw/ro0;

    goto/16 :goto_0

    :cond_d
    :goto_5
    return-void
.end method

.method public final J(ZZZ)V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/daaw/uz;->u:Lcom/daaw/u80;

    const/4 v2, 0x2

    invoke-interface {v1, v2}, Lcom/daaw/u80;->e(I)V

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/daaw/uz;->N:Z

    iget-object v2, v0, Lcom/daaw/uz;->C:Lcom/daaw/mr;

    invoke-virtual {v2}, Lcom/daaw/mr;->i()V

    const-wide/16 v2, 0x0

    iput-wide v2, v0, Lcom/daaw/uz;->S:J

    iget-object v2, v0, Lcom/daaw/uz;->K:[Lcom/daaw/a41;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v2, v4

    :try_start_0
    invoke-virtual {v0, v5}, Lcom/daaw/uz;->g(Lcom/daaw/a41;)V
    :try_end_0
    .catch Lcom/daaw/qz; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-array v2, v1, [Lcom/daaw/a41;

    iput-object v2, v0, Lcom/daaw/uz;->K:[Lcom/daaw/a41;

    iget-object v2, v0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    xor-int/lit8 v3, p2, 0x1

    invoke-virtual {v2, v3}, Lcom/daaw/to0;->d(Z)V

    invoke-virtual {v0, v1}, Lcom/daaw/uz;->Y(Z)V

    const/4 v2, 0x0

    if-eqz p2, :cond_1

    iput-object v2, v0, Lcom/daaw/uz;->R:Lcom/daaw/uz$e;

    :cond_1
    if-eqz p3, :cond_3

    iget-object v3, v0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    sget-object v4, Lcom/daaw/nl1;->a:Lcom/daaw/nl1;

    invoke-virtual {v3, v4}, Lcom/daaw/to0;->A(Lcom/daaw/nl1;)V

    iget-object v3, v0, Lcom/daaw/uz;->E:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/uz$c;

    iget-object v4, v4, Lcom/daaw/uz$c;->p:Lcom/daaw/fx0;

    invoke-virtual {v4, v1}, Lcom/daaw/fx0;->k(Z)V

    goto :goto_1

    :cond_2
    iget-object v3, v0, Lcom/daaw/uz;->E:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    iput v1, v0, Lcom/daaw/uz;->T:I

    :cond_3
    new-instance v1, Lcom/daaw/yw0;

    if-eqz p3, :cond_4

    sget-object v3, Lcom/daaw/nl1;->a:Lcom/daaw/nl1;

    goto :goto_2

    :cond_4
    iget-object v3, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-object v3, v3, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    :goto_2
    move-object v5, v3

    if-eqz p3, :cond_5

    move-object v6, v2

    goto :goto_3

    :cond_5
    iget-object v3, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-object v3, v3, Lcom/daaw/yw0;->b:Ljava/lang/Object;

    move-object v6, v3

    :goto_3
    if-eqz p2, :cond_6

    new-instance v3, Lcom/daaw/bp0$a;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/uz;->o()I

    move-result v4

    invoke-direct {v3, v4}, Lcom/daaw/bp0$a;-><init>(I)V

    goto :goto_4

    :cond_6
    iget-object v3, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-object v3, v3, Lcom/daaw/yw0;->c:Lcom/daaw/bp0$a;

    :goto_4
    move-object v7, v3

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz p2, :cond_7

    move-wide v8, v3

    goto :goto_5

    :cond_7
    iget-object v8, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-wide v8, v8, Lcom/daaw/yw0;->j:J

    :goto_5
    if-eqz p2, :cond_8

    goto :goto_6

    :cond_8
    iget-object v3, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-wide v3, v3, Lcom/daaw/yw0;->e:J

    :goto_6
    move-wide v10, v3

    iget-object v3, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget v12, v3, Lcom/daaw/yw0;->f:I

    const/4 v13, 0x0

    if-eqz p3, :cond_9

    sget-object v4, Lcom/google/android/exoplayer2/source/TrackGroupArray;->s:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    goto :goto_7

    :cond_9
    iget-object v4, v3, Lcom/daaw/yw0;->h:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    :goto_7
    move-object v14, v4

    if-eqz p3, :cond_a

    iget-object v3, v0, Lcom/daaw/uz;->s:Lcom/daaw/xm1;

    goto :goto_8

    :cond_a
    iget-object v3, v3, Lcom/daaw/yw0;->i:Lcom/daaw/xm1;

    :goto_8
    move-object v15, v3

    move-object v4, v1

    invoke-direct/range {v4 .. v15}, Lcom/daaw/yw0;-><init>(Lcom/daaw/nl1;Ljava/lang/Object;Lcom/daaw/bp0$a;JJIZLcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/daaw/xm1;)V

    iput-object v1, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    if-eqz p1, :cond_b

    iget-object v1, v0, Lcom/daaw/uz;->J:Lcom/daaw/bp0;

    if-eqz v1, :cond_b

    invoke-interface {v1, v0}, Lcom/daaw/bp0;->h(Lcom/daaw/bp0$b;)V

    iput-object v2, v0, Lcom/daaw/uz;->J:Lcom/daaw/bp0;

    :cond_b
    return-void
.end method

.method public final K(J)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v0}, Lcom/daaw/to0;->r()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v0}, Lcom/daaw/to0;->n()Lcom/daaw/ro0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/daaw/ro0;->q(J)J

    move-result-wide p1

    :goto_0
    iput-wide p1, p0, Lcom/daaw/uz;->S:J

    iget-object v0, p0, Lcom/daaw/uz;->C:Lcom/daaw/mr;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/mr;->e(J)V

    iget-object p1, p0, Lcom/daaw/uz;->K:[Lcom/daaw/a41;

    array-length p2, p1

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p2, :cond_1

    aget-object v1, p1, v0

    iget-wide v2, p0, Lcom/daaw/uz;->S:J

    invoke-interface {v1, v2, v3}, Lcom/daaw/a41;->t(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final L(Lcom/daaw/uz$c;)Z
    .locals 7

    iget-object v0, p1, Lcom/daaw/uz$c;->s:Ljava/lang/Object;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    new-instance v0, Lcom/daaw/uz$e;

    iget-object v3, p1, Lcom/daaw/uz$c;->p:Lcom/daaw/fx0;

    invoke-virtual {v3}, Lcom/daaw/fx0;->g()Lcom/daaw/nl1;

    move-result-object v3

    iget-object v4, p1, Lcom/daaw/uz$c;->p:Lcom/daaw/fx0;

    invoke-virtual {v4}, Lcom/daaw/fx0;->i()I

    move-result v4

    iget-object v5, p1, Lcom/daaw/uz$c;->p:Lcom/daaw/fx0;

    invoke-virtual {v5}, Lcom/daaw/fx0;->e()J

    move-result-wide v5

    invoke-static {v5, v6}, Lcom/daaw/dd;->a(J)J

    move-result-wide v5

    invoke-direct {v0, v3, v4, v5, v6}, Lcom/daaw/uz$e;-><init>(Lcom/daaw/nl1;IJ)V

    invoke-virtual {p0, v0, v2}, Lcom/daaw/uz;->N(Lcom/daaw/uz$e;Z)Landroid/util/Pair;

    move-result-object v0

    if-nez v0, :cond_0

    return v2

    :cond_0
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-object v5, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-object v5, v5, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v6, p0, Lcom/daaw/uz;->z:Lcom/daaw/nl1$b;

    invoke-virtual {v5, v0, v6, v1}, Lcom/daaw/nl1;->g(ILcom/daaw/nl1$b;Z)Lcom/daaw/nl1$b;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/nl1$b;->b:Ljava/lang/Object;

    invoke-virtual {p1, v2, v3, v4, v0}, Lcom/daaw/uz$c;->b(IJLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-object v3, v3, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    invoke-virtual {v3, v0}, Lcom/daaw/nl1;->b(Ljava/lang/Object;)I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_2

    return v2

    :cond_2
    iput v0, p1, Lcom/daaw/uz$c;->q:I

    :goto_0
    return v1
.end method

.method public final M()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/uz;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, Lcom/daaw/uz;->E:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/uz$c;

    invoke-virtual {p0, v1}, Lcom/daaw/uz;->L(Lcom/daaw/uz$c;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/daaw/uz;->E:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/uz$c;

    iget-object v1, v1, Lcom/daaw/uz$c;->p:Lcom/daaw/fx0;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/daaw/fx0;->k(Z)V

    iget-object v1, p0, Lcom/daaw/uz;->E:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/uz;->E:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-void
.end method

.method public final N(Lcom/daaw/uz$e;Z)Landroid/util/Pair;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/uz$e;",
            "Z)",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-object v0, v0, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    iget-object v1, p1, Lcom/daaw/uz$e;->a:Lcom/daaw/nl1;

    invoke-virtual {v0}, Lcom/daaw/nl1;->o()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    return-object v3

    :cond_0
    invoke-virtual {v1}, Lcom/daaw/nl1;->o()Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v1, v0

    :cond_1
    :try_start_0
    iget-object v5, p0, Lcom/daaw/uz;->y:Lcom/daaw/nl1$c;

    iget-object v6, p0, Lcom/daaw/uz;->z:Lcom/daaw/nl1$b;

    iget v7, p1, Lcom/daaw/uz$e;->b:I

    iget-wide v8, p1, Lcom/daaw/uz$e;->c:J

    move-object v4, v1

    invoke-virtual/range {v4 .. v9}, Lcom/daaw/nl1;->i(Lcom/daaw/nl1$c;Lcom/daaw/nl1$b;IJ)Landroid/util/Pair;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v0, v1, :cond_2

    return-object p1

    :cond_2
    iget-object v2, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v4, p0, Lcom/daaw/uz;->z:Lcom/daaw/nl1$b;

    const/4 v5, 0x1

    invoke-virtual {v1, v2, v4, v5}, Lcom/daaw/nl1;->g(ILcom/daaw/nl1$b;Z)Lcom/daaw/nl1$b;

    move-result-object v2

    iget-object v2, v2, Lcom/daaw/nl1$b;->b:Ljava/lang/Object;

    invoke-virtual {v0, v2}, Lcom/daaw/nl1;->b(Ljava/lang/Object;)I

    move-result v2

    const/4 v4, -0x1

    if-eq v2, v4, :cond_3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-static {p2, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1

    :cond_3
    if-eqz p2, :cond_4

    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1, v1, v0}, Lcom/daaw/uz;->O(ILcom/daaw/nl1;Lcom/daaw/nl1;)I

    move-result p1

    if-eq p1, v4, :cond_4

    iget-object p2, p0, Lcom/daaw/uz;->z:Lcom/daaw/nl1$b;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/nl1;->f(ILcom/daaw/nl1$b;)Lcom/daaw/nl1$b;

    move-result-object p1

    iget p1, p1, Lcom/daaw/nl1$b;->c:I

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-virtual {p0, v0, p1, v1, v2}, Lcom/daaw/uz;->q(Lcom/daaw/nl1;IJ)Landroid/util/Pair;

    move-result-object p1

    return-object p1

    :cond_4
    return-object v3

    :catch_0
    new-instance p2, Lcom/daaw/we0;

    iget v1, p1, Lcom/daaw/uz$e;->b:I

    iget-wide v2, p1, Lcom/daaw/uz$e;->c:J

    invoke-direct {p2, v0, v1, v2, v3}, Lcom/daaw/we0;-><init>(Lcom/daaw/nl1;IJ)V

    throw p2
.end method

.method public final O(ILcom/daaw/nl1;Lcom/daaw/nl1;)I
    .locals 9

    invoke-virtual {p2}, Lcom/daaw/nl1;->h()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    move v4, p1

    const/4 p1, -0x1

    :goto_0
    if-ge v2, v0, :cond_1

    if-ne p1, v1, :cond_1

    iget-object v5, p0, Lcom/daaw/uz;->z:Lcom/daaw/nl1$b;

    iget-object v6, p0, Lcom/daaw/uz;->y:Lcom/daaw/nl1$c;

    iget v7, p0, Lcom/daaw/uz;->O:I

    iget-boolean v8, p0, Lcom/daaw/uz;->P:Z

    move-object v3, p2

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/nl1;->d(ILcom/daaw/nl1$b;Lcom/daaw/nl1$c;IZ)I

    move-result v4

    if-ne v4, v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lcom/daaw/uz;->z:Lcom/daaw/nl1$b;

    const/4 v3, 0x1

    invoke-virtual {p2, v4, p1, v3}, Lcom/daaw/nl1;->g(ILcom/daaw/nl1$b;Z)Lcom/daaw/nl1$b;

    move-result-object p1

    iget-object p1, p1, Lcom/daaw/nl1$b;->b:Ljava/lang/Object;

    invoke-virtual {p3, p1}, Lcom/daaw/nl1;->b(Ljava/lang/Object;)I

    move-result p1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return p1
.end method

.method public final P(JJ)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/uz;->u:Lcom/daaw/u80;

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lcom/daaw/u80;->e(I)V

    iget-object v0, p0, Lcom/daaw/uz;->u:Lcom/daaw/u80;

    add-long/2addr p1, p3

    invoke-interface {v0, v1, p1, p2}, Lcom/daaw/u80;->d(IJ)Z

    return-void
.end method

.method public Q(Lcom/daaw/nl1;IJ)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/uz;->u:Lcom/daaw/u80;

    new-instance v1, Lcom/daaw/uz$e;

    invoke-direct {v1, p1, p2, p3, p4}, Lcom/daaw/uz$e;-><init>(Lcom/daaw/nl1;IJ)V

    const/4 p1, 0x3

    invoke-interface {v0, p1, v1}, Lcom/daaw/u80;->f(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public final R(Z)V
    .locals 7

    iget-object v0, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v0}, Lcom/daaw/to0;->n()Lcom/daaw/ro0;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-object v2, v0, Lcom/daaw/so0;->a:Lcom/daaw/bp0$a;

    iget-object v0, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-wide v0, v0, Lcom/daaw/yw0;->j:J

    const/4 v3, 0x1

    invoke-virtual {p0, v2, v0, v1, v3}, Lcom/daaw/uz;->U(Lcom/daaw/bp0$a;JZ)J

    move-result-wide v3

    iget-object v0, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-wide v0, v0, Lcom/daaw/yw0;->j:J

    cmp-long v5, v3, v0

    if-eqz v5, :cond_0

    iget-object v1, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-wide v5, v1, Lcom/daaw/yw0;->e:J

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/yw0;->g(Lcom/daaw/bp0$a;JJ)Lcom/daaw/yw0;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/uz;->D:Lcom/daaw/uz$d;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lcom/daaw/uz$d;->g(I)V

    :cond_0
    return-void
.end method

.method public final S(Lcom/daaw/uz$e;)V
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v2, v1, Lcom/daaw/uz;->D:Lcom/daaw/uz$d;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/daaw/uz$d;->e(I)V

    invoke-virtual {v1, v0, v3}, Lcom/daaw/uz;->N(Lcom/daaw/uz$e;Z)Landroid/util/Pair;

    move-result-object v2

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v2, :cond_0

    new-instance v2, Lcom/daaw/bp0$a;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/uz;->o()I

    move-result v9

    invoke-direct {v2, v9}, Lcom/daaw/bp0$a;-><init>(I)V

    move-object v15, v2

    move-wide v12, v7

    move-wide/from16 v18, v12

    :goto_0
    const/4 v2, 0x1

    goto :goto_2

    :cond_0
    iget-object v9, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v10, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Long;

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    iget-object v12, v1, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v12, v9, v10, v11}, Lcom/daaw/to0;->x(IJ)Lcom/daaw/bp0$a;

    move-result-object v9

    invoke-virtual {v9}, Lcom/daaw/bp0$a;->b()Z

    move-result v12

    if-eqz v12, :cond_1

    move-wide v12, v4

    move-object v15, v9

    move-wide/from16 v18, v10

    goto :goto_0

    :cond_1
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    iget-wide v14, v0, Lcom/daaw/uz$e;->c:J

    cmp-long v2, v14, v7

    if-nez v2, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    move-object v15, v9

    move-wide/from16 v18, v10

    :goto_2
    const/4 v9, 0x2

    :try_start_0
    iget-object v10, v1, Lcom/daaw/uz;->J:Lcom/daaw/bp0;

    if-eqz v10, :cond_a

    iget v10, v1, Lcom/daaw/uz;->Q:I

    if-lez v10, :cond_3

    goto :goto_5

    :cond_3
    cmp-long v0, v12, v7

    if-nez v0, :cond_4

    const/4 v0, 0x4

    invoke-virtual {v1, v0}, Lcom/daaw/uz;->f0(I)V

    invoke-virtual {v1, v6, v3, v6}, Lcom/daaw/uz;->J(ZZZ)V

    goto :goto_6

    :cond_4
    iget-object v0, v1, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-object v0, v0, Lcom/daaw/yw0;->c:Lcom/daaw/bp0$a;

    invoke-virtual {v15, v0}, Lcom/daaw/bp0$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, v1, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v0}, Lcom/daaw/to0;->n()Lcom/daaw/ro0;

    move-result-object v0

    if-eqz v0, :cond_5

    cmp-long v7, v12, v4

    if-eqz v7, :cond_5

    iget-object v0, v0, Lcom/daaw/ro0;->a:Lcom/daaw/qo0;

    iget-object v4, v1, Lcom/daaw/uz;->H:Lcom/daaw/ea1;

    invoke-interface {v0, v12, v13, v4}, Lcom/daaw/qo0;->e(JLcom/daaw/ea1;)J

    move-result-wide v4

    goto :goto_3

    :cond_5
    move-wide v4, v12

    :goto_3
    invoke-static {v4, v5}, Lcom/daaw/dd;->b(J)J

    move-result-wide v7

    iget-object v0, v1, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-wide v10, v0, Lcom/daaw/yw0;->j:J

    invoke-static {v10, v11}, Lcom/daaw/dd;->b(J)J

    move-result-wide v10

    cmp-long v0, v7, v10

    if-nez v0, :cond_8

    iget-object v0, v1, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-wide v3, v0, Lcom/daaw/yw0;->j:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v14, v1, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    move-wide/from16 v16, v3

    invoke-virtual/range {v14 .. v19}, Lcom/daaw/yw0;->g(Lcom/daaw/bp0$a;JJ)Lcom/daaw/yw0;

    move-result-object v0

    iput-object v0, v1, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    if-eqz v2, :cond_6

    iget-object v0, v1, Lcom/daaw/uz;->D:Lcom/daaw/uz$d;

    invoke-virtual {v0, v9}, Lcom/daaw/uz$d;->g(I)V

    :cond_6
    return-void

    :cond_7
    move-wide v4, v12

    :cond_8
    :try_start_1
    invoke-virtual {v1, v15, v4, v5}, Lcom/daaw/uz;->T(Lcom/daaw/bp0$a;J)J

    move-result-wide v4

    cmp-long v0, v12, v4

    if-eqz v0, :cond_9

    goto :goto_4

    :cond_9
    const/4 v3, 0x0

    :goto_4
    or-int/2addr v2, v3

    move-wide/from16 v16, v4

    goto :goto_7

    :cond_a
    :goto_5
    iput-object v0, v1, Lcom/daaw/uz;->R:Lcom/daaw/uz$e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_6
    move-wide/from16 v16, v12

    :goto_7
    iget-object v14, v1, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    invoke-virtual/range {v14 .. v19}, Lcom/daaw/yw0;->g(Lcom/daaw/bp0$a;JJ)Lcom/daaw/yw0;

    move-result-object v0

    iput-object v0, v1, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    if-eqz v2, :cond_b

    iget-object v0, v1, Lcom/daaw/uz;->D:Lcom/daaw/uz$d;

    invoke-virtual {v0, v9}, Lcom/daaw/uz$d;->g(I)V

    :cond_b
    return-void

    :catchall_0
    move-exception v0

    iget-object v14, v1, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    move-wide/from16 v16, v12

    invoke-virtual/range {v14 .. v19}, Lcom/daaw/yw0;->g(Lcom/daaw/bp0$a;JJ)Lcom/daaw/yw0;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    if-eqz v2, :cond_c

    iget-object v2, v1, Lcom/daaw/uz;->D:Lcom/daaw/uz$d;

    invoke-virtual {v2, v9}, Lcom/daaw/uz$d;->g(I)V

    :cond_c
    goto :goto_9

    :goto_8
    throw v0

    :goto_9
    goto :goto_8
.end method

.method public final T(Lcom/daaw/bp0$a;J)J
    .locals 2

    iget-object v0, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v0}, Lcom/daaw/to0;->n()Lcom/daaw/ro0;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v1}, Lcom/daaw/to0;->o()Lcom/daaw/ro0;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/daaw/uz;->U(Lcom/daaw/bp0$a;JZ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final U(Lcom/daaw/bp0$a;JZ)J
    .locals 5

    invoke-virtual {p0}, Lcom/daaw/uz;->k0()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/uz;->N:Z

    const/4 v1, 0x2

    invoke-virtual {p0, v1}, Lcom/daaw/uz;->f0(I)V

    iget-object v2, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v2}, Lcom/daaw/to0;->n()Lcom/daaw/ro0;

    move-result-object v2

    move-object v3, v2

    :goto_0
    if-eqz v3, :cond_1

    invoke-virtual {p0, p1, p2, p3, v3}, Lcom/daaw/uz;->g0(Lcom/daaw/bp0$a;JLcom/daaw/ro0;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object p1, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {p1, v3}, Lcom/daaw/to0;->w(Lcom/daaw/ro0;)Z

    goto :goto_1

    :cond_0
    iget-object v3, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v3}, Lcom/daaw/to0;->a()Lcom/daaw/ro0;

    move-result-object v3

    goto :goto_0

    :cond_1
    :goto_1
    if-ne v2, v3, :cond_2

    if-eqz p4, :cond_4

    :cond_2
    iget-object p1, p0, Lcom/daaw/uz;->K:[Lcom/daaw/a41;

    array-length p4, p1

    const/4 v2, 0x0

    :goto_2
    if-ge v2, p4, :cond_3

    aget-object v4, p1, v2

    invoke-virtual {p0, v4}, Lcom/daaw/uz;->g(Lcom/daaw/a41;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    new-array p1, v0, [Lcom/daaw/a41;

    iput-object p1, p0, Lcom/daaw/uz;->K:[Lcom/daaw/a41;

    const/4 v2, 0x0

    :cond_4
    if-eqz v3, :cond_6

    invoke-virtual {p0, v2}, Lcom/daaw/uz;->o0(Lcom/daaw/ro0;)V

    iget-boolean p1, v3, Lcom/daaw/ro0;->g:Z

    if-eqz p1, :cond_5

    iget-object p1, v3, Lcom/daaw/ro0;->a:Lcom/daaw/qo0;

    invoke-interface {p1, p2, p3}, Lcom/daaw/qo0;->m(J)J

    move-result-wide p1

    iget-object p3, v3, Lcom/daaw/ro0;->a:Lcom/daaw/qo0;

    iget-wide v2, p0, Lcom/daaw/uz;->A:J

    sub-long v2, p1, v2

    iget-boolean p4, p0, Lcom/daaw/uz;->B:Z

    invoke-interface {p3, v2, v3, p4}, Lcom/daaw/qo0;->t(JZ)V

    move-wide p2, p1

    :cond_5
    invoke-virtual {p0, p2, p3}, Lcom/daaw/uz;->K(J)V

    invoke-virtual {p0}, Lcom/daaw/uz;->x()V

    goto :goto_3

    :cond_6
    iget-object p1, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    const/4 p4, 0x1

    invoke-virtual {p1, p4}, Lcom/daaw/to0;->d(Z)V

    invoke-virtual {p0, p2, p3}, Lcom/daaw/uz;->K(J)V

    :goto_3
    iget-object p1, p0, Lcom/daaw/uz;->u:Lcom/daaw/u80;

    invoke-interface {p1, v1}, Lcom/daaw/u80;->b(I)Z

    return-wide p2
.end method

.method public final V(Lcom/daaw/fx0;)V
    .locals 5

    invoke-virtual {p1}, Lcom/daaw/fx0;->e()J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/uz;->W(Lcom/daaw/fx0;)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/uz;->J:Lcom/daaw/bp0;

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/daaw/uz;->Q:I

    if-lez v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/daaw/uz$c;

    invoke-direct {v0, p1}, Lcom/daaw/uz$c;-><init>(Lcom/daaw/fx0;)V

    invoke-virtual {p0, v0}, Lcom/daaw/uz;->L(Lcom/daaw/uz$c;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p1, p0, Lcom/daaw/uz;->E:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/daaw/uz;->E:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/fx0;->k(Z)V

    goto :goto_1

    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/daaw/uz;->E:Ljava/util/ArrayList;

    new-instance v1, Lcom/daaw/uz$c;

    invoke-direct {v1, p1}, Lcom/daaw/uz$c;-><init>(Lcom/daaw/fx0;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    return-void
.end method

.method public final W(Lcom/daaw/fx0;)V
    .locals 2

    invoke-virtual {p1}, Lcom/daaw/fx0;->c()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/uz;->u:Lcom/daaw/u80;

    invoke-interface {v1}, Lcom/daaw/u80;->g()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0, p1}, Lcom/daaw/uz;->f(Lcom/daaw/fx0;)V

    iget-object p1, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget p1, p1, Lcom/daaw/yw0;->f:I

    const/4 v0, 0x3

    const/4 v1, 0x2

    if-eq p1, v0, :cond_0

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/daaw/uz;->u:Lcom/daaw/u80;

    invoke-interface {p1, v1}, Lcom/daaw/u80;->b(I)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/uz;->u:Lcom/daaw/u80;

    const/16 v1, 0xf

    invoke-interface {v0, v1, p1}, Lcom/daaw/u80;->f(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_2
    :goto_0
    return-void
.end method

.method public final X(Lcom/daaw/fx0;)V
    .locals 2

    invoke-virtual {p1}, Lcom/daaw/fx0;->c()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/daaw/uz$a;

    invoke-direct {v1, p0, p1}, Lcom/daaw/uz$a;-><init>(Lcom/daaw/uz;Lcom/daaw/fx0;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final Y(Z)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-boolean v1, v0, Lcom/daaw/yw0;->g:Z

    if-eq v1, p1, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/yw0;->b(Z)Lcom/daaw/yw0;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    :cond_0
    return-void
.end method

.method public Z(Z)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/uz;->u:Lcom/daaw/u80;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-interface {v0, v2, p1, v1}, Lcom/daaw/u80;->a(III)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public final a0(Z)V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/uz;->N:Z

    iput-boolean p1, p0, Lcom/daaw/uz;->M:Z

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/uz;->k0()V

    invoke-virtual {p0}, Lcom/daaw/uz;->n0()V

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget p1, p1, Lcom/daaw/yw0;->f:I

    const/4 v0, 0x3

    const/4 v1, 0x2

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/uz;->i0()V

    :goto_0
    iget-object p1, p0, Lcom/daaw/uz;->u:Lcom/daaw/u80;

    invoke-interface {p1, v1}, Lcom/daaw/u80;->b(I)Z

    goto :goto_1

    :cond_1
    if-ne p1, v1, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public declared-synchronized b(Lcom/daaw/fx0;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/uz;->L:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/fx0;->k(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/daaw/uz;->u:Lcom/daaw/u80;

    const/16 v1, 0xe

    invoke-interface {v0, v1, p1}, Lcom/daaw/u80;->f(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final b0(Lcom/daaw/zw0;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/uz;->C:Lcom/daaw/mr;

    invoke-virtual {v0, p1}, Lcom/daaw/mr;->f(Lcom/daaw/zw0;)Lcom/daaw/zw0;

    return-void
.end method

.method public c(Lcom/daaw/zw0;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/uz;->w:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    iget p1, p1, Lcom/daaw/zw0;->a:F

    invoke-virtual {p0, p1}, Lcom/daaw/uz;->p0(F)V

    return-void
.end method

.method public final c0(I)V
    .locals 1

    iput p1, p0, Lcom/daaw/uz;->O:I

    iget-object v0, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v0, p1}, Lcom/daaw/to0;->E(I)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/daaw/uz;->R(Z)V

    :cond_0
    return-void
.end method

.method public d(Lcom/daaw/bp0;Lcom/daaw/nl1;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/uz;->u:Lcom/daaw/u80;

    new-instance v1, Lcom/daaw/uz$b;

    invoke-direct {v1, p1, p2, p3}, Lcom/daaw/uz$b;-><init>(Lcom/daaw/bp0;Lcom/daaw/nl1;Ljava/lang/Object;)V

    const/16 p1, 0x8

    invoke-interface {v0, p1, v1}, Lcom/daaw/u80;->f(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public final d0(Lcom/daaw/ea1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/uz;->H:Lcom/daaw/ea1;

    return-void
.end method

.method public final e0(Z)V
    .locals 1

    iput-boolean p1, p0, Lcom/daaw/uz;->P:Z

    iget-object v0, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v0, p1}, Lcom/daaw/to0;->F(Z)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/daaw/uz;->R(Z)V

    :cond_0
    return-void
.end method

.method public final f(Lcom/daaw/fx0;)V
    .locals 4

    invoke-virtual {p1}, Lcom/daaw/fx0;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p1}, Lcom/daaw/fx0;->f()Lcom/daaw/fx0$b;

    move-result-object v1

    invoke-virtual {p1}, Lcom/daaw/fx0;->h()I

    move-result v2

    invoke-virtual {p1}, Lcom/daaw/fx0;->d()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lcom/daaw/fx0$b;->r(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1, v0}, Lcom/daaw/fx0;->k(Z)V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {p1, v0}, Lcom/daaw/fx0;->k(Z)V

    throw v1
.end method

.method public final f0(I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget v1, v0, Lcom/daaw/yw0;->f:I

    if-eq v1, p1, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/yw0;->d(I)Lcom/daaw/yw0;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    :cond_0
    return-void
.end method

.method public final g(Lcom/daaw/a41;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/uz;->C:Lcom/daaw/mr;

    invoke-virtual {v0, p1}, Lcom/daaw/mr;->c(Lcom/daaw/a41;)V

    invoke-virtual {p0, p1}, Lcom/daaw/uz;->m(Lcom/daaw/a41;)V

    invoke-interface {p1}, Lcom/daaw/a41;->g()V

    return-void
.end method

.method public final g0(Lcom/daaw/bp0$a;JLcom/daaw/ro0;)Z
    .locals 2

    iget-object v0, p4, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-object v0, v0, Lcom/daaw/so0;->a:Lcom/daaw/bp0$a;

    invoke-virtual {p1, v0}, Lcom/daaw/bp0$a;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-boolean p1, p4, Lcom/daaw/ro0;->f:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-object p1, p1, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    iget-object v0, p4, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-object v0, v0, Lcom/daaw/so0;->a:Lcom/daaw/bp0$a;

    iget v0, v0, Lcom/daaw/bp0$a;->a:I

    iget-object v1, p0, Lcom/daaw/uz;->z:Lcom/daaw/nl1$b;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/nl1;->f(ILcom/daaw/nl1$b;)Lcom/daaw/nl1$b;

    iget-object p1, p0, Lcom/daaw/uz;->z:Lcom/daaw/nl1$b;

    invoke-virtual {p1, p2, p3}, Lcom/daaw/nl1$b;->d(J)I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_0

    iget-object p2, p0, Lcom/daaw/uz;->z:Lcom/daaw/nl1$b;

    invoke-virtual {p2, p1}, Lcom/daaw/nl1$b;->f(I)J

    move-result-wide p1

    iget-object p3, p4, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-wide p3, p3, Lcom/daaw/so0;->c:J

    cmp-long v0, p1, p3

    if-nez v0, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final h()V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/daaw/uz;->F:Lcom/daaw/zf;

    invoke-interface {v1}, Lcom/daaw/zf;->c()J

    move-result-wide v1

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/uz;->m0()V

    iget-object v3, v0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v3}, Lcom/daaw/to0;->r()Z

    move-result v3

    const-wide/16 v4, 0xa

    if-nez v3, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/uz;->z()V

    invoke-virtual {v0, v1, v2, v4, v5}, Lcom/daaw/uz;->P(JJ)V

    return-void

    :cond_0
    iget-object v3, v0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v3}, Lcom/daaw/to0;->n()Lcom/daaw/ro0;

    move-result-object v3

    const-string v6, "doSomeWork"

    invoke-static {v6}, Lcom/daaw/mm1;->a(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/uz;->n0()V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    const-wide/16 v8, 0x3e8

    mul-long v6, v6, v8

    iget-object v10, v3, Lcom/daaw/ro0;->a:Lcom/daaw/qo0;

    iget-object v11, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-wide v11, v11, Lcom/daaw/yw0;->j:J

    iget-wide v13, v0, Lcom/daaw/uz;->A:J

    sub-long/2addr v11, v13

    iget-boolean v13, v0, Lcom/daaw/uz;->B:Z

    invoke-interface {v10, v11, v12, v13}, Lcom/daaw/qo0;->t(JZ)V

    iget-object v10, v0, Lcom/daaw/uz;->K:[Lcom/daaw/a41;

    array-length v11, v10

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x1

    :goto_0
    if-ge v14, v11, :cond_6

    aget-object v12, v10, v14

    iget-wide v8, v0, Lcom/daaw/uz;->S:J

    invoke-interface {v12, v8, v9, v6, v7}, Lcom/daaw/a41;->q(JJ)V

    if-eqz v16, :cond_1

    invoke-interface {v12}, Lcom/daaw/a41;->c()Z

    move-result v8

    if-eqz v8, :cond_1

    const/16 v16, 0x1

    goto :goto_1

    :cond_1
    const/16 v16, 0x0

    :goto_1
    invoke-interface {v12}, Lcom/daaw/a41;->d()Z

    move-result v8

    if-nez v8, :cond_3

    invoke-interface {v12}, Lcom/daaw/a41;->c()Z

    move-result v8

    if-nez v8, :cond_3

    invoke-virtual {v0, v12}, Lcom/daaw/uz;->H(Lcom/daaw/a41;)Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_2

    :cond_2
    const/4 v8, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v8, 0x1

    :goto_3
    if-nez v8, :cond_4

    invoke-interface {v12}, Lcom/daaw/a41;->s()V

    :cond_4
    if-eqz v15, :cond_5

    if-eqz v8, :cond_5

    const/4 v15, 0x1

    goto :goto_4

    :cond_5
    const/4 v15, 0x0

    :goto_4
    add-int/lit8 v14, v14, 0x1

    const-wide/16 v8, 0x3e8

    goto :goto_0

    :cond_6
    if-nez v15, :cond_7

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/uz;->z()V

    :cond_7
    iget-object v6, v3, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-wide v6, v6, Lcom/daaw/so0;->e:J

    const/4 v8, 0x4

    const/4 v9, 0x3

    const/4 v10, 0x2

    if-eqz v16, :cond_9

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v13, v6, v11

    if-eqz v13, :cond_8

    iget-object v11, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-wide v11, v11, Lcom/daaw/yw0;->j:J

    cmp-long v13, v6, v11

    if-gtz v13, :cond_9

    :cond_8
    iget-object v3, v3, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-boolean v3, v3, Lcom/daaw/so0;->g:Z

    if-eqz v3, :cond_9

    invoke-virtual {v0, v8}, Lcom/daaw/uz;->f0(I)V

    :goto_5
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/uz;->k0()V

    goto :goto_6

    :cond_9
    iget-object v3, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget v3, v3, Lcom/daaw/yw0;->f:I

    if-ne v3, v10, :cond_a

    invoke-virtual {v0, v15}, Lcom/daaw/uz;->h0(Z)Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual {v0, v9}, Lcom/daaw/uz;->f0(I)V

    iget-boolean v3, v0, Lcom/daaw/uz;->M:Z

    if-eqz v3, :cond_d

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/uz;->i0()V

    goto :goto_6

    :cond_a
    iget-object v3, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget v3, v3, Lcom/daaw/yw0;->f:I

    if-ne v3, v9, :cond_d

    iget-object v3, v0, Lcom/daaw/uz;->K:[Lcom/daaw/a41;

    array-length v3, v3

    if-nez v3, :cond_b

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/uz;->w()Z

    move-result v3

    if-eqz v3, :cond_c

    goto :goto_6

    :cond_b
    if-nez v15, :cond_d

    :cond_c
    iget-boolean v3, v0, Lcom/daaw/uz;->M:Z

    iput-boolean v3, v0, Lcom/daaw/uz;->N:Z

    invoke-virtual {v0, v10}, Lcom/daaw/uz;->f0(I)V

    goto :goto_5

    :cond_d
    :goto_6
    iget-object v3, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget v3, v3, Lcom/daaw/yw0;->f:I

    if-ne v3, v10, :cond_e

    iget-object v3, v0, Lcom/daaw/uz;->K:[Lcom/daaw/a41;

    array-length v6, v3

    const/4 v12, 0x0

    :goto_7
    if-ge v12, v6, :cond_e

    aget-object v7, v3, v12

    invoke-interface {v7}, Lcom/daaw/a41;->s()V

    add-int/lit8 v12, v12, 0x1

    goto :goto_7

    :cond_e
    iget-boolean v3, v0, Lcom/daaw/uz;->M:Z

    if-eqz v3, :cond_f

    iget-object v3, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget v3, v3, Lcom/daaw/yw0;->f:I

    if-eq v3, v9, :cond_10

    :cond_f
    iget-object v3, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget v3, v3, Lcom/daaw/yw0;->f:I

    if-ne v3, v10, :cond_11

    :cond_10
    invoke-virtual {v0, v1, v2, v4, v5}, Lcom/daaw/uz;->P(JJ)V

    goto :goto_8

    :cond_11
    iget-object v4, v0, Lcom/daaw/uz;->K:[Lcom/daaw/a41;

    array-length v4, v4

    if-eqz v4, :cond_12

    if-eq v3, v8, :cond_12

    const-wide/16 v3, 0x3e8

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/daaw/uz;->P(JJ)V

    goto :goto_8

    :cond_12
    iget-object v1, v0, Lcom/daaw/uz;->u:Lcom/daaw/u80;

    invoke-interface {v1, v10}, Lcom/daaw/u80;->e(I)V

    :goto_8
    invoke-static {}, Lcom/daaw/mm1;->c()V

    return-void
.end method

.method public final h0(Z)Z
    .locals 7

    iget-object v0, p0, Lcom/daaw/uz;->K:[Lcom/daaw/a41;

    array-length v0, v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/uz;->w()Z

    move-result p1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    iget-object p1, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-boolean p1, p1, Lcom/daaw/yw0;->g:Z

    const/4 v1, 0x1

    if-nez p1, :cond_2

    return v1

    :cond_2
    iget-object p1, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {p1}, Lcom/daaw/to0;->i()Lcom/daaw/ro0;

    move-result-object p1

    iget-object v2, p1, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-boolean v2, v2, Lcom/daaw/so0;->g:Z

    xor-int/2addr v2, v1

    invoke-virtual {p1, v2}, Lcom/daaw/ro0;->h(Z)J

    move-result-wide v2

    const-wide/high16 v4, -0x8000000000000000L

    cmp-long v6, v2, v4

    if-eqz v6, :cond_3

    iget-object v4, p0, Lcom/daaw/uz;->t:Lcom/daaw/hk0;

    iget-wide v5, p0, Lcom/daaw/uz;->S:J

    invoke-virtual {p1, v5, v6}, Lcom/daaw/ro0;->p(J)J

    move-result-wide v5

    sub-long/2addr v2, v5

    iget-object p1, p0, Lcom/daaw/uz;->C:Lcom/daaw/mr;

    invoke-virtual {p1}, Lcom/daaw/mr;->h()Lcom/daaw/zw0;

    move-result-object p1

    iget p1, p1, Lcom/daaw/zw0;->a:F

    iget-boolean v5, p0, Lcom/daaw/uz;->N:Z

    invoke-interface {v4, v2, v3, p1, v5}, Lcom/daaw/hk0;->e(JFZ)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    const/4 v0, 0x1

    :cond_4
    return v0
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 5

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    :try_start_0
    iget v3, p1, Landroid/os/Message;->what:I

    packed-switch v3, :pswitch_data_0

    return v2

    :pswitch_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/fx0;

    invoke-virtual {p0, p1}, Lcom/daaw/uz;->X(Lcom/daaw/fx0;)V

    goto/16 :goto_5

    :pswitch_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/fx0;

    invoke-virtual {p0, p1}, Lcom/daaw/uz;->V(Lcom/daaw/fx0;)V

    goto/16 :goto_5

    :pswitch_2
    iget p1, p1, Landroid/os/Message;->arg1:I

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lcom/daaw/uz;->e0(Z)V

    goto/16 :goto_5

    :pswitch_3
    iget p1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {p0, p1}, Lcom/daaw/uz;->c0(I)V

    goto/16 :goto_5

    :pswitch_4
    invoke-virtual {p0}, Lcom/daaw/uz;->I()V

    goto/16 :goto_5

    :pswitch_5
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/qo0;

    invoke-virtual {p0, p1}, Lcom/daaw/uz;->s(Lcom/daaw/qo0;)V

    goto :goto_5

    :pswitch_6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/qo0;

    invoke-virtual {p0, p1}, Lcom/daaw/uz;->t(Lcom/daaw/qo0;)V

    goto :goto_5

    :pswitch_7
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/uz$b;

    invoke-virtual {p0, p1}, Lcom/daaw/uz;->v(Lcom/daaw/uz$b;)V

    goto :goto_5

    :pswitch_8
    invoke-virtual {p0}, Lcom/daaw/uz;->G()V

    return v1

    :pswitch_9
    iget p1, p1, Landroid/os/Message;->arg1:I

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    invoke-virtual {p0, p1, v1}, Lcom/daaw/uz;->j0(ZZ)V

    goto :goto_5

    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/ea1;

    invoke-virtual {p0, p1}, Lcom/daaw/uz;->d0(Lcom/daaw/ea1;)V

    goto :goto_5

    :pswitch_b
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/zw0;

    invoke-virtual {p0, p1}, Lcom/daaw/uz;->b0(Lcom/daaw/zw0;)V

    goto :goto_5

    :pswitch_c
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/uz$e;

    invoke-virtual {p0, p1}, Lcom/daaw/uz;->S(Lcom/daaw/uz$e;)V

    goto :goto_5

    :pswitch_d
    invoke-virtual {p0}, Lcom/daaw/uz;->h()V

    goto :goto_5

    :pswitch_e
    iget p1, p1, Landroid/os/Message;->arg1:I

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    invoke-virtual {p0, p1}, Lcom/daaw/uz;->a0(Z)V

    goto :goto_5

    :pswitch_f
    iget-object v3, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v3, Lcom/daaw/bp0;

    iget v4, p1, Landroid/os/Message;->arg1:I

    if-eqz v4, :cond_3

    const/4 v4, 0x1

    goto :goto_3

    :cond_3
    const/4 v4, 0x0

    :goto_3
    iget p1, p1, Landroid/os/Message;->arg2:I

    if-eqz p1, :cond_4

    const/4 p1, 0x1

    goto :goto_4

    :cond_4
    const/4 p1, 0x0

    :goto_4
    invoke-virtual {p0, v3, v4, p1}, Lcom/daaw/uz;->E(Lcom/daaw/bp0;ZZ)V

    :goto_5
    invoke-virtual {p0}, Lcom/daaw/uz;->y()V
    :try_end_0
    .catch Lcom/daaw/qz; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_7

    :catch_0
    move-exception p1

    invoke-virtual {p0, v2, v2}, Lcom/daaw/uz;->j0(ZZ)V

    iget-object v2, p0, Lcom/daaw/uz;->w:Landroid/os/Handler;

    invoke-static {p1}, Lcom/daaw/qz;->c(Ljava/lang/RuntimeException;)Lcom/daaw/qz;

    move-result-object p1

    goto :goto_6

    :catch_1
    move-exception p1

    invoke-virtual {p0, v2, v2}, Lcom/daaw/uz;->j0(ZZ)V

    iget-object v2, p0, Lcom/daaw/uz;->w:Landroid/os/Handler;

    invoke-static {p1}, Lcom/daaw/qz;->b(Ljava/io/IOException;)Lcom/daaw/qz;

    move-result-object p1

    goto :goto_6

    :catch_2
    move-exception p1

    invoke-virtual {p0, v2, v2}, Lcom/daaw/uz;->j0(ZZ)V

    iget-object v2, p0, Lcom/daaw/uz;->w:Landroid/os/Handler;

    :goto_6
    invoke-virtual {v2, v0, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    invoke-virtual {p0}, Lcom/daaw/uz;->y()V

    :goto_7
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(IZI)V
    .locals 11

    iget-object v0, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v0}, Lcom/daaw/to0;->n()Lcom/daaw/ro0;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/uz;->p:[Lcom/daaw/a41;

    aget-object v1, v1, p1

    iget-object v2, p0, Lcom/daaw/uz;->K:[Lcom/daaw/a41;

    aput-object v1, v2, p3

    invoke-interface {v1}, Lcom/daaw/a41;->getState()I

    move-result p3

    if-nez p3, :cond_2

    iget-object p3, v0, Lcom/daaw/ro0;->k:Lcom/daaw/xm1;

    iget-object v2, p3, Lcom/daaw/xm1;->b:[Lcom/daaw/c41;

    aget-object v3, v2, p1

    iget-object p3, p3, Lcom/daaw/xm1;->c:Lcom/daaw/um1;

    invoke-virtual {p3, p1}, Lcom/daaw/um1;->a(I)Lcom/google/android/exoplayer2/trackselection/c;

    move-result-object p3

    invoke-static {p3}, Lcom/daaw/uz;->p(Lcom/google/android/exoplayer2/trackselection/c;)[Lcom/google/android/exoplayer2/Format;

    move-result-object v4

    iget-boolean p3, p0, Lcom/daaw/uz;->M:Z

    const/4 v2, 0x1

    const/4 v5, 0x0

    if-eqz p3, :cond_0

    iget-object p3, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget p3, p3, Lcom/daaw/yw0;->f:I

    const/4 v6, 0x3

    if-ne p3, v6, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    if-nez p2, :cond_1

    if-eqz p3, :cond_1

    const/4 v8, 0x1

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    :goto_1
    iget-object p2, v0, Lcom/daaw/ro0;->c:[Lcom/daaw/d81;

    aget-object v5, p2, p1

    iget-wide v6, p0, Lcom/daaw/uz;->S:J

    invoke-virtual {v0}, Lcom/daaw/ro0;->j()J

    move-result-wide v9

    move-object v2, v1

    invoke-interface/range {v2 .. v10}, Lcom/daaw/a41;->k(Lcom/daaw/c41;[Lcom/google/android/exoplayer2/Format;Lcom/daaw/d81;JZJ)V

    iget-object p1, p0, Lcom/daaw/uz;->C:Lcom/daaw/mr;

    invoke-virtual {p1, v1}, Lcom/daaw/mr;->d(Lcom/daaw/a41;)V

    if-eqz p3, :cond_2

    invoke-interface {v1}, Lcom/daaw/a41;->start()V

    :cond_2
    return-void
.end method

.method public final i0()V
    .locals 4

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/uz;->N:Z

    iget-object v1, p0, Lcom/daaw/uz;->C:Lcom/daaw/mr;

    invoke-virtual {v1}, Lcom/daaw/mr;->g()V

    iget-object v1, p0, Lcom/daaw/uz;->K:[Lcom/daaw/a41;

    array-length v2, v1

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    invoke-interface {v3}, Lcom/daaw/a41;->start()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public j(Lcom/daaw/qo0;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/uz;->u:Lcom/daaw/u80;

    const/16 v1, 0x9

    invoke-interface {v0, v1, p1}, Lcom/daaw/u80;->f(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public final j0(ZZ)V
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p1, p1}, Lcom/daaw/uz;->J(ZZZ)V

    iget-object p1, p0, Lcom/daaw/uz;->D:Lcom/daaw/uz$d;

    iget v1, p0, Lcom/daaw/uz;->Q:I

    add-int/2addr v1, p2

    invoke-virtual {p1, v1}, Lcom/daaw/uz$d;->e(I)V

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/uz;->Q:I

    iget-object p1, p0, Lcom/daaw/uz;->t:Lcom/daaw/hk0;

    invoke-interface {p1}, Lcom/daaw/hk0;->i()V

    invoke-virtual {p0, v0}, Lcom/daaw/uz;->f0(I)V

    return-void
.end method

.method public final k0()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/uz;->C:Lcom/daaw/mr;

    invoke-virtual {v0}, Lcom/daaw/mr;->i()V

    iget-object v0, p0, Lcom/daaw/uz;->K:[Lcom/daaw/a41;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {p0, v3}, Lcom/daaw/uz;->m(Lcom/daaw/a41;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final l([ZI)V
    .locals 4

    new-array p2, p2, [Lcom/daaw/a41;

    iput-object p2, p0, Lcom/daaw/uz;->K:[Lcom/daaw/a41;

    iget-object p2, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {p2}, Lcom/daaw/to0;->n()Lcom/daaw/ro0;

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/uz;->p:[Lcom/daaw/a41;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    iget-object v2, p2, Lcom/daaw/ro0;->k:Lcom/daaw/xm1;

    invoke-virtual {v2, v0}, Lcom/daaw/xm1;->c(I)Z

    move-result v2

    if-eqz v2, :cond_0

    aget-boolean v2, p1, v0

    add-int/lit8 v3, v1, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lcom/daaw/uz;->i(IZI)V

    move v1, v3

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final l0(Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/daaw/xm1;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/uz;->t:Lcom/daaw/hk0;

    iget-object v1, p0, Lcom/daaw/uz;->p:[Lcom/daaw/a41;

    iget-object p2, p2, Lcom/daaw/xm1;->c:Lcom/daaw/um1;

    invoke-interface {v0, v1, p1, p2}, Lcom/daaw/hk0;->c([Lcom/daaw/a41;Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/daaw/um1;)V

    return-void
.end method

.method public final m(Lcom/daaw/a41;)V
    .locals 2

    invoke-interface {p1}, Lcom/daaw/a41;->getState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Lcom/daaw/a41;->stop()V

    :cond_0
    return-void
.end method

.method public final m0()V
    .locals 13

    iget-object v0, p0, Lcom/daaw/uz;->J:Lcom/daaw/bp0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v1, p0, Lcom/daaw/uz;->Q:I

    if-lez v1, :cond_1

    invoke-interface {v0}, Lcom/daaw/bp0;->e()V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/uz;->B()V

    iget-object v0, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v0}, Lcom/daaw/to0;->i()Lcom/daaw/ro0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/daaw/ro0;->l()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-boolean v0, v0, Lcom/daaw/yw0;->g:Z

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lcom/daaw/uz;->x()V

    goto :goto_1

    :cond_3
    :goto_0
    invoke-virtual {p0, v1}, Lcom/daaw/uz;->Y(Z)V

    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v0}, Lcom/daaw/to0;->r()Z

    move-result v0

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget-object v0, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v0}, Lcom/daaw/to0;->n()Lcom/daaw/ro0;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v2}, Lcom/daaw/to0;->o()Lcom/daaw/ro0;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    :goto_2
    iget-boolean v5, p0, Lcom/daaw/uz;->M:Z

    if-eqz v5, :cond_8

    if-eq v0, v2, :cond_8

    iget-wide v5, p0, Lcom/daaw/uz;->S:J

    iget-object v7, v0, Lcom/daaw/ro0;->i:Lcom/daaw/ro0;

    iget-wide v7, v7, Lcom/daaw/ro0;->e:J

    cmp-long v9, v5, v7

    if-ltz v9, :cond_8

    if-eqz v4, :cond_6

    invoke-virtual {p0}, Lcom/daaw/uz;->y()V

    :cond_6
    iget-object v4, v0, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-boolean v4, v4, Lcom/daaw/so0;->f:Z

    if-eqz v4, :cond_7

    const/4 v4, 0x0

    goto :goto_3

    :cond_7
    const/4 v4, 0x3

    :goto_3
    iget-object v5, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v5}, Lcom/daaw/to0;->a()Lcom/daaw/ro0;

    move-result-object v5

    invoke-virtual {p0, v0}, Lcom/daaw/uz;->o0(Lcom/daaw/ro0;)V

    iget-object v6, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-object v0, v5, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-object v7, v0, Lcom/daaw/so0;->a:Lcom/daaw/bp0$a;

    iget-wide v8, v0, Lcom/daaw/so0;->b:J

    iget-wide v10, v0, Lcom/daaw/so0;->d:J

    invoke-virtual/range {v6 .. v11}, Lcom/daaw/yw0;->g(Lcom/daaw/bp0$a;JJ)Lcom/daaw/yw0;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-object v0, p0, Lcom/daaw/uz;->D:Lcom/daaw/uz$d;

    invoke-virtual {v0, v4}, Lcom/daaw/uz$d;->g(I)V

    invoke-virtual {p0}, Lcom/daaw/uz;->n0()V

    move-object v0, v5

    const/4 v4, 0x1

    goto :goto_2

    :cond_8
    iget-object v0, v2, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-boolean v0, v0, Lcom/daaw/so0;->g:Z

    if-eqz v0, :cond_b

    :goto_4
    iget-object v0, p0, Lcom/daaw/uz;->p:[Lcom/daaw/a41;

    array-length v3, v0

    if-ge v1, v3, :cond_a

    aget-object v0, v0, v1

    iget-object v3, v2, Lcom/daaw/ro0;->c:[Lcom/daaw/d81;

    aget-object v3, v3, v1

    if-eqz v3, :cond_9

    invoke-interface {v0}, Lcom/daaw/a41;->b()Lcom/daaw/d81;

    move-result-object v4

    if-ne v4, v3, :cond_9

    invoke-interface {v0}, Lcom/daaw/a41;->j()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v0}, Lcom/daaw/a41;->l()V

    :cond_9
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_a
    return-void

    :cond_b
    iget-object v0, v2, Lcom/daaw/ro0;->i:Lcom/daaw/ro0;

    if-eqz v0, :cond_16

    iget-boolean v0, v0, Lcom/daaw/ro0;->f:Z

    if-nez v0, :cond_c

    goto/16 :goto_b

    :cond_c
    const/4 v0, 0x0

    :goto_5
    iget-object v4, p0, Lcom/daaw/uz;->p:[Lcom/daaw/a41;

    array-length v5, v4

    if-ge v0, v5, :cond_f

    aget-object v4, v4, v0

    iget-object v5, v2, Lcom/daaw/ro0;->c:[Lcom/daaw/d81;

    aget-object v5, v5, v0

    invoke-interface {v4}, Lcom/daaw/a41;->b()Lcom/daaw/d81;

    move-result-object v6

    if-ne v6, v5, :cond_e

    if-eqz v5, :cond_d

    invoke-interface {v4}, Lcom/daaw/a41;->j()Z

    move-result v4

    if-nez v4, :cond_d

    goto :goto_6

    :cond_d
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_e
    :goto_6
    return-void

    :cond_f
    iget-object v0, v2, Lcom/daaw/ro0;->k:Lcom/daaw/xm1;

    iget-object v2, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v2}, Lcom/daaw/to0;->b()Lcom/daaw/ro0;

    move-result-object v2

    iget-object v4, v2, Lcom/daaw/ro0;->k:Lcom/daaw/xm1;

    iget-object v5, v2, Lcom/daaw/ro0;->a:Lcom/daaw/qo0;

    invoke-interface {v5}, Lcom/daaw/qo0;->q()J

    move-result-wide v5

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v9, v5, v7

    if-eqz v9, :cond_10

    const/4 v5, 0x1

    goto :goto_7

    :cond_10
    const/4 v5, 0x0

    :goto_7
    const/4 v6, 0x0

    :goto_8
    iget-object v7, p0, Lcom/daaw/uz;->p:[Lcom/daaw/a41;

    array-length v8, v7

    if-ge v6, v8, :cond_16

    aget-object v7, v7, v6

    invoke-virtual {v0, v6}, Lcom/daaw/xm1;->c(I)Z

    move-result v8

    if-nez v8, :cond_11

    goto :goto_a

    :cond_11
    if-eqz v5, :cond_13

    :cond_12
    invoke-interface {v7}, Lcom/daaw/a41;->l()V

    goto :goto_a

    :cond_13
    invoke-interface {v7}, Lcom/daaw/a41;->u()Z

    move-result v8

    if-nez v8, :cond_15

    iget-object v8, v4, Lcom/daaw/xm1;->c:Lcom/daaw/um1;

    invoke-virtual {v8, v6}, Lcom/daaw/um1;->a(I)Lcom/google/android/exoplayer2/trackselection/c;

    move-result-object v8

    invoke-virtual {v4, v6}, Lcom/daaw/xm1;->c(I)Z

    move-result v9

    iget-object v10, p0, Lcom/daaw/uz;->q:[Lcom/daaw/b41;

    aget-object v10, v10, v6

    invoke-interface {v10}, Lcom/daaw/b41;->i()I

    move-result v10

    const/4 v11, 0x5

    if-ne v10, v11, :cond_14

    const/4 v10, 0x1

    goto :goto_9

    :cond_14
    const/4 v10, 0x0

    :goto_9
    iget-object v11, v0, Lcom/daaw/xm1;->b:[Lcom/daaw/c41;

    aget-object v11, v11, v6

    iget-object v12, v4, Lcom/daaw/xm1;->b:[Lcom/daaw/c41;

    aget-object v12, v12, v6

    if-eqz v9, :cond_12

    invoke-virtual {v12, v11}, Lcom/daaw/c41;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_12

    if-nez v10, :cond_12

    invoke-static {v8}, Lcom/daaw/uz;->p(Lcom/google/android/exoplayer2/trackselection/c;)[Lcom/google/android/exoplayer2/Format;

    move-result-object v8

    iget-object v9, v2, Lcom/daaw/ro0;->c:[Lcom/daaw/d81;

    aget-object v9, v9, v6

    invoke-virtual {v2}, Lcom/daaw/ro0;->j()J

    move-result-wide v10

    invoke-interface {v7, v8, v9, v10, v11}, Lcom/daaw/a41;->m([Lcom/google/android/exoplayer2/Format;Lcom/daaw/d81;J)V

    :cond_15
    :goto_a
    add-int/lit8 v6, v6, 0x1

    goto :goto_8

    :cond_16
    :goto_b
    return-void
.end method

.method public bridge synthetic n(Lcom/daaw/gb1;)V
    .locals 0

    check-cast p1, Lcom/daaw/qo0;

    invoke-virtual {p0, p1}, Lcom/daaw/uz;->C(Lcom/daaw/qo0;)V

    return-void
.end method

.method public final n0()V
    .locals 8

    iget-object v0, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v0}, Lcom/daaw/to0;->r()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v0}, Lcom/daaw/to0;->n()Lcom/daaw/ro0;

    move-result-object v0

    iget-object v1, v0, Lcom/daaw/ro0;->a:Lcom/daaw/qo0;

    invoke-interface {v1}, Lcom/daaw/qo0;->q()J

    move-result-wide v4

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v4, v1

    if-eqz v3, :cond_1

    invoke-virtual {p0, v4, v5}, Lcom/daaw/uz;->K(J)V

    iget-object v1, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-wide v1, v1, Lcom/daaw/yw0;->j:J

    cmp-long v3, v4, v1

    if-eqz v3, :cond_2

    iget-object v2, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-object v3, v2, Lcom/daaw/yw0;->c:Lcom/daaw/bp0$a;

    iget-wide v6, v2, Lcom/daaw/yw0;->e:J

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/yw0;->g(Lcom/daaw/bp0$a;JJ)Lcom/daaw/yw0;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-object v1, p0, Lcom/daaw/uz;->D:Lcom/daaw/uz$d;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/daaw/uz$d;->g(I)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/daaw/uz;->C:Lcom/daaw/mr;

    invoke-virtual {v1}, Lcom/daaw/mr;->j()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/daaw/uz;->S:J

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ro0;->p(J)J

    move-result-wide v1

    iget-object v3, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-wide v3, v3, Lcom/daaw/yw0;->j:J

    invoke-virtual {p0, v3, v4, v1, v2}, Lcom/daaw/uz;->A(JJ)V

    iget-object v3, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iput-wide v1, v3, Lcom/daaw/yw0;->j:J

    :cond_2
    :goto_0
    iget-object v1, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-object v2, p0, Lcom/daaw/uz;->K:[Lcom/daaw/a41;

    array-length v2, v2

    if-nez v2, :cond_3

    iget-object v0, v0, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-wide v2, v0, Lcom/daaw/so0;->e:J

    goto :goto_1

    :cond_3
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/daaw/ro0;->h(Z)J

    move-result-wide v2

    :goto_1
    iput-wide v2, v1, Lcom/daaw/yw0;->k:J

    return-void
.end method

.method public final o()I
    .locals 3

    iget-object v0, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-object v0, v0, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    invoke-virtual {v0}, Lcom/daaw/nl1;->o()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lcom/daaw/uz;->P:Z

    invoke-virtual {v0, v1}, Lcom/daaw/nl1;->a(Z)I

    move-result v1

    iget-object v2, p0, Lcom/daaw/uz;->y:Lcom/daaw/nl1$c;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/nl1;->k(ILcom/daaw/nl1$c;)Lcom/daaw/nl1$c;

    move-result-object v0

    iget v0, v0, Lcom/daaw/nl1$c;->f:I

    :goto_0
    return v0
.end method

.method public final o0(Lcom/daaw/ro0;)V
    .locals 8

    iget-object v0, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v0}, Lcom/daaw/to0;->n()Lcom/daaw/ro0;

    move-result-object v0

    if-eqz v0, :cond_6

    if-ne p1, v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v1, p0, Lcom/daaw/uz;->p:[Lcom/daaw/a41;

    array-length v1, v1

    new-array v1, v1, [Z

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    iget-object v5, p0, Lcom/daaw/uz;->p:[Lcom/daaw/a41;

    array-length v6, v5

    if-ge v3, v6, :cond_5

    aget-object v5, v5, v3

    invoke-interface {v5}, Lcom/daaw/a41;->getState()I

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x1

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_1
    aput-boolean v6, v1, v3

    iget-object v6, v0, Lcom/daaw/ro0;->k:Lcom/daaw/xm1;

    invoke-virtual {v6, v3}, Lcom/daaw/xm1;->c(I)Z

    move-result v6

    if-eqz v6, :cond_2

    add-int/lit8 v4, v4, 0x1

    :cond_2
    aget-boolean v6, v1, v3

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/daaw/ro0;->k:Lcom/daaw/xm1;

    invoke-virtual {v6, v3}, Lcom/daaw/xm1;->c(I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Lcom/daaw/a41;->u()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Lcom/daaw/a41;->b()Lcom/daaw/d81;

    move-result-object v6

    iget-object v7, p1, Lcom/daaw/ro0;->c:[Lcom/daaw/d81;

    aget-object v7, v7, v3

    if-ne v6, v7, :cond_4

    :cond_3
    invoke-virtual {p0, v5}, Lcom/daaw/uz;->g(Lcom/daaw/a41;)V

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    iget-object p1, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-object v2, v0, Lcom/daaw/ro0;->j:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget-object v0, v0, Lcom/daaw/ro0;->k:Lcom/daaw/xm1;

    invoke-virtual {p1, v2, v0}, Lcom/daaw/yw0;->f(Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/daaw/xm1;)Lcom/daaw/yw0;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    invoke-virtual {p0, v1, v4}, Lcom/daaw/uz;->l([ZI)V

    :cond_6
    :goto_2
    return-void
.end method

.method public final p0(F)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v0}, Lcom/daaw/to0;->h()Lcom/daaw/ro0;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v1, v0, Lcom/daaw/ro0;->k:Lcom/daaw/xm1;

    if-eqz v1, :cond_1

    iget-object v1, v1, Lcom/daaw/xm1;->c:Lcom/daaw/um1;

    invoke-virtual {v1}, Lcom/daaw/um1;->b()[Lcom/google/android/exoplayer2/trackselection/c;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    if-eqz v4, :cond_0

    invoke-interface {v4, p1}, Lcom/google/android/exoplayer2/trackselection/c;->m(F)V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    iget-object v0, v0, Lcom/daaw/ro0;->i:Lcom/daaw/ro0;

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final q(Lcom/daaw/nl1;IJ)Landroid/util/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/nl1;",
            "IJ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v1, p0, Lcom/daaw/uz;->y:Lcom/daaw/nl1$c;

    iget-object v2, p0, Lcom/daaw/uz;->z:Lcom/daaw/nl1$b;

    move-object v0, p1

    move v3, p2

    move-wide v4, p3

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/nl1;->i(Lcom/daaw/nl1$c;Lcom/daaw/nl1$b;IJ)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method public r()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Lcom/daaw/uz;->v:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    return-object v0
.end method

.method public final s(Lcom/daaw/qo0;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v0, p1}, Lcom/daaw/to0;->u(Lcom/daaw/qo0;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    iget-wide v0, p0, Lcom/daaw/uz;->S:J

    invoke-virtual {p1, v0, v1}, Lcom/daaw/to0;->v(J)V

    invoke-virtual {p0}, Lcom/daaw/uz;->x()V

    return-void
.end method

.method public final t(Lcom/daaw/qo0;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v0, p1}, Lcom/daaw/to0;->u(Lcom/daaw/qo0;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {p1}, Lcom/daaw/to0;->i()Lcom/daaw/ro0;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/uz;->C:Lcom/daaw/mr;

    invoke-virtual {v0}, Lcom/daaw/mr;->h()Lcom/daaw/zw0;

    move-result-object v0

    iget v0, v0, Lcom/daaw/zw0;->a:F

    invoke-virtual {p1, v0}, Lcom/daaw/ro0;->k(F)V

    iget-object v0, p1, Lcom/daaw/ro0;->j:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget-object p1, p1, Lcom/daaw/ro0;->k:Lcom/daaw/xm1;

    invoke-virtual {p0, v0, p1}, Lcom/daaw/uz;->l0(Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/daaw/xm1;)V

    iget-object p1, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {p1}, Lcom/daaw/to0;->r()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {p1}, Lcom/daaw/to0;->a()Lcom/daaw/ro0;

    move-result-object p1

    iget-object p1, p1, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-wide v0, p1, Lcom/daaw/so0;->b:J

    invoke-virtual {p0, v0, v1}, Lcom/daaw/uz;->K(J)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/daaw/uz;->o0(Lcom/daaw/ro0;)V

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/uz;->x()V

    return-void
.end method

.method public final u()V
    .locals 2

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/daaw/uz;->f0(I)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1, v0}, Lcom/daaw/uz;->J(ZZZ)V

    return-void
.end method

.method public final v(Lcom/daaw/uz$b;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v1, Lcom/daaw/uz$b;->a:Lcom/daaw/bp0;

    iget-object v3, v0, Lcom/daaw/uz;->J:Lcom/daaw/bp0;

    if-eq v2, v3, :cond_0

    return-void

    :cond_0
    iget-object v2, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-object v2, v2, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    iget-object v3, v1, Lcom/daaw/uz$b;->b:Lcom/daaw/nl1;

    iget-object v1, v1, Lcom/daaw/uz$b;->c:Ljava/lang/Object;

    iget-object v4, v0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v4, v3}, Lcom/daaw/to0;->A(Lcom/daaw/nl1;)V

    iget-object v4, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    invoke-virtual {v4, v3, v1}, Lcom/daaw/yw0;->e(Lcom/daaw/nl1;Ljava/lang/Object;)Lcom/daaw/yw0;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/uz;->M()V

    iget v1, v0, Lcom/daaw/uz;->Q:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v8, 0x0

    if-lez v1, :cond_6

    iget-object v2, v0, Lcom/daaw/uz;->D:Lcom/daaw/uz$d;

    invoke-virtual {v2, v1}, Lcom/daaw/uz$d;->e(I)V

    iput v4, v0, Lcom/daaw/uz;->Q:I

    iget-object v1, v0, Lcom/daaw/uz;->R:Lcom/daaw/uz$e;

    if-eqz v1, :cond_2

    invoke-virtual {v0, v1, v5}, Lcom/daaw/uz;->N(Lcom/daaw/uz$e;Z)Landroid/util/Pair;

    move-result-object v1

    const/4 v2, 0x0

    iput-object v2, v0, Lcom/daaw/uz;->R:Lcom/daaw/uz$e;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    iget-object v1, v0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v1, v2, v14, v15}, Lcom/daaw/to0;->x(IJ)Lcom/daaw/bp0$a;

    move-result-object v11

    iget-object v10, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    invoke-virtual {v11}, Lcom/daaw/bp0$a;->b()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_2
    iget-object v1, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-wide v1, v1, Lcom/daaw/yw0;->d:J

    cmp-long v4, v1, v6

    if-nez v4, :cond_5

    invoke-virtual {v3}, Lcom/daaw/nl1;->o()Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/uz;->u()V

    goto :goto_3

    :cond_3
    iget-boolean v1, v0, Lcom/daaw/uz;->P:Z

    invoke-virtual {v3, v1}, Lcom/daaw/nl1;->a(Z)I

    move-result v1

    invoke-virtual {v0, v3, v1, v6, v7}, Lcom/daaw/uz;->q(Lcom/daaw/nl1;IJ)Landroid/util/Pair;

    move-result-object v1

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    iget-object v1, v0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v1, v2, v14, v15}, Lcom/daaw/to0;->x(IJ)Lcom/daaw/bp0$a;

    move-result-object v11

    iget-object v10, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    invoke-virtual {v11}, Lcom/daaw/bp0$a;->b()Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_1
    move-wide v12, v8

    goto :goto_2

    :cond_4
    move-wide v12, v14

    :goto_2
    invoke-virtual/range {v10 .. v15}, Lcom/daaw/yw0;->g(Lcom/daaw/bp0$a;JJ)Lcom/daaw/yw0;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    :cond_5
    :goto_3
    return-void

    :cond_6
    iget-object v1, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-object v10, v1, Lcom/daaw/yw0;->c:Lcom/daaw/bp0$a;

    iget v10, v10, Lcom/daaw/bp0$a;->a:I

    iget-wide v13, v1, Lcom/daaw/yw0;->e:J

    invoke-virtual {v2}, Lcom/daaw/nl1;->o()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual {v3}, Lcom/daaw/nl1;->o()Z

    move-result v1

    if-nez v1, :cond_8

    iget-object v1, v0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v1, v10, v13, v14}, Lcom/daaw/to0;->x(IJ)Lcom/daaw/bp0$a;

    move-result-object v12

    iget-object v11, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    invoke-virtual {v12}, Lcom/daaw/bp0$a;->b()Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_4

    :cond_7
    move-wide v8, v13

    :goto_4
    move-wide v1, v13

    move-wide v13, v8

    move-wide v15, v1

    invoke-virtual/range {v11 .. v16}, Lcom/daaw/yw0;->g(Lcom/daaw/bp0$a;JJ)Lcom/daaw/yw0;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    :cond_8
    return-void

    :cond_9
    iget-object v1, v0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v1}, Lcom/daaw/to0;->h()Lcom/daaw/ro0;

    move-result-object v1

    if-nez v1, :cond_a

    iget-object v11, v0, Lcom/daaw/uz;->z:Lcom/daaw/nl1$b;

    invoke-virtual {v2, v10, v11, v5}, Lcom/daaw/nl1;->g(ILcom/daaw/nl1$b;Z)Lcom/daaw/nl1$b;

    move-result-object v11

    iget-object v11, v11, Lcom/daaw/nl1$b;->b:Ljava/lang/Object;

    goto :goto_5

    :cond_a
    iget-object v11, v1, Lcom/daaw/ro0;->b:Ljava/lang/Object;

    :goto_5
    invoke-virtual {v3, v11}, Lcom/daaw/nl1;->b(Ljava/lang/Object;)I

    move-result v11

    const/4 v12, -0x1

    if-ne v11, v12, :cond_f

    invoke-virtual {v0, v10, v2, v3}, Lcom/daaw/uz;->O(ILcom/daaw/nl1;Lcom/daaw/nl1;)I

    move-result v2

    if-ne v2, v12, :cond_b

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/uz;->u()V

    return-void

    :cond_b
    iget-object v4, v0, Lcom/daaw/uz;->z:Lcom/daaw/nl1$b;

    invoke-virtual {v3, v2, v4}, Lcom/daaw/nl1;->f(ILcom/daaw/nl1$b;)Lcom/daaw/nl1$b;

    move-result-object v2

    iget v2, v2, Lcom/daaw/nl1$b;->c:I

    invoke-virtual {v0, v3, v2, v6, v7}, Lcom/daaw/uz;->q(Lcom/daaw/nl1;IJ)Landroid/util/Pair;

    move-result-object v2

    iget-object v4, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    iget-object v2, v0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v2, v4, v6, v7}, Lcom/daaw/to0;->x(IJ)Lcom/daaw/bp0$a;

    move-result-object v14

    iget-object v2, v0, Lcom/daaw/uz;->z:Lcom/daaw/nl1$b;

    invoke-virtual {v3, v4, v2, v5}, Lcom/daaw/nl1;->g(ILcom/daaw/nl1$b;Z)Lcom/daaw/nl1$b;

    if-eqz v1, :cond_d

    iget-object v2, v0, Lcom/daaw/uz;->z:Lcom/daaw/nl1$b;

    iget-object v2, v2, Lcom/daaw/nl1$b;->b:Ljava/lang/Object;

    :cond_c
    iget-object v3, v1, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    invoke-virtual {v3, v12}, Lcom/daaw/so0;->a(I)Lcom/daaw/so0;

    move-result-object v3

    :goto_6
    iput-object v3, v1, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-object v1, v1, Lcom/daaw/ro0;->i:Lcom/daaw/ro0;

    if-eqz v1, :cond_d

    iget-object v3, v1, Lcom/daaw/ro0;->b:Ljava/lang/Object;

    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    iget-object v3, v0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    iget-object v5, v1, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    invoke-virtual {v3, v5, v4}, Lcom/daaw/to0;->p(Lcom/daaw/so0;I)Lcom/daaw/so0;

    move-result-object v3

    goto :goto_6

    :cond_d
    invoke-virtual {v14}, Lcom/daaw/bp0$a;->b()Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    move-wide v8, v6

    :goto_7
    invoke-virtual {v0, v14, v8, v9}, Lcom/daaw/uz;->T(Lcom/daaw/bp0$a;J)J

    move-result-wide v15

    iget-object v13, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    move-wide/from16 v17, v6

    invoke-virtual/range {v13 .. v18}, Lcom/daaw/yw0;->g(Lcom/daaw/bp0$a;JJ)Lcom/daaw/yw0;

    move-result-object v1

    :goto_8
    iput-object v1, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    return-void

    :cond_f
    if-eq v11, v10, :cond_10

    iget-object v1, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    invoke-virtual {v1, v11}, Lcom/daaw/yw0;->c(I)Lcom/daaw/yw0;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    :cond_10
    iget-object v1, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-object v1, v1, Lcom/daaw/yw0;->c:Lcom/daaw/bp0$a;

    invoke-virtual {v1}, Lcom/daaw/bp0$a;->b()Z

    move-result v2

    if-eqz v2, :cond_12

    iget-object v2, v0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v2, v11, v13, v14}, Lcom/daaw/to0;->x(IJ)Lcom/daaw/bp0$a;

    move-result-object v12

    invoke-virtual {v12, v1}, Lcom/daaw/bp0$a;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    invoke-virtual {v12}, Lcom/daaw/bp0$a;->b()Z

    move-result v1

    if-eqz v1, :cond_11

    goto :goto_9

    :cond_11
    move-wide v8, v13

    :goto_9
    invoke-virtual {v0, v12, v8, v9}, Lcom/daaw/uz;->T(Lcom/daaw/bp0$a;J)J

    move-result-wide v1

    iget-object v11, v0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    move-wide v3, v13

    move-wide v13, v1

    move-wide v15, v3

    invoke-virtual/range {v11 .. v16}, Lcom/daaw/yw0;->g(Lcom/daaw/bp0$a;JJ)Lcom/daaw/yw0;

    move-result-object v1

    goto :goto_8

    :cond_12
    iget-object v2, v0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    iget-wide v5, v0, Lcom/daaw/uz;->S:J

    invoke-virtual {v2, v1, v5, v6}, Lcom/daaw/to0;->D(Lcom/daaw/bp0$a;J)Z

    move-result v1

    if-nez v1, :cond_13

    invoke-virtual {v0, v4}, Lcom/daaw/uz;->R(Z)V

    :cond_13
    return-void
.end method

.method public final w()Z
    .locals 6

    iget-object v0, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v0}, Lcom/daaw/to0;->n()Lcom/daaw/ro0;

    move-result-object v0

    iget-object v1, v0, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-wide v1, v1, Lcom/daaw/so0;->e:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    iget-object v3, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    iget-wide v3, v3, Lcom/daaw/yw0;->j:J

    cmp-long v5, v3, v1

    if-ltz v5, :cond_1

    iget-object v0, v0, Lcom/daaw/ro0;->i:Lcom/daaw/ro0;

    if-eqz v0, :cond_0

    iget-boolean v1, v0, Lcom/daaw/ro0;->f:Z

    if-nez v1, :cond_1

    iget-object v0, v0, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-object v0, v0, Lcom/daaw/so0;->a:Lcom/daaw/bp0$a;

    invoke-virtual {v0}, Lcom/daaw/bp0$a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final x()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v0}, Lcom/daaw/to0;->i()Lcom/daaw/ro0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/ro0;->i()J

    move-result-wide v1

    const-wide/high16 v3, -0x8000000000000000L

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/uz;->Y(Z)V

    return-void

    :cond_0
    iget-wide v3, p0, Lcom/daaw/uz;->S:J

    invoke-virtual {v0, v3, v4}, Lcom/daaw/ro0;->p(J)J

    move-result-wide v3

    sub-long/2addr v1, v3

    iget-object v3, p0, Lcom/daaw/uz;->t:Lcom/daaw/hk0;

    iget-object v4, p0, Lcom/daaw/uz;->C:Lcom/daaw/mr;

    invoke-virtual {v4}, Lcom/daaw/mr;->h()Lcom/daaw/zw0;

    move-result-object v4

    iget v4, v4, Lcom/daaw/zw0;->a:F

    invoke-interface {v3, v1, v2, v4}, Lcom/daaw/hk0;->f(JF)Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/uz;->Y(Z)V

    if-eqz v1, :cond_1

    iget-wide v1, p0, Lcom/daaw/uz;->S:J

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ro0;->d(J)V

    :cond_1
    return-void
.end method

.method public final y()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/uz;->D:Lcom/daaw/uz$d;

    iget-object v1, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    invoke-virtual {v0, v1}, Lcom/daaw/uz$d;->d(Lcom/daaw/yw0;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/uz;->w:Landroid/os/Handler;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/daaw/uz;->D:Lcom/daaw/uz$d;

    invoke-static {v2}, Lcom/daaw/uz$d;->a(Lcom/daaw/uz$d;)I

    move-result v2

    iget-object v3, p0, Lcom/daaw/uz;->D:Lcom/daaw/uz$d;

    invoke-static {v3}, Lcom/daaw/uz$d;->b(Lcom/daaw/uz$d;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/daaw/uz;->D:Lcom/daaw/uz$d;

    invoke-static {v3}, Lcom/daaw/uz$d;->c(Lcom/daaw/uz$d;)I

    move-result v3

    goto :goto_0

    :cond_0
    const/4 v3, -0x1

    :goto_0
    iget-object v4, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    iget-object v0, p0, Lcom/daaw/uz;->D:Lcom/daaw/uz$d;

    iget-object v1, p0, Lcom/daaw/uz;->I:Lcom/daaw/yw0;

    invoke-virtual {v0, v1}, Lcom/daaw/uz$d;->f(Lcom/daaw/yw0;)V

    :cond_1
    return-void
.end method

.method public final z()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v0}, Lcom/daaw/to0;->i()Lcom/daaw/ro0;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/uz;->G:Lcom/daaw/to0;

    invoke-virtual {v1}, Lcom/daaw/to0;->o()Lcom/daaw/ro0;

    move-result-object v1

    if-eqz v0, :cond_3

    iget-boolean v2, v0, Lcom/daaw/ro0;->f:Z

    if-nez v2, :cond_3

    if-eqz v1, :cond_0

    iget-object v1, v1, Lcom/daaw/ro0;->i:Lcom/daaw/ro0;

    if-ne v1, v0, :cond_3

    :cond_0
    iget-object v1, p0, Lcom/daaw/uz;->K:[Lcom/daaw/a41;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    invoke-interface {v4}, Lcom/daaw/a41;->j()Z

    move-result v4

    if-nez v4, :cond_1

    return-void

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, v0, Lcom/daaw/ro0;->a:Lcom/daaw/qo0;

    invoke-interface {v0}, Lcom/daaw/qo0;->l()V

    :cond_3
    return-void
.end method
