.class public final synthetic Lcom/daaw/zm6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jw4;


# instance fields
.field public final synthetic a:Lcom/daaw/gm6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/gm6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/zm6;->a:Lcom/daaw/gm6;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/zm6;->a:Lcom/daaw/gm6;

    check-cast p1, Lcom/daaw/fn6;

    invoke-virtual {v0}, Lcom/daaw/gm6;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0}, Lcom/daaw/gm6;->b()Ljava/lang/String;

    move-result-object v0

    check-cast v1, Lcom/daaw/ym6;

    invoke-interface {p1, v1, v0}, Lcom/daaw/fn6;->k(Lcom/daaw/ym6;Ljava/lang/String;)V

    return-void
.end method
