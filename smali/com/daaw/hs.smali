.class public Lcom/daaw/hs;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final d:Ljava/lang/String;


# instance fields
.field public final a:Lcom/daaw/h80;

.field public final b:Lcom/daaw/m61;

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "DelayedWorkTracker"

    invoke-static {v0}, Lcom/daaw/ll0;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/hs;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/h80;Lcom/daaw/m61;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/hs;->a:Lcom/daaw/h80;

    iput-object p2, p0, Lcom/daaw/hs;->b:Lcom/daaw/m61;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/daaw/hs;->c:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/qy1;)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/hs;->c:Ljava/util/Map;

    iget-object v1, p1, Lcom/daaw/qy1;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/hs;->b:Lcom/daaw/m61;

    invoke-interface {v1, v0}, Lcom/daaw/m61;->b(Ljava/lang/Runnable;)V

    :cond_0
    new-instance v0, Lcom/daaw/hs$a;

    invoke-direct {v0, p0, p1}, Lcom/daaw/hs$a;-><init>(Lcom/daaw/hs;Lcom/daaw/qy1;)V

    iget-object v1, p0, Lcom/daaw/hs;->c:Ljava/util/Map;

    iget-object v2, p1, Lcom/daaw/qy1;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/daaw/qy1;->a()J

    move-result-wide v3

    sub-long/2addr v3, v1

    iget-object p1, p0, Lcom/daaw/hs;->b:Lcom/daaw/m61;

    invoke-interface {p1, v3, v4, v0}, Lcom/daaw/m61;->a(JLjava/lang/Runnable;)V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/hs;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Runnable;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/daaw/hs;->b:Lcom/daaw/m61;

    invoke-interface {v0, p1}, Lcom/daaw/m61;->b(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
