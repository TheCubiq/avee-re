.class public final synthetic Lcom/daaw/r65;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic a:Lcom/daaw/f77;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/f77;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/r65;->a:Lcom/daaw/f77;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/r65;->a:Lcom/daaw/f77;

    check-cast p1, Lcom/daaw/a74;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/daaw/a74;->zzs()Lcom/daaw/z74;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object v0

    :cond_0
    new-instance p1, Lcom/daaw/yu5;

    const/4 v0, 0x1

    const-string v1, "Retrieve video view in html5 ad response failed."

    invoke-direct {p1, v0, v1}, Lcom/daaw/yu5;-><init>(ILjava/lang/String;)V

    throw p1
.end method
