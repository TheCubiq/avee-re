.class public final Lcom/daaw/d4;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b:Landroid/graphics/PorterDuff$Mode;

.field public static c:Lcom/daaw/d4;


# instance fields
.field public a:Lcom/daaw/g51;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    sput-object v0, Lcom/daaw/d4;->b:Landroid/graphics/PorterDuff$Mode;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    sget-object v0, Lcom/daaw/d4;->b:Landroid/graphics/PorterDuff$Mode;

    return-object v0
.end method

.method public static declared-synchronized b()Lcom/daaw/d4;
    .locals 2

    const-class v0, Lcom/daaw/d4;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/d4;->c:Lcom/daaw/d4;

    if-nez v1, :cond_0

    invoke-static {}, Lcom/daaw/d4;->h()V

    :cond_0
    sget-object v1, Lcom/daaw/d4;->c:Lcom/daaw/d4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized e(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    .locals 1

    const-class v0, Lcom/daaw/d4;

    monitor-enter v0

    :try_start_0
    invoke-static {p0, p1}, Lcom/daaw/g51;->l(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized h()V
    .locals 3

    const-class v0, Lcom/daaw/d4;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/d4;->c:Lcom/daaw/d4;

    if-nez v1, :cond_0

    new-instance v1, Lcom/daaw/d4;

    invoke-direct {v1}, Lcom/daaw/d4;-><init>()V

    sput-object v1, Lcom/daaw/d4;->c:Lcom/daaw/d4;

    invoke-static {}, Lcom/daaw/g51;->h()Lcom/daaw/g51;

    move-result-object v2

    iput-object v2, v1, Lcom/daaw/d4;->a:Lcom/daaw/g51;

    sget-object v1, Lcom/daaw/d4;->c:Lcom/daaw/d4;

    iget-object v1, v1, Lcom/daaw/d4;->a:Lcom/daaw/g51;

    new-instance v2, Lcom/daaw/d4$a;

    invoke-direct {v2}, Lcom/daaw/d4$a;-><init>()V

    invoke-virtual {v1, v2}, Lcom/daaw/g51;->u(Lcom/daaw/g51$f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static i(Landroid/graphics/drawable/Drawable;Lcom/daaw/sl1;[I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/g51;->w(Landroid/graphics/drawable/Drawable;Lcom/daaw/sl1;[I)V

    return-void
.end method


# virtual methods
.method public declared-synchronized c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/d4;->a:Lcom/daaw/g51;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/g51;->j(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized d(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/d4;->a:Lcom/daaw/g51;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/g51;->k(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/d4;->a:Lcom/daaw/g51;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/g51;->m(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized g(Landroid/content/Context;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/d4;->a:Lcom/daaw/g51;

    invoke-virtual {v0, p1}, Lcom/daaw/g51;->s(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
