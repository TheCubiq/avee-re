.class public final Lcom/daaw/fu1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/vt0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/fu1;->a(Landroid/view/View;Lcom/daaw/fu1$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/fu1$c;

.field public final synthetic b:Lcom/daaw/fu1$d;


# direct methods
.method public constructor <init>(Lcom/daaw/fu1$c;Lcom/daaw/fu1$d;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/fu1$a;->a:Lcom/daaw/fu1$c;

    iput-object p2, p0, Lcom/daaw/fu1$a;->b:Lcom/daaw/fu1$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Lcom/daaw/px1;)Lcom/daaw/px1;
    .locals 3

    iget-object v0, p0, Lcom/daaw/fu1$a;->a:Lcom/daaw/fu1$c;

    new-instance v1, Lcom/daaw/fu1$d;

    iget-object v2, p0, Lcom/daaw/fu1$a;->b:Lcom/daaw/fu1$d;

    invoke-direct {v1, v2}, Lcom/daaw/fu1$d;-><init>(Lcom/daaw/fu1$d;)V

    invoke-interface {v0, p1, p2, v1}, Lcom/daaw/fu1$c;->a(Landroid/view/View;Lcom/daaw/px1;Lcom/daaw/fu1$d;)Lcom/daaw/px1;

    move-result-object p1

    return-object p1
.end method
