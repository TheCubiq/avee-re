.class public final Lcom/daaw/y12;
.super Lcom/daaw/m12;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/m12<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final c:Lcom/daaw/gk0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/gk0<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/gk0;Lcom/daaw/tj1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/gk0<",
            "*>;",
            "Lcom/daaw/tj1<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x4

    invoke-direct {p0, v0, p2}, Lcom/daaw/m12;-><init>(ILcom/daaw/tj1;)V

    iput-object p1, p0, Lcom/daaw/y12;->c:Lcom/daaw/gk0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic d(Lcom/daaw/tz1;Z)V
    .locals 0

    return-void
.end method

.method public final f(Lcom/daaw/i02;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/i02<",
            "*>;)Z"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/daaw/i02;->u()Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/y12;->c:Lcom/daaw/gk0;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/b12;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x0

    throw p1
.end method

.method public final g(Lcom/daaw/i02;)[Lcom/google/android/gms/common/Feature;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/i02<",
            "*>;)[",
            "Lcom/google/android/gms/common/Feature;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/daaw/i02;->u()Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/y12;->c:Lcom/daaw/gk0;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/b12;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    throw v0
.end method

.method public final h(Lcom/daaw/i02;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/i02<",
            "*>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/daaw/i02;->u()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/y12;->c:Lcom/daaw/gk0;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/b12;

    if-nez v0, :cond_0

    iget-object p1, p0, Lcom/daaw/m12;->b:Lcom/daaw/tj1;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lcom/daaw/tj1;->e(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/i02;->s()Lcom/daaw/k3$f;

    const/4 p1, 0x0

    throw p1
.end method
