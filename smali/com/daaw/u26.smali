.class public final Lcom/daaw/u26;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;

.field public final b:Lcom/daaw/ag;

.field public final c:Lcom/daaw/i76;

.field public final d:J


# direct methods
.method public constructor <init>(Lcom/daaw/i76;JLcom/daaw/ag;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lcom/daaw/u26;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p4, p0, Lcom/daaw/u26;->b:Lcom/daaw/ag;

    iput-object p1, p0, Lcom/daaw/u26;->c:Lcom/daaw/i76;

    iput-wide p2, p0, Lcom/daaw/u26;->d:J

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    const/16 v0, 0x10

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 5

    iget-object v0, p0, Lcom/daaw/u26;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/t26;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/t26;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    new-instance v0, Lcom/daaw/t26;

    iget-object v1, p0, Lcom/daaw/u26;->c:Lcom/daaw/i76;

    invoke-interface {v1}, Lcom/daaw/i76;->zzb()Lcom/daaw/f77;

    move-result-object v1

    iget-wide v2, p0, Lcom/daaw/u26;->d:J

    iget-object v4, p0, Lcom/daaw/u26;->b:Lcom/daaw/ag;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/daaw/t26;-><init>(Lcom/daaw/f77;JLcom/daaw/ag;)V

    iget-object v1, p0, Lcom/daaw/u26;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    :cond_1
    iget-object v0, v0, Lcom/daaw/t26;->a:Lcom/daaw/f77;

    return-object v0
.end method
