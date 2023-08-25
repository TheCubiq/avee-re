.class public final Lcom/daaw/ln6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Lcom/daaw/p04;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lcom/daaw/p04;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ln6;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/daaw/ln6;->b:Lcom/daaw/p04;

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ln6;->b:Lcom/daaw/p04;

    invoke-virtual {v0, p1}, Lcom/daaw/p04;->zza(Ljava/lang/String;)Z

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ln6;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/daaw/kn6;

    invoke-direct {v1, p0, p1}, Lcom/daaw/kn6;-><init>(Lcom/daaw/ln6;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
