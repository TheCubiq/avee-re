.class public final Lcom/daaw/cy1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g00;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/g00<",
        "Lcom/daaw/by1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/a01;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/a01<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/daaw/a01;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/a01<",
            "Lcom/daaw/ly;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/daaw/a01;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/a01<",
            "Lcom/daaw/py1;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lcom/daaw/a01;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/a01<",
            "Lcom/daaw/ri1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/a01;Lcom/daaw/a01;Lcom/daaw/a01;Lcom/daaw/a01;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/a01<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lcom/daaw/a01<",
            "Lcom/daaw/ly;",
            ">;",
            "Lcom/daaw/a01<",
            "Lcom/daaw/py1;",
            ">;",
            "Lcom/daaw/a01<",
            "Lcom/daaw/ri1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/cy1;->a:Lcom/daaw/a01;

    iput-object p2, p0, Lcom/daaw/cy1;->b:Lcom/daaw/a01;

    iput-object p3, p0, Lcom/daaw/cy1;->c:Lcom/daaw/a01;

    iput-object p4, p0, Lcom/daaw/cy1;->d:Lcom/daaw/a01;

    return-void
.end method

.method public static a(Lcom/daaw/a01;Lcom/daaw/a01;Lcom/daaw/a01;Lcom/daaw/a01;)Lcom/daaw/cy1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/a01<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lcom/daaw/a01<",
            "Lcom/daaw/ly;",
            ">;",
            "Lcom/daaw/a01<",
            "Lcom/daaw/py1;",
            ">;",
            "Lcom/daaw/a01<",
            "Lcom/daaw/ri1;",
            ">;)",
            "Lcom/daaw/cy1;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/cy1;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/daaw/cy1;-><init>(Lcom/daaw/a01;Lcom/daaw/a01;Lcom/daaw/a01;Lcom/daaw/a01;)V

    return-object v0
.end method

.method public static c(Ljava/util/concurrent/Executor;Lcom/daaw/ly;Lcom/daaw/py1;Lcom/daaw/ri1;)Lcom/daaw/by1;
    .locals 1

    new-instance v0, Lcom/daaw/by1;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/daaw/by1;-><init>(Ljava/util/concurrent/Executor;Lcom/daaw/ly;Lcom/daaw/py1;Lcom/daaw/ri1;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/daaw/by1;
    .locals 4

    iget-object v0, p0, Lcom/daaw/cy1;->a:Lcom/daaw/a01;

    invoke-interface {v0}, Lcom/daaw/a01;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lcom/daaw/cy1;->b:Lcom/daaw/a01;

    invoke-interface {v1}, Lcom/daaw/a01;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/ly;

    iget-object v2, p0, Lcom/daaw/cy1;->c:Lcom/daaw/a01;

    invoke-interface {v2}, Lcom/daaw/a01;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/py1;

    iget-object v3, p0, Lcom/daaw/cy1;->d:Lcom/daaw/a01;

    invoke-interface {v3}, Lcom/daaw/a01;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/ri1;

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/cy1;->c(Ljava/util/concurrent/Executor;Lcom/daaw/ly;Lcom/daaw/py1;Lcom/daaw/ri1;)Lcom/daaw/by1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/cy1;->b()Lcom/daaw/by1;

    move-result-object v0

    return-object v0
.end method
