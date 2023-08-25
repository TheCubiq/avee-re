.class public final Lcom/daaw/f18;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ad8;


# instance fields
.field public final synthetic a:Lcom/daaw/p28;


# direct methods
.method public constructor <init>(Lcom/daaw/p28;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/f18;->a:Lcom/daaw/p28;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    const-string v0, "auto"

    const-string v1, "_err"

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/daaw/f18;->a:Lcom/daaw/p28;

    invoke-virtual {p2, v0, v1, p3, p1}, Lcom/daaw/p28;->t(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/f18;->a:Lcom/daaw/p28;

    invoke-virtual {p1, v0, v1, p3}, Lcom/daaw/p28;->q(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
