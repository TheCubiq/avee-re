.class public final Lcom/daaw/oy3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# instance fields
.field public final a:Ljava/lang/String;

.field public final synthetic b:Lcom/daaw/py3;


# direct methods
.method public constructor <init>(Lcom/daaw/py3;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/oy3;->b:Lcom/daaw/py3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/oy3;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/oy3;->b:Lcom/daaw/py3;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/oy3;->b:Lcom/daaw/py3;

    invoke-static {v1}, Lcom/daaw/py3;->a(Lcom/daaw/py3;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/ny3;

    iget-object v3, p0, Lcom/daaw/oy3;->a:Ljava/lang/String;

    iget-object v4, v2, Lcom/daaw/ny3;->a:Lcom/daaw/py3;

    iget-object v2, v2, Lcom/daaw/ny3;->b:Ljava/util/Map;

    invoke-virtual {v4, v2, p1, v3, p2}, Lcom/daaw/py3;->b(Ljava/util/Map;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method
