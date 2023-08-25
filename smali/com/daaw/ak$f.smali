.class public Lcom/daaw/ak$f;
.super Lcom/daaw/dh0$b$a;
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

    iput-object p1, p0, Lcom/daaw/ak$f;->b:Lcom/daaw/ak;

    invoke-direct {p0}, Lcom/daaw/dh0$b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/content/Context;Ljava/lang/Object;Lcom/daaw/er0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Object;",
            "Lcom/daaw/er0<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    check-cast p2, Lcom/daaw/ak$h;

    iget-object p1, p2, Lcom/daaw/ak$h;->a:Ljava/lang/String;

    iget-object p2, p2, Lcom/daaw/ak$h;->b:Ljava/lang/String;

    invoke-virtual {p3, p1, p2}, Lcom/daaw/er0;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method
