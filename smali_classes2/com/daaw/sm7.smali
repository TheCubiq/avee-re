.class public final Lcom/daaw/sm7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/uf5;


# instance fields
.field public final synthetic a:Lcom/daaw/dr6;


# direct methods
.method public constructor <init>(Lcom/daaw/vn7;Lcom/daaw/dr6;)V
    .locals 0

    iput-object p2, p0, Lcom/daaw/sm7;->a:Lcom/daaw/dr6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/sm7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/sm7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->C()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
