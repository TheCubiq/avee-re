.class public Lcom/daaw/qk$k;
.super Lcom/daaw/gh0$f$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/qk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/daaw/qk;


# direct methods
.method public constructor <init>(Lcom/daaw/qk;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qk$k;->b:Lcom/daaw/qk;

    invoke-direct {p0}, Lcom/daaw/gh0$f$a;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;)V"
        }
    .end annotation

    check-cast p2, Lcom/daaw/qk$s;

    iget-object p1, p2, Lcom/daaw/qk$s;->b:Lcom/daaw/tx0;

    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
