.class public Lcom/daaw/gk$f;
.super Lcom/daaw/eh0$c$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/gk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/daaw/gk;


# direct methods
.method public constructor <init>(Lcom/daaw/gk;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/gk$f;->b:Lcom/daaw/gk;

    invoke-direct {p0}, Lcom/daaw/eh0$c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/content/Context;Ljava/lang/Object;Lcom/daaw/er0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Object;",
            "Lcom/daaw/er0<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    check-cast p2, Lcom/daaw/gk$i;

    iget-wide v0, p2, Lcom/daaw/gk$i;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iget-object p2, p2, Lcom/daaw/gk$i;->b:Ljava/lang/String;

    invoke-virtual {p3, p1, p2}, Lcom/daaw/er0;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method
