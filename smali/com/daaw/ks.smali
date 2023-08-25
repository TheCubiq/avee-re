.class public final synthetic Lcom/daaw/ks;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/us;

.field public final synthetic b:Ljava/util/concurrent/Callable;

.field public final synthetic c:Lcom/daaw/vs$b;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/us;Ljava/util/concurrent/Callable;Lcom/daaw/vs$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ks;->a:Lcom/daaw/us;

    iput-object p2, p0, Lcom/daaw/ks;->b:Ljava/util/concurrent/Callable;

    iput-object p3, p0, Lcom/daaw/ks;->c:Lcom/daaw/vs$b;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/ks;->a:Lcom/daaw/us;

    iget-object v1, p0, Lcom/daaw/ks;->b:Ljava/util/concurrent/Callable;

    iget-object v2, p0, Lcom/daaw/ks;->c:Lcom/daaw/vs$b;

    invoke-static {v0, v1, v2}, Lcom/daaw/us;->d(Lcom/daaw/us;Ljava/util/concurrent/Callable;Lcom/daaw/vs$b;)Ljava/util/concurrent/Future;

    move-result-object v0

    return-object v0
.end method
