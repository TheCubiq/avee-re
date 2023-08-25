.class public final Lcom/daaw/oe4;
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

    iput-object p1, p0, Lcom/daaw/oe4;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/oe4;->b:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final synthetic zzb()Ljava/lang/Object;
    .locals 3

    new-instance v0, Lcom/daaw/pm3;

    invoke-direct {v0}, Lcom/daaw/pm3;-><init>()V

    iget-object v1, p0, Lcom/daaw/oe4;->b:Lcom/daaw/m08;

    invoke-interface {v1}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    sget-object v2, Lcom/daaw/gb3;->a:Lcom/daaw/ma3;

    invoke-virtual {v2}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Lcom/daaw/om3;

    invoke-direct {v2, v0, v1}, Lcom/daaw/om3;-><init>(Lcom/daaw/nm3;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/daaw/p04;

    invoke-direct {v2, v1}, Lcom/daaw/p04;-><init>(Ljava/lang/String;)V

    :goto_0
    return-object v2
.end method
