.class public final Lcom/daaw/lv5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sq5;


# instance fields
.field public final a:Ljava/util/Map;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field public final b:Lcom/daaw/ya5;


# direct methods
.method public constructor <init>(Lcom/daaw/ya5;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/lv5;->a:Ljava/util/Map;

    iput-object p1, p0, Lcom/daaw/lv5;->b:Lcom/daaw/ya5;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/daaw/tq5;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/lv5;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/tq5;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/lv5;->b:Lcom/daaw/ya5;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/ya5;->c(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/daaw/oj6;

    move-result-object p2

    new-instance v0, Lcom/daaw/tq5;

    new-instance v1, Lcom/daaw/zs5;

    invoke-direct {v1}, Lcom/daaw/zs5;-><init>()V

    invoke-direct {v0, p2, v1, p1}, Lcom/daaw/tq5;-><init>(Ljava/lang/Object;Lcom/daaw/yr4;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/daaw/lv5;->a:Ljava/util/Map;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
