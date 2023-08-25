.class public Lcom/daaw/nc0$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/rw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/nc0;-><init>()V
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
        "Lcom/daaw/al;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/nc0;


# direct methods
.method public constructor <init>(Lcom/daaw/nc0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/nc0$g;->a:Lcom/daaw/nc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Integer;Lcom/daaw/al;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/daaw/nc0$g;->a:Lcom/daaw/nc0;

    invoke-static {p1, p2}, Lcom/daaw/nc0;->u(Lcom/daaw/nc0;Lcom/daaw/al;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Lcom/daaw/al;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/nc0$g;->a(Ljava/lang/Integer;Lcom/daaw/al;)V

    return-void
.end method
