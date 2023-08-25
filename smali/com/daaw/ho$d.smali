.class public Lcom/daaw/ho$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/rw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ho;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/rw1$a<",
        "Landroid/content/Context;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ho;


# direct methods
.method public constructor <init>(Lcom/daaw/ho;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ho$d;->a:Lcom/daaw/ho;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/Integer;)V
    .locals 2

    sget-object v0, Lcom/daaw/ho;->Q:Lcom/daaw/sw1;

    iget-object v1, p0, Lcom/daaw/ho$d;->a:Lcom/daaw/ho;

    iget-object v1, v1, Lcom/daaw/ho;->y:Lcom/daaw/vn;

    invoke-virtual {v0, p1, p2, v1}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/content/Context;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/ho$d;->a(Landroid/content/Context;Ljava/lang/Integer;)V

    return-void
.end method
