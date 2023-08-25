.class public Lcom/daaw/zu$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/zu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/zu;


# direct methods
.method public constructor <init>(Lcom/daaw/zu;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/zu$f;->p:Lcom/daaw/zu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/zu$f;->p:Lcom/daaw/zu;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/daaw/zu;->B:Lcom/daaw/zu$f;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/zu$f;->p:Lcom/daaw/zu;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/zu$f;->p:Lcom/daaw/zu;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/daaw/zu;->B:Lcom/daaw/zu$f;

    invoke-virtual {v0}, Lcom/daaw/zu;->drawableStateChanged()V

    return-void
.end method
