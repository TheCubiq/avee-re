.class public final Lcom/daaw/jm6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/util/List;

.field public final synthetic c:Lcom/daaw/wm6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/wm6;Ljava/lang/Object;Ljava/util/List;Lcom/daaw/im6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/jm6;->c:Lcom/daaw/wm6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/jm6;->a:Ljava/lang/Object;

    iput-object p3, p0, Lcom/daaw/jm6;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/Callable;)Lcom/daaw/vm6;
    .locals 11

    iget-object v0, p0, Lcom/daaw/jm6;->b:Ljava/util/List;

    invoke-static {v0}, Lcom/daaw/s67;->c(Ljava/lang/Iterable;)Lcom/daaw/r67;

    move-result-object v0

    sget-object v1, Lcom/daaw/hm6;->a:Lcom/daaw/hm6;

    sget-object v2, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/r67;->a(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v7

    new-instance v1, Lcom/daaw/vm6;

    iget-object v4, p0, Lcom/daaw/jm6;->c:Lcom/daaw/wm6;

    iget-object v5, p0, Lcom/daaw/jm6;->a:Ljava/lang/Object;

    iget-object v8, p0, Lcom/daaw/jm6;->b:Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/wm6;->e(Lcom/daaw/wm6;)Lcom/daaw/g77;

    move-result-object v2

    invoke-virtual {v0, p1, v2}, Lcom/daaw/r67;->a(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v9

    const/4 v6, 0x0

    const/4 v10, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v10}, Lcom/daaw/vm6;-><init>(Lcom/daaw/wm6;Ljava/lang/Object;Ljava/lang/String;Lcom/daaw/f77;Ljava/util/List;Lcom/daaw/f77;Lcom/daaw/rm6;)V

    return-object v1
.end method
