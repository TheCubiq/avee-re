.class public final Lcom/daaw/yk4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g5$a;


# instance fields
.field public final synthetic a:Lcom/daaw/fe5;


# direct methods
.method public constructor <init>(Lcom/daaw/fe5;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yk4;->a:Lcom/daaw/fe5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/yk4;->a:Lcom/daaw/fe5;

    iget-object p1, p1, Lcom/daaw/fe5;->a:Ljava/util/Set;

    invoke-interface {p1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    invoke-static {p2}, Lcom/daaw/yr3;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "events"

    invoke-virtual {p1, p3, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/daaw/yk4;->a:Lcom/daaw/fe5;

    invoke-static {p2}, Lcom/daaw/fe5;->a(Lcom/daaw/fe5;)Lcom/daaw/p2$b;

    move-result-object p2

    const/4 p3, 0x2

    invoke-interface {p2, p3, p1}, Lcom/daaw/p2$b;->a(ILandroid/os/Bundle;)V

    return-void
.end method
