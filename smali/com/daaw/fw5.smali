.class public final Lcom/daaw/fw5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/fw5;->a:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/ew5;
    .locals 2

    iget-object v0, p0, Lcom/daaw/fw5;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/lx5;

    new-instance v1, Lcom/daaw/ew5;

    invoke-direct {v1, v0}, Lcom/daaw/ew5;-><init>(Lcom/daaw/lx5;)V

    return-object v1
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fw5;->a()Lcom/daaw/ew5;

    move-result-object v0

    return-object v0
.end method
