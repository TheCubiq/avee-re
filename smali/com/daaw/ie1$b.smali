.class public Lcom/daaw/ie1$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/rw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ie1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/rw1$a<",
        "Lcom/daaw/al;",
        "Landroid/view/View;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ie1;


# direct methods
.method public constructor <init>(Lcom/daaw/ie1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ie1$b;->a:Lcom/daaw/ie1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/al;Landroid/view/View;)V
    .locals 1

    const-string v0, "files"

    invoke-static {p1, p2, v0}, Lcom/daaw/je1;->b(Lcom/daaw/al;Landroid/view/View;Ljava/lang/String;)Lcom/daaw/je1;

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/al;

    check-cast p2, Landroid/view/View;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/ie1$b;->a(Lcom/daaw/al;Landroid/view/View;)V

    return-void
.end method
