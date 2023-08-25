.class public final Lcom/daaw/gn;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g00;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/g00<",
        "Lcom/daaw/fn;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/a01;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/a01<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/daaw/a01;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/a01<",
            "Lcom/daaw/cg;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/daaw/a01;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/a01<",
            "Lcom/daaw/cg;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/a01;Lcom/daaw/a01;Lcom/daaw/a01;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/a01<",
            "Landroid/content/Context;",
            ">;",
            "Lcom/daaw/a01<",
            "Lcom/daaw/cg;",
            ">;",
            "Lcom/daaw/a01<",
            "Lcom/daaw/cg;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/gn;->a:Lcom/daaw/a01;

    iput-object p2, p0, Lcom/daaw/gn;->b:Lcom/daaw/a01;

    iput-object p3, p0, Lcom/daaw/gn;->c:Lcom/daaw/a01;

    return-void
.end method

.method public static a(Lcom/daaw/a01;Lcom/daaw/a01;Lcom/daaw/a01;)Lcom/daaw/gn;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/a01<",
            "Landroid/content/Context;",
            ">;",
            "Lcom/daaw/a01<",
            "Lcom/daaw/cg;",
            ">;",
            "Lcom/daaw/a01<",
            "Lcom/daaw/cg;",
            ">;)",
            "Lcom/daaw/gn;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/gn;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/gn;-><init>(Lcom/daaw/a01;Lcom/daaw/a01;Lcom/daaw/a01;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lcom/daaw/cg;Lcom/daaw/cg;)Lcom/daaw/fn;
    .locals 1

    new-instance v0, Lcom/daaw/fn;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/fn;-><init>(Landroid/content/Context;Lcom/daaw/cg;Lcom/daaw/cg;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/daaw/fn;
    .locals 3

    iget-object v0, p0, Lcom/daaw/gn;->a:Lcom/daaw/a01;

    invoke-interface {v0}, Lcom/daaw/a01;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcom/daaw/gn;->b:Lcom/daaw/a01;

    invoke-interface {v1}, Lcom/daaw/a01;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/cg;

    iget-object v2, p0, Lcom/daaw/gn;->c:Lcom/daaw/a01;

    invoke-interface {v2}, Lcom/daaw/a01;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/cg;

    invoke-static {v0, v1, v2}, Lcom/daaw/gn;->c(Landroid/content/Context;Lcom/daaw/cg;Lcom/daaw/cg;)Lcom/daaw/fn;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/gn;->b()Lcom/daaw/fn;

    move-result-object v0

    return-object v0
.end method
