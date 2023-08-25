.class public final Lcom/daaw/g22;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/g6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/g6<",
            "Lcom/daaw/o3<",
            "*>;",
            "Lcom/google/android/gms/common/ConnectionResult;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/daaw/g6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/g6<",
            "Lcom/daaw/o3<",
            "*>;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/daaw/tj1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/tj1<",
            "Ljava/util/Map<",
            "Lcom/daaw/o3<",
            "*>;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public d:I

.field public e:Z


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/daaw/o3<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/g22;->a:Lcom/daaw/g6;

    invoke-virtual {v0}, Lcom/daaw/g6;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lcom/daaw/o3;Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/o3<",
            "*>;",
            "Lcom/google/android/gms/common/ConnectionResult;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/g22;->a:Lcom/daaw/g6;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/cd1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/g22;->b:Lcom/daaw/g6;

    invoke-virtual {v0, p1, p3}, Lcom/daaw/cd1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget p1, p0, Lcom/daaw/g22;->d:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/daaw/g22;->d:I

    invoke-virtual {p2}, Lcom/google/android/gms/common/ConnectionResult;->u()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/g22;->e:Z

    :cond_0
    iget p1, p0, Lcom/daaw/g22;->d:I

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lcom/daaw/g22;->e:Z

    if-eqz p1, :cond_1

    new-instance p1, Lcom/daaw/x9;

    iget-object p2, p0, Lcom/daaw/g22;->a:Lcom/daaw/g6;

    invoke-direct {p1, p2}, Lcom/daaw/x9;-><init>(Lcom/daaw/g6;)V

    iget-object p2, p0, Lcom/daaw/g22;->c:Lcom/daaw/tj1;

    invoke-virtual {p2, p1}, Lcom/daaw/tj1;->b(Ljava/lang/Exception;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/daaw/g22;->c:Lcom/daaw/tj1;

    iget-object p2, p0, Lcom/daaw/g22;->b:Lcom/daaw/g6;

    invoke-virtual {p1, p2}, Lcom/daaw/tj1;->c(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
