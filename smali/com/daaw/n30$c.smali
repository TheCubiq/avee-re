.class public Lcom/daaw/n30$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wc0$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/n30;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/lu;

.field public final synthetic b:Lcom/daaw/n30;


# direct methods
.method public constructor <init>(Lcom/daaw/n30;Lcom/daaw/lu;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/n30$c;->b:Lcom/daaw/n30;

    iput-object p2, p0, Lcom/daaw/n30$c;->a:Lcom/daaw/lu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/n30$c;->a:Lcom/daaw/lu;

    invoke-virtual {v0, p1}, Lcom/daaw/lu;->j(Landroid/view/View;)V

    return-void
.end method
