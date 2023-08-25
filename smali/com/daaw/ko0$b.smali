.class public Lcom/daaw/ko0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ko0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/ko0;


# direct methods
.method public constructor <init>(Lcom/daaw/ko0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ko0$b;->p:Lcom/daaw/ko0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ko0$b;->p:Lcom/daaw/ko0;

    invoke-static {v0}, Lcom/daaw/ko0;->d(Lcom/daaw/ko0;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ko0$b;->p:Lcom/daaw/ko0;

    invoke-static {v0}, Lcom/daaw/ko0;->d(Lcom/daaw/ko0;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method
