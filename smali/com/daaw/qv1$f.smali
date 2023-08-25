.class public Lcom/daaw/qv1$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/tw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/qv1;-><init>(Lcom/daaw/pv1;Lcom/daaw/xw0;Lcom/daaw/vm0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/tw1$a<",
        "Lcom/daaw/tx0;",
        "Lcom/daaw/vd0;",
        "Lcom/daaw/tx0$b;",
        "Lcom/daaw/hx0;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/qv1;


# direct methods
.method public constructor <init>(Lcom/daaw/qv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qv1$f;->a:Lcom/daaw/qv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/tx0;

    check-cast p2, Lcom/daaw/vd0;

    check-cast p3, Lcom/daaw/tx0$b;

    check-cast p4, Lcom/daaw/hx0;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/qv1$f;->b(Lcom/daaw/tx0;Lcom/daaw/vd0;Lcom/daaw/tx0$b;Lcom/daaw/hx0;)V

    return-void
.end method

.method public b(Lcom/daaw/tx0;Lcom/daaw/vd0;Lcom/daaw/tx0$b;Lcom/daaw/hx0;)V
    .locals 0

    sput-object p1, Lcom/daaw/xw0;->f:Lcom/daaw/tx0;

    sput-object p3, Lcom/daaw/xw0;->g:Lcom/daaw/tx0$b;

    sput-object p4, Lcom/daaw/xw0;->h:Lcom/daaw/hx0;

    invoke-static {}, Lcom/daaw/qv1;->h()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/qv1$f;->a:Lcom/daaw/qv1;

    sget-object p2, Lcom/daaw/xw0;->g:Lcom/daaw/tx0$b;

    invoke-static {p1, p2}, Lcom/daaw/qv1;->g(Lcom/daaw/qv1;Lcom/daaw/tx0$b;)Lcom/daaw/tx0$b;

    iget-object p1, p0, Lcom/daaw/qv1$f;->a:Lcom/daaw/qv1;

    sget-object p2, Lcom/daaw/xw0;->f:Lcom/daaw/tx0;

    invoke-static {p1, p2}, Lcom/daaw/qv1;->y(Lcom/daaw/qv1;Lcom/daaw/tx0;)Lcom/daaw/tx0;

    iget-object p1, p0, Lcom/daaw/qv1$f;->a:Lcom/daaw/qv1;

    sget-object p2, Lcom/daaw/xw0;->h:Lcom/daaw/hx0;

    iget-wide p2, p2, Lcom/daaw/hx0;->a:J

    invoke-static {p1, p2, p3}, Lcom/daaw/qv1;->r(Lcom/daaw/qv1;J)J

    :cond_0
    return-void
.end method
