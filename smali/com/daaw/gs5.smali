.class public final synthetic Lcom/daaw/gs5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic a:Lcom/daaw/hs5;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Lcom/daaw/th6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/hs5;Landroid/view/View;Lcom/daaw/th6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/gs5;->a:Lcom/daaw/hs5;

    iput-object p2, p0, Lcom/daaw/gs5;->b:Landroid/view/View;

    iput-object p3, p0, Lcom/daaw/gs5;->c:Lcom/daaw/th6;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 3

    iget-object v0, p0, Lcom/daaw/gs5;->a:Lcom/daaw/hs5;

    iget-object v1, p0, Lcom/daaw/gs5;->b:Landroid/view/View;

    iget-object v2, p0, Lcom/daaw/gs5;->c:Lcom/daaw/th6;

    invoke-virtual {v0, v1, v2, p1}, Lcom/daaw/hs5;->c(Landroid/view/View;Lcom/daaw/th6;Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
