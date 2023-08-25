.class public Lcom/daaw/wv1$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/wv1;-><init>(Landroid/view/LayoutInflater;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/wv1;


# direct methods
.method public constructor <init>(Lcom/daaw/wv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/wv1$d;->p:Lcom/daaw/wv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/wv1$d;->p:Lcom/daaw/wv1;

    invoke-static {p1}, Lcom/daaw/wv1;->c(Lcom/daaw/wv1;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/wv1$d;->p:Lcom/daaw/wv1;

    invoke-static {p1, v0, v0}, Lcom/daaw/wv1;->d(Lcom/daaw/wv1;ZZ)V

    sget-object p1, Lcom/daaw/ko0;->X:Lcom/daaw/qw1;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/wv1$d;->p:Lcom/daaw/wv1;

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Lcom/daaw/wv1;->d(Lcom/daaw/wv1;ZZ)V

    sget-object p1, Lcom/daaw/ko0;->X:Lcom/daaw/qw1;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_0
    invoke-virtual {p1, v0}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    return-void
.end method
