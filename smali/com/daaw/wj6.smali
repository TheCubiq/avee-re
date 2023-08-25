.class public final Lcom/daaw/wj6;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static a:Lcom/daaw/rj1;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field public static b:Lcom/daaw/l5;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field public static final c:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/wj6;->c:Ljava/lang/Object;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/daaw/rj1;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/daaw/wj6;->b(Landroid/content/Context;Z)V

    sget-object p0, Lcom/daaw/wj6;->c:Ljava/lang/Object;

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/daaw/wj6;->a:Lcom/daaw/rj1;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static b(Landroid/content/Context;Z)V
    .locals 2

    sget-object v0, Lcom/daaw/wj6;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/wj6;->b:Lcom/daaw/l5;

    if-nez v1, :cond_0

    invoke-static {p0}, Lcom/daaw/k5;->a(Landroid/content/Context;)Lcom/daaw/l5;

    move-result-object p0

    sput-object p0, Lcom/daaw/wj6;->b:Lcom/daaw/l5;

    :cond_0
    sget-object p0, Lcom/daaw/wj6;->a:Lcom/daaw/rj1;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/daaw/rj1;->m()Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lcom/daaw/wj6;->a:Lcom/daaw/rj1;

    invoke-virtual {p0}, Lcom/daaw/rj1;->n()Z

    move-result p0

    if-eqz p0, :cond_2

    :cond_1
    if-eqz p1, :cond_3

    sget-object p0, Lcom/daaw/wj6;->a:Lcom/daaw/rj1;

    invoke-virtual {p0}, Lcom/daaw/rj1;->m()Z

    move-result p0

    if-eqz p0, :cond_3

    :cond_2
    sget-object p0, Lcom/daaw/wj6;->b:Lcom/daaw/l5;

    const-string p1, "the appSetIdClient shouldn\'t be null"

    invoke-static {p0, p1}, Lcom/daaw/ry0;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/l5;

    invoke-interface {p0}, Lcom/daaw/l5;->a()Lcom/daaw/rj1;

    move-result-object p0

    sput-object p0, Lcom/daaw/wj6;->a:Lcom/daaw/rj1;

    :cond_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method
