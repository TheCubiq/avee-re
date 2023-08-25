.class public final Lcom/daaw/s33;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pa$b;


# instance fields
.field public final synthetic a:Lcom/daaw/e14;

.field public final synthetic b:Lcom/daaw/t33;


# direct methods
.method public constructor <init>(Lcom/daaw/t33;Lcom/daaw/e14;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/s33;->b:Lcom/daaw/t33;

    iput-object p2, p0, Lcom/daaw/s33;->a:Lcom/daaw/e14;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final I(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 3

    iget-object p1, p0, Lcom/daaw/s33;->b:Lcom/daaw/t33;

    invoke-static {p1}, Lcom/daaw/t33;->b(Lcom/daaw/t33;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/s33;->a:Lcom/daaw/e14;

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Connection failed."

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
