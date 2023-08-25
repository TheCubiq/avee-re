.class public final Lcom/google/android/gms/ads/internal/util/zzbn;
.super Lcom/daaw/qf2;
.source ""


# instance fields
.field public final B:Lcom/daaw/e14;

.field public final C:Lcom/daaw/j04;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Lcom/daaw/e14;)V
    .locals 1

    new-instance p2, Lcom/daaw/fc3;

    invoke-direct {p2, p3}, Lcom/daaw/fc3;-><init>(Lcom/daaw/e14;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lcom/daaw/qf2;-><init>(ILjava/lang/String;Lcom/daaw/uf2;)V

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/util/zzbn;->B:Lcom/daaw/e14;

    new-instance p2, Lcom/daaw/j04;

    const/4 p3, 0x0

    invoke-direct {p2, p3}, Lcom/daaw/j04;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/util/zzbn;->C:Lcom/daaw/j04;

    const-string v0, "GET"

    invoke-virtual {p2, p1, v0, p3, p3}, Lcom/daaw/j04;->d(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[B)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/mf2;)Lcom/daaw/wf2;
    .locals 1

    invoke-static {p1}, Lcom/daaw/sg2;->b(Lcom/daaw/mf2;)Lcom/daaw/ve2;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/daaw/wf2;->b(Ljava/lang/Object;Lcom/daaw/ve2;)Lcom/daaw/wf2;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lcom/daaw/mf2;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/util/zzbn;->C:Lcom/daaw/j04;

    iget-object v1, p1, Lcom/daaw/mf2;->c:Ljava/util/Map;

    iget v2, p1, Lcom/daaw/mf2;->a:I

    invoke-virtual {v0, v1, v2}, Lcom/daaw/j04;->f(Ljava/util/Map;I)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/util/zzbn;->C:Lcom/daaw/j04;

    iget-object v1, p1, Lcom/daaw/mf2;->b:[B

    invoke-static {}, Lcom/daaw/j04;->l()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Lcom/daaw/j04;->h([B)V

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/util/zzbn;->B:Lcom/daaw/e14;

    invoke-virtual {v0, p1}, Lcom/daaw/e14;->b(Ljava/lang/Object;)Z

    return-void
.end method
