.class public Lcom/daaw/jv1$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sw1$a;


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
        "Lcom/daaw/sw1$a<",
        "Landroid/content/Context;",
        "Ljava/lang/Integer;",
        "Lcom/daaw/vn;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/jv1;


# direct methods
.method public constructor <init>(Lcom/daaw/jv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/jv1$f;->a:Lcom/daaw/jv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/content/Context;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Lcom/daaw/vn;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/jv1$f;->b(Landroid/content/Context;Ljava/lang/Integer;Lcom/daaw/vn;)V

    return-void
.end method

.method public b(Landroid/content/Context;Ljava/lang/Integer;Lcom/daaw/vn;)V
    .locals 1

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/daaw/ho;->l(I)Lcom/daaw/ho$i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/ho$i;->a()Lcom/daaw/rn;

    move-result-object p2

    if-eqz p2, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/daaw/ho$i;->b()Lcom/daaw/un;

    move-result-object p1

    if-nez p1, :cond_2

    return-void

    :cond_2
    invoke-virtual {p1}, Lcom/daaw/un;->l()Lcom/daaw/un;

    move-result-object p2

    if-eqz p2, :cond_4

    instance-of v0, p2, Lcom/daaw/rn;

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    check-cast p2, Lcom/daaw/rn;

    invoke-virtual {p2, p1}, Lcom/daaw/rn;->x0(Lcom/daaw/un;)Lcom/daaw/un;

    iget-object p1, p0, Lcom/daaw/jv1$f;->a:Lcom/daaw/jv1;

    const/4 v0, 0x0

    invoke-virtual {p2}, Lcom/daaw/rn;->u0()I

    move-result p2

    invoke-static {p1, p3, v0, p2}, Lcom/daaw/jv1;->b(Lcom/daaw/jv1;Lcom/daaw/vn;ZI)V

    :cond_4
    :goto_0
    return-void
.end method
