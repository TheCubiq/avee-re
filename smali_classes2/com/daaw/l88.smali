.class public final Lcom/daaw/l88;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static volatile b:Lcom/daaw/l88;

.field public static final c:Lcom/daaw/l88;


# instance fields
.field public final a:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/l88;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/daaw/l88;-><init>(Z)V

    sput-object v0, Lcom/daaw/l88;->c:Lcom/daaw/l88;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/l88;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/l88;->a:Ljava/util/Map;

    return-void
.end method

.method public static a()Lcom/daaw/l88;
    .locals 2

    const-class v0, Lcom/daaw/l88;

    sget-object v1, Lcom/daaw/l88;->b:Lcom/daaw/l88;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/l88;->b:Lcom/daaw/l88;

    if-eqz v1, :cond_1

    monitor-exit v0

    return-object v1

    :cond_1
    invoke-static {v0}, Lcom/daaw/j98;->b(Ljava/lang/Class;)Lcom/daaw/l88;

    move-result-object v1

    sput-object v1, Lcom/daaw/l88;->b:Lcom/daaw/l88;

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
.method public final b(Lcom/daaw/zd8;I)Lcom/daaw/ea8;
    .locals 2

    iget-object v0, p0, Lcom/daaw/l88;->a:Ljava/util/Map;

    new-instance v1, Lcom/daaw/i88;

    invoke-direct {v1, p1, p2}, Lcom/daaw/i88;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ea8;

    return-object p1
.end method
