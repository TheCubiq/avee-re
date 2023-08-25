.class public final Lcom/daaw/kb8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ad8;


# instance fields
.field public final synthetic a:Lcom/daaw/yb8;


# direct methods
.method public constructor <init>(Lcom/daaw/yb8;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/kb8;->a:Lcom/daaw/yb8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    const-string v0, "_err"

    if-eqz p2, :cond_1

    iget-object p1, p0, Lcom/daaw/kb8;->a:Lcom/daaw/yb8;

    invoke-static {p1}, Lcom/daaw/yb8;->b0(Lcom/daaw/yb8;)Lcom/daaw/dr6;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-static {p1}, Lcom/daaw/yb8;->b0(Lcom/daaw/yb8;)Lcom/daaw/dr6;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object p1

    const-string p2, "AppId not known when logging event"

    invoke-virtual {p1, p2, v0}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void

    :cond_1
    iget-object p2, p0, Lcom/daaw/kb8;->a:Lcom/daaw/yb8;

    invoke-virtual {p2}, Lcom/daaw/yb8;->r()Lcom/daaw/vn6;

    move-result-object p2

    new-instance v1, Lcom/daaw/hb8;

    invoke-direct {v1, p0, p1, v0, p3}, Lcom/daaw/hb8;-><init>(Lcom/daaw/kb8;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {p2, v1}, Lcom/daaw/vn6;->z(Ljava/lang/Runnable;)V

    return-void
.end method
