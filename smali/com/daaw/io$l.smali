.class public Lcom/daaw/io$l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wn$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/io;->m(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;Landroid/app/Activity;[Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/io;


# direct methods
.method public constructor <init>(Lcom/daaw/io;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/io$l;->a:Lcom/daaw/io;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILandroid/view/View;)Z
    .locals 2

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/daaw/ho;->m(I)Z

    iget-object v0, p0, Lcom/daaw/io$l;->a:Lcom/daaw/io;

    invoke-virtual {v0, p1, v1}, Lcom/daaw/io;->s(IZ)V

    iget-object v0, p0, Lcom/daaw/io$l;->a:Lcom/daaw/io;

    iget-object v0, v0, Lcom/daaw/io;->j:Lcom/daaw/xn;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/xn;->H(ILandroid/view/View;)V

    return v1
.end method
