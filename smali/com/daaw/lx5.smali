.class public final Lcom/daaw/lx5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/concurrent/ConcurrentHashMap;

.field public final b:Lcom/daaw/ya5;


# direct methods
.method public constructor <init>(Lcom/daaw/ya5;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/lx5;->a:Ljava/util/concurrent/ConcurrentHashMap;

    iput-object p1, p0, Lcom/daaw/lx5;->b:Lcom/daaw/ya5;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/daaw/dp3;
    .locals 1
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation

    iget-object v0, p0, Lcom/daaw/lx5;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/lx5;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/dp3;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/lx5;->b:Lcom/daaw/ya5;

    invoke-virtual {v0, p1}, Lcom/daaw/ya5;->b(Ljava/lang/String;)Lcom/daaw/dp3;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/lx5;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Couldn\'t create RTB adapter : "

    invoke-static {v0, p1}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
