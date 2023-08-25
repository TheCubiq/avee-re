.class public final Lcom/daaw/vr7;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static volatile b:Lcom/daaw/vr7;

.field public static final c:Lcom/daaw/vr7;


# instance fields
.field public final a:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/vr7;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/daaw/vr7;-><init>(Z)V

    sput-object v0, Lcom/daaw/vr7;->c:Lcom/daaw/vr7;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/vr7;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/vr7;->a:Ljava/util/Map;

    return-void
.end method

.method public static a()Lcom/daaw/vr7;
    .locals 1

    sget-object v0, Lcom/daaw/vr7;->c:Lcom/daaw/vr7;

    return-object v0
.end method

.method public static b()Lcom/daaw/vr7;
    .locals 2

    const-class v0, Lcom/daaw/vr7;

    sget-object v1, Lcom/daaw/vr7;->b:Lcom/daaw/vr7;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/vr7;->b:Lcom/daaw/vr7;

    if-eqz v1, :cond_1

    monitor-exit v0

    return-object v1

    :cond_1
    invoke-static {v0}, Lcom/daaw/ds7;->b(Ljava/lang/Class;)Lcom/daaw/vr7;

    move-result-object v1

    sput-object v1, Lcom/daaw/vr7;->b:Lcom/daaw/vr7;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final c(Lcom/daaw/xt7;I)Lcom/daaw/ks7;
    .locals 2

    iget-object v0, p0, Lcom/daaw/vr7;->a:Ljava/util/Map;

    new-instance v1, Lcom/daaw/ur7;

    invoke-direct {v1, p1, p2}, Lcom/daaw/ur7;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ks7;

    return-object p1
.end method
