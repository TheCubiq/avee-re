.class public Lcom/daaw/no$t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/no;->p(Lcom/daaw/ho;Landroid/view/LayoutInflater;Lcom/daaw/un;ZLcom/daaw/w40;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Landroid/widget/TextView;

.field public final synthetic q:Lcom/daaw/un;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Lcom/daaw/un;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/no$t;->p:Landroid/widget/TextView;

    iput-object p2, p0, Lcom/daaw/no$t;->q:Lcom/daaw/un;

    iput-object p3, p0, Lcom/daaw/no$t;->r:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/no$t;->s:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/daaw/ho;->J:Lcom/daaw/uw1;

    iget-object v2, p0, Lcom/daaw/no$t;->p:Landroid/widget/TextView;

    iget-object p1, p0, Lcom/daaw/no$t;->q:Lcom/daaw/un;

    invoke-virtual {p1}, Lcom/daaw/un;->j()Ljava/util/ArrayList;

    move-result-object v3

    iget-object v4, p0, Lcom/daaw/no$t;->r:Ljava/lang/String;

    iget-object v5, p0, Lcom/daaw/no$t;->s:Ljava/lang/String;

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/uw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
