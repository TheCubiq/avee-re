.class public Lcom/daaw/nc0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/xw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/nc0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/xw1$a<",
        "Lcom/daaw/al;",
        "Lcom/daaw/avee/comp/Common/PrControls/PrCheckBox;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/nc0;


# direct methods
.method public constructor <init>(Lcom/daaw/nc0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/nc0$b;->a:Lcom/daaw/nc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/al;Lcom/daaw/avee/comp/Common/PrControls/PrCheckBox;)Ljava/lang/Boolean;
    .locals 0

    iget-object p2, p0, Lcom/daaw/nc0$b;->a:Lcom/daaw/nc0;

    invoke-virtual {p2}, Lcom/daaw/nc0;->A()Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/daaw/nc0$b;->a:Lcom/daaw/nc0;

    invoke-static {p2, p1}, Lcom/daaw/nc0;->u(Lcom/daaw/nc0;Lcom/daaw/al;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/al;

    check-cast p2, Lcom/daaw/avee/comp/Common/PrControls/PrCheckBox;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/nc0$b;->a(Lcom/daaw/al;Lcom/daaw/avee/comp/Common/PrControls/PrCheckBox;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
