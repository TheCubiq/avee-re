.class public Lcom/daaw/c60$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/rw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/c60;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/rw1$a<",
        "Lcom/daaw/er0<",
        "Lcom/daaw/tx0;",
        "Lcom/daaw/vd0;",
        ">;",
        "Lcom/daaw/be0;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/c60;


# direct methods
.method public constructor <init>(Lcom/daaw/c60;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/c60$b;->a:Lcom/daaw/c60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/er0;Lcom/daaw/be0;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/er0<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/vd0;",
            ">;",
            "Lcom/daaw/be0;",
            ")V"
        }
    .end annotation

    sget-boolean p2, Lcom/daaw/c60;->l:Z

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lcom/daaw/er0;->size()I

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-lez p2, :cond_0

    invoke-virtual {p1, v0}, Lcom/daaw/er0;->n(I)Lcom/daaw/lo1;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    iget-object p1, p1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    if-eqz p1, :cond_1

    check-cast p1, Lcom/daaw/tx0;

    invoke-virtual {p1}, Lcom/daaw/tx0;->g()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lcom/daaw/avee/comp/playback/c;->e:Lcom/daaw/lw1;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-wide/16 v3, 0x0

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {p2, p1, v2, v3, v1}, Lcom/daaw/lw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    sput-boolean v0, Lcom/daaw/c60;->l:Z

    :cond_2
    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/er0;

    check-cast p2, Lcom/daaw/be0;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/c60$b;->a(Lcom/daaw/er0;Lcom/daaw/be0;)V

    return-void
.end method
