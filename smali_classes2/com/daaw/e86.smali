.class public final Lcom/daaw/e86;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g5$a;


# instance fields
.field public final synthetic a:Lcom/daaw/z07;


# direct methods
.method public constructor <init>(Lcom/daaw/z07;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/e86;->a:Lcom/daaw/z07;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-static {p2}, Lcom/daaw/yr3;->e(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "name"

    invoke-virtual {p1, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "timestampInMillis"

    invoke-virtual {p1, p2, p4, p5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string p2, "params"

    invoke-virtual {p1, p2, p3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object p2, p0, Lcom/daaw/e86;->a:Lcom/daaw/z07;

    invoke-static {p2}, Lcom/daaw/z07;->a(Lcom/daaw/z07;)Lcom/daaw/p2$b;

    move-result-object p2

    const/4 p3, 0x3

    invoke-interface {p2, p3, p1}, Lcom/daaw/p2$b;->a(ILandroid/os/Bundle;)V

    :cond_0
    return-void
.end method
