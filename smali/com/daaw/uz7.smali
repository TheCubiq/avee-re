.class public final Lcom/daaw/uz7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public a:Lcom/daaw/m08;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 1

    check-cast p0, Lcom/daaw/uz7;

    iget-object v0, p0, Lcom/daaw/uz7;->a:Lcom/daaw/m08;

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/daaw/uz7;->a:Lcom/daaw/m08;

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0
.end method


# virtual methods
.method public final zzb()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/uz7;->a:Lcom/daaw/m08;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
