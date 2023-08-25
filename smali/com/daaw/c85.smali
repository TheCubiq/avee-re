.class public final Lcom/daaw/c85;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/c85;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/c85;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/c85;->c:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/c85;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/tm4;

    invoke-virtual {v0}, Lcom/daaw/tm4;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/c85;->b:Lcom/daaw/m08;

    invoke-interface {v1}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/e35;

    iget-object v2, p0, Lcom/daaw/c85;->c:Lcom/daaw/m08;

    check-cast v2, Lcom/daaw/c45;

    invoke-virtual {v2}, Lcom/daaw/c45;->a()Lcom/daaw/j35;

    move-result-object v2

    new-instance v3, Lcom/daaw/b85;

    invoke-direct {v3, v0, v1, v2}, Lcom/daaw/b85;-><init>(Ljava/lang/String;Lcom/daaw/e35;Lcom/daaw/j35;)V

    return-object v3
.end method
