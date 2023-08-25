.class public final Lcom/daaw/pg4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/lq4;
.implements Lcom/daaw/fs4;
.implements Lcom/daaw/ir4;
.implements Lcom/google/android/gms/ads/internal/client/zza;
.implements Lcom/daaw/er4;


# instance fields
.field public final A:Ljava/lang/ref/WeakReference;

.field public final B:Ljava/lang/ref/WeakReference;

.field public C:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field public final D:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final E:Lcom/daaw/la3;

.field public final p:Landroid/content/Context;

.field public final q:Ljava/util/concurrent/Executor;

.field public final r:Ljava/util/concurrent/Executor;

.field public final s:Ljava/util/concurrent/ScheduledExecutorService;

.field public final t:Lcom/daaw/fi6;

.field public final u:Lcom/daaw/th6;

.field public final v:Lcom/daaw/kp6;

.field public final w:Lcom/daaw/aj6;

.field public final x:Lcom/daaw/sl2;

.field public final y:Lcom/daaw/ja3;

.field public final z:Lcom/daaw/to6;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/kp6;Lcom/daaw/aj6;Landroid/view/View;Lcom/daaw/a74;Lcom/daaw/sl2;Lcom/daaw/ja3;Lcom/daaw/la3;Lcom/daaw/to6;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p15, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p15}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p15, p0, Lcom/daaw/pg4;->D:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lcom/daaw/pg4;->p:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/pg4;->q:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/daaw/pg4;->r:Ljava/util/concurrent/Executor;

    iput-object p4, p0, Lcom/daaw/pg4;->s:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p5, p0, Lcom/daaw/pg4;->t:Lcom/daaw/fi6;

    iput-object p6, p0, Lcom/daaw/pg4;->u:Lcom/daaw/th6;

    iput-object p7, p0, Lcom/daaw/pg4;->v:Lcom/daaw/kp6;

    iput-object p8, p0, Lcom/daaw/pg4;->w:Lcom/daaw/aj6;

    iput-object p11, p0, Lcom/daaw/pg4;->x:Lcom/daaw/sl2;

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p9}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/daaw/pg4;->A:Ljava/lang/ref/WeakReference;

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p10}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/daaw/pg4;->B:Ljava/lang/ref/WeakReference;

    iput-object p12, p0, Lcom/daaw/pg4;->y:Lcom/daaw/ja3;

    iput-object p13, p0, Lcom/daaw/pg4;->E:Lcom/daaw/la3;

    iput-object p14, p0, Lcom/daaw/pg4;->z:Lcom/daaw/to6;

    return-void
.end method

.method public static bridge synthetic b(Lcom/daaw/pg4;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/daaw/pg4;->p:Landroid/content/Context;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/daaw/pg4;)Lcom/daaw/th6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/pg4;->u:Lcom/daaw/th6;

    return-object p0
.end method

.method public static bridge synthetic f(Lcom/daaw/pg4;)Lcom/daaw/fi6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/pg4;->t:Lcom/daaw/fi6;

    return-object p0
.end method

.method public static bridge synthetic k(Lcom/daaw/pg4;)Lcom/daaw/aj6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/pg4;->w:Lcom/daaw/aj6;

    return-object p0
.end method

.method public static bridge synthetic l(Lcom/daaw/pg4;)Lcom/daaw/kp6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/pg4;->v:Lcom/daaw/kp6;

    return-object p0
.end method

