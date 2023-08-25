.class public final Lcom/daaw/a08;
.super Lcom/daaw/sz7;
.source ""


# static fields
.field public static final b:Lcom/daaw/m08;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/xz7;->a(Ljava/lang/Object;)Lcom/daaw/wz7;

    move-result-object v0

    sput-object v0, Lcom/daaw/a08;->b:Lcom/daaw/m08;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Map;Lcom/daaw/yz7;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/sz7;-><init>(Ljava/util/Map;)V

    return-void
.end method

.method public static b(I)Lcom/daaw/zz7;
    .locals 2

    new-instance v0, Lcom/daaw/zz7;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/daaw/zz7;-><init>(ILcom/daaw/yz7;)V

    return-object v0
.end method


# virtual methods
.method public final c()Ljava/util/Map;
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/sz7;->a()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-static {v0}, Lcom/daaw/tz7;->b(I)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/sz7;->a()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/m08;

    invoke-interface {v2}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/a08;->c()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
