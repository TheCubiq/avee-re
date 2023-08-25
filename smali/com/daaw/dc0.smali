.class public final synthetic Lcom/daaw/dc0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/xw1$a;


# instance fields
.field public final synthetic a:Lcom/daaw/nc0;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/nc0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/dc0;->a:Lcom/daaw/nc0;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/dc0;->a:Lcom/daaw/nc0;

    check-cast p1, Lcom/daaw/al;

    check-cast p2, Lcom/daaw/avee/comp/Common/PrControls/PrImageButton;

    invoke-static {v0, p1, p2}, Lcom/daaw/nc0;->j(Lcom/daaw/nc0;Lcom/daaw/al;Lcom/daaw/avee/comp/Common/PrControls/PrImageButton;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
