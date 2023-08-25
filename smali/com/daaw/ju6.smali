.class public final Lcom/daaw/ju6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:[B

.field public b:I

.field public c:I

.field public final synthetic d:Lcom/daaw/ku6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ku6;[BLcom/daaw/fu6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ju6;->d:Lcom/daaw/ku6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/ju6;->a:[B

    return-void
.end method


# virtual methods
.method public final a(I)Lcom/daaw/ju6;
    .locals 0

    iput p1, p0, Lcom/daaw/ju6;->c:I

    return-object p0
.end method

.method public final b(I)Lcom/daaw/ju6;
    .locals 0

    iput p1, p0, Lcom/daaw/ju6;->b:I

    return-object p0
.end method

.method public final declared-synchronized c()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ju6;->d:Lcom/daaw/ku6;

    iget-boolean v1, v0, Lcom/daaw/ku6;->b:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Lcom/daaw/ku6;->a:Lcom/daaw/nu6;

    iget-object v1, p0, Lcom/daaw/ju6;->a:[B

    invoke-interface {v0, v1}, Lcom/daaw/nu6;->w([B)V

    iget-object v0, p0, Lcom/daaw/ju6;->d:Lcom/daaw/ku6;

    iget-object v0, v0, Lcom/daaw/ku6;->a:Lcom/daaw/nu6;

    iget v1, p0, Lcom/daaw/ju6;->b:I

    invoke-interface {v0, v1}, Lcom/daaw/nu6;->C(I)V

    iget-object v0, p0, Lcom/daaw/ju6;->d:Lcom/daaw/ku6;

    iget-object v0, v0, Lcom/daaw/ku6;->a:Lcom/daaw/nu6;

    iget v1, p0, Lcom/daaw/ju6;->c:I

    invoke-interface {v0, v1}, Lcom/daaw/nu6;->c(I)V

    iget-object v0, p0, Lcom/daaw/ju6;->d:Lcom/daaw/ku6;

    iget-object v0, v0, Lcom/daaw/ku6;->a:Lcom/daaw/nu6;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/daaw/nu6;->E([I)V

    iget-object v0, p0, Lcom/daaw/ju6;->d:Lcom/daaw/ku6;

    iget-object v0, v0, Lcom/daaw/ku6;->a:Lcom/daaw/nu6;

    invoke-interface {v0}, Lcom/daaw/nu6;->zzf()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :catch_0
    monitor-exit p0

    return-void
.end method
