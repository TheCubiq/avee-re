.class public Lcom/daaw/ba1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ir1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ba1;->O(Lcom/daaw/wc0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/ir1$b<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ba1;


# direct methods
.method public constructor <init>(Lcom/daaw/ba1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ba1$a;->a:Lcom/daaw/ba1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Z)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/ba1$a;->b(Ljava/lang/String;Z)V

    return-void
.end method

.method public b(Ljava/lang/String;Z)V
    .locals 0

    if-eqz p2, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, Lcom/daaw/ba1$a;->a:Lcom/daaw/ba1;

    invoke-static {p2}, Lcom/daaw/ba1;->P(Lcom/daaw/ba1;)Landroid/widget/TextView;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
