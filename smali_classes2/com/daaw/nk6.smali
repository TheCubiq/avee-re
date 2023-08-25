.class public final Lcom/daaw/nk6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field public final a:Ljava/lang/String;

.field public final synthetic b:Lcom/daaw/vn6;


# direct methods
.method public constructor <init>(Lcom/daaw/vn6;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/nk6;->b:Lcom/daaw/vn6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Lcom/daaw/nk6;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final declared-synchronized uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lcom/daaw/nk6;->b:Lcom/daaw/vn6;

    iget-object p1, p1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p1}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/nk6;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, p2}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
