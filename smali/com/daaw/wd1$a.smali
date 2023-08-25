.class public Lcom/daaw/wd1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/rw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/wd1;-><init>()V
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
.field public final synthetic a:Lcom/daaw/wd1;


# direct methods
.method public constructor <init>(Lcom/daaw/wd1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/wd1$a;->a:Lcom/daaw/wd1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Integer;Lcom/daaw/al;)V
    .locals 3

    invoke-virtual {p2}, Lcom/daaw/al;->c()Landroid/app/FragmentManager;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-static {p2}, Lcom/daaw/xd1;->g(Lcom/daaw/al;)Lcom/daaw/xd1;

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 p2, 0xa

    if-ne p1, p2, :cond_3

    invoke-static {}, Lcom/daaw/td1;->c()Lcom/daaw/td1;

    move-result-object p1

    if-nez p1, :cond_2

    return-void

    :cond_2
    invoke-virtual {p1}, Lcom/daaw/td1;->e()Lcom/daaw/ud1;

    move-result-object p2

    const/4 v0, 0x0

    iget v1, p2, Lcom/daaw/ud1;->b:I

    invoke-virtual {p1}, Lcom/daaw/td1;->g()Ljava/util/Date;

    move-result-object v2

    iget-boolean p2, p2, Lcom/daaw/ud1;->c:Z

    invoke-virtual {p1, v0, v1, v2, p2}, Lcom/daaw/td1;->b(ZILjava/util/Date;Z)V

    :cond_3
    :goto_0
    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Lcom/daaw/al;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/wd1$a;->a(Ljava/lang/Integer;Lcom/daaw/al;)V

    return-void
.end method
