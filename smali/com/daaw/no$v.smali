.class public Lcom/daaw/no$v;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/no;->E(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/no;


# direct methods
.method public constructor <init>(Lcom/daaw/no;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/no$v;->p:Lcom/daaw/no;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/no$v;->p:Lcom/daaw/no;

    invoke-static {p1}, Lcom/daaw/no;->g(Lcom/daaw/no;)Lcom/daaw/un;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/no$v;->p:Lcom/daaw/no;

    invoke-static {p1}, Lcom/daaw/no;->g(Lcom/daaw/no;)Lcom/daaw/un;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/un;->B()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/no$v;->p:Lcom/daaw/no;

    invoke-static {v0}, Lcom/daaw/no;->g(Lcom/daaw/no;)Lcom/daaw/un;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/un;->D()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v1, p1, v0}, Lcom/daaw/ho;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method
