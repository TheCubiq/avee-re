.class public Lcom/daaw/no$g0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/no;->k(Lcom/daaw/ho;Lcom/daaw/un;ZLandroid/view/View;Ljava/lang/String;Lcom/daaw/e0;)Lcom/daaw/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/un;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Landroid/view/View;

.field public final synthetic s:Lcom/daaw/e0;


# direct methods
.method public constructor <init>(Lcom/daaw/un;Ljava/lang/String;Landroid/view/View;Lcom/daaw/e0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/no$g0;->p:Lcom/daaw/un;

    iput-object p2, p0, Lcom/daaw/no$g0;->q:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/no$g0;->r:Landroid/view/View;

    iput-object p4, p0, Lcom/daaw/no$g0;->s:Lcom/daaw/e0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/no$g0;->p:Lcom/daaw/un;

    iget-object v1, p0, Lcom/daaw/no$g0;->q:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/no$g0;->r:Landroid/view/View;

    iget-object v3, p0, Lcom/daaw/no$g0;->s:Lcom/daaw/e0;

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/daaw/ho;->v(Lcom/daaw/un;Ljava/lang/String;Landroid/view/View;Lcom/daaw/e0;)V

    return-void
.end method
