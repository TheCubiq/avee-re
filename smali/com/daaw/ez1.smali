.class public Lcom/daaw/ez1;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static b:Lcom/daaw/ez1;


# instance fields
.field public a:Lcom/daaw/iv0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/ez1;

    invoke-direct {v0}, Lcom/daaw/ez1;-><init>()V

    sput-object v0, Lcom/daaw/ez1;->b:Lcom/daaw/ez1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/ez1;->a:Lcom/daaw/iv0;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/daaw/iv0;
    .locals 1

    sget-object v0, Lcom/daaw/ez1;->b:Lcom/daaw/ez1;

    invoke-virtual {v0, p0}, Lcom/daaw/ez1;->b(Landroid/content/Context;)Lcom/daaw/iv0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final declared-synchronized b(Landroid/content/Context;)Lcom/daaw/iv0;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ez1;->a:Lcom/daaw/iv0;

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    :cond_0
    new-instance v0, Lcom/daaw/iv0;

    invoke-direct {v0, p1}, Lcom/daaw/iv0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/daaw/ez1;->a:Lcom/daaw/iv0;

    :cond_1
    iget-object p1, p0, Lcom/daaw/ez1;->a:Lcom/daaw/iv0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
