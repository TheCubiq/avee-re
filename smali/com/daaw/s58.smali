.class public final Lcom/daaw/s58;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/f98;


# instance fields
.field public final synthetic a:Lcom/daaw/u68;


# direct methods
.method public constructor <init>(Lcom/daaw/u68;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/s58;->a:Lcom/daaw/u68;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/s58;->a:Lcom/daaw/u68;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/daaw/u68;->T(Lcom/daaw/u68;Z)V

    return-void
.end method

.method public final zzb()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/s58;->a:Lcom/daaw/u68;

    invoke-static {v0}, Lcom/daaw/u68;->Q(Lcom/daaw/u68;)Lcom/daaw/vz4;

    move-result-object v0

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lcom/daaw/vz4;->i(I)Z

    return-void
.end method
