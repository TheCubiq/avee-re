.class public final Lcom/daaw/z81;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g00;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/g00<",
        "Lcom/daaw/py1;",
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
            "Lcom/daaw/ly;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/daaw/a01;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/a01<",
            "Lcom/daaw/s81;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lcom/daaw/a01;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/a01<",
            "Lcom/daaw/cg;",
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
            "Landroid/content/Context;",
            ">;",
            "Lcom/daaw/a01<",
            "Lcom/daaw/ly;",
            ">;",
            "Lcom/daaw/a01<",
            "Lcom/daaw/s81;",
            ">;",
            "Lcom/daaw/a01<",
            "Lcom/daaw/cg;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/z81;->a:Lcom/daaw/a01;

    iput-object p2, p0, Lcom/daaw/z81;->b:Lcom/daaw/a01;

    iput-object p3, p0, Lcom/daaw/z81;->c:Lcom/daaw/a01;

    iput-object p4, p0, Lcom/daaw/z81;->d:Lcom/daaw/a01;

    return-void
.end method

.method public static a(Lcom/daaw/a01;Lcom/daaw/a01;Lcom/daaw/a01;Lcom/daaw/a01;)Lcom/daaw/z81;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/a01<",
            "Landroid/content/Context;",
            ">;",
            "Lcom/daaw/a01<",
            "Lcom/daaw/ly;",
            ">;",
            "Lcom/daaw/a01<",
            "Lcom/daaw/s81;",
            ">;",
            "Lcom/daaw/a01<",
            "Lcom/daaw/cg;",
            ">;)",
            "Lcom/daaw/z81;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/z81;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/daaw/z81;-><init>(Lcom/daaw/a01;Lcom/daaw/a01;Lcom/daaw/a01;Lcom/daaw/a01;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lcom/daaw/ly;Lcom/daaw/s81;Lcom/daaw/cg;)Lcom/daaw/py1;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/daaw/y81;->a(Landroid/content/Context;Lcom/daaw/ly;Lcom/daaw/s81;Lcom/daaw/cg;)Lcom/daaw/py1;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, p1}, Lcom/daaw/qy0;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/py1;

    return-object p0
.end method


# virtual methods
.method public b()Lcom/daaw/py1;
    .locals 4

    iget-object v0, p0, Lcom/daaw/z81;->a:Lcom/daaw/a01;

    invoke-interface {v0}, Lcom/daaw/a01;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcom/daaw/z81;->b:Lcom/daaw/a01;

    invoke-interface {v1}, Lcom/daaw/a01;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/ly;

    iget-object v2, p0, Lcom/daaw/z81;->c:Lcom/daaw/a01;

    invoke-interface {v2}, Lcom/daaw/a01;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/s81;

    iget-object v3, p0, Lcom/daaw/z81;->d:Lcom/daaw/a01;

    invoke-interface {v3}, Lcom/daaw/a01;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/cg;

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/z81;->c(Landroid/content/Context;Lcom/daaw/ly;Lcom/daaw/s81;Lcom/daaw/cg;)Lcom/daaw/py1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/z81;->b()Lcom/daaw/py1;

    move-result-object v0

    return-object v0
.end method
