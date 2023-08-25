.class public final Lcom/daaw/tz;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/rz;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/tz$b;
    }
.end annotation


# instance fields
.field public final a:[Lcom/daaw/a41;

.field public final b:Lcom/daaw/wm1;

.field public final c:Lcom/daaw/xm1;

.field public final d:Landroid/os/Handler;

.field public final e:Lcom/daaw/uz;

.field public final f:Landroid/os/Handler;

.field public final g:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lcom/daaw/bx0$a;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lcom/daaw/nl1$c;

.field public final i:Lcom/daaw/nl1$b;

.field public final j:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lcom/daaw/tz$b;",
            ">;"
        }
    .end annotation
.end field

.field public k:Z

.field public l:I

.field public m:Z

.field public n:I

.field public o:Z

.field public p:Z

.field public q:Lcom/daaw/zw0;

.field public r:Lcom/daaw/qz;

.field public s:Lcom/daaw/yw0;

.field public t:I

.field public u:I

.field public v:J


# direct methods
.method public constructor <init>([Lcom/daaw/a41;Lcom/daaw/wm1;Lcom/daaw/hk0;Lcom/daaw/zf;)V
    .locals 13
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HandlerLeak"
        }
    .end annotation

    move-object v11, p0

    move-object v1, p1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Init "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " ["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "ExoPlayerLib/2.8.2"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "] ["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/daaw/sq1;->e:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v0, v1

    const/4 v2, 0x0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    invoke-static {p1}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/a41;

    iput-object v0, v11, Lcom/daaw/tz;->a:[Lcom/daaw/a41;

    invoke-static {p2}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/wm1;

    iput-object v0, v11, Lcom/daaw/tz;->b:Lcom/daaw/wm1;

    iput-boolean v2, v11, Lcom/daaw/tz;->k:Z

    iput v2, v11, Lcom/daaw/tz;->l:I

    iput-boolean v2, v11, Lcom/daaw/tz;->m:Z

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, v11, Lcom/daaw/tz;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v8, Lcom/daaw/xm1;

    array-length v0, v1

    new-array v0, v0, [Lcom/daaw/c41;

    array-length v2, v1

    new-array v2, v2, [Lcom/google/android/exoplayer2/trackselection/c;

    const/4 v3, 0x0

    invoke-direct {v8, v0, v2, v3}, Lcom/daaw/xm1;-><init>([Lcom/daaw/c41;[Lcom/google/android/exoplayer2/trackselection/c;Ljava/lang/Object;)V

    iput-object v8, v11, Lcom/daaw/tz;->c:Lcom/daaw/xm1;

    new-instance v0, Lcom/daaw/nl1$c;

    invoke-direct {v0}, Lcom/daaw/nl1$c;-><init>()V

    iput-object v0, v11, Lcom/daaw/tz;->h:Lcom/daaw/nl1$c;

    new-instance v0, Lcom/daaw/nl1$b;

    invoke-direct {v0}, Lcom/daaw/nl1$b;-><init>()V

    iput-object v0, v11, Lcom/daaw/tz;->i:Lcom/daaw/nl1$b;

    sget-object v0, Lcom/daaw/zw0;->e:Lcom/daaw/zw0;

    iput-object v0, v11, Lcom/daaw/tz;->q:Lcom/daaw/zw0;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    :goto_1
    new-instance v9, Lcom/daaw/tz$a;

    invoke-direct {v9, p0, v0}, Lcom/daaw/tz$a;-><init>(Lcom/daaw/tz;Landroid/os/Looper;)V

    iput-object v9, v11, Lcom/daaw/tz;->d:Landroid/os/Handler;

    new-instance v0, Lcom/daaw/yw0;

    sget-object v3, Lcom/daaw/nl1;->a:Lcom/daaw/nl1;

    const-wide/16 v4, 0x0

    sget-object v6, Lcom/google/android/exoplayer2/source/TrackGroupArray;->s:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    move-object v2, v0

    move-object v7, v8

    invoke-direct/range {v2 .. v7}, Lcom/daaw/yw0;-><init>(Lcom/daaw/nl1;JLcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/daaw/xm1;)V

    iput-object v0, v11, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, v11, Lcom/daaw/tz;->j:Ljava/util/ArrayDeque;

    new-instance v12, Lcom/daaw/uz;

    iget-boolean v5, v11, Lcom/daaw/tz;->k:Z

    iget v6, v11, Lcom/daaw/tz;->l:I

    iget-boolean v7, v11, Lcom/daaw/tz;->m:Z

    move-object v0, v12

    move-object v1, p1

    move-object v2, p2

    move-object v3, v8

    move-object/from16 v4, p3

    move-object v8, v9

    move-object v9, p0

    move-object/from16 v10, p4

    invoke-direct/range {v0 .. v10}, Lcom/daaw/uz;-><init>([Lcom/daaw/a41;Lcom/daaw/wm1;Lcom/daaw/xm1;Lcom/daaw/hk0;ZIZLandroid/os/Handler;Lcom/daaw/rz;Lcom/daaw/zf;)V

    iput-object v12, v11, Lcom/daaw/tz;->e:Lcom/daaw/uz;

    new-instance v0, Landroid/os/Handler;

    invoke-virtual {v12}, Lcom/daaw/uz;->r()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, v11, Lcom/daaw/tz;->f:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Release "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "ExoPlayerLib/2.8.2"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/daaw/sq1;->e:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/daaw/vz;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/daaw/tz;->e:Lcom/daaw/uz;

    invoke-virtual {v0}, Lcom/daaw/uz;->F()V

    iget-object v0, p0, Lcom/daaw/tz;->d:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public b(Lcom/daaw/bx0$a;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/tz;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/tz;->k:Z

    return v0
.end method

.method public d(Lcom/daaw/fx0$b;)Lcom/daaw/fx0;
    .locals 7

    new-instance v6, Lcom/daaw/fx0;

    iget-object v1, p0, Lcom/daaw/tz;->e:Lcom/daaw/uz;

    iget-object v0, p0, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    iget-object v3, v0, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    invoke-virtual {p0}, Lcom/daaw/tz;->g()I

    move-result v4

    iget-object v5, p0, Lcom/daaw/tz;->f:Landroid/os/Handler;

    move-object v0, v6

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/daaw/fx0;-><init>(Lcom/daaw/fx0$a;Lcom/daaw/fx0$b;Lcom/daaw/nl1;ILandroid/os/Handler;)V

    return-object v6
.end method

.method public e()I
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/tz;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    iget-object v0, v0, Lcom/daaw/yw0;->c:Lcom/daaw/bp0$a;

    iget v0, v0, Lcom/daaw/bp0$a;->c:I

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public f(J)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/tz;->g()I

    move-result v0

    invoke-virtual {p0, v0, p1, p2}, Lcom/daaw/tz;->v(IJ)V

    return-void
.end method

.method public g()I
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/tz;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/daaw/tz;->t:I

    return v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    iget-object v1, v0, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    iget-object v0, v0, Lcom/daaw/yw0;->c:Lcom/daaw/bp0$a;

    iget v0, v0, Lcom/daaw/bp0$a;->a:I

    iget-object v2, p0, Lcom/daaw/tz;->i:Lcom/daaw/nl1$b;

    invoke-virtual {v1, v0, v2}, Lcom/daaw/nl1;->f(ILcom/daaw/nl1$b;)Lcom/daaw/nl1$b;

    move-result-object v0

    iget v0, v0, Lcom/daaw/nl1$b;->c:I

    return v0
.end method

.method public getDuration()J
    .locals 4

    iget-object v0, p0, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    iget-object v0, v0, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    invoke-virtual {v0}, Lcom/daaw/nl1;->o()Z

    move-result v1

    if-eqz v1, :cond_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/tz;->t()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    iget-object v1, v1, Lcom/daaw/yw0;->c:Lcom/daaw/bp0$a;

    iget v2, v1, Lcom/daaw/bp0$a;->a:I

    iget-object v3, p0, Lcom/daaw/tz;->i:Lcom/daaw/nl1$b;

    invoke-virtual {v0, v2, v3}, Lcom/daaw/nl1;->f(ILcom/daaw/nl1$b;)Lcom/daaw/nl1$b;

    iget-object v0, p0, Lcom/daaw/tz;->i:Lcom/daaw/nl1$b;

    iget v2, v1, Lcom/daaw/bp0$a;->b:I

    iget v1, v1, Lcom/daaw/bp0$a;->c:I

    invoke-virtual {v0, v2, v1}, Lcom/daaw/nl1$b;->b(II)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/daaw/dd;->b(J)J

    move-result-wide v0

    return-wide v0

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/tz;->g()I

    move-result v1

    iget-object v2, p0, Lcom/daaw/tz;->h:Lcom/daaw/nl1$c;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/nl1;->k(ILcom/daaw/nl1$c;)Lcom/daaw/nl1$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/nl1$c;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public h(Z)V
    .locals 8

    iget-boolean v0, p0, Lcom/daaw/tz;->k:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lcom/daaw/tz;->k:Z

    iget-object v0, p0, Lcom/daaw/tz;->e:Lcom/daaw/uz;

    invoke-virtual {v0, p1}, Lcom/daaw/uz;->Z(Z)V

    iget-object v2, p0, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v1, p0

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/tz;->x(Lcom/daaw/yw0;ZIIZZ)V

    :cond_0
    return-void
.end method

.method public i()J
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/tz;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    iget-object v1, v0, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    iget-object v0, v0, Lcom/daaw/yw0;->c:Lcom/daaw/bp0$a;

    iget v0, v0, Lcom/daaw/bp0$a;->a:I

    iget-object v2, p0, Lcom/daaw/tz;->i:Lcom/daaw/nl1$b;

    invoke-virtual {v1, v0, v2}, Lcom/daaw/nl1;->f(ILcom/daaw/nl1$b;)Lcom/daaw/nl1$b;

    iget-object v0, p0, Lcom/daaw/tz;->i:Lcom/daaw/nl1$b;

    invoke-virtual {v0}, Lcom/daaw/nl1$b;->l()J

    move-result-wide v0

    iget-object v2, p0, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    iget-wide v2, v2, Lcom/daaw/yw0;->e:J

    invoke-static {v2, v3}, Lcom/daaw/dd;->b(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    return-wide v0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/tz;->o()J

    move-result-wide v0

    return-wide v0
.end method

.method public j()J
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tz;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/daaw/tz;->v:J

    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    iget-wide v0, v0, Lcom/daaw/yw0;->k:J

    invoke-virtual {p0, v0, v1}, Lcom/daaw/tz;->u(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public k()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    iget v0, v0, Lcom/daaw/yw0;->f:I

    return v0
.end method

.method public l(Lcom/daaw/bp0;ZZ)V
    .locals 8

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/tz;->r:Lcom/daaw/qz;

    const/4 v0, 0x2

    invoke-virtual {p0, p2, p3, v0}, Lcom/daaw/tz;->q(ZZI)Lcom/daaw/yw0;

    move-result-object v2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/tz;->o:Z

    iget v1, p0, Lcom/daaw/tz;->n:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/daaw/tz;->n:I

    iget-object v0, p0, Lcom/daaw/tz;->e:Lcom/daaw/uz;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/uz;->D(Lcom/daaw/bp0;ZZ)V

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/tz;->x(Lcom/daaw/yw0;ZIIZZ)V

    return-void
.end method

.method public m()I
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/tz;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    iget-object v0, v0, Lcom/daaw/yw0;->c:Lcom/daaw/bp0$a;

    iget v0, v0, Lcom/daaw/bp0$a;->b:I

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public n()Lcom/daaw/nl1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    iget-object v0, v0, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    return-object v0
.end method

.method public o()J
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tz;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/daaw/tz;->v:J

    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    iget-wide v0, v0, Lcom/daaw/yw0;->j:J

    invoke-virtual {p0, v0, v1}, Lcom/daaw/tz;->u(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public p()I
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/tz;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/daaw/tz;->u:I

    return v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    iget-object v0, v0, Lcom/daaw/yw0;->c:Lcom/daaw/bp0$a;

    iget v0, v0, Lcom/daaw/bp0$a;->a:I

    return v0
.end method

.method public final q(ZZI)Lcom/daaw/yw0;
    .locals 15

    move-object v0, p0

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    iput v1, v0, Lcom/daaw/tz;->t:I

    iput v1, v0, Lcom/daaw/tz;->u:I

    const-wide/16 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/tz;->g()I

    move-result v1

    iput v1, v0, Lcom/daaw/tz;->t:I

    invoke-virtual {p0}, Lcom/daaw/tz;->p()I

    move-result v1

    iput v1, v0, Lcom/daaw/tz;->u:I

    invoke-virtual {p0}, Lcom/daaw/tz;->o()J

    move-result-wide v1

    :goto_0
    iput-wide v1, v0, Lcom/daaw/tz;->v:J

    new-instance v1, Lcom/daaw/yw0;

    if-eqz p2, :cond_1

    sget-object v2, Lcom/daaw/nl1;->a:Lcom/daaw/nl1;

    goto :goto_1

    :cond_1
    iget-object v2, v0, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    iget-object v2, v2, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    :goto_1
    move-object v4, v2

    if-eqz p2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    iget-object v2, v0, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    iget-object v2, v2, Lcom/daaw/yw0;->b:Ljava/lang/Object;

    :goto_2
    move-object v5, v2

    iget-object v2, v0, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    iget-object v6, v2, Lcom/daaw/yw0;->c:Lcom/daaw/bp0$a;

    iget-wide v7, v2, Lcom/daaw/yw0;->d:J

    iget-wide v9, v2, Lcom/daaw/yw0;->e:J

    const/4 v12, 0x0

    if-eqz p2, :cond_3

    sget-object v3, Lcom/google/android/exoplayer2/source/TrackGroupArray;->s:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    goto :goto_3

    :cond_3
    iget-object v3, v2, Lcom/daaw/yw0;->h:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    :goto_3
    move-object v13, v3

    if-eqz p2, :cond_4

    iget-object v2, v0, Lcom/daaw/tz;->c:Lcom/daaw/xm1;

    goto :goto_4

    :cond_4
    iget-object v2, v2, Lcom/daaw/yw0;->i:Lcom/daaw/xm1;

    :goto_4
    move-object v14, v2

    move-object v3, v1

    move/from16 v11, p3

    invoke-direct/range {v3 .. v14}, Lcom/daaw/yw0;-><init>(Lcom/daaw/nl1;Ljava/lang/Object;Lcom/daaw/bp0$a;JJIZLcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/daaw/xm1;)V

    return-object v1
.end method

.method public r(Landroid/os/Message;)V
    .locals 4

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/qz;

    iput-object p1, p0, Lcom/daaw/tz;->r:Lcom/daaw/qz;

    iget-object v0, p0, Lcom/daaw/tz;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/bx0$a;

    invoke-interface {v1, p1}, Lcom/daaw/bx0$a;->A(Lcom/daaw/qz;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/zw0;

    iget-object v0, p0, Lcom/daaw/tz;->q:Lcom/daaw/zw0;

    invoke-virtual {v0, p1}, Lcom/daaw/zw0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iput-object p1, p0, Lcom/daaw/tz;->q:Lcom/daaw/zw0;

    iget-object v0, p0, Lcom/daaw/tz;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/bx0$a;

    invoke-interface {v1, p1}, Lcom/daaw/bx0$a;->c(Lcom/daaw/zw0;)V

    goto :goto_1

    :cond_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/yw0;

    iget v2, p1, Landroid/os/Message;->arg1:I

    iget p1, p1, Landroid/os/Message;->arg2:I

    const/4 v3, -0x1

    if-eq p1, v3, :cond_3

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {p0, v0, v2, v1, p1}, Lcom/daaw/tz;->s(Lcom/daaw/yw0;IZI)V

    :cond_4
    return-void
.end method

.method public final s(Lcom/daaw/yw0;IZI)V
    .locals 7

    iget v0, p0, Lcom/daaw/tz;->n:I

    sub-int/2addr v0, p2

    iput v0, p0, Lcom/daaw/tz;->n:I

    if-nez v0, :cond_4

    iget-wide v0, p1, Lcom/daaw/yw0;->d:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v0, v2

    if-nez p2, :cond_0

    iget-object v1, p1, Lcom/daaw/yw0;->c:Lcom/daaw/bp0$a;

    const-wide/16 v2, 0x0

    iget-wide v4, p1, Lcom/daaw/yw0;->e:J

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/yw0;->g(Lcom/daaw/bp0$a;JJ)Lcom/daaw/yw0;

    move-result-object p1

    :cond_0
    move-object v1, p1

    iget-object p1, p0, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    iget-object p1, p1, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    invoke-virtual {p1}, Lcom/daaw/nl1;->o()Z

    move-result p1

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lcom/daaw/tz;->o:Z

    if-eqz p1, :cond_2

    :cond_1
    iget-object p1, v1, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    invoke-virtual {p1}, Lcom/daaw/nl1;->o()Z

    move-result p1

    if-eqz p1, :cond_2

    iput p2, p0, Lcom/daaw/tz;->u:I

    iput p2, p0, Lcom/daaw/tz;->t:I

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/daaw/tz;->v:J

    :cond_2
    iget-boolean p1, p0, Lcom/daaw/tz;->o:Z

    if-eqz p1, :cond_3

    const/4 v4, 0x0

    goto :goto_0

    :cond_3
    const/4 p1, 0x2

    const/4 v4, 0x2

    :goto_0
    iget-boolean v5, p0, Lcom/daaw/tz;->p:Z

    iput-boolean p2, p0, Lcom/daaw/tz;->o:Z

    iput-boolean p2, p0, Lcom/daaw/tz;->p:Z

    const/4 v6, 0x0

    move-object v0, p0

    move v2, p3

    move v3, p4

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tz;->x(Lcom/daaw/yw0;ZIIZZ)V

    :cond_4
    return-void
.end method

.method public t()Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/tz;->w()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    iget-object v0, v0, Lcom/daaw/yw0;->c:Lcom/daaw/bp0$a;

    invoke-virtual {v0}, Lcom/daaw/bp0$a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final u(J)J
    .locals 3

    invoke-static {p1, p2}, Lcom/daaw/dd;->b(J)J

    move-result-wide p1

    iget-object v0, p0, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    iget-object v0, v0, Lcom/daaw/yw0;->c:Lcom/daaw/bp0$a;

    invoke-virtual {v0}, Lcom/daaw/bp0$a;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    iget-object v1, v0, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    iget-object v0, v0, Lcom/daaw/yw0;->c:Lcom/daaw/bp0$a;

    iget v0, v0, Lcom/daaw/bp0$a;->a:I

    iget-object v2, p0, Lcom/daaw/tz;->i:Lcom/daaw/nl1$b;

    invoke-virtual {v1, v0, v2}, Lcom/daaw/nl1;->f(ILcom/daaw/nl1$b;)Lcom/daaw/nl1$b;

    iget-object v0, p0, Lcom/daaw/tz;->i:Lcom/daaw/nl1$b;

    invoke-virtual {v0}, Lcom/daaw/nl1$b;->l()J

    move-result-wide v0

    add-long/2addr p1, v0

    :cond_0
    return-wide p1
.end method

.method public v(IJ)V
    .locals 10

    iget-object v0, p0, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    iget-object v0, v0, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    if-ltz p1, :cond_6

    invoke-virtual {v0}, Lcom/daaw/nl1;->o()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/daaw/nl1;->n()I

    move-result v1

    if-ge p1, v1, :cond_6

    :cond_0
    const/4 v7, 0x1

    iput-boolean v7, p0, Lcom/daaw/tz;->p:Z

    iget v1, p0, Lcom/daaw/tz;->n:I

    add-int/2addr v1, v7

    iput v1, p0, Lcom/daaw/tz;->n:I

    invoke-virtual {p0}, Lcom/daaw/tz;->t()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-object p1, p0, Lcom/daaw/tz;->d:Landroid/os/Handler;

    const/4 p2, -0x1

    iget-object p3, p0, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    invoke-virtual {p1, v2, v7, p2, p3}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void

    :cond_1
    iput p1, p0, Lcom/daaw/tz;->t:I

    invoke-virtual {v0}, Lcom/daaw/nl1;->o()Z

    move-result v1

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v1, :cond_3

    cmp-long v1, p2, v3

    if-nez v1, :cond_2

    const-wide/16 v3, 0x0

    goto :goto_0

    :cond_2
    move-wide v3, p2

    :goto_0
    iput-wide v3, p0, Lcom/daaw/tz;->v:J

    iput v2, p0, Lcom/daaw/tz;->u:I

    goto :goto_2

    :cond_3
    cmp-long v1, p2, v3

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/daaw/tz;->h:Lcom/daaw/nl1$c;

    invoke-virtual {v0, p1, v1}, Lcom/daaw/nl1;->k(ILcom/daaw/nl1$c;)Lcom/daaw/nl1$c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/nl1$c;->b()J

    move-result-wide v1

    goto :goto_1

    :cond_4
    invoke-static {p2, p3}, Lcom/daaw/dd;->a(J)J

    move-result-wide v1

    :goto_1
    move-wide v8, v1

    iget-object v2, p0, Lcom/daaw/tz;->h:Lcom/daaw/nl1$c;

    iget-object v3, p0, Lcom/daaw/tz;->i:Lcom/daaw/nl1$b;

    move-object v1, v0

    move v4, p1

    move-wide v5, v8

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/nl1;->i(Lcom/daaw/nl1$c;Lcom/daaw/nl1$b;IJ)Landroid/util/Pair;

    move-result-object v1

    invoke-static {v8, v9}, Lcom/daaw/dd;->b(J)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/daaw/tz;->v:J

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, p0, Lcom/daaw/tz;->u:I

    :goto_2
    iget-object v1, p0, Lcom/daaw/tz;->e:Lcom/daaw/uz;

    invoke-static {p2, p3}, Lcom/daaw/dd;->a(J)J

    move-result-wide p2

    invoke-virtual {v1, v0, p1, p2, p3}, Lcom/daaw/uz;->Q(Lcom/daaw/nl1;IJ)V

    iget-object p1, p0, Lcom/daaw/tz;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/bx0$a;

    invoke-interface {p2, v7}, Lcom/daaw/bx0$a;->e(I)V

    goto :goto_3

    :cond_5
    return-void

    :cond_6
    new-instance v1, Lcom/daaw/we0;

    invoke-direct {v1, v0, p1, p2, p3}, Lcom/daaw/we0;-><init>(Lcom/daaw/nl1;IJ)V

    goto :goto_5

    :goto_4
    throw v1

    :goto_5
    goto :goto_4
.end method

.method public final w()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    iget-object v0, v0, Lcom/daaw/yw0;->a:Lcom/daaw/nl1;

    invoke-virtual {v0}, Lcom/daaw/nl1;->o()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/daaw/tz;->n:I

    if-lez v0, :cond_0

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

.method public final x(Lcom/daaw/yw0;ZIIZZ)V
    .locals 15

    move-object v0, p0

    iget-object v1, v0, Lcom/daaw/tz;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    iget-object v2, v0, Lcom/daaw/tz;->j:Ljava/util/ArrayDeque;

    new-instance v14, Lcom/daaw/tz$b;

    iget-object v5, v0, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    iget-object v6, v0, Lcom/daaw/tz;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    iget-object v7, v0, Lcom/daaw/tz;->b:Lcom/daaw/wm1;

    iget-boolean v12, v0, Lcom/daaw/tz;->k:Z

    move-object v3, v14

    move-object/from16 v4, p1

    move/from16 v8, p2

    move/from16 v9, p3

    move/from16 v10, p4

    move/from16 v11, p5

    move/from16 v13, p6

    invoke-direct/range {v3 .. v13}, Lcom/daaw/tz$b;-><init>(Lcom/daaw/yw0;Lcom/daaw/yw0;Ljava/util/Set;Lcom/daaw/wm1;ZIIZZZ)V

    invoke-virtual {v2, v14}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    iput-object v2, v0, Lcom/daaw/tz;->s:Lcom/daaw/yw0;

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :goto_0
    iget-object v1, v0, Lcom/daaw/tz;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, v0, Lcom/daaw/tz;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/tz$b;

    invoke-virtual {v1}, Lcom/daaw/tz$b;->a()V

    iget-object v1, v0, Lcom/daaw/tz;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method
