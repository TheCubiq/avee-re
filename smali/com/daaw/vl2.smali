.class public final Lcom/daaw/vl2;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source ""


# instance fields
.field public final synthetic a:Lcom/daaw/wl2;


# direct methods
.method public constructor <init>(Lcom/daaw/wl2;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/vl2;->a:Lcom/daaw/wl2;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 1

    const-class p1, Lcom/daaw/wl2;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/vl2;->a:Lcom/daaw/wl2;

    invoke-static {v0, p2}, Lcom/daaw/wl2;->d(Lcom/daaw/wl2;Landroid/net/NetworkCapabilities;)V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final onLost(Landroid/net/Network;)V
    .locals 2

    const-class p1, Lcom/daaw/wl2;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/vl2;->a:Lcom/daaw/wl2;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/wl2;->d(Lcom/daaw/wl2;Landroid/net/NetworkCapabilities;)V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
