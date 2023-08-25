.class public Lcom/daaw/tc1$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/r40;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/tc1;->d(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/me0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/r40<",
        "Lcom/daaw/lo1<",
        "Ljava/util/List<",
        "Lcom/daaw/h60;",
        ">;",
        "Lcom/daaw/wf1;",
        ">;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/tc1$f;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/lo1;

    invoke-virtual {p0, p1}, Lcom/daaw/tc1$f;->b(Lcom/daaw/lo1;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/daaw/lo1;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/lo1<",
            "Ljava/util/List<",
            "Lcom/daaw/h60;",
            ">;",
            "Lcom/daaw/wf1;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/tc1$f;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object p1, p1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    if-nez p1, :cond_1

    return-object v1

    :cond_1
    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lcom/daaw/tc1;->a(Ljava/lang/String;Ljava/util/List;)Lcom/daaw/h60;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p1, Lcom/daaw/h60;->a:Ljava/lang/String;

    goto :goto_0

    :cond_2
    const-string p1, "....."

    :goto_0
    return-object p1
.end method
