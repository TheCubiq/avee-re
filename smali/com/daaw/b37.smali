.class public final Lcom/daaw/b37;
.super Lcom/daaw/a37;
.source ""


# instance fields
.field public final synthetic a:Lcom/daaw/c37;


# direct methods
.method public constructor <init>(Lcom/daaw/c37;I)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/b37;->a:Lcom/daaw/c37;

    invoke-direct {p0}, Lcom/daaw/a37;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()Lcom/daaw/m27;
    .locals 3

    iget-object v0, p0, Lcom/daaw/b37;->a:Lcom/daaw/c37;

    invoke-virtual {v0}, Lcom/daaw/c37;->a()Ljava/util/Map;

    move-result-object v0

    new-instance v1, Lcom/daaw/z27;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lcom/daaw/z27;-><init>(I)V

    new-instance v2, Lcom/daaw/e37;

    invoke-direct {v2, v0, v1}, Lcom/daaw/e37;-><init>(Ljava/util/Map;Lcom/daaw/iz6;)V

    return-object v2
.end method
