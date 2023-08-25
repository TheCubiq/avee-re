.class public Lcom/daaw/kp;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b:Lcom/daaw/br0;


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/daaw/br0;",
            "Lcom/daaw/jp<",
            "**>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/br0;

    invoke-direct {v0}, Lcom/daaw/br0;-><init>()V

    sput-object v0, Lcom/daaw/kp;->b:Lcom/daaw/br0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/kp;->a:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/daaw/jp;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "Z:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/Class<",
            "TZ;>;)",
            "Lcom/daaw/jp<",
            "TT;TZ;>;"
        }
    .end annotation

    sget-object v0, Lcom/daaw/kp;->b:Lcom/daaw/br0;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0, p1, p2}, Lcom/daaw/br0;->a(Ljava/lang/Class;Ljava/lang/Class;)V

    iget-object p1, p0, Lcom/daaw/kp;->a:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/jp;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    invoke-static {}, Lcom/daaw/nw;->g()Lcom/daaw/jp;

    move-result-object p1

    :cond_0
    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public b(Ljava/lang/Class;Ljava/lang/Class;Lcom/daaw/jp;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "Z:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/Class<",
            "TZ;>;",
            "Lcom/daaw/jp<",
            "TT;TZ;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/kp;->a:Ljava/util/Map;

    new-instance v1, Lcom/daaw/br0;

    invoke-direct {v1, p1, p2}, Lcom/daaw/br0;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
