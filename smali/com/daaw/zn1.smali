.class public final Lcom/daaw/zn1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g00;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/g00<",
        "Lcom/daaw/xn1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/a01;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/a01<",
            "Lcom/daaw/cg;",
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
            "Lcom/daaw/q81;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lcom/daaw/a01;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/a01<",
            "Lcom/daaw/eq1;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lcom/daaw/a01;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/a01<",
            "Lcom/daaw/by1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/a01;Lcom/daaw/a01;Lcom/daaw/a01;Lcom/daaw/a01;Lcom/daaw/a01;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/a01<",
            "Lcom/daaw/cg;",
            ">;",
            "Lcom/daaw/a01<",
            "Lcom/daaw/cg;",
            ">;",
            "Lcom/daaw/a01<",
            "Lcom/daaw/q81;",
            ">;",
            "Lcom/daaw/a01<",
            "Lcom/daaw/eq1;",
            ">;",
            "Lcom/daaw/a01<",
            "Lcom/daaw/by1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/zn1;->a:Lcom/daaw/a01;

    iput-object p2, p0, Lcom/daaw/zn1;->b:Lcom/daaw/a01;

    iput-object p3, p0, Lcom/daaw/zn1;->c:Lcom/daaw/a01;

    iput-object p4, p0, Lcom/daaw/zn1;->d:Lcom/daaw/a01;

    iput-object p5, p0, Lcom/daaw/zn1;->e:Lcom/daaw/a01;

    return-void
.end method

.method public static a(Lcom/daaw/a01;Lcom/daaw/a01;Lcom/daaw/a01;Lcom/daaw/a01;Lcom/daaw/a01;)Lcom/daaw/zn1;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/a01<",
            "Lcom/daaw/cg;",
            ">;",
            "Lcom/daaw/a01<",
            "Lcom/daaw/cg;",
            ">;",
            "Lcom/daaw/a01<",
            "Lcom/daaw/q81;",
            ">;",
            "Lcom/daaw/a01<",
            "Lcom/daaw/eq1;",
            ">;",
            "Lcom/daaw/a01<",
            "Lcom/daaw/by1;",
            ">;)",
            "Lcom/daaw/zn1;"
        }
    .end annotation

    new-instance v6, Lcom/daaw/zn1;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/daaw/zn1;-><init>(Lcom/daaw/a01;Lcom/daaw/a01;Lcom/daaw/a01;Lcom/daaw/a01;Lcom/daaw/a01;)V

    return-object v6
.end method

.method public static c(Lcom/daaw/cg;Lcom/daaw/cg;Lcom/daaw/q81;Lcom/daaw/eq1;Lcom/daaw/by1;)Lcom/daaw/xn1;
    .locals 7

    new-instance v6, Lcom/daaw/xn1;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/daaw/xn1;-><init>(Lcom/daaw/cg;Lcom/daaw/cg;Lcom/daaw/q81;Lcom/daaw/eq1;Lcom/daaw/by1;)V

    return-object v6
.end method


# virtual methods
.method public b()Lcom/daaw/xn1;
    .locals 5

    iget-object v0, p0, Lcom/daaw/zn1;->a:Lcom/daaw/a01;

    invoke-interface {v0}, Lcom/daaw/a01;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/cg;

    iget-object v1, p0, Lcom/daaw/zn1;->b:Lcom/daaw/a01;

    invoke-interface {v1}, Lcom/daaw/a01;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/cg;

    iget-object v2, p0, Lcom/daaw/zn1;->c:Lcom/daaw/a01;

    invoke-interface {v2}, Lcom/daaw/a01;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/q81;

    iget-object v3, p0, Lcom/daaw/zn1;->d:Lcom/daaw/a01;

    invoke-interface {v3}, Lcom/daaw/a01;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/eq1;

    iget-object v4, p0, Lcom/daaw/zn1;->e:Lcom/daaw/a01;

    invoke-interface {v4}, Lcom/daaw/a01;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/by1;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/daaw/zn1;->c(Lcom/daaw/cg;Lcom/daaw/cg;Lcom/daaw/q81;Lcom/daaw/eq1;Lcom/daaw/by1;)Lcom/daaw/xn1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/zn1;->b()Lcom/daaw/xn1;

    move-result-object v0

    return-object v0
.end method
