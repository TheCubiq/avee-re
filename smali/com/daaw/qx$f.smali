.class public Lcom/daaw/qx$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/qx;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/qw1$a<",
        "Lcom/daaw/rx;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/qx;


# direct methods
.method public constructor <init>(Lcom/daaw/qx;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qx$f;->a:Lcom/daaw/qx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/rx;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/qx$f;->a:Lcom/daaw/qx;

    invoke-static {v0, p1}, Lcom/daaw/qx;->p(Lcom/daaw/qx;Lcom/daaw/rx;)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/rx;

    invoke-virtual {p0, p1}, Lcom/daaw/qx$f;->a(Lcom/daaw/rx;)V

    return-void
.end method
