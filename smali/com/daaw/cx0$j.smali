.class public Lcom/daaw/cx0$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/cx0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/qw1$a<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/cx0;


# direct methods
.method public constructor <init>(Lcom/daaw/cx0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/cx0$j;->a:Lcom/daaw/cx0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Integer;)V
    .locals 2

    invoke-static {}, Lcom/daaw/l01;->c()Lcom/daaw/l01;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/daaw/l01;->T(IZ)V

    :cond_0
    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/daaw/cx0$j;->a(Ljava/lang/Integer;)V

    return-void
.end method
