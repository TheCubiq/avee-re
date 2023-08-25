.class public final Lcom/daaw/e37;
.super Lcom/daaw/mz6;
.source ""


# instance fields
.field public final transient u:Lcom/daaw/iz6;


# direct methods
.method public constructor <init>(Ljava/util/Map;Lcom/daaw/iz6;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/mz6;-><init>(Ljava/util/Map;)V

    iput-object p2, p0, Lcom/daaw/e37;->u:Lcom/daaw/iz6;

    return-void
.end method


# virtual methods
.method public final e()Ljava/util/Map;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/g07;->q()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final f()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/g07;->r()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic h()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lcom/daaw/e37;->u:Lcom/daaw/iz6;

    invoke-interface {v0}, Lcom/daaw/iz6;->zza()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
