.class public Lcom/daaw/po$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/po;->b(Lcom/daaw/ho;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/po;


# direct methods
.method public constructor <init>(Lcom/daaw/po;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/po$b;->p:Lcom/daaw/po;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/po$b;->p:Lcom/daaw/po;

    invoke-static {v0}, Lcom/daaw/po;->a(Lcom/daaw/po;)Landroid/view/ViewGroup;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method
