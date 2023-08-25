.class public final Lcom/daaw/av5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final a:Lcom/daaw/en6;

.field public final b:Lcom/daaw/nq4;

.field public final c:Lcom/daaw/kp6;

.field public final d:Lcom/daaw/op6;

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:Ljava/util/concurrent/ScheduledExecutorService;

.field public final g:Lcom/daaw/cm4;

.field public final h:Lcom/daaw/vu5;

.field public final i:Lcom/daaw/vq5;

.field public final j:Landroid/content/Context;

.field public final k:Lcom/daaw/to6;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/en6;Lcom/daaw/vu5;Lcom/daaw/nq4;Lcom/daaw/kp6;Lcom/daaw/op6;Lcom/daaw/cm4;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lcom/daaw/vq5;Lcom/daaw/to6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/av5;->j:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/av5;->a:Lcom/daaw/en6;

    iput-object p3, p0, Lcom/daaw/av5;->h:Lcom/daaw/vu5;

    iput-object p4, p0, Lcom/daaw/av5;->b:Lcom/daaw/nq4;

    iput-object p5, p0, Lcom/daaw/av5;->c:Lcom/daaw/kp6;

    iput-object p6, p0, Lcom/daaw/av5;->d:Lcom/daaw/op6;

    iput-object p7, p0, Lcom/daaw/av5;->g:Lcom/daaw/cm4;

    iput-object p8, p0, Lcom/daaw/av5;->e:Ljava/util/concurrent/Executor;

    iput-object p9, p0, Lcom/daaw/av5;->f:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p10, p0, Lcom/daaw/av5;->i:Lcom/daaw/vq5;

    iput-object p11, p0, Lcom/daaw/av5;->k:Lcom/daaw/to6;

    return-void
.end method


