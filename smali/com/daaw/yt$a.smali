.class public Lcom/daaw/yt$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/yt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/yt;


# direct methods
.method public constructor <init>(Lcom/daaw/yt;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yt$a;->a:Lcom/daaw/yt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 4

    iget-object v0, p0, Lcom/daaw/yt$a;->a:Lcom/daaw/yt;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/yt$a;->a:Lcom/daaw/yt;

    invoke-static {v1}, Lcom/daaw/yt;->d(Lcom/daaw/yt;)Ljava/io/Writer;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    monitor-exit v0

    return-object v2

    :cond_0
    iget-object v1, p0, Lcom/daaw/yt$a;->a:Lcom/daaw/yt;

    invoke-static {v1}, Lcom/daaw/yt;->n(Lcom/daaw/yt;)V

    iget-object v1, p0, Lcom/daaw/yt$a;->a:Lcom/daaw/yt;

    invoke-static {v1}, Lcom/daaw/yt;->w(Lcom/daaw/yt;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/yt$a;->a:Lcom/daaw/yt;

    invoke-static {v1}, Lcom/daaw/yt;->E(Lcom/daaw/yt;)V

    iget-object v1, p0, Lcom/daaw/yt$a;->a:Lcom/daaw/yt;

    const/4 v3, 0x0

    invoke-static {v1, v3}, Lcom/daaw/yt;->K(Lcom/daaw/yt;I)I

    :cond_1
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/yt$a;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
