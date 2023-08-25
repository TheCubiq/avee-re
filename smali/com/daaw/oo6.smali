.class public final synthetic Lcom/daaw/oo6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/em6;


# instance fields
.field public final synthetic a:Lcom/daaw/io6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/io6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/oo6;->a:Lcom/daaw/io6;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/oo6;->a:Lcom/daaw/io6;

    sget-object v1, Lcom/daaw/ta3;->c:Lcom/daaw/ma3;

    invoke-virtual {v1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Lcom/daaw/io6;->zzh()Lcom/daaw/io6;

    :cond_0
    return-object p1
.end method
