.class public final Lcom/daaw/bk4;
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

    iput-object p1, p0, Lcom/daaw/bk4;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/bk4;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/bk4;->c:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final synthetic zzb()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/bk4;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/hk4;

    invoke-virtual {v0}, Lcom/daaw/hk4;->a()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v1, p0, Lcom/daaw/bk4;->b:Lcom/daaw/m08;

    check-cast v1, Lcom/daaw/pu5;

    invoke-virtual {v1}, Lcom/daaw/pu5;->a()Lcom/daaw/ou5;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/bk4;->c:Lcom/daaw/m08;

    check-cast v2, Lcom/daaw/mw5;

    invoke-virtual {v2}, Lcom/daaw/mw5;->a()Lcom/daaw/lw5;

    move-result-object v2

    const/4 v3, 0x1

    if-eq v3, v0, :cond_0

    return-object v2

    :cond_0
    return-object v1
.end method
