.class public Lcom/daaw/jv1$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/tw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/jv1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/tw1$a<",
        "Lcom/daaw/ho;",
        "Lcom/daaw/vn;",
        "Lcom/daaw/un;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/jv1;


# direct methods
.method public constructor <init>(Lcom/daaw/jv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/jv1$i;->a:Lcom/daaw/jv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/ho;

    check-cast p2, Lcom/daaw/vn;

    check-cast p3, Lcom/daaw/un;

    check-cast p4, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/jv1$i;->b(Lcom/daaw/ho;Lcom/daaw/vn;Lcom/daaw/un;Ljava/lang/String;)V

    return-void
.end method

.method public b(Lcom/daaw/ho;Lcom/daaw/vn;Lcom/daaw/un;Ljava/lang/String;)V
    .locals 0

    if-nez p2, :cond_0

    return-void

    :cond_0
    if-nez p3, :cond_1

    return-void

    :cond_1
    invoke-virtual {p3}, Lcom/daaw/un;->B()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, Lcom/daaw/un;->D()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p1, p4}, Lcom/daaw/un;->g(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_2

    const p3, 0x7f1002d9

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    sget-object p3, Lcom/daaw/vy;->a:Lcom/daaw/qw1;

    invoke-virtual {p3, p1}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    :cond_2
    iget-object p1, p0, Lcom/daaw/jv1$i;->a:Lcom/daaw/jv1;

    const/4 p3, 0x0

    const/4 p4, -0x1

    invoke-static {p1, p2, p3, p4}, Lcom/daaw/jv1;->b(Lcom/daaw/jv1;Lcom/daaw/vn;ZI)V

    return-void
.end method
