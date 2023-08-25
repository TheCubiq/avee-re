.class public final Lcom/daaw/xs1$t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/OnReceiveContentListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/xs1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "t"
.end annotation


# instance fields
.field public final a:Lcom/daaw/hu0;


# direct methods
.method public constructor <init>(Lcom/daaw/hu0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/xs1$t;->a:Lcom/daaw/hu0;

    return-void
.end method


# virtual methods
.method public onReceiveContent(Landroid/view/View;Landroid/view/ContentInfo;)Landroid/view/ContentInfo;
    .locals 2

    invoke-static {p2}, Lcom/daaw/tk;->g(Landroid/view/ContentInfo;)Lcom/daaw/tk;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/xs1$t;->a:Lcom/daaw/hu0;

    invoke-interface {v1, p1, v0}, Lcom/daaw/hu0;->a(Landroid/view/View;Lcom/daaw/tk;)Lcom/daaw/tk;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    if-ne p1, v0, :cond_1

    return-object p2

    :cond_1
    invoke-virtual {p1}, Lcom/daaw/tk;->f()Landroid/view/ContentInfo;

    move-result-object p1

    return-object p1
.end method
