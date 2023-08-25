.class public final synthetic Lcom/daaw/e55;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zg3;


# static fields
.field public static final synthetic a:Lcom/daaw/e55;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/e55;

    invoke-direct {v0}, Lcom/daaw/e55;-><init>()V

    sput-object v0, Lcom/daaw/e55;->a:Lcom/daaw/e55;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 0

    check-cast p1, Lcom/daaw/a74;

    const-string p2, "Show native ad policy validator overlay."

    invoke-static {p2}, Lcom/daaw/k04;->zze(Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/daaw/a74;->g()Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
