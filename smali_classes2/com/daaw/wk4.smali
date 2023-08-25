.class public final Lcom/daaw/wk4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qo8;


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Lcom/daaw/hl;

.field public final c:Lcom/daaw/dw8;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lcom/daaw/hl;Lcom/daaw/dw8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/wk4;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/daaw/wk4;->b:Lcom/daaw/hl;

    iput-object p3, p0, Lcom/daaw/wk4;->c:Lcom/daaw/dw8;

    return-void
.end method

.method public static bridge synthetic b(Lcom/daaw/wk4;)Lcom/daaw/hl;
    .locals 0

    iget-object p0, p0, Lcom/daaw/wk4;->b:Lcom/daaw/hl;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/daaw/wk4;)Lcom/daaw/dw8;
    .locals 0

    iget-object p0, p0, Lcom/daaw/wk4;->c:Lcom/daaw/dw8;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/daaw/rj1;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/wk4;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/daaw/xr3;

    invoke-direct {v1, p0, p1}, Lcom/daaw/xr3;-><init>(Lcom/daaw/wk4;Lcom/daaw/rj1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
