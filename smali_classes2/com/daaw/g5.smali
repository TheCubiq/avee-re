.class public Lcom/daaw/g5;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/g5$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/gk5;


# direct methods
.method public constructor <init>(Lcom/daaw/gk5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/g5;->a:Lcom/daaw/gk5;

    return-void
.end method

.method public static k(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/daaw/g5;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/daaw/gk5;->u(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/daaw/gk5;

    move-result-object p0

    invoke-virtual {p0}, Lcom/daaw/gk5;->r()Lcom/daaw/g5;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/g5;->a:Lcom/daaw/gk5;

    invoke-virtual {v0, p1}, Lcom/daaw/gk5;->G(Ljava/lang/String;)V

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/g5;->a:Lcom/daaw/gk5;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/gk5;->H(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/g5;->a:Lcom/daaw/gk5;

    invoke-virtual {v0, p1}, Lcom/daaw/gk5;->I(Ljava/lang/String;)V

    return-void
.end method

.method public d()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/g5;->a:Lcom/daaw/gk5;

    invoke-virtual {v0}, Lcom/daaw/gk5;->p()J

    move-result-wide v0

    return-wide v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/g5;->a:Lcom/daaw/gk5;

    invoke-virtual {v0}, Lcom/daaw/gk5;->w()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/g5;->a:Lcom/daaw/gk5;

    invoke-virtual {v0}, Lcom/daaw/gk5;->x()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/g5;->a:Lcom/daaw/gk5;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/gk5;->B(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/g5;->a:Lcom/daaw/gk5;

    invoke-virtual {v0}, Lcom/daaw/gk5;->y()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/g5;->a:Lcom/daaw/gk5;

    invoke-virtual {v0}, Lcom/daaw/gk5;->z()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/g5;->a:Lcom/daaw/gk5;

    invoke-virtual {v0}, Lcom/daaw/gk5;->A()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public l(Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/g5;->a:Lcom/daaw/gk5;

    invoke-virtual {v0, p1}, Lcom/daaw/gk5;->o(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public m(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/g5;->a:Lcom/daaw/gk5;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/gk5;->C(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public n(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/g5;->a:Lcom/daaw/gk5;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/gk5;->J(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public o(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/g5;->a:Lcom/daaw/gk5;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/daaw/gk5;->q(Landroid/os/Bundle;Z)Landroid/os/Bundle;

    return-void
.end method

.method public p(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 2

    iget-object v0, p0, Lcom/daaw/g5;->a:Lcom/daaw/gk5;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/daaw/gk5;->q(Landroid/os/Bundle;Z)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method public q(Lcom/daaw/g5$a;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/g5;->a:Lcom/daaw/gk5;

    invoke-virtual {v0, p1}, Lcom/daaw/gk5;->b(Lcom/daaw/pl7;)V

    return-void
.end method

.method public r(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/g5;->a:Lcom/daaw/gk5;

    invoke-virtual {v0, p1}, Lcom/daaw/gk5;->c(Landroid/os/Bundle;)V

    return-void
.end method

.method public s(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/g5;->a:Lcom/daaw/gk5;

    invoke-virtual {v0, p1}, Lcom/daaw/gk5;->d(Landroid/os/Bundle;)V

    return-void
.end method

.method public t(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/g5;->a:Lcom/daaw/gk5;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/gk5;->e(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/g5;->a:Lcom/daaw/gk5;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/daaw/gk5;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    return-void
.end method

.method public final v(Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/g5;->a:Lcom/daaw/gk5;

    invoke-virtual {v0, p1}, Lcom/daaw/gk5;->f(Z)V

    return-void
.end method
