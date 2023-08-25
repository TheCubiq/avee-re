.class public final Lcom/daaw/nz3;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source ""


# instance fields
.field public final synthetic a:Lcom/daaw/qz3;


# direct methods
.method public constructor <init>(Lcom/daaw/qz3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/nz3;->a:Lcom/daaw/qz3;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAvailable(Landroid/net/Network;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/nz3;->a:Lcom/daaw/qz3;

    invoke-static {p1}, Lcom/daaw/qz3;->o(Lcom/daaw/qz3;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public final onLost(Landroid/net/Network;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/nz3;->a:Lcom/daaw/qz3;

    invoke-static {p1}, Lcom/daaw/qz3;->o(Lcom/daaw/qz3;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method
