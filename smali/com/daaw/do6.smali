.class public final Lcom/daaw/do6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/on6;


# instance fields
.field public final a:Lcom/daaw/ao6;

.field public final b:Lcom/daaw/yn6;


# direct methods
.method public constructor <init>(Lcom/daaw/ao6;Lcom/daaw/yn6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/do6;->a:Lcom/daaw/ao6;

    iput-object p2, p0, Lcom/daaw/do6;->b:Lcom/daaw/yn6;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/nn6;)V
    .locals 0

    return-void
.end method

.method public final b(Lcom/daaw/nn6;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/daaw/do6;->a:Lcom/daaw/ao6;

    invoke-virtual {p1}, Lcom/daaw/nn6;->j()Ljava/util/Map;

    move-result-object p1

    iget-object v1, p0, Lcom/daaw/do6;->b:Lcom/daaw/yn6;

    invoke-virtual {v1, p1}, Lcom/daaw/yn6;->a(Ljava/util/Map;)V

    invoke-virtual {v0, p1}, Lcom/daaw/ao6;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
