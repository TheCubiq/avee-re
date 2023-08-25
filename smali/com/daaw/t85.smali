.class public final Lcom/daaw/t85;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zg3;


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/daaw/zg3;

.field public final synthetic d:Lcom/daaw/u85;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/u85;Ljava/lang/ref/WeakReference;Ljava/lang/String;Lcom/daaw/zg3;Lcom/daaw/s85;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/t85;->d:Lcom/daaw/u85;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/t85;->a:Ljava/lang/ref/WeakReference;

    iput-object p3, p0, Lcom/daaw/t85;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/t85;->c:Lcom/daaw/zg3;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/t85;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/t85;->d:Lcom/daaw/u85;

    iget-object p2, p0, Lcom/daaw/t85;->b:Ljava/lang/String;

    invoke-virtual {p1, p2, p0}, Lcom/daaw/u85;->k(Ljava/lang/String;Lcom/daaw/zg3;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/t85;->c:Lcom/daaw/zg3;

    invoke-interface {v0, p1, p2}, Lcom/daaw/zg3;->a(Ljava/lang/Object;Ljava/util/Map;)V

    return-void
.end method
