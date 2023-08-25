.class public final Lcom/daaw/j92;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/c82;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/c82<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:I

.field public final c:Lcom/daaw/dw8;

.field public d:I
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field public e:I
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field public f:I
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field public g:Ljava/lang/Exception;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field public h:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILcom/daaw/dw8;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/j92;->a:Ljava/lang/Object;

    iput p1, p0, Lcom/daaw/j92;->b:I

    iput-object p2, p0, Lcom/daaw/j92;->c:Lcom/daaw/dw8;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation

    iget v0, p0, Lcom/daaw/j92;->d:I

    iget v1, p0, Lcom/daaw/j92;->e:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/daaw/j92;->f:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/daaw/j92;->b:I

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/daaw/j92;->g:Ljava/lang/Exception;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/j92;->c:Lcom/daaw/dw8;

    new-instance v1, Ljava/util/concurrent/ExecutionException;

    iget v2, p0, Lcom/daaw/j92;->e:I

    iget v3, p0, Lcom/daaw/j92;->b:I

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " out of "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " underlying tasks failed"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/j92;->g:Ljava/lang/Exception;

    invoke-direct {v1, v2, v3}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lcom/daaw/dw8;->q(Ljava/lang/Exception;)V

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/j92;->h:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/j92;->c:Lcom/daaw/dw8;

    invoke-virtual {v0}, Lcom/daaw/dw8;->s()Z

    return-void

    :cond_1
    iget-object v0, p0, Lcom/daaw/j92;->c:Lcom/daaw/dw8;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/dw8;->r(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/j92;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/daaw/j92;->f:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Lcom/daaw/j92;->f:I

    iput-boolean v2, p0, Lcom/daaw/j92;->h:Z

    invoke-virtual {p0}, Lcom/daaw/j92;->a()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final c(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/j92;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/daaw/j92;->e:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/daaw/j92;->e:I

    iput-object p1, p0, Lcom/daaw/j92;->g:Ljava/lang/Exception;

    invoke-virtual {p0}, Lcom/daaw/j92;->a()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/daaw/j92;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget v0, p0, Lcom/daaw/j92;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/j92;->d:I

    invoke-virtual {p0}, Lcom/daaw/j92;->a()V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
