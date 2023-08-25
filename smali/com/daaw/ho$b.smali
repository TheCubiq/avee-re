.class public Lcom/daaw/ho$b;
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
        "Ljava/lang/Integer;",
        "Lcom/daaw/vn;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ho;


# direct methods
.method public constructor <init>(Lcom/daaw/ho;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ho$b;->a:Lcom/daaw/ho;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Integer;Lcom/daaw/vn;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Lcom/daaw/vn;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/ho$b;->a(Ljava/lang/Integer;Lcom/daaw/vn;)V

    return-void
.end method
