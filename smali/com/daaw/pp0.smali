.class public Lcom/daaw/pp0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ba;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/pp0$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/pp0$a;

.field public final b:Lcom/daaw/fn;

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/daaw/rn1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/fn;)V
    .locals 1

    new-instance v0, Lcom/daaw/pp0$a;

    invoke-direct {v0, p1}, Lcom/daaw/pp0$a;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0, p2}, Lcom/daaw/pp0;-><init>(Lcom/daaw/pp0$a;Lcom/daaw/fn;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/pp0$a;Lcom/daaw/fn;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/pp0;->c:Ljava/util/Map;

    iput-object p1, p0, Lcom/daaw/pp0;->a:Lcom/daaw/pp0$a;

    iput-object p2, p0, Lcom/daaw/pp0;->b:Lcom/daaw/fn;

    return-void
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/String;)Lcom/daaw/rn1;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/pp0;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/pp0;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/rn1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/daaw/pp0;->a:Lcom/daaw/pp0$a;

    invoke-virtual {v0, p1}, Lcom/daaw/pp0$a;->b(Ljava/lang/String;)Lcom/daaw/aa;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_1

    const/4 p1, 0x0

    monitor-exit p0

    return-object p1

    :cond_1
    :try_start_2
    iget-object v1, p0, Lcom/daaw/pp0;->b:Lcom/daaw/fn;

    invoke-virtual {v1, p1}, Lcom/daaw/fn;->a(Ljava/lang/String;)Lcom/daaw/en;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/aa;->create(Lcom/daaw/en;)Lcom/daaw/rn1;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/pp0;->c:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
