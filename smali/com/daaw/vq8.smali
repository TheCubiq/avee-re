.class public final Lcom/daaw/vq8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/q09;

.field public final b:Ljava/util/Map;

.field public final c:Ljava/util/Set;

.field public final d:Ljava/util/Map;

.field public e:Lcom/daaw/m36;


# direct methods
.method public constructor <init>(Lcom/daaw/q09;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/vq8;->a:Lcom/daaw/q09;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/daaw/vq8;->b:Ljava/util/Map;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/daaw/vq8;->c:Ljava/util/Set;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/daaw/vq8;->d:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/m36;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/vq8;->e:Lcom/daaw/m36;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, Lcom/daaw/vq8;->e:Lcom/daaw/m36;

    iget-object p1, p0, Lcom/daaw/vq8;->b:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    iget-object p1, p0, Lcom/daaw/vq8;->d:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    :cond_0
    return-void
.end method
