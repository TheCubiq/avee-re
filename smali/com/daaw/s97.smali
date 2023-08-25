.class public final Lcom/daaw/s97;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/concurrent/ConcurrentMap;

.field public final b:Lcom/daaw/o97;

.field public final c:Ljava/lang/Class;

.field public final d:Lcom/daaw/oh7;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/ConcurrentMap;Lcom/daaw/o97;Lcom/daaw/oh7;Ljava/lang/Class;Lcom/daaw/r97;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/s97;->a:Ljava/util/concurrent/ConcurrentMap;

    iput-object p2, p0, Lcom/daaw/s97;->b:Lcom/daaw/o97;

    iput-object p4, p0, Lcom/daaw/s97;->c:Ljava/lang/Class;

    iput-object p3, p0, Lcom/daaw/s97;->d:Lcom/daaw/oh7;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/o97;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/daaw/s97;->b:Lcom/daaw/o97;

    return-object v0
.end method

.method public final b()Lcom/daaw/oh7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/s97;->d:Lcom/daaw/oh7;

    return-object v0
.end method

.method public final c()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lcom/daaw/s97;->c:Ljava/lang/Class;

    return-object v0
.end method

.method public final d()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lcom/daaw/s97;->a:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final e([B)Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lcom/daaw/s97;->a:Ljava/util/concurrent/ConcurrentMap;

    new-instance v1, Lcom/daaw/q97;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/daaw/q97;-><init>([BLcom/daaw/p97;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/s97;->d:Lcom/daaw/oh7;

    invoke-virtual {v0}, Lcom/daaw/oh7;->a()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
