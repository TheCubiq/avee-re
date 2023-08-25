.class public Lcom/daaw/ak$c;
.super Lcom/daaw/gh0$b$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ak;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/daaw/ak;


# direct methods
.method public constructor <init>(Lcom/daaw/ak;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ak$c;->b:Lcom/daaw/ak;

    invoke-direct {p0}, Lcom/daaw/gh0$b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;)V
    .locals 1
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

    check-cast p2, Lcom/daaw/ak$h;

    iget-object v0, p0, Lcom/daaw/ak$c;->b:Lcom/daaw/ak;

    iget-object p2, p2, Lcom/daaw/ak$h;->b:Ljava/lang/String;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/ak;->Y(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    return-void
.end method
