.class public final Lcom/daaw/qp0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g00;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/g00<",
        "Lcom/daaw/pp0;",
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
            "Lcom/daaw/fn;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/a01;Lcom/daaw/a01;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/a01<",
            "Landroid/content/Context;",
            ">;",
            "Lcom/daaw/a01<",
            "Lcom/daaw/fn;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/qp0;->a:Lcom/daaw/a01;

    iput-object p2, p0, Lcom/daaw/qp0;->b:Lcom/daaw/a01;

    return-void
.end method

.method public static a(Lcom/daaw/a01;Lcom/daaw/a01;)Lcom/daaw/qp0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/a01<",
            "Landroid/content/Context;",
            ">;",
            "Lcom/daaw/a01<",
            "Lcom/daaw/fn;",
            ">;)",
            "Lcom/daaw/qp0;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/qp0;

    invoke-direct {v0, p0, p1}, Lcom/daaw/qp0;-><init>(Lcom/daaw/a01;Lcom/daaw/a01;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/Object;)Lcom/daaw/pp0;
    .locals 1

    new-instance v0, Lcom/daaw/pp0;

    check-cast p1, Lcom/daaw/fn;

    invoke-direct {v0, p0, p1}, Lcom/daaw/pp0;-><init>(Landroid/content/Context;Lcom/daaw/fn;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/daaw/pp0;
    .locals 2

    iget-object v0, p0, Lcom/daaw/qp0;->a:Lcom/daaw/a01;

    invoke-interface {v0}, Lcom/daaw/a01;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcom/daaw/qp0;->b:Lcom/daaw/a01;

    invoke-interface {v1}, Lcom/daaw/a01;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/daaw/qp0;->c(Landroid/content/Context;Ljava/lang/Object;)Lcom/daaw/pp0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/qp0;->b()Lcom/daaw/pp0;

    move-result-object v0

    return-object v0
.end method
