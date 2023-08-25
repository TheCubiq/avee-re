.class public final Lcom/daaw/ll3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wj3;
.implements Lcom/daaw/kl3;


# instance fields
.field public final p:Lcom/daaw/kl3;

.field public final q:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Lcom/daaw/kl3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ll3;->p:Lcom/daaw/kl3;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/daaw/ll3;->q:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final B0(Ljava/lang/String;Lcom/daaw/zg3;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ll3;->p:Lcom/daaw/kl3;

    invoke-interface {v0, p1, p2}, Lcom/daaw/kl3;->B0(Ljava/lang/String;Lcom/daaw/zg3;)V

    iget-object v0, p0, Lcom/daaw/ll3;->q:Ljava/util/HashSet;

    new-instance v1, Ljava/util/AbstractMap$SimpleEntry;

    invoke-direct {v1, p1, p2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final synthetic C0(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/vj3;->d(Lcom/daaw/wj3;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final synthetic T(Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/vj3;->a(Lcom/daaw/wj3;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final synthetic c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/vj3;->c(Lcom/daaw/wj3;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final d0(Ljava/lang/String;Lcom/daaw/zg3;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ll3;->p:Lcom/daaw/kl3;

    invoke-interface {v0, p1, p2}, Lcom/daaw/kl3;->d0(Ljava/lang/String;Lcom/daaw/zg3;)V

    iget-object v0, p0, Lcom/daaw/ll3;->q:Ljava/util/HashSet;

    new-instance v1, Ljava/util/AbstractMap$SimpleEntry;

    invoke-direct {v1, p1, p2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final synthetic l(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/vj3;->b(Lcom/daaw/wj3;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ll3;->p:Lcom/daaw/kl3;

    invoke-interface {v0, p1}, Lcom/daaw/kk3;->zza(Ljava/lang/String;)V

    return-void
.end method

.method public final zzc()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/ll3;->q:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/AbstractMap$SimpleEntry;

    invoke-virtual {v1}, Ljava/util/AbstractMap$SimpleEntry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/zg3;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Unregistering eventhandler: "

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/daaw/ll3;->p:Lcom/daaw/kl3;

    invoke-virtual {v1}, Ljava/util/AbstractMap$SimpleEntry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/util/AbstractMap$SimpleEntry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/zg3;

    invoke-interface {v2, v3, v1}, Lcom/daaw/kl3;->d0(Ljava/lang/String;Lcom/daaw/zg3;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/ll3;->q:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    return-void
.end method
