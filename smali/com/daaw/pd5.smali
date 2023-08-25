.class public final Lcom/daaw/pd5;
.super Lcom/daaw/rd5;
.source ""


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final i:Lcom/daaw/yn6;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lcom/daaw/p04;Lcom/daaw/yn6;Lcom/daaw/ao6;)V
    .locals 0

    invoke-direct {p0, p1, p2, p4}, Lcom/daaw/rd5;-><init>(Ljava/util/concurrent/Executor;Lcom/daaw/p04;Lcom/daaw/ao6;)V

    iput-object p3, p0, Lcom/daaw/pd5;->i:Lcom/daaw/yn6;

    iget-object p1, p0, Lcom/daaw/rd5;->b:Ljava/util/Map;

    invoke-virtual {p3, p1}, Lcom/daaw/yn6;->a(Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final f()Ljava/util/Map;
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Lcom/daaw/rd5;->b:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    return-object v0
.end method
