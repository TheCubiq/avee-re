.class public Lcom/daaw/ae1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/ae1$c;,
        Lcom/daaw/ae1$b;
    }
.end annotation


# static fields
.field public static e:Lcom/daaw/ae1;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Landroid/os/Handler;

.field public c:Lcom/daaw/ae1$c;

.field public d:Lcom/daaw/ae1$c;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/ae1;->a:Ljava/lang/Object;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/daaw/ae1$a;

    invoke-direct {v2, p0}, Lcom/daaw/ae1$a;-><init>(Lcom/daaw/ae1;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/daaw/ae1;->b:Landroid/os/Handler;

    return-void
.end method

.method public static b()Lcom/daaw/ae1;
    .locals 1

    sget-object v0, Lcom/daaw/ae1;->e:Lcom/daaw/ae1;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/ae1;

    invoke-direct {v0}, Lcom/daaw/ae1;-><init>()V

    sput-object v0, Lcom/daaw/ae1;->e:Lcom/daaw/ae1;

    :cond_0
    sget-object v0, Lcom/daaw/ae1;->e:Lcom/daaw/ae1;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/daaw/ae1$c;I)Z
    .locals 2

    iget-object v0, p1, Lcom/daaw/ae1$c;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ae1$b;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/ae1;->b:Landroid/os/Handler;

    invoke-virtual {v1, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    invoke-interface {v0, p2}, Lcom/daaw/ae1$b;->a(I)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public c(Lcom/daaw/ae1$c;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ae1;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/ae1;->c:Lcom/daaw/ae1$c;

    if-eq v1, p1, :cond_0

    iget-object v1, p0, Lcom/daaw/ae1;->d:Lcom/daaw/ae1$c;

    if-ne v1, p1, :cond_1

    :cond_0
    const/4 v1, 0x2

    invoke-virtual {p0, p1, v1}, Lcom/daaw/ae1;->a(Lcom/daaw/ae1$c;I)Z

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final d(Lcom/daaw/ae1$b;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/ae1;->c:Lcom/daaw/ae1$c;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/ae1$c;->a(Lcom/daaw/ae1$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public e(Lcom/daaw/ae1$b;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ae1;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/daaw/ae1;->d(Lcom/daaw/ae1$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/ae1;->c:Lcom/daaw/ae1$c;

    iget-boolean v1, p1, Lcom/daaw/ae1$c;->c:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p1, Lcom/daaw/ae1$c;->c:Z

    iget-object v1, p0, Lcom/daaw/ae1;->b:Landroid/os/Handler;

    invoke-virtual {v1, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public f(Lcom/daaw/ae1$b;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ae1;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/daaw/ae1;->d(Lcom/daaw/ae1$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/ae1;->c:Lcom/daaw/ae1$c;

    iget-boolean v1, p1, Lcom/daaw/ae1$c;->c:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, p1, Lcom/daaw/ae1$c;->c:Z

    invoke-virtual {p0, p1}, Lcom/daaw/ae1;->g(Lcom/daaw/ae1$c;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final g(Lcom/daaw/ae1$c;)V
    .locals 4

    iget v0, p1, Lcom/daaw/ae1$c;->b:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    const/16 v1, 0xabe

    if-lez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, -0x1

    if-ne v0, v2, :cond_2

    const/16 v0, 0x5dc

    goto :goto_0

    :cond_2
    const/16 v0, 0xabe

    :goto_0
    iget-object v1, p0, Lcom/daaw/ae1;->b:Landroid/os/Handler;

    invoke-virtual {v1, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/daaw/ae1;->b:Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-static {v1, v2, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    int-to-long v2, v0

    invoke-virtual {v1, p1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method
