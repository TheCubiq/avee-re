.class public Lcom/daaw/jv1$k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/yw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/jv1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/yw1$a<",
        "Lcom/daaw/ho;",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        "Lcom/daaw/lo1<",
        "[",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/jv1;


# direct methods
.method public constructor <init>(Lcom/daaw/jv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/jv1$k;->a:Lcom/daaw/jv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/ho;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/jv1$k;->b(Lcom/daaw/ho;Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/lo1;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/daaw/ho;Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/lo1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/ho;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/daaw/lo1<",
            "[",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/daaw/lo1;

    const-string p2, "10"

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p3

    invoke-direct {p1, p3, p2}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method