# virtual methods
.method public final synthetic b(Lcom/daaw/th6;Lcom/daaw/fi6;Lcom/daaw/qq5;Ljava/lang/Throwable;)Lcom/daaw/f77;
    .locals 5

    iget-object p4, p0, Lcom/daaw/av5;->j:Landroid/content/Context;

    const/16 v0, 0xc

    invoke-static {p4, v0}, Lcom/daaw/ho6;->a(Landroid/content/Context;I)Lcom/daaw/io6;

    move-result-object p4

    iget-object v0, p1, Lcom/daaw/th6;->F:Ljava/lang/String;

    invoke-interface {p4, v0}, Lcom/daaw/io6;->l(Ljava/lang/String;)Lcom/daaw/io6;

    invoke-interface {p4}, Lcom/daaw/io6;->zzh()Lcom/daaw/io6;

    iget-object v0, p0, Lcom/daaw/av5;->h:Lcom/daaw/vu5;

    invoke-interface {p3, p2, p1}, Lcom/daaw/qq5;->b(Lcom/daaw/fi6;Lcom/daaw/th6;)Lcom/daaw/f77;

    move-result-object p3

    iget v1, p1, Lcom/daaw/th6;->S:I

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v4, p0, Lcom/daaw/av5;->f:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {p3, v1, v2, v3, v4}, Lcom/daaw/s67;->o(Lcom/daaw/f77;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/daaw/f77;

    move-result-object p3

    iget-object v1, p0, Lcom/daaw/av5;->c:Lcom/daaw/kp6;

    invoke-virtual {v0, p2, p1, p3, v1}, Lcom/daaw/vu5;->e(Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/f77;Lcom/daaw/kp6;)Lcom/daaw/f77;

    iget-object p1, p0, Lcom/daaw/av5;->k:Lcom/daaw/to6;

    invoke-static {p3, p1, p4}, Lcom/daaw/so6;->a(Lcom/daaw/f77;Lcom/daaw/to6;Lcom/daaw/io6;)V

    return-object p3
.end method

.method public final synthetic zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 8

    check-cast p1, Lcom/daaw/fi6;

    iget-object v0, p1, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object v0, v0, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    iget v0, v0, Lcom/daaw/wh6;->e:I

    const/16 v1, 0xc8

    const/16 v2, 0x12c

    if-eqz v0, :cond_2

    if-lt v0, v1, :cond_0

    if-ge v0, v2, :cond_0

    sget-object v0, Lcom/daaw/g93;->U4:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "No fill."

    goto :goto_0

    :cond_0
    if-lt v0, v2, :cond_1

    const/16 v3, 0x190

    if-ge v0, v3, :cond_1

    const-string v0, "No location header to follow redirect or too many redirects."

    goto :goto_0

    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Received error HTTP response code: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    const-string v0, "No ad config."

    :goto_0
    iget-object v3, p1, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object v3, v3, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    iget-object v4, v3, Lcom/daaw/wh6;->i:Lcom/daaw/vh6;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lcom/daaw/vh6;->a()Ljava/lang/String;

    move-result-object v0

    :cond_3
    iget-object v4, p0, Lcom/daaw/av5;->i:Lcom/daaw/vq5;

    invoke-virtual {v4, v3}, Lcom/daaw/vq5;->g(Lcom/daaw/wh6;)V

    sget-object v3, Lcom/daaw/g93;->y7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const/4 v4, 0x3

    if-eqz v3, :cond_5

    iget-object v3, p1, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object v3, v3, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    iget v3, v3, Lcom/daaw/wh6;->e:I

    if-eqz v3, :cond_5

    if-lt v3, v1, :cond_4

    if-lt v3, v2, :cond_5

    :cond_4
    new-instance p1, Lcom/daaw/yu5;

    invoke-direct {p1, v4, v0}, Lcom/daaw/yu5;-><init>(ILjava/lang/String;)V

    invoke-static {p1}, Lcom/daaw/s67;->h(Ljava/lang/Throwable;)Lcom/daaw/f77;

    move-result-object p1

    goto/16 :goto_3

    :cond_5
    iget-object v1, p0, Lcom/daaw/av5;->a:Lcom/daaw/en6;

    sget-object v2, Lcom/daaw/ym6;->D:Lcom/daaw/ym6;

    new-instance v3, Lcom/daaw/yu5;

    invoke-direct {v3, v4, v0}, Lcom/daaw/yu5;-><init>(ILjava/lang/String;)V

    invoke-static {v3}, Lcom/daaw/s67;->h(Ljava/lang/Throwable;)Lcom/daaw/f77;

    move-result-object v0

    invoke-static {v0, v2, v1}, Lcom/daaw/lm6;->c(Lcom/daaw/f77;Ljava/lang/Object;Lcom/daaw/wm6;)Lcom/daaw/vm6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/vm6;->a()Lcom/daaw/gm6;

    move-result-object v0

    iget-object v1, p1, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object v1, v1, Lcom/daaw/ei6;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/th6;

    iget-object v3, p0, Lcom/daaw/av5;->i:Lcom/daaw/vq5;

    invoke-virtual {v3, v2}, Lcom/daaw/vq5;->d(Lcom/daaw/th6;)V

    iget-object v3, v2, Lcom/daaw/th6;->a:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v5, p0, Lcom/daaw/av5;->g:Lcom/daaw/cm4;

    iget v6, v2, Lcom/daaw/th6;->b:I

    invoke-interface {v5, v6, v4}, Lcom/daaw/cm4;->a(ILjava/lang/String;)Lcom/daaw/qq5;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-interface {v4, p1, v2}, Lcom/daaw/qq5;->a(Lcom/daaw/fi6;Lcom/daaw/th6;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_1

    :cond_7
    iget-object v3, p0, Lcom/daaw/av5;->i:Lcom/daaw/vq5;

    const-wide/16 v4, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v6, v7, v7}, Lcom/daaw/tj6;->d(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v6

    invoke-virtual {v3, v2, v4, v5, v6}, Lcom/daaw/vq5;->e(Lcom/daaw/th6;JLcom/google/android/gms/ads/internal/client/zze;)V

    goto :goto_1

    :cond_8
    iget-object v1, p0, Lcom/daaw/av5;->b:Lcom/daaw/nq4;

    new-instance v2, Lcom/daaw/fg4;

    iget-object v3, p0, Lcom/daaw/av5;->d:Lcom/daaw/op6;

    iget-object v4, p0, Lcom/daaw/av5;->c:Lcom/daaw/kp6;

    invoke-direct {v2, p1, v3, v4}, Lcom/daaw/fg4;-><init>(Lcom/daaw/fi6;Lcom/daaw/op6;Lcom/daaw/kp6;)V

    iget-object v3, p0, Lcom/daaw/av5;->e:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v2, v3}, Lcom/daaw/kw4;->n0(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    iget-object v1, p1, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object v1, v1, Lcom/daaw/ei6;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/th6;

    iget-object v4, v3, Lcom/daaw/th6;->a:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    iget-object v6, p0, Lcom/daaw/av5;->g:Lcom/daaw/cm4;

    iget v7, v3, Lcom/daaw/th6;->b:I

    invoke-interface {v6, v7, v5}, Lcom/daaw/cm4;->a(ILjava/lang/String;)Lcom/daaw/qq5;

    move-result-object v6

    if-eqz v6, :cond_9

    invoke-interface {v6, p1, v3}, Lcom/daaw/qq5;->a(Lcom/daaw/fi6;Lcom/daaw/th6;)Z

    move-result v7

    if-eqz v7, :cond_9

    iget-object v4, p0, Lcom/daaw/av5;->a:Lcom/daaw/en6;

    sget-object v7, Lcom/daaw/ym6;->E:Lcom/daaw/ym6;

    invoke-virtual {v4, v7, v0}, Lcom/daaw/wm6;->b(Ljava/lang/Object;Lcom/daaw/f77;)Lcom/daaw/vm6;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "render-config-"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "-"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/daaw/vm6;->h(Ljava/lang/String;)Lcom/daaw/vm6;

    move-result-object v0

    new-instance v4, Lcom/daaw/zu5;

    invoke-direct {v4, p0, v3, p1, v6}, Lcom/daaw/zu5;-><init>(Lcom/daaw/av5;Lcom/daaw/th6;Lcom/daaw/fi6;Lcom/daaw/qq5;)V

    const-class v3, Ljava/lang/Throwable;

    invoke-virtual {v0, v3, v4}, Lcom/daaw/vm6;->c(Ljava/lang/Class;Lcom/daaw/w57;)Lcom/daaw/vm6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/vm6;->a()Lcom/daaw/gm6;

    move-result-object v0

    :cond_a
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_b
    move-object p1, v0

    :goto_3
    return-object p1
.end method
