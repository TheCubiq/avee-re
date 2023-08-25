.class public final Lcom/daaw/eo6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/eo6;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/eo6;->b:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 3

    new-instance v0, Lcom/daaw/ao6;

    invoke-direct {v0}, Lcom/daaw/ao6;-><init>()V

    iget-object v1, p0, Lcom/daaw/eo6;->b:Lcom/daaw/m08;

    check-cast v1, Lcom/daaw/zn6;

    invoke-virtual {v1}, Lcom/daaw/zn6;->a()Lcom/daaw/yn6;

    move-result-object v1

    new-instance v2, Lcom/daaw/do6;

    invoke-direct {v2, v0, v1}, Lcom/daaw/do6;-><init>(Lcom/daaw/ao6;Lcom/daaw/yn6;)V

    return-object v2
.end method
