.class public final Lcom/daaw/e36;
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

    iput-object p1, p0, Lcom/daaw/e36;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/e36;->b:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/daaw/e36;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/q76;

    invoke-virtual {v0}, Lcom/daaw/q76;->a()Lcom/daaw/p76;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/e36;->b:Lcom/daaw/m08;

    invoke-interface {v1}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/ag;

    new-instance v2, Lcom/daaw/u26;

    sget-object v3, Lcom/daaw/qa3;->a:Lcom/daaw/ma3;

    invoke-virtual {v3}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-direct {v2, v0, v3, v4, v1}, Lcom/daaw/u26;-><init>(Lcom/daaw/i76;JLcom/daaw/ag;)V

    return-object v2
.end method
