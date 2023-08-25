.class public Lcom/daaw/ym1;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static e:Lcom/daaw/ym1;


# instance fields
.field public a:Lcom/daaw/kb;

.field public b:Lcom/daaw/mb;

.field public c:Lcom/daaw/ps0;

.field public d:Lcom/daaw/bg1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/wj1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Lcom/daaw/kb;

    invoke-direct {v0, p1, p2}, Lcom/daaw/kb;-><init>(Landroid/content/Context;Lcom/daaw/wj1;)V

    iput-object v0, p0, Lcom/daaw/ym1;->a:Lcom/daaw/kb;

    new-instance v0, Lcom/daaw/mb;

    invoke-direct {v0, p1, p2}, Lcom/daaw/mb;-><init>(Landroid/content/Context;Lcom/daaw/wj1;)V

    iput-object v0, p0, Lcom/daaw/ym1;->b:Lcom/daaw/mb;

    new-instance v0, Lcom/daaw/ps0;

    invoke-direct {v0, p1, p2}, Lcom/daaw/ps0;-><init>(Landroid/content/Context;Lcom/daaw/wj1;)V

    iput-object v0, p0, Lcom/daaw/ym1;->c:Lcom/daaw/ps0;

    new-instance v0, Lcom/daaw/bg1;

    invoke-direct {v0, p1, p2}, Lcom/daaw/bg1;-><init>(Landroid/content/Context;Lcom/daaw/wj1;)V

    iput-object v0, p0, Lcom/daaw/ym1;->d:Lcom/daaw/bg1;

    return-void
.end method

.method public static declared-synchronized c(Landroid/content/Context;Lcom/daaw/wj1;)Lcom/daaw/ym1;
    .locals 2

    const-class v0, Lcom/daaw/ym1;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/ym1;->e:Lcom/daaw/ym1;

    if-nez v1, :cond_0

    new-instance v1, Lcom/daaw/ym1;

    invoke-direct {v1, p0, p1}, Lcom/daaw/ym1;-><init>(Landroid/content/Context;Lcom/daaw/wj1;)V

    sput-object v1, Lcom/daaw/ym1;->e:Lcom/daaw/ym1;

    :cond_0
    sget-object p0, Lcom/daaw/ym1;->e:Lcom/daaw/ym1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public a()Lcom/daaw/kb;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ym1;->a:Lcom/daaw/kb;

    return-object v0
.end method

.method public b()Lcom/daaw/mb;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ym1;->b:Lcom/daaw/mb;

    return-object v0
.end method

.method public d()Lcom/daaw/ps0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ym1;->c:Lcom/daaw/ps0;

    return-object v0
.end method

.method public e()Lcom/daaw/bg1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ym1;->d:Lcom/daaw/bg1;

    return-object v0
.end method
