.class public final synthetic Lcom/daaw/pg6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/me6;


# instance fields
.field public final synthetic a:Lcom/daaw/cv3;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/cv3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/pg6;->a:Lcom/daaw/cv3;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/pg6;->a:Lcom/daaw/cv3;

    check-cast p1, Lcom/daaw/zv3;

    new-instance v1, Lcom/daaw/pw3;

    invoke-interface {v0}, Lcom/daaw/cv3;->zzc()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/daaw/cv3;->zzb()I

    move-result v0

    invoke-direct {v1, v2, v0}, Lcom/daaw/pw3;-><init>(Ljava/lang/String;I)V

    invoke-interface {p1, v1}, Lcom/daaw/zv3;->H0(Lcom/daaw/tv3;)V

    return-void
.end method