.method public static synthetic s(Lcom/daaw/pg4;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/pg4;->S()V

    return-void
.end method


# virtual methods
.method public final A(Lcom/google/android/gms/ads/internal/client/zze;)V
    .locals 4

    sget-object v0, Lcom/daaw/g93;->o1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget p1, p1, Lcom/google/android/gms/ads/internal/client/zze;->zza:I

    iget-object v0, p0, Lcom/daaw/pg4;->u:Lcom/daaw/th6;

    iget-object v0, v0, Lcom/daaw/th6;->p:Ljava/util/List;

    const/4 v1, 0x2

    invoke-static {v1, p1, v0}, Lcom/daaw/kp6;->f(IILjava/util/List;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/pg4;->w:Lcom/daaw/aj6;

    iget-object v1, p0, Lcom/daaw/pg4;->v:Lcom/daaw/kp6;

    iget-object v2, p0, Lcom/daaw/pg4;->t:Lcom/daaw/fi6;

    iget-object v3, p0, Lcom/daaw/pg4;->u:Lcom/daaw/th6;

    invoke-virtual {v1, v2, v3, p1}, Lcom/daaw/kp6;->c(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/aj6;->a(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public final synthetic F()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/pg4;->q:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/daaw/mg4;

    invoke-direct {v1, p0}, Lcom/daaw/mg4;-><init>(Lcom/daaw/pg4;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final synthetic H(II)V
    .locals 0

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/pg4;->W(II)V

    return-void
.end method

.method public final synthetic M(II)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/pg4;->q:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/daaw/kg4;

    invoke-direct {v1, p0, p1, p2}, Lcom/daaw/kg4;-><init>(Lcom/daaw/pg4;II)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final S()V
    .locals 9

    sget-object v0, Lcom/daaw/g93;->Z2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/pg4;->x:Lcom/daaw/sl2;

    invoke-virtual {v0}, Lcom/daaw/sl2;->c()Lcom/daaw/ol2;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/pg4;->p:Landroid/content/Context;

    iget-object v3, p0, Lcom/daaw/pg4;->A:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-interface {v0, v2, v3, v1}, Lcom/daaw/ol2;->zzh(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v0

    move-object v6, v0

    goto :goto_0

    :cond_0
    move-object v6, v1

    :goto_0
    sget-object v0, Lcom/daaw/g93;->l0:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/pg4;->t:Lcom/daaw/fi6;

    iget-object v0, v0, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object v0, v0, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    iget-boolean v0, v0, Lcom/daaw/wh6;->g:Z

    if-nez v0, :cond_2

    :cond_1
    sget-object v0, Lcom/daaw/za3;->h:Lcom/daaw/ma3;

    invoke-virtual {v0}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/daaw/pg4;->w:Lcom/daaw/aj6;

    iget-object v2, p0, Lcom/daaw/pg4;->v:Lcom/daaw/kp6;

    iget-object v3, p0, Lcom/daaw/pg4;->t:Lcom/daaw/fi6;

    iget-object v4, p0, Lcom/daaw/pg4;->u:Lcom/daaw/th6;

    const/4 v5, 0x0

    const/4 v7, 0x0

    iget-object v8, v4, Lcom/daaw/th6;->d:Ljava/util/List;

    invoke-virtual/range {v2 .. v8}, Lcom/daaw/kp6;->d(Lcom/daaw/fi6;Lcom/daaw/th6;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/aj6;->a(Ljava/util/List;)V

    return-void

    :cond_3
    sget-object v0, Lcom/daaw/za3;->g:Lcom/daaw/ma3;

    invoke-virtual {v0}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/daaw/pg4;->u:Lcom/daaw/th6;

    iget v0, v0, Lcom/daaw/th6;->b:I

    const/4 v2, 0x1

    if-eq v0, v2, :cond_4

    const/4 v2, 0x2

    if-eq v0, v2, :cond_4

    const/4 v2, 0x5

    if-ne v0, v2, :cond_5

    :cond_4
    iget-object v0, p0, Lcom/daaw/pg4;->B:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/a74;

    :cond_5
    invoke-static {v1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/j67;->D(Lcom/daaw/f77;)Lcom/daaw/j67;

    move-result-object v0

    sget-object v1, Lcom/daaw/g93;->P0:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v4, p0, Lcom/daaw/pg4;->s:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/daaw/s67;->o(Lcom/daaw/f77;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/daaw/f77;

    move-result-object v0

    check-cast v0, Lcom/daaw/j67;

    new-instance v1, Lcom/daaw/og4;

    invoke-direct {v1, p0, v6}, Lcom/daaw/og4;-><init>(Lcom/daaw/pg4;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/daaw/pg4;->q:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final T()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/pg4;->w:Lcom/daaw/aj6;

    iget-object v1, p0, Lcom/daaw/pg4;->v:Lcom/daaw/kp6;

    iget-object v2, p0, Lcom/daaw/pg4;->t:Lcom/daaw/fi6;

    iget-object v3, p0, Lcom/daaw/pg4;->u:Lcom/daaw/th6;

    iget-object v4, v3, Lcom/daaw/th6;->h:Ljava/util/List;

    invoke-virtual {v1, v2, v3, v4}, Lcom/daaw/kp6;->c(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/aj6;->a(Ljava/util/List;)V

    return-void
.end method

.method public final W(II)V
    .locals 3

    if-lez p1, :cond_2

    iget-object v0, p0, Lcom/daaw/pg4;->A:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/daaw/pg4;->s:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/daaw/ig4;

    invoke-direct {v1, p0, p1, p2}, Lcom/daaw/ig4;-><init>(Lcom/daaw/pg4;II)V

    int-to-long p1, p2

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, p1, p2, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void

    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/daaw/pg4;->S()V

    return-void
.end method

.method public final c()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/pg4;->w:Lcom/daaw/aj6;

    iget-object v1, p0, Lcom/daaw/pg4;->v:Lcom/daaw/kp6;

    iget-object v2, p0, Lcom/daaw/pg4;->t:Lcom/daaw/fi6;

    iget-object v3, p0, Lcom/daaw/pg4;->u:Lcom/daaw/th6;

    iget-object v4, v3, Lcom/daaw/th6;->j:Ljava/util/List;

    invoke-virtual {v1, v2, v3, v4}, Lcom/daaw/kp6;->c(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/aj6;->a(Ljava/util/List;)V

    return-void
.end method

.method public final m(Lcom/daaw/cv3;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object p2, p0, Lcom/daaw/pg4;->w:Lcom/daaw/aj6;

    iget-object p3, p0, Lcom/daaw/pg4;->v:Lcom/daaw/kp6;

    iget-object v0, p0, Lcom/daaw/pg4;->u:Lcom/daaw/th6;

    iget-object v1, v0, Lcom/daaw/th6;->i:Ljava/util/List;

    invoke-virtual {p3, v0, v1, p1}, Lcom/daaw/kp6;->e(Lcom/daaw/th6;Ljava/util/List;Lcom/daaw/cv3;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/daaw/aj6;->a(Ljava/util/List;)V

    return-void
.end method

.method public final onAdClicked()V
    .locals 5

    sget-object v0, Lcom/daaw/g93;->l0:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/pg4;->t:Lcom/daaw/fi6;

    iget-object v0, v0, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object v0, v0, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    iget-boolean v0, v0, Lcom/daaw/wh6;->g:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/daaw/za3;->d:Lcom/daaw/ma3;

    invoke-virtual {v0}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/pg4;->y:Lcom/daaw/ja3;

    invoke-virtual {v0}, Lcom/daaw/ja3;->a()Lcom/daaw/f77;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/j67;->D(Lcom/daaw/f77;)Lcom/daaw/j67;

    move-result-object v0

    sget-object v1, Lcom/daaw/jg4;->a:Lcom/daaw/jg4;

    sget-object v2, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    const-class v3, Ljava/lang/Throwable;

    invoke-static {v0, v3, v1, v2}, Lcom/daaw/s67;->f(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    new-instance v1, Lcom/daaw/ng4;

    invoke-direct {v1, p0}, Lcom/daaw/ng4;-><init>(Lcom/daaw/pg4;)V

    iget-object v2, p0, Lcom/daaw/pg4;->q:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/daaw/pg4;->w:Lcom/daaw/aj6;

    iget-object v1, p0, Lcom/daaw/pg4;->v:Lcom/daaw/kp6;

    iget-object v2, p0, Lcom/daaw/pg4;->t:Lcom/daaw/fi6;

    iget-object v3, p0, Lcom/daaw/pg4;->u:Lcom/daaw/th6;

    iget-object v4, v3, Lcom/daaw/th6;->c:Ljava/util/List;

    invoke-virtual {v1, v2, v3, v4}, Lcom/daaw/kp6;->c(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/pg4;->p:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lcom/daaw/qz3;->x(Landroid/content/Context;)Z

    move-result v2

    const/4 v3, 0x1

    if-eq v3, v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x2

    :goto_1
    invoke-virtual {v0, v1, v3}, Lcom/daaw/aj6;->c(Ljava/util/List;I)V

    return-void
.end method

.method public final zzj()V
    .locals 0

    return-void
.end method

.method public final zzl()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/pg4;->D:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/daaw/g93;->d3:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_1

    sget-object v1, Lcom/daaw/g93;->e3:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/daaw/pg4;->W(II)V

    return-void

    :cond_1
    sget-object v0, Lcom/daaw/g93;->c3:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/pg4;->r:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/daaw/lg4;

    invoke-direct {v1, p0}, Lcom/daaw/lg4;-><init>(Lcom/daaw/pg4;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/pg4;->S()V

    return-void
.end method

.method public final zzm()V
    .locals 0

    return-void
.end method

.method public final declared-synchronized zzn()V
    .locals 8

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/pg4;->C:Z

    if-eqz v0, :cond_0

    new-instance v7, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/daaw/pg4;->u:Lcom/daaw/th6;

    iget-object v0, v0, Lcom/daaw/th6;->d:Ljava/util/List;

    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v0, p0, Lcom/daaw/pg4;->u:Lcom/daaw/th6;

    iget-object v0, v0, Lcom/daaw/th6;->g:Ljava/util/List;

    invoke-interface {v7, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lcom/daaw/pg4;->w:Lcom/daaw/aj6;

    iget-object v1, p0, Lcom/daaw/pg4;->v:Lcom/daaw/kp6;

    iget-object v2, p0, Lcom/daaw/pg4;->t:Lcom/daaw/fi6;

    iget-object v3, p0, Lcom/daaw/pg4;->u:Lcom/daaw/th6;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/kp6;->d(Lcom/daaw/fi6;Lcom/daaw/th6;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Lcom/daaw/aj6;->a(Ljava/util/List;)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/pg4;->w:Lcom/daaw/aj6;

    iget-object v1, p0, Lcom/daaw/pg4;->v:Lcom/daaw/kp6;

    iget-object v2, p0, Lcom/daaw/pg4;->t:Lcom/daaw/fi6;

    iget-object v3, p0, Lcom/daaw/pg4;->u:Lcom/daaw/th6;

    iget-object v4, v3, Lcom/daaw/th6;->n:Ljava/util/List;

    invoke-virtual {v1, v2, v3, v4}, Lcom/daaw/kp6;->c(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/aj6;->a(Ljava/util/List;)V

    iget-object v0, p0, Lcom/daaw/pg4;->w:Lcom/daaw/aj6;

    iget-object v1, p0, Lcom/daaw/pg4;->v:Lcom/daaw/kp6;

    iget-object v2, p0, Lcom/daaw/pg4;->t:Lcom/daaw/fi6;

    iget-object v3, p0, Lcom/daaw/pg4;->u:Lcom/daaw/th6;

    iget-object v4, v3, Lcom/daaw/th6;->g:Ljava/util/List;

    invoke-virtual {v1, v2, v3, v4}, Lcom/daaw/kp6;->c(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :goto_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/pg4;->C:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method

.method public final zzo()V
    .locals 0

    return-void
.end method
