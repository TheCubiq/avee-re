.class public final Lcom/daaw/t75;
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

    iput-object p1, p0, Lcom/daaw/t75;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/t75;->b:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/t75;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/e35;

    iget-object v1, p0, Lcom/daaw/t75;->b:Lcom/daaw/m08;

    check-cast v1, Lcom/daaw/c45;

    invoke-virtual {v1}, Lcom/daaw/c45;->a()Lcom/daaw/j35;

    move-result-object v1

    new-instance v2, Lcom/daaw/s75;

    invoke-direct {v2, v0, v1}, Lcom/daaw/s75;-><init>(Lcom/daaw/e35;Lcom/daaw/j35;)V

    return-object v2
.end method
